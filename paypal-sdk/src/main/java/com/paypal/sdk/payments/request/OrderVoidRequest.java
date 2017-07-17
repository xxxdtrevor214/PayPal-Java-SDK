// This class was generated on Mon, 17 Jul 2017 10:51:10 PDT by version 0.01 of Braintree SDK Generator
// OrderVoidRequest.java
// DO NOT EDIT
// @type request
// @json {"Name":"order.void","Description":"Voids, or cancels, an order, by ID. You cannot void an order if the payment has already been partially or fully captured.","Parameters":[{"Type":"string","VariableName":"order_id","Description":"The ID of the order to void.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null,"Location":"path"}],"RequestType":null,"ResponseType":{"Type":"Order","VariableName":"","Description":"An order transaction.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},"ContentType":"application/json","HttpMethod":"POST","Path":"/v1/payments/orders/{order_id}/do-void","ExpectedStatusCode":200}

package com.paypal.sdk.payments.request;

import com.braintreepayments.http.*;
import com.paypal.sdk.payments.object.*;
import java.util.List;


/**
 * Voids, or cancels, an order, by ID. You cannot void an order if the payment has already been partially or fully captured.
 */
public class OrderVoidRequest extends HttpRequest<Order> {

    public OrderVoidRequest(String orderId) {
        super("/v1/payments/orders/{order_id}/do-void?"
            .replace("{order_id}", String.valueOf(orderId)), "POST", Order.class);
    }
}
