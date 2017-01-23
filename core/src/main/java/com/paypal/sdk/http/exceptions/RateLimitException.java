package com.paypal.sdk.http.exceptions;

import com.paypal.sdk.http.internal.Headers;

/**
 * Exception thrown when a 429 HTTP_TOO_MANY_REQUESTS response is encountered. Indicates the client has hit a request
 * limit and should wait a period of time and try again.
 */
public class RateLimitException extends HttpServerException {
	public RateLimitException(String json, int statusCode, Headers headers) {
		super(json, statusCode, headers);
	}
}
