package com.paypal.api.payments;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class CountryCode  {

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
