// This class was generated on Mon, 31 Jul 2017 18:27:14 UTC by version 0.1 of Braintree SDK Generator
// JSONPatch.java
// DO NOT EDIT
// @type object
// @json {"Type":"JSON Patch","VariableName":"","Description":"A JSON patch object to use to apply partial updates to resources.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":[{"Type":"string","VariableName":"from","Description":"A JSON pointer. References the location in the target document from which to move the value. Required for the `move` operation.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"op","Description":"The operation to perform.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null},{"Type":"string","VariableName":"path","Description":"A JSON pointer. References a location in the target document where the operation is performed.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"object","VariableName":"value","Description":"The value to apply. The `remove` operation does not require a value.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.payments.object;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.serializer.Serializable;
import com.braintreepayments.http.serializer.Deserializable;

/**
 * A JSON patch object to use to apply partial updates to resources.
 */
public class JSONPatch implements Serializable, Deserializable {

    // Required default constructor
    public JSONPatch() {}

	/**
	* A JSON pointer. References the location in the target document from which to move the value. Required for the `move` operation.
	*/
	private String from;

	public String from() { return from; }
	
	public JSONPatch from(String from) {
	    this.from = from;
	    return this;
	}

	/**
	* REQUIRED
	* The operation to perform.
	*/
	private String op;

	public String op() { return op; }
	
	public JSONPatch op(String op) {
	    this.op = op;
	    return this;
	}

	/**
	* A JSON pointer. References a location in the target document where the operation is performed.
	*/
	private String path;

	public String path() { return path; }
	
	public JSONPatch path(String path) {
	    this.path = path;
	    return this;
	}

	/**
	* The value to apply. The `remove` operation does not require a value.
	*/
	private Object value;

	public Object value() { return value; }
	
	public JSONPatch value(Object value) {
	    this.value = value;
	    return this;
	}

    @Override
    public void serialize(Map<String, Object> serialized) {
        if (from != null) {
            serialized.put("from", this.from);
        }
        if (op != null) {
            serialized.put("op", this.op);
        }
        if (path != null) {
            serialized.put("path", this.path);
        }
        if (value != null) {
            serialized.put("value", this.value);
        }
    }

    @Override
    public void deserialize(Map<String, Object> values) {
        if (values.containsKey("from")) {
            this.from = (String) values.get("from");
        }
        if (values.containsKey("op")) {
            this.op = (String) values.get("op");
        }
        if (values.containsKey("path")) {
            this.path = (String) values.get("path");
        }
        if (values.containsKey("value")) {
            this.value = values.get("value");
        }
    }
}

