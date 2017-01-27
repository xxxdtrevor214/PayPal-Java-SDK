package com.paypal.sdk;

import com.paypal.sdk.http.Environment;
import com.paypal.sdk.http.utils.WireMockHarness;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static com.paypal.sdk.http.utils.StubUtils.simpleAccessToken;
import static com.paypal.sdk.http.utils.StubUtils.stubAccessTokenRequest;
import static com.paypal.sdk.http.utils.StubUtils.stubAccessTokenWithRefreshTokenRequest;
import static org.testng.AssertJUnit.assertEquals;

public class OAuthInjectorTest extends WireMockHarness {

	private Environment environment = new Environment.Development("clientId", "clientSecret", baseUrl());

	@BeforeMethod
	public void setup() {
		super.setup();
	}

	@Test
	public void OAuthInjector_clientId_inject_fetchesAccessTokenIfNotCached() throws IOException {
		OAuthInjector injector = new OAuthInjector(environment);
		stubAccessTokenRequest(simpleAccessToken(), baseUrl());

		HttpRequest<Void> request = new HttpRequest<Void>("/", "GET", Void.class);
		injector.inject(request);

		verify(postRequestedFor(urlEqualTo("/v1/oauth2/token")));
	}

	@Test
	public void testOAuthInjector_clientId_inject_fetchesAccessTokenIfExpired() throws InterruptedException, IOException {
		OAuthInjector injector = new OAuthInjector(environment);
		injector.mAccessToken = simpleAccessToken().expiresIn(0);
		stubAccessTokenRequest(simpleAccessToken(), baseUrl());

		HttpRequest<Void> request = new HttpRequest<Void>("/", "GET", Void.class);
		injector.inject(request);

		verify(postRequestedFor(urlEqualTo("/v1/oauth2/token")));
	}

	@Test
	public void testOAuthInjector_clientId_inject_setsAuthorizationHeader() throws IOException {
		OAuthInjector injector = new OAuthInjector(environment);
		injector.mAccessToken = simpleAccessToken();

		HttpRequest<Void> request = new HttpRequest<Void>("/", "GET", Void.class);

		injector.inject(request);

		assertEquals("Bearer sample-access-token", request.headers().header("Authorization"));
	}

	@Test
	public void testOAuthInjector_refreshToken_fetchesAccessTokenIfNotCached() throws IOException {
		OAuthInjector injector = new OAuthInjector(environment,"refresh-token");
		stubAccessTokenWithRefreshTokenRequest(simpleAccessToken(), baseUrl());

		HttpRequest<Void> request = new HttpRequest<Void>("/", "GET", Void.class);
		injector.inject(request);

		verify(postRequestedFor(urlEqualTo("/v1/identity/openidconnect/tokenservice")));
	}

	@Test
	public void testOAuthInjector_refreshToken_fetchesAccessTokenIfExpired() throws IOException {
		OAuthInjector injector = new OAuthInjector(environment, "refresh-token");
		injector.mAccessToken = simpleAccessToken().expiresIn(0);
		stubAccessTokenWithRefreshTokenRequest(simpleAccessToken(), baseUrl());

		HttpRequest<Void> request = new HttpRequest<Void>("/", "GET", Void.class);
		injector.inject(request);

		verify(postRequestedFor(urlEqualTo("/v1/identity/openidconnect/tokenservice")));
	}

	@Test
	public void testOAuthInjector_refreshToken_inject_setsAuthorizationHeader() throws IOException {
		OAuthInjector injector = new OAuthInjector(environment,"refresh-token");
		injector.mAccessToken = simpleAccessToken();

		HttpRequest<Void> request = new HttpRequest<Void>("/", "GET", Void.class);

		injector.inject(request);

		assertEquals("Bearer sample-access-token", request.headers().header("Authorization"));
	}
}
