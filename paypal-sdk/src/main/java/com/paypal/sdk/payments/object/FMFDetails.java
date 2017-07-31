// This class was generated on Mon, 31 Jul 2017 18:27:14 UTC by version 0.1 of Braintree SDK Generator
// FMFDetails.java
// DO NOT EDIT
// @type object
// @json {"Type":"FMF Details","VariableName":"","Description":"The [Fraud Management Filter (FMF)](/docs/classic/fmf/integration-guide/FMFSummary/) details.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":[{"Type":"string","VariableName":"description","Description":"The filter description.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"filter_id","Description":"The filter ID.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null},{"Type":"string","VariableName":"filter_type","Description":"The filter type.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null},{"Type":"string","VariableName":"name","Description":"The filter name.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.payments.object;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.serializer.Serializable;
import com.braintreepayments.http.serializer.Deserializable;

/**
 * The [Fraud Management Filter (FMF)](/docs/classic/fmf/integration-guide/FMFSummary/) details.
 */
public class FMFDetails implements Serializable, Deserializable {

    // Required default constructor
    public FMFDetails() {}

	/**
	* The filter description.
	*/
	private String description;

	public String description() { return description; }
	
	public FMFDetails description(String description) {
	    this.description = description;
	    return this;
	}

	/**
	* REQUIRED
	* The filter ID.
	*/
	private String filterId;

	public String filterId() { return filterId; }
	
	public FMFDetails filterId(String filterId) {
	    this.filterId = filterId;
	    return this;
	}

	/**
	* REQUIRED
	* The filter type.
	*/
	private String filterType;

	public String filterType() { return filterType; }
	
	public FMFDetails filterType(String filterType) {
	    this.filterType = filterType;
	    return this;
	}

	/**
	* The filter name.
	*/
	private String name;

	public String name() { return name; }
	
	public FMFDetails name(String name) {
	    this.name = name;
	    return this;
	}

    @Override
    public void serialize(Map<String, Object> serialized) {
        if (description != null) {
            serialized.put("description", this.description);
        }
        if (filterId != null) {
            serialized.put("filter_id", this.filterId);
        }
        if (filterType != null) {
            serialized.put("filter_type", this.filterType);
        }
        if (name != null) {
            serialized.put("name", this.name);
        }
    }

    @Override
    public void deserialize(Map<String, Object> values) {
        if (values.containsKey("description")) {
            this.description = (String) values.get("description");
        }
        if (values.containsKey("filter_id")) {
            this.filterId = (String) values.get("filter_id");
        }
        if (values.containsKey("filter_type")) {
            this.filterType = (String) values.get("filter_type");
        }
        if (values.containsKey("name")) {
            this.name = (String) values.get("name");
        }
    }
}

