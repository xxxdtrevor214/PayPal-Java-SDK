// This class was generated on Mon, 23 Jan 2017 15:08:17 PST by version 0.01 of Braintree SDK Generator
// Notification.java
// DO NOT EDIT
// @object notification
// @body {"Name":"cc_emails","WireType":{"Name":"string","IsArray":true},"ReadOnly":false,"Visibility":""}
// @body {"Name":"note","WireType":{"Name":"string","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"send_to_merchant","WireType":{"Name":"boolean","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"subject","WireType":{"Name":"string","IsArray":false},"ReadOnly":false,"Visibility":""}

package com.paypal.sdk.models.invoices;

import com.paypal.sdk.models.common.*;
import java.util.List;
import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * The email or SMS notification.
 */
@Data
@Accessors(chain = true)
public class Notification {
    
	/**
	* An array of one or more Cc: emails. If you omit this parameter from the JSON request body, a notification is sent to all Cc: email addresses that are part of the invoice. Otherwise, specify this parameter to limit the email addresses to which notifications are sent.<blockquote><strong>Note:</strong> Additional email addresses are not supported.</blockquote>
	*/
	@SerializedName("cc_emails")
	private List<String> ccEmails;
    
	/**
	* A note to the payer.
	*/
	@SerializedName("note")
	private String note;
    
	/**
	* Indicates whether to send a copy of the email to the merchant.
	*/
	@SerializedName("send_to_merchant")
	private boolean sendToMerchant;
    
	/**
	* The subject of the notification.
	*/
	@SerializedName("subject")
	private String subject;
}
