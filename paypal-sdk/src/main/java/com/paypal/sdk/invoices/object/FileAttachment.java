// This class was generated on Thu, 13 Jul 2017 09:07:17 PDT by version 0.01 of Braintree SDK Generator
// FileAttachment.java
// DO NOT EDIT
// @type object
// @json {"Type":"File Attachment","VariableName":"","Description":"The file attached to an invoice or template.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":[{"Type":"string","VariableName":"name","Description":"The name of the attached file.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"url","Description":"The URL of the attached file, which can be downloaded.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.invoices.object;

import java.util.Map;
import java.util.List;
import com.google.gson.annotations.SerializedName;
/**
 * The file attached to an invoice or template.
 */
public class FileAttachment {

	/**
	* The name of the attached file.
	*/
	@SerializedName("name")
	private String name;

	public String name() { return name; }
	
	public FileAttachment name(String name) {
	    this.name = name;
	    return this;
	}

	/**
	* The URL of the attached file, which can be downloaded.
	*/
	@SerializedName("url")
	private String url;

	public String url() { return url; }
	
	public FileAttachment url(String url) {
	    this.url = url;
	    return this;
	}
}
