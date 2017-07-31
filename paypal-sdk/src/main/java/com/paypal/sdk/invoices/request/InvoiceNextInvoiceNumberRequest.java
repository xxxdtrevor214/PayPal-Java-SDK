// This class was generated on Sun, 30 Jul 2017 11:04:05 PDT by version 0.1 of Braintree SDK Generator
// InvoiceNextInvoiceNumberRequest.java
// DO NOT EDIT
// @type request
// @json {"Name":"invoice.next_invoice_number","Description":"Generates the next invoice number that is available to the merchant.","QueryParameters":[],"HeaderParameters":[],"FormParameters":[],"PathParameters":[],"RequestType":null,"ResponseType":{"Type":"Invoice number","VariableName":"","Description":"","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},"ContentType":"application/json","HttpMethod":"POST","Path":"/v1/invoicing/invoices/next-invoice-number","ExpectedStatusCode":200}

package com.paypal.sdk.invoices.request;

import com.braintreepayments.http.*;
import com.paypal.sdk.invoices.object.*;
import java.util.*;
import java.util.List;


/**
 * Generates the next invoice number that is available to the merchant.
 */
public class InvoiceNextInvoiceNumberRequest extends HttpRequest<InvoiceNumber> {

    public InvoiceNextInvoiceNumberRequest() {
        super("/v1/invoicing/invoices/next-invoice-number?", "POST", InvoiceNumber.class);
        header("Content-Type", "application/json");
    }
    
}
