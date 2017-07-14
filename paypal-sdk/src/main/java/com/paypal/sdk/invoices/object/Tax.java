// This class was generated on Thu, 13 Jul 2017 09:07:17 PDT by version 0.01 of Braintree SDK Generator
// Tax.java
// DO NOT EDIT
// @type object
// @json {"Type":"Tax","VariableName":"","Description":"Tax information.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":[{"Type":"Currency","VariableName":"amount","Description":"Base object for all financial value related fields (balance, payment due, etc.)","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"id","Description":"The resource ID.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"name","Description":"The tax name.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null},{"Type":"number","VariableName":"percent","Description":"The tax rate. Valid value is from 0.001 to 99.999.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null}]}

package com.paypal.sdk.invoices.object;

import java.util.Map;
import java.util.List;
import com.google.gson.annotations.SerializedName;
/**
 * Tax information.
 */
public class Tax {

	/**
	* Base object for all financial value related fields (balance, payment due, etc.)
	*/
	@SerializedName("amount")
	private Currency amount;

	public Currency amount() { return amount; }
	
	public Tax amount(Currency amount) {
	    this.amount = amount;
	    return this;
	}

	/**
	* The resource ID.
	*/
	@SerializedName("id")
	private String id;

	public String id() { return id; }
	
	public Tax id(String id) {
	    this.id = id;
	    return this;
	}

	/**
	* REQUIRED
	* The tax name.
	*/
	@SerializedName("name")
	private String name;

	public String name() { return name; }
	
	public Tax name(String name) {
	    this.name = name;
	    return this;
	}

	/**
	* REQUIRED
	* The tax rate. Valid value is from 0.001 to 99.999.
	*/
	@SerializedName("percent")
	private Double percent;

	public Double percent() { return percent; }
	
	public Tax percent(Double percent) {
	    this.percent = percent;
	    return this;
	}
}
