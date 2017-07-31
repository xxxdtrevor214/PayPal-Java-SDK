// This class was generated on Mon, 31 Jul 2017 18:27:14 UTC by version 0.1 of Braintree SDK Generator
// DetailedRefund.java
// DO NOT EDIT
// @type object
// @json {"Type":"Detailed Refund","VariableName":"","Description":"A refund transaction that is returned by `GET /refund`.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":[{"Type":"Amount","VariableName":"amount","Description":"The payment amount, with break-ups.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"capture_id","Description":"The ID of the sale transaction being refunded.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"create_time","Description":"The date and time when the refund was created, in [Internet date and time format](http://tools.ietf.org/html/rfc3339#section-5.6).","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"custom","Description":"A free-form field for the use by clients.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"description","Description":"The refund description.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"id","Description":"The ID of the refund transaction. Maximum length is 17 characters.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"invoice_number","Description":"Your own invoice or tracking ID number. Maximum length is 127 single-byte alphanumeric characters.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Link Description Object","VariableName":"links","Description":"","IsArray":true,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"parent_payment","Description":"The ID of the payment on which this transaction is based.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"reason","Description":"The reason that the transaction is being refunded.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"reason_code","Description":"The reason code for the pending refund state.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Currency","VariableName":"refund_from_received_amount","Description":"Base currency object for all financial value-related fields. For example, balance, payment due, and so on.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Currency","VariableName":"refund_from_transaction_fee","Description":"Base currency object for all financial value-related fields. For example, balance, payment due, and so on.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"refund_funding_type","Description":"Details Indicate whether Refund amount is funded by Payee or other funding accounts","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"refund_reason_code","Description":"Paypal assigned reason codes for the refund","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"External Funding","VariableName":"refund_to_external_funding","Description":"A list of external funding instruments that were refunded by the refund call. Each `external_funding` unit must have a unique reference ID.","IsArray":true,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Currency","VariableName":"refund_to_msb","Description":"Base currency object for all financial value-related fields. For example, balance, payment due, and so on.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Currency","VariableName":"refund_to_payer","Description":"Base currency object for all financial value-related fields. For example, balance, payment due, and so on.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"sale_id","Description":"The ID of the sale transaction being refunded. ","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"state","Description":"The state of the refund.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Currency","VariableName":"total_refunded_amount","Description":"Base currency object for all financial value-related fields. For example, balance, payment due, and so on.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"update_time","Description":"The date and time when the resource was last updated, in [Internet date and time format](http://tools.ietf.org/html/rfc3339#section-5.6).","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.payments.object;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.serializer.Serializable;
import com.braintreepayments.http.serializer.Deserializable;

/**
 * A refund transaction that is returned by `GET /refund`.
 */
public class DetailedRefund implements Serializable, Deserializable {

    // Required default constructor
    public DetailedRefund() {}

	/**
	* The payment amount, with break-ups.
	*/
	private Amount amount;

	public Amount amount() { return amount; }
	
	public DetailedRefund amount(Amount amount) {
	    this.amount = amount;
	    return this;
	}

	/**
	* The ID of the sale transaction being refunded.
	*/
	private String captureId;

	public String captureId() { return captureId; }
	
	public DetailedRefund captureId(String captureId) {
	    this.captureId = captureId;
	    return this;
	}

	/**
	* The date and time when the refund was created, in [Internet date and time format](http://tools.ietf.org/html/rfc3339#section-5.6).
	*/
	private String createTime;

	public String createTime() { return createTime; }
	
	public DetailedRefund createTime(String createTime) {
	    this.createTime = createTime;
	    return this;
	}

	/**
	* A free-form field for the use by clients.
	*/
	private String custom;

	public String custom() { return custom; }
	
	public DetailedRefund custom(String custom) {
	    this.custom = custom;
	    return this;
	}

	/**
	* The refund description.
	*/
	private String description;

	public String description() { return description; }
	
	public DetailedRefund description(String description) {
	    this.description = description;
	    return this;
	}

	/**
	* The ID of the refund transaction. Maximum length is 17 characters.
	*/
	private String id;

	public String id() { return id; }
	
	public DetailedRefund id(String id) {
	    this.id = id;
	    return this;
	}

	/**
	* Your own invoice or tracking ID number. Maximum length is 127 single-byte alphanumeric characters.
	*/
	private String invoiceNumber;

	public String invoiceNumber() { return invoiceNumber; }
	
	public DetailedRefund invoiceNumber(String invoiceNumber) {
	    this.invoiceNumber = invoiceNumber;
	    return this;
	}

	/**
	*/
	private List<LinkDescriptionObject> links;

	public List<LinkDescriptionObject> links() { return links; }
	
	public DetailedRefund links(List<LinkDescriptionObject> links) {
	    this.links = links;
	    return this;
	}

	/**
	* The ID of the payment on which this transaction is based.
	*/
	private String parentPayment;

	public String parentPayment() { return parentPayment; }
	
	public DetailedRefund parentPayment(String parentPayment) {
	    this.parentPayment = parentPayment;
	    return this;
	}

	/**
	* The reason that the transaction is being refunded.
	*/
	private String reason;

	public String reason() { return reason; }
	
	public DetailedRefund reason(String reason) {
	    this.reason = reason;
	    return this;
	}

	/**
	* The reason code for the pending refund state.
	*/
	private String reasonCode;

	public String reasonCode() { return reasonCode; }
	
	public DetailedRefund reasonCode(String reasonCode) {
	    this.reasonCode = reasonCode;
	    return this;
	}

	/**
	* Base currency object for all financial value-related fields. For example, balance, payment due, and so on.
	*/
	private Currency refundFromReceivedAmount;

	public Currency refundFromReceivedAmount() { return refundFromReceivedAmount; }
	
	public DetailedRefund refundFromReceivedAmount(Currency refundFromReceivedAmount) {
	    this.refundFromReceivedAmount = refundFromReceivedAmount;
	    return this;
	}

	/**
	* Base currency object for all financial value-related fields. For example, balance, payment due, and so on.
	*/
	private Currency refundFromTransactionFee;

	public Currency refundFromTransactionFee() { return refundFromTransactionFee; }
	
	public DetailedRefund refundFromTransactionFee(Currency refundFromTransactionFee) {
	    this.refundFromTransactionFee = refundFromTransactionFee;
	    return this;
	}

	/**
	* Details Indicate whether Refund amount is funded by Payee or other funding accounts
	*/
	private String refundFundingType;

	public String refundFundingType() { return refundFundingType; }
	
	public DetailedRefund refundFundingType(String refundFundingType) {
	    this.refundFundingType = refundFundingType;
	    return this;
	}

	/**
	* Paypal assigned reason codes for the refund
	*/
	private String refundReasonCode;

	public String refundReasonCode() { return refundReasonCode; }
	
	public DetailedRefund refundReasonCode(String refundReasonCode) {
	    this.refundReasonCode = refundReasonCode;
	    return this;
	}

	/**
	* A list of external funding instruments that were refunded by the refund call. Each `external_funding` unit must have a unique reference ID.
	*/
	private List<ExternalFunding> refundToExternalFunding;

	public List<ExternalFunding> refundToExternalFunding() { return refundToExternalFunding; }
	
	public DetailedRefund refundToExternalFunding(List<ExternalFunding> refundToExternalFunding) {
	    this.refundToExternalFunding = refundToExternalFunding;
	    return this;
	}

	/**
	* Base currency object for all financial value-related fields. For example, balance, payment due, and so on.
	*/
	private Currency refundToMsb;

	public Currency refundToMsb() { return refundToMsb; }
	
	public DetailedRefund refundToMsb(Currency refundToMsb) {
	    this.refundToMsb = refundToMsb;
	    return this;
	}

	/**
	* Base currency object for all financial value-related fields. For example, balance, payment due, and so on.
	*/
	private Currency refundToPayer;

	public Currency refundToPayer() { return refundToPayer; }
	
	public DetailedRefund refundToPayer(Currency refundToPayer) {
	    this.refundToPayer = refundToPayer;
	    return this;
	}

	/**
	* The ID of the sale transaction being refunded. 
	*/
	private String saleId;

	public String saleId() { return saleId; }
	
	public DetailedRefund saleId(String saleId) {
	    this.saleId = saleId;
	    return this;
	}

	/**
	* The state of the refund.
	*/
	private String state;

	public String state() { return state; }
	
	public DetailedRefund state(String state) {
	    this.state = state;
	    return this;
	}

	/**
	* Base currency object for all financial value-related fields. For example, balance, payment due, and so on.
	*/
	private Currency totalRefundedAmount;

	public Currency totalRefundedAmount() { return totalRefundedAmount; }
	
	public DetailedRefund totalRefundedAmount(Currency totalRefundedAmount) {
	    this.totalRefundedAmount = totalRefundedAmount;
	    return this;
	}

	/**
	* The date and time when the resource was last updated, in [Internet date and time format](http://tools.ietf.org/html/rfc3339#section-5.6).
	*/
	private String updateTime;

	public String updateTime() { return updateTime; }
	
	public DetailedRefund updateTime(String updateTime) {
	    this.updateTime = updateTime;
	    return this;
	}

    @Override
    public void serialize(Map<String, Object> serialized) {
        if (amount != null) {
            serialized.put("amount", this.amount);
        }
        if (captureId != null) {
            serialized.put("capture_id", this.captureId);
        }
        if (createTime != null) {
            serialized.put("create_time", this.createTime);
        }
        if (custom != null) {
            serialized.put("custom", this.custom);
        }
        if (description != null) {
            serialized.put("description", this.description);
        }
        if (id != null) {
            serialized.put("id", this.id);
        }
        if (invoiceNumber != null) {
            serialized.put("invoice_number", this.invoiceNumber);
        }
        if (links != null) {
            serialized.put("links", this.links);
        }
        if (parentPayment != null) {
            serialized.put("parent_payment", this.parentPayment);
        }
        if (reason != null) {
            serialized.put("reason", this.reason);
        }
        if (reasonCode != null) {
            serialized.put("reason_code", this.reasonCode);
        }
        if (refundFromReceivedAmount != null) {
            serialized.put("refund_from_received_amount", this.refundFromReceivedAmount);
        }
        if (refundFromTransactionFee != null) {
            serialized.put("refund_from_transaction_fee", this.refundFromTransactionFee);
        }
        if (refundFundingType != null) {
            serialized.put("refund_funding_type", this.refundFundingType);
        }
        if (refundReasonCode != null) {
            serialized.put("refund_reason_code", this.refundReasonCode);
        }
        if (refundToExternalFunding != null) {
            serialized.put("refund_to_external_funding", this.refundToExternalFunding);
        }
        if (refundToMsb != null) {
            serialized.put("refund_to_msb", this.refundToMsb);
        }
        if (refundToPayer != null) {
            serialized.put("refund_to_payer", this.refundToPayer);
        }
        if (saleId != null) {
            serialized.put("sale_id", this.saleId);
        }
        if (state != null) {
            serialized.put("state", this.state);
        }
        if (totalRefundedAmount != null) {
            serialized.put("total_refunded_amount", this.totalRefundedAmount);
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
        if (values.containsKey("capture_id")) {
            this.captureId = (String) values.get("capture_id");
        }
        if (values.containsKey("create_time")) {
            this.createTime = (String) values.get("create_time");
        }
        if (values.containsKey("custom")) {
            this.custom = (String) values.get("custom");
        }
        if (values.containsKey("description")) {
            this.description = (String) values.get("description");
        }
        if (values.containsKey("id")) {
            this.id = (String) values.get("id");
        }
        if (values.containsKey("invoice_number")) {
            this.invoiceNumber = (String) values.get("invoice_number");
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
        if (values.containsKey("reason")) {
            this.reason = (String) values.get("reason");
        }
        if (values.containsKey("reason_code")) {
            this.reasonCode = (String) values.get("reason_code");
        }
        if (values.containsKey("refund_from_received_amount")) {
            this.refundFromReceivedAmount = new Currency();
            this.refundFromReceivedAmount.deserialize((Map<String, Object>) values.get("refund_from_received_amount"));
        }
        if (values.containsKey("refund_from_transaction_fee")) {
            this.refundFromTransactionFee = new Currency();
            this.refundFromTransactionFee.deserialize((Map<String, Object>) values.get("refund_from_transaction_fee"));
        }
        if (values.containsKey("refund_funding_type")) {
            this.refundFundingType = (String) values.get("refund_funding_type");
        }
        if (values.containsKey("refund_reason_code")) {
            this.refundReasonCode = (String) values.get("refund_reason_code");
        }
        if (values.containsKey("refund_to_external_funding")) {
            this.refundToExternalFunding = new ArrayList<>();
				List<Map<String, Object>> nestedValues = (List<Map<String, Object>>) values.get("refund_to_external_funding");
				for (Map<String, Object> nestedValue : nestedValues) {
					ExternalFunding nested = new ExternalFunding();
					nested.deserialize(nestedValue);
					this.refundToExternalFunding.add(nested);
                }
        }
        if (values.containsKey("refund_to_msb")) {
            this.refundToMsb = new Currency();
            this.refundToMsb.deserialize((Map<String, Object>) values.get("refund_to_msb"));
        }
        if (values.containsKey("refund_to_payer")) {
            this.refundToPayer = new Currency();
            this.refundToPayer.deserialize((Map<String, Object>) values.get("refund_to_payer"));
        }
        if (values.containsKey("sale_id")) {
            this.saleId = (String) values.get("sale_id");
        }
        if (values.containsKey("state")) {
            this.state = (String) values.get("state");
        }
        if (values.containsKey("total_refunded_amount")) {
            this.totalRefundedAmount = new Currency();
            this.totalRefundedAmount.deserialize((Map<String, Object>) values.get("total_refunded_amount"));
        }
        if (values.containsKey("update_time")) {
            this.updateTime = (String) values.get("update_time");
        }
    }
}

