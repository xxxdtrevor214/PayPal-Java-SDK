package com.paypal.core;

import com.braintreepayments.http.Headers;
import com.braintreepayments.http.HttpRequest;
import com.braintreepayments.http.HttpResponse;
import com.braintreepayments.http.internal.JSONFormatter;
import com.braintreepayments.http.testutils.WireMockHarness;
import com.paypal.core.model.AccessToken;
import com.paypal.core.model.RefreshToken;
import org.testng.annotations.BeforeMethod;

import java.lang.reflect.Field;
import java.util.Map;

public class PayPalWireMockHarness extends WireMockHarness {

	private PayPalEnvironment mEnvironment;

	@BeforeMethod
	@Override
	public void setup() {
		super.setup();

		mEnvironment = new PayPalEnvironment("clientId", "clientSecret") {
			@Override
			public String baseUrl() {
				return String.format("http://%s:%d", host(), port());
			}
		};
	}

	protected PayPalEnvironment environment() {
		return mEnvironment;
	}

	protected void stub(HttpRequest request, HttpResponse response) {
		String path = request.path();
		String verb = request.verb();
		Map<String, String> headers = translateHeaders(request.headers());
		String requestBody = null;
		if (request.requestBody() != null) {
			requestBody = request.serialize();
		}

		String responseBody = null;
		Integer statusCode = null;
		Map<String, String> responseHeaders = null;
		if (response != null) {
			if (response.result() instanceof String) {
				responseBody = (String) response.result();
			} else {
				responseBody = JSONFormatter.toJSON(response.result());
			}
			statusCode = response.statusCode();
			responseHeaders = translateHeaders(response.headers());
		}

		super.stub(path, verb, requestBody, headers, responseBody, statusCode, responseHeaders);
	}

	@SuppressWarnings("unchecked")
	private Map<String, String> translateHeaders(Headers headers) {
		try {
			Field mHeaders = Headers.class.getDeclaredField("mHeaders");
			mHeaders.setAccessible(true);

			return (Map<String, String>) mHeaders.get(headers);
		} catch (NoSuchFieldException | IllegalAccessException ignored) {}

		return null;
	}

	protected AccessToken simpleAccessToken() {
		return new AccessToken()
				.accessToken("sample-access-token")
				.expiresIn(3600)
				.tokenType("accessToken");
	}

	/**
	 * Used for stubbing access token requests to the oauth2 endpoint
	 *
	 * @param accessToken the accessToken to be returned in the response
	 */
	protected void stubAccessTokenRequest(AccessToken accessToken) {
		HttpRequest<AccessToken> accessTokenRequest = new HttpRequest<>("/v1/oauth2/token", "POST", AccessToken.class)
				.baseUrl(environment().baseUrl());

		HttpResponse<AccessToken> accessTokenResponse = HttpResponse.<AccessToken>builder()
				.result(accessToken)
				.statusCode(200)
				.build();

		stub(accessTokenRequest, accessTokenResponse);
	}

	/**
	 * Used for stubbing access token requests using a refresh token
	 *
	 * @param accessToken the accessToken to be returned in the response
	 */
	protected void stubAccessTokenWithRefreshTokenRequest(AccessToken accessToken) {
		HttpRequest<RefreshToken> refreshTokenRequest = new HttpRequest<>("/v1/identity/openidconnect/tokenservice", "POST", RefreshToken.class)
				.baseUrl(environment().baseUrl());

		HttpResponse<AccessToken> refreshTokenResponse = HttpResponse.<AccessToken>builder()
				.result(accessToken)
				.statusCode(200)
				.build();

		stub(refreshTokenRequest, refreshTokenResponse);
	}

	/**
	 * Used for stubbing refresh token requests using an authorization code
	 *
	 * @param refreshToken the refresh token to be returned in the response
	 */
	protected void stubAccessRefreshTokenWithAuthorizationCodeRequest(String refreshToken) {
		HttpRequest<RefreshToken> refreshTokenRequest = new HttpRequest<>("/v1/identity/openidconnect/tokenservice", "POST", RefreshToken.class)
				.baseUrl(environment().baseUrl());

		HttpResponse<RefreshToken> refreshTokenResponse = HttpResponse.<RefreshToken>builder()
				.result(new RefreshToken()
						.refreshToken(refreshToken))
				.statusCode(200)
				.build();

		stub(refreshTokenRequest, refreshTokenResponse);
	}
}
