// This class was generated on Mon, 31 Jul 2017 18:27:14 UTC by version 0.1 of Braintree SDK Generator
// NameAndValuePair.java
// DO NOT EDIT
// @type object
// @json {"Type":"Name and Value Pair","VariableName":"","Description":"Define a type for name-and-value pairs. Limit the use of name-and-value pairs in an API. Obtain approval by architecture.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":[{"Type":"string","VariableName":"name","Description":"The key for the name-and-value pair. You must correlate the value and name types.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null},{"Type":"string","VariableName":"value","Description":"The value for the name-and-value pair.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null}]}

package com.paypal.sdk.payments.object;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.serializer.Serializable;
import com.braintreepayments.http.serializer.Deserializable;

/**
 * Define a type for name-and-value pairs. Limit the use of name-and-value pairs in an API. Obtain approval by architecture.
 */
public class NameAndValuePair implements Serializable, Deserializable {

    // Required default constructor
    public NameAndValuePair() {}

	/**
	* REQUIRED
	* The key for the name-and-value pair. You must correlate the value and name types.
	*/
	private String name;

	public String name() { return name; }
	
	public NameAndValuePair name(String name) {
	    this.name = name;
	    return this;
	}

	/**
	* REQUIRED
	* The value for the name-and-value pair.
	*/
	private String value;

	public String value() { return value; }
	
	public NameAndValuePair value(String value) {
	    this.value = value;
	    return this;
	}

    @Override
    public void serialize(Map<String, Object> serialized) {
        if (name != null) {
            serialized.put("name", this.name);
        }
        if (value != null) {
            serialized.put("value", this.value);
        }
    }

    @Override
    public void deserialize(Map<String, Object> values) {
        if (values.containsKey("name")) {
            this.name = (String) values.get("name");
        }
        if (values.containsKey("value")) {
            this.value = (String) values.get("value");
        }
    }
}

