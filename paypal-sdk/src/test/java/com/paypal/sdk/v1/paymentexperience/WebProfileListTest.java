package com.paypal.sdk.v1.paymentexperience;

import com.braintreepayments.http.HttpResponse;
import com.paypal.sdk.TestHarness;
import org.testng.annotations.Test;

import java.io.IOException;

import static com.paypal.sdk.v1.paymentexperience.WebProfileCreateTest.createWebProfile;
import static org.testng.Assert.*;

public class WebProfileListTest extends TestHarness {

    @Test
    public void testWebProfileListRequest() throws IOException {
		// Ensure at least one webprofile
        createWebProfile(client(), false);

        WebProfileListRequest request = new WebProfileListRequest();

        HttpResponse<WebProfileList> listResponse = client().execute(request);
        assertEquals(listResponse.statusCode(), 200);
        assertNotNull(listResponse.result());

        assertTrue(listResponse.result().size() > 0);
    }
}
