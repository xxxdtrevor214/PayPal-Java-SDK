// This class was generated on Mon, 31 Jul 2017 18:27:14 UTC by version 0.1 of Braintree SDK Generator
// Payee.java
// DO NOT EDIT
// @type object
// @json {"Type":"Payee","VariableName":"","Description":"The payee who receives the funds and fulfills the order.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":[{"Type":"string","VariableName":"email","Description":"The email address associated with the payee's PayPal account. If the provided email address is not associated with any PayPal account, the payee can only receive PayPal Wallet payments. Direct credit card payments are denied due to card compliance requirements.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"merchant_id","Description":"The encrypted PayPal account ID for the payee.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Payee metadata Info Resource","VariableName":"payee_display_metadata","Description":"A resource representing a display only metadata for Payee","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.payments.object;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.serializer.Serializable;
import com.braintreepayments.http.serializer.Deserializable;

/**
 * The payee who receives the funds and fulfills the order.
 */
public class Payee implements Serializable, Deserializable {

    // Required default constructor
    public Payee() {}

	/**
	* The email address associated with the payee's PayPal account. If the provided email address is not associated with any PayPal account, the payee can only receive PayPal Wallet payments. Direct credit card payments are denied due to card compliance requirements.
	*/
	private String email;

	public String email() { return email; }
	
	public Payee email(String email) {
	    this.email = email;
	    return this;
	}

	/**
	* The encrypted PayPal account ID for the payee.
	*/
	private String merchantId;

	public String merchantId() { return merchantId; }
	
	public Payee merchantId(String merchantId) {
	    this.merchantId = merchantId;
	    return this;
	}

	/**
	* A resource representing a display only metadata for Payee
	*/
	private PayeeMetadataInfoResource payeeDisplayMetadata;

	public PayeeMetadataInfoResource payeeDisplayMetadata() { return payeeDisplayMetadata; }
	
	public Payee payeeDisplayMetadata(PayeeMetadataInfoResource payeeDisplayMetadata) {
	    this.payeeDisplayMetadata = payeeDisplayMetadata;
	    return this;
	}

    @Override
    public void serialize(Map<String, Object> serialized) {
        if (email != null) {
            serialized.put("email", this.email);
        }
        if (merchantId != null) {
            serialized.put("merchant_id", this.merchantId);
        }
        if (payeeDisplayMetadata != null) {
            serialized.put("payee_display_metadata", this.payeeDisplayMetadata);
        }
    }

    @Override
    public void deserialize(Map<String, Object> values) {
        if (values.containsKey("email")) {
            this.email = (String) values.get("email");
        }
        if (values.containsKey("merchant_id")) {
            this.merchantId = (String) values.get("merchant_id");
        }
        if (values.containsKey("payee_display_metadata")) {
            this.payeeDisplayMetadata = new PayeeMetadataInfoResource();
            this.payeeDisplayMetadata.deserialize((Map<String, Object>) values.get("payee_display_metadata"));
        }
    }
}

