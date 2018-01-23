package com.paypal.core.utils;

import com.braintreepayments.http.exceptions.SerializeException;
import com.braintreepayments.http.serializer.Json;
import com.braintreepayments.http.testutils.WireMockHarness;
import com.github.tomakehurst.wiremock.client.ResponseDefinitionBuilder;
import com.github.tomakehurst.wiremock.client.WireMock;
import com.paypal.core.PayPalEnvironment;
import com.paypal.core.object.AccessToken;
import com.paypal.core.object.RefreshToken;
import org.testng.annotations.BeforeMethod;

import static com.github.tomakehurst.wiremock.client.WireMock.stubFor;
import static com.github.tomakehurst.wiremock.client.WireMock.urlPathEqualTo;
import static com.paypal.core.utils.ReflectionHelper.setField;

public class PayPalWireMockHarness extends WireMockHarness {

	private PayPalEnvironment environment;

	@BeforeMethod
	@Override
	public void setup() {
		super.setup();
		environment = new PayPalEnvironment("fake-client-id", "fake-client-secret", String.format("http://%s:%d", host(), port()));
	}

	protected PayPalEnvironment environment() { return environment; }

	protected AccessToken simpleAccessToken() {
		AccessToken accessToken = new AccessToken();
		try {
			setField("accessToken", accessToken, "sample-access-token");
			setField("expiresIn", accessToken, 3600);
			setField("tokenType", accessToken, "accessToken");
		} catch (NoSuchFieldException | IllegalAccessException ignored) {}

		return accessToken;
	}

	protected RefreshToken simpleRefreshToken() {
		RefreshToken refreshToken = new RefreshToken();
		try {
			setField("refreshToken", refreshToken, "sample-refresh-token");
		} catch (NoSuchFieldException | IllegalAccessException ignored) {}

		return refreshToken;
	}

	/**
	 * Used for stubbing access token requests to the oauth2 endpoint
	 *
	 * @param accessToken the accessToken to be returned in the response
	 */
	protected void stubAccessTokenRequest(AccessToken accessToken) {
		try {
			stubFor(WireMock.post(urlPathEqualTo("/v1/oauth2/token"))
					.willReturn(new ResponseDefinitionBuilder()
							.withBody(new Json().serialize(accessToken))
							.withHeader("Content-Type", "application/json")
							.withStatus(200)));
		} catch (SerializeException ignored) {
			throw new RuntimeException(ignored.getMessage());
		}
	}

	protected void stubAccessTokenRequest(AccessToken accessToken, String refreshToken) {
		try {
			stubFor(WireMock.post(urlPathEqualTo("/v1/oauth2/token"))
					.willReturn(new ResponseDefinitionBuilder()
							.withBody(new Json().serialize(accessToken))
							.withHeader("Content-Type", "application/json")
							.withStatus(200)));
		} catch (SerializeException ignored) {
			throw new RuntimeException(ignored.getMessage());
		}
	}

	protected void stubRefreshTokenRequest(String authCode, RefreshToken refreshToken) {
		try {
			stubFor(WireMock.post(urlPathEqualTo("/v1/identity/openidconnect/tokenservice"))
					.willReturn(new ResponseDefinitionBuilder()
							.withBody(new Json().serialize(refreshToken))
							.withHeader("Content-Type", "application/json")
							.withStatus(200)));
		} catch (SerializeException ignored) {
			throw new RuntimeException(ignored.getMessage());
		}
	}
}
