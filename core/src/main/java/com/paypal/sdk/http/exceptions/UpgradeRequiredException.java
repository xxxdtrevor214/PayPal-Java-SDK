package com.paypal.sdk.http.exceptions;

import com.paypal.sdk.http.internal.Headers;

/**
 * Exception thrown when a 426 HTTP_UPGRADE_REQUIRED response is encountered. Indicates that the
 * API used or current SDK version is deprecated and must be updated.
 */
public class UpgradeRequiredException extends HttpServerException {
	public UpgradeRequiredException(String json, int statusCode, Headers headers) {
		super(json, statusCode, headers);
	}
}
