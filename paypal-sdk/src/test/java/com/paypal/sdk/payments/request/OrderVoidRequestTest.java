// This class was generated on Wed, 28 Jun 2017 15:05:37 PDT by version 0.01 of Braintree SDK Generator
// OrderVoidRequestTest.java
// DO NOT EDIT
// @type request
// @json {"Name":"order.void","Description":"Voids, or cancels, an order, by ID. You cannot void an order if the payment has already been partially or fully captured.","Parameters":[{"Type":"string","VariableName":"order_id","Description":"The ID of the order to void.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":true,"Properties":null,"Location":"path"}],"RequestType":null,"ResponseType":{"Type":"Order","VariableName":"","Description":"An order transaction.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null},"ContentType":"","HttpMethod":"POST","Path":"/v1/payments/orders/{order_id}/do-void","Visible":true,"ExpectedStatusCode":200,"FileSuffix":"Test"}

package com.paypal.sdk.payments.request;

import com.braintreepayments.http.HttpResponse;
import com.paypal.sdk.TestHarness;
import com.paypal.sdk.payments.Order;
import com.paypal.sdk.payments.OrderVoidRequest;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;

/**
 * NOTE: Tests that use this class must be ignored when run in an automated environment because executing an order will require approval via the executed payment's approval_url.
 */
public class OrderVoidRequestTest extends TestHarness {

    @Test(enabled = false)
    public void testOrderVoidRequest() throws IOException {
        OrderVoidRequest request = new OrderVoidRequest(OrderGetRequestTest.ID);

        HttpResponse<Order> response = client().execute(request);
        assertEquals(200, response.statusCode());
    }
}
