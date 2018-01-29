// This class was generated on Wed, 28 Jun 2017 15:05:37 PDT by version 0.01 of Braintree SDK Generator
// RefundGetRequestTest.java
// DO NOT EDIT
// @type request
// @json {"Name":"refund.get","Description":"Shows details for a refund, by ID.","Parameters":[{"Type":"string","VariableName":"refund_id","Description":"The ID of the refund for which to show details.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":true,"Properties":null,"Location":"path"}],"RequestType":null,"ResponseType":{"Type":"Refund","VariableName":"","Description":"A refund transaction.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null},"ContentType":"","HttpMethod":"GET","Path":"/v1/payments/refund/{refund_id}","Visible":true,"ExpectedStatusCode":200,"FileSuffix":"Test"}

package com.paypal.sdk.v1.payments.request;

import com.braintreepayments.http.HttpResponse;
import com.paypal.sdk.TestHarness;
import com.paypal.sdk.v1.payments.DetailedRefund;
import com.paypal.sdk.v1.payments.Refund;
import com.paypal.sdk.v1.payments.RefundGetRequest;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

public class RefundGetRequestTest extends TestHarness {

    @Test
    public void testRefundGetRequest() throws IOException {
    	HttpResponse<DetailedRefund> refundResponse = SaleRefundRequestTest.createRefund(client());

        RefundGetRequest request = new RefundGetRequest(refundResponse.result().id());

        HttpResponse<Refund> response = client().execute(request);
        assertEquals(200, response.statusCode());
        assertNotNull(response.result());
    }
}
