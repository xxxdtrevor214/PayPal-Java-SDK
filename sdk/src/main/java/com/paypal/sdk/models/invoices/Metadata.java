// This class was generated on Mon, 23 Jan 2017 15:08:17 PST by version 0.01 of Braintree SDK Generator
// Metadata.java
// DO NOT EDIT
// @object metadata
// @body {"Name":"cancelled_by","WireType":{"Name":"string","IsArray":false},"ReadOnly":true,"Visibility":""}
// @body {"Name":"cancelled_date","WireType":{"Name":"string","IsArray":false},"ReadOnly":true,"Visibility":""}
// @body {"Name":"created_by","WireType":{"Name":"string","IsArray":false},"ReadOnly":true,"Visibility":""}
// @body {"Name":"created_date","WireType":{"Name":"string","IsArray":false},"ReadOnly":true,"Visibility":""}
// @body {"Name":"first_sent_date","WireType":{"Name":"string","IsArray":false},"ReadOnly":true,"Visibility":""}
// @body {"Name":"last_sent_by","WireType":{"Name":"string","IsArray":false},"ReadOnly":true,"Visibility":""}
// @body {"Name":"last_sent_date","WireType":{"Name":"string","IsArray":false},"ReadOnly":true,"Visibility":""}
// @body {"Name":"last_updated_by","WireType":{"Name":"string","IsArray":false},"ReadOnly":true,"Visibility":""}
// @body {"Name":"last_updated_date","WireType":{"Name":"string","IsArray":false},"ReadOnly":true,"Visibility":""}
// @body {"Name":"payer_view_url","WireType":{"Name":"string","IsArray":false},"ReadOnly":true,"Visibility":""}

package com.paypal.sdk.models.invoices;

import com.paypal.sdk.models.common.*;
import java.util.List;
import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * Audit information for the resource.
 */
@Data
@Accessors(chain = true)
public class Metadata {
    
	/**
	* The actor who canceled the resource.
	*/
	@Setter(AccessLevel.NONE)
	@SerializedName("cancelled_by")
	private String cancelledBy;
    
	/**
	* The date and time when the resource was canceled.
	*/
	@Setter(AccessLevel.NONE)
	@SerializedName("cancelled_date")
	private String cancelledDate;
    
	/**
	* The email address of the account that created the resource.
	*/
	@Setter(AccessLevel.NONE)
	@SerializedName("created_by")
	private String createdBy;
    
	/**
	* The date and time when the resource was created.
	*/
	@Setter(AccessLevel.NONE)
	@SerializedName("created_date")
	private String createdDate;
    
	/**
	* The date and time when the resource was first sent.
	*/
	@Setter(AccessLevel.NONE)
	@SerializedName("first_sent_date")
	private String firstSentDate;
    
	/**
	* The email address of the account that last sent the resource.
	*/
	@Setter(AccessLevel.NONE)
	@SerializedName("last_sent_by")
	private String lastSentBy;
    
	/**
	* The date and time when the resource was last sent.
	*/
	@Setter(AccessLevel.NONE)
	@SerializedName("last_sent_date")
	private String lastSentDate;
    
	/**
	* The email address of the account that last edited the resource.
	*/
	@Setter(AccessLevel.NONE)
	@SerializedName("last_updated_by")
	private String lastUpdatedBy;
    
	/**
	* The date and time when the resource was last edited.
	*/
	@Setter(AccessLevel.NONE)
	@SerializedName("last_updated_date")
	private String lastUpdatedDate;
    
	/**
	* URL representing the payer's view of the invoice.
	*/
	@Setter(AccessLevel.NONE)
	@SerializedName("payer_view_url")
	private String payerViewUrl;
}
