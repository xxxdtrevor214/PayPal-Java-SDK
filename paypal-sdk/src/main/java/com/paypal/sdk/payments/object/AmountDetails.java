// This class was generated on Mon, 03 Jul 2017 13:56:47 PDT by version 0.01 of Braintree SDK Generator
// AmountDetails.java
// DO NOT EDIT
// @type object
// @json {"Type":"Amount details","VariableName":"","Description":"The additional details about the payment amount.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":[{"Type":"string","VariableName":"gift_wrap","Description":"The gift wrap fee.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"handling_fee","Description":"The handling fee. Supported for the PayPal payment method only.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"insurance","Description":"The insurance fee. Supported for the PayPal payment method only.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"shipping","Description":"The shipping fee. Maximum length is 10 characters. Supports two decimal places.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"shipping_discount","Description":"The shipping fee discount. Supported for the PayPal payment method only.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"subtotal","Description":"The subtotal amount for the items. If the request includes line items, this property is **required**. Maximum length is 10 characters. Supports two decimal places.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"tax","Description":"The tax. Maximum length is 10 characters. Supports two decimal places.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.payments.object;

import java.util.Map;
import java.util.List;
import com.google.gson.annotations.SerializedName;
/**
 * The additional details about the payment amount.
 */
public class AmountDetails {

	/**
	* The gift wrap fee.
	*/
	@SerializedName("gift_wrap")
	private String giftWrap;

	public String giftWrap() { return giftWrap; }
	
	public AmountDetails giftWrap(String giftWrap) {
	    this.giftWrap = giftWrap;
	    return this;
	}

	/**
	* The handling fee. Supported for the PayPal payment method only.
	*/
	@SerializedName("handling_fee")
	private String handlingFee;

	public String handlingFee() { return handlingFee; }
	
	public AmountDetails handlingFee(String handlingFee) {
	    this.handlingFee = handlingFee;
	    return this;
	}

	/**
	* The insurance fee. Supported for the PayPal payment method only.
	*/
	@SerializedName("insurance")
	private String insurance;

	public String insurance() { return insurance; }
	
	public AmountDetails insurance(String insurance) {
	    this.insurance = insurance;
	    return this;
	}

	/**
	* The shipping fee. Maximum length is 10 characters. Supports two decimal places.
	*/
	@SerializedName("shipping")
	private String shipping;

	public String shipping() { return shipping; }
	
	public AmountDetails shipping(String shipping) {
	    this.shipping = shipping;
	    return this;
	}

	/**
	* The shipping fee discount. Supported for the PayPal payment method only.
	*/
	@SerializedName("shipping_discount")
	private String shippingDiscount;

	public String shippingDiscount() { return shippingDiscount; }
	
	public AmountDetails shippingDiscount(String shippingDiscount) {
	    this.shippingDiscount = shippingDiscount;
	    return this;
	}

	/**
	* The subtotal amount for the items. If the request includes line items, this property is **required**. Maximum length is 10 characters. Supports two decimal places.
	*/
	@SerializedName("subtotal")
	private String subtotal;

	public String subtotal() { return subtotal; }
	
	public AmountDetails subtotal(String subtotal) {
	    this.subtotal = subtotal;
	    return this;
	}

	/**
	* The tax. Maximum length is 10 characters. Supports two decimal places.
	*/
	@SerializedName("tax")
	private String tax;

	public String tax() { return tax; }
	
	public AmountDetails tax(String tax) {
	    this.tax = tax;
	    return this;
	}
}
