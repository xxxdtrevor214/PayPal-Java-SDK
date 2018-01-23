// This class was generated on Mon, 22 Jan 2018 14:30:02 PST by version 0.1.0-dev+8c35d5 of Braintree SDK Generator
// Amount.java
// @version 0.1.0-dev+8c35d5
// @type object
// @data H4sIAAAAAAAC/+yXX2vbSBDA3+9TDHq6M7Ll3B0c+O2gFEJpE5rQlzSYtXYkDV3tKrOzdUTJdy+yJNuympCQ1vTBT2b+7OzM/HYG61t0XVcYLSJVumAliqNPikmtDH5QZaOP4ugd1jvhDfqUqRJyNlpE1wVCpeoSrUAbIYY1SQErRvVlGio/i+Lof2ZVt/fM4+gjKn1hTR0tMmU8Noq7QIx6q7hkVyELoY8WN9sMvTDZfJxhGpjRpvUg0z3lOOMbKRhxmhaKVSrIcH51Mf3377P/oD8GqdN4+2eiXeoTsoI5qyZAookxlYTRS9I7Txtnn/w1g0tVXyoD2qEH6wR8qCrHAsqYPjThy1oiHA46YoMxD/EBuKVGUWT8uD07w647O924OUprasSmjtYN1MoFARmx/vVsc8pkuWZVDdLf144LaKzQWCFDnMF7dU9lKMGgzaUA8nA2hy16H8O6oLQAsqkJGv3ic5jP/0mD2fxiKxlqpSv8ihY05SQeVpg5xk1bNKZUKgOVIyuz9kzSHxqGuH6h+9r196msearPvC7pC3glooPH9hinQlltyObLDHGA6sAwptU7nGA1Kbf7AjVkrj3dbZR+7kqUwmlw1tSz45Al6wMrmw6x7mvHTLfWE9QB1Abb02SPBNUXVFWtZcd0TzlG2htPRI+2U/uWLzX5tPtzNqa1b30aG/Sep4n8/dasDytxosyQ8U75A7Sdsfsvti2FBEs/g/NsIzHeBfSyRQmGbOcTgxTkoWqTrZtXMJlwV8tkcpryo4AXdT9g3spj3KLuT0R+ApHb5zAZTeLjYziYwQZFjhrE9V9LiLCqtwLP4K1jYMyC1T4GxorRoxW/cemiSKFk73zn3Qd1TDnZdlk1AU9v4rXf0rcPf3wHAAD//w==
// DO NOT EDIT
package com.paypal.sdk.payments;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The payment amount, with break-ups.
 */
@Model
public class Amount {

    // Required default constructor
    public Amount() {}

	/**
	* REQUIRED
	* The [three-character ISO-4217 currency code](/docs/integration/direct/rest/currency-codes/). PayPal does not support all currencies.
	*/
	@SerializedName("currency")
	private String currency;

	public String currency() { return currency; }
	
	public Amount currency(String currency) {
	    this.currency = currency;
	    return this;
	}

	/**
	* The additional details about the payment amount.
	*/
	@SerializedName("details")
	private AmountDetails details;

	public AmountDetails details() { return details; }
	
	public Amount details(AmountDetails details) {
	    this.details = details;
	    return this;
	}

	/**
	* REQUIRED
	* The total amount charged to the payee by the payer. For refunds, represents the amount that the payee refunds to the original payer. Maximum length is 10 characters, which includes:<ul><li>Seven digits before the decimal point.</li><li>The decimal point.</li><li>Two digits after the decimal point.</li></ul>
	*/
	@SerializedName("total")
	private String total;

	public String total() { return total; }
	
	public Amount total(String total) {
	    this.total = total;
	    return this;
	}
}
