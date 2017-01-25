package com.paypal.sdk.http.exceptions;

import com.paypal.sdk.http.Headers;

public class BadRequestException extends HttpServerException {
	public BadRequestException(String json, int statusCode, Headers headers) {
		super(json, statusCode, headers);
	}
}
