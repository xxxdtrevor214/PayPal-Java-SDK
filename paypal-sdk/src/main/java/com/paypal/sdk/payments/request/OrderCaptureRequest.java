// This class was generated on Mon, 31 Jul 2017 18:27:14 UTC by version 0.1 of Braintree SDK Generator
// OrderCaptureRequest.java
// DO NOT EDIT
// @type request
// @json {"Name":"order.capture","Description":"Captures a payment for an order, by ID. To use this call, the original payment call must specify an `order` intent. In the JSON request body, include the payment amount and indicate whether this capture is the final capture for the authorization.\u003cbr/\u003e\u003cbr/\u003eA successful request returns the HTTP `201 Created` status code and a JSON response body that shows details for the captured order.","QueryParameters":[],"HeaderParameters":[],"FormParameters":[],"PathParameters":[{"Type":"string","VariableName":"order_id","Description":"The ID of the order to capture.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null}],"RequestType":{"Type":"Capture","VariableName":"body","Description":"A capture transaction.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},"ResponseType":{"Type":"Capture","VariableName":"","Description":"A capture transaction.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},"ContentType":"application/json","HttpMethod":"POST","Path":"/v1/payments/orders/{order_id}/capture","ExpectedStatusCode":200}

package com.paypal.sdk.payments.request;

import com.braintreepayments.http.*;
import com.paypal.sdk.payments.object.*;
import java.util.*;
import java.util.List;


/**
 * Captures a payment for an order, by ID. To use this call, the original payment call must specify an `order` intent. In the JSON request body, include the payment amount and indicate whether this capture is the final capture for the authorization.<br/><br/>A successful request returns the HTTP `201 Created` status code and a JSON response body that shows details for the captured order.
 */
public class OrderCaptureRequest extends HttpRequest<Capture> {

    public OrderCaptureRequest(String orderId) {
        super("/v1/payments/orders/{order_id}/capture?"
            .replace("{order_id}", String.valueOf(orderId)), "POST", Capture.class);
        header("Content-Type", "application/json");
    }
    

    public OrderCaptureRequest requestBody(Capture body) {
        super.requestBody(body);
        return this;
    }
}
