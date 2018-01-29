package com.paypal.sdk.orders;

import com.braintreepayments.http.HttpResponse;
import com.braintreepayments.http.HttpClient;
import com.braintreepayments.http.exceptions.HttpException;
import com.braintreepayments.http.serializer.Json;
import com.paypal.sdk.TestHarness;
import java.io.File;
import java.nio.file.Paths;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.fail;

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
