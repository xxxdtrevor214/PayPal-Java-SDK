// This class was generated on Mon, 29 Jan 2018 12:12:03 PST by version 0.1.0-dev+ecea6f of Braintree SDK Generator
// SimplePostalAddress.java
// @version 0.1.0-dev+ecea6f
// @type object
// @data H4sIAAAAAAAC/7xWTW/bRhC991cM2IsFUKTtFDnoZjtokAaJjdjuRTWc0e5InHq5S+8OIzNF/nuxS1ofloFaReCLAM7OG8578zirf7KrrqFskgWuG0O3jQuC5ha19hRClmd/omecGfqMdUzL8uwjdeuHdxSU50bY2WySnUBfBvoyMJSBJUsFyqEPNF54ZEsa5kxGhwLeObBOoA0Ec+cBLbAV8hZjzXWNAq6HjBmquyV6DcrVDQrP2LB04KzpYjUKqZ5yVpAtNJWzVGR5duI9dj3Zwzz7QqjPremyyRxNoBi4b9mTXgUuvGvIC1PIJtO1TOLZLnZ1USzdljZDYFufq4ogHoDFer+mxLdPerKtMT/y/27MtVZ8d6ucpu0Gtw92G53K0o1VhR6VkIcPl+fw5ujt2/ERRMjNQamdCmUc1sKnYZWaPSkpPQUph/LjmBvKEUiFAqzJCs+ZAkiUos8B58HTgp0t/moPD9+omXHq7r51Qum5/1VBvLOLPvLZCU36cLkZh6uNsvHVyTHvPaHAqefkCA7QI+N5D3t/OtRahwCtTkZ6mnv98ZncEP2rgW3iJa4ZG/pGBrSr4yvjuENqJckwNNhbOgK+nh1/3W37rGKLsHTe6CUPseR5H+cLrY0e984Y0tB4VgQHZ9cXI6hJKqdzmKG9A4Ve54mM8i6E8cx5TR7Eow2o4tjCoHr5VPZX8adhS0dbxnyM7Dpyzj4IxHNw8yTcajn87jzQA8blk4Nt6xn5HIJ4IunZBwfOFq9G6XiH0vEOpfOmX3FFcm0g5ax+AbvQslAO2KCXmqys6P4/ms+suxfyHO6Knc2yHd8d43A5xPMclhWrKn6TkfB3bnr7R773LX9DQ1YKuOoaVmhMB37oe/gY4hcTt0m6YHCzMvR3yWaVSyKYbqTcHFQiTZiUJdliyXfckGYsnF+U8am8WPMYvZKkQVC2xXyMPLOfX7KGE3y1hNMFC9eXkMKQ9hFtaJQSnFS0oW0BXzY131wcwFs+jVNkC25l4EDrMhOYnvhFXP8W92n6V3xEjXKYnnr8zmYv/CxBIvgMLer9Xq4SJII/WM37YTkiElTQdPtBIyJC/8AG7V7QvyMiQj/RAyu3F7ZOkAi+qpANWr0XXAbQKI/Oml5bFtJwGVPCXoXagKMCPuED120NhuxC0or47RAC24Wh8awTgtV/k/BTvs6bH7/8CwAA//8=
// DO NOT EDIT
package com.paypal.sdk.v1.sync;

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
