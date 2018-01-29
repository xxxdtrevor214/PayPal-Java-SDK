// This class was generated on Mon, 29 Jan 2018 12:12:01 PST by version 0.1.0-dev+ecea6f of Braintree SDK Generator
// Item.java
// @version 0.1.0-dev+ecea6f
// @type object
// @data H4sIAAAAAAAC/8yUQU8bMRCF7/0VI59AWrKBVkLKDakXRFsQgV4oB2NPsiO89jIeA6uK/16Z7aa7TSNAraKeVvM8Hr8vL/Z3ddE2qGbqWLBWhfqqmfSNwy+6zqoq1Am2v4qPGA1TIxS8mqmLCoEEa7AomlycqEIdMeu2mzkt1Dlqe+pdq2YL7SJm4S4Ro10JZxwaZCGMana1chOFyS/X/ZjEjN60I18Dcd3flVSMuGcqzdoIMhzPT/c+HOwfQr8NTLB4vVPaYGJJXnDJOg8oLTEaKRmjlH3zXm6O5e6bUIXTb6Q+OfdUvIhrBzhD4rG+MZSVPIF5aprAghaCdy0sAoNUCGe6PdMOGt3W6AVqlCrYv43xlXA+f4ZUP4UNOHl1Ap/1I9WpBod+KRVQhP2DQ1ilG7eTS8Nkxt57ZYN5E6L80fx04L2Ah4pMBeSNSxbj7FuaTt+b5J6/2FWOumqO9+jB0pIkwg0uAuNzohYN1TnSQF4m3Z6y3zQecfHG9ofQn6cX+Sa98riyB9hKNHdJeyEZvxADcUNAfceLIW3nDxZv0wigq9e9RwnmFm4RG/JLSJ4EduYnl7urC57htnSfRT+OPHf1ht9b9ON/+SgldiOIrl6HuDz/BBI6FvKLwLXuHtqje00uD8zLmabRLTKQfy6EtY/a5FaoKErg9p+AXT+9+wEAAP//
// DO NOT EDIT
package com.paypal.sdk.v1.orders;

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
	* The item cost. Maximum length is 10 characters, which includes:<ul><li>Seven digits before the decimal point.</li><li>The decimal point.</li><li>Two digits after the decimal point.</li></ul>
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
