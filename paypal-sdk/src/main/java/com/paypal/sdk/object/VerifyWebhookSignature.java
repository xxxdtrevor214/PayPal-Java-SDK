// This class was generated on Fri, 26 May 2017 11:06:13 PDT by version 0.01 of Braintree SDK Generator
// .java
// DO NOT EDIT
// @type object
// @json {"Type":"Verify Webhook Signature","VariableName":"","Description":"Verify the webhook signature.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":[{"Type":"string","VariableName":"auth_algo","Description":"The algorithm that PayPal uses to generate the signature and that you can use to verify the signature. Extract this value from the `PAYPAL-AUTH-ALGO` response header, which is received with the webhook notification.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":true,"Properties":null},{"Type":"string","VariableName":"cert_url","Description":"The X.509 public key certificate. Download the certificate from this URL and use it to verify the signature. Extract this value from the `PAYPAL-CERT-URL` response header, which is received with the webhook notification.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":true,"Properties":null},{"Type":"string","VariableName":"transmission_id","Description":"The ID of the HTTP transmission. Contained in the `PAYPAL-TRANSMISSION-ID` header of the notification message.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":true,"Properties":null},{"Type":"string","VariableName":"transmission_sig","Description":"The PayPal-generated asymmetric signature. Contained in the `PAYPAL-TRANSMISSION-SIG` header of the notification message.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":true,"Properties":null},{"Type":"string","VariableName":"transmission_time","Description":"The date and time of the HTTP transmission. Contained in the `PAYPAL-TRANSMISSION-TIME` header of the notification message.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":true,"Properties":null},{"Type":"Event","VariableName":"webhook_event","Description":"A webhook event notification.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":true,"Properties":null},{"Type":"string","VariableName":"webhook_id","Description":"The ID of the webhook as configured in your Developer Portal account.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":true,"Properties":null}]}

package com.paypal.sdk.object;

import java.util.Map;
import java.util.List;
import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;


/**
 * Verify the webhook signature.
 */
@Data
@Accessors(chain = true)
public class VerifyWebhookSignature {
	/**
	* REQUIRED
	* The algorithm that PayPal uses to generate the signature and that you can use to verify the signature. Extract this value from the `PAYPAL-AUTH-ALGO` response header, which is received with the webhook notification.
	*/
	@SerializedName("auth_algo")
	private String authAlgo;
	/**
	* REQUIRED
	* The X.509 public key certificate. Download the certificate from this URL and use it to verify the signature. Extract this value from the `PAYPAL-CERT-URL` response header, which is received with the webhook notification.
	*/
	@SerializedName("cert_url")
	private String certUrl;
	/**
	* REQUIRED
	* The ID of the HTTP transmission. Contained in the `PAYPAL-TRANSMISSION-ID` header of the notification message.
	*/
	@SerializedName("transmission_id")
	private String transmissionId;
	/**
	* REQUIRED
	* The PayPal-generated asymmetric signature. Contained in the `PAYPAL-TRANSMISSION-SIG` header of the notification message.
	*/
	@SerializedName("transmission_sig")
	private String transmissionSig;
	/**
	* REQUIRED
	* The date and time of the HTTP transmission. Contained in the `PAYPAL-TRANSMISSION-TIME` header of the notification message.
	*/
	@SerializedName("transmission_time")
	private String transmissionTime;
	/**
	* REQUIRED
	* A webhook event notification.
	*/
	@SerializedName("webhook_event")
	private Event webhookEvent;
	/**
	* REQUIRED
	* The ID of the webhook as configured in your Developer Portal account.
	*/
	@SerializedName("webhook_id")
	private String webhookId;
}
