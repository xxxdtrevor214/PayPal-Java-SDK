// This class was generated on Mon, 29 Jan 2018 12:12:01 PST by version 0.1.0-dev+ecea6f of Braintree SDK Generator
// CreditCardToken.java
// @version 0.1.0-dev+ecea6f
// @type object
// @data H4sIAAAAAAAC/7yVQW/bOgzH7+9TED4GfsHrwzvlnYrmUgzYiiEtMAxDzVpMTFSWXFJK6g797oOUpLXr9VCs6C2mJOr/E/9kfharvqNiUZwJGQ5whmJg5W/JFWVxhcJ4Y+kztmlLURafqH/+WJLWwl1g74pFsWoIQjrID2Sg3qerUzpDAdnqHL75CDU6iEoQGlZgp0FiSy5A8LCOzgBCh32KzIuyOBXBfi/wn7L4Smi+ONsXizVapRS4iyxkngIX4juSwKTF4vsTmgZht5ny7DVeJ43XbEZ0k6Up6/kS/HrEGRoMwAoavJABdhAaggvsL9DCFqN9G1OQ+ALJRWsfyycudoE2JFMwuu9Y6Lr1LjQjrBcLU6i8AVMA8ibYcWjAebCEht0GHkj8HK7QRkqoa/EtVCdVKl918m/1p0V7I2FPKL8DPMSnfGsf5W/DGw5D1LT9nZW/5jmLGv4bST5GpmLTSlYMWbEmvyVHHfw1tJ6L7Q19FEOHPcnLjhkExySnEB3fxdwwuUP6wxRAVd44QGcgCNa3sGvI5dUMCDgiPHRTbiPwkmcI7j/HbzGHVRot58t8SUO2S+bErWeTlLhALilDm1N4gZY1/xo1s47T3BCg62GbfZ8k7ny0BizfUs6u6mvGQPt+yUXCbdKFYkrQWDeACgiXl+fLMl0s4LClMt1PLbIFNEZIdQ6z2bFGzw/yKizwGhCq4+NXsEMFL7xhh9b20InfshmmOiZJGoevNpt9jHlCWh4a5xCY2n80WvuOBmOn2rJiVULVogaStCV9Gdbab0mq/K4VtnRfHU4poFAykfW7dEDpfzAenA+HfyNS2pdXYe1Tx2lnsX+Xjvrx+NcvAAAA//8=
// DO NOT EDIT
package com.paypal.sdk.v1.orders;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The tokenized credit card details. You can use this instrument to fund a payment.
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
