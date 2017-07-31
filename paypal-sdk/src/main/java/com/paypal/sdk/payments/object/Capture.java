// This class was generated on Mon, 31 Jul 2017 18:27:14 UTC by version 0.1 of Braintree SDK Generator
// Capture.java
// DO NOT EDIT
// @type object
// @json {"Type":"Capture","VariableName":"","Description":"A capture transaction.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":[{"Type":"Amount","VariableName":"amount","Description":"The payment amount, with break-ups.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"create_time","Description":"The date and time when the capture occurred, in Internet date and time format as defined in [RFC 3339 Section 5.6](http://tools.ietf.org/html/rfc3339#section-5.6).","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"id","Description":"The ID of the capture transaction.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"invoice_number","Description":"The invoice number to track this payment.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"boolean","VariableName":"is_final_capture","Description":"Indicates whether to release all remaining funds that the authorization holds in the funding instrument (FI). Default is `false`.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Link Description Object","VariableName":"links","Description":"","IsArray":true,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"parent_payment","Description":"The ID of the payment on which this transaction is based.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"reason_code","Description":"The reason code that describes why the transaction state is pending or reversed.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"state","Description":"The capture state. Value is:\u003cul\u003e\u003cli\u003e\u003ccode\u003epending\u003c/code\u003e. The capture is pending.\u003c/li\u003e\u003cli\u003e\u003ccode\u003ecompleted\u003c/code\u003e. The capture has successfully completed.\u003c/li\u003e\u003cli\u003e\u003ccode\u003erefunded\u003c/code\u003e. The capture was fully refunded.\u003c/li\u003e\u003cli\u003e\u003ccode\u003epartially_refunded\u003c/code\u003e. The capture was partially refunded.\u003c/li\u003e\u003c/ul\u003e","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Currency","VariableName":"transaction_fee","Description":"Base currency object for all financial value-related fields. For example, balance, payment due, and so on.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"update_time","Description":"The date and time when the resource was last updated, in Internet date and time format as defined in [RFC 3339 Section 5.6](http://tools.ietf.org/html/rfc3339#section-5.6).","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.payments.object;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.serializer.Serializable;
import com.braintreepayments.http.serializer.Deserializable;

/**
 * A capture transaction.
 */
public class Capture implements Serializable, Deserializable {

    // Required default constructor
    public Capture() {}

	/**
	* The payment amount, with break-ups.
	*/
	private Amount amount;

	public Amount amount() { return amount; }
	
	public Capture amount(Amount amount) {
	    this.amount = amount;
	    return this;
	}

	/**
	* The date and time when the capture occurred, in Internet date and time format as defined in [RFC 3339 Section 5.6](http://tools.ietf.org/html/rfc3339#section-5.6).
	*/
	private String createTime;

	public String createTime() { return createTime; }
	
	public Capture createTime(String createTime) {
	    this.createTime = createTime;
	    return this;
	}

	/**
	* The ID of the capture transaction.
	*/
	private String id;

	public String id() { return id; }
	
	public Capture id(String id) {
	    this.id = id;
	    return this;
	}

	/**
	* The invoice number to track this payment.
	*/
	private String invoiceNumber;

	public String invoiceNumber() { return invoiceNumber; }
	
	public Capture invoiceNumber(String invoiceNumber) {
	    this.invoiceNumber = invoiceNumber;
	    return this;
	}

	/**
	* Indicates whether to release all remaining funds that the authorization holds in the funding instrument (FI). Default is `false`.
	*/
	private Boolean isFinalCapture;

	public Boolean isFinalCapture() { return isFinalCapture; }
	
	public Capture isFinalCapture(Boolean isFinalCapture) {
	    this.isFinalCapture = isFinalCapture;
	    return this;
	}

	/**
	*/
	private List<LinkDescriptionObject> links;

	public List<LinkDescriptionObject> links() { return links; }
	
	public Capture links(List<LinkDescriptionObject> links) {
	    this.links = links;
	    return this;
	}

	/**
	* The ID of the payment on which this transaction is based.
	*/
	private String parentPayment;

	public String parentPayment() { return parentPayment; }
	
	public Capture parentPayment(String parentPayment) {
	    this.parentPayment = parentPayment;
	    return this;
	}

	/**
	* The reason code that describes why the transaction state is pending or reversed.
	*/
	private String reasonCode;

	public String reasonCode() { return reasonCode; }
	
	public Capture reasonCode(String reasonCode) {
	    this.reasonCode = reasonCode;
	    return this;
	}

	/**
	* The capture state. Value is:<ul><li><code>pending</code>. The capture is pending.</li><li><code>completed</code>. The capture has successfully completed.</li><li><code>refunded</code>. The capture was fully refunded.</li><li><code>partially_refunded</code>. The capture was partially refunded.</li></ul>
	*/
	private String state;

	public String state() { return state; }
	
	public Capture state(String state) {
	    this.state = state;
	    return this;
	}

	/**
	* Base currency object for all financial value-related fields. For example, balance, payment due, and so on.
	*/
	private Currency transactionFee;

	public Currency transactionFee() { return transactionFee; }
	
	public Capture transactionFee(Currency transactionFee) {
	    this.transactionFee = transactionFee;
	    return this;
	}

	/**
	* The date and time when the resource was last updated, in Internet date and time format as defined in [RFC 3339 Section 5.6](http://tools.ietf.org/html/rfc3339#section-5.6).
	*/
	private String updateTime;

	public String updateTime() { return updateTime; }
	
	public Capture updateTime(String updateTime) {
	    this.updateTime = updateTime;
	    return this;
	}

    @Override
    public void serialize(Map<String, Object> serialized) {
        if (amount != null) {
            serialized.put("amount", this.amount);
        }
        if (createTime != null) {
            serialized.put("create_time", this.createTime);
        }
        if (id != null) {
            serialized.put("id", this.id);
        }
        if (invoiceNumber != null) {
            serialized.put("invoice_number", this.invoiceNumber);
        }
        if (isFinalCapture != null) {
            serialized.put("is_final_capture", this.isFinalCapture);
        }
        if (links != null) {
            serialized.put("links", this.links);
        }
        if (parentPayment != null) {
            serialized.put("parent_payment", this.parentPayment);
        }
        if (reasonCode != null) {
            serialized.put("reason_code", this.reasonCode);
        }
        if (state != null) {
            serialized.put("state", this.state);
        }
        if (transactionFee != null) {
            serialized.put("transaction_fee", this.transactionFee);
        }
        if (updateTime != null) {
            serialized.put("update_time", this.updateTime);
        }
    }

    @Override
    public void deserialize(Map<String, Object> values) {
        if (values.containsKey("amount")) {
            this.amount = new Amount();
            this.amount.deserialize((Map<String, Object>) values.get("amount"));
        }
        if (values.containsKey("create_time")) {
            this.createTime = (String) values.get("create_time");
        }
        if (values.containsKey("id")) {
            this.id = (String) values.get("id");
        }
        if (values.containsKey("invoice_number")) {
            this.invoiceNumber = (String) values.get("invoice_number");
        }
        if (values.containsKey("is_final_capture")) {
            this.isFinalCapture = (Boolean) values.get("is_final_capture");
        }
        if (values.containsKey("links")) {
            this.links = new ArrayList<>();
				List<Map<String, Object>> nestedValues = (List<Map<String, Object>>) values.get("links");
				for (Map<String, Object> nestedValue : nestedValues) {
					LinkDescriptionObject nested = new LinkDescriptionObject();
					nested.deserialize(nestedValue);
					this.links.add(nested);
                }
        }
        if (values.containsKey("parent_payment")) {
            this.parentPayment = (String) values.get("parent_payment");
        }
        if (values.containsKey("reason_code")) {
            this.reasonCode = (String) values.get("reason_code");
        }
        if (values.containsKey("state")) {
            this.state = (String) values.get("state");
        }
        if (values.containsKey("transaction_fee")) {
            this.transactionFee = new Currency();
            this.transactionFee.deserialize((Map<String, Object>) values.get("transaction_fee"));
        }
        if (values.containsKey("update_time")) {
            this.updateTime = (String) values.get("update_time");
        }
    }
}

