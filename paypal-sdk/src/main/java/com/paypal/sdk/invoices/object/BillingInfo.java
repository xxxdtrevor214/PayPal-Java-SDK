// This class was generated on Thu, 13 Jul 2017 09:07:17 PDT by version 0.01 of Braintree SDK Generator
// BillingInfo.java
// DO NOT EDIT
// @type object
// @json {"Type":"Billing Info","VariableName":"","Description":"Billing information for the invoice recipient.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":[{"Type":"string","VariableName":"additional_info","Description":"Additional information, such as business hours.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Address","VariableName":"address","Description":"Base Address object used as billing address in a payment or extended for Shipping Address.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"business_name","Description":"The invoice recipient company business name.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"email","Description":"The invoice recipient email address.\u003cblockquote\u003e\u003cstrong\u003eNote:\u003c/strong\u003eBefore you get a QR code, you must create an invoice that specifies `qrinvoice@paypal.com `as the recipient email address in the `billing_info` object. Use a customer email address only if you want to email the invoice.\u003c/blockquote\u003e","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null},{"Type":"string","VariableName":"first_name","Description":"The invoice recipient first name.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"language","Description":"The language in which an email can be sent to the recipient. Used only when the recipient lacks a PayPal account.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"last_name","Description":"The invoice recipient last name.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"notification_channel","Description":"The preferred notification channel for the recipient. Default is `EMAIL`. For `SMS`, a `phone` value is required.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Phone","VariableName":"phone","Description":"The phone number.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.invoices.object;

import java.util.Map;
import java.util.List;
import com.google.gson.annotations.SerializedName;
/**
 * Billing information for the invoice recipient.
 */
public class BillingInfo {

	/**
	* Additional information, such as business hours.
	*/
	@SerializedName("additional_info")
	private String additionalInfo;

	public String additionalInfo() { return additionalInfo; }
	
	public BillingInfo additionalInfo(String additionalInfo) {
	    this.additionalInfo = additionalInfo;
	    return this;
	}

	/**
	* Base Address object used as billing address in a payment or extended for Shipping Address.
	*/
	@SerializedName("address")
	private Address address;

	public Address address() { return address; }
	
	public BillingInfo address(Address address) {
	    this.address = address;
	    return this;
	}

	/**
	* The invoice recipient company business name.
	*/
	@SerializedName("business_name")
	private String businessName;

	public String businessName() { return businessName; }
	
	public BillingInfo businessName(String businessName) {
	    this.businessName = businessName;
	    return this;
	}

	/**
	* REQUIRED
	* The invoice recipient email address.<blockquote><strong>Note:</strong>Before you get a QR code, you must create an invoice that specifies `qrinvoice@paypal.com `as the recipient email address in the `billing_info` object. Use a customer email address only if you want to email the invoice.</blockquote>
	*/
	@SerializedName("email")
	private String email;

	public String email() { return email; }
	
	public BillingInfo email(String email) {
	    this.email = email;
	    return this;
	}

	/**
	* The invoice recipient first name.
	*/
	@SerializedName("first_name")
	private String firstName;

	public String firstName() { return firstName; }
	
	public BillingInfo firstName(String firstName) {
	    this.firstName = firstName;
	    return this;
	}

	/**
	* The language in which an email can be sent to the recipient. Used only when the recipient lacks a PayPal account.
	*/
	@SerializedName("language")
	private String language;

	public String language() { return language; }
	
	public BillingInfo language(String language) {
	    this.language = language;
	    return this;
	}

	/**
	* The invoice recipient last name.
	*/
	@SerializedName("last_name")
	private String lastName;

	public String lastName() { return lastName; }
	
	public BillingInfo lastName(String lastName) {
	    this.lastName = lastName;
	    return this;
	}

	/**
	* The preferred notification channel for the recipient. Default is `EMAIL`. For `SMS`, a `phone` value is required.
	*/
	@SerializedName("notification_channel")
	private String notificationChannel;

	public String notificationChannel() { return notificationChannel; }
	
	public BillingInfo notificationChannel(String notificationChannel) {
	    this.notificationChannel = notificationChannel;
	    return this;
	}

	/**
	* The phone number.
	*/
	@SerializedName("phone")
	private Phone phone;

	public Phone phone() { return phone; }
	
	public BillingInfo phone(Phone phone) {
	    this.phone = phone;
	    return this;
	}
}
