// This class was generated on Mon, 17 Jul 2017 10:51:10 PDT by version 0.01 of Braintree SDK Generator
// OrderGetRequest.java
// DO NOT EDIT
// @type request
// @json {"Name":"order.get","Description":"Shows details for an order, by ID.","Parameters":[{"Type":"string","VariableName":"order_id","Description":"The ID of the order for which to show details.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null,"Location":"path"}],"RequestType":null,"ResponseType":{"Type":"Order","VariableName":"","Description":"An order transaction.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},"ContentType":"application/json","HttpMethod":"GET","Path":"/v1/payments/orders/{order_id}","ExpectedStatusCode":200}

package com.paypal.sdk.payments.request;

import com.braintreepayments.http.*;
import com.paypal.sdk.payments.object.*;
import java.util.List;


/**
 * Shows details for an order, by ID.
 */
public class OrderGetRequest extends HttpRequest<Order> {

    public OrderGetRequest(String orderId) {
        super("/v1/payments/orders/{order_id}?"
            .replace("{order_id}", String.valueOf(orderId)), "GET", Order.class);
    }
}
