// This class was generated on Mon, 22 Jan 2018 14:43:26 PST by version 0.1.0-dev+8c35d5 of Braintree SDK Generator
// PaymentTerm.java
// @version 0.1.0-dev+8c35d5
// @type object
// @data H4sIAAAAAAAC/6yS0WsUMRDG3/0rhviiy96ucCi4b0IRilSLLL6U0uY2k+7AJlknkytR+r9Ltrq940Af7FvyfTOT/L7kp+rzjKpTlzo79AI9slO1+qaZ9G7Cz9oVV9XqE+anzRnGgWkWCl51qh8R5t/9guwgWJARgfw+0IANnFvIIUGccSCb4bYU3Uie8bZejEF7H+TJNwlvjJZia29gTwPCHjnqRtXqA7POj7d+U6uvqM0XP2XVWT1FLML3RIxmFS45zMhCGFV3tfJGYfJ3p6R/jj4iPhBPyYsB9yP6Q+Y1D4pgEjbQj2VVSl2KAjsEDTZJ4scBDZwVzwZ2emmqcs652lQXF9WmMqaC6kdVg45g0JJHA+Th6twLskdZmtueHMLHZcL1q1Fk7tpWQphiQyi2CXzXjuKmlu2w3W7fv4w4FIzN2+bd6/8N1qdpeqj/me768EfxHqqn+S4/apfhfqRh/FvGz4Fw/fDiFwAAAP//
// DO NOT EDIT
package com.paypal.sdk.invoices;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The payment term of the invoice. If you specify `term_type`, you cannot specify `due_date`, and vice versa.
 */
@Model
public class PaymentTerm {

    // Required default constructor
    public PaymentTerm() {}

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
