package com.paypal.api.payments;

import com.paypal.base.rest.PayPalModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class BillingInfo  extends PayPalModel {

	/**
	 * Email address of the invoice recipient. 260 characters max.
	 */
	private String email;

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

	/**
	 * Language of the email sent to the payer. Will only be used if payer doesn't have a PayPal account.
	 */
	private String language;

	/**
	 * Option to display additional information such as business hours. 40 characters max.
	 */
	private String additionalInfo;

	/**
	 * Default Constructor
	 */
	public BillingInfo() {
	}

	/**
	 * Parameterized Constructor
	 */
	public BillingInfo(String email) {
		this.email = email;
	}
}
