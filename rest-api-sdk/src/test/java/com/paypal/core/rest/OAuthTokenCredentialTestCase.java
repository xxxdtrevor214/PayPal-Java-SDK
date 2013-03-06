package com.paypal.core.rest;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.paypal.api.payments.Payment;
import com.paypal.api.payments.PaymentTestCase;

import com.paypal.core.ConfigManager;

public class OAuthTokenCredentialTestCase {

	private static final Logger logger = Logger
			.getLogger(PaymentTestCase.class);

	String clientID;
	String clientSecret;

	@BeforeClass
	public void beforeClass() {
		// ##Load Configuration
		// Load SDK configuration for
		// the resource.
		InputStream is = OAuthTokenCredentialTestCase.class
				.getResourceAsStream("/sdk_config.properties");

		try {
			PayPalResource.initConfig(is);
		} catch (PayPalRESTException e) {
			logger.error(e.getMessage());
		}
		clientID = ConfigManager.getInstance().getValue("clientID");
		clientSecret = ConfigManager.getInstance().getValue("clientSecret");
	}

	@Test(dependsOnMethods = { "testGetRefund" })
	public void testGetAccessToken() throws PayPalRESTException {

		OAuthTokenCredential merchantTokenCredential = new OAuthTokenCredential(
				clientID, clientSecret);

		String accessToken = merchantTokenCredential.getAccessToken();
		logger.info("Generated Access Token = " + accessToken);
		Assert.assertEquals(true, accessToken.length() > 0);
	}

	@Test(dependsOnMethods = { "testGetAccessToken" })
	public void testErrorAccessToken() {
		File testFile = new File(".",
				"src/test/resources/error_sdk_config.properties");
		try {
			Payment.initConfig(testFile);
			clientID = ConfigManager.getInstance().getValue("clientID");
			clientSecret = ConfigManager.getInstance().getValue("clientSecret");
			OAuthTokenCredential merchantTokenCredential = new OAuthTokenCredential(
					clientID, clientSecret);
			String accessToken = merchantTokenCredential.getAccessToken();
		} catch (PayPalRESTException e) {
			Assert.assertEquals(true, e.getCause() instanceof IOException);
		}
	}
}
