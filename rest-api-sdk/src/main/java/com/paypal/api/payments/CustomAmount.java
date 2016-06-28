package com.paypal.api.payments;

import com.paypal.base.rest.PayPalModel;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class CustomAmount  extends PayPalModel {

	/**
	 * Custom amount label. 25 characters max.
	 */
	private String label;

	/**
	 * Custom amount value. Range of 0 to 999999.99.
	 */
	private Currency amount;

	/**
	 * Default Constructor
	 */
	public CustomAmount() {
	}
}
