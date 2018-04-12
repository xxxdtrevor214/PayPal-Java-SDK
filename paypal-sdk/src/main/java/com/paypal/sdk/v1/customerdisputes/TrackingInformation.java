// This class was generated on Mon, 09 Apr 2018 16:10:52 UTC by version 0.1.0-dev+291f3f of Braintree SDK Generator
// TrackingInformation.java
// @version 0.1.0-dev+291f3f
// @type object
// @data H4sIAAAAAAAC/8yRMUv8QBDF+/+nGKYOf6zTCTaiqBynjcgxl0xuBze7cXaCBLnvLklM7jSihRaW897b2ffbfcF11zDmuFYqHiXs4DxUUWsyiQEzvCMV2nq+orpPYYYX3B2GM06FSjOEc1w7Bpv2yGHPf8zwVJW68a6TDFdM5XXwHeYV+cS98NSKcjkLNxobVhNOmN/PLZOphN2yV0GqwroJ/Xjc8YOx7NsbECswx/AWhirqMCcnTc3BJt+UQqKiPw3myEASUEqxEDIu4VnMgTlJUEpqWuOfcofW+332Lfz05JvQ1lvWd/xL74svGzNL/Ek45v9L3K36z6FHY0l8u7oEiyP4QCbG9cz7K/Uf9v9eAQAA//8=
// DO NOT EDIT
package com.paypal.sdk.v1.customerdisputes;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The tracking information.
 */
@Model
public class TrackingInformation {

    // Required default constructor
    public TrackingInformation() {}

	/**
	* The name of the carrier for the shipment of the transaction that is associated with this dispute.
	*/
	@SerializedName("carrier_name")
	private String carrierName;

	public String carrierName() { return carrierName; }
	
	public TrackingInformation carrierName(String carrierName) {
	    this.carrierName = carrierName;
	    return this;
	}

	/**
	* The tracking number for the shipment for the transaction associated with this dispute.
	*/
	@SerializedName("tracking_number")
	private String trackingNumber;

	public String trackingNumber() { return trackingNumber; }
	
	public TrackingInformation trackingNumber(String trackingNumber) {
	    this.trackingNumber = trackingNumber;
	    return this;
	}

	/**
	* The URL to track the item shipment.
	*/
	@SerializedName("tracking_url")
	private String trackingUrl;

	public String trackingUrl() { return trackingUrl; }
	
	public TrackingInformation trackingUrl(String trackingUrl) {
	    this.trackingUrl = trackingUrl;
	    return this;
	}
}
