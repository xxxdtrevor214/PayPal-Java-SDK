// This class was generated on Fri, 26 May 2017 11:06:13 PDT by version 0.01 of Braintree SDK Generator
// .java
// DO NOT EDIT
// @type object
// @json {"Type":"Event Transmission","VariableName":"","Description":"A list of event transmissions. Displayed for internal API calls through the Developer portal only.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":[{"Type":"integer","VariableName":"http_status","Description":"The HTTP status code.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"reason_phrase","Description":"The reason for the HTTP status, if available.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null},{"Type":"object","VariableName":"response_headers","Description":"A set of HTTP headers, as a set of key-and-value pairs.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"status","Description":"The transmission status.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"timestamp","Description":"The date and time when the status occurred, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6).","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"transmission_id","Description":"The transmission ID.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"webhook_url","Description":"The webhook endpoint URL for which the transmission was sent.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.object;

import java.util.Map;
import java.util.List;
import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;


/**
 * A list of event transmissions. Displayed for internal API calls through the Developer portal only.
 */
@Data
@Accessors(chain = true)
public class EventTransmission {
	/**
	* The HTTP status code.
	*/
	@SerializedName("http_status")
	private int httpStatus;
	/**
	* The reason for the HTTP status, if available.
	*/
	@SerializedName("reason_phrase")
	private String reasonPhrase;
	/**
	* A set of HTTP headers, as a set of key-and-value pairs.
	*/
	@SerializedName("response_headers")
	private Map<String,Object> responseHeaders;
	/**
	* The transmission status.
	*/
	@SerializedName("status")
	private String status;
	/**
	* The date and time when the status occurred, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6).
	*/
	@SerializedName("timestamp")
	private String timestamp;
	/**
	* The transmission ID.
	*/
	@SerializedName("transmission_id")
	private String transmissionId;
	/**
	* The webhook endpoint URL for which the transmission was sent.
	*/
	@SerializedName("webhook_url")
	private String webhookUrl;
}
