// This class was generated on Thu, 13 Jul 2017 09:07:17 PDT by version 0.01 of Braintree SDK Generator
// InvoiceNextInvoiceNumberRequestTest.java
// DO NOT EDIT
// @type request
// @json {"Name":"invoice.next_invoice_number","Description":"Generates the next invoice number that is available to the merchant.","Parameters":[],"RequestType":null,"ResponseType":{"Type":"Invoice number","VariableName":"","Description":"","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},"ContentType":"application/json","HttpMethod":"POST","Path":"/v1/invoicing/invoices/next-invoice-number","ExpectedStatusCode":200,"FileSuffix":"Test"}

package com.paypal.sdk.invoices.request;

import com.braintreepayments.http.HttpResponse;
import com.paypal.sdk.TestHarness;
import com.paypal.sdk.invoices.InvoiceNextInvoiceNumberRequest;
import com.paypal.sdk.invoices.InvoiceNumber;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

public class InvoiceNextInvoiceNumberRequestTest extends TestHarness {

    @Test
    public void testInvoiceNextInvoiceNumberRequest() throws IOException {
        InvoiceNextInvoiceNumberRequest request = new InvoiceNextInvoiceNumberRequest();

        HttpResponse<InvoiceNumber> response = client().execute(request);
        assertEquals(200, response.statusCode());
        assertNotNull(response.result().number());
    }
}
