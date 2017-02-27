# PayPal SDK 2.0.0-alpha

This is a preview of how PayPal SDKs will look in the next major version. We've simplified the intereface to only provide
simple model objects and blueprints for HTTP calls. This repo currently only contains functionality for working with invoices
and invoice templates to serve as an example of the API going forward.

### Creating an Invoice

```java
// Construct a PayPalHttpClient with your clientId and secret
PayPalEnvironment environment = new PayPalEnvironment.Sandbox(
		"AYSq3RDGsmBLJE-otTkBtM-jBRd1TCQwFf9RGfwddNXWz0uFU9ztymylOhRS",
		"EGnHDxD_qRPdaLdZz8iCr8N7_MzF-YHPTkjs6NKYQvQSBngp4PTTVWkPZRbL");

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
```

To try this out, clone this repo and either create your own samples directly in the `sample` module, or copy the code into your
project, to see how it might affect your existing integration.

Please feel free to create an issue in this repo with any feedback, questions, or concerns you have.

*NOTE*: This API is still in alpha, is subject to change, and should not be used in production.
