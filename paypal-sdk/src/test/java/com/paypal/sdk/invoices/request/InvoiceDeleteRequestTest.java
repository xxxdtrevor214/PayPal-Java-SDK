// This class was generated on Thu, 13 Jul 2017 09:07:17 PDT by version 0.01 of Braintree SDK Generator
// InvoiceDeleteRequestTest.java
// DO NOT EDIT
// @type request
// @json {"Name":"invoice.delete","Description":"Deletes a draft invoice, by ID. Deletes invoices in the draft state only. For invoices that have already been sent, you can [cancel the invoice](/docs/api/invoicing/#invoices_cancel). After you delete a draft invoice, you can no longer use it or show its details. However, you can reuse its invoice number.","Parameters":[{"Type":"string","VariableName":"invoice_id","Description":"The ID of the invoice to delete.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null,"Location":"path"}],"RequestType":null,"ResponseType":null,"ContentType":"application/json","HttpMethod":"DELETE","Path":"/v1/invoicing/invoices/{invoice_id}","ExpectedStatusCode":200,"FileSuffix":"Test"}

package com.paypal.sdk.invoices.request;

import com.braintreepayments.http.HttpResponse;
import com.paypal.sdk.TestHarness;
import com.paypal.sdk.invoices.Invoice;
import com.paypal.sdk.invoices.InvoiceDeleteRequest;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;

public class InvoiceDeleteRequestTest extends TestHarness {

    @Test
    public void testInvoiceDeleteRequest() throws IOException {
        HttpResponse<Invoice> createResponse = TestUtil.createInvoice(client());

        InvoiceDeleteRequest request = new InvoiceDeleteRequest(createResponse.result().id());

        HttpResponse<Void> response = client().execute(request);
        assertEquals(response.statusCode(), 204);
    }
}
