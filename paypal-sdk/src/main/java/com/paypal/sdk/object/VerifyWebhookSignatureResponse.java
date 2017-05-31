// This class was generated on Wed, 31 May 2017 13:36:12 PDT by version 0.01 of Braintree SDK Generator
// .java
// DO NOT EDIT
// @type object
// @json {"Type":"Verify Webhook Signature Response","VariableName":"","Description":"The verify webhook signature response.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":[{"Type":"string","VariableName":"verification_status","Description":"The status of the signature verification.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":true,"Properties":null}]}

package com.paypal.sdk.object;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.experimental.Accessors;


/**
 * The verify webhook signature response.
 */
@Data
@Accessors(chain = true)
public class VerifyWebhookSignatureResponse {
	/**
	* REQUIRED
	* The status of the signature verification.
	*/
	@SerializedName("verification_status")
	private String verificationStatus;
}
