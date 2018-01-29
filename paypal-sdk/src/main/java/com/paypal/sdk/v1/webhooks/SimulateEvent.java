// This class was generated on Mon, 29 Jan 2018 12:12:04 PST by version 0.1.0-dev+ecea6f of Braintree SDK Generator
// SimulateEvent.java
// @version 0.1.0-dev+ecea6f
// @type object
// @data H4sIAAAAAAAC/6yRQUvDQBCF7/6KYc8heO5NqEJRVNrqRaRsshMzdLOTzu5WgvS/yza1Nuagosd5eZN53743texaVBO1oCZaHRAut+iCytSjFtKFxVvdpO8qU9fYfQ5T9KVQG4jdybYHDQ2Xa3jFomZeA6a/5SpTFyK662+dZ2qO2tw526lJpa3HJGwiCZqjcC/cogRCryZPx5Q+CLmXcbr9mVVIptOcA3mYeFljHw6cbjCHRYslVR2wQ+AKQo3gY5E2CjS90+dwxQKoyxoENxF9yKAV3pJBYGf75d8TB4lfgF20dpd9Sx3FDnD7ecz5ML+BimUPdSzGmZbJhRxmFXBDIaDJBo7ZFMjvQVPMv3b4Q6TD8RWZAdlAHgPOph+dHYxjqvQG/43zvDt7BwAA//8=
// DO NOT EDIT
package com.paypal.sdk.v1.webhooks;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * Simulates a mock webhook event.
 */
@Model
public class SimulateEvent {

    // Required default constructor
    public SimulateEvent() {}

	/**
	* REQUIRED
	* The event name. Specify one of the subscribed events. For each request, provide only one event.
	*/
	@SerializedName("event_type")
	private String eventType;

	public String eventType() { return eventType; }
	
	public SimulateEvent eventType(String eventType) {
	    this.eventType = eventType;
	    return this;
	}

	/**
	* The URL for the webhook endpoint. If omitted, the webhook ID is required.
	*/
	@SerializedName("url")
	private String url;

	public String url() { return url; }
	
	public SimulateEvent url(String url) {
	    this.url = url;
	    return this;
	}

	/**
	* The ID of the webhook. If omitted, the URL is required.
	*/
	@SerializedName("webhook_id")
	private String webhookId;

	public String webhookId() { return webhookId; }
	
	public SimulateEvent webhookId(String webhookId) {
	    this.webhookId = webhookId;
	    return this;
	}
}
