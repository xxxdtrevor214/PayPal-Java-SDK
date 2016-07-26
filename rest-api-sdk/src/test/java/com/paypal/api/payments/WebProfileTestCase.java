package com.paypal.api.payments;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Random;

import com.paypal.base.rest.*;
import com.paypal.base.util.TestConstants;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

public class WebProfileTestCase {

	private static final Logger logger = Logger.getLogger(WebProfileTestCase.class);
	private String id = null;
	//public static String clientID = "EBWKjlELKMYqRNQ6sYvFo64FtaRLRR5BdHEESmha49TM";
	//public static String clientSecret = "EO422dn3gQLgDbuwqTjzrFgFtaRLRR5BdHEESmha49TM";
	public static final APIContext SANDBOXCONTEXTWEBPROFILE = new APIContext(TestConstants.SANDBOX_CLIENTID, TestConstants.SANDBOX_CLIENTSECRET, "sandbox");

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
	
	@Test(groups = "integration")
	public void testCreateWebProfile() throws PayPalRESTException {
		Random random = new Random();
		long randomNumber = random.nextLong();
		WebProfile webProfile = loadWebProfile();
		webProfile.setName(webProfile.getName() + String.valueOf(randomNumber));
		CreateProfileResponse response = webProfile.create(SANDBOXCONTEXTWEBPROFILE);
		this.id = response.getId();
		Assert.assertNotNull(response.getId());
	}
	
	@Test(groups = "integration", dependsOnMethods = { "testCreateWebProfile" })
	public void testRetrieveWebProfile() throws PayPalRESTException {
		WebProfile webProfile = WebProfile.get(SANDBOXCONTEXTWEBPROFILE, this.id);
		Assert.assertEquals(this.id, webProfile.getId());
	}
	
	@Test(groups = "integration", dependsOnMethods = { "testCreateWebProfile" })
	public void testListWebProfiles() throws PayPalRESTException {
		List<WebProfile> webProfileList = WebProfile.getList(SANDBOXCONTEXTWEBPROFILE);
		Assert.assertTrue(webProfileList.size() > 0);
	}
	
	@Test(groups = "integration", dependsOnMethods = { "testCreateWebProfile" })
	public void testUpdateWebProfile() throws PayPalRESTException {
		Random random = new Random();
		long randomNumber = random.nextLong();
		String newName = "YeowZa! T-Shirt Shop" + String.valueOf(randomNumber);
		WebProfile webProfile = loadWebProfile();
		webProfile.setId(this.id);
		webProfile.setName(newName);
		webProfile.update(SANDBOXCONTEXTWEBPROFILE);
		webProfile = WebProfile.get(SANDBOXCONTEXTWEBPROFILE, this.id);
		Assert.assertEquals(webProfile.getName(), newName);
	}
}
