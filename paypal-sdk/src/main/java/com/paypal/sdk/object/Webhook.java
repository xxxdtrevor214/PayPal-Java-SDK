// This class was generated on Fri, 26 May 2017 11:06:13 PDT by version 0.01 of Braintree SDK Generator
// .java
// DO NOT EDIT
// @type object
// @json {"Type":"Webhook","VariableName":"","Description":"One or more webhook objects.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":[{"Type":"Event Type","VariableName":"event_types","Description":"A list of up to ten events to which to subscribe your webhook. To subscribe to all events including new events as they are added, specify the asterisk (`*`) wildcard. To replace the `event_types` array, specify the `*` wildcard. To list all supported events, [list available events](#available-event-type.list).","IsArray":true,"ReadOnly":false,"Visible":false,"Required":true,"Properties":null},{"Type":"string","VariableName":"id","Description":"The ID of the webhook.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null},{"Type":"Link Description Object","VariableName":"links","Description":"The request-related [HATEOAS links](/docs/api/hateoas-links/).","IsArray":true,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"url","Description":"The URL that is configured to listen on `localhost` for incoming `POST` notification messages that contain event information.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":true,"Properties":null}]}

package com.paypal.sdk.object;

import java.util.Map;
import java.util.List;
import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;


/**
 * One or more webhook objects.
 */
@Data
@Accessors(chain = true)
public class Webhook {
	/**
	* REQUIRED
	* A list of up to ten events to which to subscribe your webhook. To subscribe to all events including new events as they are added, specify the asterisk (`*`) wildcard. To replace the `event_types` array, specify the `*` wildcard. To list all supported events, [list available events](#available-event-type.list).
	*/
	@SerializedName("event_types")
	private List<EventType> eventTypes;
	/**
	* The ID of the webhook.
	*/
	@SerializedName("id")
	private String id;
	/**
	* The request-related [HATEOAS links](/docs/api/hateoas-links/).
	*/
	@SerializedName("links")
	private List<LinkDescriptionObject> links;
	/**
	* REQUIRED
	* The URL that is configured to listen on `localhost` for incoming `POST` notification messages that contain event information.
	*/
	@SerializedName("url")
	private String url;
}
