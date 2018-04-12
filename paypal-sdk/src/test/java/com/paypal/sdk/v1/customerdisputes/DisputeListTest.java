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
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.fail;

public class DisputeListTest extends TestHarness {

    // Requires a sandbox account with dispute access
    @Test(enabled = false)
    public void testDisputeListRequest() throws IOException {
        DisputeListRequest request = new DisputeListRequest();

        HttpResponse<DisputeSearchResponse> response = client().execute(request);
        assertEquals(response.statusCode(), 200);
        assertNotNull(response.result());

        DisputeSearchResponse searchResponse = response.result();
        assertTrue(searchResponse.items().size() > 0);
    }
}
