// This class was generated on Mon, 22 Jan 2018 14:43:26 PST by version 0.1.0-dev+8c35d5 of Braintree SDK Generator
// ShippingInfo.java
// @version 0.1.0-dev+8c35d5
// @type object
// @data H4sIAAAAAAAC/7yVT2/UPBDG7++nGPm9UCnK0uW2t/JPQiBa0cIBVFWzyWQz4NiuPSlEqN8dOZvs1k0RW1jtLXlm7Pye8WT8U110jtRCndfsHJsVvDGVVZn6hJ5xqek9NjGsMvWWuu3LSwqFZydsjVqoi5ogjBuwqaxvMIagsh6kJmBzY7kg8FSwYzKSq0ydeI/d+vNPM/WBsDw1ulOLCnWgKFy37KncCGfeOvLCFNTiywb8pCw9hTBFxk1gS77VUgPPMRAMO4FdfqVCoA1UAgZYstbR17AW2ACCw64hI2A90A8hU1LZm92Ucdhsfz6DeDarqc2CpUs8DkJq8AVLBwYbehSQ+PYej2m1vs3+DGVbI767KmxJKVwaSCHnoEmEPAxZELMOA6zZ0HFCOiop4js2BMdgq76tx455QqscTNssyWcQxBNJBiTF0eHg5xP4+QT+tH9ADTEM8wddhJaFMkAn8H/vIT/61x7e0YWrrUmbZVRSF2dRHaodf8ZX+fH8GaxnzqFQbRDU0+5O9RT7M7u+n/uRcd3yDeo4QDhAG1rUugM/kPWDZP0LMAWQGgVqvKF4WE0Or60HzUHi8d3LKi0YOySvWfpPBnCa4oTzVJEHsVCLuMVsRib/zt/YUcmYW7+axbfZ2dbFgeoZBCWt5Kj8dkCU1Jfp4zn0qSEDNGXfzneKGzOs1HSnnHtxdLmDp2Ub2FAIV3HqJt7uR6Z36eS6hMI2Dk0H49rHz/K/P52KfZCpjUTexUO/4JDgGh/ivqvugh3z90d9efvfLwAAAP//
// DO NOT EDIT
package com.paypal.sdk.invoices;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The shipping information for the invoice recipient.
 */
@Model
public class ShippingInfo {

    // Required default constructor
    public ShippingInfo() {}

	/**
	* Base Address object used as billing address in a payment or extended for Shipping Address.
	*/
	@SerializedName("address")
	private Address address;

	public Address address() { return address; }
	
	public ShippingInfo address(Address address) {
	    this.address = address;
	    return this;
	}

	/**
	* The invoice recipient company business name.
	*/
	@SerializedName("business_name")
	private String businessName;

	public String businessName() { return businessName; }
	
	public ShippingInfo businessName(String businessName) {
	    this.businessName = businessName;
	    return this;
	}

	/**
	* The invoice recipient first name.
	*/
	@SerializedName("first_name")
	private String firstName;

	public String firstName() { return firstName; }
	
	public ShippingInfo firstName(String firstName) {
	    this.firstName = firstName;
	    return this;
	}

	/**
	* The invoice recipient last name.
	*/
	@SerializedName("last_name")
	private String lastName;

	public String lastName() { return lastName; }
	
	public ShippingInfo lastName(String lastName) {
	    this.lastName = lastName;
	    return this;
	}
}
