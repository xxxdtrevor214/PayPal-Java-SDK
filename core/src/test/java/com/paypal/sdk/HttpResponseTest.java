package com.paypal.sdk;

import com.paypal.sdk.http.Headers;
import com.paypal.sdk.model.Error;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

public class HttpResponseTest {

    @Test
    public void testHttpResponse_headerNotNullEvenIfSet() {
        HttpResponse<String> response = HttpResponse.<String>builder()
                .result("data")
                .statusCode(100)
                .headers(new Headers())
                .build();
        assertNotNull(response.headers());
    }

    @Test
	public void testHttpResponse_deserialize() {
    	String errorResponse = "{\"debug_id\":\"debug\",\"information_link\":\"http://info.com\",\"message\":\"message\",\"name\":\"name\"}";
    	HttpResponse<Error> response = HttpResponse.deserialize(new Headers().header("Content-Type", "application/json"),
				200, errorResponse, Error.class);

    	assertEquals(response.result().debugId(), "debug");
		assertEquals(response.result().informationLink(), "http://info.com");
		assertEquals(response.result().message(), "message");
		assertEquals(response.result().name(), "name");
	}

	@Test
	public void testHttpResponse_deserialize_stringResponseUntransformed() {
		String errorResponse = "{\"debug_id\":\"debug\",\"information_link\":\"http://info.com\",\"message\":\"message\",\"name\":\"name\"}";
		HttpResponse<String> response = HttpResponse.deserialize(new Headers(),
				200, errorResponse, String.class);

		assertEquals(response.result(), errorResponse);
	}
}
