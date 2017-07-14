// This class was generated on Thu, 13 Jul 2017 09:07:17 PDT by version 0.01 of Braintree SDK Generator
// InvoiceItem.java
// DO NOT EDIT
// @type object
// @json {"Type":"Invoice Item","VariableName":"","Description":"Invoice line item information.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":[{"Type":"string","VariableName":"date","Description":"The date when the item or service was provided. The date format is *yyyy*-*MM*-*dd* *z*, as defined in [Internet Date/Time Format](http://tools.ietf.org/html/rfc3339#section-5.6).","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"description","Description":"The item description.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Cost","VariableName":"discount","Description":"The cost as a percent or an amount value. For example, to specify 10%, enter `10`. Alternatively, to specify an amount of 5, enter `5`.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"name","Description":"The item name.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null},{"Type":"number","VariableName":"quantity","Description":"The item quantity. Valid value is from -10000 to 10000.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null},{"Type":"Tax","VariableName":"tax","Description":"Tax information.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"unit_of_measure","Description":"The unit of measure for the invoiced item.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Currency","VariableName":"unit_price","Description":"Base object for all financial value related fields (balance, payment due, etc.)","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null}]}

package com.paypal.sdk.invoices.object;

import java.util.Map;
import java.util.List;
import com.google.gson.annotations.SerializedName;
/**
 * Invoice line item information.
 */
public class InvoiceItem {

	/**
	* The date when the item or service was provided. The date format is *yyyy*-*MM*-*dd* *z*, as defined in [Internet Date/Time Format](http://tools.ietf.org/html/rfc3339#section-5.6).
	*/
	@SerializedName("date")
	private String date;

	public String date() { return date; }
	
	public InvoiceItem date(String date) {
	    this.date = date;
	    return this;
	}

	/**
	* The item description.
	*/
	@SerializedName("description")
	private String description;

	public String description() { return description; }
	
	public InvoiceItem description(String description) {
	    this.description = description;
	    return this;
	}

	/**
	* The cost as a percent or an amount value. For example, to specify 10%, enter `10`. Alternatively, to specify an amount of 5, enter `5`.
	*/
	@SerializedName("discount")
	private Cost discount;

	public Cost discount() { return discount; }
	
	public InvoiceItem discount(Cost discount) {
	    this.discount = discount;
	    return this;
	}

	/**
	* REQUIRED
	* The item name.
	*/
	@SerializedName("name")
	private String name;

	public String name() { return name; }
	
	public InvoiceItem name(String name) {
	    this.name = name;
	    return this;
	}

	/**
	* REQUIRED
	* The item quantity. Valid value is from -10000 to 10000.
	*/
	@SerializedName("quantity")
	private Double quantity;

	public Double quantity() { return quantity; }
	
	public InvoiceItem quantity(Double quantity) {
	    this.quantity = quantity;
	    return this;
	}

	/**
	* Tax information.
	*/
	@SerializedName("tax")
	private Tax tax;

	public Tax tax() { return tax; }
	
	public InvoiceItem tax(Tax tax) {
	    this.tax = tax;
	    return this;
	}

	/**
	* The unit of measure for the invoiced item.
	*/
	@SerializedName("unit_of_measure")
	private String unitOfMeasure;

	public String unitOfMeasure() { return unitOfMeasure; }
	
	public InvoiceItem unitOfMeasure(String unitOfMeasure) {
	    this.unitOfMeasure = unitOfMeasure;
	    return this;
	}

	/**
	* REQUIRED
	* Base object for all financial value related fields (balance, payment due, etc.)
	*/
	@SerializedName("unit_price")
	private Currency unitPrice;

	public Currency unitPrice() { return unitPrice; }
	
	public InvoiceItem unitPrice(Currency unitPrice) {
	    this.unitPrice = unitPrice;
	    return this;
	}
}
