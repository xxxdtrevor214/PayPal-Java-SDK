// This class was generated on Mon, 17 Jul 2017 10:51:10 PDT by version 0.01 of Braintree SDK Generator
// RedirectUrls.java
// DO NOT EDIT
// @type object
// @json {"Type":"redirect urls","VariableName":"","Description":"A set of redirect URLs that you provide for PayPal-based payments.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":[{"Type":"string","VariableName":"cancel_url","Description":"The URL where the payer is redirected after he or she cancels the payment. **Required for PayPal account payments**.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"return_url","Description":"The URL where the payer is redirected after he or she approves the payment. **Required for PayPal account payments**.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.payments.object;

import java.util.Map;
import java.util.List;
import com.google.gson.annotations.SerializedName;
/**
 * A set of redirect URLs that you provide for PayPal-based payments.
 */
public class RedirectUrls {

	/**
	* The URL where the payer is redirected after he or she cancels the payment. **Required for PayPal account payments**.
	*/
	@SerializedName("cancel_url")
	private String cancelUrl;

	public String cancelUrl() { return cancelUrl; }
	
	public RedirectUrls cancelUrl(String cancelUrl) {
	    this.cancelUrl = cancelUrl;
	    return this;
	}

	/**
	* The URL where the payer is redirected after he or she approves the payment. **Required for PayPal account payments**.
	*/
	@SerializedName("return_url")
	private String returnUrl;

	public String returnUrl() { return returnUrl; }
	
	public RedirectUrls returnUrl(String returnUrl) {
	    this.returnUrl = returnUrl;
	    return this;
	}
}
