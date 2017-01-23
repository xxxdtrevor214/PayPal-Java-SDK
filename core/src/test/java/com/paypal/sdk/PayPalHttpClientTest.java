package com.paypal.sdk;

import com.paypal.sdk.http.utils.WireMockHarness;
import com.paypal.sdk.services.AuthService;
import com.paypal.sdk.services.OAuthService;
import org.mockito.Mockito;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Locale;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static com.paypal.sdk.http.internal.Environment.SANDBOX;
import static com.paypal.sdk.http.internal.Headers.HttpHeader.*;
import static com.paypal.sdk.http.utils.StubUtils.*;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;

public class PayPalHttpClientTest extends WireMockHarness {

	private PayPalHttpClient client = null;

	@BeforeMethod
	public void setup() {
		super.setup();
		client = new PayPalHttpClient("clientId", "clientSecret", SANDBOX);
		client.mBaseUrl = baseUrl();
	}

	@Test
	public void testPayPalHttpClient_constructor_passCustomAuthService() throws NoSuchFieldException, IllegalAccessException {
		AuthService customAuthService = Mockito.mock(AuthService.class);
		PayPalHttpClient payPalHttpClient= new PayPalHttpClient(customAuthService);

		Field authService = payPalHttpClient.getClass().getDeclaredField("mAuthService");
		authService.setAccessible(true);
		AuthService actualAuthService = (AuthService) authService.get(payPalHttpClient);

		assertEquals(customAuthService, actualAuthService);
		assertFalse(actualAuthService instanceof OAuthService);
	}

	@Test
	public void testPayPalHttpClient_prepareRequest_setsCommonHeaders() {
		HttpRequest<Void> request = new HttpRequest<Void>("/", "POST", Void.class);
		client.prepareRequest(request);

		assertEquals(request.headers().header(ACCEPT_ENCODING.toString()), "gzip");
		assertEquals(request.headers().header(ACCEPT_LANGUAGE.toString()), Locale.getDefault().getLanguage());
	}

	@Test
	public void testPayPalHttpClient_prepareRequest_setsContentTypeHeaderWhenRequestBodyPresent() {
		HttpRequest<Void> request = new HttpRequest<Void>("/", "POST", Void.class);
		request.requestBody("{some json}");
		client.prepareRequest(request);

		assertEquals(request.headers().header(CONTENT_TYPE.toString()), "application/json");
	}

	@Test
	public void testPayPalHttpClient_prepareRequest_setsBaseUrl() {
		// Use a new client here whose baseUrl is not set to the url of the wiremock socket listener
		client = new PayPalHttpClient("clientId", "clientSecret", SANDBOX);
		HttpRequest<Void> request = new HttpRequest<Void>("/", "POST", Void.class);
		client.prepareRequest(request);

		assertEquals(SANDBOX.baseUrl + "/", request.url());
	}

	@Test
	public void testPayPalHttpClient_execute_signsRequest() throws IOException {
		stubAccessTokenRequest(simpleAccessToken(), baseUrl());
		HttpRequest<Void> request = new HttpRequest<Void>("/", "GET", Void.class)
				.oAuthScope("scope");

		stub(request, null);

		client.execute(request);

		verify(getRequestedFor(urlEqualTo("/"))
		.withHeader("Authorization", equalTo("Bearer sample-access-token")));

	}

	@Test
	public void testPayPalHttpClient_execute_preparesRequest() throws IOException {
		HttpRequest<Void> request = new HttpRequest<Void>("/", "GET", Void.class);

		stub(request, null);

		client.execute(request);

		verify(getRequestedFor(urlEqualTo("/"))
			.withHeader(ACCEPT_LANGUAGE.toString(), equalTo(Locale.getDefault().getLanguage())));
	}
}
