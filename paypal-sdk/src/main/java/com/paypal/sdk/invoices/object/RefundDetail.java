// This class was generated on Sun, 30 Jul 2017 11:04:05 PDT by version 0.1 of Braintree SDK Generator
// RefundDetail.java
// DO NOT EDIT
// @type object
// @json {"Type":"Refund Detail","VariableName":"","Description":"Invoicing refund details.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":[{"Type":"Currency","VariableName":"amount","Description":"Base object for all financial value related fields (balance, payment due, etc.)","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"date","Description":"The date when the invoice was refunded. The date format is *yyyy*-*MM*-*dd* *z*, as defined in [Internet Date/Time Format](http://tools.ietf.org/html/rfc3339#section-5.6). For example, `2014-02-27 PST`.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"note","Description":"A note associated with the refund.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"transaction_id","Description":"The ID of the PayPal refund transaction. Required with the `PAYPAL` refund type.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"type","Description":"The PayPal refund type. Indicates whether the refund was paid through PayPal or externally in invoicing flow. The [record refund](/docs/api/invoicing/#invoices_record-refund) method supports the `EXTERNAL` refund type. The `PAYPAL` refund type is supported for backward compatibility.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.invoices.object;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.serializer.Serializable;
import com.braintreepayments.http.serializer.Deserializable;

/**
 * Invoicing refund details.
 */
public class RefundDetail implements Serializable, Deserializable {

    // Required default constructor
    public RefundDetail() {}

	/**
	* Base object for all financial value related fields (balance, payment due, etc.)
	*/
	private Currency amount;

	public Currency amount() { return amount; }
	
	public RefundDetail amount(Currency amount) {
	    this.amount = amount;
	    return this;
	}

	/**
	* The date when the invoice was refunded. The date format is *yyyy*-*MM*-*dd* *z*, as defined in [Internet Date/Time Format](http://tools.ietf.org/html/rfc3339#section-5.6). For example, `2014-02-27 PST`.
	*/
	private String date;

	public String date() { return date; }
	
	public RefundDetail date(String date) {
	    this.date = date;
	    return this;
	}

	/**
	* A note associated with the refund.
	*/
	private String note;

	public String note() { return note; }
	
	public RefundDetail note(String note) {
	    this.note = note;
	    return this;
	}

	/**
	* The ID of the PayPal refund transaction. Required with the `PAYPAL` refund type.
	*/
	private String transactionId;

	public String transactionId() { return transactionId; }
	
	public RefundDetail transactionId(String transactionId) {
	    this.transactionId = transactionId;
	    return this;
	}

	/**
	* The PayPal refund type. Indicates whether the refund was paid through PayPal or externally in invoicing flow. The [record refund](/docs/api/invoicing/#invoices_record-refund) method supports the `EXTERNAL` refund type. The `PAYPAL` refund type is supported for backward compatibility.
	*/
	private String type;

	public String type() { return type; }
	
	public RefundDetail type(String type) {
	    this.type = type;
	    return this;
	}

    @Override
    public void serialize(Map<String, Object> serialized) {
        if (amount != null) {
            serialized.put("amount", this.amount);
        }
        if (date != null) {
            serialized.put("date", this.date);
        }
        if (note != null) {
            serialized.put("note", this.note);
        }
        if (transactionId != null) {
            serialized.put("transaction_id", this.transactionId);
        }
        if (type != null) {
            serialized.put("type", this.type);
        }
    }

    @Override
    public void deserialize(Map<String, Object> values) {
        if (values.containsKey("amount")) {
            this.amount = new Currency();
            this.amount.deserialize((Map<String, Object>) values.get("amount"));
        }
        if (values.containsKey("date")) {
            this.date = (String) values.get("date");
        }
        if (values.containsKey("note")) {
            this.note = (String) values.get("note");
        }
        if (values.containsKey("transaction_id")) {
            this.transactionId = (String) values.get("transaction_id");
        }
        if (values.containsKey("type")) {
            this.type = (String) values.get("type");
        }
    }
}

