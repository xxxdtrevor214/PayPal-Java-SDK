// This class was generated on Wed, 31 May 2017 13:36:12 PDT by version 0.01 of Braintree SDK Generator
// .java
// DO NOT EDIT
// @type object
// @json {"Type":"PPaaS Error Details","VariableName":"","Description":"Error details.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":[{"Type":"string","VariableName":"field","Description":"The field that caused the error. If the field is in the body, set this value to the JSON pointer to that field. Required for client-side errors.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"issue","Description":"The reason for the error.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":true,"Properties":null},{"Type":"string","VariableName":"location","Description":"The location of the field that caused the error. A valid value is `body`, `path`, or `query`. Default is `body`.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"value","Description":"The value of the field that caused the error.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.object;

import java.util.Map;
import java.util.List;
import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;


/**
 * Error details.
 */
@Data
@Accessors(chain = true)
public class PPaaSErrorDetails {
	/**
	* The field that caused the error. If the field is in the body, set this value to the JSON pointer to that field. Required for client-side errors.
	*/
	@SerializedName("field")
	private String field;
	/**
	* REQUIRED
	* The reason for the error.
	*/
	@SerializedName("issue")
	private String issue;
	/**
	* The location of the field that caused the error. A valid value is `body`, `path`, or `query`. Default is `body`.
	*/
	@SerializedName("location")
	private String location;
	/**
	* The value of the field that caused the error.
	*/
	@SerializedName("value")
	private String value;
}
