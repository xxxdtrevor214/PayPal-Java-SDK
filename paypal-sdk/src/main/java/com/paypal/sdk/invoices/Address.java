// This class was generated on Mon, 22 Jan 2018 14:43:26 PST by version 0.1.0-dev+8c35d5 of Braintree SDK Generator
// Address.java
// @version 0.1.0-dev+8c35d5
// @type object
// @data H4sIAAAAAAAC/7yUT28TMRDF73yKkblQabWh4ZZb+XcB0YgCBxBCk/UkO+C13fFsYYX63ZE3m6ZuQIBAucVvXpLfG4/nu3kzRDILc2atUEqmMu9QGFeOXmGXC6YyL2jYH55SaoSjcvBmYR5jIpi+C2H1mRqFPpEFTLBi59hvAKcye0CIOHTkFYIAfVPyliysg8BFyzFm9/RjtanMmQgOW76HlXlNaM+9G8xijS5RFi57FrI3wlJCJFGmZBYfbpIlFfabw2AN61CEm4Qy4BPWATx29FdAKv0dHt87d139Hir0XmX41ARLJVxZKCHn4EiVBCYXZNdxgB17Oi1Id0qJ+JI9wSmENWi7n5gHtKnB992KpIKkQqQVkDYnx4OfH8DPD+DPxw/oIJdh/tMUqWelCjAq3B8z1Cf/OsN/mCK2wZfDslPKFMusTt3Oj/FZfTp/lB9fh3os1JAU3eF0l3qJ/Z7jOM/jyrjs+QpdXiCcoE89OjeATGTjItk+AaYE2qJCi1eUL6ur4XkQcJw0X98dlw3gw2Tesox/mSA6yhtOaE0CGqBVjYvZjHz9lb9wJMtYB9nM8mm23Kc4Uj+Topad3Cm/XBCWxja9vYDRmipAb8dxvtXc7Aja0q12/pdEH6/v/QAAAP//
// DO NOT EDIT
package com.paypal.sdk.invoices;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * Base Address object used as billing address in a payment or extended for Shipping Address.
 */
@Model
public class Address {

    // Required default constructor
    public Address() {}

	/**
	* REQUIRED
	* City name.
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
	* 2 letter country code.
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
	* Line 1 of the Address (eg. number, street, etc).
	*/
	@SerializedName("line1")
	private String line1;

	public String line1() { return line1; }
	
	public Address line1(String line1) {
	    this.line1 = line1;
	    return this;
	}

	/**
	* Optional line 2 of the Address (eg. suite, apt #, etc.).
	*/
	@SerializedName("line2")
	private String line2;

	public String line2() { return line2; }
	
	public Address line2(String line2) {
	    this.line2 = line2;
	    return this;
	}

	/**
	* Phone number in E.123 format.
	*/
	@SerializedName("phone")
	private String phone;

	public String phone() { return phone; }
	
	public Address phone(String phone) {
	    this.phone = phone;
	    return this;
	}

	/**
	* Zip code or equivalent is usually required for countries that have them. For list of countries that do not have postal codes please refer to http://en.wikipedia.org/wiki/Postal_code.
	*/
	@SerializedName("postal_code")
	private String postalCode;

	public String postalCode() { return postalCode; }
	
	public Address postalCode(String postalCode) {
	    this.postalCode = postalCode;
	    return this;
	}

	/**
	* 2 letter code for US states, and the equivalent for other countries.
	*/
	@SerializedName("state")
	private String state;

	public String state() { return state; }
	
	public Address state(String state) {
	    this.state = state;
	    return this;
	}
}
