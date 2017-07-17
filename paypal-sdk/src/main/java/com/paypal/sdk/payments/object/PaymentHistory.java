// This class was generated on Mon, 17 Jul 2017 10:51:10 PDT by version 0.01 of Braintree SDK Generator
// PaymentHistory.java
// DO NOT EDIT
// @type object
// @json {"Type":"Payment History ","VariableName":"","Description":"The list of payments that the seller made.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":[{"Type":"integer","VariableName":"count","Description":"The number of items returned in each range of results. Note that the last results range might have fewer items than the requested number of items. The maximum value is `20`.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"next_id","Description":"The ID of the next element. Use to get the next range of results.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Payment","VariableName":"payments","Description":"An arrary of payments.","IsArray":true,"ReadOnly":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.payments.object;

import java.util.Map;
import java.util.List;
import com.google.gson.annotations.SerializedName;
/**
 * The list of payments that the seller made.
 */
public class PaymentHistory {

	/**
	* The number of items returned in each range of results. Note that the last results range might have fewer items than the requested number of items. The maximum value is `20`.
	*/
	@SerializedName("count")
	private Integer count;

	public Integer count() { return count; }
	
	public PaymentHistory count(Integer count) {
	    this.count = count;
	    return this;
	}

	/**
	* The ID of the next element. Use to get the next range of results.
	*/
	@SerializedName("next_id")
	private String nextId;

	public String nextId() { return nextId; }
	
	public PaymentHistory nextId(String nextId) {
	    this.nextId = nextId;
	    return this;
	}

	/**
	* An arrary of payments.
	*/
	@SerializedName("payments")
	private List<Payment> payments;

	public List<Payment> payments() { return payments; }
	
	public PaymentHistory payments(List<Payment> payments) {
	    this.payments = payments;
	    return this;
	}
}
