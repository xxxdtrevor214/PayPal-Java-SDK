package com.paypal.sdk.services;

import com.paypal.sdk.HttpRequest;
import com.paypal.sdk.http.Environment;
import com.paypal.sdk.http.utils.WireMockHarness;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static com.paypal.sdk.http.utils.StubUtils.*;
import static org.mockito.Mockito.spy;
import static org.testng.AssertJUnit.assertEquals;

public class OAuthInjectorTest extends WireMockHarness {

	OAuthInjector injector;
	Environment environment = new Environment.Development(baseUrl());

	@BeforeMethod
	public void setup() {
		super.setup();
		injector = spy(new OAuthInjector("clientId", "clientSecret", environment));
	}

	@Test
	public void OAuthInjector_inject_fetchesAccessTokenIfNotCached() throws IOException {
		stubAccessTokenRequest(simpleAccessToken(), baseUrl());

		HttpRequest<Void> request = new HttpRequest<Void>("/", "GET", Void.class);
		injector.inject(request);

		verify(postRequestedFor(urlEqualTo("/v1/oauth2/token")));
	}

	@Test
	public void testOAuthInjector_inject_fetchesAccessTokenIfExpired() throws InterruptedException, IOException {
		injector.mAccessToken = simpleAccessToken().expiresIn(0);
		stubAccessTokenRequest(simpleAccessToken(), baseUrl());

		HttpRequest<Void> request = new HttpRequest<Void>("/", "GET", Void.class);
		injector.inject(request);

		verify(postRequestedFor(urlEqualTo("/v1/oauth2/token")));
	}

	@Test
	public void testOAuthInjector_inject_withRefreshTokenAndCachedAccessToken_fetchesNewAccessToken() throws IOException {
		injector.mAccessToken = simpleAccessToken().expiresIn(0);
		stubAccessTokenWithRefreshTokenRequest(simpleAccessToken(), baseUrl());

		HttpRequest<Void> request = new HttpRequest<Void>("/", "GET", Void.class)
				.refreshToken("refresh-token");
		injector.inject(request);

		verify(postRequestedFor(urlEqualTo("/v1/identity/openidconnect/tokenservice")));
	}

	@Test
	public void testOAuthInjector_inject_setsAuthorizationHeader() throws IOException {
		injector.mAccessToken = simpleAccessToken();

		HttpRequest<Void> request = new HttpRequest<Void>("/", "GET", Void.class);

		injector.inject(request);

		assertEquals("Bearer sample-access-token", request.headers().header("Authorization"));
	}
}
