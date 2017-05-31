package com.paypal.core;

import com.braintreepayments.http.Headers;
import com.braintreepayments.http.HttpRequest;
import com.braintreepayments.http.Injector;

import java.io.IOException;


public class PayPalHttpClient extends JsonHttpClient {

	private PayPalEnvironment mEnvironment;

	public PayPalHttpClient(PayPalEnvironment environment) {
		this(environment, new OAuthInjector(environment));
	}

	public PayPalHttpClient(PayPalEnvironment environment, Injector authInjector) {
		super();
		mEnvironment = environment;
		addInjector(authInjector);
		addInjector(this::injectBaseUrl);
		addInjector(this::injectStandardHeaders);
	}

	@Override
	protected String getUserAgent() {
		return "Java PayPalHttpClient"; // TODO: Return SDK version as part of this user agent.
	}

	private void injectBaseUrl(HttpRequest request) throws IOException {
		if (request.baseUrl() == null) {
			request.baseUrl(mEnvironment.baseUrl());
		}
	}

	private void injectStandardHeaders(HttpRequest request) throws IOException {
		if (request.requestBody() != null) {
			request.headers().headerIfNotPresent(Headers.CONTENT_TYPE, "application/json");
		}

		request.headers().headerIfNotPresent(Headers.ACCEPT_ENCODING, "gzip");
	}
}
