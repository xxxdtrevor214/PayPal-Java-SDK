// This class was generated on Mon, 22 Jan 2018 14:43:26 PST by version 0.1.0-dev+8c35d5 of Braintree SDK Generator
// Phone.java
// @version 0.1.0-dev+8c35d5
// @type object
// @data H4sIAAAAAAAC/8SQQUv7QBDF7/9PMcyp5R+KBfWQW0k9CbVo8SJSNtlpOrCZjbsbcJF+d1lTI20QDx48zrw3bx6/N9zEljDH9d4KYYaPyrEqDa1Uk9aY4S3Fr2FJvnLcBraCOW72BG06BOmaktwMM1w4p2IfepHhPSl9JyZivlPGU1q8dOxID4u1sy25wOQxfxrq+OBY6nGfynYSXNxWVtNJtzNh3PNogEoZw1JDMsKkKKYZKA+adiykoYxwM5tfX84g3TTqlZuugco25YdsSOqwB7uDovgvKsUrA+xhfgWaaw7+twikM+aQ/cjh8/e2B3+CYqyNaQzde883DBbnPqisePbBJwSDpskH7qcj1tWymIISDb4r0+t0ekyYPKymf0v3+fDvHQAA//8=
// DO NOT EDIT
package com.paypal.sdk.invoices;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The phone number.
 */
@Model
public class Phone {

    // Required default constructor
    public Phone() {}

	/**
	* The country calling code (CC), as defined by E.164. The maximum combined length of CC+national is 15 digits.
	*/
	@SerializedName("country_code")
	private String countryCode;

	public String countryCode() { return countryCode; }
	
	public Phone countryCode(String countryCode) {
	    this.countryCode = countryCode;
	    return this;
	}

	/**
	* The national number, as defined by E.164. A national number consists of national destination code (NDC) and subscriber number (SN). The maximum combined length of CC+national is 15 digits.
	*/
	@SerializedName("national_number")
	private String nationalNumber;

	public String nationalNumber() { return nationalNumber; }
	
	public Phone nationalNumber(String nationalNumber) {
	    this.nationalNumber = nationalNumber;
	    return this;
	}
}
