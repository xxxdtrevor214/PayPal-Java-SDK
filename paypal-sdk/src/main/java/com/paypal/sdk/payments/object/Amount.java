// This class was generated on Mon, 03 Jul 2017 13:56:47 PDT by version 0.01 of Braintree SDK Generator
// Amount.java
// DO NOT EDIT
// @type object
// @json {"Type":"Amount","VariableName":"","Description":"The payment amount, with break-ups.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":[{"Type":"string","VariableName":"currency","Description":"The [three-character ISO-4217 currency code](https://developer.paypal.com/docs/classic/api/currency_codes/). PayPal does not support all currencies.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null},{"Type":"Amount details","VariableName":"details","Description":"The additional details about the payment amount.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"total","Description":"The total amount charged to the payee by the payer. For refunds, represents the amount that the payee refunds to the original payer. Maximum length is 10 characters. Supports two decimal places.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null}]}

package com.paypal.sdk.payments.object;

import java.util.Map;
import java.util.List;
import com.google.gson.annotations.SerializedName;
/**
 * The payment amount, with break-ups.
 */
public class Amount {

	/**
	* REQUIRED
	* The [three-character ISO-4217 currency code](https://developer.paypal.com/docs/classic/api/currency_codes/). PayPal does not support all currencies.
	*/
	@SerializedName("currency")
	private String currency;

	public String currency() { return currency; }
	
	public Amount currency(String currency) {
	    this.currency = currency;
	    return this;
	}

	/**
	* The additional details about the payment amount.
	*/
	@SerializedName("details")
	private AmountDetails details;

	public AmountDetails details() { return details; }
	
	public Amount details(AmountDetails details) {
	    this.details = details;
	    return this;
	}

	/**
	* REQUIRED
	* The total amount charged to the payee by the payer. For refunds, represents the amount that the payee refunds to the original payer. Maximum length is 10 characters. Supports two decimal places.
	*/
	@SerializedName("total")
	private String total;

	public String total() { return total; }
	
	public Amount total(String total) {
	    this.total = total;
	    return this;
	}
}
