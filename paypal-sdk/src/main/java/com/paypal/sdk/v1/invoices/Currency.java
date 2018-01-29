// This class was generated on Mon, 29 Jan 2018 12:12:00 PST by version 0.1.0-dev+ecea6f of Braintree SDK Generator
// Currency.java
// @version 0.1.0-dev+ecea6f
// @type object
// @data H4sIAAAAAAAC/6TRT0skMRAF8Pt+iiKnXWiG/QcLfdudvYgwIypexEN18nqMpJNYqQiNzHeXHp0ZGgURj6kk8H6vHs3lmGFas6wiiHY0jbli8dwFrHiYbkxjTjEeD/9RrPisPkXTmn9cQKm7g1XqkxCHQL2PHK3nQA8cKkgQWOGo9wiu0NeOA0eLhjKPA6KSq2gIahffTGP+ivD4nOp7Y87Bbh3DaNqeQ8E0uK9e4A6DM0kZoh7FtNcHT1HxcfNaY1+cy+Qwk9ljAXPhLwpQhdD+BdnkQFzIofcRjrqRTi7W9Pvnjz+LTwJiDWHbvKvY9TqLv5/Ms/OQalSqmTTRipzfeCXuJ43eghysHzgUKsgsrNP+jiwfD6zdaqcfnLOkLJ4V8z4+BFepb7lvtl+eAAAA//8=
// DO NOT EDIT
package com.paypal.sdk.v1.invoices;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * Base object for all financial value related fields (balance, payment due, etc.)
 */
@Model
public class Currency {

    // Required default constructor
    public Currency() {}

	/**
	* 3 letter currency code as defined by ISO 4217.
	*/
	@SerializedName("currency")
	private String currencyCode;

	public String currencyCode() { return currencyCode; }
	
	public Currency currencyCode(String currencyCode) {
	    this.currencyCode = currencyCode;
	    return this;
	}

	/**
	* REQUIRED
	* amount up to N digit after the decimals separator as defined in ISO 4217 for the appropriate currency code.
	*/
	@SerializedName("value")
	private String value;

	public String value() { return value; }
	
	public Currency value(String value) {
	    this.value = value;
	    return this;
	}
}
