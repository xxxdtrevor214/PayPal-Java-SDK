# Migrating from Version 1 to Version 2

## 1. Initialize SDK

#### BEFORE
```java

APIContext apiContext = new APIContext(clientID, clientSecret, mode);
```

#### AFTER
```java
PayPalEnvironment environment = new PayPalEnvironment.Sandbox(clientId, clientSecret);
PayPalHttpClient paypal = new PayPalHttpClient(environment);
```

# 2. Create Object

#### BEFORE
```java
Payment payment = new Payment();
                    .setIntent("sale");
                    .setPayer(new Payer()
                        .setPaymentMethod("paypal"));
...
```

#### AFTER
```java
Payment payment = new Payment();
                    .intent("sale");
                    .payer(new Payer()
                        .paymentMethod("paypal"));
...
```

# 3. Make the call

#### BEFORE
```java
try {
  Payment createdPayment = payment.create(apiContext);
} catch (PayPalRESTException ex) {
  ex.printStackTrace();
}
```
#### AFTER
```java
// Form a request object from invoice data
PaymentCreateRequest request = new PaymentCreateRequest()
      .body(payment);
try {
    Payment createdPayment = paypal.execute(request).result();
    System.out.println(createdPayment.getId());
} catch (IOException ioe) {
    ioe.printStackTrace();
}
```

