// This class was generated on Wed, 28 Jun 2017 15:05:37 PDT by version 0.01 of Braintree SDK Generator
// PaymentUpdateRequestTest.java
// DO NOT EDIT
// @type request
// @json {"Name":"payment.update","Description":"Partially updates a payment, by ID. You can update the amount, shipping address, invoice ID, and custom data. You cannot update a payment after the payment executes.","Parameters":[{"Type":"string","VariableName":"payment_id","Description":"The ID of the payment to update.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":true,"Properties":null,"Location":"path"}],"RequestType":{"Type":"JSON Patch","VariableName":"body","Description":"A JSON patch request.","IsArray":true,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null},"ResponseType":null,"ContentType":"","HttpMethod":"PATCH","Path":"/v1/payments/payment/{payment_id}","Visible":true,"ExpectedStatusCode":200,"FileSuffix":"Test"}

package com.paypal.sdk.payments.request;

import com.braintreepayments.http.HttpResponse;
import com.paypal.sdk.TestHarness;
import com.paypal.sdk.payments.object.Amount;
import com.paypal.sdk.payments.object.JSONPatch;
import com.paypal.sdk.payments.object.Payment;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class PaymentUpdateRequestTest extends TestHarness {

	@Test
	public void testPaymentUpdateRequest() throws IOException {
		HttpResponse<Payment> paymentHttpResponse = PaymentCreateRequestTest.createPayment(client(), "paypal", "sale");

		PaymentUpdateRequest request = new PaymentUpdateRequest(paymentHttpResponse.result().id());

		List<JSONPatch> body = new ArrayList<>();
		body.add(new JSONPatch()
				.path("/transactions/0/amount")
				.op("replace")
				.value(new Amount()
						.currency("USD")
						.total("11")));

		request.body(body);

		HttpResponse<Void> response = client().execute(request);
		assertEquals(200, response.statusCode());
	}
}
