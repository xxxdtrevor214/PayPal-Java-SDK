package com.paypal.api.payments;

import com.paypal.base.rest.PayPalModel;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class ShippingInfo  extends PayPalModel {

	/**
	 * First name of the invoice recipient. 30 characters max.
	 */
	private String firstName;

	/**
	 * Last name of the invoice recipient. 30 characters max.
	 */
	private String lastName;

	/**
	 * Company business name of the invoice recipient. 100 characters max.
	 */
	private String businessName;

	/**
	 * Address of the invoice recipient.
	 */
	private InvoiceAddress address;

	private String email;
	
	/**
	 * Default Constructor
	 */
	public ShippingInfo() {
	}
}
