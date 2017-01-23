// This class was generated on Mon, 23 Jan 2017 15:08:17 PST by version 0.01 of Braintree SDK Generator
// BillingInfo.java
// DO NOT EDIT
// @object billing_info
// @body {"Name":"additional_info","WireType":{"Name":"string","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"address","WireType":{"Name":"common_address","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"business_name","WireType":{"Name":"string","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"email","WireType":{"Name":"string","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"first_name","WireType":{"Name":"string","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"language","WireType":{"Name":"string","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"last_name","WireType":{"Name":"string","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"notification_channel","WireType":{"Name":"string","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"phone","WireType":{"Name":"phone","IsArray":false},"ReadOnly":false,"Visibility":""}

package com.paypal.sdk.models.invoices;

import com.paypal.sdk.models.common.*;
import java.util.List;
import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * Billing information for the invoice recipient.
 */
@Data
@Accessors(chain = true)
public class BillingInfo {
    
	/**
	* Additional information, such as business hours.
	*/
	@SerializedName("additional_info")
	private String additionalInfo;
    
	@SerializedName("address")
	private CommonAddress address;
    
	/**
	* The invoice recipient company business name.
	*/
	@SerializedName("business_name")
	private String businessName;
    
	/**
	* The invoice recipient email address.<blockquote><strong>Note:</strong>Before you get a QR code, you must create an invoice that specifies `qrinvoice@paypal.com `as the recipient email address in the `billing_info` object. Use a customer email address only if you want to email the invoice.</blockquote>
	*/
	@SerializedName("email")
	private String email;
    
	/**
	* The invoice recipient first name.
	*/
	@SerializedName("first_name")
	private String firstName;
    
	/**
	* An enumeration of the languages in which an email can be sent to the recipient. Used only when the recipient lacks a PayPal account.
	*/
	@SerializedName("language")
	private String language;
    
	/**
	* The invoice recipient last name.
	*/
	@SerializedName("last_name")
	private String lastName;
    
	/**
	* An enumeration of the preferred notification channels for the recipient. Value is `SMS` or `EMAIL`. Default is `EMAIL`. For `SMS`, a `phone` value is required.
	*/
	@SerializedName("notification_channel")
	private String notificationChannel;
    
	@SerializedName("phone")
	private Phone phone;
}
