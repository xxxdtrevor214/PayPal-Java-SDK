// This class was generated on Mon, 17 Jul 2017 10:41:00 PDT by version 0.01 of Braintree SDK Generator
// InvoiceRemindRequest.java
// DO NOT EDIT
// @type request
// @json {"Name":"invoice.remind","Description":"Sends a reminder to the payer about an invoice, by ID. In the JSON request body, include a `notification` object that defines the subject of the reminder and other details.","Parameters":[{"Type":"string","VariableName":"invoice_id","Description":"The ID of the invoice for which to send a reminder.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null,"Location":"path"}],"RequestType":{"Type":"Notification","VariableName":"body","Description":"The email or SMS notification.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},"ResponseType":null,"ContentType":"application/json","HttpMethod":"POST","Path":"/v1/invoicing/invoices/{invoice_id}/remind","ExpectedStatusCode":200}

package com.paypal.sdk.invoices.request;

import com.braintreepayments.http.*;
import com.paypal.sdk.invoices.object.*;
import java.util.List;


/**
 * Sends a reminder to the payer about an invoice, by ID. In the JSON request body, include a `notification` object that defines the subject of the reminder and other details.
 */
public class InvoiceRemindRequest extends HttpRequest<Void> {

    public InvoiceRemindRequest(String invoiceId) {
        super("/v1/invoicing/invoices/{invoice_id}/remind?"
            .replace("{invoice_id}", String.valueOf(invoiceId)), "POST", Void.class);
    }

    public InvoiceRemindRequest requestBody(Notification body) {
        super.body(body);
        header("Content-Type", "application/json");
        return this;
    }
}
