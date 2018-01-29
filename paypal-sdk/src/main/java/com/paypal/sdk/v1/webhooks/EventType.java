// This class was generated on Mon, 29 Jan 2018 12:12:04 PST by version 0.1.0-dev+ecea6f of Braintree SDK Generator
// EventType.java
// @version 0.1.0-dev+ecea6f
// @type object
// @data H4sIAAAAAAAC/6zQzU7DMAwH8DtPYfkcEOfeJsEJCRCauCAOHvVoROZ0jgOK0N4dZZ1Kyw6Ij1OVf1znZ7/jsvSMDV6+shjsDw7vST2tAl/Tpt6hwysun4cLTk/qe/NRsMGFAO9/ttLzGTpcqFIZ2p47vGNqbyQUbNYUEtdgm71yOwa3GntW85yweRhBydTL8zGmnTw+dc3zL0To8obkVJna2gomxRDXYB0PM/yVLzmEnft2BqmfKf4QzNXLjiGL3+YDDmrVj4Sm+XfAZGQ5zYhjdIwcruoiCd541cX48o/rfNydfAAAAP//
// DO NOT EDIT
package com.paypal.sdk.v1.webhooks;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * An event type.
 */
@Model
public class EventType {

    // Required default constructor
    public EventType() {}

	/**
	* A human-readable description of the event.
	*/
	@SerializedName("description")
	private String description;

	public String description() { return description; }
	
	public EventType description(String description) {
	    this.description = description;
	    return this;
	}

	/**
	* REQUIRED
	* The unique event name.
	*/
	@SerializedName("name")
	private String name;

	public String name() { return name; }
	
	public EventType name(String name) {
	    this.name = name;
	    return this;
	}

	/**
	* The status of a webhook event.
	*/
	@SerializedName("status")
	private String status;

	public String status() { return status; }
	
	public EventType status(String status) {
	    this.status = status;
	    return this;
	}
}
