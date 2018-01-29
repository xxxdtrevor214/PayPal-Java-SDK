package com.paypal.sdk.v1.webhooks;

import com.braintreepayments.http.HttpClient;
import com.braintreepayments.http.HttpResponse;
import com.paypal.sdk.TestHarness;
import org.testng.annotations.Test;

import java.io.IOException;

import static com.paypal.sdk.v1.webhooks.WebhookCreateTest.createWebhook;
import static org.testng.Assert.assertEquals;

public class WebhookDeleteTest extends TestHarness {

    public static HttpResponse<Void> deleteWebhook(String id, HttpClient client) throws IOException {
        return client.execute(new WebhookDeleteRequest(id));
    }

    @Test
    public void testWebhookDeleteRequest() throws IOException {
        HttpResponse<Webhook> newWebhook = createWebhook(client());

        HttpResponse<Void> response = deleteWebhook(newWebhook.result().id(), client());
        assertEquals(response.statusCode(), 204);
    }
}
