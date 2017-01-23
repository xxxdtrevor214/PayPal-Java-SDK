// This class was generated on Mon, 23 Jan 2017 15:08:17 PST by version 0.01 of Braintree SDK Generator
// Template.java
// DO NOT EDIT
// @object template
// @body {"Name":"custom","WireType":{"Name":"boolean","IsArray":false},"ReadOnly":true,"Visibility":""}
// @body {"Name":"default","WireType":{"Name":"boolean","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"name","WireType":{"Name":"string","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"settings","WireType":{"Name":"TemplateSettings","IsArray":true},"ReadOnly":false,"Visibility":""}
// @body {"Name":"template_data","WireType":{"Name":"template_data","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"template_id","WireType":{"Name":"string","IsArray":false},"ReadOnly":true,"Visibility":""}
// @body {"Name":"unit_of_measure","WireType":{"Name":"string","IsArray":false},"ReadOnly":false,"Visibility":""}

package com.paypal.sdk.models.invoices;

import com.paypal.sdk.models.common.*;
import java.util.List;
import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * Invoicing template.
 */
@Data
@Accessors(chain = true)
public class Template {
    
	/**
	* Indicates whether this template is a merchant-created custom template. Non-custom templates are system generated.
	*/
	@Setter(AccessLevel.NONE)
	@SerializedName("custom")
	private boolean custom;
    
	/**
	* Indicates whether this template is the default merchant template. A merchant can have one default template.
	*/
	@SerializedName("default")
	private boolean isDefault;
    
	/**
	* The template name.
	*/
	@SerializedName("name")
	private String name;
    
	/**
	* Settings for each template.
	*/
	@SerializedName("settings")
	private List<TemplateSettings> settings;
    
	@SerializedName("template_data")
	private TemplateData templateData;
    
	/**
	* The ID of the template.
	*/
	@Setter(AccessLevel.NONE)
	@SerializedName("template_id")
	private String templateId;
    
	/**
	* The unit of measure for the template. Value is quantity, hours, or amount.
	*/
	@SerializedName("unit_of_measure")
	private String unitOfMeasure;
}
