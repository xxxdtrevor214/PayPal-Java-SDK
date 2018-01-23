// This class was generated on Mon, 22 Jan 2018 14:43:26 PST by version 0.1.0-dev+8c35d5 of Braintree SDK Generator
// FileAttachment.java
// @version 0.1.0-dev+8c35d5
// @type object
// @data H4sIAAAAAAAC/6zPQUs0MQwG4Pv3K0LO5cPz3BbEi6KyrF7EQ3aasYFOOmYyLoPsf5e6sq6M4EFPJW/L2yevuJkHxgYvJDOs3KlNPatjwHsyoW3ma+rrAwx4yfPncM5jazK4FMUGN4mhqxX0XsERvAApiL4UaRmKgXM/ZHL+jwFXZjQffj4LuGaKN5pnbDrKI9fgeRLjeAxurQxsLjxi83A0j26iT0uq1uOU+xEsyfUCSgeeTuR1j98idcp5H36UTpa/QA/z0nm3vvqWGWCXpE3QksKWIZad5kKR45/4H/f/3gAAAP//
// DO NOT EDIT
package com.paypal.sdk.invoices;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The file attached to an invoice or template.
 */
@Model
public class FileAttachment {

    // Required default constructor
    public FileAttachment() {}

	/**
	* The name of the attached file.
	*/
	@SerializedName("name")
	private String name;

	public String name() { return name; }
	
	public FileAttachment name(String name) {
	    this.name = name;
	    return this;
	}

	/**
	* The URL of the attached file, which can be downloaded.
	*/
	@SerializedName("url")
	private String url;

	public String url() { return url; }
	
	public FileAttachment url(String url) {
	    this.url = url;
	    return this;
	}
}
