// This class was generated on Wed, 21 Jun 2017 14:20:42 PDT by version 0.01 of Braintree SDK Generator
// EventType.java
// DO NOT EDIT
// @type object
// @json {"Type":"Event Type","VariableName":"","Description":"A list of events.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":[{"Type":"string","VariableName":"description","Description":"A human-readable description of the event.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"name","Description":"The unique event name.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":true,"Properties":null},{"Type":"string","VariableName":"status","Description":"The status of a webhook event.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.object;

import java.util.Map;
import java.util.List;
import com.google.gson.annotations.SerializedName;
/**
 * A list of events.
 */
public class EventType {

	/**
	* A human-readable description of the event.
	*/
	@SerializedName("description")
	private String description;

	public String description() { return description; }
	
	public EventType description(String description) {
	    this.description = description;
	    return this;
	}

	/**
	* REQUIRED
	* The unique event name.
	*/
	@SerializedName("name")
	private String name;

	public String name() { return name; }
	
	public EventType name(String name) {
	    this.name = name;
	    return this;
	}

	/**
	* The status of a webhook event.
	*/
	@SerializedName("status")
	private String status;

	public String status() { return status; }
	
	public EventType status(String status) {
	    this.status = status;
	    return this;
	}
}
