// This class was generated on Mon, 31 Jul 2017 18:27:14 UTC by version 0.1 of Braintree SDK Generator
// Order.java
// DO NOT EDIT
// @type object
// @json {"Type":"Order","VariableName":"","Description":"An order transaction.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":[{"Type":"Amount","VariableName":"amount","Description":"The payment amount, with break-ups.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null},{"Type":"string","VariableName":"create_time","Description":"The date and time when the resource was created, , in [Internet date and time format](http://tools.ietf.org/html/rfc3339#section-5.6).","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"FMF Details","VariableName":"fmf_details","Description":"The [Fraud Management Filter (FMF)](/docs/classic/fmf/integration-guide/FMFSummary/) details.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"id","Description":"The ID of the order transaction.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Link Description Object","VariableName":"links","Description":"","IsArray":true,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"parent_payment","Description":"The ID of the payment on which this transaction is based.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"payment_mode","Description":"The transaction payment mode.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"pending_reason","Description":"[DEPRECATED] The reason code for the pending transaction state. Obsolete. Use `reason_code` instead.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"protection_eligibility","Description":"The level of seller protection in effect for the transaction.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"protection_eligibility_type","Description":"The kind of seller protection in effect for the transaction. Returned only when the `protection_eligibility` property is `ELIGIBLE` or `PARTIALLY_ELIGIBLE`. Supported only when the `payment_method` is `paypal`. One or both of these values can be returned:\u003cul\u003e\u003cli\u003e\u003ccode\u003eITEM_NOT_RECEIVED_ELIGIBLE\u003c/code\u003e. Sellers are protected against claims for items not received.\u003c/li\u003e\u003cli\u003e\u003ccode\u003eUNAUTHORIZED_PAYMENT_ELIGIBLE\u003c/code\u003e. Sellers are protected against claims for unauthorized payments.\u003c/li\u003e\u003c/ul\u003e","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"reason_code","Description":"The reason code that describes why the transaction state is pending or reversed. Eventually, this parameter will replace the `pending_reason` parameter. Supported only when the `payment_method` is `paypal`.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"reference_id","Description":"The ID of the purchase unit that is associated with this object. Obsolete. Used only in `cart_base`.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"state","Description":"The order transaction state.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"update_time","Description":"The date and time when the resource was last updated, in [Internet date and time format](http://tools.ietf.org/html/rfc3339#section-5.6).","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.payments.object;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.serializer.Serializable;
import com.braintreepayments.http.serializer.Deserializable;

/**
 * An order transaction.
 */
public class Order implements Serializable, Deserializable {

    // Required default constructor
    public Order() {}

	/**
	* REQUIRED
	* The payment amount, with break-ups.
	*/
	private Amount amount;

	public Amount amount() { return amount; }
	
	public Order amount(Amount amount) {
	    this.amount = amount;
	    return this;
	}

	/**
	* The date and time when the resource was created, , in [Internet date and time format](http://tools.ietf.org/html/rfc3339#section-5.6).
	*/
	private String createTime;

	public String createTime() { return createTime; }
	
	public Order createTime(String createTime) {
	    this.createTime = createTime;
	    return this;
	}

	/**
	* The [Fraud Management Filter (FMF)](/docs/classic/fmf/integration-guide/FMFSummary/) details.
	*/
	private FMFDetails fmfDetails;

	public FMFDetails fmfDetails() { return fmfDetails; }
	
	public Order fmfDetails(FMFDetails fmfDetails) {
	    this.fmfDetails = fmfDetails;
	    return this;
	}

	/**
	* The ID of the order transaction.
	*/
	private String id;

	public String id() { return id; }
	
	public Order id(String id) {
	    this.id = id;
	    return this;
	}

	/**
	*/
	private List<LinkDescriptionObject> links;

	public List<LinkDescriptionObject> links() { return links; }
	
	public Order links(List<LinkDescriptionObject> links) {
	    this.links = links;
	    return this;
	}

	/**
	* The ID of the payment on which this transaction is based.
	*/
	private String parentPayment;

	public String parentPayment() { return parentPayment; }
	
	public Order parentPayment(String parentPayment) {
	    this.parentPayment = parentPayment;
	    return this;
	}

	/**
	* The transaction payment mode.
	*/
	private String paymentMode;

	public String paymentMode() { return paymentMode; }
	
	public Order paymentMode(String paymentMode) {
	    this.paymentMode = paymentMode;
	    return this;
	}

	/**
	* [DEPRECATED] The reason code for the pending transaction state. Obsolete. Use `reason_code` instead.
	*/
	private String pendingReason;

	public String pendingReason() { return pendingReason; }
	
	public Order pendingReason(String pendingReason) {
	    this.pendingReason = pendingReason;
	    return this;
	}

	/**
	* The level of seller protection in effect for the transaction.
	*/
	private String protectionEligibility;

	public String protectionEligibility() { return protectionEligibility; }
	
	public Order protectionEligibility(String protectionEligibility) {
	    this.protectionEligibility = protectionEligibility;
	    return this;
	}

	/**
	* The kind of seller protection in effect for the transaction. Returned only when the `protection_eligibility` property is `ELIGIBLE` or `PARTIALLY_ELIGIBLE`. Supported only when the `payment_method` is `paypal`. One or both of these values can be returned:<ul><li><code>ITEM_NOT_RECEIVED_ELIGIBLE</code>. Sellers are protected against claims for items not received.</li><li><code>UNAUTHORIZED_PAYMENT_ELIGIBLE</code>. Sellers are protected against claims for unauthorized payments.</li></ul>
	*/
	private String protectionEligibilityType;

	public String protectionEligibilityType() { return protectionEligibilityType; }
	
	public Order protectionEligibilityType(String protectionEligibilityType) {
	    this.protectionEligibilityType = protectionEligibilityType;
	    return this;
	}

	/**
	* The reason code that describes why the transaction state is pending or reversed. Eventually, this parameter will replace the `pending_reason` parameter. Supported only when the `payment_method` is `paypal`.
	*/
	private String reasonCode;

	public String reasonCode() { return reasonCode; }
	
	public Order reasonCode(String reasonCode) {
	    this.reasonCode = reasonCode;
	    return this;
	}

	/**
	* The ID of the purchase unit that is associated with this object. Obsolete. Used only in `cart_base`.
	*/
	private String referenceId;

	public String referenceId() { return referenceId; }
	
	public Order referenceId(String referenceId) {
	    this.referenceId = referenceId;
	    return this;
	}

	/**
	* The order transaction state.
	*/
	private String state;

	public String state() { return state; }
	
	public Order state(String state) {
	    this.state = state;
	    return this;
	}

	/**
	* The date and time when the resource was last updated, in [Internet date and time format](http://tools.ietf.org/html/rfc3339#section-5.6).
	*/
	private String updateTime;

	public String updateTime() { return updateTime; }
	
	public Order updateTime(String updateTime) {
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
        if (paymentMode != null) {
            serialized.put("payment_mode", this.paymentMode);
        }
        if (pendingReason != null) {
            serialized.put("pending_reason", this.pendingReason);
        }
        if (protectionEligibility != null) {
            serialized.put("protection_eligibility", this.protectionEligibility);
        }
        if (protectionEligibilityType != null) {
            serialized.put("protection_eligibility_type", this.protectionEligibilityType);
        }
        if (reasonCode != null) {
            serialized.put("reason_code", this.reasonCode);
        }
        if (referenceId != null) {
            serialized.put("reference_id", this.referenceId);
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
        if (values.containsKey("create_time")) {
            this.createTime = (String) values.get("create_time");
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
        if (values.containsKey("payment_mode")) {
            this.paymentMode = (String) values.get("payment_mode");
        }
        if (values.containsKey("pending_reason")) {
            this.pendingReason = (String) values.get("pending_reason");
        }
        if (values.containsKey("protection_eligibility")) {
            this.protectionEligibility = (String) values.get("protection_eligibility");
        }
        if (values.containsKey("protection_eligibility_type")) {
            this.protectionEligibilityType = (String) values.get("protection_eligibility_type");
        }
        if (values.containsKey("reason_code")) {
            this.reasonCode = (String) values.get("reason_code");
        }
        if (values.containsKey("reference_id")) {
            this.referenceId = (String) values.get("reference_id");
        }
        if (values.containsKey("state")) {
            this.state = (String) values.get("state");
        }
        if (values.containsKey("update_time")) {
            this.updateTime = (String) values.get("update_time");
        }
    }
}

