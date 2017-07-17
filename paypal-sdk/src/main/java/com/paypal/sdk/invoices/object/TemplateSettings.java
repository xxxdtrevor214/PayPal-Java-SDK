// This class was generated on Mon, 17 Jul 2017 10:41:00 PDT by version 0.01 of Braintree SDK Generator
// TemplateSettings.java
// DO NOT EDIT
// @type object
// @json {"Type":"Template Settings","VariableName":"","Description":"The template settings.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":[{"Type":"Template Settings Metadata","VariableName":"display_preference","Description":"The template settings metadata.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"field_name","Description":"The field name for any field in `template_data` for which to map corresponding display preferences.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.invoices.object;

import java.util.Map;
import java.util.List;
import com.google.gson.annotations.SerializedName;
/**
 * The template settings.
 */
public class TemplateSettings {

	/**
	* The template settings metadata.
	*/
	@SerializedName("display_preference")
	private TemplateSettingsMetadata displayPreference;

	public TemplateSettingsMetadata displayPreference() { return displayPreference; }
	
	public TemplateSettings displayPreference(TemplateSettingsMetadata displayPreference) {
	    this.displayPreference = displayPreference;
	    return this;
	}

	/**
	* The field name for any field in `template_data` for which to map corresponding display preferences.
	*/
	@SerializedName("field_name")
	private String fieldName;

	public String fieldName() { return fieldName; }
	
	public TemplateSettings fieldName(String fieldName) {
	    this.fieldName = fieldName;
	    return this;
	}
}
