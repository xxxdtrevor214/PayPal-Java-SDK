// This class was generated on Mon, 31 Jul 2017 18:27:14 UTC by version 0.1 of Braintree SDK Generator
// PaymentExecuteRequest.java
// DO NOT EDIT
// @type request
// @json {"Name":"payment.execute","Description":"Executes a PayPal payment that the customer has approved. You can optionally update one or more transactions when you execute the payment.\u003cbr/\u003e\u003cbr/\u003eA successful request returns the HTTP `200 OK` status code and a JSON response body that shows details for the executed payment.\u003cblockquote\u003e\u003cstrong\u003eImportant:\u003c/strong\u003e This call works only after a customer has approved the payment. For more information, learn about [PayPal payments](/docs/integration/direct/payments/paypal-payments/).\u003c/blockquote\u003e","QueryParameters":[],"HeaderParameters":[],"FormParameters":[],"PathParameters":[{"Type":"string","VariableName":"payment_id","Description":"The ID of the payment to execute.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null}],"RequestType":{"Type":"Payment Execution","VariableName":"body","Description":"Executes a PayPal account-based payment with the `payer_id` obtained from the web approval URL.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},"ResponseType":{"Type":"Payment","VariableName":"","Description":"A payment. Use this object to create, process, and manage payments.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},"ContentType":"application/json","HttpMethod":"POST","Path":"/v1/payments/payment/{payment_id}/execute","ExpectedStatusCode":200}

package com.paypal.sdk.payments.request;

import com.braintreepayments.http.*;
import com.paypal.sdk.payments.object.*;
import java.util.*;
import java.util.List;


/**
 * Executes a PayPal payment that the customer has approved. You can optionally update one or more transactions when you execute the payment.<br/><br/>A successful request returns the HTTP `200 OK` status code and a JSON response body that shows details for the executed payment.<blockquote><strong>Important:</strong> This call works only after a customer has approved the payment. For more information, learn about [PayPal payments](/docs/integration/direct/payments/paypal-payments/).</blockquote>
 */
public class PaymentExecuteRequest extends HttpRequest<Payment> {

    public PaymentExecuteRequest(String paymentId) {
        super("/v1/payments/payment/{payment_id}/execute?"
            .replace("{payment_id}", String.valueOf(paymentId)), "POST", Payment.class);
        header("Content-Type", "application/json");
    }
    

    public PaymentExecuteRequest requestBody(PaymentExecution body) {
        super.requestBody(body);
        return this;
    }
}
