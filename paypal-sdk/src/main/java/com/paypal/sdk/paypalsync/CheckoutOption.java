// This class was generated on Thu, 25 Jan 2018 09:31:12 CST by version 0.1.0-dev+20fb1e of Braintree SDK Generator
// CheckoutOption.java
// @version 0.1.0-dev+20fb1e
// @type object
// @data H4sIAAAAAAAC/6yRwU7jMBCG7/sUI5/das+5Vbvay0oUoYoLQs3UmdYjnNiMbWiE+u7IDSlULSAER4++sf//85Na9IFUpf5YMnc+J5iHxL5TWl2jMK4cXWBbAKXVf+pfD38pGuEBrtQMzHiB388AIyB02NIEu2bygC4TBGSZKq1mItgPD//W6oqwmXeuV9UaXaQyuM8s1BwGl+IDSWKKqro5RI5JuNucJh2TLIckyxLiKP07wHGjhaWTTgXU8GjZWODSz1gUNImEY2IDfg3YASdqNcRsbJFQG++81OAF6kTblIXq7zrosnM7/WUR+0/40MRIfK5iT07hnxegLbbBkYZ0hhvrt7yxCVYE9cplGnQINXWx6ej86qjrzXJsvU/2ZZ1DcNT8jM3b3a9nAAAA//8=
// DO NOT EDIT
package com.paypal.sdk.paypalsync;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * A checkout option as a name-and-value pair.
 */
@Model
public class CheckoutOption {

    // Required default constructor
    public CheckoutOption() {}

	/**
	* The checkout option name, which is a characteristic of an item, such as `color` or `texture`.
	*/
	@SerializedName("checkout_option_name")
	private String checkoutOptionName;

	public String checkoutOptionName() { return checkoutOptionName; }
	
	public CheckoutOption checkoutOptionName(String checkoutOptionName) {
	    this.checkoutOptionName = checkoutOptionName;
	    return this;
	}

	/**
	* The checkout option value. For example, the checkout option `color` might be `blue` or `red` while the checkout option `texture` might be `smooth` or `rippled`.
	*/
	@SerializedName("checkout_option_value")
	private String checkoutOptionValue;

	public String checkoutOptionValue() { return checkoutOptionValue; }
	
	public CheckoutOption checkoutOptionValue(String checkoutOptionValue) {
	    this.checkoutOptionValue = checkoutOptionValue;
	    return this;
	}
}
