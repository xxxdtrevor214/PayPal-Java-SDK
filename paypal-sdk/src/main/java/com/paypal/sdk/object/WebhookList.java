// This class was generated on Fri, 26 May 2017 11:06:13 PDT by version 0.01 of Braintree SDK Generator
// .java
// DO NOT EDIT
// @type object
// @json {"Type":"Webhook List","VariableName":"","Description":"List of webhooks.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":[{"Type":"Webhook","VariableName":"webhooks","Description":"A list of webhooks.","IsArray":true,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.object;

import java.util.Map;
import java.util.List;
import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;


/**
 * List of webhooks.
 */
@Data
@Accessors(chain = true)
public class WebhookList {
	/**
	* A list of webhooks.
	*/
	@SerializedName("webhooks")
	private List<Webhook> webhooks;
}
