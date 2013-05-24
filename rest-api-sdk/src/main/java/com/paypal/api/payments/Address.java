package com.paypal.api.payments;

import com.paypal.core.rest.JSONFormatter;
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

public class Address  {

	/**
	 * Line 1 of the Address (eg. number, street, etc).
	 */
	private String line1;
	
	/**
	 * Optional line 2 of the Address (eg. suite, apt #, etc.).
	 */
	private String line2;
	
	/**
	 * City name.
	 */
	private String city;
	
	/**
	 * 2 letter country code.
	 */
	private String countryCode;
	
	/**
	 * Zip code or equivalent is usually required for countries that have them. For list of countries that do not have postal codes please refer to http://en.wikipedia.org/wiki/Postal_code.
	 */
	private String postalCode;
	
	/**
	 * 2 letter code for US states, and the equivalent for other countries.
	 */
	private String state;
	
	/**
	 * Phone number in E.123 format.
	 */
	private String phone;
	
	/**
	 * 
	 */ 
	private String type;
	
	/**
	 * Default Constructor
	 */
	public Address() {
	}

	/**
	 * Parameterized Constructor
	 */
	public Address(String line1, String city, String countryCode, String state) {
		this.line1 = line1;
		this.city = city;
		this.countryCode = countryCode;
		this.state = state;
	}
	

	/**
	 * Setter for line1
	 */
	public void setLine1(String line1) {
		this.line1 = line1;
	}
	
	/**
	 * Getter for line1
	 */
	public String getLine1() {
		return this.line1;
	}


	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * Setter for line2
	 */
	public void setLine2(String line2) {
		this.line2 = line2;
	}
	
	/**
	 * Getter for line2
	 */
	public String getLine2() {
		return this.line2;
	}


	/**
	 * Setter for city
	 */
	public void setCity(String city) {
		this.city = city;
	}
	
	/**
	 * Getter for city
	 */
	public String getCity() {
		return this.city;
	}


	/**
	 * Setter for countryCode
	 */
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	
	/**
	 * Getter for countryCode
	 */
	public String getCountryCode() {
		return this.countryCode;
	}


	/**
	 * Setter for postalCode
	 */
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
	/**
	 * Getter for postalCode
	 */
	public String getPostalCode() {
		return this.postalCode;
	}


	/**
	 * Setter for state
	 */
	public void setState(String state) {
		this.state = state;
	}
	
	/**
	 * Getter for state
	 */
	public String getState() {
		return this.state;
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