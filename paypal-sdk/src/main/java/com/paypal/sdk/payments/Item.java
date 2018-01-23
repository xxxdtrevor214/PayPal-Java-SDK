// This class was generated on Mon, 22 Jan 2018 14:30:02 PST by version 0.1.0-dev+8c35d5 of Braintree SDK Generator
// Item.java
// @version 0.1.0-dev+8c35d5
// @type object
// @data H4sIAAAAAAAC/8yUQWvbQBCF7/0Vw54SsK0kFAK+BXopaRsTJ72EHKarsTV4tavMzhYvJf+9bFW7Vl3TlhaTk3hvZ4f3aTT6Yu5yR2ZqWKk1I/MRhfGTow/YFteMzDXlH+INRSvcKQdvpuauISj3oCZFdnFiRuZKBHPf82xkbgnrG++ymS7QRSrGU2KhemvMJHQkyhTN9GGbJqqwX+7nsUmEvM2DXDvmfr4HbYRobBsUtEoCb+c349cX55ewuQY21PR4UtXBxoq90lKwNKhqFrJaCUWtNsXjUhyr079CVUk/kfrk3PPot7j1Ds4u8dA/OJStPYF56rogSjUE7zIsgoA2BDPMM3TQYW7JK7SkTaj/dYx/COfLY5fqu3EAp5xO4D2uuU0tOPJLbYAjnF9cwna68Thz6YTtMPvGORDehqi/DH929OxPCb2yDldoxzxAsKl4IRRxlQYAvd7PHjXYFayIOvZLSJ4VTubX96fbDShwR/rgFdeDzL0+8L4V1y9ya5O4AUSv9yHub9+Bhp6F/SJIi/2f6OozsisNy3Gh6TCTAPtvQgV9RFtKoeGoQfJ/AXt8fvUVAAD//w==
// DO NOT EDIT
package com.paypal.sdk.payments;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The item details.
 */
@Model
public class Item {

    // Required default constructor
    public Item() {}

	/**
	* REQUIRED
	* The [three-character ISO-4217 currency code](/docs/integration/direct/rest/currency-codes/).
	*/
	@SerializedName("currency")
	private String currency;

	public String currency() { return currency; }
	
	public Item currency(String currency) {
	    this.currency = currency;
	    return this;
	}

	/**
	* The item description. Supported only for the PayPal payment method.
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
	* The item tax. Supported only for the PayPal payment method.
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
