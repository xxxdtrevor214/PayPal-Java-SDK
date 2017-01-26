package com.paypal.sdk.invoices;

import com.paypal.sdk.HttpRequest;
import com.paypal.sdk.HttpResponse;
import com.paypal.sdk.PayPalHttpClient;
import com.paypal.sdk.http.Environment.Sandbox;
import com.paypal.sdk.http.exceptions.HttpServerException;
import com.paypal.sdk.models.invoices.Invoice;
import com.paypal.sdk.models.invoices.MerchantInfo;
import com.paypal.sdk.services.invoices.InvoicesRequestBuilder;

import java.io.IOException;

public class InvoiceSample {

	public static void main(String[] args) {
		InvoiceSample.basicConfig();
	}

	/**
	 * Basic config (minimum)
	 */
	public static void basicConfig() {
		// Construct a PayPalHttpClient with your clientId and secret
		PayPalHttpClient client = new PayPalHttpClient(
				"AYSq3RDGsmBLJE-otTkBtM-jBRd1TCQwFf9RGfwddNXWz0uFU9ztymylOhRS",
				"EGnHDxD_qRPdaLdZz8iCr8N7_MzF-YHPTkjs6NKYQvQSBngp4PTTVWkPZRbL",
				new Sandbox());

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
