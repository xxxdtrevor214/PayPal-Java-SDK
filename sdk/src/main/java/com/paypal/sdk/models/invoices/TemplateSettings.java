// This class was generated on Mon, 23 Jan 2017 15:08:17 PST by version 0.01 of Braintree SDK Generator
// TemplateSettings.java
// DO NOT EDIT
// @object TemplateSettings
// @body {"Name":"display_preference","WireType":{"Name":"TemplateSettingsMetadata","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"field_name","WireType":{"Name":"string","IsArray":false},"ReadOnly":false,"Visibility":""}

package com.paypal.sdk.models.invoices;

import com.paypal.sdk.models.common.*;
import java.util.List;
import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * The template settings.
 */
@Data
@Accessors(chain = true)
public class TemplateSettings {
    
	@SerializedName("display_preference")
	private TemplateSettingsMetadata displayPreference;
    
	/**
	* The field name for any field in `template_data` for which to map corresponding display preferences.
	*/
	@SerializedName("field_name")
	private String fieldName;
}
