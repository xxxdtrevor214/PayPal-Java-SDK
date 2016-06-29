package com.paypal.api.payments;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Measurement {
	
	/**
	 * Value this measurement represents.
	 */
	private String value;
	
	/**
	 * Unit in which the value is represented.
	 */
	private String unit;
}
