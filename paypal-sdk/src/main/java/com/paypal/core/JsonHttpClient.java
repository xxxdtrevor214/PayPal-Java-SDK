package com.paypal.core;

import com.braintreepayments.http.Environment;
import com.braintreepayments.http.Headers;
import com.braintreepayments.http.HttpClient;
import com.braintreepayments.http.HttpRequest;
import com.google.gson.Gson;

import java.io.UnsupportedEncodingException;

public class JsonHttpClient extends HttpClient {

	public JsonHttpClient(Environment environment) {
		super(environment);
		this.addInjector(this::addContentTypeHeader);
	}

	@Override
	protected String serializeRequest(HttpRequest httpRequest) {
		return new Gson().toJson(httpRequest.requestBody());
	}

	@Override
	protected <T> T deserializeResponse(String s, Class<T> aClass, Headers headers) throws UnsupportedEncodingException {
		if (isContentTypeJson(headers)) {
			return new Gson().fromJson(s, aClass);
		} else {
		 	throw new UnsupportedEncodingException("Unsupported Content-Type: " + headers.header(Headers.CONTENT_TYPE));
		}
	}

	private boolean isContentTypeJson(Headers headers) {
		String contentType = headers.header(Headers.CONTENT_TYPE);
		return contentType != null && contentType.equals("application/json");
	}

	private void addContentTypeHeader(HttpRequest request) {
		if (request.requestBody() != null) {
			request.headers().headerIfNotPresent(Headers.CONTENT_TYPE, "application/json");
		}
	}
}
