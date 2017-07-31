// This class was generated on Mon, 31 Jul 2017 18:27:14 UTC by version 0.1 of Braintree SDK Generator
// RedirectUrls.java
// DO NOT EDIT
// @type object
// @json {"Type":"Redirect Urls","VariableName":"","Description":"A set of redirect URLs that you provide for PayPal-based payments.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":[{"Type":"string","VariableName":"cancel_url","Description":"The URL where the payer is redirected after he or she cancels the payment. **Required for PayPal account payments**.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"return_url","Description":"The URL where the payer is redirected after he or she approves the payment. **Required for PayPal account payments**.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.payments.object;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.serializer.Serializable;
import com.braintreepayments.http.serializer.Deserializable;

/**
 * A set of redirect URLs that you provide for PayPal-based payments.
 */
public class RedirectUrls implements Serializable, Deserializable {

    // Required default constructor
    public RedirectUrls() {}

	/**
	* The URL where the payer is redirected after he or she cancels the payment. **Required for PayPal account payments**.
	*/
	private String cancelUrl;

	public String cancelUrl() { return cancelUrl; }
	
	public RedirectUrls cancelUrl(String cancelUrl) {
	    this.cancelUrl = cancelUrl;
	    return this;
	}

	/**
	* The URL where the payer is redirected after he or she approves the payment. **Required for PayPal account payments**.
	*/
	private String returnUrl;

	public String returnUrl() { return returnUrl; }
	
	public RedirectUrls returnUrl(String returnUrl) {
	    this.returnUrl = returnUrl;
	    return this;
	}

    @Override
    public void serialize(Map<String, Object> serialized) {
        if (cancelUrl != null) {
            serialized.put("cancel_url", this.cancelUrl);
        }
        if (returnUrl != null) {
            serialized.put("return_url", this.returnUrl);
        }
    }

    @Override
    public void deserialize(Map<String, Object> values) {
        if (values.containsKey("cancel_url")) {
            this.cancelUrl = (String) values.get("cancel_url");
        }
        if (values.containsKey("return_url")) {
            this.returnUrl = (String) values.get("return_url");
        }
    }
}

