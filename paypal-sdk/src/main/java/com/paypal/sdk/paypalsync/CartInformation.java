// This class was generated on Thu, 25 Jan 2018 09:31:12 CST by version 0.1.0-dev+20fb1e of Braintree SDK Generator
// CartInformation.java
// @version 0.1.0-dev+20fb1e
// @type object
// @data H4sIAAAAAAAC/+ya34/btg/A379/BRHgi7VAfrTbsKH3duhtwG1Ye9gOA4auSBiJibnKkivRdwmG/e+DHDuJY7vttvReTk+BRdoiaepDxtKfo9ttQaOL0Uv0Atd25XyOws6OxqNf0TMuDb3CPGqMxqMfaXu4uKKgPBeV8sXoNiNQ8Rl8eMZ0NB5deo/b3RzPxqOfCfVra7ajixWaQHHgfcme9H7gxruCvDCF0cWbvXXXQjlckSCb0LWMhfK53ksPVp4I2hZfWsBoHLgVREWoFU+s/ubfW/2Ts7Ttmov6jzJITlbmmLvSSsvmPmlPqEvvyaotoNWw04OV84CwYotWMRq4Q1PSxJNBIQ0rJqOn8L3zQBvMC0NjWKJBqwichwK3cU7QJZ3vtQXxbNfdCDTWz5XT1PL+VNL1/I1knmiiMvSohDxc//J68vWXz789xCTe+/bJTDsVZmyF1r5Kx5lmT0pmnoLMGuVJVA6zpyAZCrAmK7xiCiBHUf5HERFfngTElsb8Nf5oVKr31YpGM9KNQiUZw33GKoOc15nAki5+L589+0qVpvql3ZXh3dWlhSoW5KtEqV2Lnhp+R7D44ea3xS4I6AmsE5BtwQqN2cIqhpqdRTPdPXTWPPVkDtCkOEezv6N/rttXV0dzhXKp+Y416WihA8lcGdBqyUL/dLPGw5jM8T35Ovhgy3xJPq7oxpDCoKJQr41WhowhEMGbl8djASYxnyDm09snmUgRLmaz+/v7KQc3dX494+CqbJu0E2iaSW6eniNP3h5lygBAlhhYzUPGRcF23QeRIY0EkgSSBJLHB5KXGal3rhR4XfQ3d6pWmLtKod1G9QiHW6lGGWrlKXyHKquvIMMACBZzqoBTZd/5Gq5BTLQdmMf5P+Rho9CDy7Z3lSfN6uHo2h4nHIRVDAjaqr0cQyhVBhhgoZxxfhFhuRDaSOlp8V9R+YlkOPWzS4ohjY+HYvcu23VBevQa9xvYwGJpStqFw5NexGga6r+1CdfRzSF3TrL6di4KQ/o80fyEQqw5qFgx+0pwV5aKbyq+qfimLr5OC9qIxw928UMaCSQJJAkkCSR1Wqx5JfN7j0UfQ3qECR8JHwkfCR91WmRotRnoQLqyBI8EjwSPBI9mh9WG0seF20ePHmHCR8JHwsfjw8dQprC9c6xovnP3hB4nom7u1Cp1sKZwaQFNkaEtc/KsYDdrZ0EgLNnEtqYOZk5eZWjlzB/hh5AplPfSsjWeQJlAmUCZQNmiRmftHI92tmSrQ21R2APABnlfBFg7p0PkQSB/x4oeaCuyPpt3sLnn4N6xsIf+u0N7++GHNLyzg3w8OmBqlD6kjX1b+SeCAUv3W/c7+ZJCswOrslhwAzhbrcKijGkUKC4/ae5mC8HlVJ+nfEiP35dohWXbdflI0vX5gJDGHw2lZQlxaL888DMtkA+1CdGKeeFZ9SRbS5bahdQupHbh8bULt7iBy+Y/w0m2CG7q/xPtGtAeHz7JJbipwRHA0B2ThuUWENbujrytWNBTBk7bic9/nv7gz4CbiY+Jj4mPj4iPn/KHKuKhIK/ICq6pQ46WqJs9B/EYqiOtK96QnhSOrYwh8NqS3kew+TzVIoemFVsChOcvpi9e/L9KrbiuwKNQdUy0EiweptsUJ2jmQ5+m+qSJqImoiaiJqIdcKXBbREzU3+1Zt/KmT9rNoeur/aeEneIULouC0AdwNr515+EGtzdoJmuy5CuM1KrhzKhcOmcIbX/pYKtMGfiuWzmOJW0Hr61mhUIB7jOSjPzhm0mNyzp3miOfzTAaT6i3UD06ZoTg5kxn3P/3NwAAAP//
// DO NOT EDIT
package com.paypal.sdk.paypalsync;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The cart information.
 */
@Model
public class CartInformation {

    // Required default constructor
    public CartInformation() {}

	/**
	* An array of item details.
	*/
	@SerializedName(value = "item_details", listClass = ItemDetails.class)
	private List<ItemDetails> itemDetails;

	public List<ItemDetails> itemDetails() { return itemDetails; }
	
	public CartInformation itemDetails(List<ItemDetails> itemDetails) {
	    this.itemDetails = itemDetails;
	    return this;
	}

	/**
	* The ID of the invoice. Appears only for PayPal-generated invoices.
	*/
	@SerializedName("paypal_invoice_id")
	private String paypalInvoiceId;

	public String paypalInvoiceId() { return paypalInvoiceId; }
	
	public CartInformation paypalInvoiceId(String paypalInvoiceId) {
	    this.paypalInvoiceId = paypalInvoiceId;
	    return this;
	}

	/**
	* Indicates whether the item amount or the shipping amount already includes tax.
	*/
	@SerializedName("tax_inclusive")
	private Boolean taxInclusive;

	public Boolean taxInclusive() { return taxInclusive; }
	
	public CartInformation taxInclusive(Boolean taxInclusive) {
	    this.taxInclusive = taxInclusive;
	    return this;
	}
}
