# Migrating from Version 1 to Version 2

## 1. Initialize SDK

#### BEFORE
```java

APIContext apiContext = new APIContext(clientID, clientSecret, mode);
```

#### AFTER
```java
PayPalHttpClient paypal = new PayPalHttpClient("clientId", "clientSecret", Environment.SANDBOX);
```

# 2. Create Object

#### BEFORE
```java
Invoice invoice = new Invoice();

MerchantInfo merchantInfo = new MerchantInfo();
merchantInfo.setEmail("invoice@email.com");
...
```

#### AFTER
```java
Invoice invoice = new Invoice();

MerchantInfo merchantInfo = new MerchantInfo();
merchantInfo.setEmail("invoice@email.com");
...
```

# 3. Make the call

#### BEFORE
```java
try {
  Invoice createdInvoice = invoice.create(apiContext);
} catch (PayPalRESTException ex) {
  ex.printStackTrace();
}
```
#### AFTER
```java
// Form a request object from invoice data
HttpRequest<Invoice> request = InvoiceRequestBuilder.create(invoiceParams);
try {
    Invoice createdInvoice = paypal.execute(request).result();
    System.out.println(createdInvoice.getId());
} catch (IOException ioe) {
    ioe.printStackTrace();
}
```


