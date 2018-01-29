// This class was generated on Thu, 13 Jul 2017 09:07:17 PDT by version 0.01 of Braintree SDK Generator
// InvoiceCreateRequestTest.java
// DO NOT EDIT
// @type request
// @json {"Name":"invoice.create","Description":"Creates a draft invoice. You can optionally create an invoice [template](/docs/api/invoicing/#templates). Then, when you create an invoice from a template, the invoice is populated with the predefined data that the source template contains. To move the invoice from a draft to payable state, you must [send the invoice](/docs/api/invoicing/#invoices_send). In the JSON request body, include invoice details including merchant information. The `invoice` object must include an `items` array.\u003cblockquote\u003e\u003cstrong\u003eNote:\u003c/strong\u003e The merchant specified in an invoice must have a PayPal account in good standing.\u003c/blockquote\u003e","Parameters":[],"RequestType":{"Type":"Invoice","VariableName":"body","Description":"Invoice details.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},"ResponseType":{"Type":"Invoice","VariableName":"","Description":"Invoice details.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},"ContentType":"application/json","HttpMethod":"POST","Path":"/v1/invoicing/invoices","ExpectedStatusCode":200,"FileSuffix":"Test"}

package com.paypal.sdk.v1.invoices.request;

import com.braintreepayments.http.HttpResponse;
import com.paypal.sdk.TestHarness;
import com.paypal.sdk.v1.invoices.Invoice;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

public class InvoiceCreateRequestTest extends TestHarness {

    @Test
    public void testInvoiceCreateRequest() throws IOException {
        HttpResponse<Invoice> response = TestUtil.createInvoice(client());

        assertEquals(response.statusCode(), 201);
        assertNotNull(response.result());
    }
}
