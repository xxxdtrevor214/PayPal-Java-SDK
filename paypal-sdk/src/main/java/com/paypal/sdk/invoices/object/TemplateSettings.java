// This class was generated on Sun, 30 Jul 2017 11:04:05 PDT by version 0.1 of Braintree SDK Generator
// TemplateSettings.java
// DO NOT EDIT
// @type object
// @json {"Type":"Template Settings","VariableName":"","Description":"The template settings.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":[{"Type":"Template Settings Metadata","VariableName":"display_preference","Description":"The template settings metadata.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"field_name","Description":"The field name for any field in `template_data` for which to map corresponding display preferences.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.invoices.object;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.serializer.Serializable;
import com.braintreepayments.http.serializer.Deserializable;

/**
 * The template settings.
 */
public class TemplateSettings implements Serializable, Deserializable {

    // Required default constructor
    public TemplateSettings() {}

	/**
	* The template settings metadata.
	*/
	private TemplateSettingsMetadata displayPreference;

	public TemplateSettingsMetadata displayPreference() { return displayPreference; }
	
	public TemplateSettings displayPreference(TemplateSettingsMetadata displayPreference) {
	    this.displayPreference = displayPreference;
	    return this;
	}

	/**
	* The field name for any field in `template_data` for which to map corresponding display preferences.
	*/
	private String fieldName;

	public String fieldName() { return fieldName; }
	
	public TemplateSettings fieldName(String fieldName) {
	    this.fieldName = fieldName;
	    return this;
	}

    @Override
    public void serialize(Map<String, Object> serialized) {
        if (displayPreference != null) {
            serialized.put("display_preference", this.displayPreference);
        }
        if (fieldName != null) {
            serialized.put("field_name", this.fieldName);
        }
    }

    @Override
    public void deserialize(Map<String, Object> values) {
        if (values.containsKey("display_preference")) {
            this.displayPreference = new TemplateSettingsMetadata();
            this.displayPreference.deserialize((Map<String, Object>) values.get("display_preference"));
        }
        if (values.containsKey("field_name")) {
            this.fieldName = (String) values.get("field_name");
        }
    }
}

