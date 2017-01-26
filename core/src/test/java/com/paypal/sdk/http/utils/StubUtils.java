package com.paypal.sdk.http.utils;

import com.github.tomakehurst.wiremock.client.MappingBuilder;
import com.github.tomakehurst.wiremock.client.ResponseDefinitionBuilder;
import com.github.tomakehurst.wiremock.client.WireMock;
import com.github.tomakehurst.wiremock.matching.UrlPathPattern;
import com.paypal.sdk.HttpRequest;
import com.paypal.sdk.HttpResponse;
import com.paypal.sdk.http.internal.JSONFormatter;
import com.paypal.sdk.model.AccessToken;
import com.paypal.sdk.model.RefreshToken;

import static com.github.tomakehurst.wiremock.client.WireMock.*;

public class StubUtils {

	public static void stub(HttpRequest request, HttpResponse response) {
		MappingBuilder mappingBuilder;

		UrlPathPattern pattern = urlPathEqualTo(request.path());
		String verb = request.verb().toUpperCase();
		if (verb.equals("GET")) {
			mappingBuilder = WireMock.get(pattern);
		} else if (verb.equals("POST")) {
			mappingBuilder = WireMock.post(pattern);
		} else if (verb.equals("PUT")) {
			mappingBuilder = WireMock.put(pattern);
		} else if (verb.equals("DELETE")) {
			mappingBuilder = WireMock.delete(pattern);
		} else {
			throw new RuntimeException("Invalid or no verb passed in request");
		}

		for (String headerKey : request.headers()) {
			mappingBuilder.withHeader(headerKey, equalTo(request.headers().header(headerKey)));
		}

		if (request.requestBody() != null) {
			mappingBuilder.withRequestBody(equalTo(request.serialize()));
		}

		ResponseDefinitionBuilder responseBuilder = aResponse();
		if (response != null) {
			if (response.result() != null) {
				String body = serialize(response.result());
				responseBuilder = responseBuilder
						.withBody(body);
			}

			responseBuilder.withStatus(response.statusCode());

			for (String headerKey : response.headers()) {
				responseBuilder.withHeader(headerKey, response.headers().header(headerKey));
			}

			mappingBuilder.willReturn(responseBuilder);
		}

		stubFor(mappingBuilder);
	}

	public static AccessToken simpleAccessToken() {
		return new AccessToken()
				.accessToken("sample-access-token")
				.expiresIn(3600)
				.tokenType("accessToken");
	}

	/**
	 * Used for stubbing access token requests to the oauth2 endpoint
	 *
	 * @param accessToken the accessToken to be returned in the response
	 * @param baseUrl the baseUrl used by wiremock
	 */
	public static void stubAccessTokenRequest(AccessToken accessToken, String baseUrl) {
		HttpRequest<AccessToken> accessTokenRequest = new HttpRequest<AccessToken>("/v1/oauth2/token", "POST", AccessToken.class)
				.baseUrl(baseUrl);

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
	 * @param baseUrl the baseUrl used by wiremock
	 */
	public static void stubAccessTokenWithRefreshTokenRequest(AccessToken accessToken, String baseUrl) {
		HttpRequest<RefreshToken> refreshTokenRequest = new HttpRequest<RefreshToken>("/v1/identity/openidconnect/tokenservice", "POST", RefreshToken.class)
				.baseUrl(baseUrl);

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
	 * @param baseUrl the baseUrl used by wiremock
	 */
	public static void stubAccessRefreshTokenWithAuthorizationCodeRequest(String refreshToken, String baseUrl) {
		HttpRequest<RefreshToken> refreshTokenRequest = new HttpRequest<RefreshToken>("/v1/identity/openidconnect/tokenservice", "POST", RefreshToken.class)
				.baseUrl(baseUrl);

		HttpResponse<RefreshToken> refreshTokenResponse = HttpResponse.<RefreshToken>builder()
				.result(new RefreshToken()
						.refreshToken(refreshToken)
						.accessToken(new AccessToken()
							.accessToken("refresh-token-based-access-token")
							.expiresIn(3600)))
				.statusCode(200)
				.build();

		stub(refreshTokenRequest, refreshTokenResponse);
	}

	private static String serialize(Object o) {
		if (o instanceof String) {
			return (String) o;
		} else {
			return JSONFormatter.toJSON(o);
		}
	}
}
