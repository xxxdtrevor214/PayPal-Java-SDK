// This class was generated on Mon, 17 Jul 2017 10:51:10 PDT by version 0.01 of Braintree SDK Generator
// NameAndValuePair.java
// DO NOT EDIT
// @type object
// @json {"Type":"Name and Value Pair","VariableName":"","Description":"Define a type for name-and-value pairs. Limit the use of name-and-value pairs in an API. Obtain approval by architecture.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":[{"Type":"string","VariableName":"name","Description":"The key for the name-and-value pair. You must correlate the value and name types.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null},{"Type":"string","VariableName":"value","Description":"The value for the name-and-value pair.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null}]}

package com.paypal.sdk.payments.object;

import java.util.Map;
import java.util.List;
import com.google.gson.annotations.SerializedName;
/**
 * Define a type for name-and-value pairs. Limit the use of name-and-value pairs in an API. Obtain approval by architecture.
 */
public class NameAndValuePair {

	/**
	* REQUIRED
	* The key for the name-and-value pair. You must correlate the value and name types.
	*/
	@SerializedName("name")
	private String name;

	public String name() { return name; }
	
	public NameAndValuePair name(String name) {
	    this.name = name;
	    return this;
	}

	/**
	* REQUIRED
	* The value for the name-and-value pair.
	*/
	@SerializedName("value")
	private String value;

	public String value() { return value; }
	
	public NameAndValuePair value(String value) {
	    this.value = value;
	    return this;
	}
}
