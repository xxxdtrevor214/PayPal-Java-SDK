// This class was generated on Wed, 28 Jun 2017 15:05:37 PDT by version 0.01 of Braintree SDK Generator
// OrderGetRequestTest.java
// DO NOT EDIT
// @type request
// @json {"Name":"order.get","Description":"Shows details for an order, by ID.","Parameters":[{"Type":"string","VariableName":"order_id","Description":"The ID of the order for which to show details.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":true,"Properties":null,"Location":"path"}],"RequestType":null,"ResponseType":{"Type":"Order","VariableName":"","Description":"An order transaction.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null},"ContentType":"","HttpMethod":"GET","Path":"/v1/payments/orders/{order_id}","Visible":true,"ExpectedStatusCode":200,"FileSuffix":"Test"}

package com.paypal.sdk.v1.payments.request;

import com.braintreepayments.http.HttpClient;
import com.braintreepayments.http.HttpResponse;
import com.paypal.sdk.TestHarness;
import com.paypal.sdk.v1.payments.Order;
import com.paypal.sdk.v1.payments.OrderGetRequest;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;

/**
 * NOTE: Tests that use this class must be ignored when run in an automated environment because executing an order will require approval via the executed payment's approval_url.
 */
public class OrderGetRequestTest extends TestHarness {

	public static String ID = "O-2HT09787H36911800";

	public static HttpResponse<Order> getOrder(HttpClient client) throws IOException {
		OrderGetRequest request = new OrderGetRequest(ID);

		return client.execute(request);
	}

    @Test(enabled = false)
    public void testOrderGetRequest() throws IOException {
        HttpResponse<Order> response = getOrder(client());
        assertEquals(200, response.statusCode());
    }
}
