package com.paypal.sdk.services;

import com.paypal.sdk.HttpRequest;
import com.paypal.sdk.http.internal.DefaultHttpClient;
import com.paypal.sdk.http.internal.Environment;
import com.paypal.sdk.http.internal.HttpClient;
import com.paypal.sdk.http.utils.WireMockHarness;
import com.paypal.sdk.model.AccessToken;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static com.paypal.sdk.http.internal.Environment.SANDBOX;
import static com.paypal.sdk.http.utils.StubUtils.*;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNull;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

public class OAuthServiceTest extends WireMockHarness {

	HttpClient client = new DefaultHttpClient();
	OAuthService service = null;

	@BeforeMethod
	public void setup() {
		super.setup();
		service = spy(new OAuthService("clientId", "clientSecret", SANDBOX));
		when(service.getBaseUrl()).thenReturn(baseUrl());
	}

	@Test
	public void OAuthSerivce_getAccessToken_fetchesAccessTokenIfNotCached() throws IOException {
		stubAccessTokenRequest(simpleAccessToken(), baseUrl());

		service.getAccessToken(null, client);
		verify(postRequestedFor(urlEqualTo("/v1/oauth2/token"))
				.withRequestBody(equalTo("grant_type=client_credentials"))
				.withHeader("Authorization", containing("Basic "))
				.withHeader("Content-Type", equalTo("application/x-www-form-urlencoded")));
	}

	@Test
	public void testOAuthService_getAccessToken_fetchesAccessTokenIfExpired() throws InterruptedException, IOException {
		service.mAccessToken = simpleAccessToken().expiresIn(0);
		stubAccessTokenRequest(simpleAccessToken(), baseUrl());

		service.getAccessToken(null, client);
		verify(postRequestedFor(urlEqualTo("/v1/oauth2/token"))
				.withRequestBody(equalTo("grant_type=client_credentials"))
				.withHeader("Authorization", containing("Basic "))
				.withHeader("Content-Type", equalTo("application/x-www-form-urlencoded")));
	}

	@Test
	public void testOAuthService_getAccessToken_withRefreshToken_containsCorrectParams_noCachedAccessToken() throws IOException {
		stubTokenServiceRequest(simpleAccessToken(), baseUrl());

		service.getAccessToken("refresh-token", client);
		verify(postRequestedFor(urlEqualTo("/v1/identity/openidconnect/tokenservice"))
				.withRequestBody(equalTo("grant_type=client_credentials&refreshToken=refresh-token"))
				.withHeader("Authorization", containing("Basic "))
				.withHeader("Content-Type", equalTo("application/x-www-form-urlencoded")));
	}

	@Test
	public void testOAuthService_getAccessToken_withRefreshToken_containsCorrectParams_withCachedAccessToken() throws IOException {
		service.mAccessToken = simpleAccessToken();
		stubTokenServiceRequest(simpleAccessToken(), baseUrl());

		service.getAccessToken("refresh-token", client);
		verify(postRequestedFor(urlEqualTo("/v1/identity/openidconnect/tokenservice"))
				.withRequestBody(equalTo("grant_type=client_credentials&refreshToken=refresh-token"))
				.withHeader("Authorization", containing("Basic "))
				.withHeader("Content-Type", equalTo("application/x-www-form-urlencoded")));
	}

	@Test
	public void testOAuthService_signRequest_setsAuthorizationHeaderWhenOAuthScopeSet() throws IOException {
		service.mAccessToken = simpleAccessToken();

		HttpRequest<Void> request = new HttpRequest<Void>("/", "GET", Void.class)
				.oAuthScope("sample-scope");
		service.signRequest(request, client);

		assertEquals("Bearer sample-access-token", request.headers().header("Authorization"));
	}

	@Test
	public void testOAuthService_signRequest_doesNotSetAuthorizationHeaderWhenOauthScopeNotProvide() throws IOException {
		service.mAccessToken = simpleAccessToken();

		HttpRequest<Void> request = new HttpRequest<Void>("/", "GET", Void.class);
		service.signRequest(request, client);

		assertNull(request.headers().header("Authorization"));
	}

	@Test
	public void testOAuthService_getRefreshToken_bodyContainsCorrectParams() throws IOException {
		stubTokenServiceRequest("refresh-token", baseUrl());

		service.getRefreshToken("sample_authorization_code", client);

		verify(postRequestedFor(urlEqualTo("/v1/identity/openidconnect/tokenservice"))
				.withRequestBody(equalTo("grant_type=authorization_code&code=sample_authorization_code"))
				.withHeader("Content-Type", equalTo("application/x-www-form-urlencoded")));
	}

	@Test
	public void testOAuthService_constructor_with_accessToken() throws IOException {
		AccessToken accessToken = simpleAccessToken();
		OAuthService oAuthService = new OAuthService(accessToken, Environment.SANDBOX);

		assertEquals(accessToken, oAuthService.mAccessToken);
		assertEquals(accessToken, oAuthService.getAccessToken(null, null));

	}
}
