package com.paypal.sdk.v1.customerdisputes;

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

public class DisputeGetTest extends TestHarness {

    // Requires a sandbox account with dispute access
    @Test(enabled =false)
    public void testDisputeGetRequest() throws IOException {
        DisputeGetRequest request = new DisputeGetRequest("PP-000-042-636-306");

        HttpResponse<Dispute> response = client().execute(request);
        assertEquals(response.statusCode(), 200);
        assertNotNull(response.result());

        Dispute dispute = response.result();
        assertEquals("10.15", dispute.disputedTransactions().get(0).grossAmount().value());
        assertEquals("USD", dispute.disputedTransactions().get(0).grossAmount().currencyCode());
        assertEquals("MERCHANDISE_OR_SERVICE_NOT_AS_DESCRIBED", dispute.reason());
    }
}
