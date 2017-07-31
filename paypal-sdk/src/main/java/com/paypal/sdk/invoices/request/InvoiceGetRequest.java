// This class was generated on Sun, 30 Jul 2017 11:04:05 PDT by version 0.1 of Braintree SDK Generator
// InvoiceGetRequest.java
// DO NOT EDIT
// @type request
// @json {"Name":"invoice.get","Description":"Shows details for an invoice, by ID.","QueryParameters":[],"HeaderParameters":[],"FormParameters":[],"PathParameters":[{"Type":"string","VariableName":"invoice_id","Description":"The ID of the invoice for which to show details.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null}],"RequestType":null,"ResponseType":{"Type":"Invoice","VariableName":"","Description":"Invoice details.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},"ContentType":"application/json","HttpMethod":"GET","Path":"/v1/invoicing/invoices/{invoice_id}","ExpectedStatusCode":200}

package com.paypal.sdk.invoices.request;

import com.braintreepayments.http.*;
import com.paypal.sdk.invoices.object.*;
import java.util.*;
import java.util.List;


/**
 * Shows details for an invoice, by ID.
 */
public class InvoiceGetRequest extends HttpRequest<Invoice> {

    public InvoiceGetRequest(String invoiceId) {
        super("/v1/invoicing/invoices/{invoice_id}?"
            .replace("{invoice_id}", String.valueOf(invoiceId)), "GET", Invoice.class);
        header("Content-Type", "application/json");
    }
    
}
