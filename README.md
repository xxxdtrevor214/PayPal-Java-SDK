# PayPal SDK 2.0-RC1

This is a preview of how PayPal SDKs will look in the next major version. We've simplified the intereface to only provide
simple model objects and blueprints for HTTP calls. This repo currently only contains functionality for working with invoices
and invoice templates to serve as an example of the API going forward.


### Creating an Invoice

```java
// Construct a PayPalHttpClient with your clientId and secret
PayPalHttpClient client = new PayPalHttpClient(
		"AYSq3RDGsmBLJE-otTkBtM-jBRd1TCQwFf9RGfwddNXWz0uFU9ztymylOhRS",
		"EGnHDxD_qRPdaLdZz8iCr8N7_MzF-YHPTkjs6NKYQvQSBngp4PTTVWkPZRbL",
		Environment.SANDBOX);

// Create an invoice object with the desired parameters
Invoice invoice = new Invoice()
		.setInvoiceDate("01-22-2017");
// set additional invoice params as needed

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
```

To try this out, clone this repo and either create your own samples directly in the `sample` module, or copy the code into your
project, to see how it might affect your existing integration.

Please feel free to create an issue in this repo with any feedback, questions, or concerns you have.
