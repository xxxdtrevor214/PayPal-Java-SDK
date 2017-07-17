// This class was generated on Mon, 17 Jul 2017 10:51:10 PDT by version 0.01 of Braintree SDK Generator
// Item.java
// DO NOT EDIT
// @type object
// @json {"Type":"Item","VariableName":"","Description":"The item details.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":[{"Type":"string","VariableName":"currency","Description":"The [three-character ISO-4217 currency code](/docs/classic/api/currency_codes/).","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null},{"Type":"string","VariableName":"description","Description":"The item description. Supported for the PayPal payment method only.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"name","Description":"The item name. Maximum length is 127 characters.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null},{"Type":"string","VariableName":"price","Description":"The item cost. Maximum length is 10 characters.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null},{"Type":"string","VariableName":"quantity","Description":"The item quantity. Maximum length is 10 characters.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null},{"Type":"string","VariableName":"sku","Description":"The stock keeping unit (SKU) for the item.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"tax","Description":"The item tax. Supported for the PayPal payment method only.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"url","Description":"The URL to item information. Available to the payer in the transaction history.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.payments.object;

import java.util.Map;
import java.util.List;
import com.google.gson.annotations.SerializedName;
/**
 * The item details.
 */
public class Item {

	/**
	* REQUIRED
	* The [three-character ISO-4217 currency code](/docs/classic/api/currency_codes/).
	*/
	@SerializedName("currency")
	private String currency;

	public String currency() { return currency; }
	
	public Item currency(String currency) {
	    this.currency = currency;
	    return this;
	}

	/**
	* The item description. Supported for the PayPal payment method only.
	*/
	@SerializedName("description")
	private String description;

	public String description() { return description; }
	
	public Item description(String description) {
	    this.description = description;
	    return this;
	}

	/**
	* REQUIRED
	* The item name. Maximum length is 127 characters.
	*/
	@SerializedName("name")
	private String name;

	public String name() { return name; }
	
	public Item name(String name) {
	    this.name = name;
	    return this;
	}

	/**
	* REQUIRED
	* The item cost. Maximum length is 10 characters.
	*/
	@SerializedName("price")
	private String price;

	public String price() { return price; }
	
	public Item price(String price) {
	    this.price = price;
	    return this;
	}

	/**
	* REQUIRED
	* The item quantity. Maximum length is 10 characters.
	*/
	@SerializedName("quantity")
	private String quantity;

	public String quantity() { return quantity; }
	
	public Item quantity(String quantity) {
	    this.quantity = quantity;
	    return this;
	}

	/**
	* The stock keeping unit (SKU) for the item.
	*/
	@SerializedName("sku")
	private String sku;

	public String sku() { return sku; }
	
	public Item sku(String sku) {
	    this.sku = sku;
	    return this;
	}

	/**
	* The item tax. Supported for the PayPal payment method only.
	*/
	@SerializedName("tax")
	private String tax;

	public String tax() { return tax; }
	
	public Item tax(String tax) {
	    this.tax = tax;
	    return this;
	}

	/**
	* The URL to item information. Available to the payer in the transaction history.
	*/
	@SerializedName("url")
	private String url;

	public String url() { return url; }
	
	public Item url(String url) {
	    this.url = url;
	    return this;
	}
}
