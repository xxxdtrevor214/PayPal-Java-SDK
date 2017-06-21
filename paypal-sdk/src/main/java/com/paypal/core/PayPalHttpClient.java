package com.paypal.core;

import com.braintreepayments.http.Headers;
import com.braintreepayments.http.HttpClient;
import com.braintreepayments.http.HttpRequest;
import com.google.gson.Gson;
import com.paypal.core.authorization.PayPalEnvironment;
import com.paypal.core.object.AccessToken;
import com.paypal.core.request.AccessTokenRequest;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class PayPalHttpClient extends HttpClient {

	private String refreshToken;
	private Gson gson;

	// Visible for testing
	protected AccessToken accessToken;

	public PayPalHttpClient(PayPalEnvironment environment) {
		super(environment);
		this.gson = new Gson();
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
	protected String serializeRequest(HttpRequest httpRequest) throws IOException {
		if (isContentTypeJson(httpRequest.headers())) {
			return this.gson.toJson(httpRequest.body());
		} else {
			throw new UnsupportedEncodingException(String.format("Unable to serialize content %s with Content-Type: %s", httpRequest.body(), httpRequest.headers().header(Headers.CONTENT_TYPE)));
		}
	}

	@Override
	protected <T> T deserializeResponse(String s, Class<T> aClass, Headers headers) throws UnsupportedEncodingException {
		if (isContentTypeJson(headers)) {
			return new Gson().fromJson(s, aClass);
		} else {
			throw new UnsupportedEncodingException("Unsupported Content-Type: " + headers.header(Headers.CONTENT_TYPE));
		}
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

	private boolean isContentTypeJson(Headers headers) {
		String contentType = headers.header(Headers.CONTENT_TYPE);
		return contentType != null && contentType.equals("application/json");
	}
}
