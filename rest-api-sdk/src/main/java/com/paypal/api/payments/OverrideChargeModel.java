package com.paypal.api.payments;

import com.paypal.base.rest.PayPalModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class OverrideChargeModel  extends PayPalModel {

	/**
	 * ID of charge model.
	 */
	private String chargeId;

	/**
	 * Updated Amount to be associated with this charge model.
	 */
	private Currency amount;

	/**
	 * Default Constructor
	 */
	public OverrideChargeModel() {
	}
}
