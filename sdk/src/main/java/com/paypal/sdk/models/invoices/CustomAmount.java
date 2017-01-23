// This class was generated on Mon, 23 Jan 2017 15:08:17 PST by version 0.01 of Braintree SDK Generator
// CustomAmount.java
// DO NOT EDIT
// @object custom_amount
// @body {"Name":"amount","WireType":{"Name":"common_currency","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"label","WireType":{"Name":"string","IsArray":false},"ReadOnly":false,"Visibility":""}

package com.paypal.sdk.models.invoices;

import com.paypal.sdk.models.common.*;
import java.util.List;
import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * The custom amount to apply to an invoice. If you include a label, you must include a custom amount.
 */
@Data
@Accessors(chain = true)
public class CustomAmount {
    
	/**
	* The custom amount value. Valid value is from -999999.99 to 999999.99.
	*/
	@SerializedName("amount")
	private CommonCurrency amount;
    
	/**
	* The custom amount label.
	*/
	@SerializedName("label")
	private String label;
}
