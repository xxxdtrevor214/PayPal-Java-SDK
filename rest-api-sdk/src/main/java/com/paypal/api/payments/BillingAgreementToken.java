package com.paypal.api.payments;

import com.paypal.base.rest.PayPalModel;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class BillingAgreementToken extends PayPalModel{

	/**
	 * Default Constructor
	 */
	public BillingAgreementToken() {
	}

}
