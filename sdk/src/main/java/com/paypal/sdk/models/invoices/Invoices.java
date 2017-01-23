// This class was generated on Mon, 23 Jan 2017 15:08:17 PST by version 0.01 of Braintree SDK Generator
// Invoices.java
// DO NOT EDIT
// @object invoices
// @body {"Name":"invoices","WireType":{"Name":"invoice","IsArray":true},"ReadOnly":false,"Visibility":""}
// @body {"Name":"total_count","WireType":{"Name":"integer","IsArray":false},"ReadOnly":true,"Visibility":""}

package com.paypal.sdk.models.invoices;

import com.paypal.sdk.models.common.*;
import java.util.List;
import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * List of merchant invoices. Can include the total invoices count and HATEOAS links for navigation.
 */
@Data
@Accessors(chain = true)
public class Invoices {
    
	/**
	* An array of invoices as search result.
	*/
	@SerializedName("invoices")
	private List<Invoice> invoices;
    
	/**
	* The total number of invoices that match the search criteria.
	*/
	@Setter(AccessLevel.NONE)
	@SerializedName("total_count")
	private int totalCount;
}
