package com.paypal.api.payments;

import com.paypal.base.rest.PayPalModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class FmfDetails extends PayPalModel {

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
