// This class was generated on Sun, 30 Jul 2017 11:04:05 PDT by version 0.1 of Braintree SDK Generator
// CustomAmount.java
// DO NOT EDIT
// @type object
// @json {"Type":"Custom Amount","VariableName":"","Description":"The custom amount to apply to an invoice. If you include a label, you must include a custom amount.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":[{"Type":"Currency","VariableName":"amount","Description":"Base object for all financial value related fields (balance, payment due, etc.)","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"label","Description":"The custom amount label.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.invoices.object;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.serializer.Serializable;
import com.braintreepayments.http.serializer.Deserializable;

/**
 * The custom amount to apply to an invoice. If you include a label, you must include a custom amount.
 */
public class CustomAmount implements Serializable, Deserializable {

    // Required default constructor
    public CustomAmount() {}

	/**
	* Base object for all financial value related fields (balance, payment due, etc.)
	*/
	private Currency amount;

	public Currency amount() { return amount; }
	
	public CustomAmount amount(Currency amount) {
	    this.amount = amount;
	    return this;
	}

	/**
	* The custom amount label.
	*/
	private String label;

	public String label() { return label; }
	
	public CustomAmount label(String label) {
	    this.label = label;
	    return this;
	}

    @Override
    public void serialize(Map<String, Object> serialized) {
        if (amount != null) {
            serialized.put("amount", this.amount);
        }
        if (label != null) {
            serialized.put("label", this.label);
        }
    }

    @Override
    public void deserialize(Map<String, Object> values) {
        if (values.containsKey("amount")) {
            this.amount = new Currency();
            this.amount.deserialize((Map<String, Object>) values.get("amount"));
        }
        if (values.containsKey("label")) {
            this.label = (String) values.get("label");
        }
    }
}

