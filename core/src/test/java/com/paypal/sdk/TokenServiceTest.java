package com.paypal.sdk;

import com.paypal.sdk.http.Environment;
import com.paypal.sdk.http.utils.WireMockHarness;
import com.paypal.sdk.model.RefreshToken;
import com.paypal.sdk.services.TokenService;
import org.testng.annotations.Test;

import java.io.IOException;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static com.paypal.sdk.http.utils.StubUtils.*;
import static org.testng.Assert.assertEquals;

public class TokenServiceTest extends WireMockHarness {

	private final Environment environment = new Environment.Development(baseUrl());
	private TokenService mTokenService = new TokenService();

	@Test
	public void TokenService_fetchAccessToken_clientId_fetchesAccessToken() throws IOException {
		stubAccessTokenRequest(simpleAccessToken(), baseUrl());

		mTokenService.fetchAccessToken("clientId", "clientSecret", environment);
		verify(postRequestedFor(urlEqualTo("/v1/oauth2/token"))
				.withRequestBody(equalTo("grant_type=client_credentials"))
				.withHeader("Authorization", containing("Basic "))
				.withHeader("Content-Type", equalTo("application/x-www-form-urlencoded")));
	}

	@Test
	public void TokenService_fetchAccessToken_refreshToken_fetchesAccessToken() throws IOException {
		stubAccessTokenWithRefreshTokenRequest(simpleAccessToken(), baseUrl());

		mTokenService.fetchAccessToken("refresh-token", environment);
		verify(postRequestedFor(urlEqualTo("/v1/identity/openidconnect/tokenservice"))
				.withRequestBody(equalTo("grant_type=client_credentials&refreshToken=refresh-token"))
				.withHeader("Content-Type", equalTo("application/x-www-form-urlencoded")));
	}

	@Test
	public void TokenService_fetchRefreshToken_fetchesRefreshToken() throws IOException {
		stubAccessRefreshTokenWithAuthorizationCodeRequest("refresh-token", baseUrl());

		mTokenService.fetchRefreshToken("sample_authorization_code", environment);
		verify(postRequestedFor(urlEqualTo("/v1/identity/openidconnect/tokenservice"))
				.withRequestBody(equalTo("grant_type=authorization_code&code=sample_authorization_code"))
				.withHeader("Content-Type", equalTo("application/x-www-form-urlencoded")));
	}

	@Test void TokenService_deserializesRefreshToken() throws IOException {
		HttpRequest<RefreshToken> refreshTokenRequest = new HttpRequest<RefreshToken>("/v1/identity/openidconnect/tokenservice", "POST", RefreshToken.class)
				.baseUrl(baseUrl());

		String refreshResponseString = "{\n" +
				"  \"token_type\": \"Bearer\",\n" +
				"  \"expires_in\": \"28800\",\n" +
				"  \"refresh_token\": \"Refresh-Token-Value\",\n" +
				"  \"access_token\": \"Access-Token-Value\"\n" +
				"}";
		HttpResponse<String> refreshTokenResponse = HttpResponse.<String>builder()
				.result(refreshResponseString).build();

		stub(refreshTokenRequest, refreshTokenResponse);
		RefreshToken refreshToken = mTokenService.fetchRefreshToken("sample_authorization_code", environment);
		assertEquals(refreshToken.refreshToken(), "Refresh-Token-Value");
		assertEquals(refreshToken.accessToken().accessToken(), "Access-Token-Value");
		assertEquals(refreshToken.accessToken().tokenType(), "Bearer");
		assertEquals(refreshToken.accessToken().expiresIn(), 28800);
	}
}
