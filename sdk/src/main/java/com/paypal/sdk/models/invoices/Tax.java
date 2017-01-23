// This class was generated on Mon, 23 Jan 2017 15:08:17 PST by version 0.01 of Braintree SDK Generator
// Tax.java
// DO NOT EDIT
// @object tax
// @body {"Name":"amount","WireType":{"Name":"common_currency","IsArray":false},"ReadOnly":true,"Visibility":""}
// @body {"Name":"id","WireType":{"Name":"string","IsArray":false},"ReadOnly":true,"Visibility":""}
// @body {"Name":"name","WireType":{"Name":"string","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"percent","WireType":{"Name":"number","IsArray":false},"ReadOnly":false,"Visibility":""}

package com.paypal.sdk.models.invoices;

import com.paypal.sdk.models.common.*;
import java.util.List;
import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * Tax information.
 */
@Data
@Accessors(chain = true)
public class Tax {
    
	/**
	* The tax, as a monetary amount. Cannot be specified in a request.
	*/
	@Setter(AccessLevel.NONE)
	@SerializedName("amount")
	private CommonCurrency amount;
    
	/**
	* The resource ID.
	*/
	@Setter(AccessLevel.NONE)
	@SerializedName("id")
	private String id;
    
	/**
	* The tax name.
	*/
	@SerializedName("name")
	private String name;
    
	/**
	* The tax rate. Valid value is from 0.001 to 99.999.
	*/
	@SerializedName("percent")
	private double percent;
}
