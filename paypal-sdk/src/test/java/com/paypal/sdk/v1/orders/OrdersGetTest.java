package com.paypal.sdk.v1.orders;

import com.braintreepayments.http.HttpResponse;
import com.paypal.sdk.TestHarness;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.*;

public class OrdersGetTest extends TestHarness {

    @Test
    public void testOrdersGetRequest() throws IOException {
        Order createdOrder = OrdersCreateTest.createOrder(client());

        OrdersGetRequest request = new OrdersGetRequest(createdOrder.id());
        HttpResponse<Order> response = client().execute(request);
        assertEquals(response.statusCode(), 200);

        Order retrievedOrder = response.result();
        assertNotNull(retrievedOrder);

        assertEquals(retrievedOrder.id(), createdOrder.id());

        assertNotNull(retrievedOrder.purchaseUnits());
        assertEquals(retrievedOrder.purchaseUnits().size(), createdOrder.purchaseUnits().size());
        for (int count = 0; count < retrievedOrder.purchaseUnits().size(); count++) {
            PurchaseUnit retrievedOrderPurchaseUnit = retrievedOrder.purchaseUnits().get(count);
            PurchaseUnit createdOrderPurchaseUnit = retrievedOrder.purchaseUnits().get(count);
            assertEquals(retrievedOrderPurchaseUnit.referenceId(), createdOrderPurchaseUnit.referenceId());
            assertEquals(retrievedOrderPurchaseUnit.amount().currency(), createdOrderPurchaseUnit.amount().currency());
            assertEquals(retrievedOrderPurchaseUnit.amount().total(), createdOrderPurchaseUnit.amount().total());
            assertEquals(retrievedOrderPurchaseUnit.status(), createdOrderPurchaseUnit.status());
        }

        assertEquals(retrievedOrder.redirectUrls().returnUrl(), "https://example.com/return");
        assertEquals(retrievedOrder.redirectUrls().cancelUrl(), "https://example.com/cancel");

        assertNotNull(retrievedOrder.createTime());

        assertNotNull(retrievedOrder.links());
        boolean foundApprovalURL = false;
        for (LinkDescriptionObject linkDescription :retrievedOrder.links()) {
            if ("approval_url".equals(linkDescription.rel())) {
                foundApprovalURL = true;
                assertNotNull(linkDescription.href());
                assertEquals(linkDescription.method(), "REDIRECT");
            }
        }
        assertTrue(foundApprovalURL);

        assertEquals(retrievedOrder.status(), "CREATED");
    }

}
