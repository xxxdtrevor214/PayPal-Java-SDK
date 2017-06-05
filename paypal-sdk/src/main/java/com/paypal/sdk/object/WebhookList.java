// This class was generated on Mon, 05 Jun 2017 14:29:09 PDT by version 0.01 of Braintree SDK Generator
// WebhookList.java
// DO NOT EDIT
// @type object
// @json {"Type":"WebhookList","VariableName":"","Description":"List of webhooks.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":[{"Type":"Webhook","VariableName":"webhooks","Description":"A list of webhooks.","IsArray":true,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.object;

import java.util.Map;
import java.util.List;
import com.google.gson.annotations.SerializedName;
/**
 * List of webhooks.
 */
public class WebhookList {

	/**
	* A list of webhooks.
	*/
	@SerializedName("webhooks")
	private List<Webhook> webhooks;

	public List<Webhook> webhooks() { return webhooks; }
	
	public WebhookList webhooks(List<Webhook> webhooks) {
	    this.webhooks = webhooks;
	    return this;
	}
}
