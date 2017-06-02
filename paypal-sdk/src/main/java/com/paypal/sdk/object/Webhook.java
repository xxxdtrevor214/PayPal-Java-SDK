// This class was generated on Fri, 02 Jun 2017 16:03:13 PDT by version 0.01 of Braintree SDK Generator
// Webhook.java
// DO NOT EDIT
// @type object
// @json {"Type":"Webhook","VariableName":"","Description":"One or more webhook objects.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":[{"Type":"Event Type","VariableName":"event_types","Description":"A list of up to ten events to which to subscribe your webhook. To subscribe to all events including new events as they are added, specify the asterisk (`*`) wildcard. To replace the `event_types` array, specify the `*` wildcard. To list all supported events, [list available events](#available-event-type.list).","IsArray":true,"ReadOnly":false,"Visible":false,"Required":true,"Properties":null},{"Type":"string","VariableName":"id","Description":"The ID of the webhook.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null},{"Type":"Link Description Object","VariableName":"links","Description":"The request-related [HATEOAS links](/docs/api/hateoas-links/).","IsArray":true,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"url","Description":"The URL that is configured to listen on `localhost` for incoming `POST` notification messages that contain event information.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":true,"Properties":null}]}

package com.paypal.sdk.object;

import java.util.Map;
import java.util.List;
import com.google.gson.annotations.SerializedName;
/**
 * One or more webhook objects.
 */
public class Webhook {

	/**
	* REQUIRED
	* A list of up to ten events to which to subscribe your webhook. To subscribe to all events including new events as they are added, specify the asterisk (`*`) wildcard. To replace the `event_types` array, specify the `*` wildcard. To list all supported events, [list available events](#available-event-type.list).
	*/
	@SerializedName("event_types")
	private List<EventType> eventTypes;

	public List<EventType> eventTypes() { return eventTypes; }
	
	public Webhook eventTypes(List<EventType> eventTypes) {
	    this.eventTypes = eventTypes;
	    return this;
	}

	/**
	* The ID of the webhook.
	*/
	@SerializedName("id")
	private String id;

	public String id() { return id; }
	
	public Webhook id(String id) {
	    this.id = id;
	    return this;
	}

	/**
	* The request-related [HATEOAS links](/docs/api/hateoas-links/).
	*/
	@SerializedName("links")
	private List<LinkDescriptionObject> links;

	public List<LinkDescriptionObject> links() { return links; }
	
	public Webhook links(List<LinkDescriptionObject> links) {
	    this.links = links;
	    return this;
	}

	/**
	* REQUIRED
	* The URL that is configured to listen on `localhost` for incoming `POST` notification messages that contain event information.
	*/
	@SerializedName("url")
	private String url;

	public String url() { return url; }
	
	public Webhook url(String url) {
	    this.url = url;
	    return this;
	}
}
