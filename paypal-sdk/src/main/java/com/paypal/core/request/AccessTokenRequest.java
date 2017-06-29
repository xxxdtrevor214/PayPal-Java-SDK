package com.paypal.core.request;

import com.braintreepayments.http.Headers;
import com.braintreepayments.http.HttpRequest;
import com.paypal.core.authorization.PayPalEnvironment;
import com.paypal.core.object.AccessToken;

public class AccessTokenRequest extends HttpRequest<AccessToken> {

	private AccessTokenRequest(String path, PayPalEnvironment environment) {
		super(path, "POST", AccessToken.class);
		header(Headers.CONTENT_TYPE, "application/x-www-form-urlencoded");
		header(Headers.AUTHORIZATION, environment.authorizationString());
	}

	public AccessTokenRequest(PayPalEnvironment credentials) {
		this("/v1/oauth2/token", credentials);
		body("grant_type=client_credentials");
	}

	public AccessTokenRequest(PayPalEnvironment credentials, String refreshToken) {
		this("/v1/identity/openidconnect/tokenservice", credentials);
		body("grant_type=client_credentials&refresh_token=" + refreshToken);
	}
}
