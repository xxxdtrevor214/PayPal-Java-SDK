// This class was generated on Mon, 29 Jan 2018 12:12:04 PST by version 0.1.0-dev+ecea6f of Braintree SDK Generator
// EventResend.java
// @version 0.1.0-dev+ecea6f
// @type object
// @data H4sIAAAAAAAC/5TPwUrEMBAG4LtPMcw5iCcPvS3UwyKoLOJFRKbtVAfjpM6kSpB9d4krleppj/mTzHz/J96WibHBi3fWDDt21gED3pEJdZGv6LXeYsBLLr+Hlr03mbIkxQYPvxwIPrh7TukF+Huapiyj9FSfBegKbNtTDLgxo3JYexZwxzRcayzYjBSda/A2i/GwBDeWJrYs7NjcL2DPJvr0n/pDeJTBV+p1vi6wUaCKgjQuFajv06wZtq3/QZ8fi9Y5xv3D/uQLAAD//w==
// DO NOT EDIT
package com.paypal.sdk.v1.webhooks;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * Resends a webhook event notification, by ID.
 */
@Model
public class EventResend {

    // Required default constructor
    public EventResend() {}

	/**
	* An array of webhook account IDs.
	*/
	@SerializedName(value = "webhook_ids", listClass = String.class)
	private List<String> webhookIds;

	public List<String> webhookIds() { return webhookIds; }
	
	public EventResend webhookIds(List<String> webhookIds) {
	    this.webhookIds = webhookIds;
	    return this;
	}
}
