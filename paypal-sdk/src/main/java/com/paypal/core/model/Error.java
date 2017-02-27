package com.paypal.core.model;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(fluent = true, chain = true)
public class Error {

	/**
	 * PayPal internal identifier used for correlation purposes.
	 */
	@SerializedName("debug_id")
	private String debugId;

	/**
	 * Additional details of the error
	 */
	@SerializedName("details")
	private List<ErrorDetails> details;

	/**
	 * URI for detailed information related to this error for the developer.
	 */
	@SerializedName("information_link")
	private String informationLink;

	/**
	 * Message describing the error.
	 */
	@SerializedName("message")
	private String message;

	/**
	 * Human readable, unique name of the error.
	 */
	@SerializedName("name")
	private String name;
}

