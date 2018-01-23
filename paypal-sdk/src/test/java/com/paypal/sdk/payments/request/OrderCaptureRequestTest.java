// This class was generated on Wed, 28 Jun 2017 15:05:37 PDT by version 0.01 of Braintree SDK Generator
// OrderCaptureRequestTest.java
// DO NOT EDIT
// @type request
// @json {"Name":"order.capture","Description":"Captures a payment for an order, by ID. To use this call, the original payment call must specify an `order` intent. In the JSON request body, include the payment amount and indicate whether this capture is the final capture for the authorization.","Parameters":[{"Type":"string","VariableName":"order_id","Description":"The ID of the order to capture.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":true,"Properties":null,"Location":"path"}],"RequestType":{"Type":"Capture","VariableName":"body","Description":"A capture transaction.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null},"ResponseType":{"Type":"Capture","VariableName":"","Description":"A capture transaction.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null},"ContentType":"","HttpMethod":"POST","Path":"/v1/payments/orders/{order_id}/capture","Visible":true,"ExpectedStatusCode":200,"FileSuffix":"Test"}

package com.paypal.sdk.payments.request;

import com.braintreepayments.http.HttpResponse;
import com.paypal.sdk.TestHarness;
import com.paypal.sdk.payments.Amount;
import com.paypal.sdk.payments.Capture;
import com.paypal.sdk.payments.OrderCaptureRequest;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;

/**
 * NOTE: Tests that use this class must be ignored when run in an automated environment because executing an order will require approval via the executed payment's approval_url.
 */
public class OrderCaptureRequestTest extends TestHarness {

	@Test(enabled = false)
	public void testOrderCaptureRequest() throws IOException {
		OrderCaptureRequest request = new OrderCaptureRequest(OrderGetRequestTest.ID);

		Capture body = new Capture()
				.amount(new Amount()
						.total("10")
						.currency("USD"))
				.isFinalCapture(true);

		request.requestBody(body);

		HttpResponse<Capture> response = client().execute(request);
		assertEquals(200, response.statusCode());
	}
}
