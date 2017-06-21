// This class was generated on Fri, 02 Jun 2017 16:03:13 PDT by version 0.01 of Braintree SDK Generator
// WebhooksCreateRequestTest.java
// DO NOT EDIT
// @type request-test
// @json {"Name":"webhooks.create","Description":"Subscribes your webhook listener to events. A successful call returns a [`webhook`](/docs/api/webhooks/#definition-webhook:v1) object, which includes the webhook ID for later use.","Parameters":[],"RequestType":{"Type":"Webhook","VariableName":"body","Description":"One or more webhook objects.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null},"ResponseType":{"Type":"Webhook","VariableName":"","Description":"One or more webhook objects.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null},"HttpMethod":"POST","Path":"/v1/notifications/webhooks","Visible":true,"ExpectedStatusCode":200}

package com.paypal.sdk.request;

import com.braintreepayments.http.HttpResponse;
import com.paypal.core.PayPalHttpClient;
import com.paypal.core.authorization.PayPalEnvironment;
import com.paypal.sdk.TestHarness;
import com.paypal.sdk.object.EventType;
import com.paypal.sdk.object.Webhook;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WebhooksCreateRequestTest extends TestHarness {

    @Test
    public void testWebhooksCreateRequest() throws IOException {
			PayPalHttpClient client  = new PayPalHttpClient(new PayPalEnvironment.Sandbox("client_id", "client_secret"));

			Webhook webhook = new Webhook()
							.url("https://localhost/webhook-goes-here");

			List<EventType> eventTypes = new ArrayList<>();
			eventTypes.add(new EventType().name("PAYMENT.AUTHORIZATION.CREATED"));
			webhook.eventTypes(eventTypes);

			WebhooksCreateRequest webhooksCreateRequest = new WebhooksCreateRequest()
							.body(webhook);

			try {
				HttpResponse<Webhook> response = client.execute(webhooksCreateRequest);
				Webhook createdWebhook = response.result();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
    }
}
