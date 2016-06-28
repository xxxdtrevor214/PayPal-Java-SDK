package com.paypal.api.payments;


import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class ExtendedBankAccount extends BankAccount {

	/**
	 * Identifier of the direct debit mandate to validate. Currently supported only for EU bank accounts(SEPA).
	 */
	private String mandateReferenceNumber;

	/**
	 * Default Constructor
	 */
	public ExtendedBankAccount() {
	}
}
