// This class was generated on Fri, 26 May 2017 11:06:13 PDT by version 0.01 of Braintree SDK Generator
// AvailableEventTypeList.java
// DO NOT EDIT
// @type request
// @json {"Name":"available-event-type.list","Description":"Lists available events to which any webhook can subscribe. For a list of supported events, see [Webhook event names](/docs/integration/direct/webhooks/event-names/).","Parameters":[],"RequestType":null,"SuccessResponseType":{"Type":"Webhook Event Type List","VariableName":"","Description":"List of webhook events.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null},"DefaultResponseType":{"Type":"error","VariableName":"","Description":"Details about an error.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null},"HttpMethod":"GET","Path":"/v1/notifications/webhooks-event-types","Visible":true}

package com.paypal.sdk.request;

import com.braintreepayments.http.HttpRequest;
import com.braintreepayments.http.HttpResponse;
import com.paypal.core.PayPalEnvironment;
import com.paypal.core.PayPalHttpClient;
import com.paypal.sdk.object.*;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.AssertJUnit.*;

public class AvailableEventTypeListRequestTest {

    @Test
    public void testAvailableEventTypeListRequest() throws IOException {
        PayPalHttpClient client = new PayPalHttpClient(new PayPalEnvironment.Sandbox("XXXX","YYYY"));

        AvailableEventTypeListRequest request = new AvailableEventTypeListRequest();

        HttpResponse<WebhookEventTypeList> resp = client.execute(request);
        WebhookEventTypeList eventTypeList = resp.result();
        assertTrue(eventTypeList.getEventTypes().size() > 0);
        assertEquals(200, resp.statusCode());
    }
}
