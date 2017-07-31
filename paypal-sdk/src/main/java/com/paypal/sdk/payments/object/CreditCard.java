// This class was generated on Mon, 31 Jul 2017 18:27:14 UTC by version 0.1 of Braintree SDK Generator
// CreditCard.java
// DO NOT EDIT
// @type object
// @json {"Type":"Credit Card","VariableName":"","Description":"[DEPRECATED] A credit card that can be used to fund a payment. Use payment card instead.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":[{"Type":"Address","VariableName":"billing_address","Description":"The billing address in a payment. Can be extended for shipping address.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"cvv2","Description":"The three- to four-digit card validation code.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"expire_month","Description":"The expiration month with no leading zero. Value is from `1` to `12`.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null},{"Type":"string","VariableName":"expire_year","Description":"The four-digit expiration year.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null},{"Type":"string","VariableName":"first_name","Description":"The card holder's first name.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"last_name","Description":"The card holder's last name.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Link Description Object","VariableName":"links","Description":"","IsArray":true,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"number","Description":"The credit card number. Numeric characters only with no spaces or punctuation. The string must conform to the modulo and length required by each credit card type. *Redacted in responses.*","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null},{"Type":"string","VariableName":"type","Description":"The credit card type. Value is `visa`, `mastercard`, `discover`, or `amex`.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null}]}

package com.paypal.sdk.payments.object;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.serializer.Serializable;
import com.braintreepayments.http.serializer.Deserializable;

/**
 * [DEPRECATED] A credit card that can be used to fund a payment. Use payment card instead.
 */
public class CreditCard implements Serializable, Deserializable {

    // Required default constructor
    public CreditCard() {}

	/**
	* The billing address in a payment. Can be extended for shipping address.
	*/
	private Address billingAddress;

	public Address billingAddress() { return billingAddress; }
	
	public CreditCard billingAddress(Address billingAddress) {
	    this.billingAddress = billingAddress;
	    return this;
	}

	/**
	* The three- to four-digit card validation code.
	*/
	private String cvv2;

	public String cvv2() { return cvv2; }
	
	public CreditCard cvv2(String cvv2) {
	    this.cvv2 = cvv2;
	    return this;
	}

	/**
	* REQUIRED
	* The expiration month with no leading zero. Value is from `1` to `12`.
	*/
	private String expireMonth;

	public String expireMonth() { return expireMonth; }
	
	public CreditCard expireMonth(String expireMonth) {
	    this.expireMonth = expireMonth;
	    return this;
	}

	/**
	* REQUIRED
	* The four-digit expiration year.
	*/
	private String expireYear;

	public String expireYear() { return expireYear; }
	
	public CreditCard expireYear(String expireYear) {
	    this.expireYear = expireYear;
	    return this;
	}

	/**
	* The card holder's first name.
	*/
	private String firstName;

	public String firstName() { return firstName; }
	
	public CreditCard firstName(String firstName) {
	    this.firstName = firstName;
	    return this;
	}

	/**
	* The card holder's last name.
	*/
	private String lastName;

	public String lastName() { return lastName; }
	
	public CreditCard lastName(String lastName) {
	    this.lastName = lastName;
	    return this;
	}

	/**
	*/
	private List<LinkDescriptionObject> links;

	public List<LinkDescriptionObject> links() { return links; }
	
	public CreditCard links(List<LinkDescriptionObject> links) {
	    this.links = links;
	    return this;
	}

	/**
	* REQUIRED
	* The credit card number. Numeric characters only with no spaces or punctuation. The string must conform to the modulo and length required by each credit card type. *Redacted in responses.*
	*/
	private String number;

	public String number() { return number; }
	
	public CreditCard number(String number) {
	    this.number = number;
	    return this;
	}

	/**
	* REQUIRED
	* The credit card type. Value is `visa`, `mastercard`, `discover`, or `amex`.
	*/
	private String type;

	public String type() { return type; }
	
	public CreditCard type(String type) {
	    this.type = type;
	    return this;
	}

    @Override
    public void serialize(Map<String, Object> serialized) {
        if (billingAddress != null) {
            serialized.put("billing_address", this.billingAddress);
        }
        if (cvv2 != null) {
            serialized.put("cvv2", this.cvv2);
        }
        if (expireMonth != null) {
            serialized.put("expire_month", this.expireMonth);
        }
        if (expireYear != null) {
            serialized.put("expire_year", this.expireYear);
        }
        if (firstName != null) {
            serialized.put("first_name", this.firstName);
        }
        if (lastName != null) {
            serialized.put("last_name", this.lastName);
        }
        if (links != null) {
            serialized.put("links", this.links);
        }
        if (number != null) {
            serialized.put("number", this.number);
        }
        if (type != null) {
            serialized.put("type", this.type);
        }
    }

    @Override
    public void deserialize(Map<String, Object> values) {
        if (values.containsKey("billing_address")) {
            this.billingAddress = new Address();
            this.billingAddress.deserialize((Map<String, Object>) values.get("billing_address"));
        }
        if (values.containsKey("cvv2")) {
            this.cvv2 = (String) values.get("cvv2");
        }
        if (values.containsKey("expire_month")) {
            this.expireMonth = (String) values.get("expire_month");
        }
        if (values.containsKey("expire_year")) {
            this.expireYear = (String) values.get("expire_year");
        }
        if (values.containsKey("first_name")) {
            this.firstName = (String) values.get("first_name");
        }
        if (values.containsKey("last_name")) {
            this.lastName = (String) values.get("last_name");
        }
        if (values.containsKey("links")) {
            this.links = new ArrayList<>();
				List<Map<String, Object>> nestedValues = (List<Map<String, Object>>) values.get("links");
				for (Map<String, Object> nestedValue : nestedValues) {
					LinkDescriptionObject nested = new LinkDescriptionObject();
					nested.deserialize(nestedValue);
					this.links.add(nested);
                }
        }
        if (values.containsKey("number")) {
            this.number = (String) values.get("number");
        }
        if (values.containsKey("type")) {
            this.type = (String) values.get("type");
        }
    }
}

