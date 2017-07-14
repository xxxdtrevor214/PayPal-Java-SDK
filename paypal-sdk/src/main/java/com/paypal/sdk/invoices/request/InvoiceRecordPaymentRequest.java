// This class was generated on Thu, 13 Jul 2017 09:07:17 PDT by version 0.01 of Braintree SDK Generator
// InvoiceRecordPaymentRequest.java
// DO NOT EDIT
// @type request
// @json {"Name":"invoice.record-payment","Description":"Marks the status of an invoice, by ID, as paid. Include a payment detail object that defines the payment method and other details in the JSON request body.","Parameters":[{"Type":"string","VariableName":"invoice_id","Description":"The ID of the invoice to mark as paid.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null,"Location":"path"}],"RequestType":{"Type":"Payment Detail","VariableName":"body","Description":"Payment details.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},"ResponseType":null,"ContentType":"application/json","HttpMethod":"POST","Path":"/v1/invoicing/invoices/{invoice_id}/record-payment","ExpectedStatusCode":200}

package com.paypal.sdk.invoices.request;

import com.braintreepayments.http.*;
import com.paypal.sdk.invoices.object.*;
import java.util.List;


/**
 * Marks the status of an invoice, by ID, as paid. Include a payment detail object that defines the payment method and other details in the JSON request body.
 */
public class InvoiceRecordPaymentRequest extends HttpRequest<Void> {

    public InvoiceRecordPaymentRequest(String invoiceId) {
        super("/v1/invoicing/invoices/{invoice_id}/record-payment?"
            .replace("{invoice_id}", String.valueOf(invoiceId)), "POST", Void.class);
    }

    public InvoiceRecordPaymentRequest body(PaymentDetail body) {
        super.body(body);
        header("Content-Type", "application/json");
        return this;
    }
}
