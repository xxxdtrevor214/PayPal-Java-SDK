package com.paypal.api.payments;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class WebProfileList  extends ArrayList<WebProfile> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<WebProfile> webProfiles = null;
	
	/**
	 * Default Constructor
	 */
	public WebProfileList() {
		webProfiles = new ArrayList<WebProfile>();
	}
}
