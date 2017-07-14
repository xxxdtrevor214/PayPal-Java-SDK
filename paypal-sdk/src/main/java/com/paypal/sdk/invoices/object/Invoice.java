// This class was generated on Thu, 13 Jul 2017 09:07:17 PDT by version 0.01 of Braintree SDK Generator
// Invoice.java
// DO NOT EDIT
// @type object
// @json {"Type":"Invoice","VariableName":"","Description":"Invoice details.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":[{"Type":"boolean","VariableName":"allow_partial_payment","Description":"Indicates whether the invoice allows a partial payment. If `false`, invoice must be paid in full. If `true`, the invoice allows partial payments.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"boolean","VariableName":"allow_tip","Description":"Indicates whether the invoice enables the customer to enter a tip amount during payment. If `true`, the invoice shows a tip amount field so that the customer can enter a tip amount. If `false`, the invoice does not show a tip amount field.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"File Attachment","VariableName":"attachments","Description":"List of files that are attached to the invoice.","IsArray":true,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Billing Info","VariableName":"billing_info","Description":"The required invoice recipient email address and any optional billing information. Supports only one recipient.","IsArray":true,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Participant","VariableName":"cc_info","Description":"For invoices sent by email, one or more email addresses to which to send a CC: copy of the notification. Supports only email addresses under participant.","IsArray":true,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Custom Amount","VariableName":"custom","Description":"The custom amount to apply to an invoice. If you include a label, you must include a custom amount.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Cost","VariableName":"discount","Description":"The cost as a percent or an amount value. For example, to specify 10%, enter `10`. Alternatively, to specify an amount of 5, enter `5`.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"id","Description":"The ID of the invoice.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"invoice_date","Description":"The date when the invoice was enabled. The date format is *yyyy*-*MM*-*dd* *z*, as defined in [Internet Date/Time Format](http://tools.ietf.org/html/rfc3339#section-5.6).","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Invoice Item","VariableName":"items","Description":"The items to include in the invoice. An invoice can contain a maximum of 100 items.","IsArray":true,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Link Description Object","VariableName":"links","Description":"The HATEOAS links that provide related actions for the invoice based on the current invoice status.","IsArray":true,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"logo_url","Description":"The full URL to an external logo image.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Merchant Information","VariableName":"merchant_info","Description":"Merchant business information that appears on the invoice.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null},{"Type":"string","VariableName":"merchant_memo","Description":"A private bookkeeping memo for the merchant.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Metadata","VariableName":"metadata","Description":"Audit information for the resource.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Currency","VariableName":"minimum_amount_due","Description":"Base object for all financial value related fields (balance, payment due, etc.)","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"note","Description":"A note to the payer.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"number","Description":"The unique invoice number. If you omit this number, it is auto-incremented from the previous invoice number.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Payment Summary","VariableName":"paid_amount","Description":"The payment and refund summary.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Payment Term","VariableName":"payment_term","Description":"The payment term of the invoice. If you specify `term_type`, you cannot specify `due_date`, and vice versa.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Payment Detail","VariableName":"payments","Description":"List of payment details for the invoice.","IsArray":true,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"reference","Description":"Reference data, such as PO number, to add to the invoice.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Payment Summary","VariableName":"refunded_amount","Description":"The payment and refund summary.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Refund Detail","VariableName":"refunds","Description":"List of refund details for the invoice.","IsArray":true,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Shipping Cost","VariableName":"shipping_cost","Description":"The shipping cost, as a percentage or amount value.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Shipping Info","VariableName":"shipping_info","Description":"The shipping information for the invoice recipient.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"status","Description":"The invoice status. When you [search for invoices](/docs/api/invoicing/#invoices_search), you must specify this value as an array. For example, `\"status\": [\"REFUNDED\"]`.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"boolean","VariableName":"tax_calculated_after_discount","Description":"Indicates whether the tax is calculated before or after a discount. If `false`, the tax is calculated before a discount. If `true`, the tax is calculated after a discount.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"boolean","VariableName":"tax_inclusive","Description":"Indicates whether the unit price includes tax.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"template_id","Description":"The ID of the template from which to create the invoice. Useful for copy functionality.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"terms","Description":"The general terms of the invoice.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Currency","VariableName":"total_amount","Description":"Base object for all financial value related fields (balance, payment due, etc.)","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"uri","Description":"The URI of the invoice.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.invoices.object;

import java.util.Map;
import java.util.List;
import com.google.gson.annotations.SerializedName;
/**
 * Invoice details.
 */
public class Invoice {

	/**
	* Indicates whether the invoice allows a partial payment. If `false`, invoice must be paid in full. If `true`, the invoice allows partial payments.
	*/
	@SerializedName("allow_partial_payment")
	private Boolean allowPartialPayment;

	public Boolean allowPartialPayment() { return allowPartialPayment; }
	
	public Invoice allowPartialPayment(Boolean allowPartialPayment) {
	    this.allowPartialPayment = allowPartialPayment;
	    return this;
	}

	/**
	* Indicates whether the invoice enables the customer to enter a tip amount during payment. If `true`, the invoice shows a tip amount field so that the customer can enter a tip amount. If `false`, the invoice does not show a tip amount field.
	*/
	@SerializedName("allow_tip")
	private Boolean allowTip;

	public Boolean allowTip() { return allowTip; }
	
	public Invoice allowTip(Boolean allowTip) {
	    this.allowTip = allowTip;
	    return this;
	}

	/**
	* List of files that are attached to the invoice.
	*/
	@SerializedName("attachments")
	private List<FileAttachment> attachments;

	public List<FileAttachment> attachments() { return attachments; }
	
	public Invoice attachments(List<FileAttachment> attachments) {
	    this.attachments = attachments;
	    return this;
	}

	/**
	* The required invoice recipient email address and any optional billing information. Supports only one recipient.
	*/
	@SerializedName("billing_info")
	private List<BillingInfo> billingInfo;

	public List<BillingInfo> billingInfo() { return billingInfo; }
	
	public Invoice billingInfo(List<BillingInfo> billingInfo) {
	    this.billingInfo = billingInfo;
	    return this;
	}

	/**
	* For invoices sent by email, one or more email addresses to which to send a CC: copy of the notification. Supports only email addresses under participant.
	*/
	@SerializedName("cc_info")
	private List<Participant> ccInfo;

	public List<Participant> ccInfo() { return ccInfo; }
	
	public Invoice ccInfo(List<Participant> ccInfo) {
	    this.ccInfo = ccInfo;
	    return this;
	}

	/**
	* The custom amount to apply to an invoice. If you include a label, you must include a custom amount.
	*/
	@SerializedName("custom")
	private CustomAmount custom;

	public CustomAmount custom() { return custom; }
	
	public Invoice custom(CustomAmount custom) {
	    this.custom = custom;
	    return this;
	}

	/**
	* The cost as a percent or an amount value. For example, to specify 10%, enter `10`. Alternatively, to specify an amount of 5, enter `5`.
	*/
	@SerializedName("discount")
	private Cost discount;

	public Cost discount() { return discount; }
	
	public Invoice discount(Cost discount) {
	    this.discount = discount;
	    return this;
	}

	/**
	* The ID of the invoice.
	*/
	@SerializedName("id")
	private String id;

	public String id() { return id; }
	
	public Invoice id(String id) {
	    this.id = id;
	    return this;
	}

	/**
	* The date when the invoice was enabled. The date format is *yyyy*-*MM*-*dd* *z*, as defined in [Internet Date/Time Format](http://tools.ietf.org/html/rfc3339#section-5.6).
	*/
	@SerializedName("invoice_date")
	private String invoiceDate;

	public String invoiceDate() { return invoiceDate; }
	
	public Invoice invoiceDate(String invoiceDate) {
	    this.invoiceDate = invoiceDate;
	    return this;
	}

	/**
	* The items to include in the invoice. An invoice can contain a maximum of 100 items.
	*/
	@SerializedName("items")
	private List<InvoiceItem> items;

	public List<InvoiceItem> items() { return items; }
	
	public Invoice items(List<InvoiceItem> items) {
	    this.items = items;
	    return this;
	}

	/**
	* The HATEOAS links that provide related actions for the invoice based on the current invoice status.
	*/
	@SerializedName("links")
	private List<LinkDescriptionObject> links;

	public List<LinkDescriptionObject> links() { return links; }
	
	public Invoice links(List<LinkDescriptionObject> links) {
	    this.links = links;
	    return this;
	}

	/**
	* The full URL to an external logo image.
	*/
	@SerializedName("logo_url")
	private String logoUrl;

	public String logoUrl() { return logoUrl; }
	
	public Invoice logoUrl(String logoUrl) {
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
	
	public Invoice merchantInfo(MerchantInformation merchantInfo) {
	    this.merchantInfo = merchantInfo;
	    return this;
	}

	/**
	* A private bookkeeping memo for the merchant.
	*/
	@SerializedName("merchant_memo")
	private String merchantMemo;

	public String merchantMemo() { return merchantMemo; }
	
	public Invoice merchantMemo(String merchantMemo) {
	    this.merchantMemo = merchantMemo;
	    return this;
	}

	/**
	* Audit information for the resource.
	*/
	@SerializedName("metadata")
	private Metadata metadata;

	public Metadata metadata() { return metadata; }
	
	public Invoice metadata(Metadata metadata) {
	    this.metadata = metadata;
	    return this;
	}

	/**
	* Base object for all financial value related fields (balance, payment due, etc.)
	*/
	@SerializedName("minimum_amount_due")
	private Currency minimumAmountDue;

	public Currency minimumAmountDue() { return minimumAmountDue; }
	
	public Invoice minimumAmountDue(Currency minimumAmountDue) {
	    this.minimumAmountDue = minimumAmountDue;
	    return this;
	}

	/**
	* A note to the payer.
	*/
	@SerializedName("note")
	private String note;

	public String note() { return note; }
	
	public Invoice note(String note) {
	    this.note = note;
	    return this;
	}

	/**
	* The unique invoice number. If you omit this number, it is auto-incremented from the previous invoice number.
	*/
	@SerializedName("number")
	private String number;

	public String number() { return number; }
	
	public Invoice number(String number) {
	    this.number = number;
	    return this;
	}

	/**
	* The payment and refund summary.
	*/
	@SerializedName("paid_amount")
	private PaymentSummary paidAmount;

	public PaymentSummary paidAmount() { return paidAmount; }
	
	public Invoice paidAmount(PaymentSummary paidAmount) {
	    this.paidAmount = paidAmount;
	    return this;
	}

	/**
	* The payment term of the invoice. If you specify `term_type`, you cannot specify `due_date`, and vice versa.
	*/
	@SerializedName("payment_term")
	private PaymentTerm paymentTerm;

	public PaymentTerm paymentTerm() { return paymentTerm; }
	
	public Invoice paymentTerm(PaymentTerm paymentTerm) {
	    this.paymentTerm = paymentTerm;
	    return this;
	}

	/**
	* List of payment details for the invoice.
	*/
	@SerializedName("payments")
	private List<PaymentDetail> payments;

	public List<PaymentDetail> payments() { return payments; }
	
	public Invoice payments(List<PaymentDetail> payments) {
	    this.payments = payments;
	    return this;
	}

	/**
	* Reference data, such as PO number, to add to the invoice.
	*/
	@SerializedName("reference")
	private String reference;

	public String reference() { return reference; }
	
	public Invoice reference(String reference) {
	    this.reference = reference;
	    return this;
	}

	/**
	* The payment and refund summary.
	*/
	@SerializedName("refunded_amount")
	private PaymentSummary refundedAmount;

	public PaymentSummary refundedAmount() { return refundedAmount; }
	
	public Invoice refundedAmount(PaymentSummary refundedAmount) {
	    this.refundedAmount = refundedAmount;
	    return this;
	}

	/**
	* List of refund details for the invoice.
	*/
	@SerializedName("refunds")
	private List<RefundDetail> refunds;

	public List<RefundDetail> refunds() { return refunds; }
	
	public Invoice refunds(List<RefundDetail> refunds) {
	    this.refunds = refunds;
	    return this;
	}

	/**
	* The shipping cost, as a percentage or amount value.
	*/
	@SerializedName("shipping_cost")
	private ShippingCost shippingCost;

	public ShippingCost shippingCost() { return shippingCost; }
	
	public Invoice shippingCost(ShippingCost shippingCost) {
	    this.shippingCost = shippingCost;
	    return this;
	}

	/**
	* The shipping information for the invoice recipient.
	*/
	@SerializedName("shipping_info")
	private ShippingInfo shippingInfo;

	public ShippingInfo shippingInfo() { return shippingInfo; }
	
	public Invoice shippingInfo(ShippingInfo shippingInfo) {
	    this.shippingInfo = shippingInfo;
	    return this;
	}

	/**
	* The invoice status. When you [search for invoices](/docs/api/invoicing/#invoices_search), you must specify this value as an array. For example, `"status": ["REFUNDED"]`.
	*/
	@SerializedName("status")
	private String status;

	public String status() { return status; }
	
	public Invoice status(String status) {
	    this.status = status;
	    return this;
	}

	/**
	* Indicates whether the tax is calculated before or after a discount. If `false`, the tax is calculated before a discount. If `true`, the tax is calculated after a discount.
	*/
	@SerializedName("tax_calculated_after_discount")
	private Boolean taxCalculatedAfterDiscount;

	public Boolean taxCalculatedAfterDiscount() { return taxCalculatedAfterDiscount; }
	
	public Invoice taxCalculatedAfterDiscount(Boolean taxCalculatedAfterDiscount) {
	    this.taxCalculatedAfterDiscount = taxCalculatedAfterDiscount;
	    return this;
	}

	/**
	* Indicates whether the unit price includes tax.
	*/
	@SerializedName("tax_inclusive")
	private Boolean taxInclusive;

	public Boolean taxInclusive() { return taxInclusive; }
	
	public Invoice taxInclusive(Boolean taxInclusive) {
	    this.taxInclusive = taxInclusive;
	    return this;
	}

	/**
	* The ID of the template from which to create the invoice. Useful for copy functionality.
	*/
	@SerializedName("template_id")
	private String templateId;

	public String templateId() { return templateId; }
	
	public Invoice templateId(String templateId) {
	    this.templateId = templateId;
	    return this;
	}

	/**
	* The general terms of the invoice.
	*/
	@SerializedName("terms")
	private String terms;

	public String terms() { return terms; }
	
	public Invoice terms(String terms) {
	    this.terms = terms;
	    return this;
	}

	/**
	* Base object for all financial value related fields (balance, payment due, etc.)
	*/
	@SerializedName("total_amount")
	private Currency totalAmount;

	public Currency totalAmount() { return totalAmount; }
	
	public Invoice totalAmount(Currency totalAmount) {
	    this.totalAmount = totalAmount;
	    return this;
	}

	/**
	* The URI of the invoice.
	*/
	@SerializedName("uri")
	private String uri;

	public String uri() { return uri; }
	
	public Invoice uri(String uri) {
	    this.uri = uri;
	    return this;
	}
}
