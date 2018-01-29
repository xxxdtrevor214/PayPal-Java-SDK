// This class was generated on Mon, 29 Jan 2018 12:12:00 PST by version 0.1.0-dev+ecea6f of Braintree SDK Generator
// CustomAmount.java
// @version 0.1.0-dev+ecea6f
// @type object
// @data H4sIAAAAAAAC/6yTz2ocMQzG730K4VMLw9J/UNhbml5CISlt6KXkoLE1iYrGdmU5YErevcwkuxuTQlqS28wnWeinT/rtzlsmt3XHtVia4WhONZob3HdUxlHoFOcl7Ab3mdrh5xMVr5yNU3Rbd35F4G8L4FoALAHmLG39iMDxOrGnDZxM0FIFjl5qIEAQHEmGVZxrsXuRruDGDe5IFdttu68H95UwnEVpbjuhFFqEX5WVwl74oimTGlNx2x/3QFUp+vaQEXfsB9K91PN+xEKQxp/kDaakgCIwccToGQWuUSqBkqBRgIlJQoGXIwpGTwNkbDNFg1BpADK/efVsbMWU4+VDMn/HfJwCdXz+MIye8B0ImZHCLgN8WlwpEGjiSAHGBiffzuD92zcfnmpOrCI3w6MU61y79ndK3/vdCta8LN8pBL5kA5wWGrsiCOR5RilQKKOiLf4dsDjusVZrlxeYs6asjEb9PP4L3LT+jfviH8jXI+nId8pjd7jmPYs/Fzcv/gAAAP//
// DO NOT EDIT
package com.paypal.sdk.v1.invoices;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The custom amount to apply to an invoice. If you include a label, you must include a custom amount.
 */
@Model
public class CustomAmount {

    // Required default constructor
    public CustomAmount() {}

	/**
	* Base object for all financial value related fields (balance, payment due, etc.)
	*/
	@SerializedName("amount")
	private Currency amount;

	public Currency amount() { return amount; }
	
	public CustomAmount amount(Currency amount) {
	    this.amount = amount;
	    return this;
	}

	/**
	* The custom amount label.
	*/
	@SerializedName("label")
	private String label;

	public String label() { return label; }
	
	public CustomAmount label(String label) {
	    this.label = label;
	    return this;
	}
}
