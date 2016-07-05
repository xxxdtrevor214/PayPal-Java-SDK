package com.paypal.api.payments;

import com.paypal.base.rest.PayPalModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class BaseAddress extends PayPalModel {

	/**
	 * Line 1 of the BaseAddress (e.g., Number, street, etc). 100 characters max.
	 */
	private String line1;

	/**
	 * Line 2 of the BaseAddress (e.g., Suite, apt #, etc). 100 characters max.
	 */
	private String line2;

	/**
	 * City name. 50 characters max.
	 */
	private String city;

	/**
	 * [2-letter country code](https://developer.paypal.com/docs/classic/api/country_codes/). 2 characters max.
	 */
	private String countryCode;

	/**
	 * Zip code or equivalent is usually required for countries that have them. 20 characters max. **Required in certain countries.**
	 */
	private String postalCode;

	/**
	 * 2-letter code for US states, and the equivalent for other countries. 100 characters max.
	 */
	private String state;

	/**
	 * BaseAddress normalization status, returned only for payers from Brazil.
	 */
	private String normalizationStatus;

	/**
	 * BaseAddress status
	 */
	private String status;

	/**
	 * Default Constructor
	 */
	public BaseAddress() {
	}

	/**
	 * Parameterized Constructor
	 */
	public BaseAddress(String line1, String countryCode) {
		this.line1 = line1;
		this.countryCode = countryCode;
	}
}
