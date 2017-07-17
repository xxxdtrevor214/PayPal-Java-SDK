// This class was generated on Mon, 17 Jul 2017 10:51:10 PDT by version 0.01 of Braintree SDK Generator
// Refund.java
// DO NOT EDIT
// @type object
// @json {"Type":"Refund","VariableName":"","Description":"A refund transaction.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":[{"Type":"Amount","VariableName":"amount","Description":"The payment amount, with break-ups.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"capture_id","Description":"The ID of the sale transaction being refunded.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"create_time","Description":"The date and time when the refund was created, in [Internet date and time format](http://tools.ietf.org/html/rfc3339#section-5.6).","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"description","Description":"The refund description.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"id","Description":"The ID of the refund transaction. Maximum length is 17 characters.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"invoice_number","Description":"Your own invoice or tracking ID number. Maximum length is 127 single-byte alphanumeric characters.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Link Description Object","VariableName":"links","Description":"","IsArray":true,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"parent_payment","Description":"The ID of the payment on which this transaction is based.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"reason","Description":"The reason that the transaction is being refunded.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"reason_code","Description":"The reason code for the pending refund state.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"refund_funding_type","Description":"Details Indicate whether Refund amount is funded by Payee or other funding accounts","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"refund_reason_code","Description":"Paypal assigned reason codes for the refund","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"sale_id","Description":"The ID of the sale transaction being refunded. ","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"state","Description":"The state of the refund.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"update_time","Description":"The date and time when the resource was last updated, in [Internet date and time format](http://tools.ietf.org/html/rfc3339#section-5.6).","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.payments.object;

import java.util.Map;
import java.util.List;
import com.google.gson.annotations.SerializedName;
/**
 * A refund transaction.
 */
public class Refund {

	/**
	* The payment amount, with break-ups.
	*/
	@SerializedName("amount")
	private Amount amount;

	public Amount amount() { return amount; }
	
	public Refund amount(Amount amount) {
	    this.amount = amount;
	    return this;
	}

	/**
	* The ID of the sale transaction being refunded.
	*/
	@SerializedName("capture_id")
	private String captureId;

	public String captureId() { return captureId; }
	
	public Refund captureId(String captureId) {
	    this.captureId = captureId;
	    return this;
	}

	/**
	* The date and time when the refund was created, in [Internet date and time format](http://tools.ietf.org/html/rfc3339#section-5.6).
	*/
	@SerializedName("create_time")
	private String createTime;

	public String createTime() { return createTime; }
	
	public Refund createTime(String createTime) {
	    this.createTime = createTime;
	    return this;
	}

	/**
	* The refund description.
	*/
	@SerializedName("description")
	private String description;

	public String description() { return description; }
	
	public Refund description(String description) {
	    this.description = description;
	    return this;
	}

	/**
	* The ID of the refund transaction. Maximum length is 17 characters.
	*/
	@SerializedName("id")
	private String id;

	public String id() { return id; }
	
	public Refund id(String id) {
	    this.id = id;
	    return this;
	}

	/**
	* Your own invoice or tracking ID number. Maximum length is 127 single-byte alphanumeric characters.
	*/
	@SerializedName("invoice_number")
	private String invoiceNumber;

	public String invoiceNumber() { return invoiceNumber; }
	
	public Refund invoiceNumber(String invoiceNumber) {
	    this.invoiceNumber = invoiceNumber;
	    return this;
	}

	/**
	*/
	@SerializedName("links")
	private List<LinkDescriptionObject> links;

	public List<LinkDescriptionObject> links() { return links; }
	
	public Refund links(List<LinkDescriptionObject> links) {
	    this.links = links;
	    return this;
	}

	/**
	* The ID of the payment on which this transaction is based.
	*/
	@SerializedName("parent_payment")
	private String parentPayment;

	public String parentPayment() { return parentPayment; }
	
	public Refund parentPayment(String parentPayment) {
	    this.parentPayment = parentPayment;
	    return this;
	}

	/**
	* The reason that the transaction is being refunded.
	*/
	@SerializedName("reason")
	private String reason;

	public String reason() { return reason; }
	
	public Refund reason(String reason) {
	    this.reason = reason;
	    return this;
	}

	/**
	* The reason code for the pending refund state.
	*/
	@SerializedName("reason_code")
	private String reasonCode;

	public String reasonCode() { return reasonCode; }
	
	public Refund reasonCode(String reasonCode) {
	    this.reasonCode = reasonCode;
	    return this;
	}

	/**
	* Details Indicate whether Refund amount is funded by Payee or other funding accounts
	*/
	@SerializedName("refund_funding_type")
	private String refundFundingType;

	public String refundFundingType() { return refundFundingType; }
	
	public Refund refundFundingType(String refundFundingType) {
	    this.refundFundingType = refundFundingType;
	    return this;
	}

	/**
	* Paypal assigned reason codes for the refund
	*/
	@SerializedName("refund_reason_code")
	private String refundReasonCode;

	public String refundReasonCode() { return refundReasonCode; }
	
	public Refund refundReasonCode(String refundReasonCode) {
	    this.refundReasonCode = refundReasonCode;
	    return this;
	}

	/**
	* The ID of the sale transaction being refunded. 
	*/
	@SerializedName("sale_id")
	private String saleId;

	public String saleId() { return saleId; }
	
	public Refund saleId(String saleId) {
	    this.saleId = saleId;
	    return this;
	}

	/**
	* The state of the refund.
	*/
	@SerializedName("state")
	private String state;

	public String state() { return state; }
	
	public Refund state(String state) {
	    this.state = state;
	    return this;
	}

	/**
	* The date and time when the resource was last updated, in [Internet date and time format](http://tools.ietf.org/html/rfc3339#section-5.6).
	*/
	@SerializedName("update_time")
	private String updateTime;

	public String updateTime() { return updateTime; }
	
	public Refund updateTime(String updateTime) {
	    this.updateTime = updateTime;
	    return this;
	}
}
