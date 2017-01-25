package com.paypal.sdk.services;

import com.paypal.sdk.http.Environment;
import com.paypal.sdk.http.utils.WireMockHarness;
import org.testng.annotations.Test;

import java.io.IOException;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static com.paypal.sdk.http.utils.StubUtils.*;

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
}
