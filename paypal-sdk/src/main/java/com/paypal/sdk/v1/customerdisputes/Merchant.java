// This class was generated on Mon, 09 Apr 2018 16:10:52 UTC by version 0.1.0-dev+291f3f of Braintree SDK Generator
// Merchant.java
// @version 0.1.0-dev+291f3f
// @type object
// @data H4sIAAAAAAAC/7yT0YvTQBDG3/0rhn0OueO0PvRJ4RBFPIucvqjIdHfSLG52crOTtlHuf5dN2mtjEAXFl5b9TXbmmy9fvpvbviWzNG9IbI1RTWE+oHhcB7rBJldMYV5TfzpcU7LiW/UczdLc1gSOFH1IULGA1gTNoRfsagYhS35LaahUXXQJMDqoulD5EEbM4khKeMECtMemDVScmry6LsByVLQK1KAPgM4JpVQMjRIDx9IU5rkI9uM2l4V5R+jextCbZYUhUQZ3nRdyD2Al3JKop2SWHx98SCo+buYuDJMnVhzJ3A8flSRiJhj8N3JT3eWn7vLysV0Htl/vOlYazuOvTSocNyO5YaXliC/OObxvQRmePgFbo6BVkgQoBBgC78jBmirOx+jgarH41VNYKY0vbJxh2R2kPDsMPRFIfhNLeMk72pIUw60NRRIMoQe0llolBw3ufdM1EChutB4CgXG6PfgEV4tz6SVk01rU7BpsSXzlh7yg5ttdHExyf6oSaO+THl2++Nnmv0xK7EK4L34bl2N6v3g3Cc2Uz6Ozwn6FIRvK3ZD92UdV/p8FYv47V34Ac8m5AFz9e5Gf7x/9AAAA//8=
// DO NOT EDIT
package com.paypal.sdk.v1.customerdisputes;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The details for the merchant who receives the funds and fulfills the order. For example, merchant ID, contact email address, and so on.
 */
@Model
public class Merchant {

    // Required default constructor
    public Merchant() {}

	/**
	* The internationalized email address.<blockquote><strong>Note:</strong> Up to 64 characters are allowed before and 255 characters are allowed after the <code>@</code> sign. However, the generally accepted maximum length for an email address is 254 characters. The pattern verifies that an unquoted <code>@</code> sign exists.</blockquote>
	*/
	@SerializedName("email")
	private String email;

	public String email() { return email; }
	
	public Merchant email(String email) {
	    this.email = email;
	    return this;
	}

	/**
	* The PayPal account ID for the merchant.
	*/
	@SerializedName("merchant_id")
	private String merchantId;

	public String merchantId() { return merchantId; }
	
	public Merchant merchantId(String merchantId) {
	    this.merchantId = merchantId;
	    return this;
	}

	/**
	* The name of the merchant.
	*/
	@SerializedName("name")
	private String name;

	public String name() { return name; }
	
	public Merchant name(String name) {
	    this.name = name;
	    return this;
	}
}
