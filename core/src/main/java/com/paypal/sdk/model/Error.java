package com.paypal.sdk.model;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(fluent = true, chain = true)
public class Error {

	/**
	 * PayPal internal identifier used for correlation purposes.
	 */
	private String debugId;

	/**
	 * Additional details of the error
	 */
	private List<ErrorDetails> details;

	/**
	 * URI for detailed information related to this error for the developer.
	 */
	private String informationLink;

	/**
	 * Message describing the error.
	 */
	private String message;

	/**
	 * Human readable, unique name of the error.
	 */
	private String name;
}

