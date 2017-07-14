// This class was generated on Thu, 13 Jul 2017 09:07:17 PDT by version 0.01 of Braintree SDK Generator
// CustomAmount.java
// DO NOT EDIT
// @type object
// @json {"Type":"Custom Amount","VariableName":"","Description":"The custom amount to apply to an invoice. If you include a label, you must include a custom amount.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":[{"Type":"Currency","VariableName":"amount","Description":"Base object for all financial value related fields (balance, payment due, etc.)","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"label","Description":"The custom amount label.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.invoices.object;

import java.util.Map;
import java.util.List;
import com.google.gson.annotations.SerializedName;
/**
 * The custom amount to apply to an invoice. If you include a label, you must include a custom amount.
 */
public class CustomAmount {

	/**
	* Base object for all financial value related fields (balance, payment due, etc.)
	*/
	@SerializedName("amount")
	private Currency amount;

	public Currency amount() { return amount; }
	
	public CustomAmount amount(Currency amount) {
	    this.amount = amount;
	    return this;
	}

	/**
	* The custom amount label.
	*/
	@SerializedName("label")
	private String label;

	public String label() { return label; }
	
	public CustomAmount label(String label) {
	    this.label = label;
	    return this;
	}
}
