// This class was generated on Thu, 13 Jul 2017 09:07:17 PDT by version 0.01 of Braintree SDK Generator
// InvoiceDeleteExternalPaymentRequestTest.java
// DO NOT EDIT
// @type request
// @json {"Name":"invoice.delete_external_payment","Description":"Deletes an external payment, by invoice ID and transaction ID.","Parameters":[{"Type":"string","VariableName":"invoice_id","Description":"The ID of the invoice from which to delete a payment transaction.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null,"Location":"path"},{"Type":"string","VariableName":"transaction_id","Description":"The ID of the payment transaction to delete.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null,"Location":"path"}],"RequestType":null,"ResponseType":null,"ContentType":"application/json","HttpMethod":"DELETE","Path":"/v1/invoicing/invoices/{invoice_id}/payment-records/{transaction_id}","ExpectedStatusCode":200,"FileSuffix":"Test"}

package com.paypal.sdk.v1.invoices.request;

import com.braintreepayments.http.HttpResponse;
import com.paypal.sdk.TestHarness;
import com.paypal.sdk.v1.invoices.Invoice;
import com.paypal.sdk.v1.invoices.InvoiceDeleteExternalPaymentRequest;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;

public class InvoiceDeleteExternalPaymentRequestTest extends TestHarness {

    @Test
    public void testInvoiceDeleteExternalPaymentRequest() throws IOException {
        TestUtil.ResponseAndID responseAndID = TestUtil.createInvoicePayment(client());

        HttpResponse<Invoice> getResponse = TestUtil.getInvoice(client(), responseAndID.id);
        InvoiceDeleteExternalPaymentRequest request = new InvoiceDeleteExternalPaymentRequest(responseAndID.id, getResponse.result().payments().get(0).transactionId());

        HttpResponse<Void> response = client().execute(request);
        assertEquals(response.statusCode(), 204);
    }
}
