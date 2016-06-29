package com.paypal.api.payments;

import com.paypal.base.rest.PayPalModel;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Billing extends PayPalModel {

	/**
	 * Identifier of the instrument in PayPal Wallet
	 */
	private String billingAgreementId;

	/**
	 * Default Constructor
	 */
	public Billing() {
	}
}
