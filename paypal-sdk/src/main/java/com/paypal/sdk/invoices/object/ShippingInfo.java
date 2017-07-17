// This class was generated on Mon, 17 Jul 2017 10:41:00 PDT by version 0.01 of Braintree SDK Generator
// ShippingInfo.java
// DO NOT EDIT
// @type object
// @json {"Type":"Shipping Info","VariableName":"","Description":"The shipping information for the invoice recipient.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":[{"Type":"Address","VariableName":"address","Description":"Base Address object used as billing address in a payment or extended for Shipping Address.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"business_name","Description":"The invoice recipient company business name.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"first_name","Description":"The invoice recipient first name.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"last_name","Description":"The invoice recipient last name.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.invoices.object;

import java.util.Map;
import java.util.List;
import com.google.gson.annotations.SerializedName;
/**
 * The shipping information for the invoice recipient.
 */
public class ShippingInfo {

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
