package com.paypal.sdk.v1.vault;

import com.braintreepayments.http.HttpClient;
import com.braintreepayments.http.HttpResponse;
import com.paypal.sdk.TestHarness;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

public class CreditCardCreateTest extends TestHarness {
    public static CreditCard buildRequestBody() throws IOException {
        CreditCard creditCard = new CreditCard()
                .number("4417119669820331")
                .type("visa")
                .expireMonth("11")
                .expireYear("2055")
                .firstName("Jane")
                .lastName("Shopper")
                .billingAddress(new SimplePostalAddress()
                        .line1("52 N Main St.")
                        .city("Johnstown")
                        .countryCode("US")
                        .postalCode("43210")
                        .state("OH"));
        return creditCard;
    }

    public static CreditCard createCreditCard(HttpClient client) throws IOException {
        CreditCardCreateRequest request = new CreditCardCreateRequest();
        request.requestBody(buildRequestBody());

        HttpResponse<CreditCard> response = client.execute(request);
        assertEquals(response.statusCode(), 201);
        return response.result();
    }

    @Test
    public void testCreditCardCreateRequest() throws IOException {
        CreditCard creditCard = createCreditCard(client());

        assertNotNull(creditCard);
        assertNotNull(creditCard.id());
        assertNotNull(creditCard.firstName(), "Jane");
        assertNotNull(creditCard.lastName(), "Shopper");
    }
}
