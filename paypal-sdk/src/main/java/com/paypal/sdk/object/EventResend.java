// This class was generated on Mon, 05 Jun 2017 14:29:09 PDT by version 0.01 of Braintree SDK Generator
// EventResend.java
// DO NOT EDIT
// @type object
// @json {"Type":"Event Resend","VariableName":"","Description":"Resends a webhook event notification, by ID.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":[{"Type":"string","VariableName":"webhook_ids","Description":"A list of webhook account IDs.","IsArray":true,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.object;

import java.util.Map;
import java.util.List;
import com.google.gson.annotations.SerializedName;
/**
 * Resends a webhook event notification, by ID.
 */
public class EventResend {

	/**
	* A list of webhook account IDs.
	*/
	@SerializedName("webhook_ids")
	private List<String> webhookIds;

	public List<String> webhookIds() { return webhookIds; }
	
	public EventResend webhookIds(List<String> webhookIds) {
	    this.webhookIds = webhookIds;
	    return this;
	}
}
