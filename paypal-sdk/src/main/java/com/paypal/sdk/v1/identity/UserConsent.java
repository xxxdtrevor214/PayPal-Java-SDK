package com.paypal.sdk.v1.identity;

import com.paypal.core.PayPalEnvironment;

public class UserConsent {

    private String url;

    public UserConsent(PayPalEnvironment environment) {
        this.url = environment.webUrl() + "/signin/authorize?client_id=" + environment.clientId() + "&";
    }

    public UserConsent responseType(String responseType) {
        this.url += "response_type=" + responseType + "&";
        return this;
    }

    public UserConsent scope(String scope) {
        this.url += "scope=" + scope + "&";
        return this;
    }

    public UserConsent redirectUri(String redirectUri) {
        this.url += "redirect_uri=" + redirectUri + "&";
        return this;
    }

    public UserConsent nonce(String nonce) {
        this.url += "nonce=" + nonce + "&";
        return this;
    }

    public UserConsent state(String state) {
        this.url += "state=" + state + "&";
        return this;
    }

    public String build() {
        return this.url;
    }
}
