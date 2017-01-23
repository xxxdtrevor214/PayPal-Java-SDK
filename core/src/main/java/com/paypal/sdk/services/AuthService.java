package com.paypal.sdk.services;

import com.paypal.sdk.HttpRequest;
import com.paypal.sdk.http.internal.HttpClient;
import com.paypal.sdk.model.AccessToken;
import com.paypal.sdk.model.RefreshToken;
import lombok.NonNull;

import java.io.IOException;

public interface AuthService {

	AccessToken getAccessToken(String refreshToken, HttpClient client) throws IOException;

	void signRequest(HttpRequest request, HttpClient client) throws IOException;

	RefreshToken getRefreshToken(@NonNull final String authorizationCode, HttpClient client)
			throws IOException;

	String getBaseUrl();
}
