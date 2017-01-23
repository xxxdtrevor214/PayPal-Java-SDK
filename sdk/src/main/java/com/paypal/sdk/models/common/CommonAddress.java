// This class was generated on Mon, 23 Jan 2017 15:08:17 PST by version 0.01 of Braintree SDK Generator
// CommonAddress.java
// DO NOT EDIT
// @object common_address
// @body {"Name":"city","WireType":{"Name":"string","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"country_code","WireType":{"Name":"string","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"line1","WireType":{"Name":"string","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"line2","WireType":{"Name":"string","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"phone","WireType":{"Name":"string","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"postal_code","WireType":{"Name":"string","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"state","WireType":{"Name":"string","IsArray":false},"ReadOnly":false,"Visibility":""}

package com.paypal.sdk.models.common;

import com.paypal.sdk.models.common.*;
import java.util.List;
import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * Base address to use as billing address in a payment or to extend a shipping address.
 */
@Data
@Accessors(chain = true)
public class CommonAddress {
    
	/**
	* The city name.
	*/
	@SerializedName("city")
	private String city;
    
	/**
	* The two-letter code for a US state. Use the equivalent for other countries.
	*/
	@SerializedName("country_code")
	private String countryCode;
    
	/**
	* The first line of the address. For example, number, street, and so on.
	*/
	@SerializedName("line1")
	private String line1;
    
	/**
	* Optional. The second line of the address. For example, suite, apt number, and so on.
	*/
	@SerializedName("line2")
	private String line2;
    
	/**
	* A phone number. Must be represented in its canonical international format, as defined by the E.164 numbering plan.
	*/
	@SerializedName("phone")
	private String phone;
    
	/**
	* The postal code, which is the zip code or equivalent. Typically required for countries with postal codes. For countries that have postal codes or an equivalent, see [Postal code](http://en.wikipedia.org/wiki/Postal_code).
	*/
	@SerializedName("postal_code")
	private String postalCode;
    
	/**
	* The [two-character ISO 3166-1 code](https://developer.paypal.com/docs/classic/api/country_codes/) that identifies the country or region.<blockquote><strong>Note:</strong> The country code for Great Britain is `GB` and not `UK` as is used in that country's top-level domain names. Use the `C2` country code for `CHINA WORLDWIDE` (for CUP, bank card, and cross-border transactions).</blockquote>
	*/
	@SerializedName("state")
	private String state;
}
