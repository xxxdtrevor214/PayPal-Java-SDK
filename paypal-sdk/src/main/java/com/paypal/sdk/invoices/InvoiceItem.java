// This class was generated on Mon, 22 Jan 2018 14:43:26 PST by version 0.1.0-dev+8c35d5 of Braintree SDK Generator
// InvoiceItem.java
// @version 0.1.0-dev+8c35d5
// @type object
// @data H4sIAAAAAAAC/+xX32/bNhB+319x0DCgNRRZXtYNzluXYEAwtB22oC9F0JzJU3wDRarkyY029H8faMs/ONlIg7lBB+TJ0PEofd93dx/pv7OrrqHsLLu0C8eK4FKozvLsLXrGmaHXWMfVLM9+pW77cEFBeW6End3Za9gSsFANbCvna4zrRZZnL73HbvWhMs9+J9RvrOmyswpNoBj40LInvQn85l1DXphCdvZuAzGIZ3s7BKdRKAHYB1KQV3OCuAAf52RB5j1S5yGQX0T4HzFA492CNekCNvkrJsABRl3XdaOT0atXo5OR1iMY/TXKAQNoqtiSBrbw7tIKeUsCFyg0vuKa4JflG66fzUWas/FYnDOhYJKqcP52PJfajH2lTk9Pp98GUhHvyYvix+f/VTnbGvMpv1++HZkSFZP4UMylfDtJR4Z77oLsActBudZKinQbHMJULkisEUJDXpGVWHK0gHXcAgs0LRWxREB3WDeGchAHoSHFVQeT8rscKJYUbiblTQEvTSwvCi/IdEnq9p2ughebXS9ujjcB5633ZFU31GX15USVTSjV5GcMBG72JymJrQ1oDFRs0SpGs5IDPBkU0lAxGR3g2QwNWkU5NNjVUULdUg4kqnj+xadb9ZzPnU6nXG3FSBmegiGJ2q8zQDlNu3M66+Dyjzfww/eTnx5pyJa6JvDXkRR730FtEzvrNWi+ZQGsIptoWZoU12gCBGrQo8T6JfazprUsbdyBTeNd4zk6WaLHg4iLb/fxvt5hbtt6Rn7IvJ+6hPs2tn9e83Rg+xl9i4Z136EcoPKuhjLqNCnLo5Tx+jMKaePPLpc+cMAf4+oxlL5f5w8tWmHpEnA7wQMA1xn75T2ZlGW51viBKt/L5ArvhjRkGdwyWD3/CzzefZkbxpO/Pvnr1+qvh5izTmgvH4ez7im41sf7/cUjVeTzjVLw7hF98qHnUUTnUQ6dP0VZTmIvTafFdDp9rKK3luW9q97XhKH1qc7DtSGpmBOvqX3Oppt59U9OL8+GY1/oD5rrEnHjWe0hsg5/NSY7rNqTx/6/Pfb60zf/AAAA//8=
// DO NOT EDIT
package com.paypal.sdk.invoices;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * Invoice line item information.
 */
@Model
public class InvoiceItem {

    // Required default constructor
    public InvoiceItem() {}

	/**
	* The date when the item or service was provided. The date format is *yyyy*-*MM*-*dd* *z*, as defined in [Internet Date/Time Format](http://tools.ietf.org/html/rfc3339#section-5.6).
	*/
	@SerializedName("date")
	private String date;

	public String date() { return date; }
	
	public InvoiceItem date(String date) {
	    this.date = date;
	    return this;
	}

	/**
	* The item description.
	*/
	@SerializedName("description")
	private String description;

	public String description() { return description; }
	
	public InvoiceItem description(String description) {
	    this.description = description;
	    return this;
	}

	/**
	* The cost as a percent or an amount value. For example, to specify 10%, enter `10`. Alternatively, to specify an amount of 5, enter `5`.
	*/
	@SerializedName("discount")
	private Cost discount;

	public Cost discount() { return discount; }
	
	public InvoiceItem discount(Cost discount) {
	    this.discount = discount;
	    return this;
	}

	/**
	* REQUIRED
	* The item name.
	*/
	@SerializedName("name")
	private String name;

	public String name() { return name; }
	
	public InvoiceItem name(String name) {
	    this.name = name;
	    return this;
	}

	/**
	* REQUIRED
	* The item quantity. Valid value is from -10000 to 10000.
	*/
	@SerializedName("quantity")
	private Double quantity;

	public Double quantity() { return quantity; }
	
	public InvoiceItem quantity(Double quantity) {
	    this.quantity = quantity;
	    return this;
	}

	/**
	* Tax information.
	*/
	@SerializedName("tax")
	private Tax tax;

	public Tax tax() { return tax; }
	
	public InvoiceItem tax(Tax tax) {
	    this.tax = tax;
	    return this;
	}

	/**
	* The unit of measure for the invoiced item.
	*/
	@SerializedName("unit_of_measure")
	private String unitOfMeasure;

	public String unitOfMeasure() { return unitOfMeasure; }
	
	public InvoiceItem unitOfMeasure(String unitOfMeasure) {
	    this.unitOfMeasure = unitOfMeasure;
	    return this;
	}

	/**
	* REQUIRED
	* Base object for all financial value related fields (balance, payment due, etc.)
	*/
	@SerializedName("unit_price")
	private Currency unitPrice;

	public Currency unitPrice() { return unitPrice; }
	
	public InvoiceItem unitPrice(Currency unitPrice) {
	    this.unitPrice = unitPrice;
	    return this;
	}
}
