package com.paypal.api.payments;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class RecipientBankingInstruction  {

	/**
	 * Name of the financial institution.
	 */
	private String bankName;

	/**
	 * Name of the account holder
	 */
	private String accountHolderName;

	/**
	 * bank account number
	 */
	private String accountNumber;

	/**
	 * bank routing number
	 */
	private String routingNumber;

	/**
	 * IBAN equivalent of the bank
	 */
	private String internationalBankAccountNumber;

	/**
	 * BIC identifier of the financial institution
	 */
	private String bankIdentifierCode;

	/**
	 * Default Constructor
	 */
	public RecipientBankingInstruction() {
	}

	/**
	 * Parameterized Constructor
	 */
	public RecipientBankingInstruction(String bankName, String accountHolderName, String internationalBankAccountNumber) {
		this.bankName = bankName;
		this.accountHolderName = accountHolderName;
		this.internationalBankAccountNumber = internationalBankAccountNumber;
	}
}
