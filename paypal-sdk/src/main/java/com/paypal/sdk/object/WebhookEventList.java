// This class was generated on Fri, 26 May 2017 11:06:13 PDT by version 0.01 of Braintree SDK Generator
// .java
// DO NOT EDIT
// @type object
// @json {"Type":"Webhook Event List","VariableName":"","Description":"List of webhooks events.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":[{"Type":"integer","VariableName":"count","Description":"The number of items in each range of results. Note that the response might have fewer items than the requested `page_size` value.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null},{"Type":"Event","VariableName":"events","Description":"A list of webhooks events.","IsArray":true,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null},{"Type":"Link Description Object","VariableName":"links","Description":"","IsArray":true,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.object;

import java.util.Map;
import java.util.List;
import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;


/**
 * List of webhooks events.
 */
@Data
@Accessors(chain = true)
public class WebhookEventList {
	/**
	* The number of items in each range of results. Note that the response might have fewer items than the requested `page_size` value.
	*/
	@SerializedName("count")
	private int count;
	/**
	* A list of webhooks events.
	*/
	@SerializedName("events")
	private List<Event> events;
	/**
	*/
	@SerializedName("links")
	private List<LinkDescriptionObject> links;
}
