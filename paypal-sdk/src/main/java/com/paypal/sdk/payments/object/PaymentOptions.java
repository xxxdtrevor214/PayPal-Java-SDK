// This class was generated on Mon, 31 Jul 2017 18:27:14 UTC by version 0.1 of Braintree SDK Generator
// PaymentOptions.java
// DO NOT EDIT
// @type object
// @json {"Type":"payment options","VariableName":"","Description":"The payment options requested for this transaction.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":[{"Type":"string","VariableName":"allowed_payment_method","Description":"The payment method requested for this transaction. This field does not apply to the credit card payment method.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.payments.object;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.serializer.Serializable;
import com.braintreepayments.http.serializer.Deserializable;

/**
 * The payment options requested for this transaction.
 */
public class PaymentOptions implements Serializable, Deserializable {

    // Required default constructor
    public PaymentOptions() {}

	/**
	* The payment method requested for this transaction. This field does not apply to the credit card payment method.
	*/
	private String allowedPaymentMethod;

	public String allowedPaymentMethod() { return allowedPaymentMethod; }
	
	public PaymentOptions allowedPaymentMethod(String allowedPaymentMethod) {
	    this.allowedPaymentMethod = allowedPaymentMethod;
	    return this;
	}

    @Override
    public void serialize(Map<String, Object> serialized) {
        if (allowedPaymentMethod != null) {
            serialized.put("allowed_payment_method", this.allowedPaymentMethod);
        }
    }

    @Override
    public void deserialize(Map<String, Object> values) {
        if (values.containsKey("allowed_payment_method")) {
            this.allowedPaymentMethod = (String) values.get("allowed_payment_method");
        }
    }
}

