// This class was generated on Mon, 29 Jan 2018 12:12:01 PST by version 0.1.0-dev+ecea6f of Braintree SDK Generator
// Metadata.java
// @version 0.1.0-dev+ecea6f
// @type object
// @data H4sIAAAAAAAC/+ySQavUMBCA7/6KIee8hycPvT3wJmqRZUFkkdl2ug2bJnEmEYPsf5e0ddduFxXXk3gpdCaZ+b7JfFWbHEhVaqCILUZUWm2RDe4tvcGhZJRWryhffl6SNGxCNN6pSr2e7z0qrZ6YMU/1nmv1jrB962xWVYdWqAQ+JcPUngM1+0AcDYmqPpxJSidA18IWbSKo0fAaKniJe2yOH2fmC+F1Zon75AALJfgOHA70gK59+Dw2CmhYIPYYofEuonFAXyKxQwullgZJTQ8okIRYj1/oiNrSTYM0nkmP4OLBu6uBvPjzgUhk4w7rGRT+hfocWBpveoIjZeg8Q+zplvUjvPcJhiTFnJksRhrPTkeKUrkFMQeSex/aJWtP+pdyY+uF3ffIWm/C/Jng32De/UD9WzsqKQRLA7mInNeLejN9z7aWEsCzB+wz1JhrtNNgGJ1gU+pCYN+QiHGH/zv6z+3o7vTsGwAAAP//
// DO NOT EDIT
package com.paypal.sdk.v1.orders;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * Metadata.
 */
@Model
public class Metadata {

    // Required default constructor
    public Metadata() {}

	/**
	* An array of name-and-value pairs that contain external data, such as user, user feedback, score, and so on.
	*/
	@SerializedName(value = "postback_data", listClass = NameAndValuePair.class)
	private List<NameAndValuePair> postbackData;

	public List<NameAndValuePair> postbackData() { return postbackData; }
	
	public Metadata postbackData(List<NameAndValuePair> postbackData) {
	    this.postbackData = postbackData;
	    return this;
	}

	/**
	* An array of name-and-value pairs that contain data required by PayPal for transaction processing.
	*/
	@SerializedName(value = "supplementary_data", listClass = NameAndValuePair.class)
	private List<NameAndValuePair> supplementaryData;

	public List<NameAndValuePair> supplementaryData() { return supplementaryData; }
	
	public Metadata supplementaryData(List<NameAndValuePair> supplementaryData) {
	    this.supplementaryData = supplementaryData;
	    return this;
	}
}
