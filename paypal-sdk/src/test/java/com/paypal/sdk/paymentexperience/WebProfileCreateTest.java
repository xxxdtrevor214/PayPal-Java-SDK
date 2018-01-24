package com.paypal.sdk.paymentexperience;

import com.braintreepayments.http.HttpClient;
import com.braintreepayments.http.HttpResponse;
import com.paypal.sdk.TestHarness;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.UUID;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

public class WebProfileCreateTest extends TestHarness {
	private static WebProfile buildRequestBody(boolean temporary) throws IOException {
		return new WebProfile()
				.name("Template" + UUID.randomUUID().toString())
				.flowConfig(new FlowConfig()
						.landingPageType("Billing")
						.bankTxnPendingUrl("http://example.com/flow_config_pending")
						.userAction("commit")
						.returnUriHttpMethod("GET"))
				.presentation(new Presentation()
						.logoImage("http://example.com/flow_config_logo.png")
						.brandName("Example")
						.localeCode("US"))
				.inputFields(new InputFields()
						.allowNote(true)
						.noShipping(1)
						.addressOverride(0))
				.temporary(false);
	}

	public static HttpResponse<WebProfile> createWebProfile(HttpClient client, boolean temporary) throws IOException {
		WebProfileCreateRequest request = new WebProfileCreateRequest();
		request.requestBody(buildRequestBody(temporary));

		return client.execute(request);
	}

	@Test
	public void testWebProfileCreateRequest() throws IOException {
		HttpResponse<WebProfile> response = createWebProfile(client(), true);
		assertEquals(response.statusCode(), 201);
		assertNotNull(response.result());

		assertNotNull(response.result().id());
		assertEquals(response.result().flowConfig().landingPageType(), "Billing");
	}
}
