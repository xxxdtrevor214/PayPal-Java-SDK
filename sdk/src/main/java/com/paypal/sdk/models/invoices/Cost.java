// This class was generated on Mon, 23 Jan 2017 15:08:17 PST by version 0.01 of Braintree SDK Generator
// Cost.java
// DO NOT EDIT
// @object cost
// @body {"Name":"amount","WireType":{"Name":"common_currency","IsArray":false},"ReadOnly":false,"Visibility":""}
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
 * The cost as a percent or an amount value. For example, to specify 10%, enter `10`. Alternatively, to specify an amount of 5, enter `5`.
 */
@Data
@Accessors(chain = true)
public class Cost {
    
	/**
	* The cost, as an amount value. Valid value is from 0 to 1,000,000.
	*/
	@SerializedName("amount")
	private CommonCurrency amount;
    
	/**
	* The cost, as a percent value. Valid value is from 0 to 100.
	*/
	@SerializedName("percent")
	private double percent;
}
