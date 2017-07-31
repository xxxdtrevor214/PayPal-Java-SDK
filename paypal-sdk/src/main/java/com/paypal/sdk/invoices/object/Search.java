// This class was generated on Sun, 30 Jul 2017 11:04:05 PDT by version 0.1 of Braintree SDK Generator
// Search.java
// DO NOT EDIT
// @type object
// @json {"Type":"Search","VariableName":"","Description":"Invoice search parameters.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":[{"Type":"boolean","VariableName":"archived","Description":"Indicates whether to list merchant-archived invoices in the response. If `true`, response lists only merchant-archived invoices. If `false`, response lists only unarchived invoices. If `null`, response lists all invoices.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"email","Description":"The initial letters of the email address.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"end_creation_date","Description":"The end creation date for the invoice. Date format is *yyyy*-*MM*-*dd* *z*, as defined in [Internet Date/Time Format](http://tools.ietf.org/html/rfc3339#section-5.6).","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"end_due_date","Description":"The end due date for the invoice. Date format is *yyyy*-*MM*-*dd* *z*, as defined in [Internet Date/Time Format](http://tools.ietf.org/html/rfc3339#section-5.6).","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"end_invoice_date","Description":"The end date for the invoice. Date format is *yyyy*-*MM*-*dd* *z*, as defined in [Internet Date/Time Format](http://tools.ietf.org/html/rfc3339#section-5.6).","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"end_payment_date","Description":"The end payment date for the invoice. Date format is *yyyy*-*MM*-*dd* *z*, as defined in [Internet Date/Time Format](http://tools.ietf.org/html/rfc3339#section-5.6).","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Currency","VariableName":"lower_total_amount","Description":"Base object for all financial value related fields (balance, payment due, etc.)","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"number","Description":"The invoice number.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"number","VariableName":"page","Description":"The offset for the search results.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"number","VariableName":"page_size","Description":"The page size for the search results.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"recipient_business_name","Description":"The initial letters of the recipient business name.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"recipient_first_name","Description":"The initial letters of the recipient first name.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"recipient_last_name","Description":"The initial letters of the recipient last name.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"start_creation_date","Description":"The start creation date for the invoice. Date format is *yyyy*-*MM*-*dd* *z*, as defined in [Internet Date/Time Format](http://tools.ietf.org/html/rfc3339#section-5.6).","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"start_due_date","Description":"The start due date for the invoice. Date format is *yyyy*-*MM*-*dd* *z*, as defined in [Internet Date/Time Format](http://tools.ietf.org/html/rfc3339#section-5.6).","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"start_invoice_date","Description":"The start date for the invoice. Date format is *yyyy*-*MM*-*dd* *z*, as defined in [Internet Date/Time Format](http://tools.ietf.org/html/rfc3339#section-5.6).","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"start_payment_date","Description":"The start payment date for the invoice. Date format is *yyyy*-*MM*-*dd* *z*, as defined in [Internet Date/Time Format](http://tools.ietf.org/html/rfc3339#section-5.6).","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"status","Description":"The invoice status. To search by status, specify this value as an array. For example, `\"status\": [\"REFUNDED\"]`.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"boolean","VariableName":"total_count_required","Description":"Indicates whether the total count appears in the response.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Currency","VariableName":"upper_total_amount","Description":"Base object for all financial value related fields (balance, payment due, etc.)","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.invoices.object;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.serializer.Serializable;
import com.braintreepayments.http.serializer.Deserializable;

/**
 * Invoice search parameters.
 */
public class Search implements Serializable, Deserializable {

    // Required default constructor
    public Search() {}

	/**
	* Indicates whether to list merchant-archived invoices in the response. If `true`, response lists only merchant-archived invoices. If `false`, response lists only unarchived invoices. If `null`, response lists all invoices.
	*/
	private Boolean archived;

	public Boolean archived() { return archived; }
	
	public Search archived(Boolean archived) {
	    this.archived = archived;
	    return this;
	}

	/**
	* The initial letters of the email address.
	*/
	private String email;

	public String email() { return email; }
	
	public Search email(String email) {
	    this.email = email;
	    return this;
	}

	/**
	* The end creation date for the invoice. Date format is *yyyy*-*MM*-*dd* *z*, as defined in [Internet Date/Time Format](http://tools.ietf.org/html/rfc3339#section-5.6).
	*/
	private String endCreationDate;

	public String endCreationDate() { return endCreationDate; }
	
	public Search endCreationDate(String endCreationDate) {
	    this.endCreationDate = endCreationDate;
	    return this;
	}

	/**
	* The end due date for the invoice. Date format is *yyyy*-*MM*-*dd* *z*, as defined in [Internet Date/Time Format](http://tools.ietf.org/html/rfc3339#section-5.6).
	*/
	private String endDueDate;

	public String endDueDate() { return endDueDate; }
	
	public Search endDueDate(String endDueDate) {
	    this.endDueDate = endDueDate;
	    return this;
	}

	/**
	* The end date for the invoice. Date format is *yyyy*-*MM*-*dd* *z*, as defined in [Internet Date/Time Format](http://tools.ietf.org/html/rfc3339#section-5.6).
	*/
	private String endInvoiceDate;

	public String endInvoiceDate() { return endInvoiceDate; }
	
	public Search endInvoiceDate(String endInvoiceDate) {
	    this.endInvoiceDate = endInvoiceDate;
	    return this;
	}

	/**
	* The end payment date for the invoice. Date format is *yyyy*-*MM*-*dd* *z*, as defined in [Internet Date/Time Format](http://tools.ietf.org/html/rfc3339#section-5.6).
	*/
	private String endPaymentDate;

	public String endPaymentDate() { return endPaymentDate; }
	
	public Search endPaymentDate(String endPaymentDate) {
	    this.endPaymentDate = endPaymentDate;
	    return this;
	}

	/**
	* Base object for all financial value related fields (balance, payment due, etc.)
	*/
	private Currency lowerTotalAmount;

	public Currency lowerTotalAmount() { return lowerTotalAmount; }
	
	public Search lowerTotalAmount(Currency lowerTotalAmount) {
	    this.lowerTotalAmount = lowerTotalAmount;
	    return this;
	}

	/**
	* The invoice number.
	*/
	private String number;

	public String number() { return number; }
	
	public Search number(String number) {
	    this.number = number;
	    return this;
	}

	/**
	* The offset for the search results.
	*/
	private Double page;

	public Double page() { return page; }
	
	public Search page(Double page) {
	    this.page = page;
	    return this;
	}

	/**
	* The page size for the search results.
	*/
	private Double pageSize;

	public Double pageSize() { return pageSize; }
	
	public Search pageSize(Double pageSize) {
	    this.pageSize = pageSize;
	    return this;
	}

	/**
	* The initial letters of the recipient business name.
	*/
	private String recipientBusinessName;

	public String recipientBusinessName() { return recipientBusinessName; }
	
	public Search recipientBusinessName(String recipientBusinessName) {
	    this.recipientBusinessName = recipientBusinessName;
	    return this;
	}

	/**
	* The initial letters of the recipient first name.
	*/
	private String recipientFirstName;

	public String recipientFirstName() { return recipientFirstName; }
	
	public Search recipientFirstName(String recipientFirstName) {
	    this.recipientFirstName = recipientFirstName;
	    return this;
	}

	/**
	* The initial letters of the recipient last name.
	*/
	private String recipientLastName;

	public String recipientLastName() { return recipientLastName; }
	
	public Search recipientLastName(String recipientLastName) {
	    this.recipientLastName = recipientLastName;
	    return this;
	}

	/**
	* The start creation date for the invoice. Date format is *yyyy*-*MM*-*dd* *z*, as defined in [Internet Date/Time Format](http://tools.ietf.org/html/rfc3339#section-5.6).
	*/
	private String startCreationDate;

	public String startCreationDate() { return startCreationDate; }
	
	public Search startCreationDate(String startCreationDate) {
	    this.startCreationDate = startCreationDate;
	    return this;
	}

	/**
	* The start due date for the invoice. Date format is *yyyy*-*MM*-*dd* *z*, as defined in [Internet Date/Time Format](http://tools.ietf.org/html/rfc3339#section-5.6).
	*/
	private String startDueDate;

	public String startDueDate() { return startDueDate; }
	
	public Search startDueDate(String startDueDate) {
	    this.startDueDate = startDueDate;
	    return this;
	}

	/**
	* The start date for the invoice. Date format is *yyyy*-*MM*-*dd* *z*, as defined in [Internet Date/Time Format](http://tools.ietf.org/html/rfc3339#section-5.6).
	*/
	private String startInvoiceDate;

	public String startInvoiceDate() { return startInvoiceDate; }
	
	public Search startInvoiceDate(String startInvoiceDate) {
	    this.startInvoiceDate = startInvoiceDate;
	    return this;
	}

	/**
	* The start payment date for the invoice. Date format is *yyyy*-*MM*-*dd* *z*, as defined in [Internet Date/Time Format](http://tools.ietf.org/html/rfc3339#section-5.6).
	*/
	private String startPaymentDate;

	public String startPaymentDate() { return startPaymentDate; }
	
	public Search startPaymentDate(String startPaymentDate) {
	    this.startPaymentDate = startPaymentDate;
	    return this;
	}

	/**
	* The invoice status. To search by status, specify this value as an array. For example, `"status": ["REFUNDED"]`.
	*/
	private String status;

	public String status() { return status; }
	
	public Search status(String status) {
	    this.status = status;
	    return this;
	}

	/**
	* Indicates whether the total count appears in the response.
	*/
	private Boolean totalCountRequired;

	public Boolean totalCountRequired() { return totalCountRequired; }
	
	public Search totalCountRequired(Boolean totalCountRequired) {
	    this.totalCountRequired = totalCountRequired;
	    return this;
	}

	/**
	* Base object for all financial value related fields (balance, payment due, etc.)
	*/
	private Currency upperTotalAmount;

	public Currency upperTotalAmount() { return upperTotalAmount; }
	
	public Search upperTotalAmount(Currency upperTotalAmount) {
	    this.upperTotalAmount = upperTotalAmount;
	    return this;
	}

    @Override
    public void serialize(Map<String, Object> serialized) {
        if (archived != null) {
            serialized.put("archived", this.archived);
        }
        if (email != null) {
            serialized.put("email", this.email);
        }
        if (endCreationDate != null) {
            serialized.put("end_creation_date", this.endCreationDate);
        }
        if (endDueDate != null) {
            serialized.put("end_due_date", this.endDueDate);
        }
        if (endInvoiceDate != null) {
            serialized.put("end_invoice_date", this.endInvoiceDate);
        }
        if (endPaymentDate != null) {
            serialized.put("end_payment_date", this.endPaymentDate);
        }
        if (lowerTotalAmount != null) {
            serialized.put("lower_total_amount", this.lowerTotalAmount);
        }
        if (number != null) {
            serialized.put("number", this.number);
        }
        if (page != null) {
            serialized.put("page", this.page);
        }
        if (pageSize != null) {
            serialized.put("page_size", this.pageSize);
        }
        if (recipientBusinessName != null) {
            serialized.put("recipient_business_name", this.recipientBusinessName);
        }
        if (recipientFirstName != null) {
            serialized.put("recipient_first_name", this.recipientFirstName);
        }
        if (recipientLastName != null) {
            serialized.put("recipient_last_name", this.recipientLastName);
        }
        if (startCreationDate != null) {
            serialized.put("start_creation_date", this.startCreationDate);
        }
        if (startDueDate != null) {
            serialized.put("start_due_date", this.startDueDate);
        }
        if (startInvoiceDate != null) {
            serialized.put("start_invoice_date", this.startInvoiceDate);
        }
        if (startPaymentDate != null) {
            serialized.put("start_payment_date", this.startPaymentDate);
        }
        if (status != null) {
            serialized.put("status", this.status);
        }
        if (totalCountRequired != null) {
            serialized.put("total_count_required", this.totalCountRequired);
        }
        if (upperTotalAmount != null) {
            serialized.put("upper_total_amount", this.upperTotalAmount);
        }
    }

    @Override
    public void deserialize(Map<String, Object> values) {
        if (values.containsKey("archived")) {
            this.archived = (Boolean) values.get("archived");
        }
        if (values.containsKey("email")) {
            this.email = (String) values.get("email");
        }
        if (values.containsKey("end_creation_date")) {
            this.endCreationDate = (String) values.get("end_creation_date");
        }
        if (values.containsKey("end_due_date")) {
            this.endDueDate = (String) values.get("end_due_date");
        }
        if (values.containsKey("end_invoice_date")) {
            this.endInvoiceDate = (String) values.get("end_invoice_date");
        }
        if (values.containsKey("end_payment_date")) {
            this.endPaymentDate = (String) values.get("end_payment_date");
        }
        if (values.containsKey("lower_total_amount")) {
            this.lowerTotalAmount = new Currency();
            this.lowerTotalAmount.deserialize((Map<String, Object>) values.get("lower_total_amount"));
        }
        if (values.containsKey("number")) {
            this.number = (String) values.get("number");
        }
        if (values.containsKey("page")) {
            this.page = ((Number) values.get("page")).doubleValue();
        }
        if (values.containsKey("page_size")) {
            this.pageSize = ((Number) values.get("page_size")).doubleValue();
        }
        if (values.containsKey("recipient_business_name")) {
            this.recipientBusinessName = (String) values.get("recipient_business_name");
        }
        if (values.containsKey("recipient_first_name")) {
            this.recipientFirstName = (String) values.get("recipient_first_name");
        }
        if (values.containsKey("recipient_last_name")) {
            this.recipientLastName = (String) values.get("recipient_last_name");
        }
        if (values.containsKey("start_creation_date")) {
            this.startCreationDate = (String) values.get("start_creation_date");
        }
        if (values.containsKey("start_due_date")) {
            this.startDueDate = (String) values.get("start_due_date");
        }
        if (values.containsKey("start_invoice_date")) {
            this.startInvoiceDate = (String) values.get("start_invoice_date");
        }
        if (values.containsKey("start_payment_date")) {
            this.startPaymentDate = (String) values.get("start_payment_date");
        }
        if (values.containsKey("status")) {
            this.status = (String) values.get("status");
        }
        if (values.containsKey("total_count_required")) {
            this.totalCountRequired = (Boolean) values.get("total_count_required");
        }
        if (values.containsKey("upper_total_amount")) {
            this.upperTotalAmount = new Currency();
            this.upperTotalAmount.deserialize((Map<String, Object>) values.get("upper_total_amount"));
        }
    }
}

