// This class was generated on Fri, 26 May 2017 11:06:13 PDT by version 0.01 of Braintree SDK Generator
// .java
// DO NOT EDIT
// @type object
// @json {"Type":"Verify Webhook Signature Response","VariableName":"","Description":"The verify webhook signature response.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":[{"Type":"string","VariableName":"verification_status","Description":"The status of the signature verification.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":true,"Properties":null}]}

package com.paypal.sdk.object;

import java.util.Map;
import java.util.List;
import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
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
