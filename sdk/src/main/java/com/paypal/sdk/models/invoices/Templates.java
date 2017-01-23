// This class was generated on Mon, 23 Jan 2017 15:08:17 PST by version 0.01 of Braintree SDK Generator
// Templates.java
// DO NOT EDIT
// @object templates
// @body {"Name":"addresses","WireType":{"Name":"common_address","IsArray":true},"ReadOnly":false,"Visibility":""}
// @body {"Name":"emails","WireType":{"Name":"string","IsArray":true},"ReadOnly":false,"Visibility":""}
// @body {"Name":"phones","WireType":{"Name":"phone","IsArray":true},"ReadOnly":false,"Visibility":""}
// @body {"Name":"templates","WireType":{"Name":"template","IsArray":true},"ReadOnly":false,"Visibility":""}

package com.paypal.sdk.models.invoices;

import com.paypal.sdk.models.common.*;
import java.util.List;
import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * List of merchant templates.
 */
@Data
@Accessors(chain = true)
public class Templates {
    
	/**
	* List of addresses in merchant profile.
	*/
	@SerializedName("addresses")
	private List<CommonAddress> addresses;
    
	/**
	* List of emails in merchant profile.
	*/
	@SerializedName("emails")
	private List<String> emails;
    
	/**
	* List of phone numbers in merchant profile.
	*/
	@SerializedName("phones")
	private List<Phone> phones;
    
	/**
	* An array of templates.
	*/
	@SerializedName("templates")
	private List<Template> templates;
}
