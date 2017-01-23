// This class was generated on Mon, 23 Jan 2017 15:08:17 PST by version 0.01 of Braintree SDK Generator
// FileAttachment.java
// DO NOT EDIT
// @object fileAttachment
// @body {"Name":"name","WireType":{"Name":"string","IsArray":false},"ReadOnly":false,"Visibility":""}
// @body {"Name":"url","WireType":{"Name":"string","IsArray":false},"ReadOnly":false,"Visibility":""}

package com.paypal.sdk.models.invoices;

import com.paypal.sdk.models.common.*;
import java.util.List;
import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * The file attached to an invoice or template.
 */
@Data
@Accessors(chain = true)
public class FileAttachment {
    
	/**
	* The name of the attached file.
	*/
	@SerializedName("name")
	private String name;
    
	/**
	* The URL of the attached file, which can be downloaded.
	*/
	@SerializedName("url")
	private String url;
}
