// This class was generated on Sun, 30 Jul 2017 11:04:05 PDT by version 0.1 of Braintree SDK Generator
// TemplateSettingsMetadata.java
// DO NOT EDIT
// @type object
// @json {"Type":"Template Settings Metadata","VariableName":"","Description":"The template settings metadata.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":[{"Type":"boolean","VariableName":"hidden","Description":"Indicates whether this field is hidden.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.invoices.object;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.serializer.Serializable;
import com.braintreepayments.http.serializer.Deserializable;

/**
 * The template settings metadata.
 */
public class TemplateSettingsMetadata implements Serializable, Deserializable {

    // Required default constructor
    public TemplateSettingsMetadata() {}

	/**
	* Indicates whether this field is hidden.
	*/
	private Boolean hidden;

	public Boolean hidden() { return hidden; }
	
	public TemplateSettingsMetadata hidden(Boolean hidden) {
	    this.hidden = hidden;
	    return this;
	}

    @Override
    public void serialize(Map<String, Object> serialized) {
        if (hidden != null) {
            serialized.put("hidden", this.hidden);
        }
    }

    @Override
    public void deserialize(Map<String, Object> values) {
        if (values.containsKey("hidden")) {
            this.hidden = (Boolean) values.get("hidden");
        }
    }
}

