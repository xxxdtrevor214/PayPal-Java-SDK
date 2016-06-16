package com.paypal.api.sample;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.paypal.api.payments.Invoice;
import com.paypal.api.payments.Payment;
import com.paypal.base.rest.APIContext;
import com.paypal.base.rest.PayPalRESTException;

public class ThirdPartyInvoice extends SampleBase<Invoice> {

	public static final String clientID = "AYSq3RDGsmBLJE-otTkBtM-jBRd1TCQwFf9RGfwddNXWz0uFU9ztymylOhRS";
	public static final String clientSecret = "EGnHDxD_qRPdaLdZz8iCr8N7_MzF-YHPTkjs6NKYQvQSBngp4PTTVWkPZRbL";

	private static final Logger log = LogManager.getLogger(ThirdPartyInvoice.class);

	/**
	 * Initialize and instantiate an Invoice object
	 * 
	 * @throws PayPalRESTException
	 * @throws JsonSyntaxException
	 * @throws JsonIOException
	 * @throws FileNotFoundException
	 */
	public ThirdPartyInvoice() throws PayPalRESTException, JsonSyntaxException, JsonIOException, FileNotFoundException {
		super(new Invoice());
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
	public Invoice create(APIContext context) throws PayPalRESTException, FileNotFoundException, IOException {
		// populate Invoice object that we are going to play with
		super.instance = load("invoice_create.json", Invoice.class);
		super.instance.getMerchantInfo().setEmail("developer@sample.com");
		super.instance = super.instance.create(context);
		return super.instance;
	}

	public Invoice send(Invoice invoice, APIContext context) throws PayPalRESTException {
		invoice.send(context);
		return Invoice.get(context, invoice.getId());
	}

	public static void main(String[] args) {
		try {
			String refreshToken = "J5yFACP3Y5dqdWCdN3o9lNYz0XyR01IHNMQn-E4r6Ss38rqbQ1C4rC6PSBhJvB_tte4WZsWe8ealMl-U_GMSz30dIkKaovgN41Xf8Sz0EGU55da6tST5I6sg3Rw";
			ThirdPartyInvoice fps = new ThirdPartyInvoice();

			log.info("creating third party invoice using refresh token " + refreshToken);

			// Setup APIContext
			APIContext thirdPartyContext = new APIContext(clientID, clientSecret, "sandbox")
					.setRefreshToken(refreshToken);

			// This will create an invoice for `developer@sample.com` merchant
			// whose refresh token it is.
			Invoice invoice = fps.create(thirdPartyContext);
			System.out.println(Invoice.getLastRequest());
			System.out.println(Invoice.getLastResponse());
			invoice = fps.send(invoice, thirdPartyContext);
			System.out.println(Invoice.getLastRequest());
			System.out.println(Invoice.getLastResponse());
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(Payment.getLastRequest());
			System.out.println(Payment.getLastResponse());
		}
	}
}
