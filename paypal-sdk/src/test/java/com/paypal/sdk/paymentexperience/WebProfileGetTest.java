package com.paypal.sdk.paymentexperience;

import com.braintreepayments.http.HttpClient;
import com.braintreepayments.http.HttpResponse;
import com.paypal.sdk.TestHarness;
import org.testng.annotations.Test;

import java.io.IOException;

import static com.paypal.sdk.paymentexperience.WebProfileCreateTest.createWebProfile;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

public class WebProfileGetTest extends TestHarness {

	public static HttpResponse<WebProfile> getWebProfile(String id, HttpClient client) throws IOException {
		return client.execute(new WebProfileGetRequest(id));
	}

    @Test
    public void testWebProfileGetRequest() throws IOException {
		HttpResponse<WebProfile> createResponse = createWebProfile(client(), true);
        HttpResponse<WebProfile> response = getWebProfile(createResponse.result().id(), client());

        assertEquals(response.statusCode(), 200);
        assertNotNull(response.result());

        assertEquals(response.result().id(), createResponse.result().id());
    }
}
