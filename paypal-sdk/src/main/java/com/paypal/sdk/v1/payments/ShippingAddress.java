// This class was generated on Mon, 29 Jan 2018 12:12:02 PST by version 0.1.0-dev+ecea6f of Braintree SDK Generator
// ShippingAddress.java
// @version 0.1.0-dev+ecea6f
// @type object
// @data H4sIAAAAAAAC/7xWTXPbRgy991dg2Es8Q5Gy0+agW+ImqZtJ7LHl9qBmbIgLi2iWu8wuGJnp5L93dkV9sFSnUdrRxWMBeEs8APuwfybTtqZkkviS65rN4g6VcuR9kia/omOca3qHVYhI0uQNtdsfP5EvHNfC1iSTZFoS0KOQUaSgOyOFZclFCeyh8cHsQUqC9afWYcAGEGpsKzKSJWny3DlsV3mN0+SaUF0a3SaTB9SeguFjw47UxnDlbE1OmHwymW0ZiWOzGPIoWNoel84w5BMcYLCi/5qUabT+kv57ZrYx4tq7wirqZ9h3DDOdydKOihIdFkIOLm4u4enps2ejUwiQ909yZQufsxFaOAy4XLGjQnJHXvLu+FGI9fkJSIkCrMgIPzCtmtbFgHXgaMHWZL834/HTYq5t8eFjY4Xi79XfwouzZrGyvLNCk5U537XDdOfY8Gl4sA5eO0KBF44F2YTJWSGDfwV7/aI7a2sCNAqMlUHs7Zs9sd0wsom8xNYjTZ9Ig7JV+GTot4+pxDJ0CWZw6ykC7s/P7odpn5dsEJbWabXkzlbYqkYX+guNKawRZ7UmBbXjguDJ+e3VCVQkpVUpzNF8gAKdSiOZwlnvR3PrFDkQh8ZjEdrmu6rnfy/7IQMqrvm2+dRs6LQ3mGvLcCIf2HmB4Af7EAvX3fYMXlkH9IhVrSkF01Rzcil4cUSyYu8tWJMdjdLZgNLZgNJl/Ad1FqfWU2GN+gp2vmGhFLBGJ0HdNnS/jea3S4uxrkLNn+Plv/OC0vge7X8IGDZ2Ldo9AKwAGVyTNM6QAmt0G29BjS05Dw/OVvDC4WfWR6Jcl9b0ZXRtGZKKnk1z2MDsZXZ69jQQqFDePylFaj/J8+VymbE0GZsgnUU+HV2/PB/F2NHZeHw6Phtd5GROMniLj1w1FWgyC4kr8McxbBTaH6sG1gvq4ULp2/fUI/qjvO0s8TDnn7leqV4Y848Nf0IdtjZM25oL1LoF1+XdaWAQyrBElixlWPPbk8MRaHqn3BDB7Gobsq08mWzJH7gmxZhZt8jDr/xqy+PkSCV1VHDNZOQubIpeVQeuYWGDYy0Zm3BAASnZb0TkOEzCne0TWFv2PDC+5h0R4ZtXRGg/wu1N1IbY7EB62+0YYKWknSkJArIzPbubD7gntGEe2YDdKLCn7TETmD13i/B+MXhI0t/jGnWSwmylVgfh5xESwOdoUB328SJCAvjCKD4MywERoYK6PQwaEAH6C9ZoDoL+ERAB+pYeubAHYasICeBpiazRqIPg0oFO0jBZs1vDQgpuQog/6KDG4165/mEMns1C02jeCh1fuvfs6K/Yyt0ePk6KEty7CXaGYXrBEe7p/lfS/c+Xb1/eXV7f/XZ5/eY+hfvXF6+m9//3I+n9l+/+AgAA//8=
// DO NOT EDIT
package com.paypal.sdk.v1.payments;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The extended address, which is used as the shipping address in a payment.
 */
@Model
public class ShippingAddress {

    // Required default constructor
    public ShippingAddress() {}

	/**
	* The city name.
	*/
	@SerializedName("city")
	private String city;

	public String city() { return city; }
	
	public ShippingAddress city(String city) {
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
	
	public ShippingAddress countryCode(String countryCode) {
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
	
	public ShippingAddress line1(String line1) {
	    this.line1 = line1;
	    return this;
	}

	/**
	* Optional. The second line of the address. For example, suite, apartment number, and so on.
	*/
	@SerializedName("line2")
	private String line2;

	public String line2() { return line2; }
	
	public ShippingAddress line2(String line2) {
	    this.line2 = line2;
	    return this;
	}

	/**
	* The address normalization status. Returned only for payers from Brazil.
	*/
	@SerializedName("normalization_status")
	private String normalizationStatus;

	public String normalizationStatus() { return normalizationStatus; }
	
	public ShippingAddress normalizationStatus(String normalizationStatus) {
	    this.normalizationStatus = normalizationStatus;
	    return this;
	}

	/**
	* The phone number, in [E.123 format](https://www.itu.int/rec/T-REC-E.123-200102-I/en). Maximum length is 50 characters.
	*/
	@SerializedName("phone")
	private String phone;

	public String phone() { return phone; }
	
	public ShippingAddress phone(String phone) {
	    this.phone = phone;
	    return this;
	}

	/**
	* The postal code, which is the zip code or equivalent. Typically required for countries with a postal code or an equivalent. See [Postal code](https://en.wikipedia.org/wiki/Postal_code).
	*/
	@SerializedName("postal_code")
	private String postalCode;

	public String postalCode() { return postalCode; }
	
	public ShippingAddress postalCode(String postalCode) {
	    this.postalCode = postalCode;
	    return this;
	}

	/**
	* The name of the recipient at this address.
	*/
	@SerializedName("recipient_name")
	private String recipientName;

	public String recipientName() { return recipientName; }
	
	public ShippingAddress recipientName(String recipientName) {
	    this.recipientName = recipientName;
	    return this;
	}

	/**
	* The [code](/docs/integration/direct/rest/state-codes/) for a US state or the equivalent for other countries. Required for transactions if the address is in one of these countries: [Argentina](/docs/integration/direct/rest/state-codes/#argentina), [Brazil](/docs/integration/direct/rest/state-codes/#brazil), [Canada](/docs/integration/direct/rest/state-codes/#canada), [India](/docs/integration/direct/rest/state-codes/#india), [Italy](/docs/integration/direct/rest/state-codes/#italy), [Japan](/docs/integration/direct/rest/state-codes/#japan), [Mexico](/docs/integration/direct/rest/state-codes/#mexico), [Thailand](/docs/integration/direct/rest/state-codes/#thailand), or [United States](/docs/integration/direct/rest/state-codes/#usa). Maximum length is 40 single-byte characters.
	*/
	@SerializedName("state")
	private String state;

	public String state() { return state; }
	
	public ShippingAddress state(String state) {
	    this.state = state;
	    return this;
	}

	/**
	* The address status.
	*/
	@SerializedName("status")
	private String status;

	public String status() { return status; }
	
	public ShippingAddress status(String status) {
	    this.status = status;
	    return this;
	}

	/**
	* The type of address. For example, `HOME_OR_WORK`, `GIFT`, and so on.
	*/
	@SerializedName("type")
	private String type;

	public String type() { return type; }
	
	public ShippingAddress type(String type) {
	    this.type = type;
	    return this;
	}
}
