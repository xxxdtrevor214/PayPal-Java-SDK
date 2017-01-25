package com.paypal.sdk.http.exceptions;

import com.paypal.sdk.http.Headers;

/**
 * Exception thrown when a 503 HTTP_UNAVAILABLE response is encountered. Indicates the server is
 * unreachable or the request timed out.
 */
public class DownForMaintenanceException extends HttpServerException {
	public DownForMaintenanceException(String json, int statusCode, Headers headers) {
		super(json, statusCode, headers);
	}
}
