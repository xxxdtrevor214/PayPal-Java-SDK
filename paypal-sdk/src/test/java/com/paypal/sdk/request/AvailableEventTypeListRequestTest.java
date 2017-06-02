// This class was generated on Fri, 02 Jun 2017 16:03:13 PDT by version 0.01 of Braintree SDK Generator
// AvailableEventTypeListRequestTest.java
// DO NOT EDIT
// @type request-test
// @json {"Name":"available-event-type.list","Description":"Lists available events to which any webhook can subscribe. For a list of supported events, see [Webhook event names](/docs/integration/direct/webhooks/event-names/).","Parameters":[],"RequestType":null,"ResponseType":{"Type":"EventTypeList","VariableName":"","Description":"List of webhook events.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null},"HttpMethod":"GET","Path":"/v1/notifications/webhooks-event-types","Visible":true,"ExpectedStatusCode":200}

package com.paypal.sdk.request;

import com.braintreepayments.http.HttpResponse;
import com.braintreepayments.http.HttpClient;
import com.paypal.sdk.object.*;
import com.paypal.sdk.TestHarness;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;

public class AvailableEventTypeListRequestTest extends TestHarness {

    @Test
    public void testAvailableEventTypeListRequest() throws IOException {
        AvailableEventTypeListRequest request = new AvailableEventTypeListRequest();

        HttpResponse<EventTypeList> response = client().execute(request);
        assertEquals(200, response.statusCode());

        // Add your own checks here
    }
}
