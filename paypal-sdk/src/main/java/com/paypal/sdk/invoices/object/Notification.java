// This class was generated on Sun, 30 Jul 2017 11:04:05 PDT by version 0.1 of Braintree SDK Generator
// Notification.java
// DO NOT EDIT
// @type object
// @json {"Type":"Notification","VariableName":"","Description":"The email or SMS notification.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":[{"Type":"string","VariableName":"cc_emails","Description":"An array of one or more CC: emails. If you omit this parameter from the JSON request body, a notification is sent to all CC: email addresses that are part of the invoice. Otherwise, specify this parameter to limit the email addresses to which notifications are sent.\u003cblockquote\u003e\u003cstrong\u003eNote:\u003c/strong\u003e Additional email addresses are not supported.\u003c/blockquote\u003e","IsArray":true,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"note","Description":"A note to the payer.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"boolean","VariableName":"send_to_merchant","Description":"Indicates whether to send a copy of the email to the merchant.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"subject","Description":"The subject of the notification.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.invoices.object;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.serializer.Serializable;
import com.braintreepayments.http.serializer.Deserializable;

/**
 * The email or SMS notification.
 */
public class Notification implements Serializable, Deserializable {

    // Required default constructor
    public Notification() {}

	/**
	* An array of one or more CC: emails. If you omit this parameter from the JSON request body, a notification is sent to all CC: email addresses that are part of the invoice. Otherwise, specify this parameter to limit the email addresses to which notifications are sent.<blockquote><strong>Note:</strong> Additional email addresses are not supported.</blockquote>
	*/
	private List<String> ccEmails;

	public List<String> ccEmails() { return ccEmails; }
	
	public Notification ccEmails(List<String> ccEmails) {
	    this.ccEmails = ccEmails;
	    return this;
	}

	/**
	* A note to the payer.
	*/
	private String note;

	public String note() { return note; }
	
	public Notification note(String note) {
	    this.note = note;
	    return this;
	}

	/**
	* Indicates whether to send a copy of the email to the merchant.
	*/
	private Boolean sendToMerchant;

	public Boolean sendToMerchant() { return sendToMerchant; }
	
	public Notification sendToMerchant(Boolean sendToMerchant) {
	    this.sendToMerchant = sendToMerchant;
	    return this;
	}

	/**
	* The subject of the notification.
	*/
	private String subject;

	public String subject() { return subject; }
	
	public Notification subject(String subject) {
	    this.subject = subject;
	    return this;
	}

    @Override
    public void serialize(Map<String, Object> serialized) {
        if (ccEmails != null) {
            serialized.put("cc_emails", this.ccEmails);
        }
        if (note != null) {
            serialized.put("note", this.note);
        }
        if (sendToMerchant != null) {
            serialized.put("send_to_merchant", this.sendToMerchant);
        }
        if (subject != null) {
            serialized.put("subject", this.subject);
        }
    }

    @Override
    public void deserialize(Map<String, Object> values) {
        if (values.containsKey("cc_emails")) {
            this.ccEmails = new ArrayList<>();
                List<String> nestedValues = (List<String>) values.get("cc_emails");
                for (String nestedValue : nestedValues) {
                    this.ccEmails.add(nestedValue);
                }
        }
        if (values.containsKey("note")) {
            this.note = (String) values.get("note");
        }
        if (values.containsKey("send_to_merchant")) {
            this.sendToMerchant = (Boolean) values.get("send_to_merchant");
        }
        if (values.containsKey("subject")) {
            this.subject = (String) values.get("subject");
        }
    }
}

