// This class was generated on Mon, 29 Jan 2018 12:12:01 PST by version 0.1.0-dev+ecea6f of Braintree SDK Generator
// ShippingAddress.java
// @version 0.1.0-dev+ecea6f
// @type object
// @data H4sIAAAAAAAC/7xW33PbNgx+31+B016aO1ly0q0Pfkuztst6bXKJsz14vQQWYQsrRaokVNfd9X/fkZJ/aMpudbfzi88C8IH4QPAj/0ym65qSSXJbcl2zWcK5Uo68T9LkV3SMc01vsQoRSZq8pvXu4yfyheNa2JpkkkxLAr/JgW0OUCTI2mdJmpw7h+t2rXGa3BCqK6PXyWSB2lMwfGjYkdoarp2tyQmTTyazbZVeHJvlsLaCZd2rrzMMawwOMFjRfy3KNFp/Sf+9MtsYcev7wirqV9h39Cs9h5ms7Kgo0WEh5ODy9gqenj57NjqFAHj3JFe28DkboaXDgMoVOyokd+Ql75KPQqzPT0BKFGBFRnjB5EFCJ9oYsA4cLdma7PdmPH5azLUt3n9orFD8bn8LL86aZWt5a4UmrTnft8N0L21YGhbWwStHKPDcsSAbYA8tMvhb2KvnXa6dCdAoMFYGsXevH4n10HhSwCbyEluPNH0kDcpWYcmw2z6WEtvQFZjBnacIeLg4exiWfVGyQVhZp9WKO1thqxpd2F1oTGGNOKs1KagdFwRPLu6uT6AiKa1KYY7mPRToVBrJFM56P5pbp8iBODQei7Btvut6/ve2HzKe4ppvm07Nhk57Y7mxDE/Ogp0XCH6wi9i47phn8NI6oE9Y1ZpSME01J5eCF0ckLXtvwZrsaJTOBpTOBpSu4h/UWZxaT4U16ivY+YaFUsAanVRkZEv322h+u7AY6yrU/Dke/nsvKI3v0f6HgOHGbtS6B4AWkMENSeMMKbBGr+MpqHFNzsPC2QqeO/zM+kiU69KavohuLENS0bPdHDYwe5Gdnj0NBCqUd09KkdpP8ny1WmUsTcYmSGeRT0c3Ly5GMXZ0Nh6fjs9GlzmZkwze4Ceumgo0maWUQch+HMNWof2xemC9oB5eJ337I/2I/ihvKaxKLiKDMOefuW5VL4z5h4Y/oiYjGUzXNReo9RpcV3engUEowyWyYikB9zOHFGh6WW6JYHa9C9l1nky24vdck2LMrFvm4Su/3vE4OVJLHRVcMxm5DzdFr6sD17CxwbGRjG04oICU7Lcichwm4cz2CWwsw7pnX/OOiPDtKyJsP8LdbdSGuNmB9G63Y4CVkvamJAjI3vTs33zAPaEN88gG7FaBPe3STGB27pbh/WLwkKK/xw3qJIVZq1YH4ecREsAXaFAdtngRIQF8aRQfhuWAiFBBvT4MGhAB+gvWaA6C/hEQAfqGPnFhD8JWERLA0xJZo1EHwaUDnaRhsmZ3hoUU3IYQf1CixuOjcv3DGDybpabRfC10fOl+5I7+ilu5u4ePU6IE936BnWFYXnCEc/r4K+nh56s3L+6vbu5/u7p5/ZDCw6vLl9OH//uR9O7Ld38BAAD//w==
// DO NOT EDIT
package com.paypal.sdk.v1.orders;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The shipping address details.
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
	* A [two-character ISO 3166-1 code](/docs/integration/direct/rest/country-codes/) that identifies the country or region.<blockquote><strong>Note:</strong> The country code for Great Britain is <code>GB</code> and not <code>UK</code> as used in the top-level domain names for that country. Use the `C2` country code for China worldwide for comparable uncontrolled price (CUP) method, bank card, and cross-border transactions.</blockquote>
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
