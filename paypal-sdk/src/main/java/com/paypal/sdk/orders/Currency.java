// This class was generated on Thu, 25 Jan 2018 12:44:28 CST by version 0.1.0-dev+20fb1e of Braintree SDK Generator
// Currency.java
// @version 0.1.0-dev+20fb1e
// @type object
// @data H4sIAAAAAAAC/6zSQYsTQRAF4Lu/ouiTLp2MiiDkJoogwm7QxUvYQ6X7TVLS091W14iD7H+XiZuNaw6y4HHeFD3zvuqf7nqqcCv3dlRFDpPz7gur8Dbhkof5jfPuI6bTwzu0oFJNSnYrd70HbbmBwt0BVLZfEYz6osQpUS+ZcxBO9J3TiIUisSFSL0ixLel9UcIPHmqCpy0nzgGeKk8DslEc4YlzpFao5KXz7o0qT79/+rl3n8DxKqfJrXpODXPwbRRFvA/WWirUBM2tNvd1m6nk3XnZcGI4lf4jPC+/sb0Ci7Bn5WBQ+vD5avHq5YvXJ5FQIm6edrGE1kk27JTnA7ooimCdoll3HF7Mw617tqQ1T2tOFAsa5WLUxlqL2gH1blrQHkViOv4lkseUbv0/WQ6re2ByTM5BeChjNk9jJSt0cXlBUXZijbifeWwPiggycKKGyspW1BM3iuglI5Jk2hwRH8t2uHbzJ7hWLVWFDQ8X8T/Abm6f/AIAAP//
// DO NOT EDIT
package com.paypal.sdk.orders;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The base currency object for all financial value-related fields. For example, balance, payment due, and so on.
 */
@Model
public class Currency {

    // Required default constructor
    public Currency() {}

	/**
	* REQUIRED
	* The [three-character ISO-4217 currency code](/docs/integration/direct/rest/currency-codes/). PayPal does not support all currencies.
	*/
	@SerializedName("currency")
	private String currency;

	public String currency() { return currency; }
	
	public Currency currency(String currency) {
	    this.currency = currency;
	    return this;
	}

	/**
	* REQUIRED
	* The amount, up to *N* digits after the decimal separator, as defined in [ISO-4217](/docs/integration/direct/rest/currency-codes/) for the appropriate currency code.
	*/
	@SerializedName("value")
	private String value;

	public String value() { return value; }
	
	public Currency value(String value) {
	    this.value = value;
	    return this;
	}
}
