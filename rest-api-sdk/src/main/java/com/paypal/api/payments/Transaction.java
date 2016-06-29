package com.paypal.api.payments;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;

@Data
@Accessors(chain = true)
public class Transaction extends TransactionBase {

	/**
	 * Additional transactions for complex payment scenarios.
	 */
	private List<Transaction> transactions;

	/**
	 * Default Constructor
	 */
	public Transaction() {
		transactions = new ArrayList<Transaction>();
	}
}
