// This class was generated on Sun, 30 Jul 2017 11:04:05 PDT by version 0.1 of Braintree SDK Generator
// BillingInfo.java
// DO NOT EDIT
// @type object
// @json {"Type":"Billing Info","VariableName":"","Description":"Billing information for the invoice recipient.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":[{"Type":"string","VariableName":"additional_info","Description":"Additional information, such as business hours.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Address","VariableName":"address","Description":"Base Address object used as billing address in a payment or extended for Shipping Address.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"business_name","Description":"The invoice recipient company business name.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"email","Description":"The invoice recipient email address.\u003cblockquote\u003e\u003cstrong\u003eNote:\u003c/strong\u003eBefore you get a QR code, you must create an invoice that specifies `qrinvoice@paypal.com `as the recipient email address in the `billing_info` object. Use a customer email address only if you want to email the invoice.\u003c/blockquote\u003e","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null},{"Type":"string","VariableName":"first_name","Description":"The invoice recipient first name.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"language","Description":"The language in which an email can be sent to the recipient. Used only when the recipient lacks a PayPal account.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"last_name","Description":"The invoice recipient last name.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"notification_channel","Description":"The preferred notification channel for the recipient. Default is `EMAIL`. For `SMS`, a `phone` value is required.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Phone","VariableName":"phone","Description":"The phone number.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.invoices.object;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.serializer.Serializable;
import com.braintreepayments.http.serializer.Deserializable;

/**
 * Billing information for the invoice recipient.
 */
public class BillingInfo implements Serializable, Deserializable {

    // Required default constructor
    public BillingInfo() {}

	/**
	* Additional information, such as business hours.
	*/
	private String additionalInfo;

	public String additionalInfo() { return additionalInfo; }
	
	public BillingInfo additionalInfo(String additionalInfo) {
	    this.additionalInfo = additionalInfo;
	    return this;
	}

	/**
	* Base Address object used as billing address in a payment or extended for Shipping Address.
	*/
	private Address address;

	public Address address() { return address; }
	
	public BillingInfo address(Address address) {
	    this.address = address;
	    return this;
	}

	/**
	* The invoice recipient company business name.
	*/
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
	private String email;

	public String email() { return email; }
	
	public BillingInfo email(String email) {
	    this.email = email;
	    return this;
	}

	/**
	* The invoice recipient first name.
	*/
	private String firstName;

	public String firstName() { return firstName; }
	
	public BillingInfo firstName(String firstName) {
	    this.firstName = firstName;
	    return this;
	}

	/**
	* The language in which an email can be sent to the recipient. Used only when the recipient lacks a PayPal account.
	*/
	private String language;

	public String language() { return language; }
	
	public BillingInfo language(String language) {
	    this.language = language;
	    return this;
	}

	/**
	* The invoice recipient last name.
	*/
	private String lastName;

	public String lastName() { return lastName; }
	
	public BillingInfo lastName(String lastName) {
	    this.lastName = lastName;
	    return this;
	}

	/**
	* The preferred notification channel for the recipient. Default is `EMAIL`. For `SMS`, a `phone` value is required.
	*/
	private String notificationChannel;

	public String notificationChannel() { return notificationChannel; }
	
	public BillingInfo notificationChannel(String notificationChannel) {
	    this.notificationChannel = notificationChannel;
	    return this;
	}

	/**
	* The phone number.
	*/
	private Phone phone;

	public Phone phone() { return phone; }
	
	public BillingInfo phone(Phone phone) {
	    this.phone = phone;
	    return this;
	}

    @Override
    public void serialize(Map<String, Object> serialized) {
        if (additionalInfo != null) {
            serialized.put("additional_info", this.additionalInfo);
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
        if (firstName != null) {
            serialized.put("first_name", this.firstName);
        }
        if (language != null) {
            serialized.put("language", this.language);
        }
        if (lastName != null) {
            serialized.put("last_name", this.lastName);
        }
        if (notificationChannel != null) {
            serialized.put("notification_channel", this.notificationChannel);
        }
        if (phone != null) {
            serialized.put("phone", this.phone);
        }
    }

    @Override
    public void deserialize(Map<String, Object> values) {
        if (values.containsKey("additional_info")) {
            this.additionalInfo = (String) values.get("additional_info");
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
        if (values.containsKey("first_name")) {
            this.firstName = (String) values.get("first_name");
        }
        if (values.containsKey("language")) {
            this.language = (String) values.get("language");
        }
        if (values.containsKey("last_name")) {
            this.lastName = (String) values.get("last_name");
        }
        if (values.containsKey("notification_channel")) {
            this.notificationChannel = (String) values.get("notification_channel");
        }
        if (values.containsKey("phone")) {
            this.phone = new Phone();
            this.phone.deserialize((Map<String, Object>) values.get("phone"));
        }
    }
}

