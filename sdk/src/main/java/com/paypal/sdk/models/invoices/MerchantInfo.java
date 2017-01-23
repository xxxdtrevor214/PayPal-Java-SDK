// This class was generated on Mon, 23 Jan 2017 15:08:17 PST by version 0.01 of Braintree SDK Generator
// MerchantInfo.java
// DO NOT EDIT
// @object merchant_info
// @body {"Name":"additional_info","WireType":{"Name":"string","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"additional_info_label","WireType":{"Name":"string","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"address","WireType":{"Name":"common_address","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"business_name","WireType":{"Name":"string","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"email","WireType":{"Name":"string","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"fax","WireType":{"Name":"phone","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"first_name","WireType":{"Name":"string","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"last_name","WireType":{"Name":"string","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"phone","WireType":{"Name":"phone","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"tax_id","WireType":{"Name":"string","IsArray":false},"ReadOnly":false,"Visibility":""}
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
 * Merchant business information that appears on the invoice.
 */
@Data
@Accessors(chain = true)
public class MerchantInfo {
    
	/**
	* Additional information, such as business hours.
	*/
	@SerializedName("additional_info")
	private String additionalInfo;
    
	/**
	* A label for the `additional_info` field.
	*/
	@SerializedName("additional_info_label")
	private String additionalInfoLabel;
    
	/**
	* The merchant address.
	*/
	@SerializedName("address")
	private CommonAddress address;
    
	/**
	* The merchant company business name.
	*/
	@SerializedName("business_name")
	private String businessName;
    
	/**
	* The merchant email address.
	*/
	@SerializedName("email")
	private String email;
    
	/**
	* The merchant fax number.
	*/
	@SerializedName("fax")
	private Phone fax;
    
	/**
	* The merchant first name.
	*/
	@SerializedName("first_name")
	private String firstName;
    
	/**
	* The merchant last name.
	*/
	@SerializedName("last_name")
	private String lastName;
    
	/**
	* The merchant phone number.
	*/
	@SerializedName("phone")
	private Phone phone;
    
	/**
	* The merchant tax ID.
	*/
	@SerializedName("tax_id")
	private String taxId;
    
	/**
	* The merchant website.
	*/
	@SerializedName("website")
	private String website;
}
