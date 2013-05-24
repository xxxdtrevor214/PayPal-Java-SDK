package com.paypal.api.payments;

import com.paypal.core.rest.JSONFormatter;
import com.paypal.api.payments.Links;
import java.util.List;
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

public class HyperSchema  {

	/**
	 * 
	 */
	private List<Links> links;
	
	/**
	 * 
	 */
	private String fragmentResolution;
	
	/**
	 * 
	 */
	private Boolean readonly;
	
	/**
	 * 
	 */
	private String contentEncoding;
	
	/**
	 * 
	 */
	private String pathStart;
	
	/**
	 * 
	 */
	private String mediaType;
	
	/**
	 * Default Constructor
	 */
	public HyperSchema() {
	}


	/**
	 * Setter for links
	 */
	public void setLinks(List<Links> links) {
		this.links = links;
	}
	
	/**
	 * Getter for links
	 */
	public List<Links> getLinks() {
		return this.links;
	}


	/**
	 * Setter for fragmentResolution
	 */
	public void setFragmentResolution(String fragmentResolution) {
		this.fragmentResolution = fragmentResolution;
	}
	
	/**
	 * Getter for fragmentResolution
	 */
	public String getFragmentResolution() {
		return this.fragmentResolution;
	}


	/**
	 * Setter for readonly
	 */
	public void setReadonly(Boolean readonly) {
		this.readonly = readonly;
	}
	
	/**
	 * Getter for readonly
	 */
	public Boolean getReadonly() {
		return this.readonly;
	}


	/**
	 * Setter for contentEncoding
	 */
	public void setContentEncoding(String contentEncoding) {
		this.contentEncoding = contentEncoding;
	}
	
	/**
	 * Getter for contentEncoding
	 */
	public String getContentEncoding() {
		return this.contentEncoding;
	}


	/**
	 * Setter for pathStart
	 */
	public void setPathStart(String pathStart) {
		this.pathStart = pathStart;
	}
	
	/**
	 * Getter for pathStart
	 */
	public String getPathStart() {
		return this.pathStart;
	}


	/**
	 * Setter for mediaType
	 */
	public void setMediaType(String mediaType) {
		this.mediaType = mediaType;
	}
	
	/**
	 * Getter for mediaType
	 */
	public String getMediaType() {
		return this.mediaType;
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