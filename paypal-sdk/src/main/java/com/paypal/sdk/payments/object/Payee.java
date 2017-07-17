// This class was generated on Mon, 17 Jul 2017 10:51:10 PDT by version 0.01 of Braintree SDK Generator
// Payee.java
// DO NOT EDIT
// @type object
// @json {"Type":"Payee","VariableName":"","Description":"The payee who receives the funds and fulfills the order.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":[{"Type":"string","VariableName":"email","Description":"The email address associated with the payee's PayPal account. If the provided email address is not associated with any PayPal account, the payee can only receive PayPal Wallet payments. Direct credit card payments are denied due to card compliance requirements.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"merchant_id","Description":"The encrypted PayPal account ID for the payee.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Payee metadata Info Resource","VariableName":"payee_display_metadata","Description":"A resource representing a display only metadata for Payee","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.payments.object;

import java.util.Map;
import java.util.List;
import com.google.gson.annotations.SerializedName;
/**
 * The payee who receives the funds and fulfills the order.
 */
public class Payee {

	/**
	* The email address associated with the payee's PayPal account. If the provided email address is not associated with any PayPal account, the payee can only receive PayPal Wallet payments. Direct credit card payments are denied due to card compliance requirements.
	*/
	@SerializedName("email")
	private String email;

	public String email() { return email; }
	
	public Payee email(String email) {
	    this.email = email;
	    return this;
	}

	/**
	* The encrypted PayPal account ID for the payee.
	*/
	@SerializedName("merchant_id")
	private String merchantId;

	public String merchantId() { return merchantId; }
	
	public Payee merchantId(String merchantId) {
	    this.merchantId = merchantId;
	    return this;
	}

	/**
	* A resource representing a display only metadata for Payee
	*/
	@SerializedName("payee_display_metadata")
	private PayeeMetadataInfoResource payeeDisplayMetadata;

	public PayeeMetadataInfoResource payeeDisplayMetadata() { return payeeDisplayMetadata; }
	
	public Payee payeeDisplayMetadata(PayeeMetadataInfoResource payeeDisplayMetadata) {
	    this.payeeDisplayMetadata = payeeDisplayMetadata;
	    return this;
	}
}
