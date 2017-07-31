// This class was generated on Mon, 31 Jul 2017 18:27:14 UTC by version 0.1 of Braintree SDK Generator
// Payer.java
// DO NOT EDIT
// @type object
// @json {"Type":"Payer","VariableName":"","Description":"A payer that funds a payment.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":[{"Type":"Funding Instrument","VariableName":"funding_instruments","Description":"A list of funding instruments for the current payment. Required when the `payment_method` is `credit_card` but does not apply when the `payment_method` is `paypal`. For credit card payments, the list must include either a `credit_card` object or `credit_card_token` object. You can specify only one funding instrument for a payment. If you specify more than one instrument in the list, the payment is declined.","IsArray":true,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Payer Info","VariableName":"payer_info","Description":"The payer information.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"payment_method","Description":"The payment method. Value is PayPal Wallet payment, bank direct debit, or direct credit card.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"status","Description":"The status of payer's PayPal account.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.payments.object;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.serializer.Serializable;
import com.braintreepayments.http.serializer.Deserializable;

/**
 * A payer that funds a payment.
 */
public class Payer implements Serializable, Deserializable {

    // Required default constructor
    public Payer() {}

	/**
	* A list of funding instruments for the current payment. Required when the `payment_method` is `credit_card` but does not apply when the `payment_method` is `paypal`. For credit card payments, the list must include either a `credit_card` object or `credit_card_token` object. You can specify only one funding instrument for a payment. If you specify more than one instrument in the list, the payment is declined.
	*/
	private List<FundingInstrument> fundingInstruments;

	public List<FundingInstrument> fundingInstruments() { return fundingInstruments; }
	
	public Payer fundingInstruments(List<FundingInstrument> fundingInstruments) {
	    this.fundingInstruments = fundingInstruments;
	    return this;
	}

	/**
	* The payer information.
	*/
	private PayerInfo payerInfo;

	public PayerInfo payerInfo() { return payerInfo; }
	
	public Payer payerInfo(PayerInfo payerInfo) {
	    this.payerInfo = payerInfo;
	    return this;
	}

	/**
	* The payment method. Value is PayPal Wallet payment, bank direct debit, or direct credit card.
	*/
	private String paymentMethod;

	public String paymentMethod() { return paymentMethod; }
	
	public Payer paymentMethod(String paymentMethod) {
	    this.paymentMethod = paymentMethod;
	    return this;
	}

	/**
	* The status of payer's PayPal account.
	*/
	private String status;

	public String status() { return status; }
	
	public Payer status(String status) {
	    this.status = status;
	    return this;
	}

    @Override
    public void serialize(Map<String, Object> serialized) {
        if (fundingInstruments != null) {
            serialized.put("funding_instruments", this.fundingInstruments);
        }
        if (payerInfo != null) {
            serialized.put("payer_info", this.payerInfo);
        }
        if (paymentMethod != null) {
            serialized.put("payment_method", this.paymentMethod);
        }
        if (status != null) {
            serialized.put("status", this.status);
        }
    }

    @Override
    public void deserialize(Map<String, Object> values) {
        if (values.containsKey("funding_instruments")) {
            this.fundingInstruments = new ArrayList<>();
				List<Map<String, Object>> nestedValues = (List<Map<String, Object>>) values.get("funding_instruments");
				for (Map<String, Object> nestedValue : nestedValues) {
					FundingInstrument nested = new FundingInstrument();
					nested.deserialize(nestedValue);
					this.fundingInstruments.add(nested);
                }
        }
        if (values.containsKey("payer_info")) {
            this.payerInfo = new PayerInfo();
            this.payerInfo.deserialize((Map<String, Object>) values.get("payer_info"));
        }
        if (values.containsKey("payment_method")) {
            this.paymentMethod = (String) values.get("payment_method");
        }
        if (values.containsKey("status")) {
            this.status = (String) values.get("status");
        }
    }
}

