package com.paypal.core;

import com.braintreepayments.http.BaseHttpClient;
import com.braintreepayments.http.HttpRequest;
import com.google.gson.Gson;

public class JsonHttpClient extends BaseHttpClient {

	@Override
	protected String serializeRequestBody(HttpRequest httpRequest) {
		return new Gson().toJson(httpRequest.requestBody());
	}

	@Override
	protected <T> T parseResponseBody(String s, Class<T> aClass) {
		return new Gson().fromJson(s, aClass);
	}
}
