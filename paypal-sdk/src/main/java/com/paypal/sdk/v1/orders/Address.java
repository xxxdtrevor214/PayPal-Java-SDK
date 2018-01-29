// This class was generated on Mon, 29 Jan 2018 12:12:01 PST by version 0.1.0-dev+ecea6f of Braintree SDK Generator
// Address.java
// @version 0.1.0-dev+ecea6f
// @type object
// @data H4sIAAAAAAAC/7xWTXPbRgy991dg2Es8Q5Gy0+agm+MmqZtJ7LHl9qBmbIgLi2iWu8wuGJnp5L93dqkvlu40cju6aEQAD8R7iwX4ZzJta0omyalSjrxP0uRXdIxzTe+xCo4kTd5Su334iXzhuBa2Jpkk05JgzlqzWQB2KYANINTYVmQkgzM0MCegByGjSMG9deBLrusdSJakyalz2HbFjNPkilBdGN0mk3vUnoLhU8OO1MZw6WxNTph8MpltaHhxbBZDFgVL22OyMgzZBAcYrOi/FmUarb+m/16ZbYy49rawivoV9h39Sk9hJks7Kkp0WAg5OL++gOfHL16MjiEAPjzLlS18zkZo4TCgcsWOCskdeclXyUch1udHICUKsCIjfM/kQYISXQxYB44WbE32ezMePy/m2hYfPzVWKD53v4UXZ82is7y3QpPOnO/aYbqTNrw6dsMbRyjw0rEgG2APHTL4O9ibl6tcWxOgUWCsDGJv3j4S66HxpEJjBl5i65Gmz6RB2Sq8Mpy2j6VEGVYFZnDjKQLuzk7uhmWflWwQltZpteSVrbBVjS6cLjSmsEac1ZoU1I4LgmdnN5dHUJGUVqUwR/MRCnQqjWQKZ70fza1T5EAcGo9FODa/Uj3/u+z7tKe45mndqdnQca8t15bhzbln5wWCH+x9FG59veG1dUAPWNWaUjBNNSeXghdHJB17b8Ga7GCUTgaUTgaULuIf1FnsWk+FNeob2PmGhVLAGp2ECbih+zSaTx8sxroKNX+Jl//WC0rje7T/IWB4sOvB3gNAB8jgiqRxhhRYo9t4C2psyXm4d7aClw6/sD4Q5bq0pj9E15YhqejZHA4bmL3Kjk+eBwIVyodnpUjtJ3m+XC4zliZjE0ZnkU9HV6/ORjF2dDIeH49PRuc5maMM3uEDV00FmsxCyjDIfhzDZkL7Q2lgvaAerpO+/RE9oj+OtxSWJReRQejzL1x3Uy+0+aeGP6OOm33a1lyg1i24Vd2rGRgGZVgiS5YyfApsM4cUaHpZrolgdrkN2SpPJlvyR65JMWbWLfLwlF9ueRwdSNLQ6X0x15ahjLNv2b4Rvtm9QTSEm+t4o6JEQfWtRjHASkk72oZrt6P57r4A7o2ncIpswG7mlqdtmgnMTt0ibH2D+xT9Pa5RRynMuju+F34eIQF8hgbVfi8vIiSAz43i/bAcEBEqqNv9oAERoL9gjWYv6B8BEaDv6IELuxe2ipAAnpbIGo3aCy4r0FEaOmt2Y1hIwXUI8Xslajw+OuR+GINns9A0mrdChx94j2y2b9hlq+11mBIluHcLXBmG5QVHuKePf1vc/Xzx7tXtxdXtbxdXb+9SuHtz/np6939/Wnz4+t1fAAAA//8=
// DO NOT EDIT
package com.paypal.sdk.v1.orders;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The billing address in a payment. Can be extended for shipping address.
 */
@Model
public class Address {

    // Required default constructor
    public Address() {}

	/**
	* The city name.
	*/
	@SerializedName("city")
	private String city;

	public String city() { return city; }
	
	public Address city(String city) {
	    this.city = city;
	    return this;
	}

	/**
	* REQUIRED
	* A [two-character ISO 3166-1 code](/docs/integration/direct/rest/country-codes/) that identifies the country or region.<blockquote><strong>Note:</strong> The country code for Great Britain is <code>GB</code> and not <code>UK</code> as used in the top-level domain names for that country. Use the `C2` country code for China worldwide for comparable uncontrolled price (CUP) method, bank card, and cross-border transactions.</blockquote>
	*/
	@SerializedName("country_code")
	private String countryCode;

	public String countryCode() { return countryCode; }
	
	public Address countryCode(String countryCode) {
	    this.countryCode = countryCode;
	    return this;
	}

	/**
	* REQUIRED
	* The first line of the address. For example, number, street, and so on.
	*/
	@SerializedName("line1")
	private String line1;

	public String line1() { return line1; }
	
	public Address line1(String line1) {
	    this.line1 = line1;
	    return this;
	}

	/**
	* Optional. The second line of the address. For example, suite, apartment number, and so on.
	*/
	@SerializedName("line2")
	private String line2;

	public String line2() { return line2; }
	
	public Address line2(String line2) {
	    this.line2 = line2;
	    return this;
	}

	/**
	* The address normalization status. Returned only for payers from Brazil.
	*/
	@SerializedName("normalization_status")
	private String normalizationStatus;

	public String normalizationStatus() { return normalizationStatus; }
	
	public Address normalizationStatus(String normalizationStatus) {
	    this.normalizationStatus = normalizationStatus;
	    return this;
	}

	/**
	* The phone number, in [E.123 format](https://www.itu.int/rec/T-REC-E.123-200102-I/en). Maximum length is 50 characters.
	*/
	@SerializedName("phone")
	private String phone;

	public String phone() { return phone; }
	
	public Address phone(String phone) {
	    this.phone = phone;
	    return this;
	}

	/**
	* The postal code, which is the zip code or equivalent. Typically required for countries with a postal code or an equivalent. See [Postal code](https://en.wikipedia.org/wiki/Postal_code).
	*/
	@SerializedName("postal_code")
	private String postalCode;

	public String postalCode() { return postalCode; }
	
	public Address postalCode(String postalCode) {
	    this.postalCode = postalCode;
	    return this;
	}

	/**
	* The [code](/docs/integration/direct/rest/state-codes/) for a US state or the equivalent for other countries. Required for transactions if the address is in one of these countries: [Argentina](/docs/integration/direct/rest/state-codes/#argentina), [Brazil](/docs/integration/direct/rest/state-codes/#brazil), [Canada](/docs/integration/direct/rest/state-codes/#canada), [India](/docs/integration/direct/rest/state-codes/#india), [Italy](/docs/integration/direct/rest/state-codes/#italy), [Japan](/docs/integration/direct/rest/state-codes/#japan), [Mexico](/docs/integration/direct/rest/state-codes/#mexico), [Thailand](/docs/integration/direct/rest/state-codes/#thailand), or [United States](/docs/integration/direct/rest/state-codes/#usa). Maximum length is 40 single-byte characters.
	*/
	@SerializedName("state")
	private String state;

	public String state() { return state; }
	
	public Address state(String state) {
	    this.state = state;
	    return this;
	}

	/**
	* The address status.
	*/
	@SerializedName("status")
	private String status;

	public String status() { return status; }
	
	public Address status(String status) {
	    this.status = status;
	    return this;
	}

	/**
	* The type of address. For example, `HOME_OR_WORK`, `GIFT`, and so on.
	*/
	@SerializedName("type")
	private String type;

	public String type() { return type; }
	
	public Address type(String type) {
	    this.type = type;
	    return this;
	}
}
