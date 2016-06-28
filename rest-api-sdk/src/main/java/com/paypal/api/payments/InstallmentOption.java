package com.paypal.api.payments;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class InstallmentOption  {

	/**
	 * Number of installments
	 */
	private int term;

	/**
	 * Monthly payment
	 */
	private Currency monthlyPayment;

	/**
	 * Discount amount applied to the payment, if any
	 */
	private Currency discountAmount;

	/**
	 * Discount percentage applied to the payment, if any
	 */
	private Percentage discountPercentage;

	/**
	 * Default Constructor
	 */
	public InstallmentOption() {
	}

	/**
	 * Parameterized Constructor
	 */
	public InstallmentOption(int term, Currency monthlyPayment) {
		this.term = term;
		this.monthlyPayment = monthlyPayment;
	}
}
