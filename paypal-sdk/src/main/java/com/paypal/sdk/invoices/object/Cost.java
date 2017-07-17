// This class was generated on Mon, 17 Jul 2017 10:41:00 PDT by version 0.01 of Braintree SDK Generator
// Cost.java
// DO NOT EDIT
// @type object
// @json {"Type":"Cost","VariableName":"","Description":"The cost as a percent or an amount value. For example, to specify 10%, enter `10`. Alternatively, to specify an amount of 5, enter `5`.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":[{"Type":"Currency","VariableName":"amount","Description":"Base object for all financial value related fields (balance, payment due, etc.)","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"number","VariableName":"percent","Description":"The cost, as a percent value. Valid value is from 0 to 100.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.invoices.object;

import java.util.Map;
import java.util.List;
import com.google.gson.annotations.SerializedName;
/**
 * The cost as a percent or an amount value. For example, to specify 10%, enter `10`. Alternatively, to specify an amount of 5, enter `5`.
 */
public class Cost {

	/**
	* Base object for all financial value related fields (balance, payment due, etc.)
	*/
	@SerializedName("amount")
	private Currency amount;

	public Currency amount() { return amount; }
	
	public Cost amount(Currency amount) {
	    this.amount = amount;
	    return this;
	}

	/**
	* The cost, as a percent value. Valid value is from 0 to 100.
	*/
	@SerializedName("percent")
	private Double percent;

	public Double percent() { return percent; }
	
	public Cost percent(Double percent) {
	    this.percent = percent;
	    return this;
	}
}
