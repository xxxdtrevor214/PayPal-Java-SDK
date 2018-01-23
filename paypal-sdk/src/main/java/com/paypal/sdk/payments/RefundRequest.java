// This class was generated on Mon, 22 Jan 2018 14:30:02 PST by version 0.1.0-dev+8c35d5 of Braintree SDK Generator
// RefundRequest.java
// @version 0.1.0-dev+8c35d5
// @type object
// @data H4sIAAAAAAAC/+yYUYvcNhDH3/spBj+1h3f30hYK+xYohVDaHM2RlzQss9LYHiJLzkjKnSn97sUr22uv78KFXJc87NOhmb/k0fxmtNL9k922DWXbTKiIVu+EPkbyIcuztyiMe0N/Yt35szz7ndrj4FfySrgJ7Gy2zV5Cmg/9/HWWZy9FsE2rX+fZX4T6tTVtti3QeOoMHyML6dFwI64hCUw+274b48LaRftAPKP9GNVomsd2WxE02NZkAyRJDnccKtgL4YdVbPzzReuDsC2X0aooQla1s3gnxmXE70IlRCtVoaAKJPDqzevVzz+++AWGaaCcpvffb7RTfsM2UCnYLbDRLKTCRsiHzSBedWK/+WENN9jeoAHtyIN1AXxsGicB0JhhaaYvS0mQeJIRG435Nz+BuNMUkI1fpufoOGbnaFsmB7XmbtjtI8kA9y4GCAvW/z/bkouwuxNsZuFPrcsNdF7ovFAQreEPvOc61mDIlqEC9vDiGkb0Poe7ilUFbJWJmvz273h9/ZOK5vCX0shwGr2hT2RBc8nBw54KJ3RIiybFNRpoHNuwTnM2w6T5ErdfKL9zw/ew6Er1iZ/bDBv4SkQnxfYYpwqtNmzLXUE0Q3XiWNIaBBdYXcjpvCANhUuz+xNl6LuaQuU0OGva9XnIsvVR0Ko51ql1yXT0XqDOoHbYPk/2TFB9xU2TPEemE+MS6eC8ED3bmTqkfKfZq8WF7CHv57HBoLx05Ld3zPq4Dy6gmTM+Gh9A2zv7u9i4FQ5U+zW8Kg6j/s0wogTDttfkECr20KRg264Krq6k38vV1aXLzwI+4P2MeRovcQe8vxB5BiLvn8Jk0YmPt+GsBzsUJWkIbngtEcG+HQeyht+c9O95n4NQI+TJBn+Q9KuECsNkfq8eFnXCJdt0WHULXmria9/STykJPQE/f0lP7cvy6P91M5Gt4S2aSB0ohPQ5cAV4tqWh1b4NBGiaCm2sSVhNUJ7txv/JsaKdjfWe5OTaf+J66O5/kECSpFpmD9H3bSGoPvQ/POnH9pvPhxD6E+qj6VHgSTHj/jyn13f/AQAA//8=
// DO NOT EDIT
package com.paypal.sdk.payments;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * A refund request.
 */
@Model
public class RefundRequest {

    // Required default constructor
    public RefundRequest() {}

	/**
	* The payment amount, with break-ups.
	*/
	@SerializedName("amount")
	private Amount amount;

	public Amount amount() { return amount; }
	
	public RefundRequest amount(Amount amount) {
	    this.amount = amount;
	    return this;
	}

	/**
	* The refund description. Value is a string of single-byte alphanumeric characters.
	*/
	@SerializedName("description")
	private String description;

	public String description() { return description; }
	
	public RefundRequest description(String description) {
	    this.description = description;
	    return this;
	}

	/**
	* The invoice number that is used to track this payment. Value is a string of single-byte alphanumeric characters.
	*/
	@SerializedName("invoice_number")
	private String invoiceNumber;

	public String invoiceNumber() { return invoiceNumber; }
	
	public RefundRequest invoiceNumber(String invoiceNumber) {
	    this.invoiceNumber = invoiceNumber;
	    return this;
	}

	/**
	* The refund reason description.
	*/
	@SerializedName("reason")
	private String reason;

	public String reason() { return reason; }
	
	public RefundRequest reason(String reason) {
	    this.reason = reason;
	    return this;
	}
}
