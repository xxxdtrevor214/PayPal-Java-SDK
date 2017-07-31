// This class was generated on Sun, 30 Jul 2017 11:04:05 PDT by version 0.1 of Braintree SDK Generator
// Cost.java
// DO NOT EDIT
// @type object
// @json {"Type":"Cost","VariableName":"","Description":"The cost as a percent or an amount value. For example, to specify 10%, enter `10`. Alternatively, to specify an amount of 5, enter `5`.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":[{"Type":"Currency","VariableName":"amount","Description":"Base object for all financial value related fields (balance, payment due, etc.)","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"number","VariableName":"percent","Description":"The cost, as a percent value. Valid value is from 0 to 100.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.invoices.object;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.serializer.Serializable;
import com.braintreepayments.http.serializer.Deserializable;

/**
 * The cost as a percent or an amount value. For example, to specify 10%, enter `10`. Alternatively, to specify an amount of 5, enter `5`.
 */
public class Cost implements Serializable, Deserializable {

    // Required default constructor
    public Cost() {}

	/**
	* Base object for all financial value related fields (balance, payment due, etc.)
	*/
	private Currency amount;

	public Currency amount() { return amount; }
	
	public Cost amount(Currency amount) {
	    this.amount = amount;
	    return this;
	}

	/**
	* The cost, as a percent value. Valid value is from 0 to 100.
	*/
	private Double percent;

	public Double percent() { return percent; }
	
	public Cost percent(Double percent) {
	    this.percent = percent;
	    return this;
	}

    @Override
    public void serialize(Map<String, Object> serialized) {
        if (amount != null) {
            serialized.put("amount", this.amount);
        }
        if (percent != null) {
            serialized.put("percent", this.percent);
        }
    }

    @Override
    public void deserialize(Map<String, Object> values) {
        if (values.containsKey("amount")) {
            this.amount = new Currency();
            this.amount.deserialize((Map<String, Object>) values.get("amount"));
        }
        if (values.containsKey("percent")) {
            this.percent = ((Number) values.get("percent")).doubleValue();
        }
    }
}

