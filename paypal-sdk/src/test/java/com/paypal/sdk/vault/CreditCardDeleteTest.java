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

public class CreditCardDeleteTest extends TestHarness {

    @Test
    public void testCreditCardDeleteRequest() throws IOException {
        CreditCard createdCreditCard = CreditCardCreateTest.createCreditCard(client());

        CreditCardDeleteRequest deleteRequest = new CreditCardDeleteRequest(createdCreditCard.id());

        HttpResponse<Void> response = client().execute(deleteRequest);
        assertEquals(response.statusCode(), 204);
    }
}
