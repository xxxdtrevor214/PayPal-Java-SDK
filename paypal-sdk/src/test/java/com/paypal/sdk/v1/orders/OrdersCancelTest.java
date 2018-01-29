package com.paypal.sdk.v1.orders;

import com.braintreepayments.http.HttpResponse;
import com.braintreepayments.http.exceptions.HttpException;
import com.paypal.sdk.TestHarness;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;

public class OrdersCancelTest extends TestHarness {

    @Test
    public void testOrdersCancelRequest() throws IOException {
        Order createdOrder = OrdersCreateTest.createOrder(client());

        OrdersGetRequest getRequest = new OrdersGetRequest(createdOrder.id());
        HttpResponse<Order> getResponse = client().execute(getRequest);
        assertEquals(getResponse.statusCode(), 200);

        OrdersCancelRequest cancelRequest = new OrdersCancelRequest(createdOrder.id());
        HttpResponse<Void> cancelResponse = client().execute(cancelRequest);
        assertEquals(cancelResponse.statusCode(), 204);

        try {
            getResponse = client().execute(getRequest);
        } catch (HttpException e) {
            assertEquals(e.statusCode(), 404);
        }
    }
}
