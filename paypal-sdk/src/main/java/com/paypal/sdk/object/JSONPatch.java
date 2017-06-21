// This class was generated on Wed, 21 Jun 2017 14:20:42 PDT by version 0.01 of Braintree SDK Generator
// JSONPatch.java
// DO NOT EDIT
// @type object
// @json {"Type":"JSON Patch","VariableName":"","Description":"A JSON patch object to use to apply partial updates to resources.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":[{"Type":"string","VariableName":"from","Description":"A JSON pointer that references the location in the target document from which to move the value. Required for the `move` operation.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"op","Description":"The operation to perform.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":true,"Properties":null},{"Type":"string","VariableName":"path","Description":"Nothing to see here!","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null},{"Type":"object","VariableName":"value","Description":"The value to apply based on the operation. The `remove` operation does not require a `value`.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.object;

import java.util.Map;
import java.util.List;
import com.google.gson.annotations.SerializedName;
/**
 * A JSON patch object to use to apply partial updates to resources.
 */
public class JSONPatch {

	/**
	* A JSON pointer that references the location in the target document from which to move the value. Required for the `move` operation.
	*/
	@SerializedName("from")
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
	@SerializedName("op")
	private String op;

	public String op() { return op; }
	
	public JSONPatch op(String op) {
	    this.op = op;
	    return this;
	}

	/**
	* Nothing to see here!
	*/
	@SerializedName("path")
	private String path;

	public String path() { return path; }
	
	public JSONPatch path(String path) {
	    this.path = path;
	    return this;
	}

	/**
	* The value to apply based on the operation. The `remove` operation does not require a `value`.
	*/
	@SerializedName("value")
	private Map<String,Object> value;

	public Map<String,Object> value() { return value; }
	
	public JSONPatch value(Map<String,Object> value) {
	    this.value = value;
	    return this;
	}
}
