// This class was generated on Sun, 30 Jul 2017 11:04:05 PDT by version 0.1 of Braintree SDK Generator
// Template.java
// DO NOT EDIT
// @type object
// @json {"Type":"Template","VariableName":"","Description":"Invoicing template.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":[{"Type":"boolean","VariableName":"custom","Description":"Indicates whether this template is a merchant-created custom template. Non-custom templates are system generated.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"boolean","VariableName":"default","Description":"Indicates whether this template is the default merchant template. A merchant can have one default template.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Link Description Object","VariableName":"links","Description":"The HATEOS links that enable template actions.","IsArray":true,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"name","Description":"The template name.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Template Settings","VariableName":"settings","Description":"Settings for each template.","IsArray":true,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Template Data","VariableName":"template_data","Description":"Template data.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"template_id","Description":"The ID of the template.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"unit_of_measure","Description":"The unit of measure for the template. Value is quantity, hours, or amount.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.invoices.object;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.serializer.Serializable;
import com.braintreepayments.http.serializer.Deserializable;

/**
 * Invoicing template.
 */
public class Template implements Serializable, Deserializable {

    // Required default constructor
    public Template() {}

	/**
	* Indicates whether this template is a merchant-created custom template. Non-custom templates are system generated.
	*/
	private Boolean custom;

	public Boolean custom() { return custom; }
	
	public Template custom(Boolean custom) {
	    this.custom = custom;
	    return this;
	}

	/**
	* Indicates whether this template is the default merchant template. A merchant can have one default template.
	*/
	private Boolean _default;

	public Boolean _default() { return _default; }
	
	public Template _default(Boolean _default) {
	    this._default = _default;
	    return this;
	}

	/**
	* The HATEOS links that enable template actions.
	*/
	private List<LinkDescriptionObject> links;

	public List<LinkDescriptionObject> links() { return links; }
	
	public Template links(List<LinkDescriptionObject> links) {
	    this.links = links;
	    return this;
	}

	/**
	* The template name.
	*/
	private String name;

	public String name() { return name; }
	
	public Template name(String name) {
	    this.name = name;
	    return this;
	}

	/**
	* Settings for each template.
	*/
	private List<TemplateSettings> settings;

	public List<TemplateSettings> settings() { return settings; }
	
	public Template settings(List<TemplateSettings> settings) {
	    this.settings = settings;
	    return this;
	}

	/**
	* Template data.
	*/
	private TemplateData templateData;

	public TemplateData templateData() { return templateData; }
	
	public Template templateData(TemplateData templateData) {
	    this.templateData = templateData;
	    return this;
	}

	/**
	* The ID of the template.
	*/
	private String templateId;

	public String templateId() { return templateId; }
	
	public Template templateId(String templateId) {
	    this.templateId = templateId;
	    return this;
	}

	/**
	* The unit of measure for the template. Value is quantity, hours, or amount.
	*/
	private String unitOfMeasure;

	public String unitOfMeasure() { return unitOfMeasure; }
	
	public Template unitOfMeasure(String unitOfMeasure) {
	    this.unitOfMeasure = unitOfMeasure;
	    return this;
	}

    @Override
    public void serialize(Map<String, Object> serialized) {
        if (custom != null) {
            serialized.put("custom", this.custom);
        }
        if (_default != null) {
            serialized.put("default", this._default);
        }
        if (links != null) {
            serialized.put("links", this.links);
        }
        if (name != null) {
            serialized.put("name", this.name);
        }
        if (settings != null) {
            serialized.put("settings", this.settings);
        }
        if (templateData != null) {
            serialized.put("template_data", this.templateData);
        }
        if (templateId != null) {
            serialized.put("template_id", this.templateId);
        }
        if (unitOfMeasure != null) {
            serialized.put("unit_of_measure", this.unitOfMeasure);
        }
    }

    @Override
    public void deserialize(Map<String, Object> values) {
        if (values.containsKey("custom")) {
            this.custom = (Boolean) values.get("custom");
        }
        if (values.containsKey("default")) {
            this._default = (Boolean) values.get("default");
        }
        if (values.containsKey("links")) {
            this.links = new ArrayList<>();
				List<Map<String, Object>> nestedValues = (List<Map<String, Object>>) values.get("links");
				for (Map<String, Object> nestedValue : nestedValues) {
					LinkDescriptionObject nested = new LinkDescriptionObject();
					nested.deserialize(nestedValue);
					this.links.add(nested);
                }
        }
        if (values.containsKey("name")) {
            this.name = (String) values.get("name");
        }
        if (values.containsKey("settings")) {
            this.settings = new ArrayList<>();
				List<Map<String, Object>> nestedValues = (List<Map<String, Object>>) values.get("settings");
				for (Map<String, Object> nestedValue : nestedValues) {
					TemplateSettings nested = new TemplateSettings();
					nested.deserialize(nestedValue);
					this.settings.add(nested);
                }
        }
        if (values.containsKey("template_data")) {
            this.templateData = new TemplateData();
            this.templateData.deserialize((Map<String, Object>) values.get("template_data"));
        }
        if (values.containsKey("template_id")) {
            this.templateId = (String) values.get("template_id");
        }
        if (values.containsKey("unit_of_measure")) {
            this.unitOfMeasure = (String) values.get("unit_of_measure");
        }
    }
}

