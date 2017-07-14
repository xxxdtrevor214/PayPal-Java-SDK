// This class was generated on Thu, 13 Jul 2017 09:07:17 PDT by version 0.01 of Braintree SDK Generator
// InvoiceDeleteExternalRefundRequestTest.java
// DO NOT EDIT
// @type request
// @json {"Name":"invoice.delete_external_refund","Description":"Deletes an external refund, by invoice ID and transaction ID.","Parameters":[{"Type":"string","VariableName":"invoice_id","Description":"The ID of the invoice from which to delete the refund transaction.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null,"Location":"path"},{"Type":"string","VariableName":"transaction_id","Description":"The ID of the refund transaction to delete.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null,"Location":"path"}],"RequestType":null,"ResponseType":null,"ContentType":"application/json","HttpMethod":"DELETE","Path":"/v1/invoicing/invoices/{invoice_id}/refund-records/{transaction_id}","ExpectedStatusCode":200,"FileSuffix":"Test"}

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

public class InvoiceDeleteExternalRefundRequestTest extends TestHarness {

    @Test
    public void testInvoiceDeleteExternalRefundRequest() throws IOException {
        TestUtil.ResponseAndID responseAndID = TestUtil.createInvoiceRefund(client());

        HttpResponse<Invoice> getResponse = TestUtil.getInvoice(client(), responseAndID.id);
        InvoiceDeleteExternalRefundRequest request = new InvoiceDeleteExternalRefundRequest(responseAndID.id, getResponse.result().refunds().get(0).transactionId());

        HttpResponse<Void> response = client().execute(request);
        assertEquals(response.statusCode(), 204);
    }
}
