// This class was generated on Thu, 13 Jul 2017 09:07:17 PDT by version 0.01 of Braintree SDK Generator
// InvoiceRemindRequestTest.java
// DO NOT EDIT
// @type request
// @json {"Name":"invoice.remind","Description":"Sends a reminder to the payer about an invoice, by ID. In the JSON request body, include a `notification` object that defines the subject of the reminder and other details.","Parameters":[{"Type":"string","VariableName":"invoice_id","Description":"The ID of the invoice for which to send a reminder.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null,"Location":"path"}],"RequestType":{"Type":"Notification","VariableName":"body","Description":"The email or SMS notification.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},"ResponseType":null,"ContentType":"application/json","HttpMethod":"POST","Path":"/v1/invoicing/invoices/{invoice_id}/remind","ExpectedStatusCode":200,"FileSuffix":"Test"}

package com.paypal.sdk.invoices.request;

import com.braintreepayments.http.HttpRequest;
import com.braintreepayments.http.HttpResponse;
import com.braintreepayments.http.HttpClient;
import com.paypal.sdk.invoices.object.*;
import com.paypal.sdk.TestHarness;
import java.util.List;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;

public class InvoiceRemindRequestTest extends TestHarness {

    @Test
    public void testInvoiceRemindRequest() throws IOException {
        TestUtil.ResponseAndID responseAndID = TestUtil.sendInvoice(client());
        assertEquals(responseAndID.response.statusCode(), 202);

        InvoiceRemindRequest remindRequest = new InvoiceRemindRequest(responseAndID.id);
        remindRequest.body(new Notification()
                .subject("Past due")
                .note("Please pay soon")
                .sendToMerchant(true));

        HttpResponse<Void> response = client().execute(remindRequest);
        assertEquals(response.statusCode(), 202);
    }
}
