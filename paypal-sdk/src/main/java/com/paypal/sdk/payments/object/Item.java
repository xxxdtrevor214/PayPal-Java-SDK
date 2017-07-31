// This class was generated on Mon, 31 Jul 2017 18:27:14 UTC by version 0.1 of Braintree SDK Generator
// Item.java
// DO NOT EDIT
// @type object
// @json {"Type":"Item","VariableName":"","Description":"The item details.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":[{"Type":"string","VariableName":"currency","Description":"The [three-character ISO-4217 currency code](/docs/classic/api/currency_codes/).","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null},{"Type":"string","VariableName":"description","Description":"The item description. Supported for the PayPal payment method only.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"name","Description":"The item name. Maximum length is 127 characters.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null},{"Type":"string","VariableName":"price","Description":"The item cost. Maximum length is 10 characters.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null},{"Type":"string","VariableName":"quantity","Description":"The item quantity. Maximum length is 10 characters.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null},{"Type":"string","VariableName":"sku","Description":"The stock keeping unit (SKU) for the item.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"tax","Description":"The item tax. Supported for the PayPal payment method only.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"url","Description":"The URL to item information. Available to the payer in the transaction history.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.payments.object;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.serializer.Serializable;
import com.braintreepayments.http.serializer.Deserializable;

/**
 * The item details.
 */
public class Item implements Serializable, Deserializable {

    // Required default constructor
    public Item() {}

	/**
	* REQUIRED
	* The [three-character ISO-4217 currency code](/docs/classic/api/currency_codes/).
	*/
	private String currency;

	public String currency() { return currency; }
	
	public Item currency(String currency) {
	    this.currency = currency;
	    return this;
	}

	/**
	* The item description. Supported for the PayPal payment method only.
	*/
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
	private String quantity;

	public String quantity() { return quantity; }
	
	public Item quantity(String quantity) {
	    this.quantity = quantity;
	    return this;
	}

	/**
	* The stock keeping unit (SKU) for the item.
	*/
	private String sku;

	public String sku() { return sku; }
	
	public Item sku(String sku) {
	    this.sku = sku;
	    return this;
	}

	/**
	* The item tax. Supported for the PayPal payment method only.
	*/
	private String tax;

	public String tax() { return tax; }
	
	public Item tax(String tax) {
	    this.tax = tax;
	    return this;
	}

	/**
	* The URL to item information. Available to the payer in the transaction history.
	*/
	private String url;

	public String url() { return url; }
	
	public Item url(String url) {
	    this.url = url;
	    return this;
	}

    @Override
    public void serialize(Map<String, Object> serialized) {
        if (currency != null) {
            serialized.put("currency", this.currency);
        }
        if (description != null) {
            serialized.put("description", this.description);
        }
        if (name != null) {
            serialized.put("name", this.name);
        }
        if (price != null) {
            serialized.put("price", this.price);
        }
        if (quantity != null) {
            serialized.put("quantity", this.quantity);
        }
        if (sku != null) {
            serialized.put("sku", this.sku);
        }
        if (tax != null) {
            serialized.put("tax", this.tax);
        }
        if (url != null) {
            serialized.put("url", this.url);
        }
    }

    @Override
    public void deserialize(Map<String, Object> values) {
        if (values.containsKey("currency")) {
            this.currency = (String) values.get("currency");
        }
        if (values.containsKey("description")) {
            this.description = (String) values.get("description");
        }
        if (values.containsKey("name")) {
            this.name = (String) values.get("name");
        }
        if (values.containsKey("price")) {
            this.price = (String) values.get("price");
        }
        if (values.containsKey("quantity")) {
            this.quantity = (String) values.get("quantity");
        }
        if (values.containsKey("sku")) {
            this.sku = (String) values.get("sku");
        }
        if (values.containsKey("tax")) {
            this.tax = (String) values.get("tax");
        }
        if (values.containsKey("url")) {
            this.url = (String) values.get("url");
        }
    }
}

