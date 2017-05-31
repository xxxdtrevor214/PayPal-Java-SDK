// This class was generated on Wed, 31 May 2017 13:36:12 PDT by version 0.01 of Braintree SDK Generator
// .java
// DO NOT EDIT
// @type object
// @json {"Type":"error","VariableName":"","Description":"Details about an error.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":[{"Type":"string","VariableName":"debug_id","Description":"PayPal internal ID that is used for correlation purposes.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":true,"Properties":null},{"Type":"PPaaS Error Details","VariableName":"details","Description":"Additional details about the error.","IsArray":true,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"information_link","Description":"An information link, or URI, that shows detailed information about this error for the developer.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null},{"Type":"Link Description Object","VariableName":"links","Description":"Error context-specific [HATEOAS links](/docs/api/hateoas-links/).","IsArray":true,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"message","Description":"A message that describes the error.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":true,"Properties":null},{"Type":"string","VariableName":"name","Description":"Human-readable, unique name of the error.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":true,"Properties":null}]}

package com.paypal.sdk.object;

import java.util.Map;
import java.util.List;
import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;


/**
 * Details about an error.
 */
@Data
@Accessors(chain = true)
public class Error {
	/**
	* REQUIRED
	* PayPal internal ID that is used for correlation purposes.
	*/
	@SerializedName("debug_id")
	private String debugId;
	/**
	* Additional details about the error.
	*/
	@SerializedName("details")
	private List<PPaaSErrorDetails> details;
	/**
	* An information link, or URI, that shows detailed information about this error for the developer.
	*/
	@SerializedName("information_link")
	private String informationLink;
	/**
	* Error context-specific [HATEOAS links](/docs/api/hateoas-links/).
	*/
	@SerializedName("links")
	private List<LinkDescriptionObject> links;
	/**
	* REQUIRED
	* A message that describes the error.
	*/
	@SerializedName("message")
	private String message;
	/**
	* REQUIRED
	* Human-readable, unique name of the error.
	*/
	@SerializedName("name")
	private String name;
}
