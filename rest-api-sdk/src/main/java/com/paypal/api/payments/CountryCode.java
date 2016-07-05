package com.paypal.api.payments;

import com.paypal.base.rest.PayPalModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class CountryCode extends PayPalModel {

	/**
	 * ISO country code based on 2-character IS0-3166-1 codes.
	 */
	private String countryCode;

	/**
	 * Default Constructor
	 */
	public CountryCode() {
	}

	/**
	 * Parameterized Constructor
	 */
	public CountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
}
