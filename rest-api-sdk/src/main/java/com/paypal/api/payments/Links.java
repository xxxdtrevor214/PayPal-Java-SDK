package com.paypal.api.payments;

import com.paypal.core.rest.JSONFormatter;
import com.paypal.api.payments.HyperSchema;
import java.util.Map;
import com.paypal.core.rest.PayPalRESTException;
import com.paypal.core.rest.PayPalResource;
import com.paypal.core.rest.HttpMethod;
import com.paypal.core.rest.RESTUtil;
import com.paypal.core.rest.QueryParameters;
import com.paypal.core.rest.APIContext;
import java.io.File;
import java.io.InputStream;
import java.util.Properties;

public class Links  {

	/**
	 * 
	 */
	private String href;
	
	/**
	 * 
	 */
	private String rel;
	
	/**
	 * 
	 */
	private HyperSchema targetSchema;
	
	/**
	 * 
	 */
	private String method;
	
	/**
	 * 
	 */
	private String enctype;
	
	/**
	 * 
	 */
	private HyperSchema schema;
	
	/**
	 * Default Constructor
	 */
	public Links() {
	}

	/**
	 * Parameterized Constructor
	 */
	public Links(String href, String rel) {
		this.href = href;
		this.rel = rel;
	}
	

	/**
	 * Setter for href
	 */
	public void setHref(String href) {
		this.href = href;
	}
	
	/**
	 * Getter for href
	 */
	public String getHref() {
		return this.href;
	}


	/**
	 * Setter for rel
	 */
	public void setRel(String rel) {
		this.rel = rel;
	}
	
	/**
	 * Getter for rel
	 */
	public String getRel() {
		return this.rel;
	}


	/**
	 * Setter for targetSchema
	 */
	public void setTargetSchema(HyperSchema targetSchema) {
		this.targetSchema = targetSchema;
	}
	
	/**
	 * Getter for targetSchema
	 */
	public HyperSchema getTargetSchema() {
		return this.targetSchema;
	}


	/**
	 * Setter for method
	 */
	public void setMethod(String method) {
		this.method = method;
	}
	
	/**
	 * Getter for method
	 */
	public String getMethod() {
		return this.method;
	}


	/**
	 * Setter for enctype
	 */
	public void setEnctype(String enctype) {
		this.enctype = enctype;
	}
	
	/**
	 * Getter for enctype
	 */
	public String getEnctype() {
		return this.enctype;
	}


	/**
	 * Setter for schema
	 */
	public void setSchema(HyperSchema schema) {
		this.schema = schema;
	}
	
	/**
	 * Getter for schema
	 */
	public HyperSchema getSchema() {
		return this.schema;
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