// This class was generated on Mon, 31 Jul 2017 18:27:14 UTC by version 0.1 of Braintree SDK Generator
// Amount.java
// DO NOT EDIT
// @type object
// @json {"Type":"Amount","VariableName":"","Description":"The payment amount, with break-ups.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":[{"Type":"string","VariableName":"currency","Description":"The [three-character ISO-4217 currency code](https://developer.paypal.com/docs/classic/api/currency_codes/). PayPal does not support all currencies.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null},{"Type":"Amount Details","VariableName":"details","Description":"The additional details about the payment amount.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"total","Description":"The total amount charged to the payee by the payer. For refunds, represents the amount that the payee refunds to the original payer. Maximum length is 10 characters. Supports two decimal places.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null}]}

package com.paypal.sdk.payments.object;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.serializer.Serializable;
import com.braintreepayments.http.serializer.Deserializable;

/**
 * The payment amount, with break-ups.
 */
public class Amount implements Serializable, Deserializable {

    // Required default constructor
    public Amount() {}

	/**
	* REQUIRED
	* The [three-character ISO-4217 currency code](https://developer.paypal.com/docs/classic/api/currency_codes/). PayPal does not support all currencies.
	*/
	private String currency;

	public String currency() { return currency; }
	
	public Amount currency(String currency) {
	    this.currency = currency;
	    return this;
	}

	/**
	* The additional details about the payment amount.
	*/
	private AmountDetails details;

	public AmountDetails details() { return details; }
	
	public Amount details(AmountDetails details) {
	    this.details = details;
	    return this;
	}

	/**
	* REQUIRED
	* The total amount charged to the payee by the payer. For refunds, represents the amount that the payee refunds to the original payer. Maximum length is 10 characters. Supports two decimal places.
	*/
	private String total;

	public String total() { return total; }
	
	public Amount total(String total) {
	    this.total = total;
	    return this;
	}

    @Override
    public void serialize(Map<String, Object> serialized) {
        if (currency != null) {
            serialized.put("currency", this.currency);
        }
        if (details != null) {
            serialized.put("details", this.details);
        }
        if (total != null) {
            serialized.put("total", this.total);
        }
    }

    @Override
    public void deserialize(Map<String, Object> values) {
        if (values.containsKey("currency")) {
            this.currency = (String) values.get("currency");
        }
        if (values.containsKey("details")) {
            this.details = new AmountDetails();
            this.details.deserialize((Map<String, Object>) values.get("details"));
        }
        if (values.containsKey("total")) {
            this.total = (String) values.get("total");
        }
    }
}

