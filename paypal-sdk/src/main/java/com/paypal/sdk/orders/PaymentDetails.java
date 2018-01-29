// This class was generated on Thu, 25 Jan 2018 12:44:28 CST by version 0.1.0-dev+20fb1e of Braintree SDK Generator
// PaymentDetails.java
// @version 0.1.0-dev+20fb1e
// @type object
// @data H4sIAAAAAAAC/6yRQUszMRCG79+vGOa8fHjem9BLEbRI8SJSps1bdyCbrJNZJEj/u6ytlUXFgx7zJpk8T94XXtcB3PJKao/ktICLxsIN34mpbCOupZ8OcMNXqB+LBcrOdHDNiVted6DhNCIcR9A+G3kHyhZg/7nhSzOpx/cuGr6FhJsUK7d7iQVT8DSqIZyDleUB5orC7f2ZtLhpevwMGLRsRyuYGDZ9DpgRf7U7V1imoDtxFHru4B2MPNP7NepzQiVNxSV5rJSNovjvvdIY46H5Ue70txsNM6tZ/H0jy8XflvEG/XD49woAAP//
// DO NOT EDIT
package com.paypal.sdk.orders;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The payment details for the order.
 */
@Model
public class PaymentDetails {

    // Required default constructor
    public PaymentDetails() {}

	/**
	* Indicates whether to disburse money instantly or later.
	*/
	@SerializedName("disbursement_mode")
	private String disbursementMode;

	public String disbursementMode() { return disbursementMode; }
	
	public PaymentDetails disbursementMode(String disbursementMode) {
	    this.disbursementMode = disbursementMode;
	    return this;
	}

	/**
	* The payment ID for the order.
	*/
	@SerializedName("payment_id")
	private String paymentId;

	public String paymentId() { return paymentId; }
	
	public PaymentDetails paymentId(String paymentId) {
	    this.paymentId = paymentId;
	    return this;
	}
}
