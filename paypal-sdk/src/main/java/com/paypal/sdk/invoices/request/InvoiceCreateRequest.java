// This class was generated on Sun, 30 Jul 2017 11:04:05 PDT by version 0.1 of Braintree SDK Generator
// InvoiceCreateRequest.java
// DO NOT EDIT
// @type request
// @json {"Name":"invoice.create","Description":"Creates a draft invoice. You can optionally create an invoice [template](/docs/api/invoicing/#templates). Then, when you create an invoice from a template, the invoice is populated with the predefined data that the source template contains. To move the invoice from a draft to payable state, you must [send the invoice](/docs/api/invoicing/#invoices_send). In the JSON request body, include invoice details including merchant information. The `invoice` object must include an `items` array.\u003cblockquote\u003e\u003cstrong\u003eNote:\u003c/strong\u003e The merchant specified in an invoice must have a PayPal account in good standing.\u003c/blockquote\u003e","QueryParameters":[],"HeaderParameters":[],"FormParameters":[],"PathParameters":[],"RequestType":{"Type":"Invoice","VariableName":"body","Description":"Invoice details.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},"ResponseType":{"Type":"Invoice","VariableName":"","Description":"Invoice details.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},"ContentType":"application/json","HttpMethod":"POST","Path":"/v1/invoicing/invoices","ExpectedStatusCode":200}

package com.paypal.sdk.invoices.request;

import com.braintreepayments.http.*;
import com.paypal.sdk.invoices.object.*;
import java.util.*;
import java.util.List;


/**
 * Creates a draft invoice. You can optionally create an invoice [template](/docs/api/invoicing/#templates). Then, when you create an invoice from a template, the invoice is populated with the predefined data that the source template contains. To move the invoice from a draft to payable state, you must [send the invoice](/docs/api/invoicing/#invoices_send). In the JSON request body, include invoice details including merchant information. The `invoice` object must include an `items` array.<blockquote><strong>Note:</strong> The merchant specified in an invoice must have a PayPal account in good standing.</blockquote>
 */
public class InvoiceCreateRequest extends HttpRequest<Invoice> {

    public InvoiceCreateRequest() {
        super("/v1/invoicing/invoices?", "POST", Invoice.class);
        header("Content-Type", "application/json");
    }
    

    public InvoiceCreateRequest requestBody(Invoice body) {
        super.requestBody(body);
        return this;
    }
}
