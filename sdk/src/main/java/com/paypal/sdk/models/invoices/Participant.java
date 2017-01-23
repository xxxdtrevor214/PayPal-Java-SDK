// This class was generated on Mon, 23 Jan 2017 15:08:17 PST by version 0.01 of Braintree SDK Generator
// Participant.java
// DO NOT EDIT
// @object participant
// @body {"Name":"additional_info","WireType":{"Name":"string","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"address","WireType":{"Name":"common_address","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"business_name","WireType":{"Name":"string","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"email","WireType":{"Name":"string","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"fax","WireType":{"Name":"phone","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"first_name","WireType":{"Name":"string","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"last_name","WireType":{"Name":"string","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"phone","WireType":{"Name":"phone","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"website","WireType":{"Name":"string","IsArray":false},"ReadOnly":false,"Visibility":""}

package com.paypal.sdk.models.invoices;

import com.paypal.sdk.models.common.*;
import java.util.List;
import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * Participant information.
 */
@Data
@Accessors(chain = true)
public class Participant {
    
	/**
	* Additional information, such as business hours.
	*/
	@SerializedName("additional_info")
	private String additionalInfo;
    
	/**
	* The participant address.
	*/
	@SerializedName("address")
	private CommonAddress address;
    
	/**
	* The participant company business name.
	*/
	@SerializedName("business_name")
	private String businessName;
    
	/**
	* The participant email address.
	*/
	@SerializedName("email")
	private String email;
    
	/**
	* The participant fax number.
	*/
	@SerializedName("fax")
	private Phone fax;
    
	/**
	* The participant first name.
	*/
	@SerializedName("first_name")
	private String firstName;
    
	/**
	* The participant last name.
	*/
	@SerializedName("last_name")
	private String lastName;
    
	/**
	* The participant phone number.
	*/
	@SerializedName("phone")
	private Phone phone;
    
	/**
	* The participant website.
	*/
	@SerializedName("website")
	private String website;
}
