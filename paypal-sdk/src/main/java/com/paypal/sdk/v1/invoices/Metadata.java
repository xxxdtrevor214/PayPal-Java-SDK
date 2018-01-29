// This class was generated on Mon, 29 Jan 2018 12:12:00 PST by version 0.1.0-dev+ecea6f of Braintree SDK Generator
// Metadata.java
// @version 0.1.0-dev+ecea6f
// @type object
// @data H4sIAAAAAAAC/8SUP4vcMBDF+3yKQU0aE1Jvd5AufzkuaUJY5qzxeUCWnNH4jAn33YPsPV9sbYo4i7f0POvp/XiDfpm7oSVzMB9J0aKiKcw3FMZ7R5+wSYopzHsaXj7eUSyFW+XgzcHcdJYV2FdBGkwzqIKA1gRCMXRS0htTmBsRHKab3hbmltB+9m4whwpdpDT42bGQnQdfJLQkyhTN4fucMaqwf8gTluhLco7s8X5YpF0Jy+R3NQGWGgT6OsD0K9mLRvedc0/FP+S3qPQXgpOUMyQB0FtQbgj6mvyCAXqMM91eQEKoZ+r4c5yDUIPsAK0VihFCNWJgWYbOK2iNCieDq3R0yp43tBQ29jOZ7MRSsUQ9RvKa4+TaNqLRB5LPTlAOn3Ovtm4lbNm7ZDGyXGPzXvJnZWXStq5mvD2JutaeeyNybXNhZPlKj8UC4nxrK/U/ipswdyJrcSA5PjL1x07cAiuTlkxfbz+AUCuUFo39w0gznnkdIZ16LpL9Y+ALVfXj6dVvAAAA//8=
// DO NOT EDIT
package com.paypal.sdk.v1.invoices;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * Audit information for the resource.
 */
@Model
public class Metadata {

    // Required default constructor
    public Metadata() {}

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
