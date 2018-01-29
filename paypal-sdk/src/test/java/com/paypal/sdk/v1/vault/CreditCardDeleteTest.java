package com.paypal.sdk.v1.vault;

import com.braintreepayments.http.HttpResponse;
import com.paypal.sdk.TestHarness;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.fail;

public class CreditCardDeleteTest extends TestHarness {

    @Test
    public void testCreditCardDeleteRequest() throws IOException {
        CreditCard createdCreditCard = CreditCardCreateTest.createCreditCard(client());

        CreditCardDeleteRequest deleteRequest = new CreditCardDeleteRequest(createdCreditCard.id());

        HttpResponse<Void> response = client().execute(deleteRequest);
        assertEquals(response.statusCode(), 204);
    }
}
