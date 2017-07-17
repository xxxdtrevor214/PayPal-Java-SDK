// This class was generated on Mon, 17 Jul 2017 10:51:10 PDT by version 0.01 of Braintree SDK Generator
// RefundRequest.java
// DO NOT EDIT
// @type object
// @json {"Type":"Refund Request","VariableName":"","Description":"A refund request.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":[{"Type":"Amount","VariableName":"amount","Description":"The payment amount, with break-ups.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"description","Description":"The refund description. Maximum length is 255 single-byte alphanumeric characters.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"invoice_number","Description":"The invoice number that is used to track this payment. Maximum length is 127 single-byte alphanumeric characters.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Item","VariableName":"items","Description":"List of items.","IsArray":true,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Payer Info","VariableName":"payer_info","Description":"The payer information.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"reason","Description":"The refund reason description.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"boolean","VariableName":"refund_advice","Description":"Indicates whether store credit was already given to the payer.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"refund_source","Description":"The PayPal funding source type, such as balance or eCheck, to use for auto refund.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Name and Value Pair","VariableName":"supplementary_data","Description":"Set of optional data","IsArray":true,"ReadOnly":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.payments.object;

import java.util.Map;
import java.util.List;
import com.google.gson.annotations.SerializedName;
/**
 * A refund request.
 */
public class RefundRequest {

	/**
	* The payment amount, with break-ups.
	*/
	@SerializedName("amount")
	private Amount amount;

	public Amount amount() { return amount; }
	
	public RefundRequest amount(Amount amount) {
	    this.amount = amount;
	    return this;
	}

	/**
	* The refund description. Maximum length is 255 single-byte alphanumeric characters.
	*/
	@SerializedName("description")
	private String description;

	public String description() { return description; }
	
	public RefundRequest description(String description) {
	    this.description = description;
	    return this;
	}

	/**
	* The invoice number that is used to track this payment. Maximum length is 127 single-byte alphanumeric characters.
	*/
	@SerializedName("invoice_number")
	private String invoiceNumber;

	public String invoiceNumber() { return invoiceNumber; }
	
	public RefundRequest invoiceNumber(String invoiceNumber) {
	    this.invoiceNumber = invoiceNumber;
	    return this;
	}

	/**
	* List of items.
	*/
	@SerializedName("items")
	private List<Item> items;

	public List<Item> items() { return items; }
	
	public RefundRequest items(List<Item> items) {
	    this.items = items;
	    return this;
	}

	/**
	* The payer information.
	*/
	@SerializedName("payer_info")
	private PayerInfo payerInfo;

	public PayerInfo payerInfo() { return payerInfo; }
	
	public RefundRequest payerInfo(PayerInfo payerInfo) {
	    this.payerInfo = payerInfo;
	    return this;
	}

	/**
	* The refund reason description.
	*/
	@SerializedName("reason")
	private String reason;

	public String reason() { return reason; }
	
	public RefundRequest reason(String reason) {
	    this.reason = reason;
	    return this;
	}

	/**
	* Indicates whether store credit was already given to the payer.
	*/
	@SerializedName("refund_advice")
	private Boolean refundAdvice;

	public Boolean refundAdvice() { return refundAdvice; }
	
	public RefundRequest refundAdvice(Boolean refundAdvice) {
	    this.refundAdvice = refundAdvice;
	    return this;
	}

	/**
	* The PayPal funding source type, such as balance or eCheck, to use for auto refund.
	*/
	@SerializedName("refund_source")
	private String refundSource;

	public String refundSource() { return refundSource; }
	
	public RefundRequest refundSource(String refundSource) {
	    this.refundSource = refundSource;
	    return this;
	}

	/**
	* Set of optional data
	*/
	@SerializedName("supplementary_data")
	private List<NameAndValuePair> supplementaryData;

	public List<NameAndValuePair> supplementaryData() { return supplementaryData; }
	
	public RefundRequest supplementaryData(List<NameAndValuePair> supplementaryData) {
	    this.supplementaryData = supplementaryData;
	    return this;
	}
}
