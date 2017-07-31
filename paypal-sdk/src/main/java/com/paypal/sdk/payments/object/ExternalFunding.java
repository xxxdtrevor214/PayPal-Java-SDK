// This class was generated on Mon, 31 Jul 2017 18:27:14 UTC by version 0.1 of Braintree SDK Generator
// ExternalFunding.java
// DO NOT EDIT
// @type object
// @json {"Type":"External Funding","VariableName":"","Description":"An external funding account.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":[{"Type":"Currency","VariableName":"amount","Description":"Base currency object for all financial value-related fields. For example, balance, payment due, and so on.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null},{"Type":"string","VariableName":"code","Description":"The generic ID for the external funding account.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"display_text","Description":"The description of the external funding account.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"funding_account_id","Description":"The encrypted PayPal account ID for the funding account.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null},{"Type":"string","VariableName":"funding_instruction","Description":"Indicates whether the payment is to be fully funded by the external funded incentive.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"reference_id","Description":"The ID for the external funding account.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null}]}

package com.paypal.sdk.payments.object;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.serializer.Serializable;
import com.braintreepayments.http.serializer.Deserializable;

/**
 * An external funding account.
 */
public class ExternalFunding implements Serializable, Deserializable {

    // Required default constructor
    public ExternalFunding() {}

	/**
	* REQUIRED
	* Base currency object for all financial value-related fields. For example, balance, payment due, and so on.
	*/
	private Currency amount;

	public Currency amount() { return amount; }
	
	public ExternalFunding amount(Currency amount) {
	    this.amount = amount;
	    return this;
	}

	/**
	* The generic ID for the external funding account.
	*/
	private String code;

	public String code() { return code; }
	
	public ExternalFunding code(String code) {
	    this.code = code;
	    return this;
	}

	/**
	* The description of the external funding account.
	*/
	private String displayText;

	public String displayText() { return displayText; }
	
	public ExternalFunding displayText(String displayText) {
	    this.displayText = displayText;
	    return this;
	}

	/**
	* REQUIRED
	* The encrypted PayPal account ID for the funding account.
	*/
	private String fundingAccountId;

	public String fundingAccountId() { return fundingAccountId; }
	
	public ExternalFunding fundingAccountId(String fundingAccountId) {
	    this.fundingAccountId = fundingAccountId;
	    return this;
	}

	/**
	* Indicates whether the payment is to be fully funded by the external funded incentive.
	*/
	private String fundingInstruction;

	public String fundingInstruction() { return fundingInstruction; }
	
	public ExternalFunding fundingInstruction(String fundingInstruction) {
	    this.fundingInstruction = fundingInstruction;
	    return this;
	}

	/**
	* REQUIRED
	* The ID for the external funding account.
	*/
	private String referenceId;

	public String referenceId() { return referenceId; }
	
	public ExternalFunding referenceId(String referenceId) {
	    this.referenceId = referenceId;
	    return this;
	}

    @Override
    public void serialize(Map<String, Object> serialized) {
        if (amount != null) {
            serialized.put("amount", this.amount);
        }
        if (code != null) {
            serialized.put("code", this.code);
        }
        if (displayText != null) {
            serialized.put("display_text", this.displayText);
        }
        if (fundingAccountId != null) {
            serialized.put("funding_account_id", this.fundingAccountId);
        }
        if (fundingInstruction != null) {
            serialized.put("funding_instruction", this.fundingInstruction);
        }
        if (referenceId != null) {
            serialized.put("reference_id", this.referenceId);
        }
    }

    @Override
    public void deserialize(Map<String, Object> values) {
        if (values.containsKey("amount")) {
            this.amount = new Currency();
            this.amount.deserialize((Map<String, Object>) values.get("amount"));
        }
        if (values.containsKey("code")) {
            this.code = (String) values.get("code");
        }
        if (values.containsKey("display_text")) {
            this.displayText = (String) values.get("display_text");
        }
        if (values.containsKey("funding_account_id")) {
            this.fundingAccountId = (String) values.get("funding_account_id");
        }
        if (values.containsKey("funding_instruction")) {
            this.fundingInstruction = (String) values.get("funding_instruction");
        }
        if (values.containsKey("reference_id")) {
            this.referenceId = (String) values.get("reference_id");
        }
    }
}

