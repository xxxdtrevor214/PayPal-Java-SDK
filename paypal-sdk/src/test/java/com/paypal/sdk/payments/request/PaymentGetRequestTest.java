// This class was generated on Wed, 28 Jun 2017 15:05:37 PDT by version 0.01 of Braintree SDK Generator
// PaymentGetRequestTest.java
// DO NOT EDIT
// @type request
// @json {"Name":"payment.get","Description":"Shows details for a payment, by ID, that has yet to complete. For example, shows details for a payment that was created, approved, or failed.","Parameters":[{"Type":"string","VariableName":"payment_id","Description":"The ID of the payment for which to show details.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":true,"Properties":null,"Location":"path"}],"RequestType":null,"ResponseType":{"Type":"Payment","VariableName":"","Description":"A payment. Use this object to create, process, and manage payments.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null},"ContentType":"","HttpMethod":"GET","Path":"/v1/payments/payment/{payment_id}","Visible":true,"ExpectedStatusCode":200,"FileSuffix":"Test"}

package com.paypal.sdk.payments.request;

import com.braintreepayments.http.HttpResponse;
import com.paypal.sdk.TestHarness;
import com.paypal.sdk.payments.Payment;
import com.paypal.sdk.payments.PaymentGetRequest;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;

public class PaymentGetRequestTest extends TestHarness {

    @Test
    public void testPaymentGetRequest() throws IOException {
    	HttpResponse<Payment> paymentHttpResponse = PaymentCreateRequestTest.createPayment(client(), "sale");

        PaymentGetRequest request = new PaymentGetRequest(paymentHttpResponse.result().id());

        HttpResponse<Payment> response = client().execute(request);
        assertEquals(200, response.statusCode());
    }
}
