// This class was generated on Thu, 13 Jul 2017 09:07:17 PDT by version 0.01 of Braintree SDK Generator
// InvoiceGetRequest.java
// DO NOT EDIT
// @type request
// @json {"Name":"invoice.get","Description":"Shows details for an invoice, by ID.","Parameters":[{"Type":"string","VariableName":"invoice_id","Description":"The ID of the invoice for which to show details.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null,"Location":"path"}],"RequestType":null,"ResponseType":{"Type":"Invoice","VariableName":"","Description":"Invoice details.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},"ContentType":"application/json","HttpMethod":"GET","Path":"/v1/invoicing/invoices/{invoice_id}","ExpectedStatusCode":200}

package com.paypal.sdk.invoices.request;

import com.braintreepayments.http.*;
import com.paypal.sdk.invoices.object.*;
import java.util.List;


/**
 * Shows details for an invoice, by ID.
 */
public class InvoiceGetRequest extends HttpRequest<Invoice> {

    public InvoiceGetRequest(String invoiceId) {
        super("/v1/invoicing/invoices/{invoice_id}?"
            .replace("{invoice_id}", String.valueOf(invoiceId)), "GET", Invoice.class);
    }
}
