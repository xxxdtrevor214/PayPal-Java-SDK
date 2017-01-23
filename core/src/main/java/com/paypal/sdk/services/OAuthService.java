package com.paypal.sdk.services;

import com.paypal.sdk.HttpRequest;
import com.paypal.sdk.HttpResponse;
import com.paypal.sdk.codec.binary.Base64;
import com.paypal.sdk.http.internal.Environment;
import com.paypal.sdk.http.internal.Headers;
import com.paypal.sdk.http.internal.HttpClient;
import com.paypal.sdk.model.AccessToken;
import com.paypal.sdk.model.RefreshToken;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static com.paypal.sdk.http.internal.Headers.HttpHeader.AUTHORIZATION;

public class OAuthService implements AuthService {

	/**
	 * Cached copy of access token
	 *
	 * Visible for testing purposes
	 */
	protected AccessToken mAccessToken;

	@Setter(AccessLevel.NONE)
	private String mClientId;

	@Setter(AccessLevel.NONE)
	private String mClientSecret;

	@Getter
	private Environment environment;

	public OAuthService(@NonNull String clientID, @NonNull String clientSecret, Environment environment) {
		this.mClientId = clientID;
		this.mClientSecret = clientSecret;
		this.environment = environment;
	}

	public OAuthService(AccessToken accessToken, Environment environment) {
		this.mAccessToken = accessToken;
		this.environment = environment;
	}

	@Override
	public synchronized void signRequest(HttpRequest request, HttpClient client) throws IOException {
		if (request.oAuthScope() != null) {
			request.header("Authorization", "Bearer " + getAccessToken(request.refreshToken(), client).accessToken());
		}
	}

	/**
	 * Creates an mAccessToken from a clientid and secret
	 *
	 * @param refreshToken Refresh token value for services that require it. Fetches a special access token for this
	 *                     refresh token when this value is nonnull
	 * @return a {@link AccessToken} for this mClientId and secret
	 * @throws Exception
	 */
	@Override
	public synchronized AccessToken getAccessToken(String refreshToken, HttpClient client) throws IOException {
		// TODO: see if we want to throw ClientException if already expired.
		if ((mClientId == null || mClientSecret == null) && mAccessToken != null) { // Access Token auth
			return mAccessToken;
		} else if (refreshToken == null && mAccessToken != null && !mAccessToken.isExpired()) { // ClientId + ClientSecret auth
			return mAccessToken;
		} else {
			HttpRequest<AccessToken> accessTokenHttpRequest;
			Map<String, String> code = new HashMap<String, String>();
			if (refreshToken != null) {
				accessTokenHttpRequest = getAccessTokenRequest("/v1/identity/openidconnect/tokenservice", AccessToken.class);
				code.put("refreshToken", refreshToken);
			} else {
				accessTokenHttpRequest = getAccessTokenRequest("/v1/oauth2/token", AccessToken.class);
			}

			accessTokenHttpRequest.requestBody(tokenRequestBody("client_credentials", code));
			HttpResponse<AccessToken> accessTokenResponse = client.execute(accessTokenHttpRequest);

			if (refreshToken != null) {
				return accessTokenResponse.result();
			}
			this.mAccessToken = accessTokenResponse.result();
		}

		return this.mAccessToken;
	}

	private <T extends AccessToken> HttpRequest<T> getAccessTokenRequest(String path, Class<T> returnTypeClass) throws IOException {
		return new HttpRequest<T>(path, "POST", returnTypeClass)
				.header(AUTHORIZATION.toString(), accessTokenRequestHeader(mClientId, mClientSecret))
				.baseUrl(getBaseUrl())
				.header(Headers.HttpHeader.CONTENT_TYPE.toString(), "application/x-www-form-urlencoded");
	}

	private String accessTokenRequestHeader(String clientID, String clientSecret) throws IOException {
		byte[] encoded;
		encoded = Base64.encodeBase64((clientID + ":" + clientSecret).getBytes("UTF-8"));
		return "Basic " + new String(encoded, "UTF-8");
	}

	private String tokenRequestBody(String grantType, Map<String, String> codes) {
		StringBuilder builder = new StringBuilder()
				.append("grant_type=")
				.append(grantType);

		for (Map.Entry<String, String> code : codes.entrySet()) {
			builder.append(String.format("&%s=%s", code.getKey(), code.getValue()));
		}

		return builder.toString();
	}

	@Override
	public synchronized RefreshToken getRefreshToken(final String authorizationCode, HttpClient client) throws IOException {
		HttpRequest<RefreshToken> refreshTokenHttpRequest = getAccessTokenRequest("/v1/identity/openidconnect/tokenservice", RefreshToken.class)
				.baseUrl(getBaseUrl())
				.requestBody(tokenRequestBody("authorization_code", new HashMap<String, String>() {{ put("code", authorizationCode); }} ));
		return client.execute(refreshTokenHttpRequest).result();
	}

	@Override
	public String getBaseUrl() {
		return environment.baseUrl;
	}
}
