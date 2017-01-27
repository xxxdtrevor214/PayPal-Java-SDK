package com.paypal.sdk.http.exceptions;

import com.paypal.sdk.http.Headers;

/**
 * Exception thrown when a 404 HTTP_NOT_FOUND response is encountered. Indicates that the
 * requested resource could not be located on the server
 */
public class ResourceNotFoundException extends HttpServerException {
    public ResourceNotFoundException(String json, int statusCode, Headers headers) {
        super(json, statusCode, headers);
    }
}
