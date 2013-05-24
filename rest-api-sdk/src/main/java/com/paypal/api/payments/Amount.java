package com.paypal.api.payments;

import com.paypal.core.rest.JSONFormatter;
import com.paypal.api.payments.Details;
import java.util.Map;
import com.paypal.core.rest.PayPalRESTException;
import com.paypal.core.rest.PayPalResource;
import com.paypal.core.rest.HttpMethod;
import com.paypal.core.rest.RESTUtil;
import com.paypal.core.rest.QueryParameters;
import com.paypal.core.rest.APIContext;
import java.io.File;
import java.io.InputStream;
import java.util.Properties;

public class Amount  {

	/**
	 * 3 letter currency code
	 */
	private String currency;
	
	/**
	 * Total amount charged from the Payer account (or card) to Payee. In case of a refund, this is the refunded amount to the original Payer from Payee account.
	 */
	private String total;
	
	/**
	 * Additional details of the payment amount.
	 */
	private Details details;
	
	/**
	 * Default Constructor
	 */
	public Amount() {
	}

	/**
	 * Parameterized Constructor
	 */
	public Amount(String currency, String total) {
		this.currency = currency;
		this.total = total;
	}
	

	/**
	 * Setter for currency
	 */
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
	/**
	 * Getter for currency
	 */
	public String getCurrency() {
		return this.currency;
	}


	/**
	 * Setter for total
	 */
	public void setTotal(String total) {
		this.total = total;
	}
	
	/**
	 * Getter for total
	 */
	public String getTotal() {
		return this.total;
	}


	/**
	 * Setter for details
	 */
	public void setDetails(Details details) {
		this.details = details;
	}
	
	/**
	 * Getter for details
	 */
	public Details getDetails() {
		return this.details;
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