package com.paypal.sdk.invoices;

import com.paypal.sdk.HttpRequest;
import com.paypal.sdk.HttpResponse;
import com.paypal.sdk.PayPalHttpClient;
import com.paypal.sdk.http.exceptions.HttpServerException;
import com.paypal.sdk.http.internal.Environment;
import com.paypal.sdk.http.internal.JSONFormatter;
import com.paypal.sdk.models.invoices.Invoice;
import com.paypal.sdk.services.invoices.InvoicesRequestBuilder;

import java.io.IOException;


public class InvoiceSample {

	public static void main(String[] args) {
		// Construct a PayPalHttpClient with your clientId and secret
		PayPalHttpClient client = new PayPalHttpClient(
				"AYSq3RDGsmBLJE-otTkBtM-jBRd1TCQwFf9RGfwddNXWz0uFU9ztymylOhRS",
				"EGnHDxD_qRPdaLdZz8iCr8N7_MzF-YHPTkjs6NKYQvQSBngp4PTTVWkPZRbL",
				Environment.SANDBOX);

		// Create an invoice object with the desired parameters
		Invoice invoice = new Invoice()
				.setInvoiceDate("01-22-2017");

		// Use a Request Builder to get an Http Request
		HttpRequest<Invoice> invoiceHttpRequest = InvoicesRequestBuilder.create(invoice);

		try {
			HttpResponse<Invoice> response = client.execute(invoiceHttpRequest);
			Invoice createdInvoice = response.result(); // The invoice returned from the API
		} catch (IOException e) {
			if (e instanceof HttpServerException) {
				// Inspect error for details from PayPal API
			} else {
				// A low-level i/o error occurred (timeout, etc.)
			}
		}
	}

	private static Invoice getInvoice() {
		return JSONFormatter.fromJSON("{\n" +
				"  \"merchant_info\": {\n" +
				"    \"email\": \"jaypatel512-facilitator@hotmail.com\",\n" +
				"    \"first_name\": \"Dennis\",\n" +
				"    \"last_name\": \"Doctor\",\n" +
				"    \"business_name\": \"Medical Professionals, LLC\",\n" +
				"    \"phone\": {\n" +
				"      \"country_code\": \"001\",\n" +
				"      \"national_number\": \"5032141716\"\n" +
				"    },\n" +
				"    \"address\": {\n" +
				"      \"line1\": \"1234 Main St.\",\n" +
				"      \"city\": \"Portland\",\n" +
				"      \"state\": \"OR\",\n" +
				"      \"postal_code\": \"97217\",\n" +
				"      \"country_code\": \"US\"\n" +
				"    }\n" +
				"  },\n" +
				"  \"billing_info\": [\n" +
				"  {\n" +
				"    \"email\": \"example@example.com\"\n" +
				"  }\n" +
				"  ],\n" +
				"  \"items\": [\n" +
				"  {\n" +
				"    \"name\": \"Sutures\",\n" +
				"    \"quantity\": 110,\n" +
				"    \"unit_price\": {\n" +
				"    \"currency\": \"USD\",\n" +
				"    \"value\": 5\n" +
				"    }\n" +
				"  }\n" +
				"  ],\n" +
				"  \"note\": \"Medical Invoice 16 Jul, 2013 PST\",\n" +
				"  \"payment_term\" :{\n" +
				"\t  \"term_type\": \"NET_45\"\n" +
				"  },\n" +
				"  \"shipping_info\": {\n" +
				"    \"first_name\": \"Sally\",\n" +
				"    \"last_name\": \"Patient\",\n" +
				"    \"business_name\": \"Not applicable\",\n" +
				"    \"phone\": {\n" +
				"      \"country_code\": \"001\",\n" +
				"      \"national_number\": \"5039871234\"\n" +
				"    },\n" +
				"    \"address\": {\n" +
				"    \"line1\": \"1234 Broad St.\",\n" +
				"    \"city\": \"Portland\",\n" +
				"    \"state\": \"OR\",\n" +
				"    \"postal_code\": \"97216\",\n" +
				"    \"country_code\": \"US\"\n" +
				"    }\n" +
				"  }\n" +
				"}\n", Invoice.class);
	}
}
