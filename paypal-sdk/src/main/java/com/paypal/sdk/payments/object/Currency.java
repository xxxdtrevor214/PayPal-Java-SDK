// This class was generated on Mon, 31 Jul 2017 18:27:14 UTC by version 0.1 of Braintree SDK Generator
// Currency.java
// DO NOT EDIT
// @type object
// @json {"Type":"Currency","VariableName":"","Description":"Base currency object for all financial value-related fields. For example, balance, payment due, and so on.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":[{"Type":"string","VariableName":"currency","Description":"The [three-character ISO-4217 currency code](https://developer.paypal.com/docs/classic/api/currency_codes/). PayPal does not support all currencies.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null},{"Type":"string","VariableName":"value","Description":"The amount, up to \u003ci\u003eN\u003c/i\u003e digits after the decimal separator, as defined in [ISO 4217](https://developer.paypal.com/docs/classic/api/currency_codes/) for the appropriate currency code.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null}]}

package com.paypal.sdk.payments.object;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.serializer.Serializable;
import com.braintreepayments.http.serializer.Deserializable;

/**
 * Base currency object for all financial value-related fields. For example, balance, payment due, and so on.
 */
public class Currency implements Serializable, Deserializable {

    // Required default constructor
    public Currency() {}

	/**
	* REQUIRED
	* The [three-character ISO-4217 currency code](https://developer.paypal.com/docs/classic/api/currency_codes/). PayPal does not support all currencies.
	*/
	private String currency;

	public String currency() { return currency; }
	
	public Currency currency(String currency) {
	    this.currency = currency;
	    return this;
	}

	/**
	* REQUIRED
	* The amount, up to <i>N</i> digits after the decimal separator, as defined in [ISO 4217](https://developer.paypal.com/docs/classic/api/currency_codes/) for the appropriate currency code.
	*/
	private String value;

	public String value() { return value; }
	
	public Currency value(String value) {
	    this.value = value;
	    return this;
	}

    @Override
    public void serialize(Map<String, Object> serialized) {
        if (currency != null) {
            serialized.put("currency", this.currency);
        }
        if (value != null) {
            serialized.put("value", this.value);
        }
    }

    @Override
    public void deserialize(Map<String, Object> values) {
        if (values.containsKey("currency")) {
            this.currency = (String) values.get("currency");
        }
        if (values.containsKey("value")) {
            this.value = (String) values.get("value");
        }
    }
}

