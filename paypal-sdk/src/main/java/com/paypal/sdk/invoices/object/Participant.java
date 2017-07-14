// This class was generated on Thu, 13 Jul 2017 09:07:17 PDT by version 0.01 of Braintree SDK Generator
// Participant.java
// DO NOT EDIT
// @type object
// @json {"Type":"Participant","VariableName":"","Description":"Participant information.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":[{"Type":"string","VariableName":"additional_info","Description":"Additional information, such as business hours.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Address","VariableName":"address","Description":"Base Address object used as billing address in a payment or extended for Shipping Address.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"business_name","Description":"The participant company business name.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"email","Description":"The participant email address.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null},{"Type":"Phone","VariableName":"fax","Description":"The phone number.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"first_name","Description":"The participant first name.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"last_name","Description":"The participant last name.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Phone","VariableName":"phone","Description":"The phone number.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"website","Description":"The participant website.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.invoices.object;

import java.util.Map;
import java.util.List;
import com.google.gson.annotations.SerializedName;
/**
 * Participant information.
 */
public class Participant {

	/**
	* Additional information, such as business hours.
	*/
	@SerializedName("additional_info")
	private String additionalInfo;

	public String additionalInfo() { return additionalInfo; }
	
	public Participant additionalInfo(String additionalInfo) {
	    this.additionalInfo = additionalInfo;
	    return this;
	}

	/**
	* Base Address object used as billing address in a payment or extended for Shipping Address.
	*/
	@SerializedName("address")
	private Address address;

	public Address address() { return address; }
	
	public Participant address(Address address) {
	    this.address = address;
	    return this;
	}

	/**
	* The participant company business name.
	*/
	@SerializedName("business_name")
	private String businessName;

	public String businessName() { return businessName; }
	
	public Participant businessName(String businessName) {
	    this.businessName = businessName;
	    return this;
	}

	/**
	* REQUIRED
	* The participant email address.
	*/
	@SerializedName("email")
	private String email;

	public String email() { return email; }
	
	public Participant email(String email) {
	    this.email = email;
	    return this;
	}

	/**
	* The phone number.
	*/
	@SerializedName("fax")
	private Phone fax;

	public Phone fax() { return fax; }
	
	public Participant fax(Phone fax) {
	    this.fax = fax;
	    return this;
	}

	/**
	* The participant first name.
	*/
	@SerializedName("first_name")
	private String firstName;

	public String firstName() { return firstName; }
	
	public Participant firstName(String firstName) {
	    this.firstName = firstName;
	    return this;
	}

	/**
	* The participant last name.
	*/
	@SerializedName("last_name")
	private String lastName;

	public String lastName() { return lastName; }
	
	public Participant lastName(String lastName) {
	    this.lastName = lastName;
	    return this;
	}

	/**
	* The phone number.
	*/
	@SerializedName("phone")
	private Phone phone;

	public Phone phone() { return phone; }
	
	public Participant phone(Phone phone) {
	    this.phone = phone;
	    return this;
	}

	/**
	* The participant website.
	*/
	@SerializedName("website")
	private String website;

	public String website() { return website; }
	
	public Participant website(String website) {
	    this.website = website;
	    return this;
	}
}
