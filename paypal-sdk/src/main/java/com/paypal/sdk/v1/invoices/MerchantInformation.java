// This class was generated on Mon, 29 Jan 2018 12:12:00 PST by version 0.1.0-dev+ecea6f of Braintree SDK Generator
// MerchantInformation.java
// @version 0.1.0-dev+ecea6f
// @type object
// @data H4sIAAAAAAAC/+xWTW/jNhC991cM1EuMCk7jfhxyS50WWLTNBs22hxaFdySOrGkpUktSWQtF/3tBSrJNK2skqVcFihw5M6Leexw+zl/Jm7am5DL5kUxeonLwShXaVOhYqyRNfkHDmEm6wcpXJWnyPbW7xTXZ3HAdivf2yBrLiqwF3m0GrkQHWNeExkJYE7C615zTPEmTK2Ow7cB8niY/EYrXSrbJZYHSkg+8a9iQ2AZuja7JOCabXP62pWGdYbUeA0ch2KNAufKYIh7jXEzrapvf55OCbfIS0O7Ylrox9t9yUY2Uf6dPJbSSmJE8RmtbcUAOQhwKbcKJvD347C0UTFKcmNWVEIasfZBWn4iI9LEY+jdoCfqdQGd/UO6gsSTCmbCUrNbQfwusAKHGtiLlQBugjSMlSATedyXXta/uN/v47ZizayOOfSAmuGTXgsLqaffDmeZ5LZXrRjnTrnItKAYXJ2KQC5DkHBnoq8BXTQNYsqKLCOkQiSH+wIrgAnQROnzomDNaz0E1VUYmBesMkUuBXD6bDvxiBH4xAv+67r3Hp2HxIAvbsKMUsHbwaeAwn01kQ3WpVdwsQyRmceujvdr+Mn47v1h8AZ2ZTgVVW4dy3N1xPIb9K9ehn4NlvGv4HqU3ELbQ2AalbMH0yIKRdFeAyXaPXYn35A+rmsN32oBk6/zxHVQJDUr3xR2W8EsLtSTvcIYKMuA0lM7Vl+fnpObv+U+uSTDOtVmf+9X57Y7FRHpahy5Wcoh80CAEBZl+voNQalNAJUI774nrK7QraU/OkzD6/RGchqd85V034naYiTm+KQmqYfrJdVWjandzwZMt/PmHQhVyPAYMkSOAQ8nwVJ7W/W57NziAWeAmAtmtxxDrPduY4FV+1gPocW7fPuzGjtDqZ8vlLPXDiKCCFQnIWu97X385hyA/brhqKt8uWUhLUmtXeodYLj9TOIycFi6+AsFrdlPNlsO/V53wkRTj3FiNLfbhdX1Qg6vDOsi1smyd9RJsc4Ks427Vy3pzvZwF47BN5n/tP+13OLu7mf236j7GZQo21o0tJgofua6hbkpTkfgQ3P3oEbS+7GOA/YCzPHYgeXGXF3f5f7qLw82KRSTrNnTknjrcwKvriXrgPWWWD6bHXewIyr7oRGJ+8g8AAAD//w==
// DO NOT EDIT
package com.paypal.sdk.v1.invoices;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * Merchant business information that appears on the invoice.
 */
@Model
public class MerchantInformation {

    // Required default constructor
    public MerchantInformation() {}

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
