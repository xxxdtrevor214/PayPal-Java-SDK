package com.paypal.core;

import com.braintreepayments.http.Headers;
import com.braintreepayments.http.HttpRequest;
import com.braintreepayments.http.HttpResponse;
import com.paypal.core.authorization.PayPalEnvironment;
import com.paypal.core.object.AccessToken;
import com.paypal.core.request.AccessTokenRequest;

import java.io.IOException;

public class PayPalHttpClient extends JsonHttpClient {

	private String refreshToken;

	// Visible for testing
	protected AccessToken accessToken;

	public PayPalHttpClient(PayPalEnvironment environment) {
		super(environment);
		this.addInjector(this::addGzipHeader);
		this.addInjector(this::signRequest);
	}

	public PayPalHttpClient(PayPalEnvironment environment, String refreshToken) {
		this(environment);
		this.refreshToken = refreshToken;
	}

	@Override
	protected String getUserAgent() {
		return "Java PayPalHttpClient"; // TODO: Return SDK version as part of this user agent.
	}

	@Override
	public <T> HttpResponse<T> execute(HttpRequest<T> request) throws IOException {
		return super.execute(request);
	}

	private void signRequest(HttpRequest request) throws IOException {
		if (!(request instanceof AccessTokenRequest)) {
			if (accessToken == null || accessToken.isExpired()) {
				accessToken = fetchAccessToken(refreshToken);
			}

			request.header(Headers.AUTHORIZATION, accessToken.authorizationString());
		}
	}

	private AccessToken fetchAccessToken(String refreshToken) throws IOException {
		AccessTokenRequest request;
		if (refreshToken == null) {
			request = new AccessTokenRequest((PayPalEnvironment) getEnvironment());
		} else {
			request = new AccessTokenRequest((PayPalEnvironment) getEnvironment(), refreshToken);
		}

		return this.execute(request).result();
	}

	private void addGzipHeader(HttpRequest request) throws IOException {
		request.headers().headerIfNotPresent(Headers.ACCEPT_ENCODING, "gzip");
	}
}
