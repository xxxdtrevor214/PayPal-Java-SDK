// This class was generated on Thu, 13 Jul 2017 09:07:17 PDT by version 0.01 of Braintree SDK Generator
// InvoiceSendRequestTest.java
// DO NOT EDIT
// @type request
// @json {"Name":"invoice.send","Description":"Sends an invoice, by ID, to a customer.\u003cblockquote\u003e\u003cstrong\u003eNote:\u003c/strong\u003e After you send an invoice, you cannot resend it.\u003c/blockquote\u003e\u003cbr/\u003eOptionally, set the `notify_merchant` query parameter to also send the merchant an invoice update notification. Default is `true`.","Parameters":[{"Type":"string","VariableName":"invoice_id","Description":"The ID of the invoice to send.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null,"Location":"path"},{"Type":"boolean","VariableName":"notify_merchant","Description":"Indicates whether to send the invoice update notification to the merchant. Default is `true`.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null,"Location":"query"}],"RequestType":null,"ResponseType":null,"ContentType":"application/json","HttpMethod":"POST","Path":"/v1/invoicing/invoices/{invoice_id}/send","ExpectedStatusCode":200,"FileSuffix":"Test"}

package com.paypal.sdk.invoices.request;

import com.paypal.sdk.TestHarness;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;

public class InvoiceSendRequestTest extends TestHarness {

    @Test
    public void testInvoiceSendRequest() throws IOException {
        TestUtil.ResponseAndID responseAndID = TestUtil.sendInvoice(client());

        assertEquals(responseAndID.response.statusCode(), 202);
    }
}
