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

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.fail;

public class CreditCardUpdateTest extends TestHarness {

    private List<JsonPatch> buildRequestBody() {
        List<JsonPatch> body = new ArrayList<>();
        body.add(new JsonPatch()
                .path("/billing_address/line1")
                .op("replace")
                .value("123 East 4th St."));
        return body;
    }

    @Test
    public void testCreditCardUpdateRequest() throws IOException {
        CreditCard createdCreditCard = CreditCardCreateTest.createCreditCard(client());

        CreditCardUpdateRequest updateRequest = new CreditCardUpdateRequest(createdCreditCard.id());
        updateRequest.requestBody(buildRequestBody());

        HttpResponse<CreditCard> updateResponse = client().execute(updateRequest);
        assertEquals(updateResponse.statusCode(), 200);
        assertNotNull(updateResponse.result());

        CreditCardGetRequest getRequest = new CreditCardGetRequest(createdCreditCard.id());
        HttpResponse<CreditCard> getResponse = client().execute(getRequest);
        assertEquals(getResponse.statusCode(), 200);
        assertNotNull(getResponse.result());
        CreditCard retrievedCreditCard = getResponse.result();
        assertEquals(retrievedCreditCard.id(), createdCreditCard.id());
        assertEquals(retrievedCreditCard.firstName(), createdCreditCard.firstName());
        assertEquals(retrievedCreditCard.lastName(), createdCreditCard.lastName());
        assertEquals(retrievedCreditCard.billingAddress().line1(), "123 East 4th St.");
    }
}
