// This class was generated on Thu, 13 Jul 2017 09:07:17 PDT by version 0.01 of Braintree SDK Generator
// TemplateSettingsMetadata.java
// DO NOT EDIT
// @type object
// @json {"Type":"Template Settings Metadata","VariableName":"","Description":"The template settings metadata.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":[{"Type":"boolean","VariableName":"hidden","Description":"Indicates whether this field is hidden.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.invoices.object;

import java.util.Map;
import java.util.List;
import com.google.gson.annotations.SerializedName;
/**
 * The template settings metadata.
 */
public class TemplateSettingsMetadata {

	/**
	* Indicates whether this field is hidden.
	*/
	@SerializedName("hidden")
	private Boolean hidden;

	public Boolean hidden() { return hidden; }
	
	public TemplateSettingsMetadata hidden(Boolean hidden) {
	    this.hidden = hidden;
	    return this;
	}
}
