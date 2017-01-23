package com.paypal.sdk.http.exceptions;

import com.paypal.sdk.http.internal.Headers;

/**
 * Exception thrown when a 500 HTTP_INTERNAL_ERROR response is encountered. Indicates an unexpected
 * error from the server.
 */
public class InternalServerException extends HttpServerException {
	public InternalServerException(String json, int statusCode, Headers headers) {
		super(json, statusCode, headers);
	}
}
