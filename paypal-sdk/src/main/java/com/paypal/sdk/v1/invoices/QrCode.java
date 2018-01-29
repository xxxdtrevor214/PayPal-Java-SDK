// This class was generated on Mon, 29 Jan 2018 12:12:00 PST by version 0.1.0-dev+ecea6f of Braintree SDK Generator
// QrCode.java
// @version 0.1.0-dev+ecea6f
// @type object
// @data H4sIAAAAAAAC/6TOP6vCMBQF8P19inDnwHvDwyGb6Cb4p4iLONw2tyWQJvEmHYL0u0tbrNTV8ZwL9/wecM6BQMGpEBuvCSRckA2WlvbYDgeQsKP8DluKFZuQjHegoMRIq39BrvKatDAtNiR8LVIONKXf4BqQsGbGPG39SSgI9cHZDKpGG2ko7p1h0nNxZB+Ik6EI6jorY2IzvvtAjksL6atZcr+EuM7a/tb/PAEAAP//
// DO NOT EDIT
package com.paypal.sdk.v1.invoices;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * base64 encoded image of type image/png
 */
@Model
public class QrCode {

    // Required default constructor
    public QrCode() {}

	/**
	*/
	@SerializedName("image")
	private String image;

	public String image() { return image; }
	
	public QrCode image(String image) {
	    this.image = image;
	    return this;
	}
}
