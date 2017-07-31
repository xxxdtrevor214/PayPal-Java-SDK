// This class was generated on Sun, 30 Jul 2017 11:04:05 PDT by version 0.1 of Braintree SDK Generator
// InvoiceNumber.java
// DO NOT EDIT
// @type object
// @json {"Type":"Invoice number","VariableName":"","Description":"","IsArray":false,"ReadOnly":false,"Required":false,"Properties":[{"Type":"string","VariableName":"number","Description":"The next invoice number that is available to the merchant. This number is auto-incremented from the most recent invoice number.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.invoices.object;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.serializer.Serializable;
import com.braintreepayments.http.serializer.Deserializable;

public class InvoiceNumber implements Serializable, Deserializable {

    // Required default constructor
    public InvoiceNumber() {}

	/**
	* The next invoice number that is available to the merchant. This number is auto-incremented from the most recent invoice number.
	*/
	private String number;

	public String number() { return number; }
	
	public InvoiceNumber number(String number) {
	    this.number = number;
	    return this;
	}

    @Override
    public void serialize(Map<String, Object> serialized) {
        if (number != null) {
            serialized.put("number", this.number);
        }
    }

    @Override
    public void deserialize(Map<String, Object> values) {
        if (values.containsKey("number")) {
            this.number = (String) values.get("number");
        }
    }
}

