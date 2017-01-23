// This class was generated on Mon, 23 Jan 2017 15:08:17 PST by version 0.01 of Braintree SDK Generator
// Phone.java
// DO NOT EDIT
// @object phone
// @body {"Name":"country_code","WireType":{"Name":"string","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"national_number","WireType":{"Name":"string","IsArray":false},"ReadOnly":false,"Visibility":""}

package com.paypal.sdk.models.invoices;

import com.paypal.sdk.models.common.*;
import java.util.List;
import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * The phone number.
 */
@Data
@Accessors(chain = true)
public class Phone {
    
	/**
	* The country calling code (CC), as defined by E.164. The maximum combined length of CC+national is 15 digits.
	*/
	@SerializedName("country_code")
	private String countryCode;
    
	/**
	* The national number, as defined by E.164. A national number consists of national destination code (NDC) and subscriber number (SN). The maximum combined length of CC+national is 15 digits.
	*/
	@SerializedName("national_number")
	private String nationalNumber;
}
