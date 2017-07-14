// This class was generated on Thu, 13 Jul 2017 09:07:17 PDT by version 0.01 of Braintree SDK Generator
// InvoiceRecordRefundRequest.java
// DO NOT EDIT
// @type request
// @json {"Name":"invoice.record-refund","Description":"Marks the status of an invoice, by ID, as refunded. In the JSON request body, include a payment detail object that defines the payment method and other details.","Parameters":[{"Type":"string","VariableName":"invoice_id","Description":"The ID of the invoice to mark as refunded.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null,"Location":"path"}],"RequestType":{"Type":"Refund Detail","VariableName":"body","Description":"Invoicing refund details.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},"ResponseType":null,"ContentType":"application/json","HttpMethod":"POST","Path":"/v1/invoicing/invoices/{invoice_id}/record-refund","ExpectedStatusCode":200}

package com.paypal.sdk.invoices.request;

import com.braintreepayments.http.*;
import com.paypal.sdk.invoices.object.*;
import java.util.List;


/**
 * Marks the status of an invoice, by ID, as refunded. In the JSON request body, include a payment detail object that defines the payment method and other details.
 */
public class InvoiceRecordRefundRequest extends HttpRequest<Void> {

    public InvoiceRecordRefundRequest(String invoiceId) {
        super("/v1/invoicing/invoices/{invoice_id}/record-refund?"
            .replace("{invoice_id}", String.valueOf(invoiceId)), "POST", Void.class);
    }

    public InvoiceRecordRefundRequest body(RefundDetail body) {
        super.body(body);
        header("Content-Type", "application/json");
        return this;
    }
}
