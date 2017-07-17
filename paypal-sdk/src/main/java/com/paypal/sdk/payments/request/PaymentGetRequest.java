// This class was generated on Mon, 17 Jul 2017 10:51:10 PDT by version 0.01 of Braintree SDK Generator
// PaymentGetRequest.java
// DO NOT EDIT
// @type request
// @json {"Name":"payment.get","Description":"Shows details for a payment, by ID, that has yet to complete. For example, shows details for a payment that was created, approved, or failed.","Parameters":[{"Type":"string","VariableName":"payment_id","Description":"The ID of the payment for which to show details.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null,"Location":"path"}],"RequestType":null,"ResponseType":{"Type":"Payment","VariableName":"","Description":"A payment. Use this object to create, process, and manage payments.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},"ContentType":"application/json","HttpMethod":"GET","Path":"/v1/payments/payment/{payment_id}","ExpectedStatusCode":200}

package com.paypal.sdk.payments.request;

import com.braintreepayments.http.*;
import com.paypal.sdk.payments.object.*;
import java.util.List;


/**
 * Shows details for a payment, by ID, that has yet to complete. For example, shows details for a payment that was created, approved, or failed.
 */
public class PaymentGetRequest extends HttpRequest<Payment> {

    public PaymentGetRequest(String paymentId) {
        super("/v1/payments/payment/{payment_id}?"
            .replace("{payment_id}", String.valueOf(paymentId)), "GET", Payment.class);
    }
}
