package com.paypal.sdk.http.exceptions;

import com.google.gson.JsonSyntaxException;
import com.paypal.sdk.http.internal.Headers;
import com.paypal.sdk.http.internal.JSONFormatter;
import com.paypal.sdk.model.Error;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.IOException;

@Data
@EqualsAndHashCode(callSuper = true)
public class HttpServerException extends IOException {

	private Error details;
	private int statusCode;
	private Headers headers;

	public HttpServerException(String json, int statusCode, Headers headers) {
		super(json);
		try {
			this.details = JSONFormatter.fromJSON(json, Error.class);
		} catch (JsonSyntaxException ignored) {}

		this.statusCode = statusCode;
		this.headers = headers;
	}
}
