// This class was generated on Mon, 03 Jul 2017 13:56:47 PDT by version 0.01 of Braintree SDK Generator
// CreditCard.java
// DO NOT EDIT
// @type object
// @json {"Type":"Credit Card","VariableName":"","Description":"[DEPRECATED] A credit card that can be used to fund a payment. Use payment card instead.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":[{"Type":"Address","VariableName":"billing_address","Description":"The billing address in a payment. Can be extended for shipping address.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"cvv2","Description":"The three- to four-digit card validation code.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"integer","VariableName":"expire_month","Description":"The expiration month with no leading zero. Value is from `1` to `12`.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null},{"Type":"integer","VariableName":"expire_year","Description":"The four-digit expiration year.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null},{"Type":"string","VariableName":"first_name","Description":"The card holder's first name.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"last_name","Description":"The card holder's last name.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Link Description Object","VariableName":"links","Description":"","IsArray":true,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"number","Description":"The credit card number. Numeric characters only with no spaces or punctuation. The string must conform to the modulo and length required by each credit card type. *Redacted in responses.*","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null},{"Type":"string","VariableName":"type","Description":"The credit card type. Value is `visa`, `mastercard`, `discover`, or `amex`.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null}]}

package com.paypal.sdk.payments.object;

import java.util.Map;
import java.util.List;
import com.google.gson.annotations.SerializedName;
/**
 * [DEPRECATED] A credit card that can be used to fund a payment. Use payment card instead.
 */
public class CreditCard {

	/**
	* The billing address in a payment. Can be extended for shipping address.
	*/
	@SerializedName("billing_address")
	private Address billingAddress;

	public Address billingAddress() { return billingAddress; }
	
	public CreditCard billingAddress(Address billingAddress) {
	    this.billingAddress = billingAddress;
	    return this;
	}

	/**
	* The three- to four-digit card validation code.
	*/
	@SerializedName("cvv2")
	private String cvv2;

	public String cvv2() { return cvv2; }
	
	public CreditCard cvv2(String cvv2) {
	    this.cvv2 = cvv2;
	    return this;
	}

	/**
	* REQUIRED
	* The expiration month with no leading zero. Value is from `1` to `12`.
	*/
	@SerializedName("expire_month")
	private Integer expireMonth;

	public Integer expireMonth() { return expireMonth; }
	
	public CreditCard expireMonth(Integer expireMonth) {
	    this.expireMonth = expireMonth;
	    return this;
	}

	/**
	* REQUIRED
	* The four-digit expiration year.
	*/
	@SerializedName("expire_year")
	private Integer expireYear;

	public Integer expireYear() { return expireYear; }
	
	public CreditCard expireYear(Integer expireYear) {
	    this.expireYear = expireYear;
	    return this;
	}

	/**
	* The card holder's first name.
	*/
	@SerializedName("first_name")
	private String firstName;

	public String firstName() { return firstName; }
	
	public CreditCard firstName(String firstName) {
	    this.firstName = firstName;
	    return this;
	}

	/**
	* The card holder's last name.
	*/
	@SerializedName("last_name")
	private String lastName;

	public String lastName() { return lastName; }
	
	public CreditCard lastName(String lastName) {
	    this.lastName = lastName;
	    return this;
	}

	/**
	*/
	@SerializedName("links")
	private List<LinkDescriptionObject> links;

	public List<LinkDescriptionObject> links() { return links; }
	
	public CreditCard links(List<LinkDescriptionObject> links) {
	    this.links = links;
	    return this;
	}

	/**
	* REQUIRED
	* The credit card number. Numeric characters only with no spaces or punctuation. The string must conform to the modulo and length required by each credit card type. *Redacted in responses.*
	*/
	@SerializedName("number")
	private String number;

	public String number() { return number; }
	
	public CreditCard number(String number) {
	    this.number = number;
	    return this;
	}

	/**
	* REQUIRED
	* The credit card type. Value is `visa`, `mastercard`, `discover`, or `amex`.
	*/
	@SerializedName("type")
	private String type;

	public String type() { return type; }
	
	public CreditCard type(String type) {
	    this.type = type;
	    return this;
	}
}
