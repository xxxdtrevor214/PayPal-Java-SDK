// This class was generated on Mon, 29 Jan 2018 12:12:02 PST by version 0.1.0-dev+ecea6f of Braintree SDK Generator
// FmfDetails.java
// @version 0.1.0-dev+ecea6f
// @type object
// @data H4sIAAAAAAAC/7zRwUoDMRAG4LtPscyphdV43ptQAiJV0eKllDJuJutAktZJclik7y6hpW6pRaTiadl/huT7yQfM+jVBA9bbpaGE7CLU8ILC+OroHn0ZQg131H/9TCi2wuvEqwANzN6ommvBbKopBuzIU0iVZpdIqpGe6vFipMyqjap1GCO3ynqrOCTqBMsZl11mQ0pP9XP2HqVX42pnuYIabkSw3zKva3giNA/B9dBYdJFK8J5ZyOyDR1mtSRJThGa+LxiTcOiOu5lBl2HNw/y4sd32G6ydaw3ZuU39I3h78ZLNAXeYnsTeTn5lTJLPIqay9Q1yl59klvn/QEP5DIW74CStzP/knRebi08AAAD//w==
// DO NOT EDIT
package com.paypal.sdk.v1.payments;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The [Fraud Management Filter (FMF)](/docs/classic/fmf/integration-guide/FMFSummary/) details.
 */
@Model
public class FmfDetails {

    // Required default constructor
    public FmfDetails() {}

	/**
	* The filter description.
	*/
	@SerializedName("description")
	private String description;

	public String description() { return description; }
	
	public FmfDetails description(String description) {
	    this.description = description;
	    return this;
	}

	/**
	* REQUIRED
	* The filter ID.
	*/
	@SerializedName("filter_id")
	private String filterId;

	public String filterId() { return filterId; }
	
	public FmfDetails filterId(String filterId) {
	    this.filterId = filterId;
	    return this;
	}

	/**
	* REQUIRED
	* The filter type.
	*/
	@SerializedName("filter_type")
	private String filterType;

	public String filterType() { return filterType; }
	
	public FmfDetails filterType(String filterType) {
	    this.filterType = filterType;
	    return this;
	}

	/**
	* The filter name.
	*/
	@SerializedName("name")
	private String name;

	public String name() { return name; }
	
	public FmfDetails name(String name) {
	    this.name = name;
	    return this;
	}
}
