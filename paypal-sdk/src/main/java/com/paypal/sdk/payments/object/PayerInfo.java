// This class was generated on Mon, 17 Jul 2017 10:51:10 PDT by version 0.01 of Braintree SDK Generator
// PayerInfo.java
// DO NOT EDIT
// @type object
// @json {"Type":"Payer Info","VariableName":"","Description":"The payer information.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":[{"Type":"Address","VariableName":"billing_address","Description":"The billing address in a payment. Can be extended for shipping address.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"birth_date","Description":"The birth date of the payer, in [Internet date format](http://tools.ietf.org/html/rfc3339#section-5.6). For example, `1990-04-12`.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"country_code","Description":"The payer's [two-character IS0-3166-1 country code](https://developer.paypal.com/docs/classic/api/country_codes/).","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"email","Description":"The payer's email address. Maximum length is 127 characters.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"first_name","Description":"The payer's first name.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"last_name","Description":"The payer's last name.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"middle_name","Description":"The payer's middle name.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"payer_id","Description":"The PayPal-assigned encrypted payer ID.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"phone","Description":"The payer's phone number. Maximum length is 20 characters.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"phone_type","Description":"The phone type.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"salutation","Description":"The payer's salutation.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Shipping Address","VariableName":"shipping_address","Description":"The extended address, which is used as the shipping address in a payment.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"suffix","Description":"The payer's suffix.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"tax_id","Description":"The payer’s tax ID. Supported for the PayPal payment method only.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"tax_id_type","Description":"The payer’s tax ID type. Supported for the PayPal payment method only.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.payments.object;

import java.util.Map;
import java.util.List;
import com.google.gson.annotations.SerializedName;
/**
 * The payer information.
 */
public class PayerInfo {

	/**
	* The billing address in a payment. Can be extended for shipping address.
	*/
	@SerializedName("billing_address")
	private Address billingAddress;

	public Address billingAddress() { return billingAddress; }
	
	public PayerInfo billingAddress(Address billingAddress) {
	    this.billingAddress = billingAddress;
	    return this;
	}

	/**
	* The birth date of the payer, in [Internet date format](http://tools.ietf.org/html/rfc3339#section-5.6). For example, `1990-04-12`.
	*/
	@SerializedName("birth_date")
	private String birthDate;

	public String birthDate() { return birthDate; }
	
	public PayerInfo birthDate(String birthDate) {
	    this.birthDate = birthDate;
	    return this;
	}

	/**
	* The payer's [two-character IS0-3166-1 country code](https://developer.paypal.com/docs/classic/api/country_codes/).
	*/
	@SerializedName("country_code")
	private String countryCode;

	public String countryCode() { return countryCode; }
	
	public PayerInfo countryCode(String countryCode) {
	    this.countryCode = countryCode;
	    return this;
	}

	/**
	* The payer's email address. Maximum length is 127 characters.
	*/
	@SerializedName("email")
	private String email;

	public String email() { return email; }
	
	public PayerInfo email(String email) {
	    this.email = email;
	    return this;
	}

	/**
	* The payer's first name.
	*/
	@SerializedName("first_name")
	private String firstName;

	public String firstName() { return firstName; }
	
	public PayerInfo firstName(String firstName) {
	    this.firstName = firstName;
	    return this;
	}

	/**
	* The payer's last name.
	*/
	@SerializedName("last_name")
	private String lastName;

	public String lastName() { return lastName; }
	
	public PayerInfo lastName(String lastName) {
	    this.lastName = lastName;
	    return this;
	}

	/**
	* The payer's middle name.
	*/
	@SerializedName("middle_name")
	private String middleName;

	public String middleName() { return middleName; }
	
	public PayerInfo middleName(String middleName) {
	    this.middleName = middleName;
	    return this;
	}

	/**
	* The PayPal-assigned encrypted payer ID.
	*/
	@SerializedName("payer_id")
	private String payerId;

	public String payerId() { return payerId; }
	
	public PayerInfo payerId(String payerId) {
	    this.payerId = payerId;
	    return this;
	}

	/**
	* The payer's phone number. Maximum length is 20 characters.
	*/
	@SerializedName("phone")
	private String phone;

	public String phone() { return phone; }
	
	public PayerInfo phone(String phone) {
	    this.phone = phone;
	    return this;
	}

	/**
	* The phone type.
	*/
	@SerializedName("phone_type")
	private String phoneType;

	public String phoneType() { return phoneType; }
	
	public PayerInfo phoneType(String phoneType) {
	    this.phoneType = phoneType;
	    return this;
	}

	/**
	* The payer's salutation.
	*/
	@SerializedName("salutation")
	private String salutation;

	public String salutation() { return salutation; }
	
	public PayerInfo salutation(String salutation) {
	    this.salutation = salutation;
	    return this;
	}

	/**
	* The extended address, which is used as the shipping address in a payment.
	*/
	@SerializedName("shipping_address")
	private ShippingAddress shippingAddress;

	public ShippingAddress shippingAddress() { return shippingAddress; }
	
	public PayerInfo shippingAddress(ShippingAddress shippingAddress) {
	    this.shippingAddress = shippingAddress;
	    return this;
	}

	/**
	* The payer's suffix.
	*/
	@SerializedName("suffix")
	private String suffix;

	public String suffix() { return suffix; }
	
	public PayerInfo suffix(String suffix) {
	    this.suffix = suffix;
	    return this;
	}

	/**
	* The payer’s tax ID. Supported for the PayPal payment method only.
	*/
	@SerializedName("tax_id")
	private String taxId;

	public String taxId() { return taxId; }
	
	public PayerInfo taxId(String taxId) {
	    this.taxId = taxId;
	    return this;
	}

	/**
	* The payer’s tax ID type. Supported for the PayPal payment method only.
	*/
	@SerializedName("tax_id_type")
	private String taxIdType;

	public String taxIdType() { return taxIdType; }
	
	public PayerInfo taxIdType(String taxIdType) {
	    this.taxIdType = taxIdType;
	    return this;
	}
}
