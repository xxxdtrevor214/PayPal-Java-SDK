// This class was generated on Thu, 13 Jul 2017 09:07:17 PDT by version 0.01 of Braintree SDK Generator
// Templates.java
// DO NOT EDIT
// @type object
// @json {"Type":"Templates","VariableName":"","Description":"List of merchant templates.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":[{"Type":"Address","VariableName":"addresses","Description":"List of addresses in merchant profile.","IsArray":true,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"emails","Description":"List of emails in merchant profile.","IsArray":true,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Link Description Object","VariableName":"links","Description":"The HATEOAS links that provide related actions for the templates in the response.","IsArray":true,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Phone","VariableName":"phones","Description":"List of phone numbers in merchant profile.","IsArray":true,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Template","VariableName":"templates","Description":"An array of templates.","IsArray":true,"ReadOnly":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.invoices.object;

import java.util.Map;
import java.util.List;
import com.google.gson.annotations.SerializedName;
/**
 * List of merchant templates.
 */
public class Templates {

	/**
	* List of addresses in merchant profile.
	*/
	@SerializedName("addresses")
	private List<Address> addresses;

	public List<Address> addresses() { return addresses; }
	
	public Templates addresses(List<Address> addresses) {
	    this.addresses = addresses;
	    return this;
	}

	/**
	* List of emails in merchant profile.
	*/
	@SerializedName("emails")
	private List<String> emails;

	public List<String> emails() { return emails; }
	
	public Templates emails(List<String> emails) {
	    this.emails = emails;
	    return this;
	}

	/**
	* The HATEOAS links that provide related actions for the templates in the response.
	*/
	@SerializedName("links")
	private List<LinkDescriptionObject> links;

	public List<LinkDescriptionObject> links() { return links; }
	
	public Templates links(List<LinkDescriptionObject> links) {
	    this.links = links;
	    return this;
	}

	/**
	* List of phone numbers in merchant profile.
	*/
	@SerializedName("phones")
	private List<Phone> phones;

	public List<Phone> phones() { return phones; }
	
	public Templates phones(List<Phone> phones) {
	    this.phones = phones;
	    return this;
	}

	/**
	* An array of templates.
	*/
	@SerializedName("templates")
	private List<Template> templates;

	public List<Template> templates() { return templates; }
	
	public Templates templates(List<Template> templates) {
	    this.templates = templates;
	    return this;
	}
}
