// This class was generated on Sun, 30 Jul 2017 11:04:05 PDT by version 0.1 of Braintree SDK Generator
// Tax.java
// DO NOT EDIT
// @type object
// @json {"Type":"Tax","VariableName":"","Description":"Tax information.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":[{"Type":"Currency","VariableName":"amount","Description":"Base object for all financial value related fields (balance, payment due, etc.)","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"id","Description":"The resource ID.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"name","Description":"The tax name.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null},{"Type":"number","VariableName":"percent","Description":"The tax rate. Valid value is from 0.001 to 99.999.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null}]}

package com.paypal.sdk.invoices.object;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.serializer.Serializable;
import com.braintreepayments.http.serializer.Deserializable;

/**
 * Tax information.
 */
public class Tax implements Serializable, Deserializable {

    // Required default constructor
    public Tax() {}

	/**
	* Base object for all financial value related fields (balance, payment due, etc.)
	*/
	private Currency amount;

	public Currency amount() { return amount; }
	
	public Tax amount(Currency amount) {
	    this.amount = amount;
	    return this;
	}

	/**
	* The resource ID.
	*/
	private String id;

	public String id() { return id; }
	
	public Tax id(String id) {
	    this.id = id;
	    return this;
	}

	/**
	* REQUIRED
	* The tax name.
	*/
	private String name;

	public String name() { return name; }
	
	public Tax name(String name) {
	    this.name = name;
	    return this;
	}

	/**
	* REQUIRED
	* The tax rate. Valid value is from 0.001 to 99.999.
	*/
	private Double percent;

	public Double percent() { return percent; }
	
	public Tax percent(Double percent) {
	    this.percent = percent;
	    return this;
	}

    @Override
    public void serialize(Map<String, Object> serialized) {
        if (amount != null) {
            serialized.put("amount", this.amount);
        }
        if (id != null) {
            serialized.put("id", this.id);
        }
        if (name != null) {
            serialized.put("name", this.name);
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
        if (values.containsKey("id")) {
            this.id = (String) values.get("id");
        }
        if (values.containsKey("name")) {
            this.name = (String) values.get("name");
        }
        if (values.containsKey("percent")) {
            this.percent = ((Number) values.get("percent")).doubleValue();
        }
    }
}

