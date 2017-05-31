package com.paypal.core;

import com.braintreepayments.http.HttpRequest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

import static com.braintreepayments.http.Headers.ACCEPT_ENCODING;
import static com.braintreepayments.http.Headers.CONTENT_TYPE;
import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static org.testng.Assert.assertEquals;

public class PayPalHttpClientTest extends PayPalWireMockHarness {

	private PayPalHttpClient client = null;

	@BeforeMethod
	public void setup() {
		super.setup();
		client = new PayPalHttpClient(environment());
		stubAccessTokenRequest(simpleAccessToken());
	}

	@Test
	public void testPayPalHttpClient_execute_setsCommonHeaders() throws IOException {
		HttpRequest<Void> request = new HttpRequest<>("/", "POST", Void.class);
		stub(request, null);

		client.execute(request);
		assertEquals(request.headers().header(ACCEPT_ENCODING), "gzip");
	}

	@Test
	public void testPayPalHttpClient_execute_setsContentTypeHeaderWhenRequestBodyPresent() throws IOException {
		HttpRequest<Void> request = new HttpRequest<>("/", "POST", Void.class);
		request.requestBody(new Object());
		stub(request, null);

		client.execute(request);

		assertEquals(request.headers().header(CONTENT_TYPE), "application/json");
	}

	@Test
	public void testPayPalHttpClient_execute_setsBaseUrl() throws IOException {
		HttpRequest<Void> request = new HttpRequest<>("/", "POST", Void.class);
		stub(request, null);

		client.execute(request);

		assertEquals(environment().baseUrl() + "/", request.url());
	}

	@Test
	public void testPayPalHttpClient_execute_signsRequest() throws IOException {
		stubAccessTokenRequest(simpleAccessToken());
		HttpRequest<Void> request = new HttpRequest<>("/", "GET", Void.class);

		stub(request, null);

		client.execute(request);

		verify(getRequestedFor(urlEqualTo("/"))
				.withHeader("Authorization", equalTo("Bearer sample-access-token")));

	}

	@Test
	public void testPayPalHttpClient_execute_withCustomInjector_signsRequest() throws IOException {
		HttpRequest<Void> request = new HttpRequest<>("/", "GET", Void.class);

		stub(request, null);

		PayPalHttpClient client = new PayPalHttpClient(environment(), (r -> {
			r.header("super-header-key", "super-header-value");
		}));
		client.execute(request);

		verify(getRequestedFor(urlEqualTo("/"))
				.withHeader("super-header-key", equalTo("super-header-value")));
	}
}
