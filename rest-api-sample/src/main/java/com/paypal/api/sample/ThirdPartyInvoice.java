package com.paypal.api.sample;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.paypal.api.openidconnect.CreateFromRefreshTokenParameters;
import com.paypal.api.openidconnect.Tokeninfo;
import com.paypal.api.payments.Invoice;
import com.paypal.api.payments.Payment;
import com.paypal.base.ClientCredentials;
import com.paypal.base.rest.JSONFormatter;
import com.paypal.base.rest.PayPalRESTException;

public class ThirdPartyInvoice {

	private Invoice invoice = null;
	private static final Logger log = LogManager.getLogger(ThirdPartyInvoice.class);
	private String accessToken = null;

	/**
	 * Initialize and instantiate an Invoice object
	 * 
	 * @throws PayPalRESTException
	 * @throws JsonSyntaxException
	 * @throws JsonIOException
	 * @throws FileNotFoundException
	 */
	public ThirdPartyInvoice() throws PayPalRESTException, JsonSyntaxException, JsonIOException, FileNotFoundException {

		// initialize Invoice with credentials. User credentials must be stored
		// in the file
		Invoice.initConfig(new File(".", "src/main/resources/sdk_config.properties"));

	}

	private static Invoice loadInvoice(String jsonFile) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("src/main/resources/" + jsonFile));
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
			return new Invoice();
		}
	}

	/**
	 * Create an invoice.
	 * 
	 * https://developer.paypal.com/webapps/developer/docs/api/#create-an-
	 * invoice
	 * 
	 * @return newly created Invoice instance
	 * @throws PayPalRESTException
	 */
	public Invoice create(String refreshToken) throws PayPalRESTException, FileNotFoundException, IOException {
		Tokeninfo tokeninfo = null;
		invoice = new Invoice();
		log.info("creating third party invoice using refresh token " + refreshToken);

		// Setup the refresh token params. This will be used to get access token
		// from refresh token
		ClientCredentials credentials = invoice.getClientCredential();
		CreateFromRefreshTokenParameters params = new CreateFromRefreshTokenParameters();
		params.setClientID(credentials.getClientID());
		params.setClientSecret(credentials.getClientSecret());

		// Create a token info object, and call `createFromRefreshToken`
		Tokeninfo info = new Tokeninfo();
		info.setRefreshToken(refreshToken);
		tokeninfo = info.createFromRefreshToken(params);

		// Set Access Token Appropriately
		tokeninfo.setAccessToken(tokeninfo.getTokenType() + " " + tokeninfo.getAccessToken());
		// Use this accessToken to make any calls to Invoice
		accessToken = tokeninfo.getAccessToken();

		System.out.println("Generated access token from auth code: " + tokeninfo.getAccessToken());

		// populate Invoice object that we are going to play with
		invoice = loadInvoice("invoice_create.json");
		invoice = invoice.create(accessToken);
		return invoice;
	}

	public Invoice send(Invoice invoice) throws PayPalRESTException {
		invoice.send(accessToken);
		return Invoice.get(accessToken, invoice.getId());
	}

	public static void main(String[] args) {
		try {
			String refreshToken = "J5yFACP3Y5dqdWCdN3o9lNYz0XyR01IHNMQn-E4r6Ss38rqbQ1C4rC6PSBhJvB_tte4WZsWe8ealMl-U_GMSz30dIkKaovgN41Xf8Sz0EGU55da6tST5I6sg3Rw";
			ThirdPartyInvoice fps = new ThirdPartyInvoice();
			// This will create an invoice for `developer@sample.com` merchant whose refresh token it is.
			Invoice invoice = fps.create(refreshToken);
			System.out.println(Invoice.getLastRequest());
			System.out.println(Invoice.getLastResponse());
			invoice = fps.send(invoice);
			System.out.println(Invoice.getLastRequest());
			System.out.println(Invoice.getLastResponse());
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(Payment.getLastRequest());
			System.out.println(Payment.getLastResponse());
		}
	}
}
