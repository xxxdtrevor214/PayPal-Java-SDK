// This class was generated on Mon, 05 Jun 2017 14:29:09 PDT by version 0.01 of Braintree SDK Generator
// Event.java
// DO NOT EDIT
// @type object
// @json {"Type":"Event","VariableName":"","Description":"A webhook event notification.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":[{"Type":"string","VariableName":"create_time","Description":"The date and time when the webhook event notification was created, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6).","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"event_type","Description":"The event that triggered the webhook event notification.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"id","Description":"The ID of the webhook event notification.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null},{"Type":"Link Description Object","VariableName":"links","Description":"The request-related [HATEOAS links](/docs/api/hateoas-links).","IsArray":true,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"resource_type","Description":"The name of the resource related to the webhook notification event.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"status","Description":"The event transmission status. Displayed only for internal API calls through the PayPal Developer portal.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"summary","Description":"A summary description for the event notification. For example, `A payment authorization was created.`","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null},{"Type":"Event Transmission","VariableName":"transmissions","Description":"The list of transmissions for an event. Displayed only for internal API calls through the PayPal Developer portal.","IsArray":true,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.object;

import java.util.Map;
import java.util.List;
import com.google.gson.annotations.SerializedName;
/**
 * A webhook event notification.
 */
public class Event {

	/**
	* The date and time when the webhook event notification was created, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6).
	*/
	@SerializedName("create_time")
	private String createTime;

	public String createTime() { return createTime; }
	
	public Event createTime(String createTime) {
	    this.createTime = createTime;
	    return this;
	}

	/**
	* The event that triggered the webhook event notification.
	*/
	@SerializedName("event_type")
	private String eventType;

	public String eventType() { return eventType; }
	
	public Event eventType(String eventType) {
	    this.eventType = eventType;
	    return this;
	}

	/**
	* The ID of the webhook event notification.
	*/
	@SerializedName("id")
	private String id;

	public String id() { return id; }
	
	public Event id(String id) {
	    this.id = id;
	    return this;
	}

	/**
	* The request-related [HATEOAS links](/docs/api/hateoas-links).
	*/
	@SerializedName("links")
	private List<LinkDescriptionObject> links;

	public List<LinkDescriptionObject> links() { return links; }
	
	public Event links(List<LinkDescriptionObject> links) {
	    this.links = links;
	    return this;
	}

	/**
	* The name of the resource related to the webhook notification event.
	*/
	@SerializedName("resource_type")
	private String resourceType;

	public String resourceType() { return resourceType; }
	
	public Event resourceType(String resourceType) {
	    this.resourceType = resourceType;
	    return this;
	}

	/**
	* The event transmission status. Displayed only for internal API calls through the PayPal Developer portal.
	*/
	@SerializedName("status")
	private String status;

	public String status() { return status; }
	
	public Event status(String status) {
	    this.status = status;
	    return this;
	}

	/**
	* A summary description for the event notification. For example, `A payment authorization was created.`
	*/
	@SerializedName("summary")
	private String summary;

	public String summary() { return summary; }
	
	public Event summary(String summary) {
	    this.summary = summary;
	    return this;
	}

	/**
	* The list of transmissions for an event. Displayed only for internal API calls through the PayPal Developer portal.
	*/
	@SerializedName("transmissions")
	private List<EventTransmission> transmissions;

	public List<EventTransmission> transmissions() { return transmissions; }
	
	public Event transmissions(List<EventTransmission> transmissions) {
	    this.transmissions = transmissions;
	    return this;
	}
}
