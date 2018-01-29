// This class was generated on Thu, 13 Jul 2017 09:07:17 PDT by version 0.01 of Braintree SDK Generator
// InvoiceGetRequestTest.java
// DO NOT EDIT
// @type request
// @json {"Name":"invoice.get","Description":"Shows details for an invoice, by ID.","Parameters":[{"Type":"string","VariableName":"invoice_id","Description":"The ID of the invoice for which to show details.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null,"Location":"path"}],"RequestType":null,"ResponseType":{"Type":"Invoice","VariableName":"","Description":"Invoice details.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},"ContentType":"application/json","HttpMethod":"GET","Path":"/v1/invoicing/invoices/{invoice_id}","ExpectedStatusCode":200,"FileSuffix":"Test"}

package com.paypal.sdk.v1.invoices.request;

import com.braintreepayments.http.HttpResponse;
import com.paypal.sdk.TestHarness;
import com.paypal.sdk.v1.invoices.Invoice;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

public class InvoiceGetRequestTest extends TestHarness {

    @Test
    public void testInvoiceGetRequest() throws IOException {
        HttpResponse<Invoice> createResponse = TestUtil.createInvoice(client());
        HttpResponse<Invoice> getResponse = TestUtil.getInvoice(client(), createResponse.result().id());

        assertEquals(getResponse.statusCode(), 200);
        assertNotNull(getResponse.result());
    }
}
