// This class was generated on Mon, 23 Jan 2017 15:08:17 PST by version 0.01 of Braintree SDK Generator
// TemplateSettingsMetadata.java
// DO NOT EDIT
// @object TemplateSettingsMetadata
// @body {"Name":"hidden","WireType":{"Name":"boolean","IsArray":false},"ReadOnly":false,"Visibility":""}

package com.paypal.sdk.models.invoices;

import com.paypal.sdk.models.common.*;
import java.util.List;
import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * The template settings metadata.
 */
@Data
@Accessors(chain = true)
public class TemplateSettingsMetadata {
    
	/**
	* Indicates whether this field is hidden. Default is `false`.
	*/
	@SerializedName("hidden")
	private boolean hidden;
}
