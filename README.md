# PayPal SDK 2.0.0-alpha

This is a preview of how PayPal SDKs will look in the next major version. We've simplified the interface to only provide
simple model objects and blueprints for HTTP calls. This repo currently only contains functionality for working with webhooks
to serve as an example of the API going forward.

### Getting a list of webook events

```java
// Construct a PayPalHttpClient with your clientId and secret
PayPalEnvironment environment = new PayPalEnvironment.Sandbox(
        "AYSq3RDGsmBLJE-otTkBtM-jBRd1TCQwFf9RGfwddNXWz0uFU9ztymylOhRS",
        "EGnHDxD_qRPdaLdZz8iCr8N7_MzF-YHPTkjs6NKYQvQSBngp4PTTVWkPZRbL");

PayPalHttpClient client = new PayPalHttpClient(environment);

AvailableEventTypeListRequest request = new AvailableEventTypeListRequest();

try {
    HttpResponse<EventTypeList> resp = client.execute(request);
    EventTypeList eventTypeList = resp.result();
} catch(IOException ioe) {
    if (ioe instanceof APIException) {
        APIException exception = (APIException) ioe;
        String debugId = exception.getHeaders().header("Paypal-Debug-Id");
    } else {
        ioe.printStackTrace();
    }
}
```

To try this out, clone this repo and run:
```sh
 $ ./gradlew clean build
```
then, copy `paypal-sdk-2.0.jar` from `paypal-sdk/build/libs` into your project.

Please feel free to create an issue in this repo with any feedback, questions, or concerns you have.

*NOTE*: This API is still in alpha, is subject to change, and should not be used in production.
