// This class was generated on Mon, 29 Jan 2018 12:12:02 PST by version 0.1.0-dev+ecea6f of Braintree SDK Generator
// DetailedRefund.java
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
 * The refund transaction details that are returned by the `POST /refund` call.
 */
@Model
public class DetailedRefund {

    // Required default constructor
    public DetailedRefund() {}

	/**
	* The payment amount, with break-ups.
	*/
	@SerializedName("amount")
	private Amount amount;

	public Amount amount() { return amount; }
	
	public DetailedRefund amount(Amount amount) {
	    this.amount = amount;
	    return this;
	}

	/**
	* The ID of the sale transaction being refunded.
	*/
	@SerializedName("capture_id")
	private String captureId;

	public String captureId() { return captureId; }
	
	public DetailedRefund captureId(String captureId) {
	    this.captureId = captureId;
	    return this;
	}

	/**
	* The date and time when the refund was created, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6).
	*/
	@SerializedName("create_time")
	private String createTime;

	public String createTime() { return createTime; }
	
	public DetailedRefund createTime(String createTime) {
	    this.createTime = createTime;
	    return this;
	}

	/**
	* A free-form field for the clients' use.
	*/
	@SerializedName("custom")
	private String custom;

	public String custom() { return custom; }
	
	public DetailedRefund custom(String custom) {
	    this.custom = custom;
	    return this;
	}

	/**
	* The refund description.
	*/
	@SerializedName("description")
	private String description;

	public String description() { return description; }
	
	public DetailedRefund description(String description) {
	    this.description = description;
	    return this;
	}

	/**
	* The ID of the refund transaction.
	*/
	@SerializedName("id")
	private String id;

	public String id() { return id; }
	
	public DetailedRefund id(String id) {
	    this.id = id;
	    return this;
	}

	/**
	* Your own invoice or tracking ID number. Value is a string of single-byte alphanumeric characters.
	*/
	@SerializedName("invoice_number")
	private String invoiceNumber;

	public String invoiceNumber() { return invoiceNumber; }
	
	public DetailedRefund invoiceNumber(String invoiceNumber) {
	    this.invoiceNumber = invoiceNumber;
	    return this;
	}

	/**
	* An array of request-related [HATEOAS links](/docs/api/overview/#hateoas-links).
	*/
	@SerializedName(value = "links", listClass = LinkDescriptionObject.class)
	private List<LinkDescriptionObject> links;

	public List<LinkDescriptionObject> links() { return links; }
	
	public DetailedRefund links(List<LinkDescriptionObject> links) {
	    this.links = links;
	    return this;
	}

	/**
	* The ID of the payment on which this transaction is based.
	*/
	@SerializedName("parent_payment")
	private String parentPayment;

	public String parentPayment() { return parentPayment; }
	
	public DetailedRefund parentPayment(String parentPayment) {
	    this.parentPayment = parentPayment;
	    return this;
	}

	/**
	* The reason that the transaction is being refunded.
	*/
	@SerializedName("reason")
	private String reason;

	public String reason() { return reason; }
	
	public DetailedRefund reason(String reason) {
	    this.reason = reason;
	    return this;
	}

	/**
	* The base currency object for all financial value-related fields. For example, balance, payment due, and so on.
	*/
	@SerializedName("refund_from_received_amount")
	private Currency refundFromReceivedAmount;

	public Currency refundFromReceivedAmount() { return refundFromReceivedAmount; }
	
	public DetailedRefund refundFromReceivedAmount(Currency refundFromReceivedAmount) {
	    this.refundFromReceivedAmount = refundFromReceivedAmount;
	    return this;
	}

	/**
	* The base currency object for all financial value-related fields. For example, balance, payment due, and so on.
	*/
	@SerializedName("refund_from_transaction_fee")
	private Currency refundFromTransactionFee;

	public Currency refundFromTransactionFee() { return refundFromTransactionFee; }
	
	public DetailedRefund refundFromTransactionFee(Currency refundFromTransactionFee) {
	    this.refundFromTransactionFee = refundFromTransactionFee;
	    return this;
	}

	/**
	* The ID of the sale transaction being refunded.
	*/
	@SerializedName("sale_id")
	private String saleId;

	public String saleId() { return saleId; }
	
	public DetailedRefund saleId(String saleId) {
	    this.saleId = saleId;
	    return this;
	}

	/**
	* The state of the refund.
	*/
	@SerializedName("state")
	private String state;

	public String state() { return state; }
	
	public DetailedRefund state(String state) {
	    this.state = state;
	    return this;
	}

	/**
	* The base currency object for all financial value-related fields. For example, balance, payment due, and so on.
	*/
	@SerializedName("total_refunded_amount")
	private Currency totalRefundedAmount;

	public Currency totalRefundedAmount() { return totalRefundedAmount; }
	
	public DetailedRefund totalRefundedAmount(Currency totalRefundedAmount) {
	    this.totalRefundedAmount = totalRefundedAmount;
	    return this;
	}

	/**
	* The date and time when the resource was last updated, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6).
	*/
	@SerializedName("update_time")
	private String updateTime;

	public String updateTime() { return updateTime; }
	
	public DetailedRefund updateTime(String updateTime) {
	    this.updateTime = updateTime;
	    return this;
	}
}
