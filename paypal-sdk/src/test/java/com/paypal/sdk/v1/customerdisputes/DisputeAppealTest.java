package com.paypal.sdk.v1.customerdisputes;

import com.braintreepayments.http.HttpResponse;
import com.braintreepayments.http.HttpClient;
import com.braintreepayments.http.serializer.Json;
import com.braintreepayments.http.multipart.FilePart;
import com.braintreepayments.http.multipart.JsonPart;
import com.braintreepayments.http.multipart.MultipartBody;
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

public class DisputeAppealTest extends TestHarness {

    // Requires a dispute in the correct state
    @Test(enabled = false)
    public void testDisputeAppealRequest() throws IOException {
        DisputeAppealRequest request = new DisputeAppealRequest("PP-000-042-635-183");
        Evidence evidence = new Evidence().evidenceType("OTHER").notes("Notes");

        MultipartBody multipartBody = new MultipartBody();
        multipartBody.addPart(new JsonPart("input", evidence));
        multipartBody.addPart(new FilePart("file1", Paths.get("src/test/resources/fileupload_test_binary_4.jpg").toAbsolutePath().toFile()));

        request.requestBody(multipartBody);

        HttpResponse<SubsequentActions> response = client().execute(request);
        assertEquals(response.statusCode(), 200);
        assertNotNull(response.result());
    }
}
