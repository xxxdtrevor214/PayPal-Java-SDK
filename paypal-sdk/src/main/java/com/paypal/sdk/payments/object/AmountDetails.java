// This class was generated on Mon, 31 Jul 2017 18:27:14 UTC by version 0.1 of Braintree SDK Generator
// AmountDetails.java
// DO NOT EDIT
// @type object
// @json {"Type":"Amount Details","VariableName":"","Description":"The additional details about the payment amount.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":[{"Type":"string","VariableName":"gift_wrap","Description":"The gift wrap fee.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"handling_fee","Description":"The handling fee. Supported for the PayPal payment method only.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"insurance","Description":"The insurance fee. Supported for the PayPal payment method only.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"shipping","Description":"The shipping fee. Maximum length is 10 characters. Supports two decimal places.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"shipping_discount","Description":"The shipping fee discount. Supported for the PayPal payment method only.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"subtotal","Description":"The subtotal amount for the items. If the request includes line items, this property is **required**. Maximum length is 10 characters. Supports two decimal places.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"tax","Description":"The tax. Maximum length is 10 characters. Supports two decimal places.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.payments.object;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.serializer.Serializable;
import com.braintreepayments.http.serializer.Deserializable;

/**
 * The additional details about the payment amount.
 */
public class AmountDetails implements Serializable, Deserializable {

    // Required default constructor
    public AmountDetails() {}

	/**
	* The gift wrap fee.
	*/
	private String giftWrap;

	public String giftWrap() { return giftWrap; }
	
	public AmountDetails giftWrap(String giftWrap) {
	    this.giftWrap = giftWrap;
	    return this;
	}

	/**
	* The handling fee. Supported for the PayPal payment method only.
	*/
	private String handlingFee;

	public String handlingFee() { return handlingFee; }
	
	public AmountDetails handlingFee(String handlingFee) {
	    this.handlingFee = handlingFee;
	    return this;
	}

	/**
	* The insurance fee. Supported for the PayPal payment method only.
	*/
	private String insurance;

	public String insurance() { return insurance; }
	
	public AmountDetails insurance(String insurance) {
	    this.insurance = insurance;
	    return this;
	}

	/**
	* The shipping fee. Maximum length is 10 characters. Supports two decimal places.
	*/
	private String shipping;

	public String shipping() { return shipping; }
	
	public AmountDetails shipping(String shipping) {
	    this.shipping = shipping;
	    return this;
	}

	/**
	* The shipping fee discount. Supported for the PayPal payment method only.
	*/
	private String shippingDiscount;

	public String shippingDiscount() { return shippingDiscount; }
	
	public AmountDetails shippingDiscount(String shippingDiscount) {
	    this.shippingDiscount = shippingDiscount;
	    return this;
	}

	/**
	* The subtotal amount for the items. If the request includes line items, this property is **required**. Maximum length is 10 characters. Supports two decimal places.
	*/
	private String subtotal;

	public String subtotal() { return subtotal; }
	
	public AmountDetails subtotal(String subtotal) {
	    this.subtotal = subtotal;
	    return this;
	}

	/**
	* The tax. Maximum length is 10 characters. Supports two decimal places.
	*/
	private String tax;

	public String tax() { return tax; }
	
	public AmountDetails tax(String tax) {
	    this.tax = tax;
	    return this;
	}

    @Override
    public void serialize(Map<String, Object> serialized) {
        if (giftWrap != null) {
            serialized.put("gift_wrap", this.giftWrap);
        }
        if (handlingFee != null) {
            serialized.put("handling_fee", this.handlingFee);
        }
        if (insurance != null) {
            serialized.put("insurance", this.insurance);
        }
        if (shipping != null) {
            serialized.put("shipping", this.shipping);
        }
        if (shippingDiscount != null) {
            serialized.put("shipping_discount", this.shippingDiscount);
        }
        if (subtotal != null) {
            serialized.put("subtotal", this.subtotal);
        }
        if (tax != null) {
            serialized.put("tax", this.tax);
        }
    }

    @Override
    public void deserialize(Map<String, Object> values) {
        if (values.containsKey("gift_wrap")) {
            this.giftWrap = (String) values.get("gift_wrap");
        }
        if (values.containsKey("handling_fee")) {
            this.handlingFee = (String) values.get("handling_fee");
        }
        if (values.containsKey("insurance")) {
            this.insurance = (String) values.get("insurance");
        }
        if (values.containsKey("shipping")) {
            this.shipping = (String) values.get("shipping");
        }
        if (values.containsKey("shipping_discount")) {
            this.shippingDiscount = (String) values.get("shipping_discount");
        }
        if (values.containsKey("subtotal")) {
            this.subtotal = (String) values.get("subtotal");
        }
        if (values.containsKey("tax")) {
            this.tax = (String) values.get("tax");
        }
    }
}

