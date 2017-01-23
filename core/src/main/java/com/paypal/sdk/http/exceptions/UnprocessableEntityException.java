package com.paypal.sdk.http.exceptions;

import com.paypal.sdk.http.internal.Headers;

/**
 * Exception thrown when a 422 HTTP_UNPROCESSABLE_ENTITY response is encountered. Indicates the
 * request was invalid in some way.
 */
public class UnprocessableEntityException extends HttpServerException {
	public UnprocessableEntityException(String json, int statusCode, Headers headers) {
		super(json, statusCode, headers);
	}
}
