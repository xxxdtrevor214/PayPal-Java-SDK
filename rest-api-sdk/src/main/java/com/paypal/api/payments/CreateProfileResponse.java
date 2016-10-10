package com.paypal.api.payments;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter @Setter
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class CreateProfileResponse extends WebProfile {

	/**
	 * ID of the payment web experience profile.
	 */
	private String id;

	/**
	 * Default Constructor
	 */
	public CreateProfileResponse() {
	}

}
