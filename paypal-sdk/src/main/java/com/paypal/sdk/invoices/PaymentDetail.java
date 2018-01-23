// This class was generated on Mon, 22 Jan 2018 14:43:26 PST by version 0.1.0-dev+8c35d5 of Braintree SDK Generator
// PaymentDetail.java
// @version 0.1.0-dev+8c35d5
// @type object
// @data H4sIAAAAAAAC/7yVzW7rNhCF932Kge4mEWSprfuDeude3wJBm8RIjaJFYCRjcmSzpUiWHMVQi7x7oR/LVpwgvYiRXTIcUuc7hxz/Gy0qR9EkmmNVkGGYEaPSURL9hl7hStMVFvV6lEQ/U7X/Z0ZBeOVYWXOwWza7Qxol0dR7rNrDv0yiG0J5bXQVTXLUgerC36XyJPvC3FtHnhWFaHLby/pYek9GVMeCsLCl4YGsvjQU9yMGArv6kwRDbj2g1pArg0Yo1PCAuiTwpJFJQq5IywBnK9RoBCXgdmQlJUAs0vOTsQX2yqyPyUTH/NFKGvCJvRlDwjFoYiYPuw4QVhJgAEm5MiRhVcHFr9fwzddfff/WcEyp9WPyKkXj60D+rjLU3oYGpQO2cAVSrRUD5jUNbwgkCVWgDhDIoUeu89tjKdNjNdHWO9A5b51XyDT047PA2ZfPcS//B7lEHoJ3hSH3ooarNW43ZBrhyjxYJQi2GMChkin0Pbn1BTKoAHFVVVU8ii8v41EsZQzxP3HyxJLbC8PkDTHMkClbqILgp+aE5dmG2U2yjK3VIVXEeWr9OttwoTOfi/F4/MOHQKLWOPo2/e78nS5LQbyxcmBaXzq2bfcmi/qSWw9tawo7JbBVvGksvf/0++LTzdX0l/t+E1fuJDfhdShjn9yDrjAEum7+QJ3CFOoGwBCsUM006jk68e+UBns0AZtLcKeGqRwtHadzMWunLMyxmqPeG7/f+mxU8+kf8zcFdRrg+rMvIneLx9AHTe8q/EjsSwIPXa1nBJpu3iizhlzbbTttbj0J6yV4yksjl2eZtCJk6FTWd2cfukEV7trmUdt83r1DCKVz1nN4+gLbttae5mN95Acr9YzrDqh/jq2HFYq/tuglCFs4ZLVSWnF1EoOXj1/8BwAA//8=
// DO NOT EDIT
package com.paypal.sdk.invoices;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * Payment details.
 */
@Model
public class PaymentDetail {

    // Required default constructor
    public PaymentDetail() {}

	/**
	* Base object for all financial value related fields (balance, payment due, etc.)
	*/
	@SerializedName("amount")
	private Currency amount;

	public Currency amount() { return amount; }
	
	public PaymentDetail amount(Currency amount) {
	    this.amount = amount;
	    return this;
	}

	/**
	* The date when the invoice was paid. The date format is *yyyy*-*MM*-*dd* *z*, as defined in [Internet Date/Time Format](http://tools.ietf.org/html/rfc3339#section-5.6).
	*/
	@SerializedName("date")
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
	@SerializedName("method")
	private String method;

	public String method() { return method; }
	
	public PaymentDetail method(String method) {
	    this.method = method;
	    return this;
	}

	/**
	* Optional. A note associated with the payment.
	*/
	@SerializedName("note")
	private String note;

	public String note() { return note; }
	
	public PaymentDetail note(String note) {
	    this.note = note;
	    return this;
	}

	/**
	* The ID for a PayPal payment transaction. Required with the `PAYPAL` payment type.
	*/
	@SerializedName("transaction_id")
	private String transactionId;

	public String transactionId() { return transactionId; }
	
	public PaymentDetail transactionId(String transactionId) {
	    this.transactionId = transactionId;
	    return this;
	}

	/**
	* The transaction type.
	*/
	@SerializedName("transaction_type")
	private String transactionType;

	public String transactionType() { return transactionType; }
	
	public PaymentDetail transactionType(String transactionType) {
	    this.transactionType = transactionType;
	    return this;
	}

	/**
	* The payment type in an invoicing flow. The [record refund](/docs/api/invoicing/#invoices_record-refund) method supports the `EXTERNAL` refund type. The `PAYPAL` refund type is supported for backward compatibility.
	*/
	@SerializedName("type")
	private String type;

	public String type() { return type; }
	
	public PaymentDetail type(String type) {
	    this.type = type;
	    return this;
	}
}
