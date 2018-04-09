// This class was generated on Mon, 09 Apr 2018 16:10:52 UTC by version 0.1.0-dev+291f3f of Braintree SDK Generator
// Document.java
// @version 0.1.0-dev+291f3f
// @type object
// @data H4sIAAAAAAAC/7zPsWrDMBAG4L1PcdxsQmdvhiyh0Ibgdikdzta1VpEl9XQa3JJ3LyImiSmkQ0smcb9O4vu/sJ0iY43r0OeRvWKFTySWOsf3NJYbrPCOp9Ow5tSLjWqDxxobDzm6QIYNmPkP0IEUUo4xiCYgMDbFrLyCdmBothtIuRutJtCBT6+orHbWk0wQunfudYUVNiI0HZC3Fe6YzIN3E9av5BKX4CNbYXMMthIii1pOWD8f6yUV699+lvPlOC84B8uS7TmzbPwV5rNz++pXXbKfS90cXNCVjSvpsrgF7jBfsD3uNv9Ce9nffAMAAP//
// DO NOT EDIT
package com.paypal.sdk.v1.customerdisputes;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * An uploaded document that supports a dispute. The API submits the document as a binary object.
 */
@Model
public class Document {

    // Required default constructor
    public Document() {}

	/**
	* The document name.
	*/
	@SerializedName("name")
	private String name;

	public String name() { return name; }
	
	public Document name(String name) {
	    this.name = name;
	    return this;
	}

	/**
	* The document size.
	*/
	@SerializedName("size")
	private String size;

	public String size() { return size; }
	
	public Document size(String size) {
	    this.size = size;
	    return this;
	}

	/**
	* The document URI.
	*/
	@SerializedName("url")
	private String url;

	public String url() { return url; }
	
	public Document url(String url) {
	    this.url = url;
	    return this;
	}
}
