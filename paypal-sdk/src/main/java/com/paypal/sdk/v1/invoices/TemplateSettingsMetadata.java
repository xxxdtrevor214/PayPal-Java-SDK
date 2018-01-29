// This class was generated on Mon, 29 Jan 2018 12:12:00 PST by version 0.1.0-dev+ecea6f of Braintree SDK Generator
// TemplateSettingsMetadata.java
// @version 0.1.0-dev+ecea6f
// @type object
// @data H4sIAAAAAAAC/6SOT0sDQQxH736KIedFPO9N8CLiH7R4EQ9p51cnkJ1dkxQZpN9dltqV4rHHPJKX902rNoF6WmGYlAPpBRFSPzzdIzhzMHX0yia8VjzwMO9SR3dof8MNfGMyhYx1NhWkONr8aBt+bZfU0bUZt8Pfq46ewfmxaqN+y+qYwedODHkBTzZOsBA49W9L8XocFVz/5xXJGfUkckGnqbc1y4YDnr4KosBSFPG0FWhO4ulwdm5y3anu3/cXPwAAAP//
// DO NOT EDIT
package com.paypal.sdk.v1.invoices;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The template settings metadata.
 */
@Model
public class TemplateSettingsMetadata {

    // Required default constructor
    public TemplateSettingsMetadata() {}

	/**
	* Indicates whether this field is hidden.
	*/
	@SerializedName("hidden")
	private Boolean hidden;

	public Boolean hidden() { return hidden; }
	
	public TemplateSettingsMetadata hidden(Boolean hidden) {
	    this.hidden = hidden;
	    return this;
	}
}
