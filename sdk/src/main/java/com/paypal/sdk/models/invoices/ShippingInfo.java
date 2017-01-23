// This class was generated on Mon, 23 Jan 2017 15:08:17 PST by version 0.01 of Braintree SDK Generator
// ShippingInfo.java
// DO NOT EDIT
// @object shipping_info
// @body {"Name":"address","WireType":{"Name":"common_address","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"business_name","WireType":{"Name":"string","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"first_name","WireType":{"Name":"string","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"last_name","WireType":{"Name":"string","IsArray":false},"ReadOnly":false,"Visibility":""}

package com.paypal.sdk.models.invoices;

import com.paypal.sdk.models.common.*;
import java.util.List;
import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * The shipping information for the invoice recipient.
 */
@Data
@Accessors(chain = true)
public class ShippingInfo {
    
	/**
	* The invoice recipient address.
	*/
	@SerializedName("address")
	private CommonAddress address;
    
	/**
	* The invoice recipient company business name.
	*/
	@SerializedName("business_name")
	private String businessName;
    
	/**
	* The invoice recipient first name.
	*/
	@SerializedName("first_name")
	private String firstName;
    
	/**
	* The invoice recipient last name.
	*/
	@SerializedName("last_name")
	private String lastName;
}
