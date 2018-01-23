// This class was generated on Mon, 22 Jan 2018 14:30:02 PST by version 0.1.0-dev+8c35d5 of Braintree SDK Generator
// CreditCardToken.java
// @version 0.1.0-dev+8c35d5
// @type object
// @data H4sIAAAAAAAC/7yUwW7bMAyG73sKwsfAC9Zhp+xUoJdiwFYMbS/DUDMRExOVJZeUnLpD332QkrR2vB6KFb3ZlET9H/lTf4rLvqViUayEDIebFYq5Cf6WXFEW1yiMS0vfsUlbirL4Rv3zzxnpSrgN7F2xKE4hH+MHMrBLBikZhBrTl4MlQVQyEDysozOA0GLfkAvzoixORbDfSflUFj8JzQ9n+2KxRquUAneRhcxT4EJ8SxKYtFj8eoLQIOw2U+VDODYjjsnSmOqyJjg/A7+eMrGCBi9kgB2EmuAC+wu00GG0r2MKEo+QXLT2sXziYhdoQzIFo/uWhW4a70I9wjpamELlDZgCkDfBlkMNzoMlNOw28EDi53CNNlJCXYtvoDqpUvuqk8/V/zbtlYQ9ofwLcB+f8q19lI+GNxyGqGn7Gyt/yXMWNXwZST5EpmLTSlYMWbEmvyVH7f01tJ6LzZLei6HFnuR4YgbB4xcgOr6LeWDyhPQ+5slHVd44QGcgCK5uYVuTy6sZEHBEuJ+mPEbgJT0agLvfcS3mcFmzptvSJTXZNpkTO88mKXGBXFKGNqfwAg1r/hoNs47TLAnQ9dBl3yeJWx+tAcu3lLOr+hVjoN285CZhl3ShmBI0rmpABYSrq/OzMl0s4LChMt1PDbIFNEZIdQ6z2aFHzwV5ERZ4DQjVofgVbFHBC2/YobU9tOI7NsNUhyRJ47Bqs9n7mCek5aFx9oGp/UdPa9/S4NmpOlasSqga1ECStqQ/w7ryHUmV61phQ/fV/pQCCiUTWb9NB5S+gvHgfMjFDTUp7dqrsPZp4rS12L/JRP1+/PAXAAD//w==
// DO NOT EDIT
package com.paypal.sdk.payments;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * A tokenized credit card that can be used to fund a payment.
 */
@Model
public class CreditCardToken {

    // Required default constructor
    public CreditCardToken() {}

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
