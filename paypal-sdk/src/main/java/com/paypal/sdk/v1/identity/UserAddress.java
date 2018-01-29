// This class was generated on Mon, 29 Jan 2018 12:11:59 PST by version 0.1.0-dev+ecea6f of Braintree SDK Generator
// UserAddress.java
// @version 0.1.0-dev+ecea6f
// @type object
// @data H4sIAAAAAAAC/7zTQUsrMRAH8Pv7FMNc3mV5vPPeRG+CihQvIiVN/tsG0iROEmGVfndJt912WcGD0tvmP5PsL4T54EUfwS2XBFkqYwQpccNPSqxaOdypba1yw7foT4sbJC02Zhs8t7zYgOAN1TP+JoqCDiIwdDjvHzd8JaL64V//G36EMvfe9dx2yiXU4LVYgRmDBwkRki0St8+jMmWxfj336VB8ln7CPGVz7aH2U5gvzu2ab3UuaOVsnvLOwi98NvcUhI5NF4LGkLJySx0MJtZpPue+20i1WMlD7355IbVgXSnn4DGaW1NWGQ1FCW/W6/0XOuhcBE31D1svRE9ZgHw2d6crzErzq3TFORr6xlGja+XJeu2KAeUNaBNKAvmyXUFIeXPc4NX2dx7oZffnEwAA//8=
// DO NOT EDIT
package com.paypal.sdk.v1.identity;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The end user's preferred address.
 */
@Model
public class UserAddress {

    // Required default constructor
    public UserAddress() {}

	/**
	* The country.
	*/
	@SerializedName("country")
	private String country;

	public String country() { return country; }
	
	public UserAddress country(String country) {
	    this.country = country;
	    return this;
	}

	/**
	* The city or locality.
	*/
	@SerializedName("locality")
	private String locality;

	public String locality() { return locality; }
	
	public UserAddress locality(String locality) {
	    this.locality = locality;
	    return this;
	}

	/**
	* The zip code or postal code.
	*/
	@SerializedName("postal_code")
	private String postalCode;

	public String postalCode() { return postalCode; }
	
	public UserAddress postalCode(String postalCode) {
	    this.postalCode = postalCode;
	    return this;
	}

	/**
	* The state, province, prefecture, or region.
	*/
	@SerializedName("region")
	private String region;

	public String region() { return region; }
	
	public UserAddress region(String region) {
	    this.region = region;
	    return this;
	}

	/**
	* The full street address. Can include the house number and street name.
	*/
	@SerializedName("street_address")
	private String streetAddress;

	public String streetAddress() { return streetAddress; }
	
	public UserAddress streetAddress(String streetAddress) {
	    this.streetAddress = streetAddress;
	    return this;
	}
}
