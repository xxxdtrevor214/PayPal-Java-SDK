// This class was generated on Thu, 13 Jul 2017 09:07:17 PDT by version 0.01 of Braintree SDK Generator
// InvoiceRecordPaymentRequestTest.java
// DO NOT EDIT
// @type request
// @json {"Name":"invoice.record-payment","Description":"Marks the status of an invoice, by ID, as paid. Include a payment detail object that defines the payment method and other details in the JSON request body.","Parameters":[{"Type":"string","VariableName":"invoice_id","Description":"The ID of the invoice to mark as paid.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null,"Location":"path"}],"RequestType":{"Type":"Payment Detail","VariableName":"body","Description":"Payment details.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},"ResponseType":null,"ContentType":"application/json","HttpMethod":"POST","Path":"/v1/invoicing/invoices/{invoice_id}/record-payment","ExpectedStatusCode":200,"FileSuffix":"Test"}

package com.paypal.sdk.invoices.request;

import com.braintreepayments.http.HttpResponse;
import com.braintreepayments.http.HttpClient;
import com.paypal.sdk.invoices.object.*;
import com.paypal.sdk.TestHarness;
import java.util.List;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;

public class InvoiceRecordPaymentRequestTest extends TestHarness {

    @Test
    public void testInvoiceRecordPaymentRequest() throws IOException {
        TestUtil.ResponseAndID responseAndID = TestUtil.createInvoicePayment(client());

        assertEquals(responseAndID.response.statusCode(), 204);
    }
}
