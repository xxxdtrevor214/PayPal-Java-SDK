// This class was generated on Mon, 29 Jan 2018 12:12:02 PST by version 0.1.0-dev+ecea6f of Braintree SDK Generator
// Transaction.java
// @version 0.1.0-dev+ecea6f
// @type object
// @data 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
// DO NOT EDIT
package com.paypal.sdk.v1.payments;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * An array of payment-related transactions. A transaction defines what the payment is for and who fulfills the payment.
 */
@Model
public class Transaction {

    // Required default constructor
    public Transaction() {}

	/**
	* REQUIRED
	* The payment amount, with break-ups.
	*/
	@SerializedName("amount")
	private Amount amount;

	public Amount amount() { return amount; }
	
	public Transaction amount(Amount amount) {
	    this.amount = amount;
	    return this;
	}

	/**
	* A free-form field for the client's use.
	*/
	@SerializedName("custom")
	private String custom;

	public String custom() { return custom; }
	
	public Transaction custom(String custom) {
	    this.custom = custom;
	    return this;
	}

	/**
	* The description of the purchase.
	*/
	@SerializedName("description")
	private String description;

	public String description() { return description; }
	
	public Transaction description(String description) {
	    this.description = description;
	    return this;
	}

	/**
	* The invoice number to track this payment.
	*/
	@SerializedName("invoice_number")
	private String invoiceNumber;

	public String invoiceNumber() { return invoiceNumber; }
	
	public Transaction invoiceNumber(String invoiceNumber) {
	    this.invoiceNumber = invoiceNumber;
	    return this;
	}

	/**
	* An array of items that are being purchased.
	*/
	@SerializedName("item_list")
	private ItemList itemList;

	public ItemList itemList() { return itemList; }
	
	public Transaction itemList(ItemList itemList) {
	    this.itemList = itemList;
	    return this;
	}

	/**
	* Optional. A note to the recipient of the funds in this transaction.
	*/
	@SerializedName("note_to_payee")
	private String noteToPayee;

	public String noteToPayee() { return noteToPayee; }
	
	public Transaction noteToPayee(String noteToPayee) {
	    this.noteToPayee = noteToPayee;
	    return this;
	}

	/**
	* The URL to send payment notifications.
	*/
	@SerializedName("notify_url")
	private String notifyUrl;

	public String notifyUrl() { return notifyUrl; }
	
	public Transaction notifyUrl(String notifyUrl) {
	    this.notifyUrl = notifyUrl;
	    return this;
	}

	/**
	* The URL on the merchant site related to this payment.
	*/
	@SerializedName("order_url")
	private String orderUrl;

	public String orderUrl() { return orderUrl; }
	
	public Transaction orderUrl(String orderUrl) {
	    this.orderUrl = orderUrl;
	    return this;
	}

	/**
	* The payee who receives the funds and fulfills the order.
	*/
	@SerializedName("payee")
	private Payee payee;

	public Payee payee() { return payee; }
	
	public Transaction payee(Payee payee) {
	    this.payee = payee;
	    return this;
	}

	/**
	* The payment options requested for this transaction.
	*/
	@SerializedName("payment_options")
	private PaymentOptions paymentOptions;

	public PaymentOptions paymentOptions() { return paymentOptions; }
	
	public Transaction paymentOptions(PaymentOptions paymentOptions) {
	    this.paymentOptions = paymentOptions;
	    return this;
	}

	/**
	* The purchase order number or ID. Identifies this payment.
	*/
	@SerializedName("purchase_order")
	private String purchaseOrder;

	public String purchaseOrder() { return purchaseOrder; }
	
	public Transaction purchaseOrder(String purchaseOrder) {
	    this.purchaseOrder = purchaseOrder;
	    return this;
	}

	/**
	* Optional. The merchant-provided ID for the purchase unit.
	*/
	@SerializedName("reference_id")
	private String referenceId;

	public String referenceId() { return referenceId; }
	
	public Transaction referenceId(String referenceId) {
	    this.referenceId = referenceId;
	    return this;
	}

	/**
	* An array of payment-related transactions. A transaction defines what the payment is for and who fulfills the payment.
	*/
	@SerializedName(value = "related_resources", listClass = RelatedResources.class)
	private List<RelatedResources> relatedResources;

	public List<RelatedResources> relatedResources() { return relatedResources; }
	
	public Transaction relatedResources(List<RelatedResources> relatedResources) {
	    this.relatedResources = relatedResources;
	    return this;
	}

	/**
	* The soft descriptor that is used when charging this funding source. Maximum length is 22 characters. If you include a value that is greater than 22 characters, the API truncates the string.
	*/
	@SerializedName("soft_descriptor")
	private String softDescriptor;

	public String softDescriptor() { return softDescriptor; }
	
	public Transaction softDescriptor(String softDescriptor) {
	    this.softDescriptor = softDescriptor;
	    return this;
	}
}
