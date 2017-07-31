// This class was generated on Sun, 30 Jul 2017 11:04:05 PDT by version 0.1 of Braintree SDK Generator
// InvoiceDeleteRequest.java
// DO NOT EDIT
// @type request
// @json {"Name":"invoice.delete","Description":"Deletes a draft invoice, by ID. Deletes invoices in the draft state only. For invoices that have already been sent, you can [cancel the invoice](/docs/api/invoicing/#invoices_cancel). After you delete a draft invoice, you can no longer use it or show its details. However, you can reuse its invoice number.","QueryParameters":[],"HeaderParameters":[],"FormParameters":[],"PathParameters":[{"Type":"string","VariableName":"invoice_id","Description":"The ID of the invoice to delete.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null}],"RequestType":null,"ResponseType":null,"ContentType":"application/json","HttpMethod":"DELETE","Path":"/v1/invoicing/invoices/{invoice_id}","ExpectedStatusCode":200}

package com.paypal.sdk.invoices.request;

import com.braintreepayments.http.*;
import com.paypal.sdk.invoices.object.*;
import java.util.*;
import java.util.List;


/**
 * Deletes a draft invoice, by ID. Deletes invoices in the draft state only. For invoices that have already been sent, you can [cancel the invoice](/docs/api/invoicing/#invoices_cancel). After you delete a draft invoice, you can no longer use it or show its details. However, you can reuse its invoice number.
 */
public class InvoiceDeleteRequest extends HttpRequest<Void> {

    public InvoiceDeleteRequest(String invoiceId) {
        super("/v1/invoicing/invoices/{invoice_id}?"
            .replace("{invoice_id}", String.valueOf(invoiceId)), "DELETE", Void.class);
        header("Content-Type", "application/json");
    }
    
}
