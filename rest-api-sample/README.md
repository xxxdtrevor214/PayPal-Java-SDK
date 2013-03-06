REST API Samples
===================


This sample project contains a set of simple command line samples that you can explore to understand what the REST APIs can do for you.
The sample comes pre-configured with a test account but in case you need to try them against your account, you must
   
   * Obtain your client id and client secret from the developer portal

Test Account
------------

   * Test Client ID and Client Secret can be found in the file Credentials.java under the samples package.
   * The endpoint URL for token generation and API calls are fetched from sdk_config.properties file under src/main/resources/ folder.
   * AccessToken are generated once using GenerateAccessToken.java and used for the samples.
   
Build and run the samples
--------------------------
	* Simply run `mvn install` to build war file.
	* Run `mvn jetty:run` to run the war file using maven jetty.
	* Access `http://localhost:<jetty-port>/rest-spi-sample/` in your browser to play with the test pages, `<jetty-port>` is configurable in pom.xml.

Samples
========

CreateCreditCardSample
----------------------

CreateCreditCardSample shows you how to create a CreditCard by POSTing to the URI /v1/vault/credit-card. The response of the sample is a valid CreditCard object created by the API.

CreatePaymentSample
-------------------

CreatePaymentSample shows you how to create a Payment by POSTing a Payment object to the URI '/v1/payments/payment'. This sample typically shows you how to create a Payment using CreditCard as a payment method. The response of the sample is valid Payment ID retrieved from the call.

GetCreditCardSample
-------------------

GetCreditCardSample shows you how to retrieve a CreditCard from the service. The sample takes a valid CreditCard ID as an input and fetches the CreditCard resource associated with the ID.

GetPaymentHistorySample
-----------------------

GetPaymentHistorySample shows you how to retrieve a PaymentHistory using count parameter. There are various parameters that can be used to retrieve a PaymentHistory like count, startId, startIndex, payeeId. This samples shows you how to use the count parameter.

GetPaymentSample
----------------

GetPaymentSample shows you how to retrieve a Payment from the service. The sample takes a valid Payment ID as an input and fetches the Payment resource associated with the ID.

GetSaleSample
-------------

GetSaleSample shows you how to retrieve a Sale from a Sale ID using the API. This sample is self contained in sense that it starts by creating a Payment with sale as the intent, retrieves the Sale ID associated with the Payment resource. The sample then fetches the Sale resource associated with the Sale ID.

SaleRefundSample
----------------

SaleRefundSample shows you how to Refund on a Sale resource. The sample creates a Payment with sale as the intent, Sale ID from the response is used to create a Sale object. The sample then calls the Refund API on the Sale object.