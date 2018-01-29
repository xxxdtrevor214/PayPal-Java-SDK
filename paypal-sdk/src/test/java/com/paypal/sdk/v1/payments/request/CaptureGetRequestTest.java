// This class was generated on Wed, 28 Jun 2017 15:05:37 PDT by version 0.01 of Braintree SDK Generator
// CaptureGetRequestTest.java
// DO NOT EDIT
// @type request
// @json {"Name":"capture.get","Description":"Shows details for a captured payment, by ID.","Parameters":[{"Type":"string","VariableName":"capture_id","Description":"The ID of the captured payment for which to show details.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":true,"Properties":null,"Location":"path"}],"RequestType":null,"ResponseType":{"Type":"Capture","VariableName":"","Description":"A capture transaction.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null},"ContentType":"","HttpMethod":"GET","Path":"/v1/payments/capture/{capture_id}","Visible":true,"ExpectedStatusCode":200,"FileSuffix":"Test"}

package com.paypal.sdk.v1.payments.request;

import com.braintreepayments.http.HttpResponse;
import com.paypal.sdk.TestHarness;
import com.paypal.sdk.v1.payments.Capture;
import com.paypal.sdk.v1.payments.CaptureGetRequest;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

public class CaptureGetRequestTest extends TestHarness {

    @Test
    public void testCaptureGetRequest() throws IOException {
    	HttpResponse<Capture> captureResponse = AuthorizationCaptureRequestTest.createAuthorizationCapture(client());

        CaptureGetRequest request = new CaptureGetRequest(captureResponse.result().id());

        HttpResponse<Capture> response = client().execute(request);
        assertEquals(200, response.statusCode());
        assertNotNull(response.result());
    }
}
