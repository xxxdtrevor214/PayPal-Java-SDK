package com.paypal.api.payments;

import com.paypal.base.rest.PayPalModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class PaymentTerm  extends PayPalModel {

	/**
	 * Terms by which the invoice payment is due.
	 */
	private String termType;

	/**
	 * Date on which invoice payment is due. It must be always a future date. Date format: yyyy-MM-dd z. For example, 2014-02-27 PST
	 */
	private String dueDate;

	/**
	 * Default Constructor
	 */
	public PaymentTerm() {
	}
}
