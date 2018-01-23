// This class was generated on Wed, 28 Jun 2017 15:05:37 PDT by version 0.01 of Braintree SDK Generator
// AuthorizationReauthorizeRequestTest.java
// DO NOT EDIT
// @type request
// @json {"Name":"authorization.reauthorize","Description":"Re-authorizes a PayPal account payment, by authorization ID. To ensure that funds are still available, re-authorize a payment after the initial three-day honor period. Supports only the `amount` request parameter. You can re-authorize a payment only once from four to 29 days after three-day honor period for the original authorization expires. If 30 days have passed from the original authorization, you must create a new authorization instead. A re-authorized payment itself has a new three-day honor period. You can re-authorize a transaction once for up to 115% of the originally authorized amount, not to exceed an increase of $75 USD.","Parameters":[{"Type":"string","VariableName":"authorization_id","Description":"The ID of the authorization to re-authorize.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":true,"Properties":null,"Location":"path"}],"RequestType":{"Type":"Authorization","VariableName":"body","Description":"An authorization.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null},"ResponseType":{"Type":"Authorization","VariableName":"","Description":"An authorization.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null},"ContentType":"","HttpMethod":"POST","Path":"/v1/payments/authorization/{authorization_id}/reauthorize","Visible":true,"ExpectedStatusCode":200,"FileSuffix":"Test"}

package com.paypal.sdk.payments.request;

import com.braintreepayments.http.HttpResponse;
import com.braintreepayments.http.exceptions.HttpException;
import com.paypal.sdk.TestHarness;
import com.paypal.sdk.payments.Amount;
import com.paypal.sdk.payments.Authorization;
import com.paypal.sdk.payments.AuthorizationReauthorizeRequest;
import com.paypal.sdk.payments.Payment;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

/**
 * NOTE: This test expects a 500, as reauthorizing a Direct Credit Card payment is not allowed, and authorizing a PayPal transaction requires approval from the payer.
 */
public class AuthorizationReauthorizeRequestTest extends TestHarness {

	@Test
	public void testAuthorizationReauthorizeRequest() throws IOException {
		HttpResponse<Payment> authorizeResponse = PaymentCreateRequestTest.createPayment(client(), "authorize");

		String authId = authorizeResponse.result().transactions()
				.get(0).relatedResources().get(0).authorization().id();
		AuthorizationReauthorizeRequest request = new AuthorizationReauthorizeRequest(authId);

		request.requestBody(new Authorization()
				.amount(new Amount()
						.total("12")
						.currency("USD")));

		try {
			client().execute(request);
		} catch (HttpException he) {
			assertEquals(he.statusCode(), 500);
			assertTrue(he.getMessage().contains("DCC_REAUTHORIZATION_NOT_ALLOWED"));
		}
	}
}
