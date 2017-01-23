// This class was generated on Mon, 23 Jan 2017 15:08:17 PST by version 0.01 of Braintree SDK Generator
// PaymentSummary.java
// DO NOT EDIT
// @object payment-summary
// @body {"Name":"other","WireType":{"Name":"common_currency","IsArray":false},"ReadOnly":true,"Visibility":""}
// @body {"Name":"paypal","WireType":{"Name":"common_currency","IsArray":false},"ReadOnly":true,"Visibility":""}

package com.paypal.sdk.models.invoices;

import com.paypal.sdk.models.common.*;
import java.util.List;
import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * The payment and refund summary.
 */
@Data
@Accessors(chain = true)
public class PaymentSummary {
    
	/**
	* The total amount paid or refunded through other sources.
	*/
	@Setter(AccessLevel.NONE)
	@SerializedName("other")
	private CommonCurrency other;
    
	/**
	* The total amount paid or refunded through PayPal.
	*/
	@Setter(AccessLevel.NONE)
	@SerializedName("paypal")
	private CommonCurrency paypal;
}
