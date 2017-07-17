// This class was generated on Mon, 17 Jul 2017 10:41:00 PDT by version 0.01 of Braintree SDK Generator
// PaymentSummary.java
// DO NOT EDIT
// @type object
// @json {"Type":"Payment Summary","VariableName":"","Description":"The payment and refund summary.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":[{"Type":"Currency","VariableName":"other","Description":"Base object for all financial value related fields (balance, payment due, etc.)","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Currency","VariableName":"paypal","Description":"Base object for all financial value related fields (balance, payment due, etc.)","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.invoices.object;

import java.util.Map;
import java.util.List;
import com.google.gson.annotations.SerializedName;
/**
 * The payment and refund summary.
 */
public class PaymentSummary {

	/**
	* Base object for all financial value related fields (balance, payment due, etc.)
	*/
	@SerializedName("other")
	private Currency other;

	public Currency other() { return other; }
	
	public PaymentSummary other(Currency other) {
	    this.other = other;
	    return this;
	}

	/**
	* Base object for all financial value related fields (balance, payment due, etc.)
	*/
	@SerializedName("paypal")
	private Currency paypal;

	public Currency paypal() { return paypal; }
	
	public PaymentSummary paypal(Currency paypal) {
	    this.paypal = paypal;
	    return this;
	}
}
