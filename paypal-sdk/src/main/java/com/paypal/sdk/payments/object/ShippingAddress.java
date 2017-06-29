// This class was generated on Mon, 03 Jul 2017 13:56:47 PDT by version 0.01 of Braintree SDK Generator
// ShippingAddress.java
// DO NOT EDIT
// @type object
// @json {"Type":"Shipping Address","VariableName":"","Description":"The extended address, which is used as the shipping address in a payment.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":[{"Type":"string","VariableName":"city","Description":"The city name. Maximum length is 50 characters.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"country_code","Description":"The [two-character country code](https://developer.paypal.com/docs/classic/api/country_codes/).","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null},{"Type":"string","VariableName":"line1","Description":"The first line of the address. For example, number, street, and so on. Maximum length is 100 characters.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null},{"Type":"string","VariableName":"line2","Description":"The second line of the address. For example, suite, apartment number, and so on. Maximum length is 100 characters.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"normalization_status","Description":"The address normalization status. Returned only for payers from Brazil.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"phone","Description":"The phone number, in [E.123 format](https://www.itu.int/rec/T-REC-E.123-200102-I/en). Maximum length is 50 characters.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"postal_code","Description":"The zip code or equivalent. Typically required for countries that have them. Maximum length is 20 characters.**Required in certain countries.**","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"recipient_name","Description":"The name of the recipient at this address.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"state","Description":"The two-letter code for US states or the equivalent for other countries. Maximum length is 100 characters.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"status","Description":"The address status.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"type","Description":"The type of address. For example, `HOME_OR_WORK`, `GIFT`, and so on.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.payments.object;

import java.util.Map;
import java.util.List;
import com.google.gson.annotations.SerializedName;
/**
 * The extended address, which is used as the shipping address in a payment.
 */
public class ShippingAddress {

	/**
	* The city name. Maximum length is 50 characters.
	*/
	@SerializedName("city")
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
	@SerializedName("country_code")
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
	@SerializedName("line1")
	private String line1;

	public String line1() { return line1; }
	
	public ShippingAddress line1(String line1) {
	    this.line1 = line1;
	    return this;
	}

	/**
	* The second line of the address. For example, suite, apartment number, and so on. Maximum length is 100 characters.
	*/
	@SerializedName("line2")
	private String line2;

	public String line2() { return line2; }
	
	public ShippingAddress line2(String line2) {
	    this.line2 = line2;
	    return this;
	}

	/**
	* The address normalization status. Returned only for payers from Brazil.
	*/
	@SerializedName("normalization_status")
	private String normalizationStatus;

	public String normalizationStatus() { return normalizationStatus; }
	
	public ShippingAddress normalizationStatus(String normalizationStatus) {
	    this.normalizationStatus = normalizationStatus;
	    return this;
	}

	/**
	* The phone number, in [E.123 format](https://www.itu.int/rec/T-REC-E.123-200102-I/en). Maximum length is 50 characters.
	*/
	@SerializedName("phone")
	private String phone;

	public String phone() { return phone; }
	
	public ShippingAddress phone(String phone) {
	    this.phone = phone;
	    return this;
	}

	/**
	* The zip code or equivalent. Typically required for countries that have them. Maximum length is 20 characters.**Required in certain countries.**
	*/
	@SerializedName("postal_code")
	private String postalCode;

	public String postalCode() { return postalCode; }
	
	public ShippingAddress postalCode(String postalCode) {
	    this.postalCode = postalCode;
	    return this;
	}

	/**
	* The name of the recipient at this address.
	*/
	@SerializedName("recipient_name")
	private String recipientName;

	public String recipientName() { return recipientName; }
	
	public ShippingAddress recipientName(String recipientName) {
	    this.recipientName = recipientName;
	    return this;
	}

	/**
	* The two-letter code for US states or the equivalent for other countries. Maximum length is 100 characters.
	*/
	@SerializedName("state")
	private String state;

	public String state() { return state; }
	
	public ShippingAddress state(String state) {
	    this.state = state;
	    return this;
	}

	/**
	* The address status.
	*/
	@SerializedName("status")
	private String status;

	public String status() { return status; }
	
	public ShippingAddress status(String status) {
	    this.status = status;
	    return this;
	}

	/**
	* The type of address. For example, `HOME_OR_WORK`, `GIFT`, and so on.
	*/
	@SerializedName("type")
	private String type;

	public String type() { return type; }
	
	public ShippingAddress type(String type) {
	    this.type = type;
	    return this;
	}
}
