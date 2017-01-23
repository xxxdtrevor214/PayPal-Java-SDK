// This class was generated on Mon, 23 Jan 2017 15:08:17 PST by version 0.01 of Braintree SDK Generator
// PaymentDetail.java
// DO NOT EDIT
// @object payment-detail
// @body {"Name":"amount","WireType":{"Name":"common_currency","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"date","WireType":{"Name":"string","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"method","WireType":{"Name":"string","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"note","WireType":{"Name":"string","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"transaction_id","WireType":{"Name":"string","IsArray":false},"ReadOnly":true,"Visibility":""}
// @body {"Name":"transaction_type","WireType":{"Name":"string","IsArray":false},"ReadOnly":true,"Visibility":""}
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
 * Payment details.
 */
@Data
@Accessors(chain = true)
public class PaymentDetail {
    
	/**
	* The payment amount to record against the invoice. If you omit this parameter, records the total invoice amount as paid.
	*/
	@SerializedName("amount")
	private CommonCurrency amount;
    
	/**
	* The date when the invoice was paid. The date format is *yyyy*-*MM*-*dd* *z*, as defined in [Internet Date/Time Format](http://tools.ietf.org/html/rfc3339#section-5.6).
	*/
	@SerializedName("date")
	private String date;
    
	/**
	* An enumeration of the payment modes or methods. Required with the `EXTERNAL` payment type.
	*/
	@SerializedName("method")
	private String method;
    
	/**
	* Optional. A note associated with the payment.
	*/
	@SerializedName("note")
	private String note;
    
	/**
	* The ID for a PayPal payment transaction. Required with the `PAYPAL` payment type.
	*/
	@Setter(AccessLevel.NONE)
	@SerializedName("transaction_id")
	private String transactionId;
    
	/**
	* An enumeration of the transaction types.
	*/
	@Setter(AccessLevel.NONE)
	@SerializedName("transaction_type")
	private String transactionType;
    
	/**
	* An enumeration of the payment types in an invoicing flow. The [record refund](/docs/api/invoicing/#invoices_record-refund) method supports the `EXTERNAL` refund type. The `PAYPAL` refund type is supported for backward compatibility.
	*/
	@Setter(AccessLevel.NONE)
	@SerializedName("type")
	private String type;
}
