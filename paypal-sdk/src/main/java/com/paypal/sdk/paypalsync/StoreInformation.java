// This class was generated on Thu, 25 Jan 2018 09:31:12 CST by version 0.1.0-dev+20fb1e of Braintree SDK Generator
// StoreInformation.java
// @version 0.1.0-dev+20fb1e
// @type object
// @data H4sIAAAAAAAC/6zPPUsEMRAG4N5fEaYOYr2dcM0hqOhhIyJjMusO5mOdzBZB7r9LVr0Pt7DwyrwZZt7nAzZ1JOjgXrOQWac+S0TlnMDCAwrjS6BrjG0ELFxR3T9WVJzwOA93sBnIlHkJ75ecg4VLEaxfVy4s3BH6mxQqdD2GQi14n1jI74JbySOJMhXoHnf9igqn12Wp+eQz+6NyB+Gy5Hplcm/wu2yfxaCJJG7ApIaT0QapRSm2OSGXxf/XkaYQtvZPjJJEThh+e47zJennv9kaqBHcQO4tT2qKYvINdsCc7SdBPW3PPgEAAP//
// DO NOT EDIT
package com.paypal.sdk.paypalsync;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The store information.
 */
@Model
public class StoreInformation {

    // Required default constructor
    public StoreInformation() {}

	/**
	* The ID of a store for a merchant in the system of record.
	*/
	@SerializedName("store_id")
	private String storeId;

	public String storeId() { return storeId; }
	
	public StoreInformation storeId(String storeId) {
	    this.storeId = storeId;
	    return this;
	}

	/**
	* The terminal ID for the checkout stand in a merchant store.
	*/
	@SerializedName("terminal_id")
	private String terminalId;

	public String terminalId() { return terminalId; }
	
	public StoreInformation terminalId(String terminalId) {
	    this.terminalId = terminalId;
	    return this;
	}
}
