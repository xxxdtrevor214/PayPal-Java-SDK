// This class was generated on Sun, 30 Jul 2017 11:04:05 PDT by version 0.1 of Braintree SDK Generator
// QRCode.java
// DO NOT EDIT
// @type object
// @json {"Type":"QR Code","VariableName":"","Description":"base64 encoded image of type image/png","IsArray":false,"ReadOnly":false,"Required":false,"Properties":[{"Type":"string","VariableName":"image","Description":"","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.invoices.object;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.serializer.Serializable;
import com.braintreepayments.http.serializer.Deserializable;

/**
 * base64 encoded image of type image/png
 */
public class QRCode implements Serializable, Deserializable {

    // Required default constructor
    public QRCode() {}

	/**
	*/
	private String image;

	public String image() { return image; }
	
	public QRCode image(String image) {
	    this.image = image;
	    return this;
	}

    @Override
    public void serialize(Map<String, Object> serialized) {
        if (image != null) {
            serialized.put("image", this.image);
        }
    }

    @Override
    public void deserialize(Map<String, Object> values) {
        if (values.containsKey("image")) {
            this.image = (String) values.get("image");
        }
    }
}

