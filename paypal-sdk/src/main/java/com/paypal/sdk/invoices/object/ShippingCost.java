// This class was generated on Sun, 30 Jul 2017 11:04:05 PDT by version 0.1 of Braintree SDK Generator
// ShippingCost.java
// DO NOT EDIT
// @type object
// @json {"Type":"Shipping Cost","VariableName":"","Description":"The shipping cost, as a percentage or amount value.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":[{"Type":"Currency","VariableName":"amount","Description":"Base object for all financial value related fields (balance, payment due, etc.)","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Tax","VariableName":"tax","Description":"Tax information.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.invoices.object;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.serializer.Serializable;
import com.braintreepayments.http.serializer.Deserializable;

/**
 * The shipping cost, as a percentage or amount value.
 */
public class ShippingCost implements Serializable, Deserializable {

    // Required default constructor
    public ShippingCost() {}

	/**
	* Base object for all financial value related fields (balance, payment due, etc.)
	*/
	private Currency amount;

	public Currency amount() { return amount; }
	
	public ShippingCost amount(Currency amount) {
	    this.amount = amount;
	    return this;
	}

	/**
	* Tax information.
	*/
	private Tax tax;

	public Tax tax() { return tax; }
	
	public ShippingCost tax(Tax tax) {
	    this.tax = tax;
	    return this;
	}

    @Override
    public void serialize(Map<String, Object> serialized) {
        if (amount != null) {
            serialized.put("amount", this.amount);
        }
        if (tax != null) {
            serialized.put("tax", this.tax);
        }
    }

    @Override
    public void deserialize(Map<String, Object> values) {
        if (values.containsKey("amount")) {
            this.amount = new Currency();
            this.amount.deserialize((Map<String, Object>) values.get("amount"));
        }
        if (values.containsKey("tax")) {
            this.tax = new Tax();
            this.tax.deserialize((Map<String, Object>) values.get("tax"));
        }
    }
}

