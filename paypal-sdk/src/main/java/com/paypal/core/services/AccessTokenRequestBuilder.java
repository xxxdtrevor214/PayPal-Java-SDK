package com.paypal.core.services;

import com.braintreepayments.http.HttpRequest;
import com.paypal.core.PayPalEnvironment;
import com.paypal.core.model.AccessToken;
import com.paypal.core.model.RefreshToken;

import java.io.IOException;
import java.util.Base64;

import static com.braintreepayments.http.Headers.AUTHORIZATION;
import static com.braintreepayments.http.Headers.CONTENT_TYPE;


public class AccessTokenRequestBuilder {

	public static HttpRequest<AccessToken> fetchAccessToken(PayPalEnvironment environment) throws IOException {
		return getAccessTokenRequest(environment,
				"/v1/oauth2/token",
				AccessToken.class)
				.requestBody("grant_type=client_credentials");
	}

	public static HttpRequest<AccessToken> fetchAccessToken(PayPalEnvironment environment, String refreshToken) throws IOException {
		return fetchAccessToken(environment)
				.path("/v1/identity/openidconnect/tokenservice")
				.requestBody(String.format("grant_type=client_credentials&refresh_token=%s", refreshToken));
	}

	public static HttpRequest<RefreshToken> fetchRefreshToken(PayPalEnvironment environment, String authorizationCode) throws IOException {
		return getAccessTokenRequest(environment, "/v1/identity/openidconnect/tokenservice", RefreshToken.class)
				.requestBody(String.format("grant_type=authorization_code&code=%s", authorizationCode));
	}

	private static <T> HttpRequest<T> getAccessTokenRequest(PayPalEnvironment environment, String path, Class<T> returnTypeClass) throws IOException {
		return new HttpRequest<>(path, "POST", returnTypeClass)
				.header(AUTHORIZATION, accessTokenRequestHeader(environment.getClientId(), environment.getClientSecret()))
				.header(CONTENT_TYPE, "application/x-www-form-urlencoded");
	}

	private static String accessTokenRequestHeader(String clientId, String clientSecret) throws IOException {
		byte[] encoded = Base64.getEncoder().encode((clientId + ":" + clientSecret).getBytes("UTF-8"));
		return "Basic " + new String(encoded, "UTF-8");
	}
}
