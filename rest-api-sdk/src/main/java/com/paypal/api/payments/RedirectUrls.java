package com.paypal.api.payments;

import com.paypal.base.rest.PayPalModel;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class RedirectUrls  extends PayPalModel {

	/**
	 * Url where the payer would be redirected to after approving the payment.
	 */
	private String returnUrl;

	/**
	 * Url where the payer would be redirected to after canceling the payment.
	 */
	private String cancelUrl;

	/**
	 * Default Constructor
	 */
	public RedirectUrls() {
	}
}
