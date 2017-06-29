// This class was generated on Wed, 28 Jun 2017 15:05:37 PDT by version 0.01 of Braintree SDK Generator
// AuthorizationGetRequestTest.java
// DO NOT EDIT
// @type request
// @json {"Name":"authorization.get","Description":"Shows details for an authorization, by ID.","Parameters":[{"Type":"string","VariableName":"authorization_id","Description":"The ID of the authorization for which to show details.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":true,"Properties":null,"Location":"path"}],"RequestType":null,"ResponseType":{"Type":"Authorization","VariableName":"","Description":"An authorization.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null},"ContentType":"","HttpMethod":"GET","Path":"/v1/payments/authorization/{authorization_id}","Visible":true,"ExpectedStatusCode":200,"FileSuffix":"Test"}

package com.paypal.sdk.payments.request;

import com.braintreepayments.http.HttpResponse;
import com.paypal.sdk.TestHarness;
import com.paypal.sdk.payments.object.Authorization;
import com.paypal.sdk.payments.object.Payment;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;

public class AuthorizationGetRequestTest extends TestHarness {

    @Test
    public void testAuthorizationGetRequest() throws IOException {
		HttpResponse<Payment> authorizeResponse = PaymentCreateRequestTest.createPayment(client(), "authorize");

		String authId = authorizeResponse.result().transactions().get(0)
				.relatedResources().get(0).authorization().id();
        AuthorizationGetRequest request = new AuthorizationGetRequest(authId);

        HttpResponse<Authorization> response = client().execute(request);
        assertEquals(200, response.statusCode());
    }
}
