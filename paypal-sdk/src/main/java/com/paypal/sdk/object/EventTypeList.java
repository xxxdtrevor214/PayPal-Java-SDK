// This class was generated on Fri, 02 Jun 2017 16:03:13 PDT by version 0.01 of Braintree SDK Generator
// EventTypeList.java
// DO NOT EDIT
// @type object
// @json {"Type":"EventTypeList","VariableName":"","Description":"List of webhook events.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":[{"Type":"Event Type","VariableName":"event_types","Description":"A list of webhook events.","IsArray":true,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.object;

import java.util.Map;
import java.util.List;
import com.google.gson.annotations.SerializedName;
/**
 * List of webhook events.
 */
public class EventTypeList {

	/**
	* A list of webhook events.
	*/
	@SerializedName("event_types")
	private List<EventType> eventTypes;

	public List<EventType> eventTypes() { return eventTypes; }
	
	public EventTypeList eventTypes(List<EventType> eventTypes) {
	    this.eventTypes = eventTypes;
	    return this;
	}
}
