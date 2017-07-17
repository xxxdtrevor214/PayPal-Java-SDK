// This class was generated on Mon, 17 Jul 2017 10:41:00 PDT by version 0.01 of Braintree SDK Generator
// TemplateData.java
// DO NOT EDIT
// @type object
// @json {"Type":"Template Data","VariableName":"","Description":"Template data.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":[{"Type":"boolean","VariableName":"allow_partial_payment","Description":"Indicates whether the invoice allows a partial payment. If `false`, invoice must be paid in full. If `true`, the invoice allows partial payments.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"File Attachment","VariableName":"attachments","Description":"List of files that are attached to the invoice.","IsArray":true,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Billing Info","VariableName":"billing_info","Description":"The required invoice recipient email address and any optional billing information. Supports one recipient only.","IsArray":true,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"cc_info","Description":"For invoices sent by email, one or more email addresses to which to send a CC: copy of the notification. Supports only email addresses under participant.","IsArray":true,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Custom Amount","VariableName":"custom","Description":"The custom amount to apply to an invoice. If you include a label, you must include a custom amount.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Cost","VariableName":"discount","Description":"The cost as a percent or an amount value. For example, to specify 10%, enter `10`. Alternatively, to specify an amount of 5, enter `5`.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Invoice Item","VariableName":"items","Description":"The list of items to include in the invoice. Each invoice can contain up to 100 items.","IsArray":true,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"logo_url","Description":"The full URL of an external logo image.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Merchant Information","VariableName":"merchant_info","Description":"Merchant business information that appears on the invoice.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null},{"Type":"string","VariableName":"merchant_memo","Description":"A private bookkeeping memo for the merchant.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Currency","VariableName":"minimum_amount_due","Description":"Base object for all financial value related fields (balance, payment due, etc.)","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"note","Description":"A note to the payer.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Payment Term","VariableName":"payment_term","Description":"The payment term of the invoice. If you specify `term_type`, you cannot specify `due_date`, and vice versa.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"reference","Description":"Reference data, such as PO number, to add to the invoice.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Shipping Cost","VariableName":"shipping_cost","Description":"The shipping cost, as a percentage or amount value.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Shipping Info","VariableName":"shipping_info","Description":"The shipping information for the invoice recipient.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"boolean","VariableName":"tax_calculated_after_discount","Description":"Indicates whether the invoice allows a partial payment. If `false`, invoice must be paid in full. If `true`, the invoice allows partial payments.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"boolean","VariableName":"tax_inclusive","Description":"Indicates whether the unit price includes tax.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"terms","Description":"The general terms of the invoice.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Currency","VariableName":"total_amount","Description":"Base object for all financial value related fields (balance, payment due, etc.)","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.invoices.object;

import java.util.Map;
import java.util.List;
import com.google.gson.annotations.SerializedName;
/**
 * Template data.
 */
public class TemplateData {

	/**
	* Indicates whether the invoice allows a partial payment. If `false`, invoice must be paid in full. If `true`, the invoice allows partial payments.
	*/
	@SerializedName("allow_partial_payment")
	private Boolean allowPartialPayment;

	public Boolean allowPartialPayment() { return allowPartialPayment; }
	
	public TemplateData allowPartialPayment(Boolean allowPartialPayment) {
	    this.allowPartialPayment = allowPartialPayment;
	    return this;
	}

	/**
	* List of files that are attached to the invoice.
	*/
	@SerializedName("attachments")
	private List<FileAttachment> attachments;

	public List<FileAttachment> attachments() { return attachments; }
	
	public TemplateData attachments(List<FileAttachment> attachments) {
	    this.attachments = attachments;
	    return this;
	}

	/**
	* The required invoice recipient email address and any optional billing information. Supports one recipient only.
	*/
	@SerializedName("billing_info")
	private List<BillingInfo> billingInfo;

	public List<BillingInfo> billingInfo() { return billingInfo; }
	
	public TemplateData billingInfo(List<BillingInfo> billingInfo) {
	    this.billingInfo = billingInfo;
	    return this;
	}

	/**
	* For invoices sent by email, one or more email addresses to which to send a CC: copy of the notification. Supports only email addresses under participant.
	*/
	@SerializedName("cc_info")
	private List<String> ccInfo;

	public List<String> ccInfo() { return ccInfo; }
	
	public TemplateData ccInfo(List<String> ccInfo) {
	    this.ccInfo = ccInfo;
	    return this;
	}

	/**
	* The custom amount to apply to an invoice. If you include a label, you must include a custom amount.
	*/
	@SerializedName("custom")
	private CustomAmount custom;

	public CustomAmount custom() { return custom; }
	
	public TemplateData custom(CustomAmount custom) {
	    this.custom = custom;
	    return this;
	}

	/**
	* The cost as a percent or an amount value. For example, to specify 10%, enter `10`. Alternatively, to specify an amount of 5, enter `5`.
	*/
	@SerializedName("discount")
	private Cost discount;

	public Cost discount() { return discount; }
	
	public TemplateData discount(Cost discount) {
	    this.discount = discount;
	    return this;
	}

	/**
	* The list of items to include in the invoice. Each invoice can contain up to 100 items.
	*/
	@SerializedName("items")
	private List<InvoiceItem> items;

	public List<InvoiceItem> items() { return items; }
	
	public TemplateData items(List<InvoiceItem> items) {
	    this.items = items;
	    return this;
	}

	/**
	* The full URL of an external logo image.
	*/
	@SerializedName("logo_url")
	private String logoUrl;

	public String logoUrl() { return logoUrl; }
	
	public TemplateData logoUrl(String logoUrl) {
	    this.logoUrl = logoUrl;
	    return this;
	}

	/**
	* REQUIRED
	* Merchant business information that appears on the invoice.
	*/
	@SerializedName("merchant_info")
	private MerchantInformation merchantInfo;

	public MerchantInformation merchantInfo() { return merchantInfo; }
	
	public TemplateData merchantInfo(MerchantInformation merchantInfo) {
	    this.merchantInfo = merchantInfo;
	    return this;
	}

	/**
	* A private bookkeeping memo for the merchant.
	*/
	@SerializedName("merchant_memo")
	private String merchantMemo;

	public String merchantMemo() { return merchantMemo; }
	
	public TemplateData merchantMemo(String merchantMemo) {
	    this.merchantMemo = merchantMemo;
	    return this;
	}

	/**
	* Base object for all financial value related fields (balance, payment due, etc.)
	*/
	@SerializedName("minimum_amount_due")
	private Currency minimumAmountDue;

	public Currency minimumAmountDue() { return minimumAmountDue; }
	
	public TemplateData minimumAmountDue(Currency minimumAmountDue) {
	    this.minimumAmountDue = minimumAmountDue;
	    return this;
	}

	/**
	* A note to the payer.
	*/
	@SerializedName("note")
	private String note;

	public String note() { return note; }
	
	public TemplateData note(String note) {
	    this.note = note;
	    return this;
	}

	/**
	* The payment term of the invoice. If you specify `term_type`, you cannot specify `due_date`, and vice versa.
	*/
	@SerializedName("payment_term")
	private PaymentTerm paymentTerm;

	public PaymentTerm paymentTerm() { return paymentTerm; }
	
	public TemplateData paymentTerm(PaymentTerm paymentTerm) {
	    this.paymentTerm = paymentTerm;
	    return this;
	}

	/**
	* Reference data, such as PO number, to add to the invoice.
	*/
	@SerializedName("reference")
	private String reference;

	public String reference() { return reference; }
	
	public TemplateData reference(String reference) {
	    this.reference = reference;
	    return this;
	}

	/**
	* The shipping cost, as a percentage or amount value.
	*/
	@SerializedName("shipping_cost")
	private ShippingCost shippingCost;

	public ShippingCost shippingCost() { return shippingCost; }
	
	public TemplateData shippingCost(ShippingCost shippingCost) {
	    this.shippingCost = shippingCost;
	    return this;
	}

	/**
	* The shipping information for the invoice recipient.
	*/
	@SerializedName("shipping_info")
	private ShippingInfo shippingInfo;

	public ShippingInfo shippingInfo() { return shippingInfo; }
	
	public TemplateData shippingInfo(ShippingInfo shippingInfo) {
	    this.shippingInfo = shippingInfo;
	    return this;
	}

	/**
	* Indicates whether the invoice allows a partial payment. If `false`, invoice must be paid in full. If `true`, the invoice allows partial payments.
	*/
	@SerializedName("tax_calculated_after_discount")
	private Boolean taxCalculatedAfterDiscount;

	public Boolean taxCalculatedAfterDiscount() { return taxCalculatedAfterDiscount; }
	
	public TemplateData taxCalculatedAfterDiscount(Boolean taxCalculatedAfterDiscount) {
	    this.taxCalculatedAfterDiscount = taxCalculatedAfterDiscount;
	    return this;
	}

	/**
	* Indicates whether the unit price includes tax.
	*/
	@SerializedName("tax_inclusive")
	private Boolean taxInclusive;

	public Boolean taxInclusive() { return taxInclusive; }
	
	public TemplateData taxInclusive(Boolean taxInclusive) {
	    this.taxInclusive = taxInclusive;
	    return this;
	}

	/**
	* The general terms of the invoice.
	*/
	@SerializedName("terms")
	private String terms;

	public String terms() { return terms; }
	
	public TemplateData terms(String terms) {
	    this.terms = terms;
	    return this;
	}

	/**
	* Base object for all financial value related fields (balance, payment due, etc.)
	*/
	@SerializedName("total_amount")
	private Currency totalAmount;

	public Currency totalAmount() { return totalAmount; }
	
	public TemplateData totalAmount(Currency totalAmount) {
	    this.totalAmount = totalAmount;
	    return this;
	}
}
