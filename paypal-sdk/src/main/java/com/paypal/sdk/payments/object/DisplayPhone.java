// This class was generated on Mon, 31 Jul 2017 18:27:14 UTC by version 0.1 of Braintree SDK Generator
// DisplayPhone.java
// DO NOT EDIT
// @type object
// @json {"Type":"Display phone","VariableName":"","Description":"Information related to the Payee.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":[{"Type":"string","VariableName":"country_code","Description":"Country code (from in E.164 format)","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"number","Description":"In-country phone number (from in E.164 format)","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.payments.object;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.serializer.Serializable;
import com.braintreepayments.http.serializer.Deserializable;

/**
 * Information related to the Payee.
 */
public class DisplayPhone implements Serializable, Deserializable {

    // Required default constructor
    public DisplayPhone() {}

	/**
	* Country code (from in E.164 format)
	*/
	private String countryCode;

	public String countryCode() { return countryCode; }
	
	public DisplayPhone countryCode(String countryCode) {
	    this.countryCode = countryCode;
	    return this;
	}

	/**
	* In-country phone number (from in E.164 format)
	*/
	private String number;

	public String number() { return number; }
	
	public DisplayPhone number(String number) {
	    this.number = number;
	    return this;
	}

    @Override
    public void serialize(Map<String, Object> serialized) {
        if (countryCode != null) {
            serialized.put("country_code", this.countryCode);
        }
        if (number != null) {
            serialized.put("number", this.number);
        }
    }

    @Override
    public void deserialize(Map<String, Object> values) {
        if (values.containsKey("country_code")) {
            this.countryCode = (String) values.get("country_code");
        }
        if (values.containsKey("number")) {
            this.number = (String) values.get("number");
        }
    }
}

