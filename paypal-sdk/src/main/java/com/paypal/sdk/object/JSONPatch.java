// This class was generated on Fri, 26 May 2017 11:06:13 PDT by version 0.01 of Braintree SDK Generator
// .java
// DO NOT EDIT
// @type object
// @json {"Type":"JSON Patch","VariableName":"","Description":"A JSON patch object to use to apply partial updates to resources.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":[{"Type":"string","VariableName":"from","Description":"A JSON pointer that references the location in the target document from which to move the value. Required for the `move` operation.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"op","Description":"The operation to perform.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":true,"Properties":null},{"Type":"string","VariableName":"path","Description":"A JSON pointer that references a location in the target document where the operation is performed.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null},{"Type":"number","VariableName":"value","Description":"The value to apply based on the operation. The `remove` operation does not require a `value`.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.object;

import java.util.Map;
import java.util.List;
import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;


/**
 * A JSON patch object to use to apply partial updates to resources.
 */
@Data
@Accessors(chain = true)
public class JSONPatch {
	/**
	* A JSON pointer that references the location in the target document from which to move the value. Required for the `move` operation.
	*/
	@SerializedName("from")
	private String from;
	/**
	* REQUIRED
	* The operation to perform.
	*/
	@SerializedName("op")
	private String op;
	/**
	* A JSON pointer that references a location in the target document where the operation is performed.
	*/
	@SerializedName("path")
	private String path;
	/**
	* The value to apply based on the operation. The `remove` operation does not require a `value`.
	*/
	@SerializedName("value")
	private double value;
}
