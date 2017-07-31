// This class was generated on Mon, 31 Jul 2017 18:27:14 UTC by version 0.1 of Braintree SDK Generator
// AuthorizationReauthorizeRequest.java
// DO NOT EDIT
// @type request
// @json {"Name":"authorization.reauthorize","Description":"Re-authorizes a PayPal account payment, by authorization ID. To ensure that funds are still available, re-authorize a payment after the initial three-day honor period. Supports only the `amount` request parameter. You can re-authorize a payment only once from four to 29 days after three-day honor period for the original authorization expires. If 30 days have passed from the original authorization, you must create a new authorization instead. A re-authorized payment itself has a new three-day honor period. You can re-authorize a transaction once for up to 115% of the originally authorized amount, not to exceed an increase of $75 USD.\u003cbr/\u003e\u003cbr/\u003eA successful request returns the HTTP `201 Created` status code and a JSON response body that shows details for the re-authorized authorization.","QueryParameters":[],"HeaderParameters":[],"FormParameters":[],"PathParameters":[{"Type":"string","VariableName":"authorization_id","Description":"The ID of the authorization to re-authorize.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null}],"RequestType":{"Type":"Authorization","VariableName":"body","Description":"An authorization.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},"ResponseType":{"Type":"Authorization","VariableName":"","Description":"An authorization.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},"ContentType":"application/json","HttpMethod":"POST","Path":"/v1/payments/authorization/{authorization_id}/reauthorize","ExpectedStatusCode":200}

package com.paypal.sdk.payments.request;

import com.braintreepayments.http.*;
import com.paypal.sdk.payments.object.*;
import java.util.*;
import java.util.List;


/**
 * Re-authorizes a PayPal account payment, by authorization ID. To ensure that funds are still available, re-authorize a payment after the initial three-day honor period. Supports only the `amount` request parameter. You can re-authorize a payment only once from four to 29 days after three-day honor period for the original authorization expires. If 30 days have passed from the original authorization, you must create a new authorization instead. A re-authorized payment itself has a new three-day honor period. You can re-authorize a transaction once for up to 115% of the originally authorized amount, not to exceed an increase of $75 USD.<br/><br/>A successful request returns the HTTP `201 Created` status code and a JSON response body that shows details for the re-authorized authorization.
 */
public class AuthorizationReauthorizeRequest extends HttpRequest<Authorization> {

    public AuthorizationReauthorizeRequest(String authorizationId) {
        super("/v1/payments/authorization/{authorization_id}/reauthorize?"
            .replace("{authorization_id}", String.valueOf(authorizationId)), "POST", Authorization.class);
        header("Content-Type", "application/json");
    }
    

    public AuthorizationReauthorizeRequest requestBody(Authorization body) {
        super.requestBody(body);
        return this;
    }
}
