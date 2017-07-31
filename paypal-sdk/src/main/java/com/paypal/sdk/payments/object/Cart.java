// This class was generated on Mon, 31 Jul 2017 18:27:14 UTC by version 0.1 of Braintree SDK Generator
// Cart.java
// DO NOT EDIT
// @type object
// @json {"Type":"Cart","VariableName":"","Description":"A cart.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":[{"Type":"Amount","VariableName":"amount","Description":"The payment amount, with break-ups.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null},{"Type":"string","VariableName":"custom","Description":"A free-form field for clients' use.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"description","Description":"The description of what is being paid for.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"invoice_number","Description":"The invoice number to track this payment.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Item list","VariableName":"item_list","Description":"The list of items being paid for.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"note_to_payee","Description":"An optional note to the recipient of the funds in this transaction.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"notify_url","Description":"The URL to send payment notifications.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"order_url","Description":"The URL on the merchant site related to this payment.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Payee","VariableName":"payee","Description":"The payee who receives the funds and fulfills the order.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"payment options","VariableName":"payment_options","Description":"The payment options requested for this transaction.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"purchase_order","Description":"purchase order is number or id specific to this payment","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"reference_id","Description":"Optional. The merchant-provided ID for the purchase unit.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"soft_descriptor","Description":"The soft descriptor that is used when charging this funding source. If the string's length is greater than the maximum allowed length, the string is truncated.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.payments.object;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.serializer.Serializable;
import com.braintreepayments.http.serializer.Deserializable;

/**
 * A cart.
 */
public class Cart implements Serializable, Deserializable {

    // Required default constructor
    public Cart() {}

	/**
	* REQUIRED
	* The payment amount, with break-ups.
	*/
	private Amount amount;

	public Amount amount() { return amount; }
	
	public Cart amount(Amount amount) {
	    this.amount = amount;
	    return this;
	}

	/**
	* A free-form field for clients' use.
	*/
	private String custom;

	public String custom() { return custom; }
	
	public Cart custom(String custom) {
	    this.custom = custom;
	    return this;
	}

	/**
	* The description of what is being paid for.
	*/
	private String description;

	public String description() { return description; }
	
	public Cart description(String description) {
	    this.description = description;
	    return this;
	}

	/**
	* The invoice number to track this payment.
	*/
	private String invoiceNumber;

	public String invoiceNumber() { return invoiceNumber; }
	
	public Cart invoiceNumber(String invoiceNumber) {
	    this.invoiceNumber = invoiceNumber;
	    return this;
	}

	/**
	* The list of items being paid for.
	*/
	private ItemList itemList;

	public ItemList itemList() { return itemList; }
	
	public Cart itemList(ItemList itemList) {
	    this.itemList = itemList;
	    return this;
	}

	/**
	* An optional note to the recipient of the funds in this transaction.
	*/
	private String noteToPayee;

	public String noteToPayee() { return noteToPayee; }
	
	public Cart noteToPayee(String noteToPayee) {
	    this.noteToPayee = noteToPayee;
	    return this;
	}

	/**
	* The URL to send payment notifications.
	*/
	private String notifyUrl;

	public String notifyUrl() { return notifyUrl; }
	
	public Cart notifyUrl(String notifyUrl) {
	    this.notifyUrl = notifyUrl;
	    return this;
	}

	/**
	* The URL on the merchant site related to this payment.
	*/
	private String orderUrl;

	public String orderUrl() { return orderUrl; }
	
	public Cart orderUrl(String orderUrl) {
	    this.orderUrl = orderUrl;
	    return this;
	}

	/**
	* The payee who receives the funds and fulfills the order.
	*/
	private Payee payee;

	public Payee payee() { return payee; }
	
	public Cart payee(Payee payee) {
	    this.payee = payee;
	    return this;
	}

	/**
	* The payment options requested for this transaction.
	*/
	private PaymentOptions paymentOptions;

	public PaymentOptions paymentOptions() { return paymentOptions; }
	
	public Cart paymentOptions(PaymentOptions paymentOptions) {
	    this.paymentOptions = paymentOptions;
	    return this;
	}

	/**
	* purchase order is number or id specific to this payment
	*/
	private String purchaseOrder;

	public String purchaseOrder() { return purchaseOrder; }
	
	public Cart purchaseOrder(String purchaseOrder) {
	    this.purchaseOrder = purchaseOrder;
	    return this;
	}

	/**
	* Optional. The merchant-provided ID for the purchase unit.
	*/
	private String referenceId;

	public String referenceId() { return referenceId; }
	
	public Cart referenceId(String referenceId) {
	    this.referenceId = referenceId;
	    return this;
	}

	/**
	* The soft descriptor that is used when charging this funding source. If the string's length is greater than the maximum allowed length, the string is truncated.
	*/
	private String softDescriptor;

	public String softDescriptor() { return softDescriptor; }
	
	public Cart softDescriptor(String softDescriptor) {
	    this.softDescriptor = softDescriptor;
	    return this;
	}

    @Override
    public void serialize(Map<String, Object> serialized) {
        if (amount != null) {
            serialized.put("amount", this.amount);
        }
        if (custom != null) {
            serialized.put("custom", this.custom);
        }
        if (description != null) {
            serialized.put("description", this.description);
        }
        if (invoiceNumber != null) {
            serialized.put("invoice_number", this.invoiceNumber);
        }
        if (itemList != null) {
            serialized.put("item_list", this.itemList);
        }
        if (noteToPayee != null) {
            serialized.put("note_to_payee", this.noteToPayee);
        }
        if (notifyUrl != null) {
            serialized.put("notify_url", this.notifyUrl);
        }
        if (orderUrl != null) {
            serialized.put("order_url", this.orderUrl);
        }
        if (payee != null) {
            serialized.put("payee", this.payee);
        }
        if (paymentOptions != null) {
            serialized.put("payment_options", this.paymentOptions);
        }
        if (purchaseOrder != null) {
            serialized.put("purchase_order", this.purchaseOrder);
        }
        if (referenceId != null) {
            serialized.put("reference_id", this.referenceId);
        }
        if (softDescriptor != null) {
            serialized.put("soft_descriptor", this.softDescriptor);
        }
    }

    @Override
    public void deserialize(Map<String, Object> values) {
        if (values.containsKey("amount")) {
            this.amount = new Amount();
            this.amount.deserialize((Map<String, Object>) values.get("amount"));
        }
        if (values.containsKey("custom")) {
            this.custom = (String) values.get("custom");
        }
        if (values.containsKey("description")) {
            this.description = (String) values.get("description");
        }
        if (values.containsKey("invoice_number")) {
            this.invoiceNumber = (String) values.get("invoice_number");
        }
        if (values.containsKey("item_list")) {
            this.itemList = new ItemList();
            this.itemList.deserialize((Map<String, Object>) values.get("item_list"));
        }
        if (values.containsKey("note_to_payee")) {
            this.noteToPayee = (String) values.get("note_to_payee");
        }
        if (values.containsKey("notify_url")) {
            this.notifyUrl = (String) values.get("notify_url");
        }
        if (values.containsKey("order_url")) {
            this.orderUrl = (String) values.get("order_url");
        }
        if (values.containsKey("payee")) {
            this.payee = new Payee();
            this.payee.deserialize((Map<String, Object>) values.get("payee"));
        }
        if (values.containsKey("payment_options")) {
            this.paymentOptions = new PaymentOptions();
            this.paymentOptions.deserialize((Map<String, Object>) values.get("payment_options"));
        }
        if (values.containsKey("purchase_order")) {
            this.purchaseOrder = (String) values.get("purchase_order");
        }
        if (values.containsKey("reference_id")) {
            this.referenceId = (String) values.get("reference_id");
        }
        if (values.containsKey("soft_descriptor")) {
            this.softDescriptor = (String) values.get("soft_descriptor");
        }
    }
}

