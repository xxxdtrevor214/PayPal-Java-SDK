// This class was generated on Mon, 22 Jan 2018 14:30:02 PST by version 0.1.0-dev+8c35d5 of Braintree SDK Generator
// Currency.java
// @version 0.1.0-dev+8c35d5
// @type object
// @data H4sIAAAAAAAC/6zSQYsTQRAF4Lu/ouiTLp2MiiDkJoggwm7QxUvYQ6X7TVLS091W14iD7H+XiWazaw6ysMd5U/TM+6p/ueupwq1cGFWRw+S8+8oqvE245GF+47z7hOn08B4tqFSTkt3KXe9BW26g4wFUtt8QjPqixClRL5lzEE70g9OIhSKxIVIvSLEt6UNRwk8eaoKnLSfOAZ4qTwOyURzhiXOkVqjkpfPunSpPf376pXefwfEqp8mtek4Nc/B9FEW8C9ZaKtQEza02d3WbqeTdedl7DKfS98Lz8hvbK7AIe1YOBqWPX64Wb16/ensSCSXi5nkXS2idZMNOeT6gi6II1imadcfhxTzcuhdLWvO05kSxoFEuRm2stagdUP9OC9qjSEzHf0TymNKt/y/LYXUPTI7JOQgPZczmaaxkhS4uLyjKTqwR9zOP7UERQQZO1FBZ2Yp64kYRvWREkkybI+Jj2Q7Xbv4E16qlqrDh4SKeAuzm9tlvAAAA//8=
// DO NOT EDIT
package com.paypal.sdk.payments;

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
