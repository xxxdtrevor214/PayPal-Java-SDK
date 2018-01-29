// This class was generated on Mon, 29 Jan 2018 12:12:00 PST by version 0.1.0-dev+ecea6f of Braintree SDK Generator
// ShippingCost.java
// @version 0.1.0-dev+ecea6f
// @type object
// @data H4sIAAAAAAAC/+yVT2sbPRCH7++nGHR6C4tx2kKxb61zCYWkNCaXksNYmrWnaCV1NFu8lHz3Iv/bbDellJoeSk5GP9nW88xo0Dez7BKZubndcEoc1rCIWU1l7lAYV56usSnbpjLvqesXl5StcFKOwczNckOQj39gY9YKMANCIrEUFNcEUQCb2AaFr+hbmpjKvBXBbn/8tDIfCd1N8J2Z1+gzleBLy0LuFHyQmEiUKZv5pxP4ohWhYLsx8/68AfkpGvK/w0wQV5/JKtSF1HuoOWCwjH4PDEIelRzUTN5l+H+FHoOlChJ2DQUF11IFpHby4mxuWYXDemxmD86L6GjgZ/tiDA1fgSdVEjh+A2x0VLrkqOZADlYdXN3ewOuXF2/+tDmh9f6h+qXFrq4D/GMyZD/cmzaBRrgGx2tWwLrY6IbAkeUGfYZMCQW19K/X4nDS2rW2/AJTkpiEUWlYj98SV2mf8r5/ZL7E7Vhbd2EvvV//MFC4BQ51lAZL8jwtz9Py70/Lz8zZDbR3y/H7I5RjK5bg6vIvdSSUj8dkh2DMpriFsnmOivVcoW1WJGOuw6s7QOuzp+kElSZwh57dYYI5Qy2xgelkOr0od2k2m8xms/M0/f7hv+8AAAD//w==
// DO NOT EDIT
package com.paypal.sdk.v1.invoices;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The shipping cost, as a percentage or amount value.
 */
@Model
public class ShippingCost {

    // Required default constructor
    public ShippingCost() {}

	/**
	* Base object for all financial value related fields (balance, payment due, etc.)
	*/
	@SerializedName("amount")
	private Currency amount;

	public Currency amount() { return amount; }
	
	public ShippingCost amount(Currency amount) {
	    this.amount = amount;
	    return this;
	}

	/**
	* Tax information.
	*/
	@SerializedName("tax")
	private Tax tax;

	public Tax tax() { return tax; }
	
	public ShippingCost tax(Tax tax) {
	    this.tax = tax;
	    return this;
	}
}
