package com.paypal.api.payments;

import com.paypal.base.rest.PayPalModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class Tax  extends PayPalModel {

	/**
	 * Identifier of the resource.
	 */
	private String id;

	/**
	 * Name of the tax. 10 characters max.
	 */
	private String name;

	/**
	 * Rate of the specified tax. Range of 0.001 to 99.999.
	 */
	private float percent;

	/**
	 * Tax in the form of money. Cannot be specified in a request.
	 */
	private Currency amount;

	/**
	 * Default Constructor
	 */
	public Tax() {
	}

	/**
	 * Parameterized Constructor
	 */
	public Tax(String name, float percent) {
		this.name = name;
		this.percent = percent;
	}
}
