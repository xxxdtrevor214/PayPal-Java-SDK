// This class was generated on Mon, 22 Jan 2018 14:43:26 PST by version 0.1.0-dev+8c35d5 of Braintree SDK Generator
// Notification.java
// @version 0.1.0-dev+8c35d5
// @type object
// @data H4sIAAAAAAAC/6yUQW/TQBCF7/yK0Z6ttBISB9+qcimIBJGKC6Bosh7XC+sdZ2ZMZKH+d7RxksZJEUL0Ymnf2vO+2XneX+5+6MiVbs4W6uDRAidXuM8oAdeR5tjmXVe49zQ8Ld6Segnd7uXS3TcE1GKIwALLD0tIJ8VmrnA3IjiMRteF+0RYLVIcXFljVMrCpg9C1VH4KNyRWCB15ZcjopqE9HAJ5/1q564TylN1inuTADMQcA2cKEO3LAS3t+XYhs7groaBe+A2GFgTFDoUbMlIoBZuwRqCd8vFHIQ2PanBmquhAJy0DkFBKRkYA8b4ZABYVUKqpGANGqBQNrBMlCuH9JODpxksrCHZBqUCtCMf6uGcxhhiGCnpsjjDtgm+mVDpzi5zzb7219ev/Tqy/7Hp2Wi3Hp9eTTg9jMqcjcpRvjrV4aaqQq6J8cI7myQ20L7rWIyqvdvVud00H2/+NR+pj/Gx+GtIEhtN8rEXzqKRkSmfWz7ODgeS/83vGd+aORI+84sppWplvGpJfIPJJrDPbE7B71KVx0sK24ZyaHIP+StA8NwNh2SNU9r3d6j2wi3+aQTar7+TP2vsqF1eKfu9A/pLXio74m+Pr34DAAD//w==
// DO NOT EDIT
package com.paypal.sdk.invoices;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The email or SMS notification.
 */
@Model
public class Notification {

    // Required default constructor
    public Notification() {}

	/**
	* An array of one or more CC: emails. If you omit this parameter from the JSON request body, a notification is sent to all CC: email addresses that are part of the invoice. Otherwise, specify this parameter to limit the email addresses to which notifications are sent.<blockquote><strong>Note:</strong> Additional email addresses are not supported.</blockquote>
	*/
	@SerializedName(value = "cc_emails", listClass = String.class)
	private List<String> ccEmails;

	public List<String> ccEmails() { return ccEmails; }
	
	public Notification ccEmails(List<String> ccEmails) {
	    this.ccEmails = ccEmails;
	    return this;
	}

	/**
	* A note to the payer.
	*/
	@SerializedName("note")
	private String note;

	public String note() { return note; }
	
	public Notification note(String note) {
	    this.note = note;
	    return this;
	}

	/**
	* Indicates whether to send a copy of the email to the merchant.
	*/
	@SerializedName("send_to_merchant")
	private Boolean sendToMerchant;

	public Boolean sendToMerchant() { return sendToMerchant; }
	
	public Notification sendToMerchant(Boolean sendToMerchant) {
	    this.sendToMerchant = sendToMerchant;
	    return this;
	}

	/**
	* The subject of the notification.
	*/
	@SerializedName("subject")
	private String subject;

	public String subject() { return subject; }
	
	public Notification subject(String subject) {
	    this.subject = subject;
	    return this;
	}
}
