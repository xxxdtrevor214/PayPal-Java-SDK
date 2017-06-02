// This class was generated on Fri, 02 Jun 2017 16:03:13 PDT by version 0.01 of Braintree SDK Generator
// EventTransmission.java
// DO NOT EDIT
// @type object
// @json {"Type":"Event Transmission","VariableName":"","Description":"A list of event transmissions. Displayed for internal API calls through the Developer portal only.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":[{"Type":"integer","VariableName":"http_status","Description":"The HTTP status code.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"reason_phrase","Description":"The reason for the HTTP status, if available.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"status","Description":"The transmission status.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"timestamp","Description":"The date and time when the status occurred, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6).","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"transmission_id","Description":"The transmission ID.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"webhook_url","Description":"The webhook endpoint URL for which the transmission was sent.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.object;

import java.util.Map;
import java.util.List;
import com.google.gson.annotations.SerializedName;
/**
 * A list of event transmissions. Displayed for internal API calls through the Developer portal only.
 */
public class EventTransmission {

	/**
	* The HTTP status code.
	*/
	@SerializedName("http_status")
	private int httpStatus;

	public int httpStatus() { return httpStatus; }
	
	public EventTransmission httpStatus(int httpStatus) {
	    this.httpStatus = httpStatus;
	    return this;
	}

	/**
	* The reason for the HTTP status, if available.
	*/
	@SerializedName("reason_phrase")
	private String reasonPhrase;

	public String reasonPhrase() { return reasonPhrase; }
	
	public EventTransmission reasonPhrase(String reasonPhrase) {
	    this.reasonPhrase = reasonPhrase;
	    return this;
	}

	/**
	* The transmission status.
	*/
	@SerializedName("status")
	private String status;

	public String status() { return status; }
	
	public EventTransmission status(String status) {
	    this.status = status;
	    return this;
	}

	/**
	* The date and time when the status occurred, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6).
	*/
	@SerializedName("timestamp")
	private String timestamp;

	public String timestamp() { return timestamp; }
	
	public EventTransmission timestamp(String timestamp) {
	    this.timestamp = timestamp;
	    return this;
	}

	/**
	* The transmission ID.
	*/
	@SerializedName("transmission_id")
	private String transmissionId;

	public String transmissionId() { return transmissionId; }
	
	public EventTransmission transmissionId(String transmissionId) {
	    this.transmissionId = transmissionId;
	    return this;
	}

	/**
	* The webhook endpoint URL for which the transmission was sent.
	*/
	@SerializedName("webhook_url")
	private String webhookUrl;

	public String webhookUrl() { return webhookUrl; }
	
	public EventTransmission webhookUrl(String webhookUrl) {
	    this.webhookUrl = webhookUrl;
	    return this;
	}
}
