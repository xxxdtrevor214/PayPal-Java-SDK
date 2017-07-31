// This class was generated on Sun, 30 Jul 2017 11:04:05 PDT by version 0.1 of Braintree SDK Generator
// Templates.java
// DO NOT EDIT
// @type object
// @json {"Type":"Templates","VariableName":"","Description":"List of merchant templates.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":[{"Type":"Address","VariableName":"addresses","Description":"List of addresses in merchant profile.","IsArray":true,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"emails","Description":"List of emails in merchant profile.","IsArray":true,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Link Description Object","VariableName":"links","Description":"The HATEOAS links that provide related actions for the templates in the response.","IsArray":true,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Phone","VariableName":"phones","Description":"List of phone numbers in merchant profile.","IsArray":true,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Template","VariableName":"templates","Description":"An array of templates.","IsArray":true,"ReadOnly":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.invoices.object;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.serializer.Serializable;
import com.braintreepayments.http.serializer.Deserializable;

/**
 * List of merchant templates.
 */
public class Templates implements Serializable, Deserializable {

    // Required default constructor
    public Templates() {}

	/**
	* List of addresses in merchant profile.
	*/
	private List<Address> addresses;

	public List<Address> addresses() { return addresses; }
	
	public Templates addresses(List<Address> addresses) {
	    this.addresses = addresses;
	    return this;
	}

	/**
	* List of emails in merchant profile.
	*/
	private List<String> emails;

	public List<String> emails() { return emails; }
	
	public Templates emails(List<String> emails) {
	    this.emails = emails;
	    return this;
	}

	/**
	* The HATEOAS links that provide related actions for the templates in the response.
	*/
	private List<LinkDescriptionObject> links;

	public List<LinkDescriptionObject> links() { return links; }
	
	public Templates links(List<LinkDescriptionObject> links) {
	    this.links = links;
	    return this;
	}

	/**
	* List of phone numbers in merchant profile.
	*/
	private List<Phone> phones;

	public List<Phone> phones() { return phones; }
	
	public Templates phones(List<Phone> phones) {
	    this.phones = phones;
	    return this;
	}

	/**
	* An array of templates.
	*/
	private List<Template> templates;

	public List<Template> templates() { return templates; }
	
	public Templates templates(List<Template> templates) {
	    this.templates = templates;
	    return this;
	}

    @Override
    public void serialize(Map<String, Object> serialized) {
        if (addresses != null) {
            serialized.put("addresses", this.addresses);
        }
        if (emails != null) {
            serialized.put("emails", this.emails);
        }
        if (links != null) {
            serialized.put("links", this.links);
        }
        if (phones != null) {
            serialized.put("phones", this.phones);
        }
        if (templates != null) {
            serialized.put("templates", this.templates);
        }
    }

    @Override
    public void deserialize(Map<String, Object> values) {
        if (values.containsKey("addresses")) {
            this.addresses = new ArrayList<>();
				List<Map<String, Object>> nestedValues = (List<Map<String, Object>>) values.get("addresses");
				for (Map<String, Object> nestedValue : nestedValues) {
					Address nested = new Address();
					nested.deserialize(nestedValue);
					this.addresses.add(nested);
                }
        }
        if (values.containsKey("emails")) {
            this.emails = new ArrayList<>();
                List<String> nestedValues = (List<String>) values.get("emails");
                for (String nestedValue : nestedValues) {
                    this.emails.add(nestedValue);
                }
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
        if (values.containsKey("phones")) {
            this.phones = new ArrayList<>();
				List<Map<String, Object>> nestedValues = (List<Map<String, Object>>) values.get("phones");
				for (Map<String, Object> nestedValue : nestedValues) {
					Phone nested = new Phone();
					nested.deserialize(nestedValue);
					this.phones.add(nested);
                }
        }
        if (values.containsKey("templates")) {
            this.templates = new ArrayList<>();
				List<Map<String, Object>> nestedValues = (List<Map<String, Object>>) values.get("templates");
				for (Map<String, Object> nestedValue : nestedValues) {
					Template nested = new Template();
					nested.deserialize(nestedValue);
					this.templates.add(nested);
                }
        }
    }
}

