package com.paypal.api.payments;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.paypal.core.ConfigManager;
import com.paypal.core.rest.APIContext;
import com.paypal.core.rest.OAuthTokenCredential;
import com.paypal.core.rest.PayPalRESTException;
import com.paypal.core.rest.QueryParameters;

public class PaymentTestCase {

	private static final Logger logger = Logger
			.getLogger(PaymentTestCase.class);

	private String createdPaymentID = null;

	private String saleID = null;

	public static final String CREATEDTIME = "2013-01-17T18:12:02.347Z";

	public static final String CANCELURL = "http://somedomain.com";

	public static final String RETURNURL = "http://somedomain.com";

	public static final String INTENT = "sale";

	public static final String ID = "12345";

	public static Payment payment;

	@BeforeClass
	public void beforeClass() throws PayPalRESTException {
		File testFile = new File(".",
				"src/test/resources/sdk_config.properties");
		Payment.initConfig(testFile);
	}

	@BeforeTest
	public void beforeTest() {

	}

	public static Payment createCallPayment() {
		Address billingAddress = AddressTestCase.createAddress();

		CreditCard creditCard = new CreditCard();
		creditCard.setBillingAddress(billingAddress);
		creditCard.setCvv2("874");
		creditCard.setExpireMonth(11);
		creditCard.setExpireYear(2018);
		creditCard.setFirstName("Joe");
		creditCard.setLastName("Shopper");
		creditCard.setNumber("4417119669820331");
		creditCard.setType("visa");

		// AmountDetails amountDetails = new AmountDetails();
		// amountDetails.setShipping("10");
		// amountDetails.setSubtotal("75");
		// amountDetails.setTax("15");

		Amount amount = new Amount();
		amount.setCurrency("USD");
		amount.setTotal("7");
		// amount.setDetails(amountDetails);

		Transaction transaction = new Transaction();
		transaction.setAmount(amount);
		transaction
				.setDescription("This is the payment transaction description.");
		List<Transaction> transactions = new ArrayList<Transaction>();
		transactions.add(transaction);

		FundingInstrument fundingInstrument = new FundingInstrument();
		fundingInstrument.setCreditCard(creditCard);
		List<FundingInstrument> fundingInstrumentList = new ArrayList<FundingInstrument>();
		fundingInstrumentList.add(fundingInstrument);

		Payer payer = new Payer();
		payer.setFundingInstruments(fundingInstrumentList);
		payer.setPaymentMethod("credit_card");

		Payment payment = new Payment();
		payment.setIntent("sale");
		payment.setPayer(payer);
		payment.setTransactions(transactions);
		return payment;
	}

	public static Payment createPayment() {
		Address billingAddress = AddressTestCase.createAddress();

		CreditCard creditCard = new CreditCard();
		creditCard.setBillingAddress(billingAddress);
		creditCard.setCvv2("874");
		creditCard.setExpireMonth(11);
		creditCard.setExpireYear(2018);
		creditCard.setFirstName("Joe");
		creditCard.setLastName("Shopper");
		creditCard.setNumber("4111111111111111");
		creditCard.setType("visa");

		Details amountDetails = new Details();
		amountDetails.setShipping("10");
		amountDetails.setSubtotal("75");
		amountDetails.setTax("15");

		Amount amount = new Amount();
		amount.setCurrency("USD");
		amount.setTotal("100");
		amount.setDetails(amountDetails);

		Payee payee = new Payee();
		payee.setMerchantId("NMXBYHSEL4FEY");

		Transaction transaction = new Transaction();
		transaction.setAmount(amount);
		transaction.setPayee(payee);
		transaction
				.setDescription("This is the payment transaction description.");
		List<Transaction> transactions = new ArrayList<Transaction>();
		transactions.add(transaction);

		FundingInstrument fundingInstrument = new FundingInstrument();
		fundingInstrument.setCreditCard(creditCard);
		List<FundingInstrument> fundingInstrumentList = new ArrayList<FundingInstrument>();
		fundingInstrumentList.add(fundingInstrument);

		Payer payer = new Payer();
		payer.setFundingInstruments(fundingInstrumentList);
		payer.setPaymentMethod("credit_card");

		List<Links> links = new ArrayList<Links>();
		links.add(LinksTestCase.createLinks());

		RedirectUrls redirectUrls = RedirectUrlsTestCase.createRedirectUrls();

		Payment payment = new Payment();
		payment.setIntent("sale");
		payment.setId(ID);
		payment.setPayer(payer);
		payment.setTransactions(transactions);
		payment.setCreateTime(CREATEDTIME);
		payment.setLinks(links);
		payment.setRedirectUrls(redirectUrls);
		return payment;
	}

	public static Payment createPaymentForExecution() {
		Details amountDetails = new Details();
		amountDetails.setShipping("10");
		amountDetails.setSubtotal("75");
		amountDetails.setTax("15");

		Amount amount = new Amount();
		amount.setCurrency("USD");
		amount.setTotal("100");
		amount.setDetails(amountDetails);

		RedirectUrls redirectUrls = new RedirectUrls();
		redirectUrls.setCancelUrl("http://www.hawaii.com");
		redirectUrls.setReturnUrl("http://www.hawaii.com");

		Transaction transaction = new Transaction();
		transaction.setAmount(amount);
		transaction
				.setDescription("This is the payment transaction description.");
		List<Transaction> transactions = new ArrayList<Transaction>();
		transactions.add(transaction);

		Payer payer = new Payer();
		payer.setPaymentMethod("paypal");

		Payment payment = new Payment();
		payment.setIntent("sale");
		payment.setPayer(payer);
		payment.setRedirectUrls(redirectUrls);
		payment.setTransactions(transactions);
		return payment;
	}

	@Test()
	public void testConstruction() {
		Payment payment = createPayment();
		Assert.assertEquals(payment.getPayer().getPaymentMethod(),
				"credit_card");
		Assert.assertEquals(payment.getTransactions().get(0).getAmount()
				.getTotal(), "100");
		Assert.assertEquals(payment.getIntent(), INTENT);
		Assert.assertEquals(payment.getRedirectUrls().getCancelUrl(),
				RedirectUrlsTestCase.CANCELURL);
		Assert.assertEquals(payment.getRedirectUrls().getReturnUrl(),
				RedirectUrlsTestCase.RETURNURL);
		Assert.assertEquals(payment.getId(), ID);
		Assert.assertEquals(payment.getCreateTime(), CREATEDTIME);
		Assert.assertEquals(payment.getLinks().size(), 1);
	}

	@Test
	public void testCreatePaymentAPI() throws PayPalRESTException {
		logger.info("**** Create Payment ****");
		String clientID = ConfigManager.getInstance().getValue("clientID");
		String clientSecret = ConfigManager.getInstance().getValue(
				"clientSecret");
		TokenHolder.accessToken = new OAuthTokenCredential(clientID,
				clientSecret).getAccessToken();
		logger.info("Generated Access Token = " + TokenHolder.accessToken);
		Payment payment = createCallPayment();
		Payment createdPayment = payment.create(TokenHolder.accessToken);
		logger.info("Request = " + Payment.getLastRequest());
		logger.info("Response = " + Payment.getLastResponse());
		logger.info("Payment created with ID = " + createdPayment.getId());
		createdPaymentID = createdPayment.getId();
		String json = Payment.getLastResponse();
		JsonParser parser = new JsonParser();
		JsonElement jsonElement = parser.parse(json);
		JsonObject obj = jsonElement.getAsJsonObject();

		// State of a created payment object is approved
		Assert.assertEquals(true, obj.get("state").getAsString()
				.equalsIgnoreCase("approved"));
		saleID = obj.get("transactions").getAsJsonArray().get(0)
				.getAsJsonObject().get("related_resources").getAsJsonArray()
				.get(0).getAsJsonObject().get("sale").getAsJsonObject()
				.get("id").getAsString();
	}

	
	@Test(dependsOnMethods = { "testCreatePaymentAPI" })
	public void testA() throws PayPalRESTException {
		logger.info("**** Create CreditCard ****");
		logger.info("Generated Access Token = " + TokenHolder.accessToken);

		CreditCard creditCard = new CreditCard();
		creditCard.setExpireMonth(11);
		creditCard.setExpireYear(2018);
		creditCard.setNumber("4417119669820331");
		creditCard.setType("visa");
		CreditCard responseCreditCard = creditCard.create(TokenHolder.accessToken);
		logger.info("Request = " + CreditCard.getLastRequest());
		logger.info("Response = " + CreditCard.getLastResponse());
		logger.info("Credit Card created with ID = " + responseCreditCard.getId());
		Assert.assertEquals(true,
				"ok".equalsIgnoreCase(responseCreditCard.getState()));
		logger.info("Created Credit Card status = "
				+ responseCreditCard.getState());
		String createdCreditCardId = responseCreditCard.getId();
		
		System.out.println("CC: " + responseCreditCard);
		
		responseCreditCard.delete(TokenHolder.accessToken);
	}

}
