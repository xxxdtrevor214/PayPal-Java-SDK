// This class was generated on Thu, 25 Jan 2018 09:31:12 CST by version 0.1.0-dev+20fb1e of Braintree SDK Generator
// TaxAmount.java
// @version 0.1.0-dev+20fb1e
// @type object
// @data H4sIAAAAAAAC/6yTT2vbTBDG7++nGHRKQLbytoWCb6Gh0JYmoQ2FkppkvDuyhq521dlZ26Lku5eVoyS2A6WQk9jZ+fd79Ozv4qrvqJgVV7iB0zYkr0VZfENhXDg6xzbfFWXxifrHwxlFI9wpB58rGwLFDThaMVlY9ICwDCsS35JXCB60IeiSmAYjQahhGYKNEAQiyYoNxWlRFqci2G+XOSmLL4T2wru+mNXoIuXAr8RC9iFwKaEjUaZYzK4fMD4HT/0hgeLmBke6R5ad8CGVSSLkTQ/oLWzzoA4CCDV79IbRwQpdoomQQyULNZOzU3gfBGiDbeeohAU69IYyb4f9oIlN9HLIUYX98pB53P7GBEs72Ps3h+TX2gjRxDQoaJQEPny9mLx59f/bR01y7fyossHEir3SUjA3qCwLGa2EolZj8iQnx+oYtEEFtuSVa6Y4OGNM+idFVNKeID45d1f+VZXhf+2oMUYOVRhuSlg3bBpoedkoLGj2I52cvDbJDV/anhxvT6ceBi1IBqPco2VSxz8Jbj9efr/dioBC4IOC9h0bdK6HOkvNwaObbptWY9e9GWDJcIvuoeL5WVfnZ09mxbSwvGJLNm8YQJuQInqrTXx+XDUSZjPn/yT34oNP7YIkP+Rxkc6hoXj/NnYcUkIkgut3T2MRJtlPkP00P2pUuzirqvV6PeUYpkGWFccwuG2ya6Bpo607fgmfzO/md//9AQAA//8=
// DO NOT EDIT
package com.paypal.sdk.paypalsync;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The tax levied by a government on the purchase of goods or services.
 */
@Model
public class TaxAmount {

    // Required default constructor
    public TaxAmount() {}

	/**
	* The currency and amount for a financial value-related field. For example, balance or payment due.
	*/
	@SerializedName("tax_amount")
	private Money taxAmount;

	public Money taxAmount() { return taxAmount; }
	
	public TaxAmount taxAmount(Money taxAmount) {
	    this.taxAmount = taxAmount;
	    return this;
	}
}
