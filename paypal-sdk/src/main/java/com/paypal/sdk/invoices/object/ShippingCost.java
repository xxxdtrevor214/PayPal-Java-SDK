// This class was generated on Thu, 13 Jul 2017 09:07:17 PDT by version 0.01 of Braintree SDK Generator
// ShippingCost.java
// DO NOT EDIT
// @type object
// @json {"Type":"Shipping Cost","VariableName":"","Description":"The shipping cost, as a percentage or amount value.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":[{"Type":"Currency","VariableName":"amount","Description":"Base object for all financial value related fields (balance, payment due, etc.)","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Tax","VariableName":"tax","Description":"Tax information.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.invoices.object;

import java.util.Map;
import java.util.List;
import com.google.gson.annotations.SerializedName;
/**
 * The shipping cost, as a percentage or amount value.
 */
public class ShippingCost {

	/**
	* Base object for all financial value related fields (balance, payment due, etc.)
	*/
	@SerializedName("amount")
	private Currency amount;

	public Currency amount() { return amount; }
	
	public ShippingCost amount(Currency amount) {
	    this.amount = amount;
	    return this;
	}

	/**
	* Tax information.
	*/
	@SerializedName("tax")
	private Tax tax;

	public Tax tax() { return tax; }
	
	public ShippingCost tax(Tax tax) {
	    this.tax = tax;
	    return this;
	}
}
