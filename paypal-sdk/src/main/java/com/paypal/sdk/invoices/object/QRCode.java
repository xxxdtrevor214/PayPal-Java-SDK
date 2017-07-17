// This class was generated on Mon, 17 Jul 2017 10:41:00 PDT by version 0.01 of Braintree SDK Generator
// QRCode.java
// DO NOT EDIT
// @type object
// @json {"Type":"QR Code","VariableName":"","Description":"base64 encoded image of type image/png","IsArray":false,"ReadOnly":false,"Required":false,"Properties":[{"Type":"string","VariableName":"image","Description":"","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.invoices.object;

import java.util.Map;
import java.util.List;
import com.google.gson.annotations.SerializedName;
/**
 * base64 encoded image of type image/png
 */
public class QRCode {

	/**
	*/
	@SerializedName("image")
	private String image;

	public String image() { return image; }
	
	public QRCode image(String image) {
	    this.image = image;
	    return this;
	}
}
