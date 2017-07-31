// This class was generated on Sun, 30 Jul 2017 11:04:05 PDT by version 0.1 of Braintree SDK Generator
// Address.java
// DO NOT EDIT
// @type object
// @json {"Type":"Address","VariableName":"","Description":"Base Address object used as billing address in a payment or extended for Shipping Address.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":[{"Type":"string","VariableName":"city","Description":"City name.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null},{"Type":"string","VariableName":"country_code","Description":"2 letter country code.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null},{"Type":"string","VariableName":"line1","Description":"Line 1 of the Address (eg. number, street, etc).","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null},{"Type":"string","VariableName":"line2","Description":"Optional line 2 of the Address (eg. suite, apt #, etc.).","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"phone","Description":"Phone number in E.123 format.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"postal_code","Description":"Zip code or equivalent is usually required for countries that have them. For list of countries that do not have postal codes please refer to http://en.wikipedia.org/wiki/Postal_code.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"state","Description":"2 letter code for US states, and the equivalent for other countries.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.invoices.object;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.serializer.Serializable;
import com.braintreepayments.http.serializer.Deserializable;

/**
 * Base Address object used as billing address in a payment or extended for Shipping Address.
 */
public class Address implements Serializable, Deserializable {

    // Required default constructor
    public Address() {}

	/**
	* REQUIRED
	* City name.
	*/
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
	private String line1;

	public String line1() { return line1; }
	
	public Address line1(String line1) {
	    this.line1 = line1;
	    return this;
	}

	/**
	* Optional line 2 of the Address (eg. suite, apt #, etc.).
	*/
	private String line2;

	public String line2() { return line2; }
	
	public Address line2(String line2) {
	    this.line2 = line2;
	    return this;
	}

	/**
	* Phone number in E.123 format.
	*/
	private String phone;

	public String phone() { return phone; }
	
	public Address phone(String phone) {
	    this.phone = phone;
	    return this;
	}

	/**
	* Zip code or equivalent is usually required for countries that have them. For list of countries that do not have postal codes please refer to http://en.wikipedia.org/wiki/Postal_code.
	*/
	private String postalCode;

	public String postalCode() { return postalCode; }
	
	public Address postalCode(String postalCode) {
	    this.postalCode = postalCode;
	    return this;
	}

	/**
	* 2 letter code for US states, and the equivalent for other countries.
	*/
	private String state;

	public String state() { return state; }
	
	public Address state(String state) {
	    this.state = state;
	    return this;
	}

    @Override
    public void serialize(Map<String, Object> serialized) {
        if (city != null) {
            serialized.put("city", this.city);
        }
        if (countryCode != null) {
            serialized.put("country_code", this.countryCode);
        }
        if (line1 != null) {
            serialized.put("line1", this.line1);
        }
        if (line2 != null) {
            serialized.put("line2", this.line2);
        }
        if (phone != null) {
            serialized.put("phone", this.phone);
        }
        if (postalCode != null) {
            serialized.put("postal_code", this.postalCode);
        }
        if (state != null) {
            serialized.put("state", this.state);
        }
    }

    @Override
    public void deserialize(Map<String, Object> values) {
        if (values.containsKey("city")) {
            this.city = (String) values.get("city");
        }
        if (values.containsKey("country_code")) {
            this.countryCode = (String) values.get("country_code");
        }
        if (values.containsKey("line1")) {
            this.line1 = (String) values.get("line1");
        }
        if (values.containsKey("line2")) {
            this.line2 = (String) values.get("line2");
        }
        if (values.containsKey("phone")) {
            this.phone = (String) values.get("phone");
        }
        if (values.containsKey("postal_code")) {
            this.postalCode = (String) values.get("postal_code");
        }
        if (values.containsKey("state")) {
            this.state = (String) values.get("state");
        }
    }
}

