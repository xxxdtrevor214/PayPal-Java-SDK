// This class was generated on Fri, 26 May 2017 11:06:13 PDT by version 0.01 of Braintree SDK Generator
// .java
// DO NOT EDIT
// @type object
// @json {"Type":"Event","VariableName":"","Description":"A webhook event notification.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":[{"Type":"string","VariableName":"create_time","Description":"The date and time when the webhook event notification was created, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6).","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"event_type","Description":"The event that triggered the webhook event notification.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"event_version","Description":"The version of the event.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"id","Description":"The ID of the webhook event notification.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null},{"Type":"Link Description Object","VariableName":"links","Description":"The request-related [HATEOAS links](/docs/api/hateoas-links).","IsArray":true,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null},{"Type":"object","VariableName":"resource","Description":"The resource that triggered the webhook event notification.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"resource_type","Description":"The name of the resource related to the webhook notification event.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"status","Description":"The event transmission status. Displayed only for internal API calls through the PayPal Developer portal.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"summary","Description":"A summary description for the event notification. For example, `A payment authorization was created.`","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null},{"Type":"Event Transmission","VariableName":"transmissions","Description":"The list of transmissions for an event. Displayed only for internal API calls through the PayPal Developer portal.","IsArray":true,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.object;

import java.util.Map;
import java.util.List;
import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;


/**
 * A webhook event notification.
 */
@Data
@Accessors(chain = true)
public class Event {
	/**
	* The date and time when the webhook event notification was created, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6).
	*/
	@SerializedName("create_time")
	private String createTime;
	/**
	* The event that triggered the webhook event notification.
	*/
	@SerializedName("event_type")
	private String eventType;
	/**
	* The version of the event.
	*/
	@SerializedName("event_version")
	private String eventVersion;
	/**
	* The ID of the webhook event notification.
	*/
	@SerializedName("id")
	private String id;
	/**
	* The request-related [HATEOAS links](/docs/api/hateoas-links).
	*/
	@SerializedName("links")
	private List<LinkDescriptionObject> links;
	/**
	* The resource that triggered the webhook event notification.
	*/
	@SerializedName("resource")
	private Map<String,Object> resource;
	/**
	* The name of the resource related to the webhook notification event.
	*/
	@SerializedName("resource_type")
	private String resourceType;
	/**
	* The event transmission status. Displayed only for internal API calls through the PayPal Developer portal.
	*/
	@SerializedName("status")
	private String status;
	/**
	* A summary description for the event notification. For example, `A payment authorization was created.`
	*/
	@SerializedName("summary")
	private String summary;
	/**
	* The list of transmissions for an event. Displayed only for internal API calls through the PayPal Developer portal.
	*/
	@SerializedName("transmissions")
	private List<EventTransmission> transmissions;
}
