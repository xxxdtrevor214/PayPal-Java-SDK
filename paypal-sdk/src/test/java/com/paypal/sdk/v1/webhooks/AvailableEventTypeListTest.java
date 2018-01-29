package com.paypal.sdk.v1.webhooks;

import com.braintreepayments.http.HttpResponse;
import com.paypal.sdk.TestHarness;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertTrue;

public class AvailableEventTypeListTest extends TestHarness {

    @Test
    public void testAvailableEventTypeListRequest() throws IOException {
        AvailableEventTypeListRequest request = new AvailableEventTypeListRequest();

        HttpResponse<EventTypeList> response = client().execute(request);
        assertEquals(response.statusCode(), 200);
        assertNotNull(response.result());
        assertTrue(response.result().eventTypes().size() > 0);
    }
}
