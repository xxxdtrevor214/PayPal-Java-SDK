package com.paypal.sdk.orders;

import com.braintreepayments.http.HttpResponse;
import com.braintreepayments.http.HttpClient;
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

public class OrdersPayTest extends TestHarness {

    private ExecuteOrder buildRequestBody() throws IOException {
        ExecuteOrder executedOrder = new ExecuteOrder()
                .disbursementMode("INSTANT");
        return executedOrder;
    }

    @Test(enabled = false)
    public void testOrdersPayRequest() throws IOException {
        String orderId = "4V297170UB1090910";
        OrdersPayRequest request = new OrdersPayRequest(orderId);
        request.requestBody(buildRequestBody());

        HttpResponse<PayOrderResponse> response = client().execute(request);
        assertEquals(response.statusCode(), 200);
        assertNotNull(response.result());
        PayOrderResponse payOrderResponse = response.result();
        assertEquals(payOrderResponse.orderId(), orderId);
        assertEquals(payOrderResponse.status(), "APPROVED");
    }
}
