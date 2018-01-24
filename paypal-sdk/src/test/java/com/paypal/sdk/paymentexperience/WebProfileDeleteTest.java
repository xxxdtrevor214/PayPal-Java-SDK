package com.paypal.sdk.paymentexperience;

import com.braintreepayments.http.HttpResponse;
import com.paypal.sdk.TestHarness;
import org.testng.annotations.Test;

import java.io.IOException;

import static com.paypal.sdk.paymentexperience.WebProfileCreateTest.createWebProfile;
import static org.testng.Assert.assertEquals;

public class WebProfileDeleteTest extends TestHarness {

    @Test
    public void testWebProfileDeleteRequest() throws IOException {
		HttpResponse<WebProfile> createResponse = createWebProfile(client(), true);

        WebProfileDeleteRequest request = new WebProfileDeleteRequest(createResponse.result().id());

        HttpResponse<Void> response = client().execute(request);
        assertEquals(response.statusCode(), 204);
    }
}
