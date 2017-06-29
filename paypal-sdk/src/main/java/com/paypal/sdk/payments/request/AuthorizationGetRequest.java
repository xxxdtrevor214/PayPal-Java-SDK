// This class was generated on Mon, 03 Jul 2017 13:56:47 PDT by version 0.01 of Braintree SDK Generator
// AuthorizationGetRequest.java
// DO NOT EDIT
// @type request
// @json {"Name":"authorization.get","Description":"Shows details for an authorization, by ID.","Parameters":[{"Type":"string","VariableName":"authorization_id","Description":"The ID of the authorization for which to show details.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null,"Location":"path"}],"RequestType":null,"ResponseType":{"Type":"Authorization","VariableName":"","Description":"An authorization.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},"ContentType":"application/json","HttpMethod":"GET","Path":"/v1/payments/authorization/{authorization_id}","ExpectedStatusCode":200}

package com.paypal.sdk.payments.request;

import com.braintreepayments.http.*;
import com.paypal.sdk.payments.object.*;
import java.util.List;


/**
 * Shows details for an authorization, by ID.
 */
public class AuthorizationGetRequest extends HttpRequest<Authorization> {

		public AuthorizationGetRequest(String authorizationId) {
				super("/v1/payments/authorization/{authorization_id}?"
                    .replace("{authorization_id}", String.valueOf(authorizationId)), "GET", Authorization.class);
		}
}
