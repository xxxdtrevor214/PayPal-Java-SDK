package com.paypal.sdk.http.internal;

public enum Environment {

    LIVE("https://api.paypal.com"),
    SANDBOX("https://api.sandbox.paypal.com");

    public final String baseUrl;

    Environment(String baseUrl) {
        this.baseUrl = baseUrl;
    }
}
