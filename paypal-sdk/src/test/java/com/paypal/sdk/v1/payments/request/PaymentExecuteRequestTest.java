// This class was generated on Wed, 28 Jun 2017 15:05:37 PDT by version 0.01 of Braintree SDK Generator
// PaymentExecuteRequestTest.java
// DO NOT EDIT
// @type request
// @json {"Name":"payment.execute","Description":"Executes a PayPal payment that the customer has approved. You can optionally update one or more transactions when you execute the payment.\u003cblockquote\u003e\u003cstrong\u003eImportant:\u003c/strong\u003e This call works only after a customer has approved the payment. For more information, learn about [PayPal payments](/docs/integration/direct/payments/paypal-payments/).\u003c/blockquote\u003e","Parameters":[{"Type":"string","VariableName":"payment_id","Description":"The ID of the payment to execute.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":true,"Properties":null,"Location":"path"}],"RequestType":{"Type":"Payment Execution","VariableName":"body","Description":"Executes a PayPal account-based payment with the `payer_id` obtained from the web approval URL.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null},"ResponseType":{"Type":"Payment","VariableName":"","Description":"A payment. Use this object to create, process, and manage payments.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null},"ContentType":"","HttpMethod":"POST","Path":"/v1/payments/payment/{payment_id}/execute","Visible":true,"ExpectedStatusCode":200,"FileSuffix":"Test"}

package com.paypal.sdk.v1.payments.request;

import com.braintreepayments.http.HttpResponse;
import com.paypal.sdk.TestHarness;
import com.paypal.sdk.v1.payments.Payment;
import com.paypal.sdk.v1.payments.PaymentExecuteRequest;
import com.paypal.sdk.v1.payments.PaymentExecution;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;

/**
 * NOTE: Tests that use this class must be ignored when run in an automated environment because executing an order will require approval via the executed payment's approval_url.
 */
public class PaymentExecuteRequestTest extends TestHarness {

    @Test(enabled = false)
    public void testPaymentExecuteRequest() throws IOException {
    	HttpResponse<Payment> paymentResponse = PaymentCreateRequestTest.createPayment(client(), "order");

        PaymentExecuteRequest request = new PaymentExecuteRequest(paymentResponse.result().id());

        PaymentExecution body = new PaymentExecution()
				.payerId("SOME_PAYER_ID");
        request.requestBody(body);

        HttpResponse<Payment> response = client().execute(request);
        assertEquals(200, response.statusCode());
    }
}
