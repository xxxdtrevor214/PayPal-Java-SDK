// This class was generated on Mon, 23 Jan 2017 15:08:17 PST by version 0.01 of Braintree SDK Generator
// CommonCurrency.java
// DO NOT EDIT
// @object common_currency
// @body {"Name":"currency","WireType":{"Name":"string","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"value","WireType":{"Name":"string","IsArray":false},"ReadOnly":false,"Visibility":""}

package com.paypal.sdk.models.common;

import com.paypal.sdk.models.common.*;
import java.util.List;
import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * The base object for all financial value-related fields. For example, balance, payment due, and so on.
 */
@Data
@Accessors(chain = true)
public class CommonCurrency {
    
	/**
	* The three-letter [ISO 4217](http://www.iso.org/iso/home/standards/currency_codes.htm) alphabetic currency code.
	*/
	@SerializedName("currency")
	private String currency;
    
	/**
	* The amount up to *N* digits after the decimal separator, as defined in [ISO 4217](http://www.iso.org/iso/home/standards/currency_codes.htm) for the appropriate currency code.
	*/
	@SerializedName("value")
	private String value;
}
