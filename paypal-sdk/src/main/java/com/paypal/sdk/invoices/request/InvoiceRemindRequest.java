// This class was generated on Sun, 30 Jul 2017 11:04:05 PDT by version 0.1 of Braintree SDK Generator
// InvoiceRemindRequest.java
// DO NOT EDIT
// @type request
// @json {"Name":"invoice.remind","Description":"Sends a reminder to the payer about an invoice, by ID. In the JSON request body, include a `notification` object that defines the subject of the reminder and other details.","QueryParameters":[],"HeaderParameters":[],"FormParameters":[],"PathParameters":[{"Type":"string","VariableName":"invoice_id","Description":"The ID of the invoice for which to send a reminder.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null}],"RequestType":{"Type":"Notification","VariableName":"body","Description":"The email or SMS notification.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},"ResponseType":null,"ContentType":"application/json","HttpMethod":"POST","Path":"/v1/invoicing/invoices/{invoice_id}/remind","ExpectedStatusCode":200}

package com.paypal.sdk.invoices.request;

import com.braintreepayments.http.*;
import com.paypal.sdk.invoices.object.*;
import java.util.*;
import java.util.List;


/**
 * Sends a reminder to the payer about an invoice, by ID. In the JSON request body, include a `notification` object that defines the subject of the reminder and other details.
 */
public class InvoiceRemindRequest extends HttpRequest<Void> {

    public InvoiceRemindRequest(String invoiceId) {
        super("/v1/invoicing/invoices/{invoice_id}/remind?"
            .replace("{invoice_id}", String.valueOf(invoiceId)), "POST", Void.class);
        header("Content-Type", "application/json");
    }
    

    public InvoiceRemindRequest requestBody(Notification body) {
        super.requestBody(body);
        return this;
    }
}
