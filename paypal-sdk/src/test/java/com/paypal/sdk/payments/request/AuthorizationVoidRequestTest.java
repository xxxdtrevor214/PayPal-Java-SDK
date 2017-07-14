// This class was generated on Wed, 28 Jun 2017 15:05:37 PDT by version 0.01 of Braintree SDK Generator
// AuthorizationVoidRequestTest.java
// DO NOT EDIT
// @type request
// @json {"Name":"authorization.void","Description":"Voids, or cancels, an authorization, by ID. You cannot void a fully captured authorization.","Parameters":[{"Type":"string","VariableName":"authorization_id","Description":"The ID of the authorization to void.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":true,"Properties":null,"Location":"path"}],"RequestType":null,"ResponseType":{"Type":"Authorization","VariableName":"","Description":"An authorization.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null},"ContentType":"","HttpMethod":"POST","Path":"/v1/payments/authorization/{authorization_id}/void","Visible":true,"ExpectedStatusCode":200,"FileSuffix":"Test"}

package com.paypal.sdk.payments.request;

import com.braintreepayments.http.HttpResponse;
import com.paypal.sdk.TestHarness;
import com.paypal.sdk.payments.object.Authorization;
import com.paypal.sdk.payments.object.Payment;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;

public class AuthorizationVoidRequestTest extends TestHarness {

    @Test
    public void testAuthorizationVoidRequest() throws IOException {
    	HttpResponse<Payment> authorizeResponse = PaymentCreateRequestTest.createPayment(client(), "authorize");

		String authId = authorizeResponse.result().transactions().get(0)
				.relatedResources().get(0).authorization().id();
        AuthorizationVoidRequest request = new AuthorizationVoidRequest(authId);
        request.header("Content-Type", "application/json");

        HttpResponse<Authorization> response = client().execute(request);
        assertEquals(200, response.statusCode());
    }
}
