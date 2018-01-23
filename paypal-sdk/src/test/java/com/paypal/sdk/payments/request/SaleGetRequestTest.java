// This class was generated on Wed, 28 Jun 2017 15:05:37 PDT by version 0.01 of Braintree SDK Generator
// SaleGetRequestTest.java
// DO NOT EDIT
// @type request
// @json {"Name":"sale.get","Description":"Shows details for a sale, by ID. Returns only sales that were created through the REST API.","Parameters":[{"Type":"string","VariableName":"sale_id","Description":"The ID of the sale for which to show details.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":true,"Properties":null,"Location":"path"}],"RequestType":null,"ResponseType":{"Type":"Sale","VariableName":"","Description":"A sale transaction. Returned as a part of payment-related resources.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null},"ContentType":"","HttpMethod":"GET","Path":"/v1/payments/sale/{sale_id}","Visible":true,"ExpectedStatusCode":200,"FileSuffix":"Test"}

package com.paypal.sdk.payments.request;

import com.braintreepayments.http.HttpResponse;
import com.paypal.sdk.TestHarness;
import com.paypal.sdk.payments.Payment;
import com.paypal.sdk.payments.Sale;
import com.paypal.sdk.payments.SaleGetRequest;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

public class SaleGetRequestTest extends TestHarness {

    @Test
    public void testSaleGetRequest() throws IOException {
		HttpResponse<Payment> saleResponse = PaymentCreateRequestTest.createPayment(client(), "sale");

		String saleId = saleResponse.result().transactions().get(0).relatedResources().get(0).sale().id();
        SaleGetRequest request = new SaleGetRequest(saleId);

        HttpResponse<Sale> response = client().execute(request);
        assertEquals(200, response.statusCode());
        assertNotNull(response.result());
    }
}
