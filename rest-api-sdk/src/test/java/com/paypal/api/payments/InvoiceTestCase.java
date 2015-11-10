package com.paypal.api.payments;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.paypal.base.rest.JSONFormatter;
import com.paypal.base.rest.OAuthTokenCredential;
import com.paypal.base.rest.PayPalRESTException;

public class InvoiceTestCase {
	
	private static final Logger logger = Logger
			.getLogger(InvoiceTestCase.class);
	
	private String id = null;

	public static Invoice loadInvoice() {
	    try {
		    BufferedReader br = new BufferedReader(new FileReader("src/test/resources/invoice_test.json"));
	        StringBuilder sb = new StringBuilder();
	        String line = br.readLine();

	        while (line != null) {
	            sb.append(line);
	            sb.append(System.getProperty("line.separator"));
	            line = br.readLine();
	        }
	        br.close();
	        return JSONFormatter.fromJSON(sb.toString(), Invoice.class);
	        
	    } catch (IOException e) {
	    	e.printStackTrace();
	    	return null;
	    }
	}
	
	@Test(groups = "integration", enabled=false)
	public void testCreateInvoice() throws PayPalRESTException {

		logger.info("**** Create Invoice ****");
		String clientID = "AYSq3RDGsmBLJE-otTkBtM-jBRd1TCQwFf9RGfwddNXWz0uFU9ztymylOhRS";
		String clientSecret = "EGnHDxD_qRPdaLdZz8iCr8N7_MzF-YHPTkjs6NKYQvQSBngp4PTTVWkPZRbL";
		TokenHolder.accessToken = new OAuthTokenCredential(clientID,
				clientSecret).getAccessToken();
		
		Invoice invoice = loadInvoice();
		invoice = invoice.create(TokenHolder.accessToken);
		logger.info("Invoice created: ID=" + invoice.getId());
		this.id = invoice.getId();
	}

	@Test(groups = "integration", enabled=false, dependsOnMethods = { "testCreateInvoice" })
	public void testGetInvoice() throws PayPalRESTException {
		Invoice invoice = Invoice.get(TokenHolder.accessToken, this.id);
		logger.info("Invoice returned: ID=" + invoice.getId());
		this.id = invoice.getId();
	}

	@Test(groups = "integration", enabled=false, dependsOnMethods = { "testGetInvoice" })
	public void testSendInvoice() throws PayPalRESTException {
		Invoice invoice = Invoice.get(TokenHolder.accessToken, this.id);
		invoice.send(TokenHolder.accessToken);
		logger.info("Invoice sent: ID=" + invoice.getId() + "\tStatus=" + invoice.getStatus());
	}
}
