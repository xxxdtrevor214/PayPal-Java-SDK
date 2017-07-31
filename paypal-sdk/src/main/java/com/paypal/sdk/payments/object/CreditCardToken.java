// This class was generated on Mon, 31 Jul 2017 18:27:14 UTC by version 0.1 of Braintree SDK Generator
// CreditCardToken.java
// DO NOT EDIT
// @type object
// @json {"Type":"Credit Card Token","VariableName":"","Description":"A tokenized credit card that can be used to fund a payment.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":[{"Type":"string","VariableName":"credit_card_id","Description":"The ID of credit card that is stored in the PayPal vault.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null},{"Type":"integer","VariableName":"expire_month","Description":"The expiration month with no leading zero. Value is from `1` to `12`.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"integer","VariableName":"expire_year","Description":"The four-digit expiration year.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"last4","Description":"The last four digits of the stored credit card number.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"payer_id","Description":"A unique ID that you can assign and track when you store a credit card in the vault or use a vaulted credit card. This ID can help to avoid unintentional use or misuse of credit cards. This ID can be any value you would like to associate with the saved card, such as a UUID, user name, or email address. **Required when you use a vaulted credit card if a `payer_id` was originally provided when you vaulted the credit card.**","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"type","Description":"The credit card type. Value is `visa`, `mastercard`, `discover`, or `amex`. Values are in lowercase; do not use these values for display.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.payments.object;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.serializer.Serializable;
import com.braintreepayments.http.serializer.Deserializable;

/**
 * A tokenized credit card that can be used to fund a payment.
 */
public class CreditCardToken implements Serializable, Deserializable {

    // Required default constructor
    public CreditCardToken() {}

	/**
	* REQUIRED
	* The ID of credit card that is stored in the PayPal vault.
	*/
	private String creditCardId;

	public String creditCardId() { return creditCardId; }
	
	public CreditCardToken creditCardId(String creditCardId) {
	    this.creditCardId = creditCardId;
	    return this;
	}

	/**
	* The expiration month with no leading zero. Value is from `1` to `12`.
	*/
	private Integer expireMonth;

	public Integer expireMonth() { return expireMonth; }
	
	public CreditCardToken expireMonth(Integer expireMonth) {
	    this.expireMonth = expireMonth;
	    return this;
	}

	/**
	* The four-digit expiration year.
	*/
	private Integer expireYear;

	public Integer expireYear() { return expireYear; }
	
	public CreditCardToken expireYear(Integer expireYear) {
	    this.expireYear = expireYear;
	    return this;
	}

	/**
	* The last four digits of the stored credit card number.
	*/
	private String last4;

	public String last4() { return last4; }
	
	public CreditCardToken last4(String last4) {
	    this.last4 = last4;
	    return this;
	}

	/**
	* A unique ID that you can assign and track when you store a credit card in the vault or use a vaulted credit card. This ID can help to avoid unintentional use or misuse of credit cards. This ID can be any value you would like to associate with the saved card, such as a UUID, user name, or email address. **Required when you use a vaulted credit card if a `payer_id` was originally provided when you vaulted the credit card.**
	*/
	private String payerId;

	public String payerId() { return payerId; }
	
	public CreditCardToken payerId(String payerId) {
	    this.payerId = payerId;
	    return this;
	}

	/**
	* The credit card type. Value is `visa`, `mastercard`, `discover`, or `amex`. Values are in lowercase; do not use these values for display.
	*/
	private String type;

	public String type() { return type; }
	
	public CreditCardToken type(String type) {
	    this.type = type;
	    return this;
	}

    @Override
    public void serialize(Map<String, Object> serialized) {
        if (creditCardId != null) {
            serialized.put("credit_card_id", this.creditCardId);
        }
        if (expireMonth != null) {
            serialized.put("expire_month", this.expireMonth);
        }
        if (expireYear != null) {
            serialized.put("expire_year", this.expireYear);
        }
        if (last4 != null) {
            serialized.put("last4", this.last4);
        }
        if (payerId != null) {
            serialized.put("payer_id", this.payerId);
        }
        if (type != null) {
            serialized.put("type", this.type);
        }
    }

    @Override
    public void deserialize(Map<String, Object> values) {
        if (values.containsKey("credit_card_id")) {
            this.creditCardId = (String) values.get("credit_card_id");
        }
        if (values.containsKey("expire_month")) {
            this.expireMonth = ((Number) values.get("expire_month")).intValue();
        }
        if (values.containsKey("expire_year")) {
            this.expireYear = ((Number) values.get("expire_year")).intValue();
        }
        if (values.containsKey("last4")) {
            this.last4 = (String) values.get("last4");
        }
        if (values.containsKey("payer_id")) {
            this.payerId = (String) values.get("payer_id");
        }
        if (values.containsKey("type")) {
            this.type = (String) values.get("type");
        }
    }
}

