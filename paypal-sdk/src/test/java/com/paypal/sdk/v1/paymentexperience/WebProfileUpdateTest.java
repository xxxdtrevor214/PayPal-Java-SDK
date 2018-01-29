package com.paypal.sdk.v1.paymentexperience;

import com.braintreepayments.http.HttpResponse;
import com.paypal.sdk.TestHarness;
import org.testng.annotations.Test;

import java.io.IOException;

import static com.paypal.sdk.v1.paymentexperience.WebProfileCreateTest.createWebProfile;
import static com.paypal.sdk.v1.paymentexperience.WebProfileGetTest.getWebProfile;
import static org.testng.Assert.assertEquals;

public class WebProfileUpdateTest extends TestHarness {

    @Test
    public void testWebProfileUpdateRequest() throws IOException {
        HttpResponse<WebProfile> createResponse = createWebProfile(client(), false);

        WebProfile profile = createResponse.result();

        profile.flowConfig().bankTxnPendingUrl("http://updated.com");

        WebProfileUpdateRequest request = new WebProfileUpdateRequest(profile.id());
        request.requestBody(profile);

        HttpResponse<Void> response = client().execute(request);
        assertEquals(response.statusCode(), 204);

        HttpResponse<WebProfile> updatedProfileResponse = getWebProfile(profile.id(), client());

        assertEquals(updatedProfileResponse.result().flowConfig().bankTxnPendingUrl(), "http://updated.com");
    }
}
