// This class was generated on Wed, 28 Jun 2017 15:05:37 PDT by version 0.01 of Braintree SDK Generator
// PaymentCreateRequestTest.java
// DO NOT EDIT
// @type request
// @json {"Name":"payment.create","Description":"Creates a sale, an authorized payment to be captured later, or an order.\u003cbr/\u003e\u003cbr/\u003eTo create a sale, authorization, or order, include the payment details in the JSON request body. Set the `intent` to `sale`, `authorize`, or `order`. Include payer, transaction details, and, for PayPal payments only, redirect URLs. The combination of the `payment_method` and `funding_instrument` determines the type of payment that is created.\u003cbr/\u003e\u003cbr/\u003eFor more information, see [Payments REST API](/docs/integration/direct/payments/).\u003cblockquote\u003e\u003cstrong\u003eNotes:\u003c/strong\u003e \u003cul\u003e\u003cli\u003e\u003cp\u003e[Some countries](/docs/integration/direct/payments/country-currency-support/#direct-credit-card-payments) restrict direct credit card payment and related features.\u003c/p\u003e\u003c/li\u003e\u003cli\u003e\u003cp\u003eAuthorizations are guaranteed for up to three days, though you can attempt to capture an authorization for up to 29 days. After the three-day honor period authorization expires, you can [reauthorize](#authorization_reauthorize) the payment.\u003c/p\u003e\u003c/li\u003e\u003c/ul\u003e\u003c/blockquote\u003e","Parameters":[],"RequestType":{"Type":"Payment","VariableName":"body","Description":"A payment. Use this object to create, process, and manage payments.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null},"ResponseType":{"Type":"Payment","VariableName":"","Description":"A payment. Use this object to create, process, and manage payments.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null},"ContentType":"","HttpMethod":"POST","Path":"/v1/payments/payment","Visible":true,"ExpectedStatusCode":200,"FileSuffix":"Test"}

package com.paypal.sdk.payments.request;

import com.braintreepayments.http.HttpClient;
import com.braintreepayments.http.HttpResponse;
import com.paypal.sdk.TestHarness;
import com.paypal.sdk.payments.object.*;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Arrays;

import static org.testng.Assert.assertEquals;

public class PaymentCreateRequestTest extends TestHarness {

	public static HttpResponse<Payment> createPayment(HttpClient client, String intent) throws IOException {
		return createPayment(client, "credit_card", intent);
	}

	public static HttpResponse<Payment> createPayment(HttpClient client, String paymentMethod, String intent) throws IOException {
		PaymentCreateRequest request = new PaymentCreateRequest();
		Payment body = new Payment()
				.intent(intent)
				.transactions(Arrays.asList(
						new Transaction()
								.amount(new Amount().total("10").currency("USD"))
				))
				.redirectUrls(new RedirectUrls()
						.cancelUrl("http://paypal.com/cancel")
						.returnUrl("http://paypal.com/return"));

		if (paymentMethod.equals("credit_card")) {
			body.payer(new Payer()
					.paymentMethod("credit_card")
					.fundingInstruments(Arrays.asList(new FundingInstrument()
							.creditCard(new CreditCard()
									.billingAddress(new Address()
											.line1("123 Townsend st")
											.line2("Suite 600")
											.city("San Francisco")
											.state("CA")
											.countryCode("US")
											.postalCode("94117"))
									.cvv2("617")
									.expireMonth(01)
									.expireYear(2020)
									.firstName("Joe")
									.lastName("Shopper")
									.type("visa")
									.number("4422009910903049")))));
		} else {
			body.payer(new Payer()
					.paymentMethod("paypal"));
		}

		request.body(body);
		return client.execute(request);
	}

	@Test
	public void testPaymentCreateRequest() throws IOException {
		HttpResponse<Payment> response = PaymentCreateRequestTest.createPayment(client(), "sale");
		assertEquals(response.statusCode(), 201);
	}
}
