package com.paypal.sdk.webhooks;

import com.braintreepayments.http.HttpResponse;
import com.paypal.sdk.TestHarness;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

public class SimulateEventTest extends TestHarness {
    private SimulateEvent buildRequestBody() throws IOException {
        return new SimulateEvent()
                .url("https://www.example.com/paypal_webhook")
                .eventType("PAYMENT.AUTHORIZATION.CREATED");
    }

    @Test
    public void testSimulateEventRequest() throws IOException {
        SimulateEventRequest request = new SimulateEventRequest();
        request.requestBody(buildRequestBody());

        HttpResponse<Event> response = client().execute(request);
        assertEquals(response.statusCode(), 202);
        assertNotNull(response.result());

        assertEquals(response.result().eventType(), "PAYMENT.AUTHORIZATION.CREATED");
    }
}
