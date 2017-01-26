package com.paypal.sdk.services;

import com.paypal.sdk.HttpRequest;
import com.paypal.sdk.http.Environment;
import com.paypal.sdk.model.AccessToken;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.io.IOException;

public class OAuthInjector implements Injector {

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

	@Setter(AccessLevel.NONE)
	private Environment mEnvironment;

	@Setter(AccessLevel.NONE)
	@Getter(AccessLevel.NONE)
	private TokenService mTokenService;

	public OAuthInjector(@NonNull String clientID, @NonNull String clientSecret, Environment environment) {
		mClientId = clientID;
		mClientSecret = clientSecret;
		mEnvironment = environment;
		mTokenService = new TokenService();
	}

	@Override
	public synchronized <T> void inject(HttpRequest<T> request) throws IOException {
		AccessToken token;
		if (request.refreshToken() == null && mAccessToken != null && !mAccessToken.isExpired()) { // ClientId + ClientSecret auth
			token = mAccessToken;
		} else {
			if (request.refreshToken() == null) {
				token = mTokenService.fetchAccessToken(mClientId, mClientSecret, mEnvironment);
				mAccessToken = token;
			} else {
				token = mTokenService.fetchAccessToken(request.refreshToken(), mEnvironment);
			}
		}

		request.header("Authorization", "Bearer " + token.accessToken());
	}
}
