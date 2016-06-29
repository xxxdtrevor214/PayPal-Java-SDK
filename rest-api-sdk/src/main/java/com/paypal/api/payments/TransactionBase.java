package com.paypal.api.payments;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class TransactionBase extends CartBase {

	/**
	 * List of financial transactions (Sale, Authorization, Capture, Refund) related to the payment.
	 */
	private List<RelatedResources> relatedResources;

	/**
	 * Identifier to the purchase unit corresponding to this sale transaction.
	 */
	private String purchaseUnitReferenceId;


	/**
	 * Default Constructor
	 */
	public TransactionBase() {
	}
}
