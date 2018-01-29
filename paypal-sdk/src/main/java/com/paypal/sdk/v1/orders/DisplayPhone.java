// This class was generated on Mon, 29 Jan 2018 12:12:01 PST by version 0.1.0-dev+ecea6f of Braintree SDK Generator
// DisplayPhone.java
// @version 0.1.0-dev+ecea6f
// @type object
// @data H4sIAAAAAAAC/6yRT2vjMBTE7/sphC67Acuyd5ccfFs2OYRCG9LQSwhFkV9igSypT3KNKPnuRY2bP82hh/boGWY8+r0XuowOaEUnyjstIpk31gDN6INAJTYabkWbbJrRG4injwl4icoFZQ2t6LIB4kQE+OmJSwXEdO0GMKcZ/Yco4uEnRUYXIOo7oyOttkJ7SMJTpxDqozBH6wCDAk+r1XGeD6jM7nqXtJ0JGB+lreFi4wfjeu8q9JbJRqCQAZDM7gv2pxyPWUmGKEnR9a8mBOcrzmt4Bp2m5U5EJ3QubctrKz1XJsAORermtUKQgSP4wIcelno8HxG7JeEM1GB/lZHptN5nn4I6HOQC0VG6hqMMe6dwfs+MKENW07wc/x0UZXbEaWHI1mIrwglX3/e5Cl2uTKIh+ZItpv/ZW5T9LsqiLNls9C1vX+9/vAIAAP//
// DO NOT EDIT
package com.paypal.sdk.v1.orders;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The payee's phone number.
 */
@Model
public class DisplayPhone {

    // Required default constructor
    public DisplayPhone() {}

	/**
	* The [two-character IS0-3166-1 country code](https://developer.paypal.com/docs/integration/direct/rest/country-codes/) of the payee's country.
	*/
	@SerializedName("country_code")
	private String countryCode;

	public String countryCode() { return countryCode; }
	
	public DisplayPhone countryCode(String countryCode) {
	    this.countryCode = countryCode;
	    return this;
	}

	/**
	* The in-country phone number, in [E.164 numbering plan format](https://www.itu.int/rec/T-REC-E.164-201011-I).
	*/
	@SerializedName("number")
	private String number;

	public String number() { return number; }
	
	public DisplayPhone number(String number) {
	    this.number = number;
	    return this;
	}
}
