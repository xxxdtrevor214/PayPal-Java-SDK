// This class was generated on Sun, 30 Jul 2017 11:04:05 PDT by version 0.1 of Braintree SDK Generator
// MerchantInformation.java
// DO NOT EDIT
// @type object
// @json {"Type":"Merchant Information","VariableName":"","Description":"Merchant business information that appears on the invoice.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":[{"Type":"string","VariableName":"additional_info","Description":"Additional information, such as business hours.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"additional_info_label","Description":"A label for the `additional_info` field.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Address","VariableName":"address","Description":"Base Address object used as billing address in a payment or extended for Shipping Address.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"business_name","Description":"The merchant company business name.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"email","Description":"The merchant email address.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null},{"Type":"Phone","VariableName":"fax","Description":"The phone number.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"first_name","Description":"The merchant first name.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"last_name","Description":"The merchant last name.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Phone","VariableName":"phone","Description":"The phone number.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"tax_id","Description":"The merchant tax ID.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"website","Description":"The merchant website.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.invoices.object;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.serializer.Serializable;
import com.braintreepayments.http.serializer.Deserializable;

/**
 * Merchant business information that appears on the invoice.
 */
public class MerchantInformation implements Serializable, Deserializable {

    // Required default constructor
    public MerchantInformation() {}

	/**
	* Additional information, such as business hours.
	*/
	private String additionalInfo;

	public String additionalInfo() { return additionalInfo; }
	
	public MerchantInformation additionalInfo(String additionalInfo) {
	    this.additionalInfo = additionalInfo;
	    return this;
	}

	/**
	* A label for the `additional_info` field.
	*/
	private String additionalInfoLabel;

	public String additionalInfoLabel() { return additionalInfoLabel; }
	
	public MerchantInformation additionalInfoLabel(String additionalInfoLabel) {
	    this.additionalInfoLabel = additionalInfoLabel;
	    return this;
	}

	/**
	* Base Address object used as billing address in a payment or extended for Shipping Address.
	*/
	private Address address;

	public Address address() { return address; }
	
	public MerchantInformation address(Address address) {
	    this.address = address;
	    return this;
	}

	/**
	* The merchant company business name.
	*/
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
	private String email;

	public String email() { return email; }
	
	public MerchantInformation email(String email) {
	    this.email = email;
	    return this;
	}

	/**
	* The phone number.
	*/
	private Phone fax;

	public Phone fax() { return fax; }
	
	public MerchantInformation fax(Phone fax) {
	    this.fax = fax;
	    return this;
	}

	/**
	* The merchant first name.
	*/
	private String firstName;

	public String firstName() { return firstName; }
	
	public MerchantInformation firstName(String firstName) {
	    this.firstName = firstName;
	    return this;
	}

	/**
	* The merchant last name.
	*/
	private String lastName;

	public String lastName() { return lastName; }
	
	public MerchantInformation lastName(String lastName) {
	    this.lastName = lastName;
	    return this;
	}

	/**
	* The phone number.
	*/
	private Phone phone;

	public Phone phone() { return phone; }
	
	public MerchantInformation phone(Phone phone) {
	    this.phone = phone;
	    return this;
	}

	/**
	* The merchant tax ID.
	*/
	private String taxId;

	public String taxId() { return taxId; }
	
	public MerchantInformation taxId(String taxId) {
	    this.taxId = taxId;
	    return this;
	}

	/**
	* The merchant website.
	*/
	private String website;

	public String website() { return website; }
	
	public MerchantInformation website(String website) {
	    this.website = website;
	    return this;
	}

    @Override
    public void serialize(Map<String, Object> serialized) {
        if (additionalInfo != null) {
            serialized.put("additional_info", this.additionalInfo);
        }
        if (additionalInfoLabel != null) {
            serialized.put("additional_info_label", this.additionalInfoLabel);
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
        if (taxId != null) {
            serialized.put("tax_id", this.taxId);
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
        if (values.containsKey("additional_info_label")) {
            this.additionalInfoLabel = (String) values.get("additional_info_label");
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
        if (values.containsKey("tax_id")) {
            this.taxId = (String) values.get("tax_id");
        }
        if (values.containsKey("website")) {
            this.website = (String) values.get("website");
        }
    }
}

