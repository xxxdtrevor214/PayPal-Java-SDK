package com.paypal.api.payments;

import com.paypal.base.rest.PayPalModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class MerchantInfo  extends PayPalModel {

	/**
	 * Email address of the merchant. 260 characters max.
	 */
	private String email;

	/**
	 * First name of the merchant. 30 characters max.
	 */
	private String firstName;

	/**
	 * Last name of the merchant. 30 characters max.
	 */
	private String lastName;

	/**
	 * Address of the merchant.
	 */
	private InvoiceAddress address;

	/**
	 * Company business name of the merchant. 100 characters max.
	 */
	private String businessName;

	/**
	 * Phone number of the merchant.
	 */
	private Phone phone;

	/**
	 * Fax number of the merchant.
	 */
	private Phone fax;

	/**
	 * Website of the merchant. 2048 characters max.
	 */
	private String website;

	/**
	 * Tax ID of the merchant. 100 characters max.
	 */
	private String taxId;

	/**
	 * Option to display additional information such as business hours. 40 characters max.
	 */
	private String additionalInfo;

	/**
	 * Default Constructor
	 */
	public MerchantInfo() {
	}

	/**
	 * Parameterized Constructor
	 */
	public MerchantInfo(String email) {
		this.email = email;
	}
}
