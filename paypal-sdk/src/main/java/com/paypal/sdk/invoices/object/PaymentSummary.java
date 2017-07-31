// This class was generated on Sun, 30 Jul 2017 11:04:05 PDT by version 0.1 of Braintree SDK Generator
// PaymentSummary.java
// DO NOT EDIT
// @type object
// @json {"Type":"Payment Summary","VariableName":"","Description":"The payment and refund summary.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":[{"Type":"Currency","VariableName":"other","Description":"Base object for all financial value related fields (balance, payment due, etc.)","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Currency","VariableName":"paypal","Description":"Base object for all financial value related fields (balance, payment due, etc.)","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.invoices.object;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.serializer.Serializable;
import com.braintreepayments.http.serializer.Deserializable;

/**
 * The payment and refund summary.
 */
public class PaymentSummary implements Serializable, Deserializable {

    // Required default constructor
    public PaymentSummary() {}

	/**
	* Base object for all financial value related fields (balance, payment due, etc.)
	*/
	private Currency other;

	public Currency other() { return other; }
	
	public PaymentSummary other(Currency other) {
	    this.other = other;
	    return this;
	}

	/**
	* Base object for all financial value related fields (balance, payment due, etc.)
	*/
	private Currency paypal;

	public Currency paypal() { return paypal; }
	
	public PaymentSummary paypal(Currency paypal) {
	    this.paypal = paypal;
	    return this;
	}

    @Override
    public void serialize(Map<String, Object> serialized) {
        if (other != null) {
            serialized.put("other", this.other);
        }
        if (paypal != null) {
            serialized.put("paypal", this.paypal);
        }
    }

    @Override
    public void deserialize(Map<String, Object> values) {
        if (values.containsKey("other")) {
            this.other = new Currency();
            this.other.deserialize((Map<String, Object>) values.get("other"));
        }
        if (values.containsKey("paypal")) {
            this.paypal = new Currency();
            this.paypal.deserialize((Map<String, Object>) values.get("paypal"));
        }
    }
}

