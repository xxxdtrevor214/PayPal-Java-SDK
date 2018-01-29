package com.paypal.sdk.vault;

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
