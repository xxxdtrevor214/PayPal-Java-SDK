// This class was generated on Thu, 13 Jul 2017 09:07:17 PDT by version 0.01 of Braintree SDK Generator
// InvoiceRecordRefundRequestTest.java
// DO NOT EDIT
// @type request
// @json {"Name":"invoice.record-refund","Description":"Marks the status of an invoice, by ID, as refunded. In the JSON request body, include a payment detail object that defines the payment method and other details.","Parameters":[{"Type":"string","VariableName":"invoice_id","Description":"The ID of the invoice to mark as refunded.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null,"Location":"path"}],"RequestType":{"Type":"Refund Detail","VariableName":"body","Description":"Invoicing refund details.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},"ResponseType":null,"ContentType":"application/json","HttpMethod":"POST","Path":"/v1/invoicing/invoices/{invoice_id}/record-refund","ExpectedStatusCode":200,"FileSuffix":"Test"}

package com.paypal.sdk.v1.invoices.request;

import com.paypal.sdk.TestHarness;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;

public class InvoiceRecordRefundRequestTest extends TestHarness {

    @Test
    public void testInvoiceRecordRefundRequest() throws IOException {
        TestUtil.ResponseAndID responseAndID = TestUtil.createInvoiceRefund(client());
        assertEquals(responseAndID.response.statusCode(), 204);
    }
}
