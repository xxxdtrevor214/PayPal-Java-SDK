// This class was generated on Mon, 03 Jul 2017 13:56:47 PDT by version 0.01 of Braintree SDK Generator
// PaymentOptions.java
// DO NOT EDIT
// @type object
// @json {"Type":"Payment Options","VariableName":"","Description":"The payment options requested for this transaction.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":[{"Type":"string","VariableName":"allowed_payment_method","Description":"The payment method requested for this transaction. This field does not apply to the credit card payment method.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.payments.object;

import java.util.Map;
import java.util.List;
import com.google.gson.annotations.SerializedName;
/**
 * The payment options requested for this transaction.
 */
public class PaymentOptions {

	/**
	* The payment method requested for this transaction. This field does not apply to the credit card payment method.
	*/
	@SerializedName("allowed_payment_method")
	private String allowedPaymentMethod;

	public String allowedPaymentMethod() { return allowedPaymentMethod; }
	
	public PaymentOptions allowedPaymentMethod(String allowedPaymentMethod) {
	    this.allowedPaymentMethod = allowedPaymentMethod;
	    return this;
	}
}
