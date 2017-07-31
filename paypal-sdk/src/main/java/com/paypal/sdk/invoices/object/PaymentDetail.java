// This class was generated on Sun, 30 Jul 2017 11:04:05 PDT by version 0.1 of Braintree SDK Generator
// PaymentDetail.java
// DO NOT EDIT
// @type object
// @json {"Type":"Payment Detail","VariableName":"","Description":"Payment details.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":[{"Type":"Currency","VariableName":"amount","Description":"Base object for all financial value related fields (balance, payment due, etc.)","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"date","Description":"The date when the invoice was paid. The date format is *yyyy*-*MM*-*dd* *z*, as defined in [Internet Date/Time Format](http://tools.ietf.org/html/rfc3339#section-5.6).","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"method","Description":"The payment mode or method. Required with the `EXTERNAL` payment type.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null},{"Type":"string","VariableName":"note","Description":"Optional. A note associated with the payment.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"transaction_id","Description":"The ID for a PayPal payment transaction. Required with the `PAYPAL` payment type.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"transaction_type","Description":"The transaction type.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"type","Description":"The payment type in an invoicing flow. The [record refund](/docs/api/invoicing/#invoices_record-refund) method supports the `EXTERNAL` refund type. The `PAYPAL` refund type is supported for backward compatibility.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.invoices.object;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.serializer.Serializable;
import com.braintreepayments.http.serializer.Deserializable;

/**
 * Payment details.
 */
public class PaymentDetail implements Serializable, Deserializable {

    // Required default constructor
    public PaymentDetail() {}

	/**
	* Base object for all financial value related fields (balance, payment due, etc.)
	*/
	private Currency amount;

	public Currency amount() { return amount; }
	
	public PaymentDetail amount(Currency amount) {
	    this.amount = amount;
	    return this;
	}

	/**
	* The date when the invoice was paid. The date format is *yyyy*-*MM*-*dd* *z*, as defined in [Internet Date/Time Format](http://tools.ietf.org/html/rfc3339#section-5.6).
	*/
	private String date;

	public String date() { return date; }
	
	public PaymentDetail date(String date) {
	    this.date = date;
	    return this;
	}

	/**
	* REQUIRED
	* The payment mode or method. Required with the `EXTERNAL` payment type.
	*/
	private String method;

	public String method() { return method; }
	
	public PaymentDetail method(String method) {
	    this.method = method;
	    return this;
	}

	/**
	* Optional. A note associated with the payment.
	*/
	private String note;

	public String note() { return note; }
	
	public PaymentDetail note(String note) {
	    this.note = note;
	    return this;
	}

	/**
	* The ID for a PayPal payment transaction. Required with the `PAYPAL` payment type.
	*/
	private String transactionId;

	public String transactionId() { return transactionId; }
	
	public PaymentDetail transactionId(String transactionId) {
	    this.transactionId = transactionId;
	    return this;
	}

	/**
	* The transaction type.
	*/
	private String transactionType;

	public String transactionType() { return transactionType; }
	
	public PaymentDetail transactionType(String transactionType) {
	    this.transactionType = transactionType;
	    return this;
	}

	/**
	* The payment type in an invoicing flow. The [record refund](/docs/api/invoicing/#invoices_record-refund) method supports the `EXTERNAL` refund type. The `PAYPAL` refund type is supported for backward compatibility.
	*/
	private String type;

	public String type() { return type; }
	
	public PaymentDetail type(String type) {
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
        if (method != null) {
            serialized.put("method", this.method);
        }
        if (note != null) {
            serialized.put("note", this.note);
        }
        if (transactionId != null) {
            serialized.put("transaction_id", this.transactionId);
        }
        if (transactionType != null) {
            serialized.put("transaction_type", this.transactionType);
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
        if (values.containsKey("method")) {
            this.method = (String) values.get("method");
        }
        if (values.containsKey("note")) {
            this.note = (String) values.get("note");
        }
        if (values.containsKey("transaction_id")) {
            this.transactionId = (String) values.get("transaction_id");
        }
        if (values.containsKey("transaction_type")) {
            this.transactionType = (String) values.get("transaction_type");
        }
        if (values.containsKey("type")) {
            this.type = (String) values.get("type");
        }
    }
}

