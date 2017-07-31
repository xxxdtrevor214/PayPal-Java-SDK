// This class was generated on Mon, 31 Jul 2017 18:27:14 UTC by version 0.1 of Braintree SDK Generator
// PayeeMetadataInfoResource.java
// DO NOT EDIT
// @type object
// @json {"Type":"Payee metadata Info Resource","VariableName":"","Description":"A resource representing a display only metadata for Payee","IsArray":false,"ReadOnly":false,"Required":false,"Properties":[{"Type":"string","VariableName":"brand_name","Description":"Payer's business name.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Display phone","VariableName":"display_phone","Description":"Information related to the Payee.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"email","Description":"Email address representing the payer. 127 characters max.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.payments.object;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.serializer.Serializable;
import com.braintreepayments.http.serializer.Deserializable;

/**
 * A resource representing a display only metadata for Payee
 */
public class PayeeMetadataInfoResource implements Serializable, Deserializable {

    // Required default constructor
    public PayeeMetadataInfoResource() {}

	/**
	* Payer's business name.
	*/
	private String brandName;

	public String brandName() { return brandName; }
	
	public PayeeMetadataInfoResource brandName(String brandName) {
	    this.brandName = brandName;
	    return this;
	}

	/**
	* Information related to the Payee.
	*/
	private DisplayPhone displayPhone;

	public DisplayPhone displayPhone() { return displayPhone; }
	
	public PayeeMetadataInfoResource displayPhone(DisplayPhone displayPhone) {
	    this.displayPhone = displayPhone;
	    return this;
	}

	/**
	* Email address representing the payer. 127 characters max.
	*/
	private String email;

	public String email() { return email; }
	
	public PayeeMetadataInfoResource email(String email) {
	    this.email = email;
	    return this;
	}

    @Override
    public void serialize(Map<String, Object> serialized) {
        if (brandName != null) {
            serialized.put("brand_name", this.brandName);
        }
        if (displayPhone != null) {
            serialized.put("display_phone", this.displayPhone);
        }
        if (email != null) {
            serialized.put("email", this.email);
        }
    }

    @Override
    public void deserialize(Map<String, Object> values) {
        if (values.containsKey("brand_name")) {
            this.brandName = (String) values.get("brand_name");
        }
        if (values.containsKey("display_phone")) {
            this.displayPhone = new DisplayPhone();
            this.displayPhone.deserialize((Map<String, Object>) values.get("display_phone"));
        }
        if (values.containsKey("email")) {
            this.email = (String) values.get("email");
        }
    }
}

