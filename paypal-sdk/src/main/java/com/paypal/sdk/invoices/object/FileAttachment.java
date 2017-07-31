// This class was generated on Sun, 30 Jul 2017 11:04:05 PDT by version 0.1 of Braintree SDK Generator
// FileAttachment.java
// DO NOT EDIT
// @type object
// @json {"Type":"File Attachment","VariableName":"","Description":"The file attached to an invoice or template.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":[{"Type":"string","VariableName":"name","Description":"The name of the attached file.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"url","Description":"The URL of the attached file, which can be downloaded.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.invoices.object;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.serializer.Serializable;
import com.braintreepayments.http.serializer.Deserializable;

/**
 * The file attached to an invoice or template.
 */
public class FileAttachment implements Serializable, Deserializable {

    // Required default constructor
    public FileAttachment() {}

	/**
	* The name of the attached file.
	*/
	private String name;

	public String name() { return name; }
	
	public FileAttachment name(String name) {
	    this.name = name;
	    return this;
	}

	/**
	* The URL of the attached file, which can be downloaded.
	*/
	private String url;

	public String url() { return url; }
	
	public FileAttachment url(String url) {
	    this.url = url;
	    return this;
	}

    @Override
    public void serialize(Map<String, Object> serialized) {
        if (name != null) {
            serialized.put("name", this.name);
        }
        if (url != null) {
            serialized.put("url", this.url);
        }
    }

    @Override
    public void deserialize(Map<String, Object> values) {
        if (values.containsKey("name")) {
            this.name = (String) values.get("name");
        }
        if (values.containsKey("url")) {
            this.url = (String) values.get("url");
        }
    }
}

