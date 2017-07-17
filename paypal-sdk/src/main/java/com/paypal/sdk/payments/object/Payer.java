// This class was generated on Mon, 17 Jul 2017 10:51:10 PDT by version 0.01 of Braintree SDK Generator
// Payer.java
// DO NOT EDIT
// @type object
// @json {"Type":"Payer","VariableName":"","Description":"A payer that funds a payment.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":[{"Type":"Funding Instrument","VariableName":"funding_instruments","Description":"A list of funding instruments for the current payment. Required when the `payment_method` is `credit_card` but does not apply when the `payment_method` is `paypal`. For credit card payments, the list must include either a `credit_card` object or `credit_card_token` object. You can specify only one funding instrument for a payment. If you specify more than one instrument in the list, the payment is declined.","IsArray":true,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Payer Info","VariableName":"payer_info","Description":"The payer information.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"payment_method","Description":"The payment method. Value is PayPal Wallet payment, bank direct debit, or direct credit card.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"status","Description":"The status of payer's PayPal account.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.payments.object;

import java.util.Map;
import java.util.List;
import com.google.gson.annotations.SerializedName;
/**
 * A payer that funds a payment.
 */
public class Payer {

	/**
	* A list of funding instruments for the current payment. Required when the `payment_method` is `credit_card` but does not apply when the `payment_method` is `paypal`. For credit card payments, the list must include either a `credit_card` object or `credit_card_token` object. You can specify only one funding instrument for a payment. If you specify more than one instrument in the list, the payment is declined.
	*/
	@SerializedName("funding_instruments")
	private List<FundingInstrument> fundingInstruments;

	public List<FundingInstrument> fundingInstruments() { return fundingInstruments; }
	
	public Payer fundingInstruments(List<FundingInstrument> fundingInstruments) {
	    this.fundingInstruments = fundingInstruments;
	    return this;
	}

	/**
	* The payer information.
	*/
	@SerializedName("payer_info")
	private PayerInfo payerInfo;

	public PayerInfo payerInfo() { return payerInfo; }
	
	public Payer payerInfo(PayerInfo payerInfo) {
	    this.payerInfo = payerInfo;
	    return this;
	}

	/**
	* The payment method. Value is PayPal Wallet payment, bank direct debit, or direct credit card.
	*/
	@SerializedName("payment_method")
	private String paymentMethod;

	public String paymentMethod() { return paymentMethod; }
	
	public Payer paymentMethod(String paymentMethod) {
	    this.paymentMethod = paymentMethod;
	    return this;
	}

	/**
	* The status of payer's PayPal account.
	*/
	@SerializedName("status")
	private String status;

	public String status() { return status; }
	
	public Payer status(String status) {
	    this.status = status;
	    return this;
	}
}
