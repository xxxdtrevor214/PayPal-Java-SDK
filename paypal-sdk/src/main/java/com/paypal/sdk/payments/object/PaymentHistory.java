// This class was generated on Mon, 31 Jul 2017 18:27:14 UTC by version 0.1 of Braintree SDK Generator
// PaymentHistory.java
// DO NOT EDIT
// @type object
// @json {"Type":"Payment History ","VariableName":"","Description":"The list of payments that the seller made.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":[{"Type":"integer","VariableName":"count","Description":"The number of items returned in each range of results. Note that the last results range might have fewer items than the requested number of items. The maximum value is `20`.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"next_id","Description":"The ID of the next element. Use to get the next range of results.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Payment","VariableName":"payments","Description":"An array of payments.","IsArray":true,"ReadOnly":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.payments.object;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.serializer.Serializable;
import com.braintreepayments.http.serializer.Deserializable;

/**
 * The list of payments that the seller made.
 */
public class PaymentHistory implements Serializable, Deserializable {

    // Required default constructor
    public PaymentHistory() {}

	/**
	* The number of items returned in each range of results. Note that the last results range might have fewer items than the requested number of items. The maximum value is `20`.
	*/
	private Integer count;

	public Integer count() { return count; }
	
	public PaymentHistory count(Integer count) {
	    this.count = count;
	    return this;
	}

	/**
	* The ID of the next element. Use to get the next range of results.
	*/
	private String nextId;

	public String nextId() { return nextId; }
	
	public PaymentHistory nextId(String nextId) {
	    this.nextId = nextId;
	    return this;
	}

	/**
	* An array of payments.
	*/
	private List<Payment> payments;

	public List<Payment> payments() { return payments; }
	
	public PaymentHistory payments(List<Payment> payments) {
	    this.payments = payments;
	    return this;
	}

    @Override
    public void serialize(Map<String, Object> serialized) {
        if (count != null) {
            serialized.put("count", this.count);
        }
        if (nextId != null) {
            serialized.put("next_id", this.nextId);
        }
        if (payments != null) {
            serialized.put("payments", this.payments);
        }
    }

    @Override
    public void deserialize(Map<String, Object> values) {
        if (values.containsKey("count")) {
            this.count = ((Number) values.get("count")).intValue();
        }
        if (values.containsKey("next_id")) {
            this.nextId = (String) values.get("next_id");
        }
        if (values.containsKey("payments")) {
            this.payments = new ArrayList<>();
				List<Map<String, Object>> nestedValues = (List<Map<String, Object>>) values.get("payments");
				for (Map<String, Object> nestedValue : nestedValues) {
					Payment nested = new Payment();
					nested.deserialize(nestedValue);
					this.payments.add(nested);
                }
        }
    }
}

