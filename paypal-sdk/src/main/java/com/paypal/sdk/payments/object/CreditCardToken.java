// This class was generated on Mon, 03 Jul 2017 13:56:47 PDT by version 0.01 of Braintree SDK Generator
// CreditCardToken.java
// DO NOT EDIT
// @type object
// @json {"Type":"Credit Card Token","VariableName":"","Description":"A tokenized credit card that can be used to fund a payment.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":[{"Type":"string","VariableName":"credit_card_id","Description":"The ID of credit card that is stored in the PayPal vault.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null},{"Type":"integer","VariableName":"expire_month","Description":"The expiration month with no leading zero. Value is from `1` to `12`.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"integer","VariableName":"expire_year","Description":"The four-digit expiration year.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"last4","Description":"The last four digits of the stored credit card number.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"payer_id","Description":"A unique ID that you can assign and track when you store a credit card in the vault or use a vaulted credit card. This ID can help to avoid unintentional use or misuse of credit cards. This ID can be any value you would like to associate with the saved card, such as a UUID, user name, or email address. **Required when you use a vaulted credit card if a `payer_id` was originally provided when you vaulted the credit card.**","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"type","Description":"The credit card type. Value is `visa`, `mastercard`, `discover`, or `amex`. Values are in lowercase; do not use these values for display.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.payments.object;

import java.util.Map;
import java.util.List;
import com.google.gson.annotations.SerializedName;
/**
 * A tokenized credit card that can be used to fund a payment.
 */
public class CreditCardToken {

	/**
	* REQUIRED
	* The ID of credit card that is stored in the PayPal vault.
	*/
	@SerializedName("credit_card_id")
	private String creditCardId;

	public String creditCardId() { return creditCardId; }
	
	public CreditCardToken creditCardId(String creditCardId) {
	    this.creditCardId = creditCardId;
	    return this;
	}

	/**
	* The expiration month with no leading zero. Value is from `1` to `12`.
	*/
	@SerializedName("expire_month")
	private Integer expireMonth;

	public Integer expireMonth() { return expireMonth; }
	
	public CreditCardToken expireMonth(Integer expireMonth) {
	    this.expireMonth = expireMonth;
	    return this;
	}

	/**
	* The four-digit expiration year.
	*/
	@SerializedName("expire_year")
	private Integer expireYear;

	public Integer expireYear() { return expireYear; }
	
	public CreditCardToken expireYear(Integer expireYear) {
	    this.expireYear = expireYear;
	    return this;
	}

	/**
	* The last four digits of the stored credit card number.
	*/
	@SerializedName("last4")
	private String last4;

	public String last4() { return last4; }
	
	public CreditCardToken last4(String last4) {
	    this.last4 = last4;
	    return this;
	}

	/**
	* A unique ID that you can assign and track when you store a credit card in the vault or use a vaulted credit card. This ID can help to avoid unintentional use or misuse of credit cards. This ID can be any value you would like to associate with the saved card, such as a UUID, user name, or email address. **Required when you use a vaulted credit card if a `payer_id` was originally provided when you vaulted the credit card.**
	*/
	@SerializedName("payer_id")
	private String payerId;

	public String payerId() { return payerId; }
	
	public CreditCardToken payerId(String payerId) {
	    this.payerId = payerId;
	    return this;
	}

	/**
	* The credit card type. Value is `visa`, `mastercard`, `discover`, or `amex`. Values are in lowercase; do not use these values for display.
	*/
	@SerializedName("type")
	private String type;

	public String type() { return type; }
	
	public CreditCardToken type(String type) {
	    this.type = type;
	    return this;
	}
}
