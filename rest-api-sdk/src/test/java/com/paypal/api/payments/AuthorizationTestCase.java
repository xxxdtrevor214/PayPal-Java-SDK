package com.paypal.api.payments;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.paypal.core.rest.PayPalRESTException;
import com.paypal.core.rest.PayPalResource;

public class AuthorizationTestCase {

	private static final Logger logger = Logger
			.getLogger(AuthorizationTestCase.class);

	public static final String ID = "12345";

	public static final String PARENTPAYMENT = "12345";

	public static final String STATE = "Approved";

	public static final Amount AMOUNT = AmountTestCase.createAmount("120.00");

	public static final String CREATEDTIME = "2013-01-17T18:12:02.347Z";

	public String authorizationId = null;

	public Authorization authorization = null;

	@BeforeClass
	public void beforeClass() throws PayPalRESTException {
		File testFile = new File(".",
				"src/test/resources/sdk_config.properties");
		PayPalResource.initConfig(testFile);
	}

	public static Authorization createAuthorization() {
		List<Links> links = new ArrayList<Links>();
		links.add(LinksTestCase.createLinks());
		Authorization authorization = new Authorization();
		authorization.setId(ID);
		authorization.setParentPayment(PARENTPAYMENT);
		authorization.setState(STATE);
		authorization.setAmount(AMOUNT);
		authorization.setCreateTime(CREATEDTIME);
		authorization.setLinks(links);
		return authorization;
	}

	@Test
	public void testConstruction() {
		Authorization authorization = createAuthorization();
		Assert.assertEquals(authorization.getId(), ID);
		Assert.assertEquals(authorization.getCreateTime(), CREATEDTIME);
		Assert.assertEquals(authorization.getLinks().size(), 1);
		Assert.assertEquals(authorization.getParentPayment(), PARENTPAYMENT);
		Assert.assertEquals(authorization.getState(), STATE);
		Assert.assertEquals(authorization.getAmount().getCurrency(),
				AmountTestCase.CURRENCY);
	}

	@Test(dependsOnMethods = { "testGetRefundForNull" })
	public void testGetAuthorization() throws PayPalRESTException {
		logger.info("**** Authorize Payment ****");
		Payment payment = getPaymentAgainstAuthorization();
		Payment authPayment = payment.create(TokenHolder.accessToken);
		logger.info("Authorization Payment created with ID = "
				+ authPayment.getId());
		authorizationId = authPayment.getTransactions().get(0)
				.getRelatedResources().get(0).getAuthorization().getId();
		logger.info("Retrieving Authorization using id = " + authorizationId);
		authorization = Authorization.get(TokenHolder.accessToken,
				authorizationId);
		Assert.assertEquals(authorization.getId(), authPayment.getTransactions().get(0)
				.getRelatedResources().get(0).getAuthorization().getId());
		logger.info("Request = " + Authorization.getLastRequest());
		logger.info("Response = " + Authorization.getLastResponse());
		logger.info("Authorization State: " + authorization.getState());
	}

	@Test(dependsOnMethods = { "testGetAuthorization" })
	public void testAuthorizationCapture() throws PayPalRESTException {
		logger.info("**** Capture Authorization ****");
		Capture capture = new Capture();
		Amount amount = new Amount();
		amount.setCurrency("USD").setTotal("1");
		capture.setAmount(amount);
		capture.setIsFinalCapture(true);
		Capture responsecapture = authorization.capture(
				TokenHolder.accessToken, capture);
		Assert.assertEquals(responsecapture.getState(), "completed");
		logger.info("Request = " + Authorization.getLastRequest());
		logger.info("Response = " + Authorization.getLastResponse());
		logger.info("Returned Capture state: " + responsecapture.getState());
	}

	@Test(dependsOnMethods = { "testAuthorizationCapture" })
	public void testAuthorizationVoid() throws PayPalRESTException {
		logger.info("**** Void Authorization ****");
		Authorization auth = getAuthorization();
		Authorization responseAuthorization = auth
				.doVoid(TokenHolder.accessToken);
		Assert.assertEquals(responseAuthorization.getState(), "voided");
		logger.info("Request = " + Authorization.getLastRequest());
		logger.info("Response = " + Authorization.getLastResponse());
		logger.info("Returned Authorization state: "
				+ responseAuthorization.getState());
	}

	@Test(expectedExceptions = { IllegalArgumentException.class })
	public void testAuthorizationNullAccessToken() throws PayPalRESTException {
		logger.info("**** Get Authorization (Null Access Token) ****");
		Authorization auth = Authorization.get((String) null, "123");
	}
	
	@Test(expectedExceptions = { IllegalArgumentException.class })
	public void testAuthorizationNullAuthId() throws PayPalRESTException {
		logger.info("**** Get Authorization (Null Auth ID) ****");
		Authorization auth = Authorization.get(TokenHolder.accessToken, null);
	}
	
	@Test(expectedExceptions = { IllegalArgumentException.class })
	public void testAuthorizationNullCapture() throws PayPalRESTException {
		logger.info("**** Capture Authorization (Null Capture) ****");
		Capture responsecapture = getAuthorization().capture(TokenHolder.accessToken, null);
	}

	@Test
	public void testTOJSON() {
		Authorization authorization = createAuthorization();
		Assert.assertEquals(authorization.toJSON().length() == 0, false);
	}

	@Test
	public void testTOString() {
		Authorization authorization = createAuthorization();
		Assert.assertEquals(authorization.toString().length() == 0, false);
	}

	private Payment getPaymentAgainstAuthorization() {
		Payment payment = new Payment();
		Details details = new Details();
		details.setShipping("10");
		details.setSubtotal("75");
		details.setTax("15");

		Amount amount = new Amount();
		amount.setCurrency("USD");
		amount.setTotal("100");
		amount.setDetails(details);

		Transaction transaction = new Transaction();
		transaction.setAmount(amount);
		transaction
				.setDescription("This is the payment authorization description.");
		List<Transaction> transactions = new ArrayList<Transaction>();
		transactions.add(transaction);

		FundingInstrument fundingInstrument = new FundingInstrument();
		fundingInstrument.setCreditCard(CreditCardTestCase.createCreditCard());
		List<FundingInstrument> fundingInstruments = new ArrayList<FundingInstrument>();
		fundingInstruments.add(fundingInstrument);

		Payer payer = new Payer();
		payer.setPaymentMethod("credit_card");
		payer.setFundingInstruments(fundingInstruments);

		payment.setIntent("authorize");
		payment.setPayer(payer);
		payment.setTransactions(transactions);
		return payment;
	}

	private Authorization getAuthorization() throws PayPalRESTException {
		Payment payment = getPaymentAgainstAuthorization();
		Payment authPayment = payment.create(TokenHolder.accessToken);
		Authorization authorization = authPayment.getTransactions().get(0)
				.getRelatedResources().get(0).getAuthorization();
		return authorization;
	}

}
