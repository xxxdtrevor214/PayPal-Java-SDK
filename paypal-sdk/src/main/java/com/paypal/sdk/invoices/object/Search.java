// This class was generated on Thu, 13 Jul 2017 09:07:17 PDT by version 0.01 of Braintree SDK Generator
// Search.java
// DO NOT EDIT
// @type object
// @json {"Type":"Search","VariableName":"","Description":"Invoice search parameters.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":[{"Type":"boolean","VariableName":"archived","Description":"Indicates whether to list merchant-archived invoices in the response. If `true`, response lists only merchant-archived invoices. If `false`, response lists only unarchived invoices. If `null`, response lists all invoices.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"email","Description":"The initial letters of the email address.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"end_creation_date","Description":"The end creation date for the invoice. Date format is *yyyy*-*MM*-*dd* *z*, as defined in [Internet Date/Time Format](http://tools.ietf.org/html/rfc3339#section-5.6).","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"end_due_date","Description":"The end due date for the invoice. Date format is *yyyy*-*MM*-*dd* *z*, as defined in [Internet Date/Time Format](http://tools.ietf.org/html/rfc3339#section-5.6).","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"end_invoice_date","Description":"The end date for the invoice. Date format is *yyyy*-*MM*-*dd* *z*, as defined in [Internet Date/Time Format](http://tools.ietf.org/html/rfc3339#section-5.6).","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"end_payment_date","Description":"The end payment date for the invoice. Date format is *yyyy*-*MM*-*dd* *z*, as defined in [Internet Date/Time Format](http://tools.ietf.org/html/rfc3339#section-5.6).","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Currency","VariableName":"lower_total_amount","Description":"Base object for all financial value related fields (balance, payment due, etc.)","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"number","Description":"The invoice number.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"number","VariableName":"page","Description":"The offset for the search results.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"number","VariableName":"page_size","Description":"The page size for the search results.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"recipient_business_name","Description":"The initial letters of the recipient business name.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"recipient_first_name","Description":"The initial letters of the recipient first name.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"recipient_last_name","Description":"The initial letters of the recipient last name.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"start_creation_date","Description":"The start creation date for the invoice. Date format is *yyyy*-*MM*-*dd* *z*, as defined in [Internet Date/Time Format](http://tools.ietf.org/html/rfc3339#section-5.6).","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"start_due_date","Description":"The start due date for the invoice. Date format is *yyyy*-*MM*-*dd* *z*, as defined in [Internet Date/Time Format](http://tools.ietf.org/html/rfc3339#section-5.6).","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"start_invoice_date","Description":"The start date for the invoice. Date format is *yyyy*-*MM*-*dd* *z*, as defined in [Internet Date/Time Format](http://tools.ietf.org/html/rfc3339#section-5.6).","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"start_payment_date","Description":"The start payment date for the invoice. Date format is *yyyy*-*MM*-*dd* *z*, as defined in [Internet Date/Time Format](http://tools.ietf.org/html/rfc3339#section-5.6).","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"status","Description":"The invoice status. To search by status, specify this value as an array. For example, `\"status\": [\"REFUNDED\"]`.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"boolean","VariableName":"total_count_required","Description":"Indicates whether the total count appears in the response.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Currency","VariableName":"upper_total_amount","Description":"Base object for all financial value related fields (balance, payment due, etc.)","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.invoices.object;

import java.util.Map;
import java.util.List;
import com.google.gson.annotations.SerializedName;
/**
 * Invoice search parameters.
 */
public class Search {

	/**
	* Indicates whether to list merchant-archived invoices in the response. If `true`, response lists only merchant-archived invoices. If `false`, response lists only unarchived invoices. If `null`, response lists all invoices.
	*/
	@SerializedName("archived")
	private Boolean archived;

	public Boolean archived() { return archived; }
	
	public Search archived(Boolean archived) {
	    this.archived = archived;
	    return this;
	}

	/**
	* The initial letters of the email address.
	*/
	@SerializedName("email")
	private String email;

	public String email() { return email; }
	
	public Search email(String email) {
	    this.email = email;
	    return this;
	}

	/**
	* The end creation date for the invoice. Date format is *yyyy*-*MM*-*dd* *z*, as defined in [Internet Date/Time Format](http://tools.ietf.org/html/rfc3339#section-5.6).
	*/
	@SerializedName("end_creation_date")
	private String endCreationDate;

	public String endCreationDate() { return endCreationDate; }
	
	public Search endCreationDate(String endCreationDate) {
	    this.endCreationDate = endCreationDate;
	    return this;
	}

	/**
	* The end due date for the invoice. Date format is *yyyy*-*MM*-*dd* *z*, as defined in [Internet Date/Time Format](http://tools.ietf.org/html/rfc3339#section-5.6).
	*/
	@SerializedName("end_due_date")
	private String endDueDate;

	public String endDueDate() { return endDueDate; }
	
	public Search endDueDate(String endDueDate) {
	    this.endDueDate = endDueDate;
	    return this;
	}

	/**
	* The end date for the invoice. Date format is *yyyy*-*MM*-*dd* *z*, as defined in [Internet Date/Time Format](http://tools.ietf.org/html/rfc3339#section-5.6).
	*/
	@SerializedName("end_invoice_date")
	private String endInvoiceDate;

	public String endInvoiceDate() { return endInvoiceDate; }
	
	public Search endInvoiceDate(String endInvoiceDate) {
	    this.endInvoiceDate = endInvoiceDate;
	    return this;
	}

	/**
	* The end payment date for the invoice. Date format is *yyyy*-*MM*-*dd* *z*, as defined in [Internet Date/Time Format](http://tools.ietf.org/html/rfc3339#section-5.6).
	*/
	@SerializedName("end_payment_date")
	private String endPaymentDate;

	public String endPaymentDate() { return endPaymentDate; }
	
	public Search endPaymentDate(String endPaymentDate) {
	    this.endPaymentDate = endPaymentDate;
	    return this;
	}

	/**
	* Base object for all financial value related fields (balance, payment due, etc.)
	*/
	@SerializedName("lower_total_amount")
	private Currency lowerTotalAmount;

	public Currency lowerTotalAmount() { return lowerTotalAmount; }
	
	public Search lowerTotalAmount(Currency lowerTotalAmount) {
	    this.lowerTotalAmount = lowerTotalAmount;
	    return this;
	}

	/**
	* The invoice number.
	*/
	@SerializedName("number")
	private String number;

	public String number() { return number; }
	
	public Search number(String number) {
	    this.number = number;
	    return this;
	}

	/**
	* The offset for the search results.
	*/
	@SerializedName("page")
	private Double page;

	public Double page() { return page; }
	
	public Search page(Double page) {
	    this.page = page;
	    return this;
	}

	/**
	* The page size for the search results.
	*/
	@SerializedName("page_size")
	private Double pageSize;

	public Double pageSize() { return pageSize; }
	
	public Search pageSize(Double pageSize) {
	    this.pageSize = pageSize;
	    return this;
	}

	/**
	* The initial letters of the recipient business name.
	*/
	@SerializedName("recipient_business_name")
	private String recipientBusinessName;

	public String recipientBusinessName() { return recipientBusinessName; }
	
	public Search recipientBusinessName(String recipientBusinessName) {
	    this.recipientBusinessName = recipientBusinessName;
	    return this;
	}

	/**
	* The initial letters of the recipient first name.
	*/
	@SerializedName("recipient_first_name")
	private String recipientFirstName;

	public String recipientFirstName() { return recipientFirstName; }
	
	public Search recipientFirstName(String recipientFirstName) {
	    this.recipientFirstName = recipientFirstName;
	    return this;
	}

	/**
	* The initial letters of the recipient last name.
	*/
	@SerializedName("recipient_last_name")
	private String recipientLastName;

	public String recipientLastName() { return recipientLastName; }
	
	public Search recipientLastName(String recipientLastName) {
	    this.recipientLastName = recipientLastName;
	    return this;
	}

	/**
	* The start creation date for the invoice. Date format is *yyyy*-*MM*-*dd* *z*, as defined in [Internet Date/Time Format](http://tools.ietf.org/html/rfc3339#section-5.6).
	*/
	@SerializedName("start_creation_date")
	private String startCreationDate;

	public String startCreationDate() { return startCreationDate; }
	
	public Search startCreationDate(String startCreationDate) {
	    this.startCreationDate = startCreationDate;
	    return this;
	}

	/**
	* The start due date for the invoice. Date format is *yyyy*-*MM*-*dd* *z*, as defined in [Internet Date/Time Format](http://tools.ietf.org/html/rfc3339#section-5.6).
	*/
	@SerializedName("start_due_date")
	private String startDueDate;

	public String startDueDate() { return startDueDate; }
	
	public Search startDueDate(String startDueDate) {
	    this.startDueDate = startDueDate;
	    return this;
	}

	/**
	* The start date for the invoice. Date format is *yyyy*-*MM*-*dd* *z*, as defined in [Internet Date/Time Format](http://tools.ietf.org/html/rfc3339#section-5.6).
	*/
	@SerializedName("start_invoice_date")
	private String startInvoiceDate;

	public String startInvoiceDate() { return startInvoiceDate; }
	
	public Search startInvoiceDate(String startInvoiceDate) {
	    this.startInvoiceDate = startInvoiceDate;
	    return this;
	}

	/**
	* The start payment date for the invoice. Date format is *yyyy*-*MM*-*dd* *z*, as defined in [Internet Date/Time Format](http://tools.ietf.org/html/rfc3339#section-5.6).
	*/
	@SerializedName("start_payment_date")
	private String startPaymentDate;

	public String startPaymentDate() { return startPaymentDate; }
	
	public Search startPaymentDate(String startPaymentDate) {
	    this.startPaymentDate = startPaymentDate;
	    return this;
	}

	/**
	* The invoice status. To search by status, specify this value as an array. For example, `"status": ["REFUNDED"]`.
	*/
	@SerializedName("status")
	private String status;

	public String status() { return status; }
	
	public Search status(String status) {
	    this.status = status;
	    return this;
	}

	/**
	* Indicates whether the total count appears in the response.
	*/
	@SerializedName("total_count_required")
	private Boolean totalCountRequired;

	public Boolean totalCountRequired() { return totalCountRequired; }
	
	public Search totalCountRequired(Boolean totalCountRequired) {
	    this.totalCountRequired = totalCountRequired;
	    return this;
	}

	/**
	* Base object for all financial value related fields (balance, payment due, etc.)
	*/
	@SerializedName("upper_total_amount")
	private Currency upperTotalAmount;

	public Currency upperTotalAmount() { return upperTotalAmount; }
	
	public Search upperTotalAmount(Currency upperTotalAmount) {
	    this.upperTotalAmount = upperTotalAmount;
	    return this;
	}
}
