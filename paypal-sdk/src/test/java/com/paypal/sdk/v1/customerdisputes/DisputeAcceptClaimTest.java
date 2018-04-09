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

public class DisputeAcceptClaimTest extends TestHarness {

    @Test(enabled = false)
    public void testDisputeAcceptClaimRequest() throws IOException {
        DisputeAcceptClaimRequest request = new DisputeAcceptClaimRequest("PP-000-042-635-209");
        AcceptClaimRequest acceptClaim = new AcceptClaimRequest().note("Accepting Claim");
        request.requestBody(acceptClaim);

        HttpResponse<SubsequentActions> response = client().execute(request);
        assertEquals(response.statusCode(), 200);
        assertNotNull(response.result());
    }
}
