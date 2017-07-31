// This class was generated on Sun, 30 Jul 2017 11:04:05 PDT by version 0.1 of Braintree SDK Generator
// InvoiceCancelRequest.java
// DO NOT EDIT
// @type request
// @json {"Name":"invoice.cancel","Description":"Cancels a sent invoice, by ID, and, optionally, sends a notification about the cancellation to the payer, merchant, and Cc: emails.","QueryParameters":[],"HeaderParameters":[],"FormParameters":[],"PathParameters":[{"Type":"string","VariableName":"invoice_id","Description":"The ID of the invoice to cancel.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null}],"RequestType":{"Type":"Cancel Notification","VariableName":"body","Description":"Cancels an email or SMS notification.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},"ResponseType":null,"ContentType":"application/json","HttpMethod":"POST","Path":"/v1/invoicing/invoices/{invoice_id}/cancel","ExpectedStatusCode":200}

package com.paypal.sdk.invoices.request;

import com.braintreepayments.http.*;
import com.paypal.sdk.invoices.object.*;
import java.util.*;
import java.util.List;


/**
 * Cancels a sent invoice, by ID, and, optionally, sends a notification about the cancellation to the payer, merchant, and Cc: emails.
 */
public class InvoiceCancelRequest extends HttpRequest<Void> {

    public InvoiceCancelRequest(String invoiceId) {
        super("/v1/invoicing/invoices/{invoice_id}/cancel?"
            .replace("{invoice_id}", String.valueOf(invoiceId)), "POST", Void.class);
        header("Content-Type", "application/json");
    }
    

    public InvoiceCancelRequest requestBody(CancelNotification body) {
        super.requestBody(body);
        return this;
    }
}
