// This class was generated on Mon, 31 Jul 2017 18:27:14 UTC by version 0.1 of Braintree SDK Generator
// Sale.java
// DO NOT EDIT
// @type object
// @json {"Type":"Sale","VariableName":"","Description":"A sale transaction. Returned as a part of payment-related resources.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":[{"Type":"Amount","VariableName":"amount","Description":"The payment amount, with break-ups.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null},{"Type":"string","VariableName":"billing_agreement_id","Description":"The ID of the billing agreement. Used as reference to execute this transaction.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"clearing_time","Description":"The date and time when the eCheck transaction is expected to clear. Returned for eCheck payments. Supported only when the `payment_method` is `paypal`.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"create_time","Description":"The date and time of the sale, in Internet date and time format as defined in [RFC 3339 Section 5.6](http://tools.ietf.org/html/rfc3339#section-5.6).","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null},{"Type":"string","VariableName":"exchange_rate","Description":"The exchange rate for this transaction. Returned only in cross-currency use cases where a merchant bills a buyer in a non-primary currency for that buyer.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"FMF Details","VariableName":"fmf_details","Description":"The [Fraud Management Filter (FMF)](/docs/classic/fmf/integration-guide/FMFSummary/) details.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"id","Description":"The ID of the sale transaction.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null},{"Type":"Link Description Object","VariableName":"links","Description":"","IsArray":true,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"parent_payment","Description":"The ID of the payment on which this transaction is based.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null},{"Type":"string","VariableName":"payment_hold_reasons","Description":"The reason that PayPal holds the recipient fund. Set only if the payment hold status is `held`.","IsArray":true,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"payment_hold_status","Description":"The recipient fund status. Returned only when the fund status is `held`.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"payment_mode","Description":"The transaction payment mode. Supported only when `payment_method` is `paypal`.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Processor Response","VariableName":"processor_response","Description":"A collection of payment response-related fields returned from a payment request.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"protection_eligibility","Description":"The seller protection level in effect for the transaction. Supported only when the `payment_method` is `paypal`.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"protection_eligibility_type","Description":"The seller protection type in effect for the transaction. Returned only when `protection_eligibility` is `ELIGIBLE` or `PARTIALLY_ELIGIBLE`. Supported only when the `payment_method` is `paypal`.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"purchase_unit_reference_id","Description":"The ID of the transaction that corresponds to this sale transaction.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"reason_code","Description":"The reason code that describes why the transaction state is pending or reversed. Supported only when the `payment_method` is `paypal`.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"receipt_id","Description":"The receipt ID, which is a payment ID number that is returned for guest users to identify the payment.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Currency","VariableName":"receivable_amount","Description":"Base currency object for all financial value-related fields. For example, balance, payment due, and so on.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"state","Description":"The sale transaction state.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null},{"Type":"Currency","VariableName":"transaction_fee","Description":"Base currency object for all financial value-related fields. For example, balance, payment due, and so on.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"update_time","Description":"The date and time when the resource was last updated, in Internet date and time format in [RFC 3339 Section 5.6](http://tools.ietf.org/html/rfc3339#section-5.6).","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.payments.object;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.serializer.Serializable;
import com.braintreepayments.http.serializer.Deserializable;

/**
 * A sale transaction. Returned as a part of payment-related resources.
 */
public class Sale implements Serializable, Deserializable {

    // Required default constructor
    public Sale() {}

	/**
	* REQUIRED
	* The payment amount, with break-ups.
	*/
	private Amount amount;

	public Amount amount() { return amount; }
	
	public Sale amount(Amount amount) {
	    this.amount = amount;
	    return this;
	}

	/**
	* The ID of the billing agreement. Used as reference to execute this transaction.
	*/
	private String billingAgreementId;

	public String billingAgreementId() { return billingAgreementId; }
	
	public Sale billingAgreementId(String billingAgreementId) {
	    this.billingAgreementId = billingAgreementId;
	    return this;
	}

	/**
	* The date and time when the eCheck transaction is expected to clear. Returned for eCheck payments. Supported only when the `payment_method` is `paypal`.
	*/
	private String clearingTime;

	public String clearingTime() { return clearingTime; }
	
	public Sale clearingTime(String clearingTime) {
	    this.clearingTime = clearingTime;
	    return this;
	}

	/**
	* REQUIRED
	* The date and time of the sale, in Internet date and time format as defined in [RFC 3339 Section 5.6](http://tools.ietf.org/html/rfc3339#section-5.6).
	*/
	private String createTime;

	public String createTime() { return createTime; }
	
	public Sale createTime(String createTime) {
	    this.createTime = createTime;
	    return this;
	}

	/**
	* The exchange rate for this transaction. Returned only in cross-currency use cases where a merchant bills a buyer in a non-primary currency for that buyer.
	*/
	private String exchangeRate;

	public String exchangeRate() { return exchangeRate; }
	
	public Sale exchangeRate(String exchangeRate) {
	    this.exchangeRate = exchangeRate;
	    return this;
	}

	/**
	* The [Fraud Management Filter (FMF)](/docs/classic/fmf/integration-guide/FMFSummary/) details.
	*/
	private FMFDetails fmfDetails;

	public FMFDetails fmfDetails() { return fmfDetails; }
	
	public Sale fmfDetails(FMFDetails fmfDetails) {
	    this.fmfDetails = fmfDetails;
	    return this;
	}

	/**
	* REQUIRED
	* The ID of the sale transaction.
	*/
	private String id;

	public String id() { return id; }
	
	public Sale id(String id) {
	    this.id = id;
	    return this;
	}

	/**
	*/
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
	private String parentPayment;

	public String parentPayment() { return parentPayment; }
	
	public Sale parentPayment(String parentPayment) {
	    this.parentPayment = parentPayment;
	    return this;
	}

	/**
	* The reason that PayPal holds the recipient fund. Set only if the payment hold status is `held`.
	*/
	private List<String> paymentHoldReasons;

	public List<String> paymentHoldReasons() { return paymentHoldReasons; }
	
	public Sale paymentHoldReasons(List<String> paymentHoldReasons) {
	    this.paymentHoldReasons = paymentHoldReasons;
	    return this;
	}

	/**
	* The recipient fund status. Returned only when the fund status is `held`.
	*/
	private String paymentHoldStatus;

	public String paymentHoldStatus() { return paymentHoldStatus; }
	
	public Sale paymentHoldStatus(String paymentHoldStatus) {
	    this.paymentHoldStatus = paymentHoldStatus;
	    return this;
	}

	/**
	* The transaction payment mode. Supported only when `payment_method` is `paypal`.
	*/
	private String paymentMode;

	public String paymentMode() { return paymentMode; }
	
	public Sale paymentMode(String paymentMode) {
	    this.paymentMode = paymentMode;
	    return this;
	}

	/**
	* A collection of payment response-related fields returned from a payment request.
	*/
	private ProcessorResponse processorResponse;

	public ProcessorResponse processorResponse() { return processorResponse; }
	
	public Sale processorResponse(ProcessorResponse processorResponse) {
	    this.processorResponse = processorResponse;
	    return this;
	}

	/**
	* The seller protection level in effect for the transaction. Supported only when the `payment_method` is `paypal`.
	*/
	private String protectionEligibility;

	public String protectionEligibility() { return protectionEligibility; }
	
	public Sale protectionEligibility(String protectionEligibility) {
	    this.protectionEligibility = protectionEligibility;
	    return this;
	}

	/**
	* The seller protection type in effect for the transaction. Returned only when `protection_eligibility` is `ELIGIBLE` or `PARTIALLY_ELIGIBLE`. Supported only when the `payment_method` is `paypal`.
	*/
	private String protectionEligibilityType;

	public String protectionEligibilityType() { return protectionEligibilityType; }
	
	public Sale protectionEligibilityType(String protectionEligibilityType) {
	    this.protectionEligibilityType = protectionEligibilityType;
	    return this;
	}

	/**
	* The ID of the transaction that corresponds to this sale transaction.
	*/
	private String purchaseUnitReferenceId;

	public String purchaseUnitReferenceId() { return purchaseUnitReferenceId; }
	
	public Sale purchaseUnitReferenceId(String purchaseUnitReferenceId) {
	    this.purchaseUnitReferenceId = purchaseUnitReferenceId;
	    return this;
	}

	/**
	* The reason code that describes why the transaction state is pending or reversed. Supported only when the `payment_method` is `paypal`.
	*/
	private String reasonCode;

	public String reasonCode() { return reasonCode; }
	
	public Sale reasonCode(String reasonCode) {
	    this.reasonCode = reasonCode;
	    return this;
	}

	/**
	* The receipt ID, which is a payment ID number that is returned for guest users to identify the payment.
	*/
	private String receiptId;

	public String receiptId() { return receiptId; }
	
	public Sale receiptId(String receiptId) {
	    this.receiptId = receiptId;
	    return this;
	}

	/**
	* Base currency object for all financial value-related fields. For example, balance, payment due, and so on.
	*/
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
	private String state;

	public String state() { return state; }
	
	public Sale state(String state) {
	    this.state = state;
	    return this;
	}

	/**
	* Base currency object for all financial value-related fields. For example, balance, payment due, and so on.
	*/
	private Currency transactionFee;

	public Currency transactionFee() { return transactionFee; }
	
	public Sale transactionFee(Currency transactionFee) {
	    this.transactionFee = transactionFee;
	    return this;
	}

	/**
	* The date and time when the resource was last updated, in Internet date and time format in [RFC 3339 Section 5.6](http://tools.ietf.org/html/rfc3339#section-5.6).
	*/
	private String updateTime;

	public String updateTime() { return updateTime; }
	
	public Sale updateTime(String updateTime) {
	    this.updateTime = updateTime;
	    return this;
	}

    @Override
    public void serialize(Map<String, Object> serialized) {
        if (amount != null) {
            serialized.put("amount", this.amount);
        }
        if (billingAgreementId != null) {
            serialized.put("billing_agreement_id", this.billingAgreementId);
        }
        if (clearingTime != null) {
            serialized.put("clearing_time", this.clearingTime);
        }
        if (createTime != null) {
            serialized.put("create_time", this.createTime);
        }
        if (exchangeRate != null) {
            serialized.put("exchange_rate", this.exchangeRate);
        }
        if (fmfDetails != null) {
            serialized.put("fmf_details", this.fmfDetails);
        }
        if (id != null) {
            serialized.put("id", this.id);
        }
        if (links != null) {
            serialized.put("links", this.links);
        }
        if (parentPayment != null) {
            serialized.put("parent_payment", this.parentPayment);
        }
        if (paymentHoldReasons != null) {
            serialized.put("payment_hold_reasons", this.paymentHoldReasons);
        }
        if (paymentHoldStatus != null) {
            serialized.put("payment_hold_status", this.paymentHoldStatus);
        }
        if (paymentMode != null) {
            serialized.put("payment_mode", this.paymentMode);
        }
        if (processorResponse != null) {
            serialized.put("processor_response", this.processorResponse);
        }
        if (protectionEligibility != null) {
            serialized.put("protection_eligibility", this.protectionEligibility);
        }
        if (protectionEligibilityType != null) {
            serialized.put("protection_eligibility_type", this.protectionEligibilityType);
        }
        if (purchaseUnitReferenceId != null) {
            serialized.put("purchase_unit_reference_id", this.purchaseUnitReferenceId);
        }
        if (reasonCode != null) {
            serialized.put("reason_code", this.reasonCode);
        }
        if (receiptId != null) {
            serialized.put("receipt_id", this.receiptId);
        }
        if (receivableAmount != null) {
            serialized.put("receivable_amount", this.receivableAmount);
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
        if (values.containsKey("billing_agreement_id")) {
            this.billingAgreementId = (String) values.get("billing_agreement_id");
        }
        if (values.containsKey("clearing_time")) {
            this.clearingTime = (String) values.get("clearing_time");
        }
        if (values.containsKey("create_time")) {
            this.createTime = (String) values.get("create_time");
        }
        if (values.containsKey("exchange_rate")) {
            this.exchangeRate = (String) values.get("exchange_rate");
        }
        if (values.containsKey("fmf_details")) {
            this.fmfDetails = new FMFDetails();
            this.fmfDetails.deserialize((Map<String, Object>) values.get("fmf_details"));
        }
        if (values.containsKey("id")) {
            this.id = (String) values.get("id");
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
        if (values.containsKey("payment_hold_reasons")) {
            this.paymentHoldReasons = new ArrayList<>();
                List<String> nestedValues = (List<String>) values.get("payment_hold_reasons");
                for (String nestedValue : nestedValues) {
                    this.paymentHoldReasons.add(nestedValue);
                }
        }
        if (values.containsKey("payment_hold_status")) {
            this.paymentHoldStatus = (String) values.get("payment_hold_status");
        }
        if (values.containsKey("payment_mode")) {
            this.paymentMode = (String) values.get("payment_mode");
        }
        if (values.containsKey("processor_response")) {
            this.processorResponse = new ProcessorResponse();
            this.processorResponse.deserialize((Map<String, Object>) values.get("processor_response"));
        }
        if (values.containsKey("protection_eligibility")) {
            this.protectionEligibility = (String) values.get("protection_eligibility");
        }
        if (values.containsKey("protection_eligibility_type")) {
            this.protectionEligibilityType = (String) values.get("protection_eligibility_type");
        }
        if (values.containsKey("purchase_unit_reference_id")) {
            this.purchaseUnitReferenceId = (String) values.get("purchase_unit_reference_id");
        }
        if (values.containsKey("reason_code")) {
            this.reasonCode = (String) values.get("reason_code");
        }
        if (values.containsKey("receipt_id")) {
            this.receiptId = (String) values.get("receipt_id");
        }
        if (values.containsKey("receivable_amount")) {
            this.receivableAmount = new Currency();
            this.receivableAmount.deserialize((Map<String, Object>) values.get("receivable_amount"));
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

