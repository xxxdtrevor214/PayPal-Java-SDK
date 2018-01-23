// This class was generated on Mon, 22 Jan 2018 14:43:26 PST by version 0.1.0-dev+8c35d5 of Braintree SDK Generator
// PaymentSummary.java
// @version 0.1.0-dev+8c35d5
// @type object
// @data H4sIAAAAAAAC/+yST2sVMRTF936KS1YKQ/EfCLPTuhGhLba4kS7uJGf6Ipkk3twIQfrdZdq+eQYrIuquyzncuTm/e843c9EyzGjOuC2ISud1WViaGcxHFs9TwAkv64AZzHu0w8dbFCs+q0/RjOZiB8p3Kzg6Esw1Oiq3247MYF6LcLt97OlgPoDdaQzNjDOHglX4Ur3AbcKZpAxRj2LGT5vN4yqCaO/xl3QH6Uzuld7pGy6gNH2GVZqTEIdAs48credAXzlUkCCwwtHsEVyhxxMHjhbDhugqBoLaoyf/jKyo+Hj1M5e9Iz5ODh2ePZyiJ3xBAaoQ2k+QTQ7EhRxmH+FoavTu/JRePn/26m+jiTWE6+G3FDd37ezvld47L6lGpZpJE52Q81deieeVRncgB+sXDoUKMgvrmt8By8cN6yba9Q/OWVIWz4r+Hn8ErlLv4778gfzXzczcMocOfpMeuvnQzf/VzcvrR98BAAD//w==
// DO NOT EDIT
package com.paypal.sdk.invoices;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The payment and refund summary.
 */
@Model
public class PaymentSummary {

    // Required default constructor
    public PaymentSummary() {}

	/**
	* Base object for all financial value related fields (balance, payment due, etc.)
	*/
	@SerializedName("other")
	private Currency other;

	public Currency other() { return other; }
	
	public PaymentSummary other(Currency other) {
	    this.other = other;
	    return this;
	}

	/**
	* Base object for all financial value related fields (balance, payment due, etc.)
	*/
	@SerializedName("paypal")
	private Currency paypal;

	public Currency paypal() { return paypal; }
	
	public PaymentSummary paypal(Currency paypal) {
	    this.paypal = paypal;
	    return this;
	}
}
