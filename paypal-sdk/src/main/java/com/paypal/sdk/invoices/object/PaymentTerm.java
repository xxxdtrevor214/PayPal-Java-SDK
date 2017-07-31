// This class was generated on Sun, 30 Jul 2017 11:04:05 PDT by version 0.1 of Braintree SDK Generator
// PaymentTerm.java
// DO NOT EDIT
// @type object
// @json {"Type":"Payment Term","VariableName":"","Description":"The payment term of the invoice. If you specify `term_type`, you cannot specify `due_date`, and vice versa.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":[{"Type":"string","VariableName":"due_date","Description":"The date when the invoice payment is due. This date must be a future date. Date format is *yyyy*-*MM*-*dd* *z*, as defined in [Internet Date/Time Format](http://tools.ietf.org/html/rfc3339#section-5.6).","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"term_type","Description":"The term by which the invoice payment is due.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.invoices.object;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.serializer.Serializable;
import com.braintreepayments.http.serializer.Deserializable;

/**
 * The payment term of the invoice. If you specify `term_type`, you cannot specify `due_date`, and vice versa.
 */
public class PaymentTerm implements Serializable, Deserializable {

    // Required default constructor
    public PaymentTerm() {}

	/**
	* The date when the invoice payment is due. This date must be a future date. Date format is *yyyy*-*MM*-*dd* *z*, as defined in [Internet Date/Time Format](http://tools.ietf.org/html/rfc3339#section-5.6).
	*/
	private String dueDate;

	public String dueDate() { return dueDate; }
	
	public PaymentTerm dueDate(String dueDate) {
	    this.dueDate = dueDate;
	    return this;
	}

	/**
	* The term by which the invoice payment is due.
	*/
	private String termType;

	public String termType() { return termType; }
	
	public PaymentTerm termType(String termType) {
	    this.termType = termType;
	    return this;
	}

    @Override
    public void serialize(Map<String, Object> serialized) {
        if (dueDate != null) {
            serialized.put("due_date", this.dueDate);
        }
        if (termType != null) {
            serialized.put("term_type", this.termType);
        }
    }

    @Override
    public void deserialize(Map<String, Object> values) {
        if (values.containsKey("due_date")) {
            this.dueDate = (String) values.get("due_date");
        }
        if (values.containsKey("term_type")) {
            this.termType = (String) values.get("term_type");
        }
    }
}

