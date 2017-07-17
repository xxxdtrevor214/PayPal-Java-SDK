// This class was generated on Mon, 17 Jul 2017 10:51:10 PDT by version 0.01 of Braintree SDK Generator
// FundingInstrument.java
// DO NOT EDIT
// @type object
// @json {"Type":"Funding Instrument","VariableName":"","Description":"A payer's funding instrument. An instance of this schema is valid if and only if it is valid against exactly one of these supported properties.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":[{"Type":"Credit Card","VariableName":"credit_card","Description":"[DEPRECATED] A credit card that can be used to fund a payment. Use payment card instead.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Credit Card Token","VariableName":"credit_card_token","Description":"A tokenized credit card that can be used to fund a payment.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.payments.object;

import java.util.Map;
import java.util.List;
import com.google.gson.annotations.SerializedName;
/**
 * A payer's funding instrument. An instance of this schema is valid if and only if it is valid against exactly one of these supported properties.
 */
public class FundingInstrument {

	/**
	* [DEPRECATED] A credit card that can be used to fund a payment. Use payment card instead.
	*/
	@SerializedName("credit_card")
	private CreditCard creditCard;

	public CreditCard creditCard() { return creditCard; }
	
	public FundingInstrument creditCard(CreditCard creditCard) {
	    this.creditCard = creditCard;
	    return this;
	}

	/**
	* A tokenized credit card that can be used to fund a payment.
	*/
	@SerializedName("credit_card_token")
	private CreditCardToken creditCardToken;

	public CreditCardToken creditCardToken() { return creditCardToken; }
	
	public FundingInstrument creditCardToken(CreditCardToken creditCardToken) {
	    this.creditCardToken = creditCardToken;
	    return this;
	}
}
