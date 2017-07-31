// This class was generated on Mon, 31 Jul 2017 18:27:14 UTC by version 0.1 of Braintree SDK Generator
// PaymentUpdateRequest.java
// DO NOT EDIT
// @type request
// @json {"Name":"payment.update","Description":"Partially updates a payment, by ID. You can update the amount, shipping address, invoice ID, and custom data. You cannot update a payment after the payment executes.\u003cbr/\u003e\u003cbr/\u003eA successful request returns the HTTP `200 OK` status code and a JSON response body that shows payment details.","QueryParameters":[],"HeaderParameters":[],"FormParameters":[],"PathParameters":[{"Type":"string","VariableName":"payment_id","Description":"The ID of the payment to update.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null}],"RequestType":{"Type":"JSON Patch","VariableName":"body","Description":"A JSON patch request.","IsArray":true,"ReadOnly":false,"Required":false,"Properties":null},"ResponseType":null,"ContentType":"application/json","HttpMethod":"PATCH","Path":"/v1/payments/payment/{payment_id}","ExpectedStatusCode":200}

package com.paypal.sdk.payments.request;

import com.braintreepayments.http.*;
import com.paypal.sdk.payments.object.*;
import java.util.*;
import java.util.List;


/**
 * Partially updates a payment, by ID. You can update the amount, shipping address, invoice ID, and custom data. You cannot update a payment after the payment executes.<br/><br/>A successful request returns the HTTP `200 OK` status code and a JSON response body that shows payment details.
 */
public class PaymentUpdateRequest extends HttpRequest<Void> {

    public PaymentUpdateRequest(String paymentId) {
        super("/v1/payments/payment/{payment_id}?"
            .replace("{payment_id}", String.valueOf(paymentId)), "PATCH", Void.class);
        header("Content-Type", "application/json");
    }
    

    public PaymentUpdateRequest requestBody(List<JSONPatch> body) {
        super.requestBody(body);
        return this;
    }
}
