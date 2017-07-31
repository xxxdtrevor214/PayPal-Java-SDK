// This class was generated on Sun, 30 Jul 2017 11:04:05 PDT by version 0.1 of Braintree SDK Generator
// Participant.java
// DO NOT EDIT
// @type object
// @json {"Type":"Participant","VariableName":"","Description":"Participant information.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":[{"Type":"string","VariableName":"additional_info","Description":"Additional information, such as business hours.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Address","VariableName":"address","Description":"Base Address object used as billing address in a payment or extended for Shipping Address.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"business_name","Description":"The participant company business name.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"email","Description":"The participant email address.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null},{"Type":"Phone","VariableName":"fax","Description":"The phone number.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"first_name","Description":"The participant first name.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"last_name","Description":"The participant last name.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Phone","VariableName":"phone","Description":"The phone number.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"website","Description":"The participant website.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.invoices.object;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.serializer.Serializable;
import com.braintreepayments.http.serializer.Deserializable;

/**
 * Participant information.
 */
public class Participant implements Serializable, Deserializable {

    // Required default constructor
    public Participant() {}

	/**
	* Additional information, such as business hours.
	*/
	private String additionalInfo;

	public String additionalInfo() { return additionalInfo; }
	
	public Participant additionalInfo(String additionalInfo) {
	    this.additionalInfo = additionalInfo;
	    return this;
	}

	/**
	* Base Address object used as billing address in a payment or extended for Shipping Address.
	*/
	private Address address;

	public Address address() { return address; }
	
	public Participant address(Address address) {
	    this.address = address;
	    return this;
	}

	/**
	* The participant company business name.
	*/
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
	private String email;

	public String email() { return email; }
	
	public Participant email(String email) {
	    this.email = email;
	    return this;
	}

	/**
	* The phone number.
	*/
	private Phone fax;

	public Phone fax() { return fax; }
	
	public Participant fax(Phone fax) {
	    this.fax = fax;
	    return this;
	}

	/**
	* The participant first name.
	*/
	private String firstName;

	public String firstName() { return firstName; }
	
	public Participant firstName(String firstName) {
	    this.firstName = firstName;
	    return this;
	}

	/**
	* The participant last name.
	*/
	private String lastName;

	public String lastName() { return lastName; }
	
	public Participant lastName(String lastName) {
	    this.lastName = lastName;
	    return this;
	}

	/**
	* The phone number.
	*/
	private Phone phone;

	public Phone phone() { return phone; }
	
	public Participant phone(Phone phone) {
	    this.phone = phone;
	    return this;
	}

	/**
	* The participant website.
	*/
	private String website;

	public String website() { return website; }
	
	public Participant website(String website) {
	    this.website = website;
	    return this;
	}

    @Override
    public void serialize(Map<String, Object> serialized) {
        if (additionalInfo != null) {
            serialized.put("additional_info", this.additionalInfo);
        }
        if (address != null) {
            serialized.put("address", this.address);
        }
        if (businessName != null) {
            serialized.put("business_name", this.businessName);
        }
        if (email != null) {
            serialized.put("email", this.email);
        }
        if (fax != null) {
            serialized.put("fax", this.fax);
        }
        if (firstName != null) {
            serialized.put("first_name", this.firstName);
        }
        if (lastName != null) {
            serialized.put("last_name", this.lastName);
        }
        if (phone != null) {
            serialized.put("phone", this.phone);
        }
        if (website != null) {
            serialized.put("website", this.website);
        }
    }

    @Override
    public void deserialize(Map<String, Object> values) {
        if (values.containsKey("additional_info")) {
            this.additionalInfo = (String) values.get("additional_info");
        }
        if (values.containsKey("address")) {
            this.address = new Address();
            this.address.deserialize((Map<String, Object>) values.get("address"));
        }
        if (values.containsKey("business_name")) {
            this.businessName = (String) values.get("business_name");
        }
        if (values.containsKey("email")) {
            this.email = (String) values.get("email");
        }
        if (values.containsKey("fax")) {
            this.fax = new Phone();
            this.fax.deserialize((Map<String, Object>) values.get("fax"));
        }
        if (values.containsKey("first_name")) {
            this.firstName = (String) values.get("first_name");
        }
        if (values.containsKey("last_name")) {
            this.lastName = (String) values.get("last_name");
        }
        if (values.containsKey("phone")) {
            this.phone = new Phone();
            this.phone.deserialize((Map<String, Object>) values.get("phone"));
        }
        if (values.containsKey("website")) {
            this.website = (String) values.get("website");
        }
    }
}

