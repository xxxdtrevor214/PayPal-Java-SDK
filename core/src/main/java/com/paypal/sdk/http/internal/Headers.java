package com.paypal.sdk.http.internal;

import java.net.URLConnection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Spliterator;
import java.util.function.Consumer;

import static com.paypal.sdk.http.internal.Headers.HttpHeader.*;

public class Headers implements Iterable<String> {

	@Override
	public Iterator<String> iterator() {
		return mHeaders.keySet().iterator();
	}

	public enum HttpHeader {
		CONTENT_TYPE("Content-Type"),
		AUTHORIZATION("Authorization"),
		PAYPAL_REQUEST_ID("PayPal-Request-Id"),
		USER_AGENT("User-Agent"),
		ACCEPT_LANGUAGE("Accept-Language"),
		ACCEPT_ENCODING("Accept-Encoding"),
		PAYPAL_CORRELATION_ID("PAYPAL-CLIENT-METADATA-ID");

		private String headerKey;
		HttpHeader(String headerkey) { this.headerKey = headerkey; }

		@Override
		public String toString() {
			return this.headerKey;
		}
	}

	private Map<String, String> mHeaders = new HashMap<String, String>();

	public Headers() {}

	public Headers header(String key, String value) {
		mHeaders.put(key, value);
		return this;
	}

	public Headers headerIfNotPresent(String key, String value) {
		if (mHeaders.get(key) == null) {
			mHeaders.put(key, value);
		}
		return this;
	}

	public Headers remove(String key) {
		mHeaders.remove(key);
		return this;
	}

	public String header(String key) {
		return mHeaders.get(key);
	}
}
