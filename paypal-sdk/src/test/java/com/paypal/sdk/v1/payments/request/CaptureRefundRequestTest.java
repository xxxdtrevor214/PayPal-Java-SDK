// This class was generated on Wed, 28 Jun 2017 15:05:37 PDT by version 0.01 of Braintree SDK Generator
// CaptureRefundRequestTest.java
// DO NOT EDIT
// @type request
// @json {"Name":"capture.refund","Description":"Refunds a captured payment, by ID. In the JSON request body, include an `amount` object.","Parameters":[{"Type":"string","VariableName":"capture_id","Description":"The ID of the captured payment to refund.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":true,"Properties":null,"Location":"path"}],"RequestType":{"Type":"Refund Request","VariableName":"body","Description":"A refund request.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null},"ResponseType":{"Type":"Detailed Refund","VariableName":"","Description":"A refund transaction that is returned by `GET /refund`.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null},"ContentType":"","HttpMethod":"POST","Path":"/v1/payments/capture/{capture_id}/refund","Visible":true,"ExpectedStatusCode":200,"FileSuffix":"Test"}

package com.paypal.sdk.v1.payments.request;

import com.braintreepayments.http.HttpResponse;
import com.paypal.sdk.TestHarness;
import com.paypal.sdk.v1.payments.*;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

public class CaptureRefundRequestTest extends TestHarness {

    @Test
    public void testCaptureRefundRequest() throws IOException {
    	HttpResponse<Capture> captureHttpResponse = AuthorizationCaptureRequestTest.createAuthorizationCapture(client());

        CaptureRefundRequest request = new CaptureRefundRequest(captureHttpResponse.result().id());

        RefundRequest body = new RefundRequest();
        body.amount(new Amount()
			.currency("USD")
			.total("10"));
        request.requestBody(body);

        HttpResponse<DetailedRefund> response = client().execute(request);
        assertEquals(response.statusCode(), 201);
        assertNotNull(response.result());
    }
}
