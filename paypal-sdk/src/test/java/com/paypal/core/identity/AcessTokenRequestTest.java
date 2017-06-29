package com.paypal.core.identity;

import com.braintreepayments.http.HttpRequest;
import com.paypal.sdk.TestHarness;
import org.testng.annotations.Test;

import java.io.IOException;

public class AcessTokenRequestTest extends TestHarness{

	@Test
	public void testAccessTokenRequest() throws IOException {
		HttpRequest<Void> triggerRequest = new HttpRequest<>("/", "GET", Void.class);
		client().execute(triggerRequest);
	}
}
