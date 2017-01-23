// This class was generated on Mon, 23 Jan 2017 15:08:17 PST by version 0.01 of Braintree SDK Generator
// TemplateData.java
// DO NOT EDIT
// @object template_data
// @body {"Name":"allow_partial_payment","WireType":{"Name":"boolean","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"attachments","WireType":{"Name":"fileAttachment","IsArray":true},"ReadOnly":false,"Visibility":""}
// @body {"Name":"billing_info","WireType":{"Name":"billing_info","IsArray":true},"ReadOnly":false,"Visibility":""}
// @body {"Name":"cc_info","WireType":{"Name":"string","IsArray":true},"ReadOnly":false,"Visibility":""}
// @body {"Name":"custom","WireType":{"Name":"custom_amount","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"discount","WireType":{"Name":"cost","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"items","WireType":{"Name":"item","IsArray":true},"ReadOnly":false,"Visibility":""}
// @body {"Name":"logo_url","WireType":{"Name":"string","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"merchant_info","WireType":{"Name":"merchant_info","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"merchant_memo","WireType":{"Name":"string","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"minimum_amount_due","WireType":{"Name":"common_currency","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"note","WireType":{"Name":"string","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"payment_term","WireType":{"Name":"payment_term","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"reference","WireType":{"Name":"string","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"shipping_cost","WireType":{"Name":"shipping_cost","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"shipping_info","WireType":{"Name":"shipping_info","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"tax_calculated_after_discount","WireType":{"Name":"boolean","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"tax_inclusive","WireType":{"Name":"boolean","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"terms","WireType":{"Name":"string","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"total_amount","WireType":{"Name":"common_currency","IsArray":false},"ReadOnly":true,"Visibility":""}

package com.paypal.sdk.models.invoices;

import com.paypal.sdk.models.common.*;
import java.util.List;
import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * Template details.
 */
@Data
@Accessors(chain = true)
public class TemplateData {
    
	/**
	* Indicates whether the invoice allows a partial payment. If `false`, invoice must be paid in full. If `true`, the invoice allows partial payments. Default is `false`.
	*/
	@SerializedName("allow_partial_payment")
	private boolean allowPartialPayment;
    
	/**
	* List of files that are attached to the invoice.
	*/
	@SerializedName("attachments")
	private List<FileAttachment> attachments;
    
	/**
	* The required invoice recipient email address and any optional billing information. Supports one recipient only.
	*/
	@SerializedName("billing_info")
	private List<BillingInfo> billingInfo;
    
	/**
	* For invoices sent by email, one or more email addresses to which to send a Cc: copy of the notification. Supports only email addresses under participant.
	*/
	@SerializedName("cc_info")
	private List<String> ccInfo;
    
	@SerializedName("custom")
	private CustomAmount custom;
    
	/**
	* The invoice level discount, as a percent or an amount value.
	*/
	@SerializedName("discount")
	private Cost discount;
    
	/**
	* The list of items to include in the invoice. Each invoice can contain up to 100 items.
	*/
	@SerializedName("items")
	private List<Item> items;
    
	/**
	* The full URL of an external logo image.
	*/
	@SerializedName("logo_url")
	private String logoUrl;
    
	@SerializedName("merchant_info")
	private MerchantInfo merchantInfo;
    
	/**
	* A private bookkeeping memo for the merchant.
	*/
	@SerializedName("merchant_memo")
	private String merchantMemo;
    
	/**
	* The minimum amount allowed for a partial payment. Valid if `allow_partial_payment` is `true`.
	*/
	@SerializedName("minimum_amount_due")
	private CommonCurrency minimumAmountDue;
    
	/**
	* A note to the payer.
	*/
	@SerializedName("note")
	private String note;
    
	@SerializedName("payment_term")
	private PaymentTerm paymentTerm;
    
	/**
	* Reference data, such as PO number, to add to the invoice.
	*/
	@SerializedName("reference")
	private String reference;
    
	@SerializedName("shipping_cost")
	private ShippingCost shippingCost;
    
	@SerializedName("shipping_info")
	private ShippingInfo shippingInfo;
    
	/**
	* Indicates whether the invoice allows a partial payment. If `false`, invoice must be paid in full. If `true`, the invoice allows partial payments. Default is `false`.
	*/
	@SerializedName("tax_calculated_after_discount")
	private boolean taxCalculatedAfterDiscount;
    
	/**
	* Indicates whether the unit price includes tax. Default is `false`.
	*/
	@SerializedName("tax_inclusive")
	private boolean taxInclusive;
    
	/**
	* The general terms of the invoice.
	*/
	@SerializedName("terms")
	private String terms;
    
	@Setter(AccessLevel.NONE)
	@SerializedName("total_amount")
	private CommonCurrency totalAmount;
}
