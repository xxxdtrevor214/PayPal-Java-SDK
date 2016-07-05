package com.paypal.api.payments;

import com.paypal.base.rest.PayPalModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class Measurement extends PayPalModel {
	
	/**
	 * Value this measurement represents.
	 */
	private String value;
	
	/**
	 * Unit in which the value is represented.
	 */
	private String unit;
}
