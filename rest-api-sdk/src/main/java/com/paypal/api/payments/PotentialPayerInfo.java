package com.paypal.api.payments;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class PotentialPayerInfo  {

	/**
	 * Email address representing the potential payer.
	 */
	private String email;

	/**
	 * ExternalRememberMe id representing the potential payer
	 */
	private String externalRememberMeId;

	/**
	 * Account Number representing the potential payer
	 */
	private String accountNumber;

	/**
	 * Billing address of the potential payer.
	 */
	private Address billingAddress;

	/**
	 * Default Constructor
	 */
	public PotentialPayerInfo() {
	}
}
