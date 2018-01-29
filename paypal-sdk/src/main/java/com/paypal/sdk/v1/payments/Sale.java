// This class was generated on Mon, 29 Jan 2018 12:12:02 PST by version 0.1.0-dev+ecea6f of Braintree SDK Generator
// Sale.java
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
 * The sale transaction details.
 */
@Model
public class Sale {

    // Required default constructor
    public Sale() {}

	/**
	* REQUIRED
	* The payment amount, with break-ups.
	*/
	@SerializedName("amount")
	private Amount amount;

	public Amount amount() { return amount; }
	
	public Sale amount(Amount amount) {
	    this.amount = amount;
	    return this;
	}

	/**
	* The ID of the billing agreement. Used as reference to execute this transaction.
	*/
	@SerializedName("billing_agreement_id")
	private String billingAgreementId;

	public String billingAgreementId() { return billingAgreementId; }
	
	public Sale billingAgreementId(String billingAgreementId) {
	    this.billingAgreementId = billingAgreementId;
	    return this;
	}

	/**
	* The date and time when the eCheck transaction is expected to clear, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6). Returned for eCheck payments. Supported only when the `payment_method` is `paypal`.
	*/
	@SerializedName("clearing_time")
	private String clearingTime;

	public String clearingTime() { return clearingTime; }
	
	public Sale clearingTime(String clearingTime) {
	    this.clearingTime = clearingTime;
	    return this;
	}

	/**
	* REQUIRED
	* The date and time of the sale, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6).
	*/
	@SerializedName("create_time")
	private String createTime;

	public String createTime() { return createTime; }
	
	public Sale createTime(String createTime) {
	    this.createTime = createTime;
	    return this;
	}

	/**
	* The exchange rate for this transaction. Returned only in cross-currency use cases where a merchant bills a buyer in a non-primary currency for that buyer.
	*/
	@SerializedName("exchange_rate")
	private String exchangeRate;

	public String exchangeRate() { return exchangeRate; }
	
	public Sale exchangeRate(String exchangeRate) {
	    this.exchangeRate = exchangeRate;
	    return this;
	}

	/**
	* The [Fraud Management Filter (FMF)](/docs/classic/fmf/integration-guide/FMFSummary/) details.
	*/
	@SerializedName("fmf_details")
	private FmfDetails fmfDetails;

	public FmfDetails fmfDetails() { return fmfDetails; }
	
	public Sale fmfDetails(FmfDetails fmfDetails) {
	    this.fmfDetails = fmfDetails;
	    return this;
	}

	/**
	* REQUIRED
	* The ID of the sale transaction.
	*/
	@SerializedName("id")
	private String id;

	public String id() { return id; }
	
	public Sale id(String id) {
	    this.id = id;
	    return this;
	}

	/**
	* An array of request-related [HATEOAS links](/docs/api/overview/#hateoas-links).
	*/
	@SerializedName(value = "links", listClass = LinkDescriptionObject.class)
	private List<LinkDescriptionObject> links;

	public List<LinkDescriptionObject> links() { return links; }
	
	public Sale links(List<LinkDescriptionObject> links) {
	    this.links = links;
	    return this;
	}

	/**
	* REQUIRED
	* The ID of the payment on which this transaction is based.
	*/
	@SerializedName("parent_payment")
	private String parentPayment;

	public String parentPayment() { return parentPayment; }
	
	public Sale parentPayment(String parentPayment) {
	    this.parentPayment = parentPayment;
	    return this;
	}

	/**
	* An array of reasons that PayPal holds the recipient fund. Set only if the payment hold status is `HELD`.
	*/
	@SerializedName(value = "payment_hold_reasons", listClass = String.class)
	private List<String> paymentHoldReasons;

	public List<String> paymentHoldReasons() { return paymentHoldReasons; }
	
	public Sale paymentHoldReasons(List<String> paymentHoldReasons) {
	    this.paymentHoldReasons = paymentHoldReasons;
	    return this;
	}

	/**
	* The recipient fund status. Returned only when the fund status is `held`.
	*/
	@SerializedName("payment_hold_status")
	private String paymentHoldStatus;

	public String paymentHoldStatus() { return paymentHoldStatus; }
	
	public Sale paymentHoldStatus(String paymentHoldStatus) {
	    this.paymentHoldStatus = paymentHoldStatus;
	    return this;
	}

	/**
	* The transaction payment mode. Supported only when `payment_method` is `paypal`.
	*/
	@SerializedName("payment_mode")
	private String paymentMode;

	public String paymentMode() { return paymentMode; }
	
	public Sale paymentMode(String paymentMode) {
	    this.paymentMode = paymentMode;
	    return this;
	}

	/**
	* A collection of payment response-related fields returned from a payment request.
	*/
	@SerializedName("processor_response")
	private ProcessorResponse processorResponse;

	public ProcessorResponse processorResponse() { return processorResponse; }
	
	public Sale processorResponse(ProcessorResponse processorResponse) {
	    this.processorResponse = processorResponse;
	    return this;
	}

	/**
	* The seller protection level in effect for the transaction. Supported only when the `payment_method` is `paypal`.
	*/
	@SerializedName("protection_eligibility")
	private String protectionEligibility;

	public String protectionEligibility() { return protectionEligibility; }
	
	public Sale protectionEligibility(String protectionEligibility) {
	    this.protectionEligibility = protectionEligibility;
	    return this;
	}

	/**
	* The seller protection type in effect for the transaction. Returned only when `protection_eligibility` is `ELIGIBLE` or `PARTIALLY_ELIGIBLE`. Supported only when the `payment_method` is `paypal`.
	*/
	@SerializedName("protection_eligibility_type")
	private String protectionEligibilityType;

	public String protectionEligibilityType() { return protectionEligibilityType; }
	
	public Sale protectionEligibilityType(String protectionEligibilityType) {
	    this.protectionEligibilityType = protectionEligibilityType;
	    return this;
	}

	/**
	* The ID of the transaction that corresponds to this sale transaction.
	*/
	@SerializedName("purchase_unit_reference_id")
	private String purchaseUnitReferenceId;

	public String purchaseUnitReferenceId() { return purchaseUnitReferenceId; }
	
	public Sale purchaseUnitReferenceId(String purchaseUnitReferenceId) {
	    this.purchaseUnitReferenceId = purchaseUnitReferenceId;
	    return this;
	}

	/**
	* A reason code that describes why the transaction state is pending or reversed. Supported only when the `payment_method` is `paypal`.
	*/
	@SerializedName("reason_code")
	private String reasonCode;

	public String reasonCode() { return reasonCode; }
	
	public Sale reasonCode(String reasonCode) {
	    this.reasonCode = reasonCode;
	    return this;
	}

	/**
	* The receipt ID, which is a payment ID number that is returned for guest users to identify the payment.
	*/
	@SerializedName("receipt_id")
	private String receiptId;

	public String receiptId() { return receiptId; }
	
	public Sale receiptId(String receiptId) {
	    this.receiptId = receiptId;
	    return this;
	}

	/**
	* The base currency object for all financial value-related fields. For example, balance, payment due, and so on.
	*/
	@SerializedName("receivable_amount")
	private Currency receivableAmount;

	public Currency receivableAmount() { return receivableAmount; }
	
	public Sale receivableAmount(Currency receivableAmount) {
	    this.receivableAmount = receivableAmount;
	    return this;
	}

	/**
	* REQUIRED
	* The sale transaction state.
	*/
	@SerializedName("state")
	private String state;

	public String state() { return state; }
	
	public Sale state(String state) {
	    this.state = state;
	    return this;
	}

	/**
	* The base currency object for all financial value-related fields. For example, balance, payment due, and so on.
	*/
	@SerializedName("transaction_fee")
	private Currency transactionFee;

	public Currency transactionFee() { return transactionFee; }
	
	public Sale transactionFee(Currency transactionFee) {
	    this.transactionFee = transactionFee;
	    return this;
	}

	/**
	* The date and time when the resource was last updated, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6).
	*/
	@SerializedName("update_time")
	private String updateTime;

	public String updateTime() { return updateTime; }
	
	public Sale updateTime(String updateTime) {
	    this.updateTime = updateTime;
	    return this;
	}
}
