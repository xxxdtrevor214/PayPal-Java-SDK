// This class was generated on Mon, 17 Jul 2017 10:41:00 PDT by version 0.01 of Braintree SDK Generator
// Currency.java
// DO NOT EDIT
// @type object
// @json {"Type":"Currency","VariableName":"","Description":"Base object for all financial value related fields (balance, payment due, etc.)","IsArray":false,"ReadOnly":false,"Required":false,"Properties":[{"Type":"string","VariableName":"currency","Description":"3 letter currency code as defined by ISO 4217.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null},{"Type":"string","VariableName":"value","Description":"amount up to N digit after the decimals separator as defined in ISO 4217 for the appropriate currency code.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null}]}

package com.paypal.sdk.invoices.object;

import java.util.Map;
import java.util.List;
import com.google.gson.annotations.SerializedName;
/**
 * Base object for all financial value related fields (balance, payment due, etc.)
 */
public class Currency {

	/**
	* REQUIRED
	* 3 letter currency code as defined by ISO 4217.
	*/
	@SerializedName("currency")
	private String currency;

	public String currency() { return currency; }
	
	public Currency currency(String currency) {
	    this.currency = currency;
	    return this;
	}

	/**
	* REQUIRED
	* amount up to N digit after the decimals separator as defined in ISO 4217 for the appropriate currency code.
	*/
	@SerializedName("value")
	private String value;

	public String value() { return value; }
	
	public Currency value(String value) {
	    this.value = value;
	    return this;
	}
}
