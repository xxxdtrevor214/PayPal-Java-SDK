// This class was generated on Fri, 02 Jun 2017 16:03:13 PDT by version 0.01 of Braintree SDK Generator
// WebhooksCreateRequestTest.java
// DO NOT EDIT
// @type request-test
// @json {"Name":"webhooks.create","Description":"Subscribes your webhook listener to events. A successful call returns a [`webhook`](/docs/api/webhooks/#definition-webhook:v1) object, which includes the webhook ID for later use.","Parameters":[],"RequestType":{"Type":"Webhook","VariableName":"body","Description":"One or more webhook objects.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null},"ResponseType":{"Type":"Webhook","VariableName":"","Description":"One or more webhook objects.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null},"HttpMethod":"POST","Path":"/v1/notifications/webhooks","Visible":true,"ExpectedStatusCode":200}

package com.paypal.sdk.request;

import com.braintreepayments.http.HttpResponse;
import com.paypal.sdk.TestHarness;
import com.paypal.sdk.object.Webhook;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;

public class WebhooksCreateRequestTest extends TestHarness {

    @Test
    public void testWebhooksCreateRequest() throws IOException {
        WebhooksCreateRequest request = new WebhooksCreateRequest();
        Webhook body = new Webhook();
        request.body(body);

        HttpResponse<Webhook> response = client().execute(request);
        assertEquals(200, response.statusCode());

        // Add your own checks here
    }
}
