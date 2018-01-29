// This class was generated on Mon, 29 Jan 2018 12:12:00 PST by version 0.1.0-dev+ecea6f of Braintree SDK Generator
// RefundDetail.java
// @version 0.1.0-dev+ecea6f
// @type object
// @data H4sIAAAAAAAC/7yVUW/bNhDH3/cpDupLYshWmnQr5res6QBja2qkxrAhCJozebJuo0iOPNXThn73gZKsTHGBbWiRRx+Pp//vf3fmX9mm9ZQtsxsqG6vhigTZZHn2EwbGraFrrNNxlmc/UPvw44qiCuyFnc2W2cp+cKzY7iD0ZXRXJi6yPLsMAdv+I2d5dkOo31rTZssSTaQU+L3hQHoMrIPzFIQpZsvbUd6rJgSyqj1WhrVrrEz0jaGpyu8wErjtr6QEShcAjYGSLVrFaOADmoYgkEEhDSWT0RFOtmjQKsrBY1uTFdAN5UCiFqdfjC1KYLs7JlMD8yunacKnHsyYEl6AIREKcMgA5TQBRtBUsiUN2xZW797Ci/PnLz+3ObYx5mP+rxSdrxP5h8hUe980aDyIg2vQvGMBLBONVASaFNdoIkTyGFBS/x6w2I5YXWvTDfQ+OB8YhaZ+/C9wCc2nuO/+A7lGmYIPgSn3JsEljfuKbCecu20i2GMc9on0Asa80oUaBTjCrG3bdjafvXkzm8+0nsHsz1n+yJbblRUKlgSuUKjYcE3wfVfh7qQS8cuiEOdMXDBJuXBhV1RSmyKU6uLi4ttnkVTSOf968c3pIl0E+gNrbyiH+/Oz5y/mZ+fz85ewfre5f6J5su6Rq0Ng6uolpDBgjE5xt9F7lqqzt7f0idRKQBux8/A964nuo6PjuVhdgSs70Wts12gOf6//uLqAg8wHwvv15S/ryx/vx/TW01PxpuMJZR84ZntElCTCympWKBTTMkg1rP6QktbBI2uQKrhmVx0qdDOZZhyNadPI8/galcbt+825DaRc0EOtu5NCOxUL9FyM2cWzYfHi+z553iefQk1SOQ2x8d4Fib3Hr3/evL65fuxy97FP+Z/2dSiQnhcXYIvqtz0GDcrVHoW3bFjaL9Knu49f/Q0AAP//
// DO NOT EDIT
package com.paypal.sdk.v1.invoices;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * Invoicing refund details.
 */
@Model
public class RefundDetail {

    // Required default constructor
    public RefundDetail() {}

	/**
	* Base object for all financial value related fields (balance, payment due, etc.)
	*/
	@SerializedName("amount")
	private Currency amount;

	public Currency amount() { return amount; }
	
	public RefundDetail amount(Currency amount) {
	    this.amount = amount;
	    return this;
	}

	/**
	* The date when the invoice was refunded. The date format is *yyyy*-*MM*-*dd* *z*, as defined in [Internet Date/Time Format](http://tools.ietf.org/html/rfc3339#section-5.6). For example, `2014-02-27 PST`.
	*/
	@SerializedName("date")
	private String date;

	public String date() { return date; }
	
	public RefundDetail date(String date) {
	    this.date = date;
	    return this;
	}

	/**
	* A note associated with the refund.
	*/
	@SerializedName("note")
	private String note;

	public String note() { return note; }
	
	public RefundDetail note(String note) {
	    this.note = note;
	    return this;
	}

	/**
	* The ID of the PayPal refund transaction. Required with the `PAYPAL` refund type.
	*/
	@SerializedName("transaction_id")
	private String transactionId;

	public String transactionId() { return transactionId; }
	
	public RefundDetail transactionId(String transactionId) {
	    this.transactionId = transactionId;
	    return this;
	}

	/**
	* The PayPal refund type. Indicates whether the refund was paid through PayPal or externally in invoicing flow. The [record refund](/docs/api/invoicing/#invoices_record-refund) method supports the `EXTERNAL` refund type. The `PAYPAL` refund type is supported for backward compatibility.
	*/
	@SerializedName("type")
	private String type;

	public String type() { return type; }
	
	public RefundDetail type(String type) {
	    this.type = type;
	    return this;
	}
}
