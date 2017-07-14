// This class was generated on Thu, 13 Jul 2017 09:07:17 PDT by version 0.01 of Braintree SDK Generator
// InvoiceNumber.java
// DO NOT EDIT
// @type object
// @json {"Type":"Invoice number","VariableName":"","Description":"","IsArray":false,"ReadOnly":false,"Required":false,"Properties":[{"Type":"string","VariableName":"number","Description":"The next invoice number that is available to the merchant. This number is auto-incremented from the most recent invoice number.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.invoices.object;

import java.util.Map;
import java.util.List;
import com.google.gson.annotations.SerializedName;
public class InvoiceNumber {

	/**
	* The next invoice number that is available to the merchant. This number is auto-incremented from the most recent invoice number.
	*/
	@SerializedName("number")
	private String number;

	public String number() { return number; }
	
	public InvoiceNumber number(String number) {
	    this.number = number;
	    return this;
	}
}
