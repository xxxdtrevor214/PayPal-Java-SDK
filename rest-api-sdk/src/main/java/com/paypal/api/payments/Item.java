package com.paypal.api.payments;

import com.paypal.core.rest.JSONFormatter;
import com.paypal.api.payments.NameValuePair;
import java.util.List;

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
	 * Description of the item.
	 */
	private String description;

	/**
	 * Cost of the item.
	 */
	private String price;

	/**
	 * tax of the item.
	 */
	private String tax;

	/**
	 * 3-letter Currency Code
	 */
	private String currency;

	/**
	 * Number or code to identify the item in your catalog/records.
	 */
	private String sku;

	/**
	 * URL linking to item information. Available to payer in transaction history.
	 */
	private String url;

	/**
	 * Category type of the item.  This can be either Digital or Physical.
	 */
	private String category;

	/**
	 * Set of optional data used for PayPal risk determination.
	 */
	private List<NameValuePair> supplementaryData;

	/**
	 * Set of optional data used for PayPal post-transaction notifications.
	 */
	private List<NameValuePair> postbackData;

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
	public Item setQuantity(String quantity) {
		this.quantity = quantity;
		return this;
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
	public Item setName(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Getter for name
	 */
	public String getName() {
		return this.name;
	}


	/**
	 * Setter for description
	 */
	public Item setDescription(String description) {
		this.description = description;
		return this;
	}

	/**
	 * Getter for description
	 */
	public String getDescription() {
		return this.description;
	}


	/**
	 * Setter for price
	 */
	public Item setPrice(String price) {
		this.price = price;
		return this;
	}

	/**
	 * Getter for price
	 */
	public String getPrice() {
		return this.price;
	}


	/**
	 * Setter for tax
	 */
	public Item setTax(String tax) {
		this.tax = tax;
		return this;
	}

	/**
	 * Getter for tax
	 */
	public String getTax() {
		return this.tax;
	}


	/**
	 * Setter for currency
	 */
	public Item setCurrency(String currency) {
		this.currency = currency;
		return this;
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
	public Item setSku(String sku) {
		this.sku = sku;
		return this;
	}

	/**
	 * Getter for sku
	 */
	public String getSku() {
		return this.sku;
	}


	/**
	 * Setter for url
	 */
	public Item setUrl(String url) {
		this.url = url;
		return this;
	}

	/**
	 * Getter for url
	 */
	public String getUrl() {
		return this.url;
	}


	/**
	 * Setter for category
	 */
	public Item setCategory(String category) {
		this.category = category;
		return this;
	}

	/**
	 * Getter for category
	 */
	public String getCategory() {
		return this.category;
	}


	/**
	 * Setter for supplementaryData
	 */
	public Item setSupplementaryData(List<NameValuePair> supplementaryData) {
		this.supplementaryData = supplementaryData;
		return this;
	}

	/**
	 * Getter for supplementaryData
	 */
	public List<NameValuePair> getSupplementaryData() {
		return this.supplementaryData;
	}


	/**
	 * Setter for postbackData
	 */
	public Item setPostbackData(List<NameValuePair> postbackData) {
		this.postbackData = postbackData;
		return this;
	}

	/**
	 * Getter for postbackData
	 */
	public List<NameValuePair> getPostbackData() {
		return this.postbackData;
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
