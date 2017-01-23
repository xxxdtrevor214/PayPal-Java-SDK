package com.paypal.sdk;

import com.paypal.sdk.http.internal.DefaultHttpClient;
import com.paypal.sdk.http.internal.Environment;
import com.paypal.sdk.http.internal.HttpClient;
import com.paypal.sdk.services.AuthService;
import com.paypal.sdk.services.OAuthService;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;

import static com.paypal.sdk.http.internal.Headers.HttpHeader.ACCEPT_ENCODING;
import static com.paypal.sdk.http.internal.Headers.HttpHeader.CONTENT_TYPE;

@Slf4j
public class PayPalHttpClient extends DefaultHttpClient implements HttpClient {

    protected String mBaseUrl;

    protected AuthService mAuthService;

    public PayPalHttpClient(String clientId, String clientSecret, Environment environment) {
    	mBaseUrl = environment.baseUrl;
		mAuthService = new OAuthService(clientId, clientSecret, environment);
    }

    public PayPalHttpClient(AuthService authService) {
    	mBaseUrl = authService.getBaseUrl();
    	mAuthService = authService;
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
		signRequest(request);
		return super.execute(request);
	}

	protected <T> void signRequest(HttpRequest<T> request) throws IOException {
		mAuthService.signRequest(request, this);
	}

	protected <T> void prepareRequest(HttpRequest<T> request) {
		super.prepareRequest(request);

		if (request.requestBody() != null) {
			request.headers().headerIfNotPresent(CONTENT_TYPE.toString(), "application/json");
		}

		request.headers().headerIfNotPresent(ACCEPT_ENCODING.toString(), "gzip");
		request.baseUrl(mBaseUrl);
	}
}
