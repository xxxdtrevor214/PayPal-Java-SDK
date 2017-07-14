// This class was generated on Thu, 13 Jul 2017 09:07:17 PDT by version 0.01 of Braintree SDK Generator
// Phone.java
// DO NOT EDIT
// @type object
// @json {"Type":"Phone","VariableName":"","Description":"The phone number.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":[{"Type":"string","VariableName":"country_code","Description":"The country calling code (CC), as defined by E.164. The maximum combined length of CC+national is 15 digits.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"national_number","Description":"The national number, as defined by E.164. A national number consists of national destination code (NDC) and subscriber number (SN). The maximum combined length of CC+national is 15 digits.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.invoices.object;

import java.util.Map;
import java.util.List;
import com.google.gson.annotations.SerializedName;
/**
 * The phone number.
 */
public class Phone {

	/**
	* The country calling code (CC), as defined by E.164. The maximum combined length of CC+national is 15 digits.
	*/
	@SerializedName("country_code")
	private String countryCode;

	public String countryCode() { return countryCode; }
	
	public Phone countryCode(String countryCode) {
	    this.countryCode = countryCode;
	    return this;
	}

	/**
	* The national number, as defined by E.164. A national number consists of national destination code (NDC) and subscriber number (SN). The maximum combined length of CC+national is 15 digits.
	*/
	@SerializedName("national_number")
	private String nationalNumber;

	public String nationalNumber() { return nationalNumber; }
	
	public Phone nationalNumber(String nationalNumber) {
	    this.nationalNumber = nationalNumber;
	    return this;
	}
}
