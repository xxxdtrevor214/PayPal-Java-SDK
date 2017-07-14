// This class was generated on Thu, 13 Jul 2017 09:07:17 PDT by version 0.01 of Braintree SDK Generator
// InvoiceCancelRequest.java
// DO NOT EDIT
// @type request
// @json {"Name":"invoice.cancel","Description":"Cancels a sent invoice, by ID, and, optionally, sends a notification about the cancellation to the payer, merchant, and Cc: emails.","Parameters":[{"Type":"string","VariableName":"invoice_id","Description":"The ID of the invoice to cancel.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null,"Location":"path"}],"RequestType":{"Type":"Cancel Notification","VariableName":"body","Description":"Cancels an email or SMS notification.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},"ResponseType":null,"ContentType":"application/json","HttpMethod":"POST","Path":"/v1/invoicing/invoices/{invoice_id}/cancel","ExpectedStatusCode":200}

package com.paypal.sdk.invoices.request;

import com.braintreepayments.http.*;
import com.paypal.sdk.invoices.object.*;
import java.util.List;


/**
 * Cancels a sent invoice, by ID, and, optionally, sends a notification about the cancellation to the payer, merchant, and Cc: emails.
 */
public class InvoiceCancelRequest extends HttpRequest<Void> {

    public InvoiceCancelRequest(String invoiceId) {
        super("/v1/invoicing/invoices/{invoice_id}/cancel?"
            .replace("{invoice_id}", String.valueOf(invoiceId)), "POST", Void.class);
    }

    public InvoiceCancelRequest body(CancelNotification body) {
        super.body(body);
        header("Content-Type", "application/json");
        return this;
    }
}
