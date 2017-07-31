// This class was generated on Mon, 31 Jul 2017 18:27:14 UTC by version 0.1 of Braintree SDK Generator
// RefundRequest.java
// DO NOT EDIT
// @type object
// @json {"Type":"Refund Request","VariableName":"","Description":"A refund request.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":[{"Type":"Amount","VariableName":"amount","Description":"The payment amount, with break-ups.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"description","Description":"The refund description. Maximum length is 255 single-byte alphanumeric characters.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"invoice_number","Description":"The invoice number that is used to track this payment. Maximum length is 127 single-byte alphanumeric characters.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Item","VariableName":"items","Description":"List of items.","IsArray":true,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Payer Info","VariableName":"payer_info","Description":"The payer information.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"reason","Description":"The refund reason description.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"boolean","VariableName":"refund_advice","Description":"Indicates whether store credit was already given to the payer.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"refund_source","Description":"The PayPal funding source type, such as balance or eCheck, to use for auto refund.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Name and Value Pair","VariableName":"supplementary_data","Description":"Set of optional data","IsArray":true,"ReadOnly":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.payments.object;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.serializer.Serializable;
import com.braintreepayments.http.serializer.Deserializable;

/**
 * A refund request.
 */
public class RefundRequest implements Serializable, Deserializable {

    // Required default constructor
    public RefundRequest() {}

	/**
	* The payment amount, with break-ups.
	*/
	private Amount amount;

	public Amount amount() { return amount; }
	
	public RefundRequest amount(Amount amount) {
	    this.amount = amount;
	    return this;
	}

	/**
	* The refund description. Maximum length is 255 single-byte alphanumeric characters.
	*/
	private String description;

	public String description() { return description; }
	
	public RefundRequest description(String description) {
	    this.description = description;
	    return this;
	}

	/**
	* The invoice number that is used to track this payment. Maximum length is 127 single-byte alphanumeric characters.
	*/
	private String invoiceNumber;

	public String invoiceNumber() { return invoiceNumber; }
	
	public RefundRequest invoiceNumber(String invoiceNumber) {
	    this.invoiceNumber = invoiceNumber;
	    return this;
	}

	/**
	* List of items.
	*/
	private List<Item> items;

	public List<Item> items() { return items; }
	
	public RefundRequest items(List<Item> items) {
	    this.items = items;
	    return this;
	}

	/**
	* The payer information.
	*/
	private PayerInfo payerInfo;

	public PayerInfo payerInfo() { return payerInfo; }
	
	public RefundRequest payerInfo(PayerInfo payerInfo) {
	    this.payerInfo = payerInfo;
	    return this;
	}

	/**
	* The refund reason description.
	*/
	private String reason;

	public String reason() { return reason; }
	
	public RefundRequest reason(String reason) {
	    this.reason = reason;
	    return this;
	}

	/**
	* Indicates whether store credit was already given to the payer.
	*/
	private Boolean refundAdvice;

	public Boolean refundAdvice() { return refundAdvice; }
	
	public RefundRequest refundAdvice(Boolean refundAdvice) {
	    this.refundAdvice = refundAdvice;
	    return this;
	}

	/**
	* The PayPal funding source type, such as balance or eCheck, to use for auto refund.
	*/
	private String refundSource;

	public String refundSource() { return refundSource; }
	
	public RefundRequest refundSource(String refundSource) {
	    this.refundSource = refundSource;
	    return this;
	}

	/**
	* Set of optional data
	*/
	private List<NameAndValuePair> supplementaryData;

	public List<NameAndValuePair> supplementaryData() { return supplementaryData; }
	
	public RefundRequest supplementaryData(List<NameAndValuePair> supplementaryData) {
	    this.supplementaryData = supplementaryData;
	    return this;
	}

    @Override
    public void serialize(Map<String, Object> serialized) {
        if (amount != null) {
            serialized.put("amount", this.amount);
        }
        if (description != null) {
            serialized.put("description", this.description);
        }
        if (invoiceNumber != null) {
            serialized.put("invoice_number", this.invoiceNumber);
        }
        if (items != null) {
            serialized.put("items", this.items);
        }
        if (payerInfo != null) {
            serialized.put("payer_info", this.payerInfo);
        }
        if (reason != null) {
            serialized.put("reason", this.reason);
        }
        if (refundAdvice != null) {
            serialized.put("refund_advice", this.refundAdvice);
        }
        if (refundSource != null) {
            serialized.put("refund_source", this.refundSource);
        }
        if (supplementaryData != null) {
            serialized.put("supplementary_data", this.supplementaryData);
        }
    }

    @Override
    public void deserialize(Map<String, Object> values) {
        if (values.containsKey("amount")) {
            this.amount = new Amount();
            this.amount.deserialize((Map<String, Object>) values.get("amount"));
        }
        if (values.containsKey("description")) {
            this.description = (String) values.get("description");
        }
        if (values.containsKey("invoice_number")) {
            this.invoiceNumber = (String) values.get("invoice_number");
        }
        if (values.containsKey("items")) {
            this.items = new ArrayList<>();
				List<Map<String, Object>> nestedValues = (List<Map<String, Object>>) values.get("items");
				for (Map<String, Object> nestedValue : nestedValues) {
					Item nested = new Item();
					nested.deserialize(nestedValue);
					this.items.add(nested);
                }
        }
        if (values.containsKey("payer_info")) {
            this.payerInfo = new PayerInfo();
            this.payerInfo.deserialize((Map<String, Object>) values.get("payer_info"));
        }
        if (values.containsKey("reason")) {
            this.reason = (String) values.get("reason");
        }
        if (values.containsKey("refund_advice")) {
            this.refundAdvice = (Boolean) values.get("refund_advice");
        }
        if (values.containsKey("refund_source")) {
            this.refundSource = (String) values.get("refund_source");
        }
        if (values.containsKey("supplementary_data")) {
            this.supplementaryData = new ArrayList<>();
				List<Map<String, Object>> nestedValues = (List<Map<String, Object>>) values.get("supplementary_data");
				for (Map<String, Object> nestedValue : nestedValues) {
					NameAndValuePair nested = new NameAndValuePair();
					nested.deserialize(nestedValue);
					this.supplementaryData.add(nested);
                }
        }
    }
}

