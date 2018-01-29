// This class was generated on Mon, 29 Jan 2018 12:12:01 PST by version 0.1.0-dev+ecea6f of Braintree SDK Generator
// RedirectUrls.java
// @version 0.1.0-dev+ecea6f
// @type object
// @data H4sIAAAAAAAC/6zQMU/DMBAF4J1fcbo5qpizIbFRQRW1LAihI36tLbm2OTsgC/W/oxAoVBkY6JgX+3zfe+d1TeCWOxin6AttumXmhu9FnTx73Mp+/M0N36D+fFwj9+pScTFwy2sL0t8DFtThZXAKQzH4StuoVCxoJXUlnpLUPUKhPYqNZkHj/TykFLXAUEYpLuwyiY5jy6CBJBjqJfTw03xu+EpV6rT9ZcMdxNwFX7ndis8Yg2mBY7DSmKDFIXP7cHTnoi7s5uDpsadB/Qn9JJ6XsOmW9Gah+NQmqVBy+dgNDMm2QMmColK2+ELl7/NjLf/FhcH7Q/OncGp2JjyJzyGUlDS+4vzEx8PFBwAAAP//
// DO NOT EDIT
package com.paypal.sdk.v1.orders;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The redirect URLs. Required only for the PayPal payment method. The supported settings are return and cancel URLs.
 */
@Model
public class RedirectUrls {

    // Required default constructor
    public RedirectUrls() {}

	/**
	* The URL where the payer is redirected after he or she cancels the payment.
	*/
	@SerializedName("cancel_url")
	private String cancelUrl;

	public String cancelUrl() { return cancelUrl; }
	
	public RedirectUrls cancelUrl(String cancelUrl) {
	    this.cancelUrl = cancelUrl;
	    return this;
	}

	/**
	* The URL where the payer is redirected after he or she approves the payment.
	*/
	@SerializedName("return_url")
	private String returnUrl;

	public String returnUrl() { return returnUrl; }
	
	public RedirectUrls returnUrl(String returnUrl) {
	    this.returnUrl = returnUrl;
	    return this;
	}
}
