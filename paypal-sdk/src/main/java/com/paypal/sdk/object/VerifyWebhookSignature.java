// This class was generated on Fri, 02 Jun 2017 16:03:13 PDT by version 0.01 of Braintree SDK Generator
// VerifyWebhookSignature.java
// DO NOT EDIT
// @type object
// @json {"Type":"Verify Webhook Signature","VariableName":"","Description":"Verify the webhook signature.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":[{"Type":"string","VariableName":"auth_algo","Description":"The algorithm that PayPal uses to generate the signature and that you can use to verify the signature. Extract this value from the `PAYPAL-AUTH-ALGO` response header, which is received with the webhook notification.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":true,"Properties":null},{"Type":"string","VariableName":"cert_url","Description":"The X.509 public key certificate. Download the certificate from this URL and use it to verify the signature. Extract this value from the `PAYPAL-CERT-URL` response header, which is received with the webhook notification.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":true,"Properties":null},{"Type":"string","VariableName":"transmission_id","Description":"The ID of the HTTP transmission. Contained in the `PAYPAL-TRANSMISSION-ID` header of the notification message.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":true,"Properties":null},{"Type":"string","VariableName":"transmission_sig","Description":"The PayPal-generated asymmetric signature. Contained in the `PAYPAL-TRANSMISSION-SIG` header of the notification message.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":true,"Properties":null},{"Type":"string","VariableName":"transmission_time","Description":"The date and time of the HTTP transmission. Contained in the `PAYPAL-TRANSMISSION-TIME` header of the notification message.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":true,"Properties":null},{"Type":"Event","VariableName":"webhook_event","Description":"A webhook event notification.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":true,"Properties":null},{"Type":"string","VariableName":"webhook_id","Description":"The ID of the webhook as configured in your Developer Portal account.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":true,"Properties":null}]}

package com.paypal.sdk.object;

import java.util.Map;
import java.util.List;
import com.google.gson.annotations.SerializedName;
/**
 * Verify the webhook signature.
 */
public class VerifyWebhookSignature {

	/**
	* REQUIRED
	* The algorithm that PayPal uses to generate the signature and that you can use to verify the signature. Extract this value from the `PAYPAL-AUTH-ALGO` response header, which is received with the webhook notification.
	*/
	@SerializedName("auth_algo")
	private String authAlgo;

	public String authAlgo() { return authAlgo; }
	
	public VerifyWebhookSignature authAlgo(String authAlgo) {
	    this.authAlgo = authAlgo;
	    return this;
	}

	/**
	* REQUIRED
	* The X.509 public key certificate. Download the certificate from this URL and use it to verify the signature. Extract this value from the `PAYPAL-CERT-URL` response header, which is received with the webhook notification.
	*/
	@SerializedName("cert_url")
	private String certUrl;

	public String certUrl() { return certUrl; }
	
	public VerifyWebhookSignature certUrl(String certUrl) {
	    this.certUrl = certUrl;
	    return this;
	}

	/**
	* REQUIRED
	* The ID of the HTTP transmission. Contained in the `PAYPAL-TRANSMISSION-ID` header of the notification message.
	*/
	@SerializedName("transmission_id")
	private String transmissionId;

	public String transmissionId() { return transmissionId; }
	
	public VerifyWebhookSignature transmissionId(String transmissionId) {
	    this.transmissionId = transmissionId;
	    return this;
	}

	/**
	* REQUIRED
	* The PayPal-generated asymmetric signature. Contained in the `PAYPAL-TRANSMISSION-SIG` header of the notification message.
	*/
	@SerializedName("transmission_sig")
	private String transmissionSig;

	public String transmissionSig() { return transmissionSig; }
	
	public VerifyWebhookSignature transmissionSig(String transmissionSig) {
	    this.transmissionSig = transmissionSig;
	    return this;
	}

	/**
	* REQUIRED
	* The date and time of the HTTP transmission. Contained in the `PAYPAL-TRANSMISSION-TIME` header of the notification message.
	*/
	@SerializedName("transmission_time")
	private String transmissionTime;

	public String transmissionTime() { return transmissionTime; }
	
	public VerifyWebhookSignature transmissionTime(String transmissionTime) {
	    this.transmissionTime = transmissionTime;
	    return this;
	}

	/**
	* REQUIRED
	* A webhook event notification.
	*/
	@SerializedName("webhook_event")
	private Event webhookEvent;

	public Event webhookEvent() { return webhookEvent; }
	
	public VerifyWebhookSignature webhookEvent(Event webhookEvent) {
	    this.webhookEvent = webhookEvent;
	    return this;
	}

	/**
	* REQUIRED
	* The ID of the webhook as configured in your Developer Portal account.
	*/
	@SerializedName("webhook_id")
	private String webhookId;

	public String webhookId() { return webhookId; }
	
	public VerifyWebhookSignature webhookId(String webhookId) {
	    this.webhookId = webhookId;
	    return this;
	}
}
