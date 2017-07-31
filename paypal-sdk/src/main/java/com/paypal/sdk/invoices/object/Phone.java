// This class was generated on Sun, 30 Jul 2017 11:04:05 PDT by version 0.1 of Braintree SDK Generator
// Phone.java
// DO NOT EDIT
// @type object
// @json {"Type":"Phone","VariableName":"","Description":"The phone number.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":[{"Type":"string","VariableName":"country_code","Description":"The country calling code (CC), as defined by E.164. The maximum combined length of CC+national is 15 digits.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"national_number","Description":"The national number, as defined by E.164. A national number consists of national destination code (NDC) and subscriber number (SN). The maximum combined length of CC+national is 15 digits.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.invoices.object;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.serializer.Serializable;
import com.braintreepayments.http.serializer.Deserializable;

/**
 * The phone number.
 */
public class Phone implements Serializable, Deserializable {

    // Required default constructor
    public Phone() {}

	/**
	* The country calling code (CC), as defined by E.164. The maximum combined length of CC+national is 15 digits.
	*/
	private String countryCode;

	public String countryCode() { return countryCode; }
	
	public Phone countryCode(String countryCode) {
	    this.countryCode = countryCode;
	    return this;
	}

	/**
	* The national number, as defined by E.164. A national number consists of national destination code (NDC) and subscriber number (SN). The maximum combined length of CC+national is 15 digits.
	*/
	private String nationalNumber;

	public String nationalNumber() { return nationalNumber; }
	
	public Phone nationalNumber(String nationalNumber) {
	    this.nationalNumber = nationalNumber;
	    return this;
	}

    @Override
    public void serialize(Map<String, Object> serialized) {
        if (countryCode != null) {
            serialized.put("country_code", this.countryCode);
        }
        if (nationalNumber != null) {
            serialized.put("national_number", this.nationalNumber);
        }
    }

    @Override
    public void deserialize(Map<String, Object> values) {
        if (values.containsKey("country_code")) {
            this.countryCode = (String) values.get("country_code");
        }
        if (values.containsKey("national_number")) {
            this.nationalNumber = (String) values.get("national_number");
        }
    }
}

