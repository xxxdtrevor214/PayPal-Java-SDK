// This class was generated on Fri, 02 Jun 2017 16:03:13 PDT by version 0.01 of Braintree SDK Generator
// VerifyWebhookSignaturePostRequestTest.java
// DO NOT EDIT
// @type request-test
// @json {"Name":"verify.webhook.signature.post","Description":"Verifies a webhook signature.","Parameters":[],"RequestType":{"Type":"Verify Webhook Signature","VariableName":"body","Description":"Verify the webhook signature.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null},"ResponseType":{"Type":"Verify Webhook Signature Response","VariableName":"","Description":"The verify webhook signature response.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null},"HttpMethod":"POST","Path":"/v1/notifications/verify-webhook-signature","Visible":true,"ExpectedStatusCode":200}

package com.paypal.sdk.request;

import com.braintreepayments.http.HttpResponse;
import com.braintreepayments.http.HttpClient;
import com.paypal.sdk.object.*;
import com.paypal.sdk.TestHarness;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;

public class VerifyWebhookSignaturePostRequestTest extends TestHarness {

    @Test
    public void testVerifyWebhookSignaturePostRequest() throws IOException {
        VerifyWebhookSignaturePostRequest request = new VerifyWebhookSignaturePostRequest();
        VerifyWebhookSignature body = new VerifyWebhookSignature();
        request.body(body);

        HttpResponse<VerifyWebhookSignatureResponse> response = client().execute(request);
        assertEquals(200, response.statusCode());

        // Add your own checks here
    }
}
