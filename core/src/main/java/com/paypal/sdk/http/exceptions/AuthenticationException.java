package com.paypal.sdk.http.exceptions;

import com.paypal.sdk.http.internal.Headers;

/**
 * Exception thrown when a 401 HTTP_UNAUTHORIZED response is encountered. Indicates authentication
 * has failed in some way.
 */
public class AuthenticationException extends HttpServerException {
	public AuthenticationException(String json, int statusCode, Headers headers) {
		super(json, statusCode, headers);
	}
}
