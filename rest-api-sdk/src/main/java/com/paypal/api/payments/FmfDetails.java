package com.paypal.api.payments;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class FmfDetails {

	/**
	 * Type of filter.
	 */
	private String filterType;
	
	/**
	 * Filter Identifier.
	 */
	private String filterId;
	
	/**
	 * Name of the filter
	 */
	private String name;
	
	/**
	 * Description of the filter.
	 */
	private String description;
}
