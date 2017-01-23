// This class was generated on Mon, 23 Jan 2017 15:08:17 PST by version 0.01 of Braintree SDK Generator
// ShippingCost.java
// DO NOT EDIT
// @object shipping_cost
// @body {"Name":"amount","WireType":{"Name":"common_currency","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"tax","WireType":{"Name":"tax","IsArray":false},"ReadOnly":false,"Visibility":""}

package com.paypal.sdk.models.invoices;

import com.paypal.sdk.models.common.*;
import java.util.List;
import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * The shipping cost, as a percentage or amount value.
 */
@Data
@Accessors(chain = true)
public class ShippingCost {
    
	/**
	* The shipping cost, as an amount value. Valid value is from 0 to 999999.99.
	*/
	@SerializedName("amount")
	private CommonCurrency amount;
    
	/**
	* The tax percentage on the shipping amount.
	*/
	@SerializedName("tax")
	private Tax tax;
}
