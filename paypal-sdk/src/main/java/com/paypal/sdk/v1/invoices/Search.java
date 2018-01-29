// This class was generated on Mon, 29 Jan 2018 12:12:00 PST by version 0.1.0-dev+ecea6f of Braintree SDK Generator
// Search.java
// @version 0.1.0-dev+ecea6f
// @type object
// @data H4sIAAAAAAAC/+yYS3PbNhDH7/0UO+wl0dBUW/cx1a2NkxlPJ0kncXuxPfIKWJrogAALLJ0ynXz3DviyKJJqmrrqQT5qH8D+fwDFXf4ZXVQFRavoLaETWRRHv6JTuNH0CvNgj+LoJ6ruf5yRF04VrKyJVtG5ubNKEPg6Gwp0mBOT80kURz84h1Wz/Bdx9IZQvja6ilYpak/B8HupHMne8LOzBTlW5KPVZV/YxlpNaMaVhR3VHclBhVvG3UqlEsjk4V1GnJEDtqCVZ8jJiQwNn3S5oBpVHpQBzggc+cIaTwmcp3DDrqSbuDfWi3iwRld7lmpSa6EzuaWZSTKl1uMc1Po+7l/CDjt8iHvinp0yt2PglKPSA9qdZYj6IiNQRrFCDZo4XAewaU2yTgCU0pE/WNlGroUjDNWtJTINJUx4x3LISOiiIERBal2tqD2DBM5aa44MysOiqqpqcbJ4+XJxspByAYv3ixjQg6RUmfqQ4fLcMDlDXCcvL1RO8KJe4fpJxlyslku2VvtEEaeJdbfLjHO9dKk4PT39/nNPItRz8k3y7dMDspQlTWPcckwTlCUdO7xW8TTAHecMxOMGWGCVk+FpgDvOaYBt0DGAfFY6R0ZUY5TaviO3Zsuo15jb0vAA5qR7iPNH9AR28xsJrimGF1KqDBoR/vfvUJfhxamRSUKqSEsPTzao0QiK78+gpBiIRfL0wfqFucsjWhbPrBxeHHEPaajwtH17QRcBwkraPvxNBedvX8PXX3353YEegZrroPzOMqy9OTQoi9DmvAKpbhUDpkFNuO6ShMpRe/AUejYO5ze4052s/gHBonC2cCo8HgMe/0h46J0mdF9/hHJT5htyA+m9aar/aBrTJuSBD6ffd6fEAm+HZ9MaxuXZNPXEPdy2fXbkS83+gNWuvXo/LrmzjusOXgjew5Q+dxccCVWo8E+/Kb0y5P3aBM+2kPmYj+5W+yWgWwLCEgcXmSrneZ/CQcAnyKvz/x9tGvdL2/Z/grKQfkhhntHxnnFj2j8WVsc9jhw9scmhY+Sa43jkg0fDaXb0mHTPojx2jLMDyKR7DuMRDSF7cHLpdxE2pvmGrglJ4MJ2rcemao0x+IKESivgTPl2BEEPaACDnCQAAfoD80JTDDdX7X5X0Qour6I3z1/88urs+dlVdH3zwAhmv2E2E5YIvfradQtuE5kJ+NtvmxlBnQp1aujeCd34g+ahxs2yKPaNm5Pux3Hzcdz8r8bN6w+f/QUAAP//
// DO NOT EDIT
package com.paypal.sdk.v1.invoices;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * Invoice search parameters.
 */
@Model
public class Search {

    // Required default constructor
    public Search() {}

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
