package com.paypal.api.payments;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class InstallmentInfo  {

	/**
	 * Installment id.
	 */
	private String installmentId;

	/**
	 * Credit card network.
	 */
	private String network;

	/**
	 * Credit card issuer.
	 */
	private String issuer;

	/**
	 * List of available installment options and the cost associated with each one.
	 */
	private List<InstallmentOption> installmentOptions;

	/**
	 * Default Constructor
	 */
	public InstallmentInfo() {
	}

	/**
	 * Parameterized Constructor
	 */
	public InstallmentInfo(List<InstallmentOption> installmentOptions) {
		this.installmentOptions = installmentOptions;
	}
}
