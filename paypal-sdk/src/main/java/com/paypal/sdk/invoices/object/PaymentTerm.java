// This class was generated on Mon, 17 Jul 2017 10:41:00 PDT by version 0.01 of Braintree SDK Generator
// PaymentTerm.java
// DO NOT EDIT
// @type object
// @json {"Type":"Payment Term","VariableName":"","Description":"The payment term of the invoice. If you specify `term_type`, you cannot specify `due_date`, and vice versa.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":[{"Type":"string","VariableName":"due_date","Description":"The date when the invoice payment is due. This date must be a future date. Date format is *yyyy*-*MM*-*dd* *z*, as defined in [Internet Date/Time Format](http://tools.ietf.org/html/rfc3339#section-5.6).","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"term_type","Description":"The term by which the invoice payment is due.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.invoices.object;

import java.util.Map;
import java.util.List;
import com.google.gson.annotations.SerializedName;
/**
 * The payment term of the invoice. If you specify `term_type`, you cannot specify `due_date`, and vice versa.
 */
public class PaymentTerm {

	/**
	* The date when the invoice payment is due. This date must be a future date. Date format is *yyyy*-*MM*-*dd* *z*, as defined in [Internet Date/Time Format](http://tools.ietf.org/html/rfc3339#section-5.6).
	*/
	@SerializedName("due_date")
	private String dueDate;

	public String dueDate() { return dueDate; }
	
	public PaymentTerm dueDate(String dueDate) {
	    this.dueDate = dueDate;
	    return this;
	}

	/**
	* The term by which the invoice payment is due.
	*/
	@SerializedName("term_type")
	private String termType;

	public String termType() { return termType; }
	
	public PaymentTerm termType(String termType) {
	    this.termType = termType;
	    return this;
	}
}
