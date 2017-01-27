package com.paypal.sdk.http.exceptions;

import com.paypal.sdk.http.Headers;

/**
 * Exception thrown when a 400 BAD_REQUEST response is encountered. Indicates that
 * there was a problem with the request
 */
public class BadRequestException extends HttpServerException {
	public BadRequestException(String json, int statusCode, Headers headers) {
		super(json, statusCode, headers);
	}
}
