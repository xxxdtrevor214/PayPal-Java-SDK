// This class was generated on Mon, 31 Jul 2017 18:27:14 UTC by version 0.1 of Braintree SDK Generator
// ShippingAddress.java
// DO NOT EDIT
// @type object
// @json {"Type":"Shipping Address","VariableName":"","Description":"The extended address, which is used as the shipping address in a payment.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":[{"Type":"string","VariableName":"city","Description":"The city name. Maximum length is 50 characters.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"country_code","Description":"The [two-character country code](https://developer.paypal.com/docs/classic/api/country_codes/).","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null},{"Type":"string","VariableName":"line1","Description":"The first line of the address. For example, number, street, and so on. Maximum length is 100 characters.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null},{"Type":"string","VariableName":"line2","Description":"The second line of the address. For example, suite, apartment number, and so on. Maximum length is 100 characters.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"normalization_status","Description":"The address normalization status. Returned only for payers from Brazil.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"phone","Description":"The phone number, in [E.123 format](https://www.itu.int/rec/T-REC-E.123-200102-I/en). Maximum length is 50 characters.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"postal_code","Description":"The zip code or equivalent. Typically required for countries that have them. Maximum length is 20 characters.**Required in certain countries.**","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"recipient_name","Description":"The name of the recipient at this address.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"state","Description":"The two-letter code for US states or the equivalent for other countries. Maximum length is 100 characters.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"status","Description":"The address status.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"type","Description":"The type of address. For example, `HOME_OR_WORK`, `GIFT`, and so on.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.payments.object;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.serializer.Serializable;
import com.braintreepayments.http.serializer.Deserializable;

/**
 * The extended address, which is used as the shipping address in a payment.
 */
public class ShippingAddress implements Serializable, Deserializable {

    // Required default constructor
    public ShippingAddress() {}

	/**
	* The city name. Maximum length is 50 characters.
	*/
	private String city;

	public String city() { return city; }
	
	public ShippingAddress city(String city) {
	    this.city = city;
	    return this;
	}

	/**
	* REQUIRED
	* The [two-character country code](https://developer.paypal.com/docs/classic/api/country_codes/).
	*/
	private String countryCode;

	public String countryCode() { return countryCode; }
	
	public ShippingAddress countryCode(String countryCode) {
	    this.countryCode = countryCode;
	    return this;
	}

	/**
	* REQUIRED
	* The first line of the address. For example, number, street, and so on. Maximum length is 100 characters.
	*/
	private String line1;

	public String line1() { return line1; }
	
	public ShippingAddress line1(String line1) {
	    this.line1 = line1;
	    return this;
	}

	/**
	* The second line of the address. For example, suite, apartment number, and so on. Maximum length is 100 characters.
	*/
	private String line2;

	public String line2() { return line2; }
	
	public ShippingAddress line2(String line2) {
	    this.line2 = line2;
	    return this;
	}

	/**
	* The address normalization status. Returned only for payers from Brazil.
	*/
	private String normalizationStatus;

	public String normalizationStatus() { return normalizationStatus; }
	
	public ShippingAddress normalizationStatus(String normalizationStatus) {
	    this.normalizationStatus = normalizationStatus;
	    return this;
	}

	/**
	* The phone number, in [E.123 format](https://www.itu.int/rec/T-REC-E.123-200102-I/en). Maximum length is 50 characters.
	*/
	private String phone;

	public String phone() { return phone; }
	
	public ShippingAddress phone(String phone) {
	    this.phone = phone;
	    return this;
	}

	/**
	* The zip code or equivalent. Typically required for countries that have them. Maximum length is 20 characters.**Required in certain countries.**
	*/
	private String postalCode;

	public String postalCode() { return postalCode; }
	
	public ShippingAddress postalCode(String postalCode) {
	    this.postalCode = postalCode;
	    return this;
	}

	/**
	* The name of the recipient at this address.
	*/
	private String recipientName;

	public String recipientName() { return recipientName; }
	
	public ShippingAddress recipientName(String recipientName) {
	    this.recipientName = recipientName;
	    return this;
	}

	/**
	* The two-letter code for US states or the equivalent for other countries. Maximum length is 100 characters.
	*/
	private String state;

	public String state() { return state; }
	
	public ShippingAddress state(String state) {
	    this.state = state;
	    return this;
	}

	/**
	* The address status.
	*/
	private String status;

	public String status() { return status; }
	
	public ShippingAddress status(String status) {
	    this.status = status;
	    return this;
	}

	/**
	* The type of address. For example, `HOME_OR_WORK`, `GIFT`, and so on.
	*/
	private String type;

	public String type() { return type; }
	
	public ShippingAddress type(String type) {
	    this.type = type;
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
        if (normalizationStatus != null) {
            serialized.put("normalization_status", this.normalizationStatus);
        }
        if (phone != null) {
            serialized.put("phone", this.phone);
        }
        if (postalCode != null) {
            serialized.put("postal_code", this.postalCode);
        }
        if (recipientName != null) {
            serialized.put("recipient_name", this.recipientName);
        }
        if (state != null) {
            serialized.put("state", this.state);
        }
        if (status != null) {
            serialized.put("status", this.status);
        }
        if (type != null) {
            serialized.put("type", this.type);
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
        if (values.containsKey("normalization_status")) {
            this.normalizationStatus = (String) values.get("normalization_status");
        }
        if (values.containsKey("phone")) {
            this.phone = (String) values.get("phone");
        }
        if (values.containsKey("postal_code")) {
            this.postalCode = (String) values.get("postal_code");
        }
        if (values.containsKey("recipient_name")) {
            this.recipientName = (String) values.get("recipient_name");
        }
        if (values.containsKey("state")) {
            this.state = (String) values.get("state");
        }
        if (values.containsKey("status")) {
            this.status = (String) values.get("status");
        }
        if (values.containsKey("type")) {
            this.type = (String) values.get("type");
        }
    }
}

