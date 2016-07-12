package com.paypal.api.payments;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class Address extends BaseAddress {

	/**
	 * Phone number in E.123 format.
	 */
	private String phone;
}
