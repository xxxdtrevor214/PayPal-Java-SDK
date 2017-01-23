// This class was generated on Mon, 23 Jan 2017 15:08:17 PST by version 0.01 of Braintree SDK Generator
// Item.java
// DO NOT EDIT
// @object item
// @body {"Name":"date","WireType":{"Name":"string","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"description","WireType":{"Name":"string","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"discount","WireType":{"Name":"cost","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"image_url","WireType":{"Name":"string","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"name","WireType":{"Name":"string","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"quantity","WireType":{"Name":"number","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"tax","WireType":{"Name":"tax","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"unit_of_measure","WireType":{"Name":"string","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"unit_price","WireType":{"Name":"common_currency","IsArray":false},"ReadOnly":false,"Visibility":""}

package com.paypal.sdk.models.invoices;

import com.paypal.sdk.models.common.*;
import java.util.List;
import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * Line item information.
 */
@Data
@Accessors(chain = true)
public class Item {
    
	/**
	* The date when the item or service was provided. The date format is *yyyy*-*MM*-*dd* *z*, as defined in [Internet Date/Time Format](http://tools.ietf.org/html/rfc3339#section-5.6).
	*/
	@SerializedName("date")
	private String date;
    
	/**
	* The item description.
	*/
	@SerializedName("description")
	private String description;
    
	@SerializedName("discount")
	private Cost discount;
    
	/**
	* The image URL.
	*/
	@SerializedName("image_url")
	private String imageUrl;
    
	/**
	* The item name.
	*/
	@SerializedName("name")
	private String name;
    
	/**
	* The item quantity. Valid value is from -10000 to 10000.
	*/
	@SerializedName("quantity")
	private double quantity;
    
	@SerializedName("tax")
	private Tax tax;
    
	/**
	* An enumeration of the units of measure for the invoiced item.
	*/
	@SerializedName("unit_of_measure")
	private String unitOfMeasure;
    
	/**
	* The item unit price. Valid value is from -1,000,000 to 1,000,000.
	*/
	@SerializedName("unit_price")
	private CommonCurrency unitPrice;
}
