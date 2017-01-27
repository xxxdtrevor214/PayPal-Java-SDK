package com.paypal.sdk;

import com.paypal.sdk.http.DefaultHttpClient;
import com.paypal.sdk.http.Environment;
import com.paypal.sdk.http.HttpClient;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;

import static com.paypal.sdk.http.Headers.ACCEPT_ENCODING;
import static com.paypal.sdk.http.Headers.CONTENT_TYPE;

@Slf4j
public class PayPalHttpClient extends DefaultHttpClient implements HttpClient {

    private Environment mEnvironment;

    public PayPalHttpClient(Environment environment) {
    	this(new OAuthInjector(environment), environment);
    }

    public PayPalHttpClient(Injector authInjector, Environment environment) {
    	super();
		mEnvironment = environment;
    	addInjector(authInjector);
    	addInjector(new PayPalDefaultInjector());
	}

	@Override
	protected String getUserAgent() {
    	return "Java PayPalHttpClient"; // TODO: Return SDK version as part of this user agent.
	}

	private class PayPalDefaultInjector implements Injector {

		@Override
		public <T> void inject(HttpRequest<T> request) throws IOException {
			if (request.baseUrl() == null) {
				request.baseUrl(mEnvironment.baseUrl());
			}

			if (request.requestBody() != null) {
				request.headers().headerIfNotPresent(CONTENT_TYPE, "application/json");
			}

			request.headers().headerIfNotPresent(ACCEPT_ENCODING, "gzip");

		}
	}
}
