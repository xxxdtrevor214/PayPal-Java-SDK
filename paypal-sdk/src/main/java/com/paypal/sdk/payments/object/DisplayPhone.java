// This class was generated on Mon, 17 Jul 2017 10:51:10 PDT by version 0.01 of Braintree SDK Generator
// DisplayPhone.java
// DO NOT EDIT
// @type object
// @json {"Type":"Display Phone","VariableName":"","Description":"Information related to the Payee.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":[{"Type":"string","VariableName":"country_code","Description":"Country code (from in E.164 format)","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"number","Description":"In-country phone number (from in E.164 format)","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.payments.object;

import java.util.Map;
import java.util.List;
import com.google.gson.annotations.SerializedName;
/**
 * Information related to the Payee.
 */
public class DisplayPhone {

	/**
	* Country code (from in E.164 format)
	*/
	@SerializedName("country_code")
	private String countryCode;

	public String countryCode() { return countryCode; }
	
	public DisplayPhone countryCode(String countryCode) {
	    this.countryCode = countryCode;
	    return this;
	}

	/**
	* In-country phone number (from in E.164 format)
	*/
	@SerializedName("number")
	private String number;

	public String number() { return number; }
	
	public DisplayPhone number(String number) {
	    this.number = number;
	    return this;
	}
}
