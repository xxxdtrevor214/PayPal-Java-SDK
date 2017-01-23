package com.paypal.sdk.http.exceptions;

import com.paypal.sdk.http.internal.Headers;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;

public class HttpServerExceptionTest {

	@Test
	public void testHttpServerException_withJsonBody_ParsesIntoDetails() {
		String errorResponse = "{\"debug_id\":\"debug\",\"information_link\":\"http://info.com\",\"message\":\"message\",\"name\":\"name\"}";
		HttpServerException serverException = new HttpServerException(errorResponse, 400, new Headers());

		assertNotNull(serverException.getDetails());
		assertEquals(serverException.getMessage(), errorResponse);
		assertEquals(serverException.getDetails().debugId(), "debug");
		assertEquals(serverException.getDetails().informationLink(), "http://info.com");
		assertEquals(serverException.getDetails().message(), "message");
		assertEquals(serverException.getDetails().name(), "name");
	}

	@Test
	public void testHttpServerException_withoutJsonBody_doesNotParseIntoDetails() {
		String errorResponse = "<ns1:XMLFault xmlns:ns1=\"http://cxf.apache.org/bindings/xformat\"><ns1:faultstring xmlns:ns1=\"http://cxf.apache.org/bindings/xformat\">java.lang.NullPointerException</ns1:faultstring></ns1:XMLFault>";
		HttpServerException serverException = new HttpServerException(errorResponse, 400, new Headers());

		assertNull(serverException.getDetails());
		assertEquals(serverException.getMessage(), errorResponse);
	}
}
