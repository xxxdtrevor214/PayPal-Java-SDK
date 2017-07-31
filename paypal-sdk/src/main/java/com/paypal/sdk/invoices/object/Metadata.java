// This class was generated on Sun, 30 Jul 2017 11:04:05 PDT by version 0.1 of Braintree SDK Generator
// Metadata.java
// DO NOT EDIT
// @type object
// @json {"Type":"Metadata","VariableName":"","Description":"Audit information for the resource.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":[{"Type":"string","VariableName":"cancelled_by","Description":"The actor who canceled the resource.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"cancelled_date","Description":"The date and time when the resource was canceled.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"created_by","Description":"The email address of the account that created the resource.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"created_date","Description":"The date and time when the resource was created.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"first_sent_date","Description":"The date and time when the resource was first sent.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"last_sent_by","Description":"The email address of the account that last sent the resource.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"last_sent_date","Description":"The date and time when the resource was last sent.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"last_updated_by","Description":"The email address of the account that last edited the resource.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"last_updated_date","Description":"The date and time when the resource was last edited.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"payer_view_url","Description":"URL representing the payer's view of the invoice.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.invoices.object;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.serializer.Serializable;
import com.braintreepayments.http.serializer.Deserializable;

/**
 * Audit information for the resource.
 */
public class Metadata implements Serializable, Deserializable {

    // Required default constructor
    public Metadata() {}

	/**
	* The actor who canceled the resource.
	*/
	private String cancelledBy;

	public String cancelledBy() { return cancelledBy; }
	
	public Metadata cancelledBy(String cancelledBy) {
	    this.cancelledBy = cancelledBy;
	    return this;
	}

	/**
	* The date and time when the resource was canceled.
	*/
	private String cancelledDate;

	public String cancelledDate() { return cancelledDate; }
	
	public Metadata cancelledDate(String cancelledDate) {
	    this.cancelledDate = cancelledDate;
	    return this;
	}

	/**
	* The email address of the account that created the resource.
	*/
	private String createdBy;

	public String createdBy() { return createdBy; }
	
	public Metadata createdBy(String createdBy) {
	    this.createdBy = createdBy;
	    return this;
	}

	/**
	* The date and time when the resource was created.
	*/
	private String createdDate;

	public String createdDate() { return createdDate; }
	
	public Metadata createdDate(String createdDate) {
	    this.createdDate = createdDate;
	    return this;
	}

	/**
	* The date and time when the resource was first sent.
	*/
	private String firstSentDate;

	public String firstSentDate() { return firstSentDate; }
	
	public Metadata firstSentDate(String firstSentDate) {
	    this.firstSentDate = firstSentDate;
	    return this;
	}

	/**
	* The email address of the account that last sent the resource.
	*/
	private String lastSentBy;

	public String lastSentBy() { return lastSentBy; }
	
	public Metadata lastSentBy(String lastSentBy) {
	    this.lastSentBy = lastSentBy;
	    return this;
	}

	/**
	* The date and time when the resource was last sent.
	*/
	private String lastSentDate;

	public String lastSentDate() { return lastSentDate; }
	
	public Metadata lastSentDate(String lastSentDate) {
	    this.lastSentDate = lastSentDate;
	    return this;
	}

	/**
	* The email address of the account that last edited the resource.
	*/
	private String lastUpdatedBy;

	public String lastUpdatedBy() { return lastUpdatedBy; }
	
	public Metadata lastUpdatedBy(String lastUpdatedBy) {
	    this.lastUpdatedBy = lastUpdatedBy;
	    return this;
	}

	/**
	* The date and time when the resource was last edited.
	*/
	private String lastUpdatedDate;

	public String lastUpdatedDate() { return lastUpdatedDate; }
	
	public Metadata lastUpdatedDate(String lastUpdatedDate) {
	    this.lastUpdatedDate = lastUpdatedDate;
	    return this;
	}

	/**
	* URL representing the payer's view of the invoice.
	*/
	private String payerViewUrl;

	public String payerViewUrl() { return payerViewUrl; }
	
	public Metadata payerViewUrl(String payerViewUrl) {
	    this.payerViewUrl = payerViewUrl;
	    return this;
	}

    @Override
    public void serialize(Map<String, Object> serialized) {
        if (cancelledBy != null) {
            serialized.put("cancelled_by", this.cancelledBy);
        }
        if (cancelledDate != null) {
            serialized.put("cancelled_date", this.cancelledDate);
        }
        if (createdBy != null) {
            serialized.put("created_by", this.createdBy);
        }
        if (createdDate != null) {
            serialized.put("created_date", this.createdDate);
        }
        if (firstSentDate != null) {
            serialized.put("first_sent_date", this.firstSentDate);
        }
        if (lastSentBy != null) {
            serialized.put("last_sent_by", this.lastSentBy);
        }
        if (lastSentDate != null) {
            serialized.put("last_sent_date", this.lastSentDate);
        }
        if (lastUpdatedBy != null) {
            serialized.put("last_updated_by", this.lastUpdatedBy);
        }
        if (lastUpdatedDate != null) {
            serialized.put("last_updated_date", this.lastUpdatedDate);
        }
        if (payerViewUrl != null) {
            serialized.put("payer_view_url", this.payerViewUrl);
        }
    }

    @Override
    public void deserialize(Map<String, Object> values) {
        if (values.containsKey("cancelled_by")) {
            this.cancelledBy = (String) values.get("cancelled_by");
        }
        if (values.containsKey("cancelled_date")) {
            this.cancelledDate = (String) values.get("cancelled_date");
        }
        if (values.containsKey("created_by")) {
            this.createdBy = (String) values.get("created_by");
        }
        if (values.containsKey("created_date")) {
            this.createdDate = (String) values.get("created_date");
        }
        if (values.containsKey("first_sent_date")) {
            this.firstSentDate = (String) values.get("first_sent_date");
        }
        if (values.containsKey("last_sent_by")) {
            this.lastSentBy = (String) values.get("last_sent_by");
        }
        if (values.containsKey("last_sent_date")) {
            this.lastSentDate = (String) values.get("last_sent_date");
        }
        if (values.containsKey("last_updated_by")) {
            this.lastUpdatedBy = (String) values.get("last_updated_by");
        }
        if (values.containsKey("last_updated_date")) {
            this.lastUpdatedDate = (String) values.get("last_updated_date");
        }
        if (values.containsKey("payer_view_url")) {
            this.payerViewUrl = (String) values.get("payer_view_url");
        }
    }
}

