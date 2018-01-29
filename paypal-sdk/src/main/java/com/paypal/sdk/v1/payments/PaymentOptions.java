// This class was generated on Mon, 29 Jan 2018 12:12:02 PST by version 0.1.0-dev+ecea6f of Braintree SDK Generator
// PaymentOptions.java
// @version 0.1.0-dev+ecea6f
// @type object
// @data H4sIAAAAAAAC/6SQMUsEMRCFe3/FMPUi1tsJdoKKLDYix7h56waySW4yiwS5/y7xzhOVw8IyLx+P980bDzWDe85SF0TbpGw+xcIdP4h6eQ64kaUB3PE16tfjCmVU/0Fzz8MMOlTQoYIU2xXF4GhKSjb7QqYSi4zt/5w7vlSVuh9w0fE9xN3GULmfJBS0YLt6hTsGd5oy1DwK94/H6cXUx5ffiyWE9Aq3+VRbYHNy3zxOIqft9shfcjS0ZPIIjlxCoZiMJOdQyRLZDBoVzhuNou5H938vE9cQdk+7s3cAAAD//w==
// DO NOT EDIT
package com.paypal.sdk.v1.payments;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The payment options requested for this transaction.
 */
@Model
public class PaymentOptions {

    // Required default constructor
    public PaymentOptions() {}

	/**
	* The payment method requested for this transaction. This field does not apply to the credit card payment method.
	*/
	@SerializedName("allowed_payment_method")
	private String allowedPaymentMethod;

	public String allowedPaymentMethod() { return allowedPaymentMethod; }
	
	public PaymentOptions allowedPaymentMethod(String allowedPaymentMethod) {
	    this.allowedPaymentMethod = allowedPaymentMethod;
	    return this;
	}
}
