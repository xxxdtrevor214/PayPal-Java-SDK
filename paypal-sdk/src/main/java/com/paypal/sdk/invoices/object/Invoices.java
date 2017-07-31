// This class was generated on Sun, 30 Jul 2017 11:04:05 PDT by version 0.1 of Braintree SDK Generator
// Invoices.java
// DO NOT EDIT
// @type object
// @json {"Type":"Invoices","VariableName":"","Description":"List of merchant invoices. Can include the total invoices count and HATEOAS links for navigation.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":[{"Type":"Invoice","VariableName":"invoices","Description":"An array of invoices as search result.","IsArray":true,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Link Description Object","VariableName":"links","Description":"The HATEOAS links for `next` and `previous` navigation in the result set.","IsArray":true,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"integer","VariableName":"total_count","Description":"The total number of invoices that match the search criteria.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.invoices.object;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.serializer.Serializable;
import com.braintreepayments.http.serializer.Deserializable;

/**
 * List of merchant invoices. Can include the total invoices count and HATEOAS links for navigation.
 */
public class Invoices implements Serializable, Deserializable {

    // Required default constructor
    public Invoices() {}

	/**
	* An array of invoices as search result.
	*/
	private List<Invoice> invoices;

	public List<Invoice> invoices() { return invoices; }
	
	public Invoices invoices(List<Invoice> invoices) {
	    this.invoices = invoices;
	    return this;
	}

	/**
	* The HATEOAS links for `next` and `previous` navigation in the result set.
	*/
	private List<LinkDescriptionObject> links;

	public List<LinkDescriptionObject> links() { return links; }
	
	public Invoices links(List<LinkDescriptionObject> links) {
	    this.links = links;
	    return this;
	}

	/**
	* The total number of invoices that match the search criteria.
	*/
	private Integer totalCount;

	public Integer totalCount() { return totalCount; }
	
	public Invoices totalCount(Integer totalCount) {
	    this.totalCount = totalCount;
	    return this;
	}

    @Override
    public void serialize(Map<String, Object> serialized) {
        if (invoices != null) {
            serialized.put("invoices", this.invoices);
        }
        if (links != null) {
            serialized.put("links", this.links);
        }
        if (totalCount != null) {
            serialized.put("total_count", this.totalCount);
        }
    }

    @Override
    public void deserialize(Map<String, Object> values) {
        if (values.containsKey("invoices")) {
            this.invoices = new ArrayList<>();
				List<Map<String, Object>> nestedValues = (List<Map<String, Object>>) values.get("invoices");
				for (Map<String, Object> nestedValue : nestedValues) {
					Invoice nested = new Invoice();
					nested.deserialize(nestedValue);
					this.invoices.add(nested);
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
        if (values.containsKey("total_count")) {
            this.totalCount = ((Number) values.get("total_count")).intValue();
        }
    }
}

