// This class was generated on Thu, 25 Jan 2018 09:31:12 CST by version 0.1.0-dev+20fb1e of Braintree SDK Generator
// ShippingInformation.java
// @version 0.1.0-dev+20fb1e
// @type object
// @data H4sIAAAAAAAC/+xX32/bNhB+319x0B5WA7KVtkMf/JamWNEVbYMm2YsXtGfybN1CkSp5qqMO/d8HUop/xEEbbUWAAX4x4ON9p7vjx4+8v7PztqZsmp2VXNdsl/DKLpyvUNjZLM/+QM84N/QWq+iV5dlrajd/XlBQnuvkPM3OS4JwE4c3cSZZnh17j233raM8e0+o31nTZtMFmkDR8KlhT3ptOPWuJi9MIZvONllyVRuCUxcEDRxr7SmE/TRxvbDJdmPbTfoYQhe07oL2frBiKUE59IHGS49sScOCyegwgRcOrBNoAsHCeUALbIW8TdVuYkzgoveYo7paodegXFWj8JwNSwvOmjZGo5DiKWcF2UJdOks/rmlBPNvlfpcUS7vTot6wv6lxASxWw5IS39zKyTbGfM2/n5hrrPj2g3KadhPcXdhPdCYrN1YlelRCHl6dvYOnj589Gz+GCLl8VGinQhE3a+nTZhWaPSkpPAUp+vDj6BuKEUiJAqzJCi+YAkhsRecDzoOnZST3n83R0VM1N05dfWqcUPrf/aog3tllZ3nrhKadudi2w/lW2PjpxJiXnlDguefECA7QIeN6B3v5vI+1MQFanYh02/fi9R2+IfJXA9tUl7h6bOgzGdCuip+M2x1SKqkNfYIdpSPg48mTj/tpn5RsEVbOG73i3pY47+P+QmMjx70zhjTUnhXBo5OL0xFUJKXTOczRXoFCr/NUjPIuhPHceU0exKMNqOK2hb7rxe22Pwg/DVt6vEPMG8s+Ixfsg0BcB7dIjVuLw2/OA11jFJ8cbFPNyecQxBNJV31wMFA8/1NJT/ZKerJX0ru6k7hJYm0g5ay+R3WhYaEcsEYvFVlZl/vvyrxD7u5ZZyfy+8qya9/fxv5yiOs5rEpWZTyTseAvXHf0j/V+avgzGrIygfO2ZoXGtOD7vPvDEE9MVJN0weB2ZOjuku0oZ0Qw23K5fFSK1GFaFGQnK77imjTjxPllEf8Vp5s6Rg/U0iAou828sdyhz/eR4QRfi3C6YOHiDJIZkh7RVo+Sg5OStno7gffbPd8WDuAdnsZdZAtuTeBAmzBTmB37ZZR/i0OS/hlvUKMcZs89fmEzCD9PkAg+QYt62MdVgkTwK6t5GJYjIkEFTTsMGhER+jvWaAdB/4qICH1D16zcIGyVIBF8XiIbtHoQXHrQKI/Mml1YFtJwFl3CoEBNwNEE3uA1V00FhuxSkkT8egSB7dLQeN4KwfptEn7I6by8x/nsrtadA7o2feP93vn0b6AAGIJTjLE7Sbik5ADpXn4gmYnvkZ0iesN+CZ4U10xWfgnDH63fT/CeM0h3N6JvP9y09MNdY8k33Q6TymFSOUwqh0nlMKkcJpXDpHKYVA6TymFS+d9OKpdff/oHAAD//w==
// DO NOT EDIT
package com.paypal.sdk.v1.paypalsync;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The shipping information.
 */
@Model
public class ShippingInformation {

    // Required default constructor
    public ShippingInformation() {}

	/**
	* A simple postal address with coarse-grained fields. Do not use for an international address. Use for backward compatibility only. Does not contain phone.
	*/
	@SerializedName("address")
	private SimplePostalAddress address;

	public SimplePostalAddress address() { return address; }
	
	public ShippingInformation address(SimplePostalAddress address) {
	    this.address = address;
	    return this;
	}

	/**
	* The shipping method that is associated with this order.
	*/
	@SerializedName("method")
	private String method;

	public String method() { return method; }
	
	public ShippingInformation method(String method) {
	    this.method = method;
	    return this;
	}

	/**
	* The recipient's name.
	*/
	@SerializedName("name")
	private String name;

	public String name() { return name; }
	
	public ShippingInformation name(String name) {
	    this.name = name;
	    return this;
	}

	/**
	* A simple postal address with coarse-grained fields. Do not use for an international address. Use for backward compatibility only. Does not contain phone.
	*/
	@SerializedName("secondary_shipping_address")
	private SimplePostalAddress secondaryShippingAddress;

	public SimplePostalAddress secondaryShippingAddress() { return secondaryShippingAddress; }
	
	public ShippingInformation secondaryShippingAddress(SimplePostalAddress secondaryShippingAddress) {
	    this.secondaryShippingAddress = secondaryShippingAddress;
	    return this;
	}
}
