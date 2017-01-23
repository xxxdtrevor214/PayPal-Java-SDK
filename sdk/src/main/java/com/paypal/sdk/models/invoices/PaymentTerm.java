// This class was generated on Mon, 23 Jan 2017 15:08:17 PST by version 0.01 of Braintree SDK Generator
// PaymentTerm.java
// DO NOT EDIT
// @object payment_term
// @body {"Name":"due_date","WireType":{"Name":"string","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"term_type","WireType":{"Name":"string","IsArray":false},"ReadOnly":false,"Visibility":""}

package com.paypal.sdk.models.invoices;

import com.paypal.sdk.models.common.*;
import java.util.List;
import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * The payment term of the invoice. If you specify `term_type`, you cannot specify `due_date`, and vice versa.
 */
@Data
@Accessors(chain = true)
public class PaymentTerm {
    
	/**
	* The date when the invoice payment is due. This date must be a future date. Date format is *yyyy*-*MM*-*dd* *z*, as defined in [Internet Date/Time Format](http://tools.ietf.org/html/rfc3339#section-5.6).
	*/
	@SerializedName("due_date")
	private String dueDate;
    
	/**
	* An enumeration of the terms by which the invoice payment is due.
	*/
	@SerializedName("term_type")
	private String termType;
}
