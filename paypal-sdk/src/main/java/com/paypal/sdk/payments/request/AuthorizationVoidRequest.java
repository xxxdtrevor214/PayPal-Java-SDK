// This class was generated on Mon, 03 Jul 2017 13:56:47 PDT by version 0.01 of Braintree SDK Generator
// AuthorizationVoidRequest.java
// DO NOT EDIT
// @type request
// @json {"Name":"authorization.void","Description":"Voids, or cancels, an authorization, by ID. You cannot void a fully captured authorization.","Parameters":[{"Type":"string","VariableName":"authorization_id","Description":"The ID of the authorization to void.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null,"Location":"path"}],"RequestType":null,"ResponseType":{"Type":"Authorization","VariableName":"","Description":"An authorization.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},"ContentType":"application/json","HttpMethod":"POST","Path":"/v1/payments/authorization/{authorization_id}/void","ExpectedStatusCode":200}

package com.paypal.sdk.payments.request;

import com.braintreepayments.http.*;
import com.paypal.sdk.payments.object.*;
import java.util.List;


/**
 * Voids, or cancels, an authorization, by ID. You cannot void a fully captured authorization.
 */
public class AuthorizationVoidRequest extends HttpRequest<Authorization> {

		public AuthorizationVoidRequest(String authorizationId) {
				super("/v1/payments/authorization/{authorization_id}/void?"
                    .replace("{authorization_id}", String.valueOf(authorizationId)), "POST", Authorization.class);
		}
}
