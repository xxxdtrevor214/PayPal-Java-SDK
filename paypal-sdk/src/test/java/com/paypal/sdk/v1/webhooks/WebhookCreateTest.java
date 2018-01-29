package com.paypal.sdk.v1.webhooks;

import com.braintreepayments.http.HttpClient;
import com.braintreepayments.http.HttpResponse;
import com.braintreepayments.http.exceptions.HttpException;
import com.paypal.sdk.TestHarness;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static com.paypal.sdk.v1.webhooks.WebhookDeleteTest.deleteWebhook;
import static com.paypal.sdk.v1.webhooks.WebhookListTest.listAllWebhooks;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertTrue;

public class WebhookCreateTest extends TestHarness {

    private static Webhook buildRequestBody() {
        String url = String.format("https://example.com/paypal_webhook_test/%s", Math.abs(new Random().nextInt()));

        List<EventType> eventTypes = new ArrayList<>();
        eventTypes.add(new EventType().name("PAYMENT.AUTHORIZATION.CREATED"));
        eventTypes.add(new EventType().name("PAYMENT.AUTHORIZATION.VOIDED"));

        return new Webhook()
                .url(url)
                .eventTypes(eventTypes);
    }

    public static HttpResponse<Webhook> createWebhook(HttpClient client) throws IOException {
        WebhookCreateRequest request = new WebhookCreateRequest();
        request.requestBody(buildRequestBody());

        try {
            return client.execute(request);
        } catch (IOException ioe) {
            if (ioe instanceof HttpException) {
                HttpException httpe = (HttpException) ioe;
                if (httpe.getMessage().contains("NUMBER_LIMIT_EXCEEDED")) {
                    HttpResponse<WebhookList> allWebhooksResponse = listAllWebhooks(client);
                    for (Webhook hook : allWebhooksResponse.result().webhooks()) {
                        deleteWebhook(hook.id(), client);
                    }

                    return createWebhook(client);
                } else {
                    throw new RuntimeException(ioe);
                }
            } else {
                throw new RuntimeException(ioe);
            }
        }
    }

    @Test
    public void testWebhookCreateRequest() throws IOException {
        HttpResponse<Webhook> webhookCreateResponse = createWebhook(client());

        assertEquals(webhookCreateResponse.statusCode(), 201);
        assertNotNull(webhookCreateResponse.result());
        assertTrue(webhookCreateResponse.result().url().contains("https://example.com/paypal_webhook_test"));
    }
}
