// This class was generated on Mon, 05 Jun 2017 14:29:09 PDT by version 0.01 of Braintree SDK Generator
// SimulateEvent.java
// DO NOT EDIT
// @type object
// @json {"Type":"Simulate Event","VariableName":"","Description":"Uses a sample payload to simulate a mock webhook event.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":[{"Type":"string","VariableName":"event_type","Description":"The event name. Specify one of the subscribed events. For each request, provide only one event.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":true,"Properties":null},{"Type":"string","VariableName":"url","Description":"The URL for the webhook endpoint. If omitted, the webhook ID is required.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"webhook_id","Description":"The ID of the webhook. If omitted, the URL is required.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.object;

import com.google.gson.annotations.SerializedName;
/**
 * Uses a sample payload to simulate a mock webhook event.
 */
public class SimulateEvent {

	/**
	* REQUIRED
	* The event name. Specify one of the subscribed events. For each request, provide only one event.
	*/
	@SerializedName("event_type")
	private String eventType;

	public String eventType() { return eventType; }
	
	public SimulateEvent eventType(String eventType) {
	    this.eventType = eventType;
	    return this;
	}

	/**
	* The URL for the webhook endpoint. If omitted, the webhook ID is required.
	*/
	@SerializedName("url")
	private String url;

	public String url() { return url; }
	
	public SimulateEvent url(String url) {
	    this.url = url;
	    return this;
	}

	/**
	* The ID of the webhook. If omitted, the URL is required.
	*/
	@SerializedName("webhook_id")
	private String webhookId;

	public String webhookId() { return webhookId; }
	
	public SimulateEvent webhookId(String webhookId) {
	    this.webhookId = webhookId;
	    return this;
	}
}
