// This class was generated on Mon, 29 Jan 2018 12:12:01 PST by version 0.1.0-dev+ecea6f of Braintree SDK Generator
// NameAndValuePair.java
// @version 0.1.0-dev+ecea6f
// @type object
// @data H4sIAAAAAAAC/6yQwUoDMRCG7z7FMOe0eM5N8CZokVIQ8TA2Uw1mkziZCEH67pJdrdQVRfCYP5P83zevuG6Z0eIlDQwUHWwoVIYVeUGDGxJP94H7LVpEgxfcPg/nXLbis/oU0eL6kSHSwAuKbvEyfpPJCzhW8qEs0eCZCLWp8dTgNZO7iqGh3VEo3IPn6oXdIVhJyizquaC9PbAWFR8f5ni9/AjxPZhjPnGDXRLQ75GXcJMqDLUobJMIB1IeZ6eRvqb+CrRl/puXSv2iFWsIe/Or29h8JPeRzO0myp/8/gH5bn/yBgAA//8=
// DO NOT EDIT
package com.paypal.sdk.v1.orders;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The name-and-value pair details.
 */
@Model
public class NameAndValuePair {

    // Required default constructor
    public NameAndValuePair() {}

	/**
	* REQUIRED
	* The key for the name-and-value pair. You must correlate the value and name types.
	*/
	@SerializedName("name")
	private String name;

	public String name() { return name; }
	
	public NameAndValuePair name(String name) {
	    this.name = name;
	    return this;
	}

	/**
	* REQUIRED
	* The value for the name-and-value pair.
	*/
	@SerializedName("value")
	private String value;

	public String value() { return value; }
	
	public NameAndValuePair value(String value) {
	    this.value = value;
	    return this;
	}
}
