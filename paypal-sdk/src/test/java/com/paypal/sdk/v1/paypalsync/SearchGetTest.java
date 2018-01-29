package com.paypal.sdk.v1.paypalsync;

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

public class SearchGetTest extends TestHarness {

    @Test(enabled = false)
    public void testSearchMultipleTransactionsBetweenDates() throws IOException {
        SearchGetRequest request = new SearchGetRequest()
                .startDate("2018-01-12T00:00:00+00:00")
                .endDate("2018-01-13T00:00:00+00:00");

        HttpResponse<SearchResponse> response = client().execute(request);
        assertEquals(response.statusCode(), 200);
        assertNotNull(response.result());

        SearchResponse searchResponse = response.result();
        assertEquals(searchResponse.totalItems(), Integer.valueOf(2));
        List<TransactionDetails> transactionDetails = searchResponse.transactionDetails();
        assertNotNull(transactionDetails);
        assertEquals(transactionDetails.size(), 2);
    }

    @Test(enabled = false)
    public void testSearchSpecificTransactionId() throws IOException {
        String transactionId = "2U010448V6336721U";
        SearchGetRequest request = new SearchGetRequest()
                .transactionId(transactionId);

        HttpResponse<SearchResponse> response = client().execute(request);
        assertEquals(response.statusCode(), 200);
        assertNotNull(response.result());

        SearchResponse searchResponse = response.result();
        assertNotNull(searchResponse.transactionDetails());
        assertEquals(searchResponse.totalItems(), Integer.valueOf(1));
        TransactionDetails transactionDetails = searchResponse.transactionDetails().get(0);
        assertNotNull(transactionDetails);
        TransactionInformation transactionInformation = transactionDetails.transactionInfo();
        assertNotNull(transactionInformation);
        assertEquals(transactionInformation.transactionId(), transactionId);
        assertEquals(transactionInformation.transactionSubject(), "Agreement for T-Shirt of the Month Club Plan");
        Money money = transactionInformation.transactionAmount();
        assertNotNull(money);
        assertEquals(money.currencyCode(), "USD");
        assertEquals(money.value(), "122.00");
    }
}
