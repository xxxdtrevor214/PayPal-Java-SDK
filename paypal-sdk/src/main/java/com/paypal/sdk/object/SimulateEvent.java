// This class was generated on Fri, 26 May 2017 11:06:13 PDT by version 0.01 of Braintree SDK Generator
// .java
// DO NOT EDIT
// @type object
// @json {"Type":"Simulate Event","VariableName":"","Description":"Uses a sample payload to simulate a mock webhook event.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":[{"Type":"string","VariableName":"event_type","Description":"The event name. Specify one of the subscribed events. For each request, provide only one event.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":true,"Properties":null},{"Type":"string","VariableName":"url","Description":"The URL for the webhook endpoint. If omitted, the webhook ID is required.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"webhook_id","Description":"The ID of the webhook. If omitted, the URL is required.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.object;

import java.util.Map;
import java.util.List;
import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;


/**
 * Uses a sample payload to simulate a mock webhook event.
 */
@Data
@Accessors(chain = true)
public class SimulateEvent {
	/**
	* REQUIRED
	* The event name. Specify one of the subscribed events. For each request, provide only one event.
	*/
	@SerializedName("event_type")
	private String eventType;
	/**
	* The URL for the webhook endpoint. If omitted, the webhook ID is required.
	*/
	@SerializedName("url")
	private String url;
	/**
	* The ID of the webhook. If omitted, the URL is required.
	*/
	@SerializedName("webhook_id")
	private String webhookId;
}
