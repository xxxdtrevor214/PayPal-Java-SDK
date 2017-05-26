// This class was generated on Fri, 26 May 2017 11:06:13 PDT by version 0.01 of Braintree SDK Generator
// .java
// DO NOT EDIT
// @type object
// @json {"Type":"Event Type","VariableName":"","Description":"A list of events.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":[{"Type":"string","VariableName":"description","Description":"A human-readable description of the event.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"name","Description":"The unique event name.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":true,"Properties":null},{"Type":"string","VariableName":"status","Description":"The status of a webhook event.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.object;

import java.util.Map;
import java.util.List;
import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;


/**
 * A list of events.
 */
@Data
@Accessors(chain = true)
public class EventType {
	/**
	* A human-readable description of the event.
	*/
	@SerializedName("description")
	private String description;
	/**
	* REQUIRED
	* The unique event name.
	*/
	@SerializedName("name")
	private String name;
	/**
	* The status of a webhook event.
	*/
	@SerializedName("status")
	private String status;
}
