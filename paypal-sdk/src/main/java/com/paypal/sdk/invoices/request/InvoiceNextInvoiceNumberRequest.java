// This class was generated on Thu, 13 Jul 2017 09:07:17 PDT by version 0.01 of Braintree SDK Generator
// InvoiceNextInvoiceNumberRequest.java
// DO NOT EDIT
// @type request
// @json {"Name":"invoice.next_invoice_number","Description":"Generates the next invoice number that is available to the merchant.","Parameters":[],"RequestType":null,"ResponseType":{"Type":"Invoice number","VariableName":"","Description":"","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},"ContentType":"application/json","HttpMethod":"POST","Path":"/v1/invoicing/invoices/next-invoice-number","ExpectedStatusCode":200}

package com.paypal.sdk.invoices.request;

import com.braintreepayments.http.*;
import com.paypal.sdk.invoices.object.*;
import java.util.List;


/**
 * Generates the next invoice number that is available to the merchant.
 */
public class InvoiceNextInvoiceNumberRequest extends HttpRequest<InvoiceNumber> {

    public InvoiceNextInvoiceNumberRequest() {
        super("/v1/invoicing/invoices/next-invoice-number?", "POST", InvoiceNumber.class);
    }
}
