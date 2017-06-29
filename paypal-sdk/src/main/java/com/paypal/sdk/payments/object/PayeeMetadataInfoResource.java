// This class was generated on Mon, 03 Jul 2017 13:56:47 PDT by version 0.01 of Braintree SDK Generator
// PayeeMetadataInfoResource.java
// DO NOT EDIT
// @type object
// @json {"Type":"Payee metadata Info Resource","VariableName":"","Description":"A resource representing a display only metadata for Payee","IsArray":false,"ReadOnly":false,"Required":false,"Properties":[{"Type":"string","VariableName":"brand_name","Description":"Payer's business name.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Display Phone","VariableName":"display_phone","Description":"Information related to the Payee.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"email","Description":"Email address representing the payer. 127 characters max.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.payments.object;

import java.util.Map;
import java.util.List;
import com.google.gson.annotations.SerializedName;
/**
 * A resource representing a display only metadata for Payee
 */
public class PayeeMetadataInfoResource {

	/**
	* Payer's business name.
	*/
	@SerializedName("brand_name")
	private String brandName;

	public String brandName() { return brandName; }
	
	public PayeeMetadataInfoResource brandName(String brandName) {
	    this.brandName = brandName;
	    return this;
	}

	/**
	* Information related to the Payee.
	*/
	@SerializedName("display_phone")
	private DisplayPhone displayPhone;

	public DisplayPhone displayPhone() { return displayPhone; }
	
	public PayeeMetadataInfoResource displayPhone(DisplayPhone displayPhone) {
	    this.displayPhone = displayPhone;
	    return this;
	}

	/**
	* Email address representing the payer. 127 characters max.
	*/
	@SerializedName("email")
	private String email;

	public String email() { return email; }
	
	public PayeeMetadataInfoResource email(String email) {
	    this.email = email;
	    return this;
	}
}
