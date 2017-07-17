// This class was generated on Mon, 17 Jul 2017 10:41:00 PDT by version 0.01 of Braintree SDK Generator
// Template.java
// DO NOT EDIT
// @type object
// @json {"Type":"Template","VariableName":"","Description":"Invoicing template.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":[{"Type":"boolean","VariableName":"custom","Description":"Indicates whether this template is a merchant-created custom template. Non-custom templates are system generated.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"boolean","VariableName":"default","Description":"Indicates whether this template is the default merchant template. A merchant can have one default template.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Link Description Object","VariableName":"links","Description":"The HATEOS links that enable template actions.","IsArray":true,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"name","Description":"The template name.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Template Settings","VariableName":"settings","Description":"Settings for each template.","IsArray":true,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Template Data","VariableName":"template_data","Description":"Template data.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"template_id","Description":"The ID of the template.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"unit_of_measure","Description":"The unit of measure for the template. Value is quantity, hours, or amount.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.invoices.object;

import java.util.Map;
import java.util.List;
import com.google.gson.annotations.SerializedName;
/**
 * Invoicing template.
 */
public class Template {

	/**
	* Indicates whether this template is a merchant-created custom template. Non-custom templates are system generated.
	*/
	@SerializedName("custom")
	private Boolean custom;

	public Boolean custom() { return custom; }
	
	public Template custom(Boolean custom) {
	    this.custom = custom;
	    return this;
	}

	/**
	* Indicates whether this template is the default merchant template. A merchant can have one default template.
	*/
	@SerializedName("default")
	private Boolean _default;

	public Boolean _default() { return _default; }
	
	public Template _default(Boolean _default) {
	    this._default = _default;
	    return this;
	}

	/**
	* The HATEOS links that enable template actions.
	*/
	@SerializedName("links")
	private List<LinkDescriptionObject> links;

	public List<LinkDescriptionObject> links() { return links; }
	
	public Template links(List<LinkDescriptionObject> links) {
	    this.links = links;
	    return this;
	}

	/**
	* The template name.
	*/
	@SerializedName("name")
	private String name;

	public String name() { return name; }
	
	public Template name(String name) {
	    this.name = name;
	    return this;
	}

	/**
	* Settings for each template.
	*/
	@SerializedName("settings")
	private List<TemplateSettings> settings;

	public List<TemplateSettings> settings() { return settings; }
	
	public Template settings(List<TemplateSettings> settings) {
	    this.settings = settings;
	    return this;
	}

	/**
	* Template data.
	*/
	@SerializedName("template_data")
	private TemplateData templateData;

	public TemplateData templateData() { return templateData; }
	
	public Template templateData(TemplateData templateData) {
	    this.templateData = templateData;
	    return this;
	}

	/**
	* The ID of the template.
	*/
	@SerializedName("template_id")
	private String templateId;

	public String templateId() { return templateId; }
	
	public Template templateId(String templateId) {
	    this.templateId = templateId;
	    return this;
	}

	/**
	* The unit of measure for the template. Value is quantity, hours, or amount.
	*/
	@SerializedName("unit_of_measure")
	private String unitOfMeasure;

	public String unitOfMeasure() { return unitOfMeasure; }
	
	public Template unitOfMeasure(String unitOfMeasure) {
	    this.unitOfMeasure = unitOfMeasure;
	    return this;
	}
}
