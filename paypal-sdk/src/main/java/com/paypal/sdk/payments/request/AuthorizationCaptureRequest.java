// This class was generated on Mon, 17 Jul 2017 10:51:10 PDT by version 0.01 of Braintree SDK Generator
// AuthorizationCaptureRequest.java
// DO NOT EDIT
// @type request
// @json {"Name":"authorization.capture","Description":"Captures and processes an authorization, by ID. To use this call, the original payment call must specify an intent of `authorize`.","Parameters":[{"Type":"string","VariableName":"authorization_id","Description":"The ID of the authorization to capture.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null,"Location":"path"}],"RequestType":{"Type":"Capture","VariableName":"body","Description":"A capture transaction.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},"ResponseType":{"Type":"Capture","VariableName":"","Description":"A capture transaction.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},"ContentType":"application/json","HttpMethod":"POST","Path":"/v1/payments/authorization/{authorization_id}/capture","ExpectedStatusCode":200}

package com.paypal.sdk.payments.request;

import com.braintreepayments.http.*;
import com.paypal.sdk.payments.object.*;
import java.util.List;


/**
 * Captures and processes an authorization, by ID. To use this call, the original payment call must specify an intent of `authorize`.
 */
public class AuthorizationCaptureRequest extends HttpRequest<Capture> {

    public AuthorizationCaptureRequest(String authorizationId) {
        super("/v1/payments/authorization/{authorization_id}/capture?"
            .replace("{authorization_id}", String.valueOf(authorizationId)), "POST", Capture.class);
    }

    public AuthorizationCaptureRequest requestBody(Capture body) {
        super.body(body);
        header("Content-Type", "application/json");
        return this;
    }
}
