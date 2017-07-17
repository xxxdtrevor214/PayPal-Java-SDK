// This class was generated on Mon, 17 Jul 2017 10:51:10 PDT by version 0.01 of Braintree SDK Generator
// OrderAuthorizeRequest.java
// DO NOT EDIT
// @type request
// @json {"Name":"order.authorize","Description":"Authorizes an order, by ID. In the JSON request body, include an `amount` object.","Parameters":[{"Type":"string","VariableName":"order_id","Description":"The ID of the order to authorize.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null,"Location":"path"}],"RequestType":{"Type":"Order","VariableName":"body","Description":"An order transaction.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},"ResponseType":{"Type":"Authorization","VariableName":"","Description":"An authorization.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},"ContentType":"application/json","HttpMethod":"POST","Path":"/v1/payments/orders/{order_id}/authorize","ExpectedStatusCode":200}

package com.paypal.sdk.payments.request;

import com.braintreepayments.http.*;
import com.paypal.sdk.payments.object.*;
import java.util.List;


/**
 * Authorizes an order, by ID. In the JSON request body, include an `amount` object.
 */
public class OrderAuthorizeRequest extends HttpRequest<Authorization> {

    public OrderAuthorizeRequest(String orderId) {
        super("/v1/payments/orders/{order_id}/authorize?"
            .replace("{order_id}", String.valueOf(orderId)), "POST", Authorization.class);
    }

    public OrderAuthorizeRequest requestBody(Order body) {
        super.body(body);
        header("Content-Type", "application/json");
        return this;
    }
}
