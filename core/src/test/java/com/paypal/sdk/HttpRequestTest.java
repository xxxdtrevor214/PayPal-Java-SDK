package com.paypal.sdk;

import com.paypal.sdk.model.AccessToken;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class HttpRequestTest {

	@Test
	public void testHttpRequest_addHeader_setsHeaderInHeaders() {
		HttpRequest<String> request = new HttpRequest<String>("/", "POST", String.class)
				.header("key", "value");

		assertNotNull(request.headers().header("key"));
		assertEquals("value", request.headers().header("key"));
	}

	@Test
	public void testHttpRequest_serialize_omitsFieldsWithCustomGsonStrategy() {
		HttpRequest<Void> req = new HttpRequest<Void>("", "", Void.class)
				.requestBody(new AccessToken() // AccessToken uses custom serialization strategy
						.accessToken("at")
						.expiresIn(3600)
						.tokenType("Bearer"));

		String serialized = req.serialize();
		assertTrue(serialized.contains("\"access_token\":\"at\""));
		assertTrue(serialized.contains("\"token_type\":\"Bearer\""));
		assertTrue(serialized.contains("\"expires_in\":3600"));
		assertFalse(serialized.contains("createDate"));
	}

	@Test
	public void testHttpRequest_serialize_stringBodyRemainsUnchanged() {
		HttpRequest<Void> req = new HttpRequest<Void>("", "", Void.class)
				.requestBody("{\"some_preformatted_json\":true}");

		assertEquals(req.serialize(), "{\"some_preformatted_json\":true}");
	}
}
