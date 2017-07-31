// This class was generated on Mon, 31 Jul 2017 18:27:14 UTC by version 0.1 of Braintree SDK Generator
// OrderGetRequest.java
// DO NOT EDIT
// @type request
// @json {"Name":"order.get","Description":"Shows details for an order, by ID.\u003cbr/\u003e\u003cbr/\u003eA successful request returns the HTTP `200 OK` status code and a JSON response body that shows details for the voided authorization.","QueryParameters":[],"HeaderParameters":[],"FormParameters":[],"PathParameters":[{"Type":"string","VariableName":"order_id","Description":"The ID of the order for which to show details.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null}],"RequestType":null,"ResponseType":{"Type":"Order","VariableName":"","Description":"An order transaction.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},"ContentType":"application/json","HttpMethod":"GET","Path":"/v1/payments/orders/{order_id}","ExpectedStatusCode":200}

package com.paypal.sdk.payments.request;

import com.braintreepayments.http.*;
import com.paypal.sdk.payments.object.*;
import java.util.*;
import java.util.List;


/**
 * Shows details for an order, by ID.<br/><br/>A successful request returns the HTTP `200 OK` status code and a JSON response body that shows details for the voided authorization.
 */
public class OrderGetRequest extends HttpRequest<Order> {

    public OrderGetRequest(String orderId) {
        super("/v1/payments/orders/{order_id}?"
            .replace("{order_id}", String.valueOf(orderId)), "GET", Order.class);
        header("Content-Type", "application/json");
    }
    
}
