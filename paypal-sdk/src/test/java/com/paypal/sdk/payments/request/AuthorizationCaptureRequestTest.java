// This class was generated on Wed, 28 Jun 2017 15:05:37 PDT by version 0.01 of Braintree SDK Generator
// AuthorizationCaptureRequestTest.java
// DO NOT EDIT
// @type request
// @json {"Name":"authorization.capture","Description":"Captures and processes an authorization, by ID. To use this call, the original payment call must specify an intent of `authorize`.","Parameters":[{"Type":"string","VariableName":"authorization_id","Description":"The ID of the authorization to capture.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":true,"Properties":null,"Location":"path"}],"RequestType":{"Type":"Capture","VariableName":"body","Description":"A capture transaction.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null},"ResponseType":{"Type":"Capture","VariableName":"","Description":"A capture transaction.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null},"ContentType":"","HttpMethod":"POST","Path":"/v1/payments/authorization/{authorization_id}/capture","Visible":true,"ExpectedStatusCode":200,"FileSuffix":"Test"}

package com.paypal.sdk.payments.request;

import com.braintreepayments.http.HttpClient;
import com.braintreepayments.http.HttpResponse;
import com.paypal.sdk.TestHarness;
import com.paypal.sdk.payments.object.Amount;
import com.paypal.sdk.payments.object.Capture;
import com.paypal.sdk.payments.object.Payment;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;

public class AuthorizationCaptureRequestTest extends TestHarness {

	public static HttpResponse<Capture> createAuthorizationCapture(HttpClient client) throws IOException {
		HttpResponse<Payment> authorizeResponse = PaymentCreateRequestTest.createPayment(client, "authorize");

		String authId = authorizeResponse.result().transactions().get(0).relatedResources().get(0).authorization().id();
		AuthorizationCaptureRequest request = new AuthorizationCaptureRequest(authId);

		Capture body = new Capture()
				.amount(new Amount()
						.total("10")
						.currency("USD"))
				.isFinalCapture(true);

		request.requestBody(body);

		return client.execute(request);
	}

	@Test
	public void testAuthorizationCaptureRequest() throws IOException {
		HttpResponse<Capture> captureResponse = createAuthorizationCapture(client());

		assertEquals(200, captureResponse.statusCode());
	}
}
