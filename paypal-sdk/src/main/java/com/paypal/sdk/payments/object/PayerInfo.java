// This class was generated on Mon, 31 Jul 2017 18:27:14 UTC by version 0.1 of Braintree SDK Generator
// PayerInfo.java
// DO NOT EDIT
// @type object
// @json {"Type":"Payer Info","VariableName":"","Description":"The payer information.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":[{"Type":"Address","VariableName":"billing_address","Description":"The billing address in a payment. Can be extended for shipping address.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"birth_date","Description":"The birth date of the payer, in [Internet date format](http://tools.ietf.org/html/rfc3339#section-5.6). For example, `1990-04-12`.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"country_code","Description":"The payer's [two-character IS0-3166-1 country code](https://developer.paypal.com/docs/classic/api/country_codes/).","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"email","Description":"The payer's email address. Maximum length is 127 characters.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"first_name","Description":"The payer's first name.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"last_name","Description":"The payer's last name.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"middle_name","Description":"The payer's middle name.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"payer_id","Description":"The PayPal-assigned encrypted payer ID.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"phone","Description":"The payer's phone number. Maximum length is 20 characters.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"phone_type","Description":"The phone type.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"salutation","Description":"The payer's salutation.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Shipping Address","VariableName":"shipping_address","Description":"The extended address, which is used as the shipping address in a payment.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"suffix","Description":"The payer's suffix.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"tax_id","Description":"The payer’s tax ID. Supported for the PayPal payment method only.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"tax_id_type","Description":"The payer’s tax ID type. Supported for the PayPal payment method only.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.payments.object;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.serializer.Serializable;
import com.braintreepayments.http.serializer.Deserializable;

/**
 * The payer information.
 */
public class PayerInfo implements Serializable, Deserializable {

    // Required default constructor
    public PayerInfo() {}

	/**
	* The billing address in a payment. Can be extended for shipping address.
	*/
	private Address billingAddress;

	public Address billingAddress() { return billingAddress; }
	
	public PayerInfo billingAddress(Address billingAddress) {
	    this.billingAddress = billingAddress;
	    return this;
	}

	/**
	* The birth date of the payer, in [Internet date format](http://tools.ietf.org/html/rfc3339#section-5.6). For example, `1990-04-12`.
	*/
	private String birthDate;

	public String birthDate() { return birthDate; }
	
	public PayerInfo birthDate(String birthDate) {
	    this.birthDate = birthDate;
	    return this;
	}

	/**
	* The payer's [two-character IS0-3166-1 country code](https://developer.paypal.com/docs/classic/api/country_codes/).
	*/
	private String countryCode;

	public String countryCode() { return countryCode; }
	
	public PayerInfo countryCode(String countryCode) {
	    this.countryCode = countryCode;
	    return this;
	}

	/**
	* The payer's email address. Maximum length is 127 characters.
	*/
	private String email;

	public String email() { return email; }
	
	public PayerInfo email(String email) {
	    this.email = email;
	    return this;
	}

	/**
	* The payer's first name.
	*/
	private String firstName;

	public String firstName() { return firstName; }
	
	public PayerInfo firstName(String firstName) {
	    this.firstName = firstName;
	    return this;
	}

	/**
	* The payer's last name.
	*/
	private String lastName;

	public String lastName() { return lastName; }
	
	public PayerInfo lastName(String lastName) {
	    this.lastName = lastName;
	    return this;
	}

	/**
	* The payer's middle name.
	*/
	private String middleName;

	public String middleName() { return middleName; }
	
	public PayerInfo middleName(String middleName) {
	    this.middleName = middleName;
	    return this;
	}

	/**
	* The PayPal-assigned encrypted payer ID.
	*/
	private String payerId;

	public String payerId() { return payerId; }
	
	public PayerInfo payerId(String payerId) {
	    this.payerId = payerId;
	    return this;
	}

	/**
	* The payer's phone number. Maximum length is 20 characters.
	*/
	private String phone;

	public String phone() { return phone; }
	
	public PayerInfo phone(String phone) {
	    this.phone = phone;
	    return this;
	}

	/**
	* The phone type.
	*/
	private String phoneType;

	public String phoneType() { return phoneType; }
	
	public PayerInfo phoneType(String phoneType) {
	    this.phoneType = phoneType;
	    return this;
	}

	/**
	* The payer's salutation.
	*/
	private String salutation;

	public String salutation() { return salutation; }
	
	public PayerInfo salutation(String salutation) {
	    this.salutation = salutation;
	    return this;
	}

	/**
	* The extended address, which is used as the shipping address in a payment.
	*/
	private ShippingAddress shippingAddress;

	public ShippingAddress shippingAddress() { return shippingAddress; }
	
	public PayerInfo shippingAddress(ShippingAddress shippingAddress) {
	    this.shippingAddress = shippingAddress;
	    return this;
	}

	/**
	* The payer's suffix.
	*/
	private String suffix;

	public String suffix() { return suffix; }
	
	public PayerInfo suffix(String suffix) {
	    this.suffix = suffix;
	    return this;
	}

	/**
	* The payer’s tax ID. Supported for the PayPal payment method only.
	*/
	private String taxId;

	public String taxId() { return taxId; }
	
	public PayerInfo taxId(String taxId) {
	    this.taxId = taxId;
	    return this;
	}

	/**
	* The payer’s tax ID type. Supported for the PayPal payment method only.
	*/
	private String taxIdType;

	public String taxIdType() { return taxIdType; }
	
	public PayerInfo taxIdType(String taxIdType) {
	    this.taxIdType = taxIdType;
	    return this;
	}

    @Override
    public void serialize(Map<String, Object> serialized) {
        if (billingAddress != null) {
            serialized.put("billing_address", this.billingAddress);
        }
        if (birthDate != null) {
            serialized.put("birth_date", this.birthDate);
        }
        if (countryCode != null) {
            serialized.put("country_code", this.countryCode);
        }
        if (email != null) {
            serialized.put("email", this.email);
        }
        if (firstName != null) {
            serialized.put("first_name", this.firstName);
        }
        if (lastName != null) {
            serialized.put("last_name", this.lastName);
        }
        if (middleName != null) {
            serialized.put("middle_name", this.middleName);
        }
        if (payerId != null) {
            serialized.put("payer_id", this.payerId);
        }
        if (phone != null) {
            serialized.put("phone", this.phone);
        }
        if (phoneType != null) {
            serialized.put("phone_type", this.phoneType);
        }
        if (salutation != null) {
            serialized.put("salutation", this.salutation);
        }
        if (shippingAddress != null) {
            serialized.put("shipping_address", this.shippingAddress);
        }
        if (suffix != null) {
            serialized.put("suffix", this.suffix);
        }
        if (taxId != null) {
            serialized.put("tax_id", this.taxId);
        }
        if (taxIdType != null) {
            serialized.put("tax_id_type", this.taxIdType);
        }
    }

    @Override
    public void deserialize(Map<String, Object> values) {
        if (values.containsKey("billing_address")) {
            this.billingAddress = new Address();
            this.billingAddress.deserialize((Map<String, Object>) values.get("billing_address"));
        }
        if (values.containsKey("birth_date")) {
            this.birthDate = (String) values.get("birth_date");
        }
        if (values.containsKey("country_code")) {
            this.countryCode = (String) values.get("country_code");
        }
        if (values.containsKey("email")) {
            this.email = (String) values.get("email");
        }
        if (values.containsKey("first_name")) {
            this.firstName = (String) values.get("first_name");
        }
        if (values.containsKey("last_name")) {
            this.lastName = (String) values.get("last_name");
        }
        if (values.containsKey("middle_name")) {
            this.middleName = (String) values.get("middle_name");
        }
        if (values.containsKey("payer_id")) {
            this.payerId = (String) values.get("payer_id");
        }
        if (values.containsKey("phone")) {
            this.phone = (String) values.get("phone");
        }
        if (values.containsKey("phone_type")) {
            this.phoneType = (String) values.get("phone_type");
        }
        if (values.containsKey("salutation")) {
            this.salutation = (String) values.get("salutation");
        }
        if (values.containsKey("shipping_address")) {
            this.shippingAddress = new ShippingAddress();
            this.shippingAddress.deserialize((Map<String, Object>) values.get("shipping_address"));
        }
        if (values.containsKey("suffix")) {
            this.suffix = (String) values.get("suffix");
        }
        if (values.containsKey("tax_id")) {
            this.taxId = (String) values.get("tax_id");
        }
        if (values.containsKey("tax_id_type")) {
            this.taxIdType = (String) values.get("tax_id_type");
        }
    }
}

