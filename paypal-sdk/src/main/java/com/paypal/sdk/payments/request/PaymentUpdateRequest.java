// This class was generated on Mon, 03 Jul 2017 13:56:47 PDT by version 0.01 of Braintree SDK Generator
// PaymentUpdateRequest.java
// DO NOT EDIT
// @type request
// @json {"Name":"payment.update","Description":"Partially updates a payment, by ID. You can update the amount, shipping address, invoice ID, and custom data. You cannot update a payment after the payment executes.","Parameters":[{"Type":"string","VariableName":"payment_id","Description":"The ID of the payment to update.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null,"Location":"path"}],"RequestType":{"Type":"JSON Patch","VariableName":"body","Description":"A JSON patch request.","IsArray":true,"ReadOnly":false,"Required":false,"Properties":null},"ResponseType":null,"ContentType":"application/json","HttpMethod":"PATCH","Path":"/v1/payments/payment/{payment_id}","ExpectedStatusCode":200}

package com.paypal.sdk.payments.request;

import com.braintreepayments.http.*;
import com.paypal.sdk.payments.object.*;
import java.util.List;


/**
 * Partially updates a payment, by ID. You can update the amount, shipping address, invoice ID, and custom data. You cannot update a payment after the payment executes.
 */
public class PaymentUpdateRequest extends HttpRequest<Void> {

		public PaymentUpdateRequest(String paymentId) {
				super("/v1/payments/payment/{payment_id}?"
                    .replace("{payment_id}", String.valueOf(paymentId)), "PATCH", Void.class);
		}

    public PaymentUpdateRequest body(List<JSONPatch> body) {
        super.body(body);
        header("Content-Type", "application/json");
        return this;
    }
}
