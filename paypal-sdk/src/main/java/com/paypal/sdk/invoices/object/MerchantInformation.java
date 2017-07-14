// This class was generated on Thu, 13 Jul 2017 09:07:17 PDT by version 0.01 of Braintree SDK Generator
// MerchantInformation.java
// DO NOT EDIT
// @type object
// @json {"Type":"Merchant Information","VariableName":"","Description":"Merchant business information that appears on the invoice.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":[{"Type":"string","VariableName":"additional_info","Description":"Additional information, such as business hours.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"additional_info_label","Description":"A label for the `additional_info` field.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Address","VariableName":"address","Description":"Base Address object used as billing address in a payment or extended for Shipping Address.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"business_name","Description":"The merchant company business name.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"email","Description":"The merchant email address.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null},{"Type":"Phone","VariableName":"fax","Description":"The phone number.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"first_name","Description":"The merchant first name.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"last_name","Description":"The merchant last name.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Phone","VariableName":"phone","Description":"The phone number.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"tax_id","Description":"The merchant tax ID.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"website","Description":"The merchant website.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.invoices.object;

import java.util.Map;
import java.util.List;
import com.google.gson.annotations.SerializedName;
/**
 * Merchant business information that appears on the invoice.
 */
public class MerchantInformation {

	/**
	* Additional information, such as business hours.
	*/
	@SerializedName("additional_info")
	private String additionalInfo;

	public String additionalInfo() { return additionalInfo; }
	
	public MerchantInformation additionalInfo(String additionalInfo) {
	    this.additionalInfo = additionalInfo;
	    return this;
	}

	/**
	* A label for the `additional_info` field.
	*/
	@SerializedName("additional_info_label")
	private String additionalInfoLabel;

	public String additionalInfoLabel() { return additionalInfoLabel; }
	
	public MerchantInformation additionalInfoLabel(String additionalInfoLabel) {
	    this.additionalInfoLabel = additionalInfoLabel;
	    return this;
	}

	/**
	* Base Address object used as billing address in a payment or extended for Shipping Address.
	*/
	@SerializedName("address")
	private Address address;

	public Address address() { return address; }
	
	public MerchantInformation address(Address address) {
	    this.address = address;
	    return this;
	}

	/**
	* The merchant company business name.
	*/
	@SerializedName("business_name")
	private String businessName;

	public String businessName() { return businessName; }
	
	public MerchantInformation businessName(String businessName) {
	    this.businessName = businessName;
	    return this;
	}

	/**
	* REQUIRED
	* The merchant email address.
	*/
	@SerializedName("email")
	private String email;

	public String email() { return email; }
	
	public MerchantInformation email(String email) {
	    this.email = email;
	    return this;
	}

	/**
	* The phone number.
	*/
	@SerializedName("fax")
	private Phone fax;

	public Phone fax() { return fax; }
	
	public MerchantInformation fax(Phone fax) {
	    this.fax = fax;
	    return this;
	}

	/**
	* The merchant first name.
	*/
	@SerializedName("first_name")
	private String firstName;

	public String firstName() { return firstName; }
	
	public MerchantInformation firstName(String firstName) {
	    this.firstName = firstName;
	    return this;
	}

	/**
	* The merchant last name.
	*/
	@SerializedName("last_name")
	private String lastName;

	public String lastName() { return lastName; }
	
	public MerchantInformation lastName(String lastName) {
	    this.lastName = lastName;
	    return this;
	}

	/**
	* The phone number.
	*/
	@SerializedName("phone")
	private Phone phone;

	public Phone phone() { return phone; }
	
	public MerchantInformation phone(Phone phone) {
	    this.phone = phone;
	    return this;
	}

	/**
	* The merchant tax ID.
	*/
	@SerializedName("tax_id")
	private String taxId;

	public String taxId() { return taxId; }
	
	public MerchantInformation taxId(String taxId) {
	    this.taxId = taxId;
	    return this;
	}

	/**
	* The merchant website.
	*/
	@SerializedName("website")
	private String website;

	public String website() { return website; }
	
	public MerchantInformation website(String website) {
	    this.website = website;
	    return this;
	}
}
