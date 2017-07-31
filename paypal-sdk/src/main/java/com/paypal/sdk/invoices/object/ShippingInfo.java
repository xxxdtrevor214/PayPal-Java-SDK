// This class was generated on Sun, 30 Jul 2017 11:04:05 PDT by version 0.1 of Braintree SDK Generator
// ShippingInfo.java
// DO NOT EDIT
// @type object
// @json {"Type":"Shipping Info","VariableName":"","Description":"The shipping information for the invoice recipient.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":[{"Type":"Address","VariableName":"address","Description":"Base Address object used as billing address in a payment or extended for Shipping Address.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"business_name","Description":"The invoice recipient company business name.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"first_name","Description":"The invoice recipient first name.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"last_name","Description":"The invoice recipient last name.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.invoices.object;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.serializer.Serializable;
import com.braintreepayments.http.serializer.Deserializable;

/**
 * The shipping information for the invoice recipient.
 */
public class ShippingInfo implements Serializable, Deserializable {

    // Required default constructor
    public ShippingInfo() {}

	/**
	* Base Address object used as billing address in a payment or extended for Shipping Address.
	*/
	private Address address;

	public Address address() { return address; }
	
	public ShippingInfo address(Address address) {
	    this.address = address;
	    return this;
	}

	/**
	* The invoice recipient company business name.
	*/
	private String businessName;

	public String businessName() { return businessName; }
	
	public ShippingInfo businessName(String businessName) {
	    this.businessName = businessName;
	    return this;
	}

	/**
	* The invoice recipient first name.
	*/
	private String firstName;

	public String firstName() { return firstName; }
	
	public ShippingInfo firstName(String firstName) {
	    this.firstName = firstName;
	    return this;
	}

	/**
	* The invoice recipient last name.
	*/
	private String lastName;

	public String lastName() { return lastName; }
	
	public ShippingInfo lastName(String lastName) {
	    this.lastName = lastName;
	    return this;
	}

    @Override
    public void serialize(Map<String, Object> serialized) {
        if (address != null) {
            serialized.put("address", this.address);
        }
        if (businessName != null) {
            serialized.put("business_name", this.businessName);
        }
        if (firstName != null) {
            serialized.put("first_name", this.firstName);
        }
        if (lastName != null) {
            serialized.put("last_name", this.lastName);
        }
    }

    @Override
    public void deserialize(Map<String, Object> values) {
        if (values.containsKey("address")) {
            this.address = new Address();
            this.address.deserialize((Map<String, Object>) values.get("address"));
        }
        if (values.containsKey("business_name")) {
            this.businessName = (String) values.get("business_name");
        }
        if (values.containsKey("first_name")) {
            this.firstName = (String) values.get("first_name");
        }
        if (values.containsKey("last_name")) {
            this.lastName = (String) values.get("last_name");
        }
    }
}

