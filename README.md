# PayPal SDK 2.0.0-beta

This is a preview of how PayPal SDKs will look in the next major version. We've simplified the interface to only provide
simple model objects and blueprints for HTTP calls. This repo currently only contains functionality for working with payments
to serve as an example and early beta of the API going forward.

### Creating a Payment

```java
// Construct an environment with your client id and secret"
PayPalEnvironment environment = new PayPalEnvironment.Sandbox(
        "AYSq3RDGsmBLJE-otTkBtM-jBRd1TCQwFf9RGfwddNXWz0uFU9ztymylOhRS",
        "EGnHDxD_qRPdaLdZz8iCr8N7_MzF-YHPTkjs6NKYQvQSBngp4PTTVWkPZRbL");

// Use this environment to construct a PayPalHttpClient
PayPalHttpClient client = new PayPalHttpClient(environment);

// Construct a request object and set the desired parameters.
// In this case, a PaymentCreateRequest constructs an POST request to /v1/payments
PaymentCreateRequest request = new PaymentCreateRequest()
        .body(new Payment()
                .intent("sale")
                .payer(new Payer()
                        .paymentMethod("paypal"))
                .transactions(Arrays.asList(
                        new Transaction()
                                .amount(new Amount().total("10").currency("USD"))
                ))
                .redirectUrls(new RedirectUrls()
                        .cancelUrl("http://paypal.com/cancel")
                        .returnUrl("http://paypal.com/return")));

try {
    // Use your client to execute a request and get a response back
    HttpResponse<Payment> paymentResponse = client.execute(request);

    // If the endpoint returns a body in its response, you can access the deserialized 
    // version by calling result() on the response.
    Payment payment = paymentResponse.result();
} catch (IOException ioe) {
    if (ioe instanceof HttpException) {
        // Something went wrong server-side
        HttpException he = (HttpException) ioe);
        int statusCode = he.getStatusCode();
        String debugId = he.getHeaders().header("PayPal-Debug-Id");
    } else {
        // Something went wrong client-side
    }
}
```

For a more in-depth look into this pattern, check out some of the [request objects](https://github.com/paypal/PayPal-Java-SDK/tree/2.0-generated-example/paypal-sdk/src/main/java/com/paypal/sdk/payments/request).

## Building

To try this out, clone this repo and run:
```sh
 $ ./gradlew clean build
```
then, copy `paypal-sdk-2.0.jar` from `paypal-sdk/build/libs` into your project.

Please feel free to create an issue in this repo with any feedback, questions, or concerns you have.

## Running tests

To run integration tests using your client id and secret, run the `test` gradle command with the `-Pintegration` flag
```sh
$ PAYPAL_CLIENT_ID=your_client_id PAYPAL_CLIENT_SECRET=your_client_secret ./gradlew clean test -Pintegration
```

You may use the client id and secret above for demonstration purposes.


*NOTE*: This API is still in beta, is subject to change, and should not be used in production.
