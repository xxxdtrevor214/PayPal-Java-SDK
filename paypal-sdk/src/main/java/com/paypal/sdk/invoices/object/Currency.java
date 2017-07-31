// This class was generated on Sun, 30 Jul 2017 11:04:05 PDT by version 0.1 of Braintree SDK Generator
// Currency.java
// DO NOT EDIT
// @type object
// @json {"Type":"Currency","VariableName":"","Description":"Base object for all financial value related fields (balance, payment due, etc.)","IsArray":false,"ReadOnly":false,"Required":false,"Properties":[{"Type":"string","VariableName":"currency","Description":"3 letter currency code as defined by ISO 4217.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null},{"Type":"string","VariableName":"value","Description":"amount up to N digit after the decimals separator as defined in ISO 4217 for the appropriate currency code.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null}]}

package com.paypal.sdk.invoices.object;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.serializer.Serializable;
import com.braintreepayments.http.serializer.Deserializable;

/**
 * Base object for all financial value related fields (balance, payment due, etc.)
 */
public class Currency implements Serializable, Deserializable {

    // Required default constructor
    public Currency() {}

	/**
	* REQUIRED
	* 3 letter currency code as defined by ISO 4217.
	*/
	private String currency;

	public String currency() { return currency; }
	
	public Currency currency(String currency) {
	    this.currency = currency;
	    return this;
	}

	/**
	* REQUIRED
	* amount up to N digit after the decimals separator as defined in ISO 4217 for the appropriate currency code.
	*/
	private String value;

	public String value() { return value; }
	
	public Currency value(String value) {
	    this.value = value;
	    return this;
	}

    @Override
    public void serialize(Map<String, Object> serialized) {
        if (currency != null) {
            serialized.put("currency", this.currency);
        }
        if (value != null) {
            serialized.put("value", this.value);
        }
    }

    @Override
    public void deserialize(Map<String, Object> values) {
        if (values.containsKey("currency")) {
            this.currency = (String) values.get("currency");
        }
        if (values.containsKey("value")) {
            this.value = (String) values.get("value");
        }
    }
}

