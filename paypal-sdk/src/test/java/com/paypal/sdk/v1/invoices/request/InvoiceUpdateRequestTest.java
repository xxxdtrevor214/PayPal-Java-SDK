// This class was generated on Thu, 13 Jul 2017 09:07:17 PDT by version 0.01 of Braintree SDK Generator
// InvoiceUpdateRequestTest.java
// DO NOT EDIT
// @type request
// @json {"Name":"invoice.update","Description":"Fully updates an invoice, by ID. In the JSON request body, include a complete `invoice` object. This call does not support partial updates.","Parameters":[{"Type":"string","VariableName":"invoice_id","Description":"The ID of the invoice to update.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null,"Location":"path"},{"Type":"boolean","VariableName":"notify_merchant","Description":"Indicates whether to send the invoice update notification to the merchant. Default is `true`.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null,"Location":"query"}],"RequestType":{"Type":"Invoice","VariableName":"body","Description":"Invoice details.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},"ResponseType":{"Type":"Invoice","VariableName":"","Description":"Invoice details.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},"ContentType":"application/json","HttpMethod":"PUT","Path":"/v1/invoicing/invoices/{invoice_id}","ExpectedStatusCode":200,"FileSuffix":"Test"}

package com.paypal.sdk.v1.invoices.request;

import com.braintreepayments.http.HttpResponse;
import com.paypal.sdk.TestHarness;
import com.paypal.sdk.v1.invoices.Invoice;
import com.paypal.sdk.v1.invoices.InvoiceUpdateRequest;
import com.paypal.sdk.v1.invoices.MerchantInformation;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

public class InvoiceUpdateRequestTest extends TestHarness {

    @Test
    public void testInvoiceUpdateRequest() throws IOException {
        HttpResponse<Invoice> createResponse = TestUtil.createInvoice(client());

        InvoiceUpdateRequest updateRequest = new InvoiceUpdateRequest(createResponse.result().id()).notifyMerchant(true);
        updateRequest.requestBody(new Invoice()
                .merchantInfo(new MerchantInformation().email("team-dx-clients-facilitator@getbraintree.com"))
                .terms("Upon receipt of this invoice, Steve owes Sasha a soda."));

        HttpResponse<Invoice> response = client().execute(updateRequest);
        assertEquals(response.statusCode(), 200);
        assertNotNull(response.result());
    }
}
