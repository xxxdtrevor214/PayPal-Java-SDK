package com.paypal.api.payments;

import com.google.gson.JsonElement;
import com.paypal.core.rest.JSONFormatter;

public class PatchRequest  {

	public enum Properties {
		add, remove, replace, move, copy, test
	}
	
	/**
	 * The operation to perform.
	 */
	private Properties op;

	/**
	 * String containing a JSON-Pointer value that references a location within the target document where the operation is performed.
	 */
	private String path;

	/**
	 * New value to apply based on the operation.
	 */
	private JsonElement value;

	/**
	 * A string containing a JSON Pointer value that references the location in the target document from which to move the value. Required for use where op=move.
	 */
	private String from;

	/**
	 * Default Constructor
	 */
	public PatchRequest() {
	}

	/**
	 * Parameterized Constructor
	 */
	public PatchRequest(Properties op, JsonElement value) {
		this.op = op;
		this.value = value;
	}


	/**
	 * Setter for op
	 */
	public PatchRequest setOp(Properties op) {
		this.op = op;
		return this;
	}

	/**
	 * Getter for op
	 */
	public Properties getOp() {
		return this.op;
	}


	/**
	 * Setter for path
	 */
	public PatchRequest setPath(String path) {
		this.path = path;
		return this;
	}

	/**
	 * Getter for path
	 */
	public String getPath() {
		return this.path;
	}


	/**
	 * Setter for value
	 */
	public PatchRequest setValue(JsonElement value) {
		this.value = value;
		return this;
	}

	/**
	 * Getter for value
	 */
	public JsonElement getValue() {
		return this.value;
	}


	/**
	 * Setter for from
	 */
	public PatchRequest setFrom(String from) {
		this.from = from;
		return this;
	}

	/**
	 * Getter for from
	 */
	public String getFrom() {
		return this.from;
	}

	/**
	 * Returns a JSON string corresponding to object state
	 *
	 * @return JSON representation
	 */
	public String toJSON() {
		return JSONFormatter.toJSON(this);
	}

	@Override
	public String toString() {
		return toJSON();
	}
}