// This class was generated on Wed, 28 Jun 2017 15:05:37 PDT by version 0.01 of Braintree SDK Generator
// SaleRefundRequestTest.java
// DO NOT EDIT
// @type request
// @json {"Name":"sale.refund","Description":"Refunds a sale, by ID. For a full refund, include an empty payload in the JSON request body. For a partial refund, include an `amount` object in the JSON request body.","Parameters":[{"Type":"string","VariableName":"sale_id","Description":"The ID of the sale transaction to refund.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":true,"Properties":null,"Location":"path"}],"RequestType":{"Type":"Refund Request","VariableName":"body","Description":"A refund request.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null},"ResponseType":{"Type":"Detailed Refund","VariableName":"","Description":"A refund transaction that is returned by `GET /refund`.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null},"ContentType":"","HttpMethod":"POST","Path":"/v1/payments/sale/{sale_id}/refund","Visible":true,"ExpectedStatusCode":200,"FileSuffix":"Test"}

package com.paypal.sdk.payments.request;

import com.braintreepayments.http.HttpResponse;
import com.braintreepayments.http.HttpClient;
import com.paypal.sdk.TestHarness;
import com.paypal.sdk.payments.object.DetailedRefund;
import com.paypal.sdk.payments.object.Payment;
import com.paypal.sdk.payments.object.RefundRequest;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;

public class SaleRefundRequestTest extends TestHarness {

	public static HttpResponse<DetailedRefund> createRefund(HttpClient client) throws IOException {
		HttpResponse<Payment> paymentResponse = PaymentCreateRequestTest.createPayment(client, "sale");

		String saleId = paymentResponse.result().transactions().get(0).relatedResources().get(0).sale().id();
        SaleRefundRequest request = new SaleRefundRequest(saleId);

        RefundRequest body = new RefundRequest();
        request.requestBody(body);

        return client.execute(request);
	}

    @Test
    public void testSaleRefundRequest() throws IOException {
		HttpResponse<DetailedRefund> response = createRefund(client());
        assertEquals(201, response.statusCode());
    }
}
