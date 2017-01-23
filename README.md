# PayPal SDK 2.0 Demo

This is a sample repository demonstrating our proposed approach for the newest major version of PayPal REST SDKs. 
The approach is defined by a rethinking of the way that these SDKs are generated, s.t. we only aim to generate simple objects and 
_blueprints_ for HTTP calls, instead of more complex networking code. This takes shape through a simple interface through
which generated code interacts with human-written networking code.

In a nutshell, there are two main modules in this project, `core` and `sdk`. `core` is the home to human-written networking
code, specifically an `HttpClient` class and our tailored subclass `PayPalHttpClient`. This class has one main method, `execute`
which takes in a generically typed `HttpRequest<T>` class and returns an `HttpResponse<T>` where `T` is the actual response
object which you as the developer expect to be returned.

`sdk`, consequently, contains _only_ generated code. There are simple model objects, and simple service classes which contain static methods.
Each of these methods simply returns an `HttpRequest` object, which the developer then passes to an `HttpClient` instance's `execute` method.

```java
PayPalHttpClient paypal = new PayPalHttpClient(
		"YOUR_CLIENT_ID",
		"YOUR_CLIENT_SECRET",
		SANDBOX);


Invoice invoiceParams = new Invoice()
          .setInvoiceDate("12-12-2016");
          ...

HttpRequest<Invoice> request = InvoicesService.create(invoiceParams);
try {
	Invoice createdInvoice = paypal.execute(request).result();
	System.out.println(createdInvoice.getId());
} catch (PayPalServerException ignored) {
	ignored.printStackTrace();
} catch (ClientException ignored) {
	ignored.printStackTrace();
}
```

In this example, a `PayPalServerException` is thrown we receive a non-200 level status code, and a `ClientException` is 
throw for generic i/o errors.

The simplicity of this approach puts more flexibility in the hands of the developer. For instance, if the above request fails,
they can attempt retries on their own terms, since they still have a reference to a blueprint of the HTTP request they
want to make.
