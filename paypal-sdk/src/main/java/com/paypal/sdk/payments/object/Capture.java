// This class was generated on Mon, 17 Jul 2017 10:51:10 PDT by version 0.01 of Braintree SDK Generator
// Capture.java
// DO NOT EDIT
// @type object
// @json {"Type":"Capture","VariableName":"","Description":"A capture transaction.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":[{"Type":"Amount","VariableName":"amount","Description":"The payment amount, with break-ups.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"create_time","Description":"The date and time when the capture occurred, in Internet date and time format as defined in [RFC 3339 Section 5.6](http://tools.ietf.org/html/rfc3339#section-5.6).","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"id","Description":"The ID of the capture transaction.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"invoice_number","Description":"The invoice number to track this payment.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"boolean","VariableName":"is_final_capture","Description":"Indicates whether to release all remaining funds that the authorization holds in the funding instrument (FI). Default is `false`.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Link Description Object","VariableName":"links","Description":"","IsArray":true,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"parent_payment","Description":"The ID of the payment on which this transaction is based.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"reason_code","Description":"The reason code that describes why the transaction state is pending or reversed.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"state","Description":"The capture state. Value is:\u003cul\u003e\u003cli\u003e\u003ccode\u003epending\u003c/code\u003e. The capture is pending.\u003c/li\u003e\u003cli\u003e\u003ccode\u003ecompleted\u003c/code\u003e. The capture has successfully completed.\u003c/li\u003e\u003cli\u003e\u003ccode\u003erefunded\u003c/code\u003e. The capture was fully refunded.\u003c/li\u003e\u003cli\u003e\u003ccode\u003epartially_refunded\u003c/code\u003e. The capture was partially refunded.\u003c/li\u003e\u003c/ul\u003e","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Currency","VariableName":"transaction_fee","Description":"Base currency object for all financial value-related fields. For example, balance, payment due, and so on.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"update_time","Description":"The date and time when the resource was last updated, in Internet date and time format as defined in [RFC 3339 Section 5.6](http://tools.ietf.org/html/rfc3339#section-5.6).","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.payments.object;

import java.util.Map;
import java.util.List;
import com.google.gson.annotations.SerializedName;
/**
 * A capture transaction.
 */
public class Capture {

	/**
	* The payment amount, with break-ups.
	*/
	@SerializedName("amount")
	private Amount amount;

	public Amount amount() { return amount; }
	
	public Capture amount(Amount amount) {
	    this.amount = amount;
	    return this;
	}

	/**
	* The date and time when the capture occurred, in Internet date and time format as defined in [RFC 3339 Section 5.6](http://tools.ietf.org/html/rfc3339#section-5.6).
	*/
	@SerializedName("create_time")
	private String createTime;

	public String createTime() { return createTime; }
	
	public Capture createTime(String createTime) {
	    this.createTime = createTime;
	    return this;
	}

	/**
	* The ID of the capture transaction.
	*/
	@SerializedName("id")
	private String id;

	public String id() { return id; }
	
	public Capture id(String id) {
	    this.id = id;
	    return this;
	}

	/**
	* The invoice number to track this payment.
	*/
	@SerializedName("invoice_number")
	private String invoiceNumber;

	public String invoiceNumber() { return invoiceNumber; }
	
	public Capture invoiceNumber(String invoiceNumber) {
	    this.invoiceNumber = invoiceNumber;
	    return this;
	}

	/**
	* Indicates whether to release all remaining funds that the authorization holds in the funding instrument (FI). Default is `false`.
	*/
	@SerializedName("is_final_capture")
	private Boolean isFinalCapture;

	public Boolean isFinalCapture() { return isFinalCapture; }
	
	public Capture isFinalCapture(Boolean isFinalCapture) {
	    this.isFinalCapture = isFinalCapture;
	    return this;
	}

	/**
	*/
	@SerializedName("links")
	private List<LinkDescriptionObject> links;

	public List<LinkDescriptionObject> links() { return links; }
	
	public Capture links(List<LinkDescriptionObject> links) {
	    this.links = links;
	    return this;
	}

	/**
	* The ID of the payment on which this transaction is based.
	*/
	@SerializedName("parent_payment")
	private String parentPayment;

	public String parentPayment() { return parentPayment; }
	
	public Capture parentPayment(String parentPayment) {
	    this.parentPayment = parentPayment;
	    return this;
	}

	/**
	* The reason code that describes why the transaction state is pending or reversed.
	*/
	@SerializedName("reason_code")
	private String reasonCode;

	public String reasonCode() { return reasonCode; }
	
	public Capture reasonCode(String reasonCode) {
	    this.reasonCode = reasonCode;
	    return this;
	}

	/**
	* The capture state. Value is:<ul><li><code>pending</code>. The capture is pending.</li><li><code>completed</code>. The capture has successfully completed.</li><li><code>refunded</code>. The capture was fully refunded.</li><li><code>partially_refunded</code>. The capture was partially refunded.</li></ul>
	*/
	@SerializedName("state")
	private String state;

	public String state() { return state; }
	
	public Capture state(String state) {
	    this.state = state;
	    return this;
	}

	/**
	* Base currency object for all financial value-related fields. For example, balance, payment due, and so on.
	*/
	@SerializedName("transaction_fee")
	private Currency transactionFee;

	public Currency transactionFee() { return transactionFee; }
	
	public Capture transactionFee(Currency transactionFee) {
	    this.transactionFee = transactionFee;
	    return this;
	}

	/**
	* The date and time when the resource was last updated, in Internet date and time format as defined in [RFC 3339 Section 5.6](http://tools.ietf.org/html/rfc3339#section-5.6).
	*/
	@SerializedName("update_time")
	private String updateTime;

	public String updateTime() { return updateTime; }
	
	public Capture updateTime(String updateTime) {
	    this.updateTime = updateTime;
	    return this;
	}
}
