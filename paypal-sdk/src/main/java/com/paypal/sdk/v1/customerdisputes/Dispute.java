// This class was generated on Mon, 09 Apr 2018 16:10:52 UTC by version 0.1.0-dev+291f3f of Braintree SDK Generator
// Dispute.java
// @version 0.1.0-dev+291f3f
// @type object
// @data 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
// DO NOT EDIT
package com.paypal.sdk.v1.customerdisputes;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The dispute details.
 */
@Model
public class Dispute {

    // Required default constructor
    public Dispute() {}

	/**
	* The date and time, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6). Seconds are required while fractional seconds are optional.<blockquote><strong>Note:</strong> The regular expression provides guidance but does not reject all invalid dates.</blockquote>
	*/
	@SerializedName("create_time")
	private String createTime;

	public String createTime() { return createTime; }
	
	public Dispute createTime(String createTime) {
	    this.createTime = createTime;
	    return this;
	}

	/**
	* The currency and amount for a financial value-related field. For example, balance or payment due.
	*/
	@SerializedName("dispute_amount")
	private Money disputeAmount;

	public Money disputeAmount() { return disputeAmount; }
	
	public Dispute disputeAmount(Money disputeAmount) {
	    this.disputeAmount = disputeAmount;
	    return this;
	}

	/**
	* The ID of the dispute.
	*/
	@SerializedName("dispute_id")
	private String disputeId;

	public String disputeId() { return disputeId; }
	
	public Dispute disputeId(String disputeId) {
	    this.disputeId = disputeId;
	    return this;
	}

	/**
	* The outcome of a dispute.
	*/
	@SerializedName("dispute_outcome")
	private DisputeOutcome disputeOutcome;

	public DisputeOutcome disputeOutcome() { return disputeOutcome; }
	
	public Dispute disputeOutcome(DisputeOutcome disputeOutcome) {
	    this.disputeOutcome = disputeOutcome;
	    return this;
	}

	/**
	* An array of transactions for which the disputes were created.
	*/
	@SerializedName(value = "disputed_transactions", listClass = TransactionInformation.class)
	private List<TransactionInformation> disputedTransactions;

	public List<TransactionInformation> disputedTransactions() { return disputedTransactions; }
	
	public Dispute disputedTransactions(List<TransactionInformation> disputedTransactions) {
	    this.disputedTransactions = disputedTransactions;
	    return this;
	}

	/**
	* An array of request-related [HATEOAS links](/docs/api/hateoas-links/).
	*/
	@SerializedName(value = "links", listClass = LinkDescription.class)
	private List<LinkDescription> links;

	public List<LinkDescription> links() { return links; }
	
	public Dispute links(List<LinkDescription> links) {
	    this.links = links;
	    return this;
	}

	/**
	* An array of messages that were posted by the customer and merchant.
	*/
	@SerializedName(value = "messages", listClass = Message.class)
	private List<Message> messages;

	public List<Message> messages() { return messages; }
	
	public Dispute messages(List<Message> messages) {
	    this.messages = messages;
	    return this;
	}

	/**
	* The information for the offer that a buyer or seller proposes for the dispute.
	*/
	@SerializedName("offer")
	private Offer offer;

	public Offer offer() { return offer; }
	
	public Dispute offer(Offer offer) {
	    this.offer = offer;
	    return this;
	}

	/**
	* The reason for the item-level dispute. Value is:<ul><li><code>MERCHANDISE_OR_SERVICE_NOT_RECEIVED</code>. The customer did not receive the merchandise or service.</li><li><code>MERCHANDISE_OR_SERVICE_NOT_AS_DESCRIBED</code>. The customer reports that the merchandise or service was not as described.</li><li><code>UNAUTHORISED</code>. The customer did not authorize purchase of the merchandise or service.</li><li><code>CREDIT_NOT_PROCESSED</code>. The refund or credit was not processed for the customer.</li><li><code>DUPLICATE_TRANSACTION</code>. The transaction was a duplicate.</li><li><code>INCORRECT_AMOUNT</code>. The customer was charged an incorrect amount.</li><li><code>PAYMENT_BY_OTHER_MEANS</code>. The customer paid for the transaction through other means.</li><li><code>CANCELED_RECURRING_BILLING</code>. The customer was being charged for a subscription or recurring transaction that was canceled.</li><li><code>PROBLEM_WITH_REMITTANCE</code>. A problem occurred with the remittance.</li><li><code>OTHER</code>. Other.</li></ul>For information about the required information for each dispute reason and associated evidence type, see <a href="/docs/integration/direct/customer-disputes/#dispute-reason-codes">dispute reason codes</a>.
	*/
	@SerializedName("reason")
	private String reason;

	public String reason() { return reason; }
	
	public Dispute reason(String reason) {
	    this.reason = reason;
	    return this;
	}

	/**
	* The date and time, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6). Seconds are required while fractional seconds are optional.<blockquote><strong>Note:</strong> The regular expression provides guidance but does not reject all invalid dates.</blockquote>
	*/
	@SerializedName("seller_response_due_date")
	private String sellerResponseDueDate;

	public String sellerResponseDueDate() { return sellerResponseDueDate; }
	
	public Dispute sellerResponseDueDate(String sellerResponseDueDate) {
	    this.sellerResponseDueDate = sellerResponseDueDate;
	    return this;
	}

	/**
	* The status of the dispute. Value is:<ul><li><code>OPEN</code>. Open.</li><li><code>WAITING_FOR_BUYER_RESPONSE</code>. The dispute is waiting for a response from the customer.</li><li><code>WAITING_FOR_SELLER_RESPONSE</code>. The dispute is waiting for a response from the merchant.</li><li><code>UNDER_REVIEW</code>. The dispute is under review.</li><li><code>RESOLVED</code>. The dispute is resolved.</li><li><code>OTHER</code>. Another reason.</li></ul>
	*/
	@SerializedName("status")
	private String status;

	public String status() { return status; }
	
	public Dispute status(String status) {
	    this.status = status;
	    return this;
	}

	/**
	* The date and time, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6). Seconds are required while fractional seconds are optional.<blockquote><strong>Note:</strong> The regular expression provides guidance but does not reject all invalid dates.</blockquote>
	*/
	@SerializedName("update_time")
	private String updateTime;

	public String updateTime() { return updateTime; }
	
	public Dispute updateTime(String updateTime) {
	    this.updateTime = updateTime;
	    return this;
	}
}
