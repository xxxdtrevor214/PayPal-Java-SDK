// This class was generated on Mon, 09 Apr 2018 16:10:52 UTC by version 0.1.0-dev+291f3f of Braintree SDK Generator
// EvidenceInformation.java
// @version 0.1.0-dev+291f3f
// @type object
// @data H4sIAAAAAAAC/8ySQY/TMBCF7/yKkc8B7YlDbisthxUI0KpwQVU1TSbNCMcO40lQhPrfkZPWbZpShEBoj5734rxvnn+Y1dCSyc2bnktyBcGjq7w0qOydycxnFMatpffYRJfJzFsaTocHCoVwO5pzs6oJ6HDPSyGLSiXw6b5XJjP3IjhM/7zLzBNh+cHZweQV2kBx8K1joTINPopvSZQpmPxLShtU2O2W+YSqzpUbLsMs6Ww8z3zvAGMk8BVMNnh8CFB5Aa0JVNAFLKIZ2PXe9iMSaM0BSg5tp3SB9fpPsVxn7T5LbCvB4iu73e0m9ODaxP3OYC+VW7yWenQKx0/Oy/qvK/h9swWKMMnGxeM57oWwfJFRiLSR5WBObKHmtiGnR/2cVWtU4AAYgi94fMvfWetb3Hd/Wf2v4FOlrmu2JNfrTtpyBanfybPEv9b1c+LuxF6HnoQl8aend6B+Ah/JWKlJvP8k/nq/3r/4CQAA//8=
// DO NOT EDIT
package com.paypal.sdk.v1.customerdisputes;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The evidence-related information.
 */
@Model
public class EvidenceInformation {

    // Required default constructor
    public EvidenceInformation() {}

	/**
	* An array of refund IDs for the transaction involved in this dispute.
	*/
	@SerializedName(value = "refund_ids", listClass = String.class)
	private List<String> refundIds;

	public List<String> refundIds() { return refundIds; }
	
	public EvidenceInformation refundIds(List<String> refundIds) {
	    this.refundIds = refundIds;
	    return this;
	}

	/**
	* An array of relevant tracking information for the transaction involved in this dispute.
	*/
	@SerializedName(value = "tracking_info", listClass = TrackingInformation.class)
	private List<TrackingInformation> trackingInfo;

	public List<TrackingInformation> trackingInfo() { return trackingInfo; }
	
	public EvidenceInformation trackingInfo(List<TrackingInformation> trackingInfo) {
	    this.trackingInfo = trackingInfo;
	    return this;
	}
}
