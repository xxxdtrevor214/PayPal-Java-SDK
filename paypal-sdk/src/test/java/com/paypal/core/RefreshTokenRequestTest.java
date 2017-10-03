package com.paypal.core;

import com.braintreepayments.http.HttpRequest;
import com.braintreepayments.http.HttpResponse;
import com.paypal.core.object.RefreshToken;
import com.paypal.core.request.RefreshTokenRequest;
import org.testng.SkipException;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

public class RefreshTokenRequestTest {

	@Test
	public void fetchesRefreshToken() throws IOException {
		String authorizationCode = System.getenv("AUTH_CODE");
		String clientId = System.getenv("PAYPAL_CLIENT_ID");
		String clientSecret = System.getenv("PAYPAL_CLIENT_SECRET");
		if (authorizationCode == null || authorizationCode.equals("")) {
			throw new SkipException("Environment variable AUTH_CODE not set");
		} else if (clientId == null || clientId.equals("")) {
			throw new SkipException("Environment variable PAYPAL_CLIENT_ID not set");
		} else if (clientSecret == null || clientSecret.equals("")) {
			throw new SkipException("Environment variable PAYPAL_CLIENT_SECRET not set");
		}

		PayPalEnvironment environment = new PayPalEnvironment.Sandbox(clientId, clientSecret);
		PayPalHttpClient client = new PayPalHttpClient(environment);

		RefreshTokenRequest refreshTokenRequest = new RefreshTokenRequest(environment, authorizationCode);
		HttpResponse<RefreshToken> refreshTokenResponse = client.execute(refreshTokenRequest);
		RefreshToken refreshToken = refreshTokenResponse.result();
		assertNotNull(refreshToken);

		PayPalHttpClient customerScopedClient = new PayPalHttpClient(environment, refreshToken.refreshToken());

		HttpRequest<Void> someRequestOnCustomerBehalf = new HttpRequest<>("/", "POST", Void.class);
		HttpResponse response = customerScopedClient.execute(someRequestOnCustomerBehalf);
		assertNotNull(response);
		assertEquals(response.statusCode(), 200);
	}
}
