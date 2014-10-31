package com.paypal.api.payments;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.paypal.core.rest.JSONFormatter;
import com.paypal.core.rest.OAuthTokenCredential;
import com.paypal.core.rest.PayPalRESTException;
import com.paypal.core.rest.PayPalResource;

public class WebProfileTestCase {

	private static final Logger logger = Logger
			.getLogger(WebProfileTestCase.class);
	
	private String id = null;
	private String accessToken = null;
	private Random random = null;

	public static WebProfile loadWebProfile() {
	    try {
		    BufferedReader br = new BufferedReader(new FileReader("src/test/resources/webexperience_create.json"));
	        StringBuilder sb = new StringBuilder();
	        String line = br.readLine();

	        while (line != null) {
	            sb.append(line);
	            sb.append(System.getProperty("line.separator"));
	            line = br.readLine();
	        }
	        br.close();
	        return JSONFormatter.fromJSON(sb.toString(), WebProfile.class);
	        
	    } catch (IOException e) {
	    	e.printStackTrace();
	    	return null;
	    }
	}
	
	@BeforeTest
	public void setUp() throws PayPalRESTException {
		random = new Random();
		String clientID = "EBWKjlELKMYqRNQ6sYvFo64FtaRLRR5BdHEESmha49TM";
		String clientSecret = "EO422dn3gQLgDbuwqTjzrFgFtaRLRR5BdHEESmha49TM";
		this.accessToken = new OAuthTokenCredential(clientID,
				clientSecret).getAccessToken();
	}
	
	@Test
	public void testCreateWebProfile() throws PayPalRESTException {
		long randomNumber = random.nextLong();
		WebProfile webProfile = loadWebProfile();
		webProfile.setName(webProfile.getName() + String.valueOf(randomNumber));
		CreateProfileResponse response = webProfile.create(this.accessToken);
		this.id = response.getId();
		Assert.assertNotNull(response.getId());
	}
	
	@Test
	public void testRetrieveWebProfile() throws PayPalRESTException {
		WebProfile webProfile = WebProfile.get(this.accessToken, this.id);
		Assert.assertEquals(this.id, webProfile.getId());
	}
	
	@Test
	public void testListWebProfiles() throws PayPalRESTException {
		List<WebProfile> webProfileList = WebProfile.getList(this.accessToken);
		Assert.assertTrue(webProfileList.size() > 0);
	}
	
	@Test
	public void testUpdateWebProfile() throws PayPalRESTException {
		long randomNumber = random.nextLong();
		String newName = "YeowZa! T-Shirt Shop" + String.valueOf(randomNumber);
		WebProfile webProfile = loadWebProfile();
		webProfile.setId(this.id);
		webProfile.setName(newName);
		webProfile.update(this.accessToken);
		webProfile = WebProfile.get(this.accessToken, this.id);
		Assert.assertEquals(webProfile.getName(), newName);
	}
}
