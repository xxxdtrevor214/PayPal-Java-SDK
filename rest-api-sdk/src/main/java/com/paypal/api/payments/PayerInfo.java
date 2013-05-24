package com.paypal.api.payments;

import com.paypal.core.rest.JSONFormatter;
import com.paypal.api.payments.Address;
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

public class PayerInfo  {

	/**
	 * Email address representing the Payer.
	 */
	private String email;
	
	/**
	 * First Name of the Payer from their PayPal Account.
	 */
	private String firstName;
	
	/**
	 * Last Name of the Payer from their PayPal Account.
	 */
	private String lastName;
	
	/**
	 * PayPal assigned Payer ID.
	 */
	private String payerId;
	
	/**
	 * Phone number representing the Payer.
	 */
	private String phone;
	
	/**
	 * Shipping address of the Payer from their PayPal Account.
	 */
	private Address shippingAddress;
	
	/**
	 * Default Constructor
	 */
	public PayerInfo() {
	}


	/**
	 * Setter for email
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 * Getter for email
	 */
	public String getEmail() {
		return this.email;
	}


	/**
	 * Setter for firstName
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	/**
	 * Getter for firstName
	 */
	public String getFirstName() {
		return this.firstName;
	}


	/**
	 * Setter for lastName
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	/**
	 * Getter for lastName
	 */
	public String getLastName() {
		return this.lastName;
	}


	/**
	 * Setter for payerId
	 */
	public void setPayerId(String payerId) {
		this.payerId = payerId;
	}
	
	/**
	 * Getter for payerId
	 */
	public String getPayerId() {
		return this.payerId;
	}


	/**
	 * Setter for phone
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	/**
	 * Getter for phone
	 */
	public String getPhone() {
		return this.phone;
	}


	/**
	 * Setter for shippingAddress
	 */
	public void setShippingAddress(Address shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	
	/**
	 * Getter for shippingAddress
	 */
	public Address getShippingAddress() {
		return this.shippingAddress;
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