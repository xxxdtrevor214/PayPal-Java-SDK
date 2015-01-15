package com.paypal.api.payments;

import java.io.File;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;

import com.paypal.base.Constants;
import com.paypal.base.rest.APIContext;
import com.paypal.base.rest.HttpMethod;
import com.paypal.base.rest.JSONFormatter;
import com.paypal.base.rest.OAuthTokenCredential;
import com.paypal.base.rest.PayPalRESTException;
import com.paypal.base.rest.PayPalResource;
import com.paypal.base.rest.RESTUtil;
import com.paypal.base.sdk.info.SDKVersionImpl;

public class PayoutItem {

	/**
	 * The type of identification for the payment receiver. If this field is
	 * provided, the payout items without a `recipient_type` will use the
	 * provided value. If this field is not provided, each payout item must
	 * include a value for the `recipient_type`.
	 */
	private String recipientType;

	/**
	 * The amount of money to pay a receiver.
	 */
	private Currency amount;

	/**
	 * Note for notifications. The note is provided by the payment sender. This
	 * note can be any string. 4000 characters max.
	 */
	private String note;

	/**
	 * The receiver of the payment. In a call response, the format of this value
	 * corresponds to the `recipient_type` specified in the request. 127
	 * characters max.
	 */
	private String receiver;

	/**
	 * A sender-specific ID number, used in an accounting system for tracking
	 * purposes. 30 characters max.
	 */
	private String senderItemId;

	/**
	 * Returns the last request sent to the Service
	 *
	 * @return Last request sent to the server
	 */
	public static String getLastRequest() {
		return PayPalResource.getLastRequest();
	}

	/**
	 * Returns the last response returned by the Service
	 *
	 * @return Last response got from the Service
	 */
	public static String getLastResponse() {
		return PayPalResource.getLastResponse();
	}

	/**
	 * Initialize using InputStream(of a Properties file)
	 *
	 * @param is
	 *            InputStream
	 * @throws PayPalRESTException
	 * @return OAuthTokenCredential instance using client ID and client secret
	 *         loaded from configuration.
	 */
	public static OAuthTokenCredential initConfig(InputStream is)
			throws PayPalRESTException {
		return PayPalResource.initConfig(is);
	}

	/**
	 * Initialize using a File(Properties file)
	 *
	 * @param file
	 *            File object of a properties entity
	 * @throws PayPalRESTException
	 * @return OAuthTokenCredential instance using client ID and client secret
	 *         loaded from configuration.
	 */
	public static OAuthTokenCredential initConfig(File file)
			throws PayPalRESTException {
		return PayPalResource.initConfig(file);
	}

	/**
	 * Initialize using Properties
	 *
	 * @param properties
	 *            Properties object
	 * @return OAuthTokenCredential instance using client ID and client secret
	 *         loaded from configuration.
	 */
	public static OAuthTokenCredential initConfig(Properties properties) {
		return PayPalResource.initConfig(properties);
	}

	/**
	 * Default Constructor
	 */
	public PayoutItem() {
	}

	/**
	 * Parameterized Constructor
	 */
	public PayoutItem(Currency amount, String receiver) {
		this.amount = amount;
		this.receiver = receiver;
	}

	/**
	 * Setter for recipientType
	 */
	public PayoutItem setRecipientType(String recipientType) {
		this.recipientType = recipientType;
		return this;
	}

	/**
	 * Getter for recipientType
	 */
	public String getRecipientType() {
		return this.recipientType;
	}

	/**
	 * Setter for amount
	 */
	public PayoutItem setAmount(Currency amount) {
		this.amount = amount;
		return this;
	}

	/**
	 * Getter for amount
	 */
	public Currency getAmount() {
		return this.amount;
	}

	/**
	 * Setter for note
	 */
	public PayoutItem setNote(String note) {
		this.note = note;
		return this;
	}

	/**
	 * Getter for note
	 */
	public String getNote() {
		return this.note;
	}

	/**
	 * Setter for receiver
	 */
	public PayoutItem setReceiver(String receiver) {
		this.receiver = receiver;
		return this;
	}

	/**
	 * Getter for receiver
	 */
	public String getReceiver() {
		return this.receiver;
	}

	/**
	 * Setter for senderItemId
	 */
	public PayoutItem setSenderItemId(String senderItemId) {
		this.senderItemId = senderItemId;
		return this;
	}

	/**
	 * Getter for senderItemId
	 */
	public String getSenderItemId() {
		return this.senderItemId;
	}

	/**
	 * Obtain the status of a payout item by passing the item ID to the request
	 * URI.
	 * 
	 * @param accessToken
	 *            Access Token used for the API call.
	 * @param payoutItemId
	 *            String
	 * @return PayoutItemDetails
	 * @throws PayPalRESTException
	 */
	public static PayoutItemDetails get(String accessToken, String payoutItemId)
			throws PayPalRESTException {
		APIContext apiContext = new APIContext(accessToken);
		return get(apiContext, payoutItemId);
	}

	/**
	 * Obtain the status of a payout item by passing the item ID to the request
	 * URI.
	 * 
	 * @param apiContext
	 *            {@link APIContext} used for the API call.
	 * @param payoutItemId
	 *            String
	 * @return PayoutItemDetails
	 * @throws PayPalRESTException
	 */
	public static PayoutItemDetails get(APIContext apiContext, String payoutItemId)
			throws PayPalRESTException {
		if (apiContext == null) {
			throw new IllegalArgumentException("APIContext cannot be null");
		}
		if (apiContext.getAccessToken() == null
				|| apiContext.getAccessToken().trim().length() <= 0) {
			throw new IllegalArgumentException(
					"AccessToken cannot be null or empty");
		}
		if (apiContext.getHTTPHeaders() == null) {
			apiContext.setHTTPHeaders(new HashMap<String, String>());
		}
		apiContext.getHTTPHeaders().put(Constants.HTTP_CONTENT_TYPE_HEADER,
				Constants.HTTP_CONTENT_TYPE_JSON);
		apiContext.setSdkVersion(new SDKVersionImpl());
		if (payoutItemId == null) {
			throw new IllegalArgumentException("payoutItemId cannot be null");
		}
		Object[] parameters = new Object[] { payoutItemId };
		String pattern = "v1/payments/payouts-item/{0}";
		String resourcePath = RESTUtil.formatURIPath(pattern, parameters);
		String payLoad = "";
		return PayPalResource.configureAndExecute(apiContext, HttpMethod.GET,
				resourcePath, payLoad, PayoutItemDetails.class);
	}

	/**
	 * Returns a JSON string corresponding to object state
	 *
	 * @return JSON representation
	 */
	public String toJSON() {
		return JSONFormatter.toJSON(this);
	}

	@Override
	public String toString() {
		return toJSON();
	}
}
