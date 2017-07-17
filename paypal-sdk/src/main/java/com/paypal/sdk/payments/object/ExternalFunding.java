// This class was generated on Mon, 17 Jul 2017 10:51:10 PDT by version 0.01 of Braintree SDK Generator
// ExternalFunding.java
// DO NOT EDIT
// @type object
// @json {"Type":"External Funding","VariableName":"","Description":"An external funding account.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":[{"Type":"Currency","VariableName":"amount","Description":"Base currency object for all financial value-related fields. For example, balance, payment due, and so on.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null},{"Type":"string","VariableName":"code","Description":"The generic ID for the external funding account.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"display_text","Description":"The description of the external funding account.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"funding_account_id","Description":"The encrypted PayPal account ID for the funding account.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null},{"Type":"string","VariableName":"funding_instruction","Description":"Indicates whether the payment is to be fully funded by the external funded incentive.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"reference_id","Description":"The ID for the external funding account.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null}]}

package com.paypal.sdk.payments.object;

import java.util.Map;
import java.util.List;
import com.google.gson.annotations.SerializedName;
/**
 * An external funding account.
 */
public class ExternalFunding {

	/**
	* REQUIRED
	* Base currency object for all financial value-related fields. For example, balance, payment due, and so on.
	*/
	@SerializedName("amount")
	private Currency amount;

	public Currency amount() { return amount; }
	
	public ExternalFunding amount(Currency amount) {
	    this.amount = amount;
	    return this;
	}

	/**
	* The generic ID for the external funding account.
	*/
	@SerializedName("code")
	private String code;

	public String code() { return code; }
	
	public ExternalFunding code(String code) {
	    this.code = code;
	    return this;
	}

	/**
	* The description of the external funding account.
	*/
	@SerializedName("display_text")
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
	@SerializedName("funding_account_id")
	private String fundingAccountId;

	public String fundingAccountId() { return fundingAccountId; }
	
	public ExternalFunding fundingAccountId(String fundingAccountId) {
	    this.fundingAccountId = fundingAccountId;
	    return this;
	}

	/**
	* Indicates whether the payment is to be fully funded by the external funded incentive.
	*/
	@SerializedName("funding_instruction")
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
	@SerializedName("reference_id")
	private String referenceId;

	public String referenceId() { return referenceId; }
	
	public ExternalFunding referenceId(String referenceId) {
	    this.referenceId = referenceId;
	    return this;
	}
}
