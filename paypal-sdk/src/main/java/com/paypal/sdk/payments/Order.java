// This class was generated on Mon, 22 Jan 2018 14:30:02 PST by version 0.1.0-dev+8c35d5 of Braintree SDK Generator
// Order.java
// @version 0.1.0-dev+8c35d5
// @type object
// @data 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
// DO NOT EDIT
package com.paypal.sdk.payments;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * An order transaction.
 */
@Model
public class Order {

    // Required default constructor
    public Order() {}

	/**
	* REQUIRED
	* The payment amount, with break-ups.
	*/
	@SerializedName("amount")
	private Amount amount;

	public Amount amount() { return amount; }
	
	public Order amount(Amount amount) {
	    this.amount = amount;
	    return this;
	}

	/**
	* The date and time when the resource was created, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6).
	*/
	@SerializedName("create_time")
	private String createTime;

	public String createTime() { return createTime; }
	
	public Order createTime(String createTime) {
	    this.createTime = createTime;
	    return this;
	}

	/**
	* The [Fraud Management Filter (FMF)](/docs/classic/fmf/integration-guide/FMFSummary/) details.
	*/
	@SerializedName("fmf_details")
	private FmfDetails fmfDetails;

	public FmfDetails fmfDetails() { return fmfDetails; }
	
	public Order fmfDetails(FmfDetails fmfDetails) {
	    this.fmfDetails = fmfDetails;
	    return this;
	}

	/**
	* The ID of the order transaction.
	*/
	@SerializedName("id")
	private String id;

	public String id() { return id; }
	
	public Order id(String id) {
	    this.id = id;
	    return this;
	}

	/**
	* An array of request-related [HATEOAS links](/docs/api/overview/#hateoas-links).
	*/
	@SerializedName(value = "links", listClass = LinkDescriptionObject.class)
	private List<LinkDescriptionObject> links;

	public List<LinkDescriptionObject> links() { return links; }
	
	public Order links(List<LinkDescriptionObject> links) {
	    this.links = links;
	    return this;
	}

	/**
	* The ID of the payment on which this transaction is based.
	*/
	@SerializedName("parent_payment")
	private String parentPayment;

	public String parentPayment() { return parentPayment; }
	
	public Order parentPayment(String parentPayment) {
	    this.parentPayment = parentPayment;
	    return this;
	}

	/**
	* The transaction payment mode.
	*/
	@SerializedName("payment_mode")
	private String paymentMode;

	public String paymentMode() { return paymentMode; }
	
	public Order paymentMode(String paymentMode) {
	    this.paymentMode = paymentMode;
	    return this;
	}

	/**
	* [DEPRECATED] The reason code for the pending transaction state. Obsolete. Use `reason_code` instead.
	*/
	@SerializedName("pending_reason")
	private String pendingReason;

	public String pendingReason() { return pendingReason; }
	
	public Order pendingReason(String pendingReason) {
	    this.pendingReason = pendingReason;
	    return this;
	}

	/**
	* The level of seller protection in effect for the transaction.
	*/
	@SerializedName("protection_eligibility")
	private String protectionEligibility;

	public String protectionEligibility() { return protectionEligibility; }
	
	public Order protectionEligibility(String protectionEligibility) {
	    this.protectionEligibility = protectionEligibility;
	    return this;
	}

	/**
	* The kind of seller protection in effect for the transaction. Returned only when the `protection_eligibility` property is `ELIGIBLE` or `PARTIALLY_ELIGIBLE`. Supported only when the `payment_method` is `paypal`. One or both of these values can be returned:<ul><li><code>ITEM_NOT_RECEIVED_ELIGIBLE</code>. Sellers are protected against claims for items not received.</li><li><code>UNAUTHORIZED_PAYMENT_ELIGIBLE</code>. Sellers are protected against claims for unauthorized payments.</li></ul>
	*/
	@SerializedName("protection_eligibility_type")
	private String protectionEligibilityType;

	public String protectionEligibilityType() { return protectionEligibilityType; }
	
	public Order protectionEligibilityType(String protectionEligibilityType) {
	    this.protectionEligibilityType = protectionEligibilityType;
	    return this;
	}

	/**
	* The reason code that describes why the transaction state is pending or reversed. Eventually, this parameter will replace the `pending_reason` parameter. Supported only when the `payment_method` is `paypal`.
	*/
	@SerializedName("reason_code")
	private String reasonCode;

	public String reasonCode() { return reasonCode; }
	
	public Order reasonCode(String reasonCode) {
	    this.reasonCode = reasonCode;
	    return this;
	}

	/**
	* The ID of the purchase unit that is associated with this object. Obsolete. Used only in `cart_base`.
	*/
	@SerializedName("reference_id")
	private String referenceId;

	public String referenceId() { return referenceId; }
	
	public Order referenceId(String referenceId) {
	    this.referenceId = referenceId;
	    return this;
	}

	/**
	* The order transaction state. Value is:<ul><li><code>pending</code>. The order was created but no authorizations/captures were made against the order.</li><li><code>authorized</code>. The order has only been authorized. No capture was made against the order.</li><li><code>captured</code>. The order has at least one capture initiated.</li><li><code>completed</code>. The order is complete as a capture was made against the order with <code>is_final_capture</code> set to <code>TRUE</code>. No more authorizations/captures can be made against this order.</li><li><code>voided</code>. The order was voided. No more authorizations/captures can be made against this order.</li></ul>
	*/
	@SerializedName("state")
	private String state;

	public String state() { return state; }
	
	public Order state(String state) {
	    this.state = state;
	    return this;
	}

	/**
	* The date and time when the resource was last updated, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6).
	*/
	@SerializedName("update_time")
	private String updateTime;

	public String updateTime() { return updateTime; }
	
	public Order updateTime(String updateTime) {
	    this.updateTime = updateTime;
	    return this;
	}
}
