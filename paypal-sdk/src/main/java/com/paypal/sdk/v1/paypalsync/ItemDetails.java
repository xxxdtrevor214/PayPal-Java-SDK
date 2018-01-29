// This class was generated on Thu, 25 Jan 2018 09:31:12 CST by version 0.1.0-dev+20fb1e of Braintree SDK Generator
// ItemDetails.java
// @version 0.1.0-dev+20fb1e
// @type object
// @data H4sIAAAAAAAC/+yab4/bNg/A3z+fgjDw4GmB/GmfDRt67w7tBnTD2mI7DBi6ImEkJuYqS65E3yUY9t0H+U8uju22w6735vQqsEhZJE3+xNj6M7s6lJRdZC+FCnhBgmxCNst+Rc+4MfQKiyjNZtmPdLi9eEFBeS6Fnc0usqucgON83cxfZLPs0ns8NPd+Mst+JtSvrTlkF1s0geLAh4o96ePAG+9K8sIUsou3R6t+cpYOQ3NQ/1EFKcjKCgtXWenZNyYdGqwq78mqA6DV0OjB1nlA2LJFqxgNXKOpaO7JoJCGLZPRC/jeeaA9FqWhGWzQoFUEzkOJh7gm6IruLgBBPNvdMAKd9SvlNPW8P5cMPX8ruSeaqxw9KiEPL395Pf/6/0+/vY1JnPvu0VI7FZZshXYe4w2Wmj0pWXoKsuyU51E5LB+D5CjAmqzwlimAnET5H0VEfHUWEFsZ89fsk1Gpn1cvGt3IMAq1ZAY3OascCt7lAhu6+L168uQrVZn6l5orw83VpYU6FuTrRGldi54afk+w/uHNb+smCOgJrBOQQ8kKjTnANoaanUWzaG667O56tgZoUlygOc4YX+vq1YuTtUK10XzNmnS00IHkrgpoteRhfLll52FM5vicfBt8sFWxIQ9uezSkNKgotLXRy5AZBCJ4+/x0LMA85hPEfHr3KBcpw8VyeXNzs+DgFs7vlhxcnW3zfgItcinM47vIk3cnmTIBkA0GVquQc1my3Y1BZEojgSSBJIHk4YHkeU7qvasEXjfPflhIrcLK1QqhX0tDYT+RLi1gtDbGq1OGVnkB36HK2yvIMQCCxYJq4NTZd+bsN18AE30HVnH9j3nYKYzgsu9d7UlXPRxdO+KEg7CKAUFbt5czCJXKAQOslTPOryMs10J7qTyt/y0qP5MM534OSTGl8elQNM+yvy/IiF7nfgcbWG9MRU04POl1jKah8alduE4mh8I5ydvpXJaG9N1E8zM2Ys1BxR1zbAseytLmmzbftPmmLr5NC9qLx4928VMaCSQJJAkkCSRtWux4K6sbj+UYQ0aECR8JHwkfCR9tWuRotZnoQIayBI8EjwSPBI82LdiGysfCHaPHiDDhI+Ej4ePh4WMqU9heO1a0atw9o8eZaOTYRqPSBmsBlxbQlDnaqiDPCppVBwWBsGET25o2mAV5laOVO34JP4VMoWKUlr3xBMoEygTKBMoeNQa1czo6+CRbH2qLwhEAdsj7X4CdczpEHgTy16zonj5F1qbrE5sHfvWFk4f2jsP3afjgC/Lp6ISpUXqfNo59yj8TTFh6/HTfyDcUui+wKo8bbgBn6yosq5hGgWL5STebLQRXUHue8j49/lChFZbD0OUTydDnW4R0/mioLEuIQ8fywC9UIB9rE6IVq9KzGkm2niy1C6ldSO3Cw2sXrnAPl91/hrNsEdy3/yf6e0B/fPokl+C+BUcAQ9dMGjYHQNi5a/K2ZsHINnDeToS7O941QcpbfybcTHxMfEx8fEB8/Jw/VBEPJXlFVnBHA3L0RMPsuRXPoD7SuuU96Xnp2MoMAu8s6WMEu9dTPXJo2rIlQHj6bPHs2X/r1Ip1BR6F6mOitWB9P92mOEGzmno1NSZNRE1ETUR9OET9z98AAAD//w==
// DO NOT EDIT
package com.paypal.sdk.v1.paypalsync;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The item details.
 */
@Model
public class ItemDetails {

    // Required default constructor
    public ItemDetails() {}

	/**
	* The currency and amount for a financial value-related field. For example, balance or payment due.
	*/
	@SerializedName("adjustment_amount")
	private Money adjustmentAmount;

	public Money adjustmentAmount() { return adjustmentAmount; }
	
	public ItemDetails adjustmentAmount(Money adjustmentAmount) {
	    this.adjustmentAmount = adjustmentAmount;
	    return this;
	}

	/**
	* The currency and amount for a financial value-related field. For example, balance or payment due.
	*/
	@SerializedName("basic_shipping_amount")
	private Money basicShippingAmount;

	public Money basicShippingAmount() { return basicShippingAmount; }
	
	public ItemDetails basicShippingAmount(Money basicShippingAmount) {
	    this.basicShippingAmount = basicShippingAmount;
	    return this;
	}

	/**
	* An array of checkout options. Each option has a name and value.
	*/
	@SerializedName(value = "checkout_options", listClass = CheckoutOption.class)
	private List<CheckoutOption> checkoutOptions;

	public List<CheckoutOption> checkoutOptions() { return checkoutOptions; }
	
	public ItemDetails checkoutOptions(List<CheckoutOption> checkoutOptions) {
	    this.checkoutOptions = checkoutOptions;
	    return this;
	}

	/**
	* The currency and amount for a financial value-related field. For example, balance or payment due.
	*/
	@SerializedName("discount_amount")
	private Money discountAmount;

	public Money discountAmount() { return discountAmount; }
	
	public ItemDetails discountAmount(Money discountAmount) {
	    this.discountAmount = discountAmount;
	    return this;
	}

	/**
	* The currency and amount for a financial value-related field. For example, balance or payment due.
	*/
	@SerializedName("extra_shipping_amount")
	private Money extraShippingAmount;

	public Money extraShippingAmount() { return extraShippingAmount; }
	
	public ItemDetails extraShippingAmount(Money extraShippingAmount) {
	    this.extraShippingAmount = extraShippingAmount;
	    return this;
	}

	/**
	* The currency and amount for a financial value-related field. For example, balance or payment due.
	*/
	@SerializedName("gift_wrap_amount")
	private Money giftWrapAmount;

	public Money giftWrapAmount() { return giftWrapAmount; }
	
	public ItemDetails giftWrapAmount(Money giftWrapAmount) {
	    this.giftWrapAmount = giftWrapAmount;
	    return this;
	}

	/**
	* The currency and amount for a financial value-related field. For example, balance or payment due.
	*/
	@SerializedName("handling_amount")
	private Money handlingAmount;

	public Money handlingAmount() { return handlingAmount; }
	
	public ItemDetails handlingAmount(Money handlingAmount) {
	    this.handlingAmount = handlingAmount;
	    return this;
	}

	/**
	* The currency and amount for a financial value-related field. For example, balance or payment due.
	*/
	@SerializedName("insurance_amount")
	private Money insuranceAmount;

	public Money insuranceAmount() { return insuranceAmount; }
	
	public ItemDetails insuranceAmount(Money insuranceAmount) {
	    this.insuranceAmount = insuranceAmount;
	    return this;
	}

	/**
	* The invoice number. An alphanumeric string that identifies a billing for a merchant.
	*/
	@SerializedName("invoice_number")
	private String invoiceNumber;

	public String invoiceNumber() { return invoiceNumber; }
	
	public ItemDetails invoiceNumber(String invoiceNumber) {
	    this.invoiceNumber = invoiceNumber;
	    return this;
	}

	/**
	* The currency and amount for a financial value-related field. For example, balance or payment due.
	*/
	@SerializedName("item_amount")
	private Money itemAmount;

	public Money itemAmount() { return itemAmount; }
	
	public ItemDetails itemAmount(Money itemAmount) {
	    this.itemAmount = itemAmount;
	    return this;
	}

	/**
	* An item code that identifies a merchant's goods or service.
	*/
	@SerializedName("item_code")
	private String itemCode;

	public String itemCode() { return itemCode; }
	
	public ItemDetails itemCode(String itemCode) {
	    this.itemCode = itemCode;
	    return this;
	}

	/**
	* The item description.
	*/
	@SerializedName("item_description")
	private String itemDescription;

	public String itemDescription() { return itemDescription; }
	
	public ItemDetails itemDescription(String itemDescription) {
	    this.itemDescription = itemDescription;
	    return this;
	}

	/**
	* The item name.
	*/
	@SerializedName("item_name")
	private String itemName;

	public String itemName() { return itemName; }
	
	public ItemDetails itemName(String itemName) {
	    this.itemName = itemName;
	    return this;
	}

	/**
	* The item options. Describes option choices on the purchase of the item in some detail.
	*/
	@SerializedName("item_options")
	private String itemOptions;

	public String itemOptions() { return itemOptions; }
	
	public ItemDetails itemOptions(String itemOptions) {
	    this.itemOptions = itemOptions;
	    return this;
	}

	/**
	* The number of purchased units of goods or a service.
	*/
	@SerializedName("item_quantity")
	private String itemQuantity;

	public String itemQuantity() { return itemQuantity; }
	
	public ItemDetails itemQuantity(String itemQuantity) {
	    this.itemQuantity = itemQuantity;
	    return this;
	}

	/**
	* The currency and amount for a financial value-related field. For example, balance or payment due.
	*/
	@SerializedName("item_unit_price")
	private Money itemUnitPrice;

	public Money itemUnitPrice() { return itemUnitPrice; }
	
	public ItemDetails itemUnitPrice(Money itemUnitPrice) {
	    this.itemUnitPrice = itemUnitPrice;
	    return this;
	}

	/**
	* An array of tax amounts levied by a government on the purchase of goods or services.
	*/
	@SerializedName(value = "tax_amounts", listClass = TaxAmount.class)
	private List<TaxAmount> taxAmounts;

	public List<TaxAmount> taxAmounts() { return taxAmounts; }
	
	public ItemDetails taxAmounts(List<TaxAmount> taxAmounts) {
	    this.taxAmounts = taxAmounts;
	    return this;
	}

	/**
	* The percentage, as a fixed-point, signed decimal number. For example, define a 19.99% interest rate as `19.99`.
	*/
	@SerializedName("tax_percentage")
	private String taxPercentage;

	public String taxPercentage() { return taxPercentage; }
	
	public ItemDetails taxPercentage(String taxPercentage) {
	    this.taxPercentage = taxPercentage;
	    return this;
	}

	/**
	* The currency and amount for a financial value-related field. For example, balance or payment due.
	*/
	@SerializedName("total_item_amount")
	private Money totalItemAmount;

	public Money totalItemAmount() { return totalItemAmount; }
	
	public ItemDetails totalItemAmount(Money totalItemAmount) {
	    this.totalItemAmount = totalItemAmount;
	    return this;
	}
}
