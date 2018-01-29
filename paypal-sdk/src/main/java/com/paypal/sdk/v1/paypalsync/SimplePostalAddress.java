// This class was generated on Thu, 25 Jan 2018 09:31:12 CST by version 0.1.0-dev+20fb1e of Braintree SDK Generator
// SimplePostalAddress.java
// @version 0.1.0-dev+20fb1e
// @type object
// @data H4sIAAAAAAAC/7xWwW4bRwy99yuI7cUCVlrbKXLQzXbQIA0SG7Hdi2o01AylZT2aWXO4kTdF/r2YWVmWLAO1isIXAcvh45KPb9/o7+Kqa6gYF5e8aBzBRYiKDk6sFYqxKIvfURinjj7jIqUVZfGRuseHdxSNcKMcfDEuTiD2ZZq+DPZlYMlagwkokYZzQfZkYcbkbBzBuwA+KLSRYBYE0AN7JfGYaj7WGMH1KmOK5naJYsGERYPKU3asHQTvulSNYq5ngldkD00dPI2KsjgRwa4f9rAsvhDac++6YjxDFykF7loWsuvAhYSGRJliMZ6saYoq7Oe7vBjWboubVWCbn6uaIB2Ax8V+Tam0T3ryrXM/yn9vLLRepfvTBEvbDW4f7DY60WUYmhoFjZLAh8tzeHP09u3wCBLk5qCywcQqLWsueVmVZSGjlVDUalV+mHJjNQCtUYEteeUZUwRNVPQ5EASE5hz86I/28PCNmbpgbu/aoJSf+18TVYKf95HPQWnch6vNOFxtlE2vzop5L4QKp8JZERyhR6bzHvb+dFXrMQTobRbS09zrj8/kxqRfC+zzXBqaoaNv5MCGRXplWnfMrWQaVg32kk6Ar2fHX3fbPqvZIyyDOLvkVSxrXtJ+ofVJ4xKcIwuNsCE4OLu+GMCCtA62hCn6WzAotszDGAkxDqdBLAmooI9o0triivXqKe2vok/Hno62hPkQ2VXkjCUqpHMIs0zc2hx+DQJ0j8l8SvDtYkpSQlQh0n76GCD40auNdLwz0vHOSOdNb3GjrNpIJnj7guliy0olYIOiC/K6Hve/jfmM3b1wzt7kd51lO767xtXlkM5LWNZs6vRNpoG/c9PLP8171/I3dOR1BFddwwad60BWfa8+hvTFJDfJFwxuVob+LtmsckkEk42Um4NatYnjqiI/WvItN2QZR0HmVXqqLh7nGLwSpVFRt8l8iDzjzy+x4Qxfm3C+YOH6EnIYsh/RBkc5IWhNG9yO4Msm55vGAbyl07RF9hDWAo70WGYMkxOZJ/v3uE/TP+MDalDC5FTwO7u98NMMSeAz9Gj3e7nJkAT+4C3vh+WEyFBF1+0HTYgE/Q0b9HtB/0qIBP1E92zCXthFhiTwVY3s0Nu94LoCDcqkrMm1ZyULlykl7lWojTgYwSe850W7AEd+rtkifjmEyH7uaDjtlGD93yT+L1/nzY+f/gEAAP//
// DO NOT EDIT
package com.paypal.sdk.v1.paypalsync;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * A simple postal address with coarse-grained fields. Do not use for an international address. Use for backward compatibility only. Does not contain phone.
 */
@Model
public class SimplePostalAddress {

    // Required default constructor
    public SimplePostalAddress() {}

	/**
	* REQUIRED
	* The city name.
	*/
	@SerializedName("city")
	private String city;

	public String city() { return city; }
	
	public SimplePostalAddress city(String city) {
	    this.city = city;
	    return this;
	}

	/**
	* REQUIRED
	* The [two-character ISO 3166-1 code](/docs/integration/direct/rest/country-codes/) that identifies the country or region.<blockquote><strong>Note:</strong> The country code for Great Britain is <code>GB</code> and not <code>UK</code> as used in the top-level domain names for that country. Use the `C2` country code for China worldwide for comparable uncontrolled price (CUP) method, bank card, and cross-border transactions.</blockquote>
	*/
	@SerializedName("country_code")
	private String countryCode;

	public String countryCode() { return countryCode; }
	
	public SimplePostalAddress countryCode(String countryCode) {
	    this.countryCode = countryCode;
	    return this;
	}

	/**
	* REQUIRED
	* The first line of the address. For example, number, street, and so on.
	*/
	@SerializedName("line1")
	private String line1;

	public String line1() { return line1; }
	
	public SimplePostalAddress line1(String line1) {
	    this.line1 = line1;
	    return this;
	}

	/**
	* Optional. The second line of the address. For example, suite, apartment number, and so on.
	*/
	@SerializedName("line2")
	private String line2;

	public String line2() { return line2; }
	
	public SimplePostalAddress line2(String line2) {
	    this.line2 = line2;
	    return this;
	}

	/**
	* The postal code, which is the zip code or equivalent. Typically required for countries with a postal code or an equivalent. See [postal code](https://en.wikipedia.org/wiki/Postal_code).
	*/
	@SerializedName("postal_code")
	private String postalCode;

	public String postalCode() { return postalCode; }
	
	public SimplePostalAddress postalCode(String postalCode) {
	    this.postalCode = postalCode;
	    return this;
	}

	/**
	* The [code](/docs/integration/direct/rest/state-codes/) for a US state or the equivalent for other countries. Required for transactions if the address is in one of these countries: [Argentina](/docs/integration/direct/rest/state-codes/#argentina), [Brazil](/docs/integration/direct/rest/state-codes/#brazil), [Canada](/docs/integration/direct/rest/state-codes/#canada), [India](/docs/integration/direct/rest/state-codes/#india), [Italy](/docs/integration/direct/rest/state-codes/#italy), [Japan](/docs/integration/direct/rest/state-codes/#japan), [Mexico](/docs/integration/direct/rest/state-codes/#mexico), [Thailand](/docs/integration/direct/rest/state-codes/#thailand), or [United States](/docs/integration/direct/rest/state-codes/#usa). Maximum length is 40 single-byte characters.
	*/
	@SerializedName("state")
	private String state;

	public String state() { return state; }
	
	public SimplePostalAddress state(String state) {
	    this.state = state;
	    return this;
	}
}
