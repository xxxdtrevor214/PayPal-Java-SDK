// This class was generated on Mon, 31 Jul 2017 18:27:14 UTC by version 0.1 of Braintree SDK Generator
// AuthorizationGetRequest.java
// DO NOT EDIT
// @type request
// @json {"Name":"authorization.get","Description":"Shows details for an authorization, by ID.\u003cbr/\u003e\u003cbr/\u003eA successful request returns the HTTP `200 OK` status code and a JSON response body that shows authorization details.","QueryParameters":[],"HeaderParameters":[],"FormParameters":[],"PathParameters":[{"Type":"string","VariableName":"authorization_id","Description":"The ID of the authorization for which to show details.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null}],"RequestType":null,"ResponseType":{"Type":"Authorization","VariableName":"","Description":"An authorization.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},"ContentType":"application/json","HttpMethod":"GET","Path":"/v1/payments/authorization/{authorization_id}","ExpectedStatusCode":200}

package com.paypal.sdk.payments.request;

import com.braintreepayments.http.*;
import com.paypal.sdk.payments.object.*;
import java.util.*;
import java.util.List;


/**
 * Shows details for an authorization, by ID.<br/><br/>A successful request returns the HTTP `200 OK` status code and a JSON response body that shows authorization details.
 */
public class AuthorizationGetRequest extends HttpRequest<Authorization> {

    public AuthorizationGetRequest(String authorizationId) {
        super("/v1/payments/authorization/{authorization_id}?"
            .replace("{authorization_id}", String.valueOf(authorizationId)), "GET", Authorization.class);
        header("Content-Type", "application/json");
    }
    
}
