package com.paypal.sdk;

import com.paypal.sdk.http.DefaultHttpClient;
import com.paypal.sdk.http.Environment;
import com.paypal.sdk.http.HttpClient;
import com.paypal.sdk.services.Injector;
import com.paypal.sdk.services.OAuthInjector;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;

import static com.paypal.sdk.http.Headers.HttpHeader.ACCEPT_ENCODING;
import static com.paypal.sdk.http.Headers.HttpHeader.CONTENT_TYPE;

@Slf4j
public class PayPalHttpClient extends DefaultHttpClient implements HttpClient {

    private Injector mAuthInjector;
    private Environment mEnvironment;

    public PayPalHttpClient(String clientId, String clientSecret, Environment environment) {
		mAuthInjector = new OAuthInjector(clientId, clientSecret, environment);
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
		mAuthInjector.inject(request);

		if (request.baseUrl() == null) {
			request.baseUrl(mEnvironment.baseUrl());
		}

		if (request.requestBody() != null) {
			request.headers().headerIfNotPresent(CONTENT_TYPE.toString(), "application/json");
		}

		request.headers().headerIfNotPresent(ACCEPT_ENCODING.toString(), "gzip");

		return super.execute(request);
	}
}
