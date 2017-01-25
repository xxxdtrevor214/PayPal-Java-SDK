package com.paypal.sdk.http.exceptions;

import com.paypal.sdk.http.Headers;

/**
 * Exception thrown when a 403 HTTP_FORBIDDEN response is encountered. Indicates the current
 * authorization does not have permission to make the request.
 */
public class AuthorizationException extends HttpServerException {
	public AuthorizationException(String json, int statusCode, Headers headers) {
		super(json, statusCode, headers);
	}
}
