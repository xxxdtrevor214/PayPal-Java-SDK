package com.paypal.core;

import com.github.tomakehurst.wiremock.client.ResponseDefinitionBuilder;
import com.github.tomakehurst.wiremock.client.WireMock;
import com.paypal.core.cache.MemoryCache;
import com.paypal.core.object.AccessToken;
import com.paypal.core.utils.PayPalWireMockHarness;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static com.paypal.core.utils.ReflectionHelper.setField;
import static org.testng.Assert.assertEquals;

public class AuthorizationProviderTest extends PayPalWireMockHarness {

	@Test
	public void authorize_whenAccessTokenExpired_fetchesNewAccessToken() throws IOException, NoSuchFieldException, IllegalAccessException {
		AccessToken override = simpleAccessToken();
		setField("expiresIn", override, 0);

		MemoryCache<AccessToken> memoryCache = new MemoryCache<>();
		memoryCache.put(environment().authorizationString(), override);

		setField("authorizationCache", AuthorizationProvider.sharedInstance(), memoryCache);

		stubAccessTokenRequest(simpleAccessToken());

		stubFor(WireMock.get(urlEqualTo("/"))
				.willReturn(new ResponseDefinitionBuilder().withStatus(200)));

		PayPalHttpClient client = new PayPalHttpClient(environment());
		AuthorizationProvider.sharedInstance().authorize(client, null);

		verify(1, postRequestedFor(urlEqualTo("/v1/oauth2/token")));
	}

	@Test
	public void authorize_concurrentWithSameCredentials_onlyMakesOneCall() throws IOException, InterruptedException, NoSuchFieldException,IllegalAccessException {
		AccessToken override = simpleAccessToken();
		setField("expiresIn", override, 0);

		MemoryCache<AccessToken> memoryCache = new MemoryCache<>();
		memoryCache.put(environment().authorizationString(), override);

		setField("authorizationCache", AuthorizationProvider.sharedInstance(), memoryCache);

		stubAccessTokenRequest(simpleAccessToken());

		CountDownLatch latch = new CountDownLatch(20);
		AccessTokenHolder async = new AccessTokenHolder();
		PayPalHttpClient client = new PayPalHttpClient(environment());
		ExecutorService executor = Executors.newFixedThreadPool(20);

		for(int i = 0; i < 20; i++) {
			executor.execute(() -> {
				try {
					async.accessToken = AuthorizationProvider.sharedInstance().authorize(client, null);
				} catch (IOException e) {
				}
				latch.countDown();
			});
		}

		AccessToken sync = AuthorizationProvider.sharedInstance().authorize(client, null);

		latch.await();
		executor.shutdown();
		verify(1, postRequestedFor(urlEqualTo("/v1/oauth2/token")));

		assertEquals(async.accessToken.accessToken(), sync.accessToken());
		assertEquals(async.accessToken.expiresIn(), sync.expiresIn());
	}

	private class AccessTokenHolder {
		AccessToken accessToken;
	}
}
