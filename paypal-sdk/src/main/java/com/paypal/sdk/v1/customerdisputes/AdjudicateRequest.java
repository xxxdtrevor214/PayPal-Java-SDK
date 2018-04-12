// This class was generated on Mon, 09 Apr 2018 16:10:52 UTC by version 0.1.0-dev+291f3f of Braintree SDK Generator
// AdjudicateRequest.java
// @version 0.1.0-dev+291f3f
// @type object
// @data H4sIAAAAAAAC/6SPwUozQRCE7/9TNH35L4t43lvAm6ASghcR6ezWui2TmU1PjzBI3l02kY1BPHmbqa4q6vvgTZ3ALa/6t9JrJw5aY1+QnRt+FFPZBtzJbvZww7eo588Ncmc6uaY4N5CdguSJ5Fwn1GueioM0EtRHGPkI2pYK+58pGWWEcHwP8p7sihtemUk9TbtueA3p72Oo3A4SMmZhX9TQL8KDpQnmiszt0wKV3TS+/gRZ1mmKL6l4l3a4gPvFcAm8GUFfN0rDkel77q8YsYRweD78+wQAAP//
// DO NOT EDIT
package com.paypal.sdk.v1.customerdisputes;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * A request to adjudicate a dispute in either the buyer's or seller's favor.
 */
@Model
public class AdjudicateRequest {

    // Required default constructor
    public AdjudicateRequest() {}

	/**
	* The outcome of the adjudication.
	*/
	@SerializedName("adjudication_outcome")
	private String adjudicationOutcome;

	public String adjudicationOutcome() { return adjudicationOutcome; }
	
	public AdjudicateRequest adjudicationOutcome(String adjudicationOutcome) {
	    this.adjudicationOutcome = adjudicationOutcome;
	    return this;
	}
}
