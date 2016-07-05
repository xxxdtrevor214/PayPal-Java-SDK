package com.paypal.api.payments;

import com.paypal.base.rest.PayPalModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class AgreementStateDescriptor  extends PayPalModel {

	/**
	 * Reason for changing the state of the agreement.
	 */
	private String note;

	/**
	 * The amount and currency of the agreement.
	 */
	private Currency amount;

	/**
	 * Default Constructor
	 */
	public AgreementStateDescriptor() {
	}

	/**
	 * Parameterized Constructor
	 */
	public AgreementStateDescriptor(Currency amount) {
		this.amount = amount;
	}
}
