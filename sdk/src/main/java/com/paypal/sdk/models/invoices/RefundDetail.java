// This class was generated on Mon, 23 Jan 2017 15:08:17 PST by version 0.01 of Braintree SDK Generator
// RefundDetail.java
// DO NOT EDIT
// @object refund-detail
// @body {"Name":"amount","WireType":{"Name":"common_currency","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"date","WireType":{"Name":"string","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"note","WireType":{"Name":"string","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"transaction_id","WireType":{"Name":"string","IsArray":false},"ReadOnly":true,"Visibility":""}
// @body {"Name":"type","WireType":{"Name":"string","IsArray":false},"ReadOnly":true,"Visibility":""}

package com.paypal.sdk.models.invoices;

import com.paypal.sdk.models.common.*;
import java.util.List;
import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * Invoicing refund details.
 */
@Data
@Accessors(chain = true)
public class RefundDetail {
    
	/**
	* The amount to record as refunded. If you omit the amount, the total invoice paid amount is recorded as refunded.
	*/
	@SerializedName("amount")
	private CommonCurrency amount;
    
	/**
	* The date when the invoice was refunded. The date format is *yyyy*-*MM*-*dd* *z*, as defined in [Internet Date/Time Format](http://tools.ietf.org/html/rfc3339#section-5.6). For example, `2014-02-27 PST`.
	*/
	@SerializedName("date")
	private String date;
    
	/**
	* A note associated with the refund.
	*/
	@SerializedName("note")
	private String note;
    
	/**
	* The ID of the PayPal refund transaction. Required with the `PAYPAL` refund type.
	*/
	@Setter(AccessLevel.NONE)
	@SerializedName("transaction_id")
	private String transactionId;
    
	/**
	* An enumeration of the PayPal refund types. Indicates whether the refund was paid through PayPal or externally in invoicing flow. The [record refund](/docs/api/invoicing/#invoices_record-refund) method supports the `EXTERNAL` refund type. The `PAYPAL` refund type is supported for backward compatibility.
	*/
	@Setter(AccessLevel.NONE)
	@SerializedName("type")
	private String type;
}
