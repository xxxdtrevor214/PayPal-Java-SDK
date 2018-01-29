package com.paypal.sdk.v1.webhooks;

import com.braintreepayments.http.HttpClient;
import com.braintreepayments.http.HttpResponse;
import com.paypal.sdk.TestHarness;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

public class WebhookListTest extends TestHarness {

    public static HttpResponse<WebhookList> listAllWebhooks(HttpClient client) throws IOException {
        return client.execute(new WebhookListRequest());
    }

    @Test
    public void testWebhookListRequest() throws IOException {
        HttpResponse<WebhookList> listResponse = listAllWebhooks(client());

        assertEquals(listResponse.statusCode(), 200);
        assertNotNull(listResponse.result());
    }
}
