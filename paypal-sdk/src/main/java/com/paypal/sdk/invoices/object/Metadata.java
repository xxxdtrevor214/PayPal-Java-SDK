// This class was generated on Mon, 17 Jul 2017 10:41:00 PDT by version 0.01 of Braintree SDK Generator
// Metadata.java
// DO NOT EDIT
// @type object
// @json {"Type":"Metadata","VariableName":"","Description":"Audit information for the resource.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":[{"Type":"string","VariableName":"cancelled_by","Description":"The actor who canceled the resource.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"cancelled_date","Description":"The date and time when the resource was canceled.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"created_by","Description":"The email address of the account that created the resource.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"created_date","Description":"The date and time when the resource was created.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"first_sent_date","Description":"The date and time when the resource was first sent.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"last_sent_by","Description":"The email address of the account that last sent the resource.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"last_sent_date","Description":"The date and time when the resource was last sent.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"last_updated_by","Description":"The email address of the account that last edited the resource.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"last_updated_date","Description":"The date and time when the resource was last edited.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"payer_view_url","Description":"URL representing the payer's view of the invoice.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.invoices.object;

import java.util.Map;
import java.util.List;
import com.google.gson.annotations.SerializedName;
/**
 * Audit information for the resource.
 */
public class Metadata {

	/**
	* The actor who canceled the resource.
	*/
	@SerializedName("cancelled_by")
	private String cancelledBy;

	public String cancelledBy() { return cancelledBy; }
	
	public Metadata cancelledBy(String cancelledBy) {
	    this.cancelledBy = cancelledBy;
	    return this;
	}

	/**
	* The date and time when the resource was canceled.
	*/
	@SerializedName("cancelled_date")
	private String cancelledDate;

	public String cancelledDate() { return cancelledDate; }
	
	public Metadata cancelledDate(String cancelledDate) {
	    this.cancelledDate = cancelledDate;
	    return this;
	}

	/**
	* The email address of the account that created the resource.
	*/
	@SerializedName("created_by")
	private String createdBy;

	public String createdBy() { return createdBy; }
	
	public Metadata createdBy(String createdBy) {
	    this.createdBy = createdBy;
	    return this;
	}

	/**
	* The date and time when the resource was created.
	*/
	@SerializedName("created_date")
	private String createdDate;

	public String createdDate() { return createdDate; }
	
	public Metadata createdDate(String createdDate) {
	    this.createdDate = createdDate;
	    return this;
	}

	/**
	* The date and time when the resource was first sent.
	*/
	@SerializedName("first_sent_date")
	private String firstSentDate;

	public String firstSentDate() { return firstSentDate; }
	
	public Metadata firstSentDate(String firstSentDate) {
	    this.firstSentDate = firstSentDate;
	    return this;
	}

	/**
	* The email address of the account that last sent the resource.
	*/
	@SerializedName("last_sent_by")
	private String lastSentBy;

	public String lastSentBy() { return lastSentBy; }
	
	public Metadata lastSentBy(String lastSentBy) {
	    this.lastSentBy = lastSentBy;
	    return this;
	}

	/**
	* The date and time when the resource was last sent.
	*/
	@SerializedName("last_sent_date")
	private String lastSentDate;

	public String lastSentDate() { return lastSentDate; }
	
	public Metadata lastSentDate(String lastSentDate) {
	    this.lastSentDate = lastSentDate;
	    return this;
	}

	/**
	* The email address of the account that last edited the resource.
	*/
	@SerializedName("last_updated_by")
	private String lastUpdatedBy;

	public String lastUpdatedBy() { return lastUpdatedBy; }
	
	public Metadata lastUpdatedBy(String lastUpdatedBy) {
	    this.lastUpdatedBy = lastUpdatedBy;
	    return this;
	}

	/**
	* The date and time when the resource was last edited.
	*/
	@SerializedName("last_updated_date")
	private String lastUpdatedDate;

	public String lastUpdatedDate() { return lastUpdatedDate; }
	
	public Metadata lastUpdatedDate(String lastUpdatedDate) {
	    this.lastUpdatedDate = lastUpdatedDate;
	    return this;
	}

	/**
	* URL representing the payer's view of the invoice.
	*/
	@SerializedName("payer_view_url")
	private String payerViewUrl;

	public String payerViewUrl() { return payerViewUrl; }
	
	public Metadata payerViewUrl(String payerViewUrl) {
	    this.payerViewUrl = payerViewUrl;
	    return this;
	}
}
