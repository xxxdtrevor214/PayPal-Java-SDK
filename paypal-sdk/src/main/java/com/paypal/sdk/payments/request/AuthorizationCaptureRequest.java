// This class was generated on Mon, 31 Jul 2017 18:27:14 UTC by version 0.1 of Braintree SDK Generator
// AuthorizationCaptureRequest.java
// DO NOT EDIT
// @type request
// @json {"Name":"authorization.capture","Description":"Captures and processes an authorization, by ID. To use this call, the original payment call must specify an intent of `authorize`.\u003cbr/\u003e\u003cbr/\u003eA successful request returns the HTTP `201 Created` status code and a JSON response body that shows details for the captured authorization.","QueryParameters":[],"HeaderParameters":[],"FormParameters":[],"PathParameters":[{"Type":"string","VariableName":"authorization_id","Description":"The ID of the authorization to capture.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null}],"RequestType":{"Type":"Capture","VariableName":"body","Description":"A capture transaction.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},"ResponseType":{"Type":"Capture","VariableName":"","Description":"A capture transaction.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},"ContentType":"application/json","HttpMethod":"POST","Path":"/v1/payments/authorization/{authorization_id}/capture","ExpectedStatusCode":200}

package com.paypal.sdk.payments.request;

import com.braintreepayments.http.*;
import com.paypal.sdk.payments.object.*;
import java.util.*;
import java.util.List;


/**
 * Captures and processes an authorization, by ID. To use this call, the original payment call must specify an intent of `authorize`.<br/><br/>A successful request returns the HTTP `201 Created` status code and a JSON response body that shows details for the captured authorization.
 */
public class AuthorizationCaptureRequest extends HttpRequest<Capture> {

    public AuthorizationCaptureRequest(String authorizationId) {
        super("/v1/payments/authorization/{authorization_id}/capture?"
            .replace("{authorization_id}", String.valueOf(authorizationId)), "POST", Capture.class);
        header("Content-Type", "application/json");
    }
    

    public AuthorizationCaptureRequest requestBody(Capture body) {
        super.requestBody(body);
        return this;
    }
}
