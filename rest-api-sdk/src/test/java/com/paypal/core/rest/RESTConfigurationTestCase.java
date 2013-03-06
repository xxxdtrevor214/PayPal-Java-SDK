package com.paypal.core.rest;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.paypal.api.payments.Payment;
import com.paypal.api.payments.Sale;

public class RESTConfigurationTestCase {

	@Test(dependsOnMethods = { "testErrorAccessToken" })
	public void testRESTConfiguration() {
		File testFile = new File(".",
				"src/test/resources/error_sdk_config.properties");
		try {
			Payment.initConfig(testFile);
			RESTConfiguration restConfiguration = new RESTConfiguration();
			restConfiguration.setHttpMethod(HttpMethod.POST);
			restConfiguration.setResourcePath("/a/b/c");
			restConfiguration.getHttpConfigurations();
			URL url = restConfiguration.getBaseURL();
			Assert.assertEquals(true, url.toString().endsWith("/"));
		} catch (PayPalRESTException e) {
			Assert.fail();
		} catch (MalformedURLException e) {
			Assert.fail();
		} catch (URISyntaxException e) {
			Assert.fail();
		}
	}

	@Test(dependsOnMethods = { "testRESTConfiguration" })
	public void testRESTHeaderConfiguration() {
		File testFile = new File(".",
				"src/test/resources/error_sdk_config.properties");
		try {
			Payment.initConfig(testFile);
			RESTConfiguration restConfiguration = new RESTConfiguration();
			restConfiguration.setHttpMethod(HttpMethod.POST);
			restConfiguration.setResourcePath("/a/b/c");
			restConfiguration.getHttpConfigurations();
			Map<String, String> headers = restConfiguration.getHeaders();
			Assert.assertEquals(headers.size() != 0, true);
			String header = headers.get("User-Agent");
			String[] hdrs = header.split("\\(");
			hdrs = hdrs[1].split(";");
			Assert.assertEquals(hdrs.length == 4, true);
		} catch (PayPalRESTException e) {
			Assert.fail();
		} catch (MalformedURLException e) {
			Assert.fail();
		} catch (URISyntaxException e) {
			Assert.fail();
		}
	}

	@Test(dependsOnMethods = { "testRESTHeaderConfiguration" })
	public void testRESTConfigurationURL() {
		File testFile = new File(".",
				"src/test/resources/error_sdk_config.properties");
		try {
			Sale.initConfig(testFile);
			RESTConfiguration restConfiguration = new RESTConfiguration();
			restConfiguration.setHttpMethod(HttpMethod.POST);
			restConfiguration.setResourcePath("/a/b/c");
			String urlString = "https://sample.com";
			restConfiguration.setUrl(urlString);
			URL returnURL = restConfiguration.getBaseURL();
			Assert.assertEquals(true, returnURL.toString().endsWith("/"));
		} catch (PayPalRESTException e) {
			Assert.fail();
		} catch (MalformedURLException e) {
			Assert.fail();
		}
	}
}
