// This class was generated on Wed, 21 Jun 2017 14:20:42 PDT by version 0.01 of Braintree SDK Generator
// EventList.java
// DO NOT EDIT
// @type object
// @json {"Type":"EventList","VariableName":"","Description":"List of webhooks events.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":[{"Type":"integer","VariableName":"count","Description":"The number of items in each range of results. Note that the response might have fewer items than the requested `page_size` value.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null},{"Type":"Event","VariableName":"events","Description":"A list of webhooks events.","IsArray":true,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null},{"Type":"Link Description Object","VariableName":"links","Description":"","IsArray":true,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.object;

import java.util.Map;
import java.util.List;
import com.google.gson.annotations.SerializedName;
/**
 * List of webhooks events.
 */
public class EventList {

	/**
	* The number of items in each range of results. Note that the response might have fewer items than the requested `page_size` value.
	*/
	@SerializedName("count")
	private int count;

	public int count() { return count; }
	
	public EventList count(int count) {
	    this.count = count;
	    return this;
	}

	/**
	* A list of webhooks events.
	*/
	@SerializedName("events")
	private List<Event> events;

	public List<Event> events() { return events; }
	
	public EventList events(List<Event> events) {
	    this.events = events;
	    return this;
	}

	/**
	*/
	@SerializedName("links")
	private List<LinkDescriptionObject> links;

	public List<LinkDescriptionObject> links() { return links; }
	
	public EventList links(List<LinkDescriptionObject> links) {
	    this.links = links;
	    return this;
	}
}
