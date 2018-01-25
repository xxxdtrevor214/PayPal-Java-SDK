// This class was generated on Thu, 25 Jan 2018 12:44:28 CST by version 0.1.0-dev+20fb1e of Braintree SDK Generator
// PaymentAmountDetails.java
// @version 0.1.0-dev+20fb1e
// @type object
// @data H4sIAAAAAAAC/+yWzY7TMBDH7zzFyMcq6hZx622lvSAEVLDiAqiaxpNmJMf22mPaCO27ozQfbchqAYEqDjlFM/8Zz4x/sZPv6r72pNZqg3VFVuC2cskK3JEgm6gy9QkD487QO6yaOJWpN1SfjTuKeWAv7Kxaq/uSALXmxkQDul0FcOeSgJQEviuDpzJLlanbELBum1hl6gOhfm9NrdYFmkiN4yFxID04NsF5CsIU1frz0H6UwHY/bXfPhWwPAf2o70vvdIBGhUaFgmgJb/HIVarAkN1LCRzh5QryEgPmQiFmcCg5L4FtbpKmuP6SVqtXeTKnJ7WW4db6SN/IguY9S4QdFS7QaVs05VyhAe/YyrLNuemTxkvc/2H4wfX1sBAKv1vuph/gLxHZZMxj9ktOJVpt2O63BdEI1U/ClFYfMMNqWk7euyCkoXBt9gbrTZPcnbuKpHQanDX18jpk2cYU0OZjrJfeKdNBnaGOoDbYnid7JaixZO9b5cz0wjlF2osz0avdqf2WbzXHvPncPknrUn0eG/SR84n8/67ZmHbiBM2Y8dn5BNpO7P7FhlFYqIpLeF2crEAPiaIMKMGw7WIykJIj+LbZunkLFovQzbJYzKf8KuAFjyPmrT3FLXicifwDIl8fX/wAAAD//w==
// DO NOT EDIT
package com.paypal.sdk.orders;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The additional details about the payment amount.
 */
@Model
public class PaymentAmountDetails {

    // Required default constructor
    public PaymentAmountDetails() {}

	/**
	* The gift wrap fee. Maximum length is 10 characters, which includes:<ul><li>Seven digits before the decimal point.</li><li>The decimal point.</li><li>Two digits after the decimal point.</li></ul>
	*/
	@SerializedName("gift_wrap")
	private String giftWrap;

	public String giftWrap() { return giftWrap; }
	
	public PaymentAmountDetails giftWrap(String giftWrap) {
	    this.giftWrap = giftWrap;
	    return this;
	}

	/**
	* The handling fee. Maximum length is 10 characters, which includes:<ul><li>Seven digits before the decimal point.</li><li>The decimal point.</li><li>Two digits after the decimal point.</li></ul>Supported for the PayPal payment method only.
	*/
	@SerializedName("handling_fee")
	private String handlingFee;

	public String handlingFee() { return handlingFee; }
	
	public PaymentAmountDetails handlingFee(String handlingFee) {
	    this.handlingFee = handlingFee;
	    return this;
	}

	/**
	* The insurance fee. Maximum length is 10 characters, which includes:<ul><li>Seven digits before the decimal point.</li><li>The decimal point.</li><li>Two digits after the decimal point.</li></ul>Supported only for the PayPal payment method.
	*/
	@SerializedName("insurance")
	private String insurance;

	public String insurance() { return insurance; }
	
	public PaymentAmountDetails insurance(String insurance) {
	    this.insurance = insurance;
	    return this;
	}

	/**
	* The shipping fee. Maximum length is 10 characters, which includes:<ul><li>Seven digits before the decimal point.</li><li>The decimal point.</li><li>Two digits after the decimal point.</li></ul>
	*/
	@SerializedName("shipping")
	private String shipping;

	public String shipping() { return shipping; }
	
	public PaymentAmountDetails shipping(String shipping) {
	    this.shipping = shipping;
	    return this;
	}

	/**
	* The shipping fee discount. Maximum length is 10 characters, which includes:<ul><li>Seven digits before the decimal point.</li><li>The decimal point.</li><li>Two digits after the decimal point.</li></ul>Supported for the PayPal payment method only.
	*/
	@SerializedName("shipping_discount")
	private String shippingDiscount;

	public String shippingDiscount() { return shippingDiscount; }
	
	public PaymentAmountDetails shippingDiscount(String shippingDiscount) {
	    this.shippingDiscount = shippingDiscount;
	    return this;
	}

	/**
	* The subtotal amount for the items. If the request includes line items, this property is **required**. Maximum length is 10 characters, which includes:<ul><li>Seven digits before the decimal point.</li><li>The decimal point.</li><li>Two digits after the decimal point.</li></ul>
	*/
	@SerializedName("subtotal")
	private String subtotal;

	public String subtotal() { return subtotal; }
	
	public PaymentAmountDetails subtotal(String subtotal) {
	    this.subtotal = subtotal;
	    return this;
	}

	/**
	* The tax. Maximum length is 10 characters, which includes:<ul><li>Seven digits before the decimal point.</li><li>The decimal point.</li><li>Two digits after the decimal point.</li></ul>
	*/
	@SerializedName("tax")
	private String tax;

	public String tax() { return tax; }
	
	public PaymentAmountDetails tax(String tax) {
	    this.tax = tax;
	    return this;
	}
}
