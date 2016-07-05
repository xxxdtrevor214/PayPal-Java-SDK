package com.paypal.api.payments;

import com.paypal.base.rest.PayPalModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class ChargeModels  extends PayPalModel {

	/**
	 * Identifier of the charge model. 128 characters max.
	 */
	private String id;

	/**
	 * Type of charge model. Allowed values: `SHIPPING`, `TAX`.
	 */
	private String type;

	/**
	 * Specific amount for this charge model.
	 */
	private Currency amount;

	/**
	 * Default Constructor
	 */
	public ChargeModels() {
	}

	/**
	 * Parameterized Constructor
	 */
	public ChargeModels(String type, Currency amount) {
		this.type = type;
		this.amount = amount;
	}
}
