// This class was generated on Fri, 02 Jun 2017 16:03:13 PDT by version 0.01 of Braintree SDK Generator
// WebhooksDeleteRequestTest.java
// DO NOT EDIT
// @type request-test
// @json {"Name":"webhooks.delete","Description":"Deletes a webhook, by ID.","Parameters":[{"Type":"string","VariableName":"webhook_id","Description":"The ID of the webhook to delete.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":true,"Properties":null,"Location":"path"}],"RequestType":null,"ResponseType":null,"HttpMethod":"DELETE","Path":"/v1/notifications/webhooks/{webhook_id}","Visible":true,"ExpectedStatusCode":200}

package com.paypal.sdk.request;

import com.braintreepayments.http.HttpResponse;
import com.braintreepayments.http.HttpClient;
import com.paypal.sdk.object.*;
import com.paypal.sdk.TestHarness;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;

public class WebhooksDeleteRequestTest extends TestHarness {

    @Test
    public void testWebhooksDeleteRequest() throws IOException {
        WebhooksDeleteRequest request = new WebhooksDeleteRequest();

        HttpResponse<Void> response = client().execute(request);
        assertEquals(200, response.statusCode());

        // Add your own checks here
    }
}
