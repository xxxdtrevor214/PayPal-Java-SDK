// This class was generated on Mon, 17 Jul 2017 10:51:10 PDT by version 0.01 of Braintree SDK Generator
// FMFDetails.java
// DO NOT EDIT
// @type object
// @json {"Type":"FMF Details","VariableName":"","Description":"The [Fraud Management Filter (FMF)](/docs/classic/fmf/integration-guide/FMFSummary/) details.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":[{"Type":"string","VariableName":"description","Description":"The filter description.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"filter_id","Description":"The filter ID.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null},{"Type":"string","VariableName":"filter_type","Description":"The filter type.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null},{"Type":"string","VariableName":"name","Description":"The filter name.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.payments.object;

import java.util.Map;
import java.util.List;
import com.google.gson.annotations.SerializedName;
/**
 * The [Fraud Management Filter (FMF)](/docs/classic/fmf/integration-guide/FMFSummary/) details.
 */
public class FMFDetails {

	/**
	* The filter description.
	*/
	@SerializedName("description")
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
	@SerializedName("filter_id")
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
	@SerializedName("filter_type")
	private String filterType;

	public String filterType() { return filterType; }
	
	public FMFDetails filterType(String filterType) {
	    this.filterType = filterType;
	    return this;
	}

	/**
	* The filter name.
	*/
	@SerializedName("name")
	private String name;

	public String name() { return name; }
	
	public FMFDetails name(String name) {
	    this.name = name;
	    return this;
	}
}
