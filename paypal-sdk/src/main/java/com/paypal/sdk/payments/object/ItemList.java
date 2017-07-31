// This class was generated on Mon, 31 Jul 2017 18:27:14 UTC by version 0.1 of Braintree SDK Generator
// ItemList.java
// DO NOT EDIT
// @type object
// @json {"Type":"Item list","VariableName":"","Description":"The list of items being paid for.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":[{"Type":"Item","VariableName":"items","Description":"The list of items being paid for.","IsArray":true,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Shipping Address","VariableName":"shipping_address","Description":"The extended address, which is used as the shipping address in a payment.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"shipping_method","Description":"The shipping method used for this payment, such as USPS Parcel.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"shipping_phone_number","Description":"The shipping phone number, in its canonical international format as defined by the [E.164](https://en.wikipedia.org/wiki/E.164) numbering plan. Enables merchants to share payer’s contact number with PayPal for the current payment. The final contact number for the payer who is associated with the transaction might be the same as or different from the `shipping_phone_number` based on the payer’s action on PayPal.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.payments.object;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.serializer.Serializable;
import com.braintreepayments.http.serializer.Deserializable;

/**
 * The list of items being paid for.
 */
public class ItemList implements Serializable, Deserializable {

    // Required default constructor
    public ItemList() {}

	/**
	* The list of items being paid for.
	*/
	private List<Item> items;

	public List<Item> items() { return items; }
	
	public ItemList items(List<Item> items) {
	    this.items = items;
	    return this;
	}

	/**
	* The extended address, which is used as the shipping address in a payment.
	*/
	private ShippingAddress shippingAddress;

	public ShippingAddress shippingAddress() { return shippingAddress; }
	
	public ItemList shippingAddress(ShippingAddress shippingAddress) {
	    this.shippingAddress = shippingAddress;
	    return this;
	}

	/**
	* The shipping method used for this payment, such as USPS Parcel.
	*/
	private String shippingMethod;

	public String shippingMethod() { return shippingMethod; }
	
	public ItemList shippingMethod(String shippingMethod) {
	    this.shippingMethod = shippingMethod;
	    return this;
	}

	/**
	* The shipping phone number, in its canonical international format as defined by the [E.164](https://en.wikipedia.org/wiki/E.164) numbering plan. Enables merchants to share payer’s contact number with PayPal for the current payment. The final contact number for the payer who is associated with the transaction might be the same as or different from the `shipping_phone_number` based on the payer’s action on PayPal.
	*/
	private String shippingPhoneNumber;

	public String shippingPhoneNumber() { return shippingPhoneNumber; }
	
	public ItemList shippingPhoneNumber(String shippingPhoneNumber) {
	    this.shippingPhoneNumber = shippingPhoneNumber;
	    return this;
	}

    @Override
    public void serialize(Map<String, Object> serialized) {
        if (items != null) {
            serialized.put("items", this.items);
        }
        if (shippingAddress != null) {
            serialized.put("shipping_address", this.shippingAddress);
        }
        if (shippingMethod != null) {
            serialized.put("shipping_method", this.shippingMethod);
        }
        if (shippingPhoneNumber != null) {
            serialized.put("shipping_phone_number", this.shippingPhoneNumber);
        }
    }

    @Override
    public void deserialize(Map<String, Object> values) {
        if (values.containsKey("items")) {
            this.items = new ArrayList<>();
				List<Map<String, Object>> nestedValues = (List<Map<String, Object>>) values.get("items");
				for (Map<String, Object> nestedValue : nestedValues) {
					Item nested = new Item();
					nested.deserialize(nestedValue);
					this.items.add(nested);
                }
        }
        if (values.containsKey("shipping_address")) {
            this.shippingAddress = new ShippingAddress();
            this.shippingAddress.deserialize((Map<String, Object>) values.get("shipping_address"));
        }
        if (values.containsKey("shipping_method")) {
            this.shippingMethod = (String) values.get("shipping_method");
        }
        if (values.containsKey("shipping_phone_number")) {
            this.shippingPhoneNumber = (String) values.get("shipping_phone_number");
        }
    }
}

