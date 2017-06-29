// This class was generated on Wed, 28 Jun 2017 15:05:37 PDT by version 0.01 of Braintree SDK Generator
// OrderAuthorizeRequestTest.java
// DO NOT EDIT
// @type request
// @json {"Name":"order.authorize","Description":"Authorizes an order, by ID. In the JSON request body, include an `amount` object.","Parameters":[{"Type":"string","VariableName":"order_id","Description":"The ID of the order to authorize.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":true,"Properties":null,"Location":"path"}],"RequestType":{"Type":"Order","VariableName":"body","Description":"An order transaction.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null},"ResponseType":{"Type":"Authorization","VariableName":"","Description":"An authorization.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null},"ContentType":"","HttpMethod":"POST","Path":"/v1/payments/orders/{order_id}/authorize","Visible":true,"ExpectedStatusCode":200,"FileSuffix":"Test"}

package com.paypal.sdk.payments.request;

import com.braintreepayments.http.HttpResponse;
import com.paypal.sdk.TestHarness;
import com.paypal.sdk.payments.object.Amount;
import com.paypal.sdk.payments.object.Authorization;
import com.paypal.sdk.payments.object.Order;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;

/**
 * NOTE: Tests that use this class must be ignored when run in an automated environment because executing an order will require approval via the executed payment's approval_url.
 */
public class OrderAuthorizeRequestTest extends TestHarness {

    @Test (enabled = false)
    public void testOrderAuthorizeRequest() throws IOException {
    	HttpResponse<Order> orderHttpResponse = OrderGetRequestTest.getOrder(client());

        OrderAuthorizeRequest request = new OrderAuthorizeRequest(orderHttpResponse.result().id());

        Order body = new Order();
        body.amount(new Amount()
			.currency("USD")
			.total("10"));
        request.body(body);

        HttpResponse<Authorization> response = client().execute(request);
        assertEquals(200, response.statusCode());
    }
}
