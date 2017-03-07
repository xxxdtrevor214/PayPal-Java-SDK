package com.paypal.core.services;

import com.braintreepayments.http.DefaultHttpClient;
import com.braintreepayments.http.HttpClient;
import com.braintreepayments.http.HttpRequest;
import com.braintreepayments.http.HttpResponse;
import com.paypal.core.model.AccessToken;
import com.paypal.core.model.RefreshToken;
import com.paypal.core.PayPalWireMockHarness;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Base64;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static org.testng.Assert.assertEquals;

public class AccessTokenRequestBuilderTest extends PayPalWireMockHarness {

	private HttpClient mHttpClient;

	@BeforeMethod
	public void setup() {
		super.setup();
		mHttpClient = new DefaultHttpClient();
	}

	@Test
	public void TokenService_fetchAccessToken_clientId_fetchesAccessToken() throws IOException {
		stubAccessTokenRequest(simpleAccessToken());

		HttpRequest<AccessToken> request = AccessTokenRequestBuilder.fetchAccessToken(environment())
				.baseUrl(environment().baseUrl());
		mHttpClient.execute(request);

		verify(postRequestedFor(urlEqualTo("/v1/oauth2/token"))
				.withRequestBody(equalTo("grant_type=client_credentials"))
				.withHeader("Authorization", equalTo("Basic " + basicHeader()))
				.withHeader("Content-Type", equalTo("application/x-www-form-urlencoded")));
	}

	@Test
	public void TokenService_fetchAccessToken_refreshToken_fetchesAccessToken() throws IOException {
		stubAccessTokenWithRefreshTokenRequest(simpleAccessToken());

		HttpRequest<AccessToken> request = AccessTokenRequestBuilder.fetchAccessToken(environment(),
				"refresh-token")
				.baseUrl(environment().baseUrl());
		mHttpClient.execute(request);

		verify(postRequestedFor(urlEqualTo("/v1/identity/openidconnect/tokenservice"))
				.withHeader("Authorization", equalTo("Basic " + basicHeader()))
				.withRequestBody(equalTo("grant_type=client_credentials&refresh_token=refresh-token"))
				.withHeader("Content-Type", equalTo("application/x-www-form-urlencoded")));
	}

	@Test
	public void TokenService_fetchRefreshToken_fetchesRefreshToken() throws IOException {
		stubAccessRefreshTokenWithAuthorizationCodeRequest("refresh-token");

		HttpRequest<RefreshToken> request = AccessTokenRequestBuilder.fetchRefreshToken(environment(), "sample_authorization_code")
				.baseUrl(environment().baseUrl());
		mHttpClient.execute(request);

		verify(postRequestedFor(urlEqualTo("/v1/identity/openidconnect/tokenservice"))
				.withHeader("Authorization", equalTo("Basic " + basicHeader()))
				.withRequestBody(equalTo("grant_type=authorization_code&code=sample_authorization_code"))
				.withHeader("Content-Type", equalTo("application/x-www-form-urlencoded")));
	}

	@Test
	void TokenService_deserializesRefreshToken() throws IOException {
		HttpRequest<RefreshToken> refreshTokenRequest = new HttpRequest<>("/v1/identity/openidconnect/tokenservice", "POST", RefreshToken.class)
				.baseUrl(environment().baseUrl());

		String refreshResponseString = "{\n" +
				"  \"token_type\": \"Bearer\",\n" +
				"  \"expires_in\": \"28800\",\n" +
				"  \"refresh_token\": \"Refresh-Token-Value\",\n" +
				"  \"access_token\": \"Access-Token-Value\"\n" +
				"}";
		HttpResponse<String> refreshTokenResponse = HttpResponse.<String>builder()
				.result(refreshResponseString).build();

		stub(refreshTokenRequest, refreshTokenResponse);

		HttpRequest<RefreshToken> request = AccessTokenRequestBuilder.fetchRefreshToken(environment(), "sample_authorization_code")
				.baseUrl(environment().baseUrl());
		HttpResponse<RefreshToken> response = mHttpClient.execute(request);

		assertEquals(response.result().refreshToken(), "Refresh-Token-Value");
	}

	private String basicHeader() throws UnsupportedEncodingException {
		byte[] encoded = Base64.getEncoder()
				.encode((environment().getClientId() + ":" + environment().getClientSecret()).getBytes("UTF-8"));
		return new String(encoded);
	}
}
