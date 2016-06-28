package com.paypal.api.payments;

import com.paypal.base.rest.PayPalModel;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class CancelNotification  extends PayPalModel {

	/**
	 * Subject of the notification.
	 */
	private String subject;

	/**
	 * Note to the payer.
	 */
	private String note;

	/**
	 * A flag indicating whether a copy of the email has to be sent to the merchant.
	 */
	private Boolean sendToMerchant;

	/**
	 * A flag indicating whether a copy of the email has to be sent to the payer.
	 */
	private Boolean sendToPayer;

	/**
	 * Default Constructor
	 */
	public CancelNotification() {
	}
}
