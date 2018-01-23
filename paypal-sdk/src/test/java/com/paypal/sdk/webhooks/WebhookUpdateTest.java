package com.paypal.sdk.webhooks;

import com.braintreepayments.http.HttpResponse;
import com.paypal.sdk.TestHarness;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static com.paypal.sdk.webhooks.WebhookCreateTest.createWebhook;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

public class WebhookUpdateTest extends TestHarness {

    private List<JsonPatch> buildRequestBody(String url) throws IOException {
        List<JsonPatch> jsonPatchList = new ArrayList<>();
        jsonPatchList.add(new JsonPatch()
                .op("replace")
                .path("/url")
                .value(url)
        );

        return jsonPatchList;
    }

    @Test
    public void testWebhookUpdateRequest() throws IOException {
        HttpResponse<Webhook> createResponse = createWebhook(client());

        WebhookUpdateRequest request = new WebhookUpdateRequest(createResponse.result().id());
        request.requestBody(buildRequestBody("http://example.com/updated_url"));

        HttpResponse<Webhook> response = client().execute(request);
        assertEquals(response.statusCode(), 200);
        assertNotNull(response.result());
        assertEquals(response.result().url(), "http://example.com/updated_url");
    }
}
