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

	private Injector mAuthInjector;
    private Environment mEnvironment;

    public PayPalHttpClient(Environment environment) {
    	mAuthInjector = new OAuthInjector(environment);
		mEnvironment = environment;
    }

    public PayPalHttpClient(Injector authInjector, Environment environment) {
    	mAuthInjector = authInjector;
    	mEnvironment = environment;
	}

	@Override
	protected String getUserAgent() {
    	return "Java PayPalHttpClient"; // TODO: Return SDK version as part of this user agent.
	}

	/**
	 * Make an HTTP request to the base url using the parameters specified in the {@link HttpRequest} object.
	 *
	 * @param request the {@link HttpRequest} object containing the parameters for this request
	 * @return an {@link HttpResponse} object containing the parameters from a successful call to the server
	 * @throws IOException
	 */
	@Override
    public <T> HttpResponse<T> execute(HttpRequest<T> request) throws IOException {
		if (mAuthInjector != null) {
			mAuthInjector.inject(request);
		}

		if (request.baseUrl() == null) {
			request.baseUrl(mEnvironment.baseUrl());
		}

		if (request.requestBody() != null) {
			request.headers().headerIfNotPresent(CONTENT_TYPE, "application/json");
		}

		request.headers().headerIfNotPresent(ACCEPT_ENCODING, "gzip");

		return super.execute(request);
	}
}
