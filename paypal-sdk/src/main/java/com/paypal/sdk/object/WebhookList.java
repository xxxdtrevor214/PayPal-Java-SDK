// This class was generated on Wed, 31 May 2017 13:36:12 PDT by version 0.01 of Braintree SDK Generator
// .java
// DO NOT EDIT
// @type object
// @json {"Type":"WebhookList","VariableName":"","Description":"List of webhooks.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":[{"Type":"Webhook","VariableName":"webhooks","Description":"A list of webhooks.","IsArray":true,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.object;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;


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
