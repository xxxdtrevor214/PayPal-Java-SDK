// This class was generated on Mon, 29 Jan 2018 12:12:03 PST by version 0.1.0-dev+ecea6f of Braintree SDK Generator
// ShippingInformation.java
// @version 0.1.0-dev+ecea6f
// @type object
// @data H4sIAAAAAAAC/+xXTW8bNxO+v79isO+hEbDSOkmRg26JgwZpkA/Edi+q4YzIkXZqLrkhZyNvivz3gty1Piwj1baBgQK6CNBwntmZ4cOHnD+z87ambJqdlVzXbJfw2i6cr1DY2SzPfkPPODf0DqvoleXZG2o3f15SUJ7r5DzNzkuCcBuHN3EmWZ499x7b7lsnefaRUL+3ps2mCzSBouFzw5702vDBu5q8MIVsOltnGbiqDV3VLgiaK9TaUwj7aW4WNtlubLtJP4cuKHRBofeDFUsJyqEPNF56ZEsaFkxGhwm8dGCdQBMIFs4DWmAr5G2qdhNjAhe9xxzV9Qq9BuWqGoXnbFhacNa0MRqFFE85K8gW6tJZ+oFNE892ud8lxdLutKg37G9qXACL1bCkxDd3crKNMd/yv0/MNVZ8e6Wcpt0Edxf2E53Jyo1ViR6VkIfXZ+/h6eNnz8aPIUIuHxXaqVDEzVr6tFmFZk9KCk9Bij78OPqGYgRSogBrssILpgASW9H5gPPgaRnJ/XtzcvJUzY1T158bJ5T+d78qiHd22VneOaFpZy627XC+FTZ+OjHmlScUeOE5MYIDdMi43sFevehjbUyAVici3fW9eHOPb4j81cA21SWuHhv6Qga0q+In43aHlEpqQ59gR+kI+HT65NN+2qclW4SV80avuLclzvu4v9DYyHHvjCENtWdF8Oj04sMIKpLS6RzmaK9Bodd5KkZ5F8J47rwmD+LRBlRx20Lf9eJu2x+En4YtPd4h5q1ln5EL9kEgroNbpMatxeEX54FuMIpPDrap5uRzCOKJpKs+OBgonv+qpCd7JT3ZK+l93UncJLE2kHJWH1BdaFgoB6zRS0VW1uX+szLvkbsD6+xvjj1l2bXvb2N/OcT1HFYlqzKeyVjwV647+sd6Pzf8BQ1ZmcB5W7NCY1rwfd79YYgnJqpJumBwOzJ0d8l2lDMimG25XD4qReowLQqykxVfc02aceL8soj/ig+bOkYP1NIgKLvNvLXco8+HyHCCr0U4XbBwcQbJDEmPaKtHycFJSVu9ncDH7Z5vCwfwDk/jLrIFtyZwoE2YKcye+2WUf4tDkv4/3qJGOcxeePzKZhB+niARfIoW9bCPqwSJ4NdW8zAsR0SCCpp2GDQiIvRXrNEOgv4RERH6lm5YuUHYKkEi+LxENmj1ILj0oFEemTW7sCyk4Sy6hEGBmoCjCbzFG66aCgzZpSSJ+PkEAtulofG8FYL12yT8kNN5ecD57K7WnQO6Nn3n/d759G+gABiCU4yxO0m4pOQA6V5+IJmJ75GdInrDfgmeFNdMVn4Kwx+tByR42AzS3Y3o26vbll7dN5Z81+04qRwnleOkcpxUjpPKcVI5TirHSeU4qRwnlf/spHL57X9/AQAA//8=
// DO NOT EDIT
package com.paypal.sdk.v1.sync;

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
