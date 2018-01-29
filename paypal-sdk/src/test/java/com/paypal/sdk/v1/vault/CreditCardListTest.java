package com.paypal.sdk.v1.vault;

import com.braintreepayments.http.HttpResponse;
import com.paypal.sdk.TestHarness;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.*;

public class CreditCardListTest extends TestHarness {

    @Test
    public void testCreditCardListRequest() throws IOException {
        CreditCard createdCreditCard = CreditCardCreateTest.createCreditCard(client());

        CreditCardListRequest listRequest = new CreditCardListRequest();
        HttpResponse<CreditCardList> response = client().execute(listRequest);
        assertEquals(response.statusCode(), 200);
        assertNotNull(response.result());

        CreditCardList creditCardList = response.result();

        boolean foundCreditCard = false;
        for (CreditCard creditCard: creditCardList.items()) {
            if (createdCreditCard.id().equals(creditCard.id())) {
                foundCreditCard = true;
                assertEquals(creditCard.firstName(), createdCreditCard.firstName());
                assertEquals(creditCard.lastName(), createdCreditCard.lastName());
                assertEquals(creditCard.billingAddress().city(), createdCreditCard.billingAddress().city());
            }
        }
        assertTrue(foundCreditCard);
    }
}
