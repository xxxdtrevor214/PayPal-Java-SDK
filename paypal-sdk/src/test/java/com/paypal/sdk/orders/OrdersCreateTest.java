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

import static org.testng.Assert.*;

public class OrdersCreateTest extends TestHarness {

    public static Order buildRequestBody() throws IOException {
        Order order = new Order()
                .intent("SALE")
                .purchaseUnits(Arrays.asList(
                        new PurchaseUnit()
                                .referenceId("test_ref_id1")
                                .amount(new Amount()
                                    .currency("USD")
                                    .total("100.00")),
                        new PurchaseUnit()
                                .referenceId("test_ref_id2")
                                .amount(new Amount()
                                        .currency("USD")
                                        .total("50.00"))))
                .redirectUrls(new RedirectUrls()
                        .returnUrl("https://example.com/return")
                        .cancelUrl("https://example.com/cancel")
                );
        return order;
    }

    public static Order createOrder(HttpClient client) throws IOException {
        OrdersCreateRequest request = new OrdersCreateRequest();
        request.requestBody(buildRequestBody());

        HttpResponse<Order> response = client.execute(request);
        assertEquals(response.statusCode(), 201);

        Order createdOrder = response.result();
        assertNotNull(createdOrder);
        return createdOrder;
    }

    @Test
    public void testOrdersCreateRequest() throws IOException {
        Order createdOrder = createOrder(client());

        assertNotNull(createdOrder.id());

        assertNotNull(createdOrder.purchaseUnits());
        assertEquals(createdOrder.purchaseUnits().size(), 2);
        PurchaseUnit firstPurchaseUnit = createdOrder.purchaseUnits().get(0);
        assertEquals(firstPurchaseUnit.referenceId(), "test_ref_id1");
        assertEquals(firstPurchaseUnit.amount().currency(), "USD");
        assertEquals(firstPurchaseUnit.amount().total(), "100.00");
        assertEquals(firstPurchaseUnit.status(), "NOT_PROCESSED");

        PurchaseUnit secondPurchaseUnit = createdOrder.purchaseUnits().get(1);
        assertEquals(secondPurchaseUnit.referenceId(), "test_ref_id2");
        assertEquals(secondPurchaseUnit.amount().currency(), "USD");
        assertEquals(secondPurchaseUnit.amount().total(), "50.00");
        assertEquals(secondPurchaseUnit.status(), "NOT_PROCESSED");

        assertEquals(createdOrder.redirectUrls().returnUrl(), "https://example.com/return");
        assertEquals(createdOrder.redirectUrls().cancelUrl(), "https://example.com/cancel");

        assertNotNull(createdOrder.createTime());

        assertNotNull(createdOrder.links());
        boolean foundApprovalURL = false;
        for (LinkDescriptionObject linkDescription :createdOrder.links()) {
            if ("approval_url".equals(linkDescription.rel())) {
                foundApprovalURL = true;
                assertNotNull(linkDescription.href());
                assertEquals(linkDescription.method(), "REDIRECT");
            }
        }
        assertTrue(foundApprovalURL);

        assertEquals(createdOrder.status(), "CREATED");
    }
}
