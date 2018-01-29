package com.paypal.sdk.paymentexperience;

import com.braintreepayments.http.HttpResponse;
import com.paypal.sdk.TestHarness;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static com.paypal.sdk.paymentexperience.WebProfileCreateTest.createWebProfile;
import static com.paypal.sdk.paymentexperience.WebProfileGetTest.getWebProfile;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNull;

public class WebProfilePartialUpdateTest extends TestHarness {

	private List<JsonPatch> buildRequestBody() throws IOException {
		List<JsonPatch> jsonPatches = new ArrayList<>();
		jsonPatches.add(new JsonPatch()
				.op("add")
				.path("/presentation/brand_name")
				.value("new_brand_name"));
		jsonPatches.add(new JsonPatch()
				.op("remove")
				.path("/flow_config/landing_page_type"));

		return jsonPatches;
	}

	@Test
	public void testWebProfilePartialUpdateRequest() throws IOException {
		HttpResponse<WebProfile> createResponse = createWebProfile(client(), true);

		WebProfilePartialUpdateRequest request = new WebProfilePartialUpdateRequest(createResponse.result().id());
		request.requestBody(buildRequestBody());

		HttpResponse<Void> response = client().execute(request);
		assertEquals(response.statusCode(), 204);

		HttpResponse<WebProfile> getResponse = getWebProfile(createResponse.result().id(), client());

		assertEquals(getResponse.result().presentation().brandName(), "new_brand_name");
		assertNull(getResponse.result().flowConfig().landingPageType());
	}
}
