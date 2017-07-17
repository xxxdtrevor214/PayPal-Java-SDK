// This class was generated on Mon, 17 Jul 2017 10:51:10 PDT by version 0.01 of Braintree SDK Generator
// PaymentExecution.java
// DO NOT EDIT
// @type object
// @json {"Type":"Payment Execution","VariableName":"","Description":"Executes a PayPal account-based payment with the `payer_id` obtained from the web approval URL.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":[{"Type":"string","VariableName":"payer_id","Description":"The ID of the payer that PayPal passes in the `return_url`.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Cart","VariableName":"transactions","Description":"The transaction details, including the amount and item details. For update and execute payment calls, the **`transactions`** object accepts only the **`amount`** object.","IsArray":true,"ReadOnly":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.payments.object;

import java.util.Map;
import java.util.List;
import com.google.gson.annotations.SerializedName;
/**
 * Executes a PayPal account-based payment with the `payer_id` obtained from the web approval URL.
 */
public class PaymentExecution {

	/**
	* The ID of the payer that PayPal passes in the `return_url`.
	*/
	@SerializedName("payer_id")
	private String payerId;

	public String payerId() { return payerId; }
	
	public PaymentExecution payerId(String payerId) {
	    this.payerId = payerId;
	    return this;
	}

	/**
	* The transaction details, including the amount and item details. For update and execute payment calls, the **`transactions`** object accepts only the **`amount`** object.
	*/
	@SerializedName("transactions")
	private List<Cart> transactions;

	public List<Cart> transactions() { return transactions; }
	
	public PaymentExecution transactions(List<Cart> transactions) {
	    this.transactions = transactions;
	    return this;
	}
}
