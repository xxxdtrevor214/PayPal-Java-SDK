// This class was generated on Mon, 03 Jul 2017 13:56:47 PDT by version 0.01 of Braintree SDK Generator
// ItemList.java
// DO NOT EDIT
// @type object
// @json {"Type":"Item List","VariableName":"","Description":"The list of items being paid for.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":[{"Type":"Item","VariableName":"items","Description":"The list of items being paid for.","IsArray":true,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Shipping Address","VariableName":"shipping_address","Description":"The extended address, which is used as the shipping address in a payment.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"shipping_method","Description":"The shipping method used for this payment, such as USPS Parcel.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"shipping_phone_number","Description":"The shipping phone number, in its canonical international format as defined by the [E.164](https://en.wikipedia.org/wiki/E.164) numbering plan. Enables merchants to share payer’s contact number with PayPal for the current payment. The final contact number for the payer who is associated with the transaction might be the same as or different from the `shipping_phone_number` based on the payer’s action on PayPal.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.payments.object;

import java.util.Map;
import java.util.List;
import com.google.gson.annotations.SerializedName;
/**
 * The list of items being paid for.
 */
public class ItemList {

	/**
	* The list of items being paid for.
	*/
	@SerializedName("items")
	private List<Item> items;

	public List<Item> items() { return items; }
	
	public ItemList items(List<Item> items) {
	    this.items = items;
	    return this;
	}

	/**
	* The extended address, which is used as the shipping address in a payment.
	*/
	@SerializedName("shipping_address")
	private ShippingAddress shippingAddress;

	public ShippingAddress shippingAddress() { return shippingAddress; }
	
	public ItemList shippingAddress(ShippingAddress shippingAddress) {
	    this.shippingAddress = shippingAddress;
	    return this;
	}

	/**
	* The shipping method used for this payment, such as USPS Parcel.
	*/
	@SerializedName("shipping_method")
	private String shippingMethod;

	public String shippingMethod() { return shippingMethod; }
	
	public ItemList shippingMethod(String shippingMethod) {
	    this.shippingMethod = shippingMethod;
	    return this;
	}

	/**
	* The shipping phone number, in its canonical international format as defined by the [E.164](https://en.wikipedia.org/wiki/E.164) numbering plan. Enables merchants to share payer’s contact number with PayPal for the current payment. The final contact number for the payer who is associated with the transaction might be the same as or different from the `shipping_phone_number` based on the payer’s action on PayPal.
	*/
	@SerializedName("shipping_phone_number")
	private String shippingPhoneNumber;

	public String shippingPhoneNumber() { return shippingPhoneNumber; }
	
	public ItemList shippingPhoneNumber(String shippingPhoneNumber) {
	    this.shippingPhoneNumber = shippingPhoneNumber;
	    return this;
	}
}
