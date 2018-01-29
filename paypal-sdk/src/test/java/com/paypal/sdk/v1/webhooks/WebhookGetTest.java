package com.paypal.sdk.v1.webhooks;

import com.braintreepayments.http.HttpResponse;
import com.paypal.sdk.TestHarness;
import org.testng.annotations.Test;

import java.io.IOException;

import static com.paypal.sdk.v1.webhooks.WebhookCreateTest.createWebhook;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

public class WebhookGetTest extends TestHarness {

    @Test
    public void testWebhookGetRequest() throws IOException {
        HttpResponse<Webhook> createdWebhook = createWebhook(client());

        WebhookGetRequest request = new WebhookGetRequest(createdWebhook.result().id());

        HttpResponse<Webhook> response = client().execute(request);
        assertEquals(response.statusCode(), 200);
        assertNotNull(response.result());
        assertEquals(response.result().id(), createdWebhook.result().id());
    }
}
