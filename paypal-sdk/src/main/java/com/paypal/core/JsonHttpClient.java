package com.paypal.core;

import com.braintreepayments.http.Environment;
import com.braintreepayments.http.Headers;
import com.braintreepayments.http.HttpClient;
import com.braintreepayments.http.HttpRequest;
import com.google.gson.Gson;

public class JsonHttpClient extends HttpClient {

	public JsonHttpClient(Environment environment) {
		super(environment);
		this.addInjector(this::addContentTypeHeader);
	}

	@Override
	protected String serializeRequestBody(HttpRequest httpRequest) {
		if (httpRequest.headers().header(Headers.CONTENT_TYPE).equals("application/json")) {
			return new Gson().toJson(httpRequest.requestBody());
		}
		return httpRequest.requestBody().toString();
	}

	@Override
	protected <T> T parseResponseBody(String s, Class<T> aClass) {
		return new Gson().fromJson(s, aClass);
	}

	private void addContentTypeHeader(HttpRequest request) {
		if (request.requestBody() != null) {
			request.headers().headerIfNotPresent(Headers.CONTENT_TYPE, "application/json");
		}
	}
}
