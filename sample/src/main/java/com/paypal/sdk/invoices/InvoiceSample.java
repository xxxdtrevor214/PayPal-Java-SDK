package com.paypal.sdk.invoices;

import com.paypal.sdk.HttpRequest;
import com.paypal.sdk.HttpResponse;
import com.paypal.sdk.OAuthInjector;
import com.paypal.sdk.PayPalHttpClient;
import com.paypal.sdk.http.Environment;
import com.paypal.sdk.http.Environment.Sandbox;
import com.paypal.sdk.http.exceptions.HttpServerException;
import com.paypal.sdk.model.AccessToken;
import com.paypal.sdk.model.RefreshToken;
import com.paypal.sdk.models.invoices.Invoice;
import com.paypal.sdk.models.invoices.MerchantInfo;
import com.paypal.sdk.services.TokenService;
import com.paypal.sdk.services.invoices.InvoicesRequestBuilder;

import java.io.IOException;

public class InvoiceSample {

	public static void main(String[] args) {
		InvoiceSample.basicConfig();

		Environment environment = new Sandbox("clientId", "clientSecret");

		try {
			TokenService basicTokenService = new TokenService(environment);
			AccessToken basicToken = basicTokenService.fetchAccessToken();
			RefreshToken refreshTokenFromAuth = basicTokenService.fetchRefreshToken("auth_code");
		} catch (IOException ignored) {}

		try {
			TokenService basicTokenService = new TokenService(environment);
			RefreshToken refreshTokenFromAuth = basicTokenService.fetchRefreshToken("auth_code");

			OAuthInjector injector = new OAuthInjector(environment, refreshTokenFromAuth.refreshToken());

			PayPalHttpClient client = new PayPalHttpClient(injector, environment);
		} catch (IOException ignored) {}
	}

	/**
	 * Basic config (minimum)
	 */
	public static void basicConfig() {
		Environment environment = new Sandbox("clientId", "clientSecret");

		// Construct a PayPalHttpClient with your clientId and secret
		PayPalHttpClient client = new PayPalHttpClient(environment);

		// Create an invoice object with the desired parameters
		Invoice invoice = new Invoice()
				.setMerchantInfo(new MerchantInfo()
						.setEmail("jaypatel512-facilitator@hotmail.com"));

		// Use a Request Builder to get an Http Request
		HttpRequest<Invoice> invoiceHttpRequest = InvoicesRequestBuilder.create(invoice);

		try {
			HttpResponse<Invoice> response = client.execute(invoiceHttpRequest);
			Invoice createdInvoice = response.result(); // The invoice returned from the API

			HttpRequest<Void> deleteRequest = InvoicesRequestBuilder.delete(createdInvoice.getId());
			client.execute(deleteRequest);
		} catch (IOException e) {
			if (e instanceof HttpServerException) {
				HttpServerException serverException = (HttpServerException) e;
				// inspect inspection for details from PayPal, including the response code
			} else {
				// A general i/o error occured
				e.printStackTrace();
			}
		}
	}
}
