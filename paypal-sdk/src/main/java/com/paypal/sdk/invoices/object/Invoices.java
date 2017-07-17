// This class was generated on Mon, 17 Jul 2017 10:41:00 PDT by version 0.01 of Braintree SDK Generator
// Invoices.java
// DO NOT EDIT
// @type object
// @json {"Type":"Invoices","VariableName":"","Description":"List of merchant invoices. Can include the total invoices count and HATEOAS links for navigation.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":[{"Type":"Invoice","VariableName":"invoices","Description":"An array of invoices as search result.","IsArray":true,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Link Description Object","VariableName":"links","Description":"The HATEOAS links for `next` and `previous` navigation in the result set.","IsArray":true,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"integer","VariableName":"total_count","Description":"The total number of invoices that match the search criteria.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.invoices.object;

import java.util.Map;
import java.util.List;
import com.google.gson.annotations.SerializedName;
/**
 * List of merchant invoices. Can include the total invoices count and HATEOAS links for navigation.
 */
public class Invoices {

	/**
	* An array of invoices as search result.
	*/
	@SerializedName("invoices")
	private List<Invoice> invoices;

	public List<Invoice> invoices() { return invoices; }
	
	public Invoices invoices(List<Invoice> invoices) {
	    this.invoices = invoices;
	    return this;
	}

	/**
	* The HATEOAS links for `next` and `previous` navigation in the result set.
	*/
	@SerializedName("links")
	private List<LinkDescriptionObject> links;

	public List<LinkDescriptionObject> links() { return links; }
	
	public Invoices links(List<LinkDescriptionObject> links) {
	    this.links = links;
	    return this;
	}

	/**
	* The total number of invoices that match the search criteria.
	*/
	@SerializedName("total_count")
	private Integer totalCount;

	public Integer totalCount() { return totalCount; }
	
	public Invoices totalCount(Integer totalCount) {
	    this.totalCount = totalCount;
	    return this;
	}
}
