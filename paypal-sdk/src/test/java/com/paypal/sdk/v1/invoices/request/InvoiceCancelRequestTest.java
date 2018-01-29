// This class was generated on Thu, 13 Jul 2017 09:07:17 PDT by version 0.01 of Braintree SDK Generator
// InvoiceCancelRequestTest.java
// DO NOT EDIT
// @type request
// @json {"Name":"invoice.cancel","Description":"Cancels a sent invoice, by ID, and, optionally, sends a notification about the cancellation to the payer, merchant, and Cc: emails.","Parameters":[{"Type":"string","VariableName":"invoice_id","Description":"The ID of the invoice to cancel.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null,"Location":"path"}],"RequestType":{"Type":"Cancel Notification","VariableName":"body","Description":"Cancels an email or SMS notification.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},"ResponseType":null,"ContentType":"application/json","HttpMethod":"POST","Path":"/v1/invoicing/invoices/{invoice_id}/cancel","ExpectedStatusCode":200,"FileSuffix":"Test"}

package com.paypal.sdk.v1.invoices.request;

import com.braintreepayments.http.HttpResponse;
import com.paypal.sdk.TestHarness;
import com.paypal.sdk.v1.invoices.CancelNotification;
import com.paypal.sdk.v1.invoices.InvoiceCancelRequest;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;

public class InvoiceCancelRequestTest extends TestHarness {

    @Test
    public void testInvoiceCancelRequest() throws IOException {
        TestUtil.ResponseAndID responseAndID = TestUtil.sendInvoice(client());
        assertEquals(responseAndID.response.statusCode(), 202);

        InvoiceCancelRequest cancelRequest = new InvoiceCancelRequest(responseAndID.id);
        CancelNotification cancelNotification = new CancelNotification()
                .subject("Past due")
                .note("Never mind!")
                .sendToMerchant(true)
                .sendToPayer(true);

        cancelRequest.requestBody(cancelNotification);

        HttpResponse<Void> response = client().execute(cancelRequest);
        assertEquals(response.statusCode(), 204);
    }
}
