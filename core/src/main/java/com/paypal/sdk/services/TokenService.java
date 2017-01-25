package com.paypal.sdk.services;

import com.paypal.sdk.HttpRequest;
import com.paypal.sdk.HttpResponse;
import com.paypal.sdk.codec.binary.Base64;
import com.paypal.sdk.http.DefaultHttpClient;
import com.paypal.sdk.http.Environment;
import com.paypal.sdk.http.Headers;
import com.paypal.sdk.http.HttpClient;
import com.paypal.sdk.model.AccessToken;
import com.paypal.sdk.model.RefreshToken;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static com.paypal.sdk.http.Headers.HttpHeader.AUTHORIZATION;

public class TokenService {

	private HttpClient mHttpClient;

	public TokenService() {
		mHttpClient = new DefaultHttpClient();
	}

	public AccessToken fetchAccessToken(String clientId, String clientSecret, Environment environment) throws IOException {
		HttpRequest<AccessToken> accessTokenRequest = getAccessTokenRequest(environment.baseUrl(), "/v1/oauth2/token", AccessToken.class)
				.requestBody(tokenRequestBody("client_credentials", new HashMap<String, String>()))
				.header(AUTHORIZATION.toString(), accessTokenRequestHeader(clientId, clientSecret));

		HttpResponse<AccessToken> accessTokenResponse = mHttpClient.execute(accessTokenRequest);
		return accessTokenResponse.result();
	}

	public AccessToken fetchAccessToken(final String refreshToken, Environment environment) throws IOException {
		HttpRequest<AccessToken> accessTokenRequest = getAccessTokenRequest(environment.baseUrl(), "/v1/identity/openidconnect/tokenservice", AccessToken.class)
				.requestBody(tokenRequestBody("client_credentials", new HashMap<String, String>() {{
					put("refreshToken", refreshToken);
				}}));

		HttpResponse<AccessToken> accessTokenResponse = mHttpClient.execute(accessTokenRequest);
		return accessTokenResponse.result();
	}

	public RefreshToken fetchRefreshToken(final String authorizationCode, Environment environment) throws IOException {
		HttpRequest<RefreshToken> refreshTokenHttpRequest = getAccessTokenRequest(environment.baseUrl(), "/v1/identity/openidconnect/tokenservice", RefreshToken.class)
				.requestBody(tokenRequestBody("authorization_code", new HashMap<String, String>() {{
					put("code", authorizationCode);
				}}));

		HttpResponse<RefreshToken> refreshTokenResponse = mHttpClient.execute(refreshTokenHttpRequest);
		return refreshTokenResponse.result();
	}

	private <T extends AccessToken> HttpRequest<T> getAccessTokenRequest(String baseUrl, String path, Class<T> returnTypeClass) throws IOException {
		return new HttpRequest<T>(path, "POST", returnTypeClass)
				.baseUrl(baseUrl)
				.header(Headers.HttpHeader.CONTENT_TYPE.toString(), "application/x-www-form-urlencoded");
	}

	private String accessTokenRequestHeader(String clientID, String clientSecret) throws IOException {
		byte[] encoded;
		encoded = Base64.encodeBase64((clientID + ":" + clientSecret).getBytes("UTF-8"));
		return "Basic " + new String(encoded, "UTF-8");
	}

	private String tokenRequestBody(String grantType, Map<String, String> additionalParams) {
		StringBuilder builder = new StringBuilder()
				.append("grant_type=")
				.append(grantType);

		for (Map.Entry<String, String> code : additionalParams.entrySet()) {
			builder.append(String.format("&%s=%s", code.getKey(), code.getValue()));
		}

		return builder.toString();
	}
}
