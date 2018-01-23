// This class was generated on Mon, 22 Jan 2018 14:43:26 PST by version 0.1.0-dev+8c35d5 of Braintree SDK Generator
// CancelNotification.java
// @version 0.1.0-dev+8c35d5
// @type object
// @data H4sIAAAAAAAC/7yUQY/TMBCF7/yKkc9RtxISh96qclkQLaIrLoCqqTPZGBxP6plQRWj/O3LSdpu0K4QW9lLJz+7M9zzP+WXu2prMzCwwWPKwZHWFs6iOg8nMZ4wOt56WWKVDJjPvqX1cvCWx0dXd4WMJAQxAFToPHGH9YQ3hrObEZGYeI7Z922lmPhHmq+BbMyvQCyVh17hI+Un4GLmmqI7EzL6cgEWjC/eXjNZuuu4ygD1Xh9TzAJiAgAvgQAm64kiwWMx6GzKB2wJaboArp6ClE6gxYkVKEYrIFWhJ8G69WkKkXUOisOW8zQAH1sEJCAUFZUDvHxsA5nkkERLQEhUwUmqgiShVduEnO0sTWGlJce+EMpCarCvaMY0yeNdT0mVxhn3pbPkE1+RrM52+tlvP9seuYaVu3f9a0cjhvleWrDTr5ZtzHeZ57lJF9Be9k6fACtLUNUel/NDtZtxumI83f5uP0Hj/kP0xJIGVBvk4CKNoJGRK95aus8aW4nPzO+LbMnvCKy9NKOQb5U1F0ZYYdAB7ZXMIfhvyNFwS2JeUQpM8pH91RgbDP5g7lnppf92lXjV33Hmus/8xtqdiJc32O9nRsE7a0MldSXDYOz70f/mh7Ii/Pbz6DQAA//8=
// DO NOT EDIT
package com.paypal.sdk.invoices;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * Cancels an email or SMS notification.
 */
@Model
public class CancelNotification {

    // Required default constructor
    public CancelNotification() {}

	/**
	* An array of one or more CC: emails. If you omit this parameter from the JSON request body, a notification is sent to all CC: email addresses that are part of the invoice. Otherwise, specify this parameter to limit the email addresses to which a notification is sent.<blockquote><strong>Note:</strong> Additional email addresses are not supported.</blockquote>
	*/
	@SerializedName(value = "cc_emails", listClass = String.class)
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
