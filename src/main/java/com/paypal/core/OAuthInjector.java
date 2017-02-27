package com.paypal.core;

import com.braintreepayments.http.*;
import com.paypal.core.model.AccessToken;
import com.paypal.core.services.AccessTokenRequestBuilder;
import lombok.AccessLevel;
import lombok.Getter;
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
	@Getter(AccessLevel.NONE)
	private String mRefreshToken;

	private HttpClient mHttpClient;
	private PayPalEnvironment mEnvironment;

	public OAuthInjector(PayPalEnvironment environment) {
		mHttpClient = new DefaultHttpClient();
		mEnvironment = environment;
	}

	public OAuthInjector(PayPalEnvironment environment, String refreshToken) {
		this(environment);
		mRefreshToken = refreshToken;
	}

	@Override
	public synchronized void inject(HttpRequest request) throws IOException {
		AccessToken token;
		if (mAccessToken != null && !mAccessToken.isExpired()) {
			token = mAccessToken;
		} else {
			if (mRefreshToken != null) {
				mAccessToken = fetchAccessToken(mRefreshToken);
			} else {
				mAccessToken = fetchAccessToken(null);
			}

			token = mAccessToken;
		}

		request.header("Authorization", "Bearer " + token.accessToken());
	}

	private AccessToken fetchAccessToken(String refreshToken) throws IOException {
		HttpRequest<AccessToken> request;
		if (refreshToken == null) {
			request = AccessTokenRequestBuilder.fetchAccessToken(mEnvironment.getClientId(),
					mEnvironment.getClientSecret());
		} else {
			request = AccessTokenRequestBuilder.fetchAccessToken(mEnvironment.getClientId(),
					mEnvironment.getClientSecret(),
					refreshToken);
		}
		request.baseUrl(mEnvironment.baseUrl());

		return mHttpClient.execute(request).result();
	}
}
