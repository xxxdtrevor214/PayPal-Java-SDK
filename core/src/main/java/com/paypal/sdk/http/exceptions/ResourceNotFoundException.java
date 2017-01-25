package com.paypal.sdk.http.exceptions;

import com.paypal.sdk.http.Headers;

public class ResourceNotFoundException extends HttpServerException {
    public ResourceNotFoundException(String json, int statusCode, Headers headers) {
        super(json, statusCode, headers);
    }
}
