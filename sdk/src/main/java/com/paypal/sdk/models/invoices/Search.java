// This class was generated on Mon, 23 Jan 2017 15:08:17 PST by version 0.01 of Braintree SDK Generator
// Search.java
// DO NOT EDIT
// @object search
// @body {"Name":"archived","WireType":{"Name":"boolean","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"email","WireType":{"Name":"string","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"end_creation_date","WireType":{"Name":"string","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"end_due_date","WireType":{"Name":"string","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"end_invoice_date","WireType":{"Name":"string","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"end_payment_date","WireType":{"Name":"string","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"lower_total_amount","WireType":{"Name":"common_currency","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"number","WireType":{"Name":"string","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"page","WireType":{"Name":"number","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"page_size","WireType":{"Name":"number","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"recipient_business_name","WireType":{"Name":"string","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"recipient_first_name","WireType":{"Name":"string","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"recipient_last_name","WireType":{"Name":"string","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"start_creation_date","WireType":{"Name":"string","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"start_due_date","WireType":{"Name":"string","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"start_invoice_date","WireType":{"Name":"string","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"start_payment_date","WireType":{"Name":"string","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"status","WireType":{"Name":"string","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"total_count_required","WireType":{"Name":"boolean","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"upper_total_amount","WireType":{"Name":"common_currency","IsArray":false},"ReadOnly":false,"Visibility":""}

package com.paypal.sdk.models.invoices;

import com.paypal.sdk.models.common.*;
import java.util.List;
import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * Invoice search parameters.
 */
@Data
@Accessors(chain = true)
public class Search {
    
	/**
	* Indicates whether to list merchant-archived invoices in the response. If `true`, response lists only merchant-archived invoices. If `false`, response lists only unarchived invoices. If `null`, response lists all invoices.
	*/
	@SerializedName("archived")
	private boolean archived;
    
	/**
	* The initial letters of the email address.
	*/
	@SerializedName("email")
	private String email;
    
	/**
	* The end creation date for the invoice. Date format is *yyyy*-*MM*-*dd* *z*, as defined in [Internet Date/Time Format](http://tools.ietf.org/html/rfc3339#section-5.6).
	*/
	@SerializedName("end_creation_date")
	private String endCreationDate;
    
	/**
	* The end due date for the invoice. Date format is *yyyy*-*MM*-*dd* *z*, as defined in [Internet Date/Time Format](http://tools.ietf.org/html/rfc3339#section-5.6).
	*/
	@SerializedName("end_due_date")
	private String endDueDate;
    
	/**
	* The end date for the invoice. Date format is *yyyy*-*MM*-*dd* *z*, as defined in [Internet Date/Time Format](http://tools.ietf.org/html/rfc3339#section-5.6).
	*/
	@SerializedName("end_invoice_date")
	private String endInvoiceDate;
    
	/**
	* The end payment date for the invoice. Date format is *yyyy*-*MM*-*dd* *z*, as defined in [Internet Date/Time Format](http://tools.ietf.org/html/rfc3339#section-5.6).
	*/
	@SerializedName("end_payment_date")
	private String endPaymentDate;
    
	/**
	* The lower limit of the total amount.
	*/
	@SerializedName("lower_total_amount")
	private CommonCurrency lowerTotalAmount;
    
	/**
	* The invoice number.
	*/
	@SerializedName("number")
	private String number;
    
	/**
	* The offset for the search results.
	*/
	@SerializedName("page")
	private double page;
    
	/**
	* The page size for the search results.
	*/
	@SerializedName("page_size")
	private double pageSize;
    
	/**
	* The initial letters of the recipient business name.
	*/
	@SerializedName("recipient_business_name")
	private String recipientBusinessName;
    
	/**
	* The initial letters of the recipient first name.
	*/
	@SerializedName("recipient_first_name")
	private String recipientFirstName;
    
	/**
	* The initial letters of the recipient last name.
	*/
	@SerializedName("recipient_last_name")
	private String recipientLastName;
    
	/**
	* The start creation date for the invoice. Date format is *yyyy*-*MM*-*dd* *z*, as defined in [Internet Date/Time Format](http://tools.ietf.org/html/rfc3339#section-5.6).
	*/
	@SerializedName("start_creation_date")
	private String startCreationDate;
    
	/**
	* The start due date for the invoice. Date format is *yyyy*-*MM*-*dd* *z*, as defined in [Internet Date/Time Format](http://tools.ietf.org/html/rfc3339#section-5.6).
	*/
	@SerializedName("start_due_date")
	private String startDueDate;
    
	/**
	* The start date for the invoice. Date format is *yyyy*-*MM*-*dd* *z*, as defined in [Internet Date/Time Format](http://tools.ietf.org/html/rfc3339#section-5.6).
	*/
	@SerializedName("start_invoice_date")
	private String startInvoiceDate;
    
	/**
	* The start payment date for the invoice. Date format is *yyyy*-*MM*-*dd* *z*, as defined in [Internet Date/Time Format](http://tools.ietf.org/html/rfc3339#section-5.6).
	*/
	@SerializedName("start_payment_date")
	private String startPaymentDate;
    
	/**
	* An enumeration of the invoice statuses.
	*/
	@SerializedName("status")
	private String status;
    
	/**
	* Indicates whether the total count appears in the response. Default is `false`.
	*/
	@SerializedName("total_count_required")
	private boolean totalCountRequired;
    
	@SerializedName("upper_total_amount")
	private CommonCurrency upperTotalAmount;
}
