// This class was generated on Mon, 22 Jan 2018 14:30:02 PST by version 0.1.0-dev+8c35d5 of Braintree SDK Generator
// Payer.java
// @version 0.1.0-dev+8c35d5
// @type object
// @data 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
// DO NOT EDIT
package com.paypal.sdk.payments;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * A payer who funds a payment.
 */
@Model
public class Payer {

    // Required default constructor
    public Payer() {}

	/**
	* An array of a single funding instrument for the current payment. Valid only and required for the credit card payment method. The array must include either a `credit_card` or `credit_card_token` object. If the array contains more than one instrument, the payment is declined.
	*/
	@SerializedName(value = "funding_instruments", listClass = FundingInstrument.class)
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
	private PayerInformation payerInfo;

	public PayerInformation payerInfo() { return payerInfo; }
	
	public Payer payerInfo(PayerInformation payerInfo) {
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
