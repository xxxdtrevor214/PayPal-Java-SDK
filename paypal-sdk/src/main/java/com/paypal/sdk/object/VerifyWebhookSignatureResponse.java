// This class was generated on Wed, 21 Jun 2017 14:20:42 PDT by version 0.01 of Braintree SDK Generator
// VerifyWebhookSignatureResponse.java
// DO NOT EDIT
// @type object
// @json {"Type":"Verify Webhook Signature Response","VariableName":"","Description":"The verify webhook signature response.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":[{"Type":"string","VariableName":"verification_status","Description":"The status of the signature verification.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":true,"Properties":null}]}

package com.paypal.sdk.object;

import java.util.Map;
import java.util.List;
import com.google.gson.annotations.SerializedName;
/**
 * The verify webhook signature response.
 */
public class VerifyWebhookSignatureResponse {

	/**
	* REQUIRED
	* The status of the signature verification.
	*/
	@SerializedName("verification_status")
	private String verificationStatus;

	public String verificationStatus() { return verificationStatus; }
	
	public VerifyWebhookSignatureResponse verificationStatus(String verificationStatus) {
	    this.verificationStatus = verificationStatus;
	    return this;
	}
}
