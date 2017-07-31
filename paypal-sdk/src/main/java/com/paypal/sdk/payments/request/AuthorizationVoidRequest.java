// This class was generated on Mon, 31 Jul 2017 18:27:14 UTC by version 0.1 of Braintree SDK Generator
// AuthorizationVoidRequest.java
// DO NOT EDIT
// @type request
// @json {"Name":"authorization.void","Description":"Voids, or cancels, an authorization, by ID. You cannot void a fully captured authorization.\u003cbr/\u003e\u003cbr/\u003eA successful request returns the HTTP `200 OK` status code and a JSON response body that shows details for the voided authorization.","QueryParameters":[],"HeaderParameters":[],"FormParameters":[],"PathParameters":[{"Type":"string","VariableName":"authorization_id","Description":"The ID of the authorization to void.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null}],"RequestType":null,"ResponseType":{"Type":"Authorization","VariableName":"","Description":"An authorization.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},"ContentType":"application/json","HttpMethod":"POST","Path":"/v1/payments/authorization/{authorization_id}/void","ExpectedStatusCode":200}

package com.paypal.sdk.payments.request;

import com.braintreepayments.http.*;
import com.paypal.sdk.payments.object.*;
import java.util.*;
import java.util.List;


/**
 * Voids, or cancels, an authorization, by ID. You cannot void a fully captured authorization.<br/><br/>A successful request returns the HTTP `200 OK` status code and a JSON response body that shows details for the voided authorization.
 */
public class AuthorizationVoidRequest extends HttpRequest<Authorization> {

    public AuthorizationVoidRequest(String authorizationId) {
        super("/v1/payments/authorization/{authorization_id}/void?"
            .replace("{authorization_id}", String.valueOf(authorizationId)), "POST", Authorization.class);
        header("Content-Type", "application/json");
    }
    
}
