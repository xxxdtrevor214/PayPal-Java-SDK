package com.paypal.api.payments;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class FundingOption  {

	/**
	 * id of the funding option.
	 */
	private String id;

	/**
	 * List of funding sources that contributes to a payment.
	 */
	private List<FundingSource> fundingSources;

	/**
	 * Backup funding instrument which will be used for payment if primary fails.
	 */
	private FundingInstrument backupFundingInstrument;

	/**
	 * Currency conversion applicable to this funding option.
	 */
	private CurrencyConversion currencyConversion;

	/**
	 * Installment options available for a funding option.
	 */
	private InstallmentInfo installmentInfo;

	/**
	 * 
	 */
	private List<DefinitionsLinkdescription> links;

	/**
	 * Default Constructor
	 */
	public FundingOption() {
	}

	/**
	 * Parameterized Constructor
	 */
	public FundingOption(String id, List<FundingSource> fundingSources) {
		this.id = id;
		this.fundingSources = fundingSources;
	}
}
