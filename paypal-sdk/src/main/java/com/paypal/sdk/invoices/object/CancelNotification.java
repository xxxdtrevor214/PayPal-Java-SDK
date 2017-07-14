// This class was generated on Thu, 13 Jul 2017 09:07:17 PDT by version 0.01 of Braintree SDK Generator
// CancelNotification.java
// DO NOT EDIT
// @type object
// @json {"Type":"Cancel Notification","VariableName":"","Description":"Cancels an email or SMS notification.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":[{"Type":"string","VariableName":"cc_emails","Description":"An array of one or more CC: emails. If you omit this parameter from the JSON request body, a notification is sent to all CC: email addresses that are part of the invoice. Otherwise, specify this parameter to limit the email addresses to which a notification is sent.\u003cblockquote\u003e\u003cstrong\u003eNote:\u003c/strong\u003e Additional email addresses are not supported.\u003c/blockquote\u003e","IsArray":true,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"note","Description":"A note to the payer.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"boolean","VariableName":"send_to_merchant","Description":"Indicates whether to send the notification to the merchant.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"boolean","VariableName":"send_to_payer","Description":"Indicates whether to send the notification to the payer.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"subject","Description":"The subject of the notification.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.invoices.object;

import java.util.Map;
import java.util.List;
import com.google.gson.annotations.SerializedName;
/**
 * Cancels an email or SMS notification.
 */
public class CancelNotification {

	/**
	* An array of one or more CC: emails. If you omit this parameter from the JSON request body, a notification is sent to all CC: email addresses that are part of the invoice. Otherwise, specify this parameter to limit the email addresses to which a notification is sent.<blockquote><strong>Note:</strong> Additional email addresses are not supported.</blockquote>
	*/
	@SerializedName("cc_emails")
	private List<String> ccEmails;

	public List<String> ccEmails() { return ccEmails; }
	
	public CancelNotification ccEmails(List<String> ccEmails) {
	    this.ccEmails = ccEmails;
	    return this;
	}

	/**
	* A note to the payer.
	*/
	@SerializedName("note")
	private String note;

	public String note() { return note; }
	
	public CancelNotification note(String note) {
	    this.note = note;
	    return this;
	}

	/**
	* Indicates whether to send the notification to the merchant.
	*/
	@SerializedName("send_to_merchant")
	private Boolean sendToMerchant;

	public Boolean sendToMerchant() { return sendToMerchant; }
	
	public CancelNotification sendToMerchant(Boolean sendToMerchant) {
	    this.sendToMerchant = sendToMerchant;
	    return this;
	}

	/**
	* Indicates whether to send the notification to the payer.
	*/
	@SerializedName("send_to_payer")
	private Boolean sendToPayer;

	public Boolean sendToPayer() { return sendToPayer; }
	
	public CancelNotification sendToPayer(Boolean sendToPayer) {
	    this.sendToPayer = sendToPayer;
	    return this;
	}

	/**
	* The subject of the notification.
	*/
	@SerializedName("subject")
	private String subject;

	public String subject() { return subject; }
	
	public CancelNotification subject(String subject) {
	    this.subject = subject;
	    return this;
	}
}
