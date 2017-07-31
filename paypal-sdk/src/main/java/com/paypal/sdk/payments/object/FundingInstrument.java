// This class was generated on Mon, 31 Jul 2017 18:27:14 UTC by version 0.1 of Braintree SDK Generator
// FundingInstrument.java
// DO NOT EDIT
// @type object
// @json {"Type":"Funding Instrument","VariableName":"","Description":"A payer's funding instrument. An instance of this schema is valid if and only if it is valid against exactly one of these supported properties.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":[{"Type":"Credit Card","VariableName":"credit_card","Description":"[DEPRECATED] A credit card that can be used to fund a payment. Use payment card instead.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Credit Card Token","VariableName":"credit_card_token","Description":"A tokenized credit card that can be used to fund a payment.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.payments.object;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.serializer.Serializable;
import com.braintreepayments.http.serializer.Deserializable;

/**
 * A payer's funding instrument. An instance of this schema is valid if and only if it is valid against exactly one of these supported properties.
 */
public class FundingInstrument implements Serializable, Deserializable {

    // Required default constructor
    public FundingInstrument() {}

	/**
	* [DEPRECATED] A credit card that can be used to fund a payment. Use payment card instead.
	*/
	private CreditCard creditCard;

	public CreditCard creditCard() { return creditCard; }
	
	public FundingInstrument creditCard(CreditCard creditCard) {
	    this.creditCard = creditCard;
	    return this;
	}

	/**
	* A tokenized credit card that can be used to fund a payment.
	*/
	private CreditCardToken creditCardToken;

	public CreditCardToken creditCardToken() { return creditCardToken; }
	
	public FundingInstrument creditCardToken(CreditCardToken creditCardToken) {
	    this.creditCardToken = creditCardToken;
	    return this;
	}

    @Override
    public void serialize(Map<String, Object> serialized) {
        if (creditCard != null) {
            serialized.put("credit_card", this.creditCard);
        }
        if (creditCardToken != null) {
            serialized.put("credit_card_token", this.creditCardToken);
        }
    }

    @Override
    public void deserialize(Map<String, Object> values) {
        if (values.containsKey("credit_card")) {
            this.creditCard = new CreditCard();
            this.creditCard.deserialize((Map<String, Object>) values.get("credit_card"));
        }
        if (values.containsKey("credit_card_token")) {
            this.creditCardToken = new CreditCardToken();
            this.creditCardToken.deserialize((Map<String, Object>) values.get("credit_card_token"));
        }
    }
}

