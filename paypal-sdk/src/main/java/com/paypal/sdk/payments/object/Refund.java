// This class was generated on Mon, 31 Jul 2017 18:27:14 UTC by version 0.1 of Braintree SDK Generator
// Refund.java
// DO NOT EDIT
// @type object
// @json {"Type":"Refund","VariableName":"","Description":"A refund transaction.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":[{"Type":"Amount","VariableName":"amount","Description":"The payment amount, with break-ups.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"capture_id","Description":"The ID of the sale transaction being refunded.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"create_time","Description":"The date and time when the refund was created, in [Internet date and time format](http://tools.ietf.org/html/rfc3339#section-5.6).","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"description","Description":"The refund description.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"id","Description":"The ID of the refund transaction. Maximum length is 17 characters.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"invoice_number","Description":"Your own invoice or tracking ID number. Maximum length is 127 single-byte alphanumeric characters.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Link Description Object","VariableName":"links","Description":"","IsArray":true,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"parent_payment","Description":"The ID of the payment on which this transaction is based.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"reason","Description":"The reason that the transaction is being refunded.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"reason_code","Description":"The reason code for the pending refund state.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"refund_funding_type","Description":"Details Indicate whether Refund amount is funded by Payee or other funding accounts","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"refund_reason_code","Description":"Paypal assigned reason codes for the refund","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"sale_id","Description":"The ID of the sale transaction being refunded. ","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"state","Description":"The state of the refund.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"update_time","Description":"The date and time when the resource was last updated, in [Internet date and time format](http://tools.ietf.org/html/rfc3339#section-5.6).","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.payments.object;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.serializer.Serializable;
import com.braintreepayments.http.serializer.Deserializable;

/**
 * A refund transaction.
 */
public class Refund implements Serializable, Deserializable {

    // Required default constructor
    public Refund() {}

	/**
	* The payment amount, with break-ups.
	*/
	private Amount amount;

	public Amount amount() { return amount; }
	
	public Refund amount(Amount amount) {
	    this.amount = amount;
	    return this;
	}

	/**
	* The ID of the sale transaction being refunded.
	*/
	private String captureId;

	public String captureId() { return captureId; }
	
	public Refund captureId(String captureId) {
	    this.captureId = captureId;
	    return this;
	}

	/**
	* The date and time when the refund was created, in [Internet date and time format](http://tools.ietf.org/html/rfc3339#section-5.6).
	*/
	private String createTime;

	public String createTime() { return createTime; }
	
	public Refund createTime(String createTime) {
	    this.createTime = createTime;
	    return this;
	}

	/**
	* The refund description.
	*/
	private String description;

	public String description() { return description; }
	
	public Refund description(String description) {
	    this.description = description;
	    return this;
	}

	/**
	* The ID of the refund transaction. Maximum length is 17 characters.
	*/
	private String id;

	public String id() { return id; }
	
	public Refund id(String id) {
	    this.id = id;
	    return this;
	}

	/**
	* Your own invoice or tracking ID number. Maximum length is 127 single-byte alphanumeric characters.
	*/
	private String invoiceNumber;

	public String invoiceNumber() { return invoiceNumber; }
	
	public Refund invoiceNumber(String invoiceNumber) {
	    this.invoiceNumber = invoiceNumber;
	    return this;
	}

	/**
	*/
	private List<LinkDescriptionObject> links;

	public List<LinkDescriptionObject> links() { return links; }
	
	public Refund links(List<LinkDescriptionObject> links) {
	    this.links = links;
	    return this;
	}

	/**
	* The ID of the payment on which this transaction is based.
	*/
	private String parentPayment;

	public String parentPayment() { return parentPayment; }
	
	public Refund parentPayment(String parentPayment) {
	    this.parentPayment = parentPayment;
	    return this;
	}

	/**
	* The reason that the transaction is being refunded.
	*/
	private String reason;

	public String reason() { return reason; }
	
	public Refund reason(String reason) {
	    this.reason = reason;
	    return this;
	}

	/**
	* The reason code for the pending refund state.
	*/
	private String reasonCode;

	public String reasonCode() { return reasonCode; }
	
	public Refund reasonCode(String reasonCode) {
	    this.reasonCode = reasonCode;
	    return this;
	}

	/**
	* Details Indicate whether Refund amount is funded by Payee or other funding accounts
	*/
	private String refundFundingType;

	public String refundFundingType() { return refundFundingType; }
	
	public Refund refundFundingType(String refundFundingType) {
	    this.refundFundingType = refundFundingType;
	    return this;
	}

	/**
	* Paypal assigned reason codes for the refund
	*/
	private String refundReasonCode;

	public String refundReasonCode() { return refundReasonCode; }
	
	public Refund refundReasonCode(String refundReasonCode) {
	    this.refundReasonCode = refundReasonCode;
	    return this;
	}

	/**
	* The ID of the sale transaction being refunded. 
	*/
	private String saleId;

	public String saleId() { return saleId; }
	
	public Refund saleId(String saleId) {
	    this.saleId = saleId;
	    return this;
	}

	/**
	* The state of the refund.
	*/
	private String state;

	public String state() { return state; }
	
	public Refund state(String state) {
	    this.state = state;
	    return this;
	}

	/**
	* The date and time when the resource was last updated, in [Internet date and time format](http://tools.ietf.org/html/rfc3339#section-5.6).
	*/
	private String updateTime;

	public String updateTime() { return updateTime; }
	
	public Refund updateTime(String updateTime) {
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
        if (refundFundingType != null) {
            serialized.put("refund_funding_type", this.refundFundingType);
        }
        if (refundReasonCode != null) {
            serialized.put("refund_reason_code", this.refundReasonCode);
        }
        if (saleId != null) {
            serialized.put("sale_id", this.saleId);
        }
        if (state != null) {
            serialized.put("state", this.state);
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
        if (values.containsKey("refund_funding_type")) {
            this.refundFundingType = (String) values.get("refund_funding_type");
        }
        if (values.containsKey("refund_reason_code")) {
            this.refundReasonCode = (String) values.get("refund_reason_code");
        }
        if (values.containsKey("sale_id")) {
            this.saleId = (String) values.get("sale_id");
        }
        if (values.containsKey("state")) {
            this.state = (String) values.get("state");
        }
        if (values.containsKey("update_time")) {
            this.updateTime = (String) values.get("update_time");
        }
    }
}

