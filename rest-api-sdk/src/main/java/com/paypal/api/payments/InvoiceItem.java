package com.paypal.api.payments;

import com.paypal.base.rest.PayPalModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class InvoiceItem  extends PayPalModel {

	/**
	 * Name of the item. 60 characters max.
	 */
	private String name;

	/**
	 * Description of the item. 1000 characters max.
	 */
	private String description;

	/**
	 * Quantity of the item. Range of 0 to 9999.999.
	 */
	private float quantity;

	/**
	 * Unit price of the item. Range of -999999.99 to 999999.99.
	 */
	private Currency unitPrice;

	/**
	 * Tax associated with the item.
	 */
	private Tax tax;

	/**
	 * Date on which the item or service was provided. Date format: yyyy-MM-dd z. For example, 2014-02-27 PST.
	 */
	private String date;

	/**
	 * Item discount in percent or amount.
	 */
	private Cost discount;

	/**
	 * Default Constructor
	 */
	public InvoiceItem() {
	}

	/**
	 * Parameterized Constructor
	 */
	public InvoiceItem(String name, float quantity, Currency unitPrice) {
		this.name = name;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
	}
}
