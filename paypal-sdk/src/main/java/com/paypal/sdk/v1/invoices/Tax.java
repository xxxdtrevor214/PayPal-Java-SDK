// This class was generated on Mon, 29 Jan 2018 12:12:00 PST by version 0.1.0-dev+ecea6f of Braintree SDK Generator
// Tax.java
// @version 0.1.0-dev+ecea6f
// @type object
// @data H4sIAAAAAAAC/7yTwW7UMBCG7zzFyCeQomgLSCh7g/ZSIbUIql4Qh4k9aQc5thmPUSPEuyPvbjekWwkQq54i/4mj75vf/mGupkRmba7wzjTmGoWx93SBYw1NY97TNC/OKFvhpBzDdgtwGKKMWJPWNOatCE7bP64a85HQXQY/mfWAPlMNvhUWcvvgg8REokzZrD/vWU6LCAU7HQLhGEvQBdY+WsK9w0wQ+69kFYYogN7DwAGDZfTwHX0hEPKo5GBg8i7D8x49BksNJJxGCgquUAOktn1xNLeswuHm0MzunE+jo4WfnYexNHwFnlRJ4P4LsNERYAZHAwdy0E9w/ukSXr88efO/5YTi/c/mjxabuS7w75Ml+7Y0KAk0wgU4vmEFHKqN3hI4sjyiz5ApoaDW/mYtDnutTbV1B6YkMQmj0nIe/ySuUh7z/vIX5uwW2pvlg+tyW09cjkUswfnZEzUS6uN3sl1wyKZ4B/XlMSY2c4Uy9iSHXInE0oOrPGeP0wkqtXCNnt3uBnOGQeIIq3a1OqlnqevaruuOU/qzXwAAAP//
// DO NOT EDIT
package com.paypal.sdk.v1.invoices;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * Tax information.
 */
@Model
public class Tax {

    // Required default constructor
    public Tax() {}

	/**
	* Base object for all financial value related fields (balance, payment due, etc.)
	*/
	@SerializedName("amount")
	private Currency amount;

	public Currency amount() { return amount; }
	
	public Tax amount(Currency amount) {
	    this.amount = amount;
	    return this;
	}

	/**
	* The resource ID.
	*/
	@SerializedName("id")
	private String id;

	public String id() { return id; }
	
	public Tax id(String id) {
	    this.id = id;
	    return this;
	}

	/**
	* REQUIRED
	* The tax name.
	*/
	@SerializedName("name")
	private String name;

	public String name() { return name; }
	
	public Tax name(String name) {
	    this.name = name;
	    return this;
	}

	/**
	* REQUIRED
	* The tax rate. Valid value is from 0.001 to 99.999.
	*/
	@SerializedName("percent")
	private Double percent;

	public Double percent() { return percent; }
	
	public Tax percent(Double percent) {
	    this.percent = percent;
	    return this;
	}
}
