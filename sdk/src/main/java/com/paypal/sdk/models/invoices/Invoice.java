// This class was generated on Mon, 23 Jan 2017 15:08:17 PST by version 0.01 of Braintree SDK Generator
// Invoice.java
// DO NOT EDIT
// @object invoice
// @body {"Name":"additional_data","WireType":{"Name":"string","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"allow_partial_payment","WireType":{"Name":"boolean","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"attachments","WireType":{"Name":"fileAttachment","IsArray":true},"ReadOnly":false,"Visibility":""}
// @body {"Name":"billing_info","WireType":{"Name":"billing_info","IsArray":true},"ReadOnly":false,"Visibility":""}
// @body {"Name":"cc_info","WireType":{"Name":"participant","IsArray":true},"ReadOnly":false,"Visibility":""}
// @body {"Name":"custom","WireType":{"Name":"custom_amount","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"discount","WireType":{"Name":"cost","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"gratuity","WireType":{"Name":"common_currency","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"id","WireType":{"Name":"string","IsArray":false},"ReadOnly":true,"Visibility":""}
// @body {"Name":"invoice_date","WireType":{"Name":"string","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"items","WireType":{"Name":"item","IsArray":true},"ReadOnly":false,"Visibility":""}
// @body {"Name":"logo_url","WireType":{"Name":"string","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"merchant_info","WireType":{"Name":"merchant_info","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"merchant_memo","WireType":{"Name":"string","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"metadata","WireType":{"Name":"metadata","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"minimum_amount_due","WireType":{"Name":"common_currency","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"note","WireType":{"Name":"string","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"number","WireType":{"Name":"string","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"paid_amount","WireType":{"Name":"payment-summary","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"payment_term","WireType":{"Name":"payment_term","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"payments","WireType":{"Name":"payment-detail","IsArray":true},"ReadOnly":true,"Visibility":""}
// @body {"Name":"reference","WireType":{"Name":"string","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"refunded_amount","WireType":{"Name":"payment-summary","IsArray":false},"ReadOnly":true,"Visibility":""}
// @body {"Name":"refunds","WireType":{"Name":"refund-detail","IsArray":true},"ReadOnly":true,"Visibility":""}
// @body {"Name":"shipping_cost","WireType":{"Name":"shipping_cost","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"shipping_info","WireType":{"Name":"shipping_info","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"status","WireType":{"Name":"string","IsArray":false},"ReadOnly":true,"Visibility":""}
// @body {"Name":"tax_calculated_after_discount","WireType":{"Name":"boolean","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"tax_inclusive","WireType":{"Name":"boolean","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"template_id","WireType":{"Name":"string","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"terms","WireType":{"Name":"string","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"total_amount","WireType":{"Name":"common_currency","IsArray":false},"ReadOnly":true,"Visibility":""}
// @body {"Name":"uri","WireType":{"Name":"string","IsArray":false},"ReadOnly":true,"Visibility":""}

package com.paypal.sdk.models.invoices;

import com.paypal.sdk.models.common.*;
import java.util.List;
import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * Invoice details.
 */
@Data
@Accessors(chain = true)
public class Invoice {
    
	/**
	* Any miscellaneous invoice data.
	*/
	@SerializedName("additional_data")
	private String additionalData;
    
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
	* The required invoice recipient email address and any optional billing information. Supports only one recipient.
	*/
	@SerializedName("billing_info")
	private List<BillingInfo> billingInfo;
    
	/**
	* For invoices sent by email, one or more email addresses to which to send a Cc: copy of the notification. Supports only email addresses under participant.
	*/
	@SerializedName("cc_info")
	private List<Participant> ccInfo;
    
	@SerializedName("custom")
	private CustomAmount custom;
    
	/**
	* The invoice level discount, as a percent or an amount value.
	*/
	@SerializedName("discount")
	private Cost discount;
    
	@SerializedName("gratuity")
	private CommonCurrency gratuity;
    
	/**
	* The ID of the invoice.
	*/
	@Setter(AccessLevel.NONE)
	@SerializedName("id")
	private String id;
    
	/**
	* The date when the invoice was enabled. The date format is *yyyy*-*MM*-*dd* *z*, as defined in [Internet Date/Time Format](http://tools.ietf.org/html/rfc3339#section-5.6).
	*/
	@SerializedName("invoice_date")
	private String invoiceDate;
    
	/**
	* The items to include in the invoice. An invoice can contain a maximum of 100 items.
	*/
	@SerializedName("items")
	private List<Item> items;
    
	/**
	* The full URL to an external logo image.
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
    
	@SerializedName("metadata")
	private Metadata metadata;
    
	/**
	* The minimum amount allowed for a partial payment. Required if `allow_partial_payment` is `true`.
	*/
	@SerializedName("minimum_amount_due")
	private CommonCurrency minimumAmountDue;
    
	/**
	* A note to the payer.
	*/
	@SerializedName("note")
	private String note;
    
	/**
	* The unique invoice number. If you omit this number, it is auto-incremented from the previous invoice number.
	*/
	@SerializedName("number")
	private String number;
    
	@SerializedName("paid_amount")
	private PaymentSummary paidAmount;
    
	@SerializedName("payment_term")
	private PaymentTerm paymentTerm;
    
	/**
	* List of payment details for the invoice.
	*/
	@Setter(AccessLevel.NONE)
	@SerializedName("payments")
	private List<PaymentDetail> payments;
    
	/**
	* Reference data, such as PO number, to add to the invoice.
	*/
	@SerializedName("reference")
	private String reference;
    
	/**
	* Payment summary of the invoice, including amount refunded through PayPal and other sources.
	*/
	@Setter(AccessLevel.NONE)
	@SerializedName("refunded_amount")
	private PaymentSummary refundedAmount;
    
	/**
	* List of refund details for the invoice.
	*/
	@Setter(AccessLevel.NONE)
	@SerializedName("refunds")
	private List<RefundDetail> refunds;
    
	@SerializedName("shipping_cost")
	private ShippingCost shippingCost;
    
	@SerializedName("shipping_info")
	private ShippingInfo shippingInfo;
    
	/**
	* An enumeration of the invoice statuses.
	*/
	@Setter(AccessLevel.NONE)
	@SerializedName("status")
	private String status;
    
	/**
	* Indicates whether the tax is calculated before or after a discount. If `false`, the tax is calculated before a discount. If `true`, the tax is calculated after a discount. Default is `false`.
	*/
	@SerializedName("tax_calculated_after_discount")
	private boolean taxCalculatedAfterDiscount;
    
	/**
	* Indicates whether the unit price includes tax. Default is `false`.
	*/
	@SerializedName("tax_inclusive")
	private boolean taxInclusive;
    
	/**
	* The ID of the template from which to create the invoice. Useful for copy functionality.
	*/
	@SerializedName("template_id")
	private String templateId;
    
	/**
	* The general terms of the invoice.
	*/
	@SerializedName("terms")
	private String terms;
    
	/**
	* The total amount of the invoice.
	*/
	@Setter(AccessLevel.NONE)
	@SerializedName("total_amount")
	private CommonCurrency totalAmount;
    
	/**
	* The URI of the invoice.
	*/
	@Setter(AccessLevel.NONE)
	@SerializedName("uri")
	private String uri;
}
