// This class was generated on Mon, 31 Jul 2017 18:27:14 UTC by version 0.1 of Braintree SDK Generator
// PaymentExecution.java
// DO NOT EDIT
// @type object
// @json {"Type":"Payment Execution","VariableName":"","Description":"Executes a PayPal account-based payment with the `payer_id` obtained from the web approval URL.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":[{"Type":"string","VariableName":"payer_id","Description":"The ID of the payer that PayPal passes in the `return_url`.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Cart","VariableName":"transactions","Description":"The transaction details, including the amount and item details. For update and execute payment calls, the **`transactions`** object accepts only the **`amount`** object.","IsArray":true,"ReadOnly":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.payments.object;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.serializer.Serializable;
import com.braintreepayments.http.serializer.Deserializable;

/**
 * Executes a PayPal account-based payment with the `payer_id` obtained from the web approval URL.
 */
public class PaymentExecution implements Serializable, Deserializable {

    // Required default constructor
    public PaymentExecution() {}

	/**
	* The ID of the payer that PayPal passes in the `return_url`.
	*/
	private String payerId;

	public String payerId() { return payerId; }
	
	public PaymentExecution payerId(String payerId) {
	    this.payerId = payerId;
	    return this;
	}

	/**
	* The transaction details, including the amount and item details. For update and execute payment calls, the **`transactions`** object accepts only the **`amount`** object.
	*/
	private List<Cart> transactions;

	public List<Cart> transactions() { return transactions; }
	
	public PaymentExecution transactions(List<Cart> transactions) {
	    this.transactions = transactions;
	    return this;
	}

    @Override
    public void serialize(Map<String, Object> serialized) {
        if (payerId != null) {
            serialized.put("payer_id", this.payerId);
        }
        if (transactions != null) {
            serialized.put("transactions", this.transactions);
        }
    }

    @Override
    public void deserialize(Map<String, Object> values) {
        if (values.containsKey("payer_id")) {
            this.payerId = (String) values.get("payer_id");
        }
        if (values.containsKey("transactions")) {
            this.transactions = new ArrayList<>();
				List<Map<String, Object>> nestedValues = (List<Map<String, Object>>) values.get("transactions");
				for (Map<String, Object> nestedValue : nestedValues) {
					Cart nested = new Cart();
					nested.deserialize(nestedValue);
					this.transactions.add(nested);
                }
        }
    }
}

