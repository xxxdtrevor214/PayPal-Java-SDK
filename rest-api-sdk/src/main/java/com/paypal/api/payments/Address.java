package com.paypal.api.payments;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Address  extends BaseAddress {

	/**
	 * Phone number in E.123 format.
	 */
	private String phone;
}
