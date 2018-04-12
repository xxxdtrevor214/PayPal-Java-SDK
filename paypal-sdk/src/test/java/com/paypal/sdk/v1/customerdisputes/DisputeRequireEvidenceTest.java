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

public class DisputeRequireEvidenceTest extends TestHarness {

    // Requires a dispute in the correct state
    @Test(enabled = false)
    public void testDisputeRequireEvidenceRequest() throws IOException {
        RequireEvidenceRequest body = new RequireEvidenceRequest().action("SELLER_EVIDENCE");
        DisputeRequireEvidenceRequest request = new DisputeRequireEvidenceRequest("PP-000-042-636-306");
        request.requestBody(body);

        HttpResponse<SubsequentActions> response = client().execute(request);
        assertEquals(response.statusCode(), 200);
        assertNotNull(response.result());
    }
}
