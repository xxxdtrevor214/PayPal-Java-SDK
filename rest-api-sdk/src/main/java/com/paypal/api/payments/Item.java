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

public class Item  {

	/**
	 * Number of items.
	 */
	private String quantity;
	
	/**
	 * Name of the item.
	 */
	private String name;
	
	/**
	 * Cost of the item.
	 */
	private String price;
	
	/**
	 * 3-letter Currency Code
	 */
	private String currency;
	
	/**
	 * Number or code to identify the item in your catalog/records.
	 */
	private String sku;
	
	/**
	 * Default Constructor
	 */
	public Item() {
	}

	/**
	 * Parameterized Constructor
	 */
	public Item(String quantity, String name, String price, String currency) {
		this.quantity = quantity;
		this.name = name;
		this.price = price;
		this.currency = currency;
	}
	

	/**
	 * Setter for quantity
	 */
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	
	/**
	 * Getter for quantity
	 */
	public String getQuantity() {
		return this.quantity;
	}


	/**
	 * Setter for name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Getter for name
	 */
	public String getName() {
		return this.name;
	}


	/**
	 * Setter for price
	 */
	public void setPrice(String price) {
		this.price = price;
	}
	
	/**
	 * Getter for price
	 */
	public String getPrice() {
		return this.price;
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
	 * Setter for sku
	 */
	public void setSku(String sku) {
		this.sku = sku;
	}
	
	/**
	 * Getter for sku
	 */
	public String getSku() {
		return this.sku;
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