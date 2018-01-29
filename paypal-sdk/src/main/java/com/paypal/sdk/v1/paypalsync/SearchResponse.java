// This class was generated on Thu, 25 Jan 2018 09:31:12 CST by version 0.1.0-dev+20fb1e of Braintree SDK Generator
// SearchResponse.java
// @version 0.1.0-dev+20fb1e
// @type object
// @data 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
// DO NOT EDIT
package com.paypal.sdk.v1.paypalsync;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The search response information.
 */
@Model
public class SearchResponse {

    // Required default constructor
    public SearchResponse() {}

	/**
	* The merchant account number.
	*/
	@SerializedName("account_number")
	private String accountNumber;

	public String accountNumber() { return accountNumber; }
	
	public SearchResponse accountNumber(String accountNumber) {
	    this.accountNumber = accountNumber;
	    return this;
	}

	/**
	* The end date and time or the last date when the data can be served, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6).
	*/
	@SerializedName("end_date")
	private String endDate;

	public String endDate() { return endDate; }
	
	public SearchResponse endDate(String endDate) {
	    this.endDate = endDate;
	    return this;
	}

	/**
	* The date and time when the data was last refreshed, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6).
	*/
	@SerializedName("last_refreshed_datetime")
	private String lastRefreshedDatetime;

	public String lastRefreshedDatetime() { return lastRefreshedDatetime; }
	
	public SearchResponse lastRefreshedDatetime(String lastRefreshedDatetime) {
	    this.lastRefreshedDatetime = lastRefreshedDatetime;
	    return this;
	}

	/**
	* An array of request-related [HATEOAS links](/docs/api/overview/#hateoas-links).
	*/
	@SerializedName(value = "links", listClass = LinkDescription.class)
	private List<LinkDescription> links;

	public List<LinkDescription> links() { return links; }
	
	public SearchResponse links(List<LinkDescription> links) {
	    this.links = links;
	    return this;
	}

	/**
	* A zero-relative index of transactions.
	*/
	@SerializedName("page")
	private Integer page;

	public Integer page() { return page; }
	
	public SearchResponse page(Integer page) {
	    this.page = page;
	    return this;
	}

	/**
	* The start date and time, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6).
	*/
	@SerializedName("start_date")
	private String startDate;

	public String startDate() { return startDate; }
	
	public SearchResponse startDate(String startDate) {
	    this.startDate = startDate;
	    return this;
	}

	/**
	* The total number of transactions as an integer beginning with the specified `page` in the full result and not just in this response.
	*/
	@SerializedName("total_items")
	private Integer totalItems;

	public Integer totalItems() { return totalItems; }
	
	public SearchResponse totalItems(Integer totalItems) {
	    this.totalItems = totalItems;
	    return this;
	}

	/**
	* The total number of pages, as an `integer`, when the `total_items` is divided into pages of the specified `page_size`.
	*/
	@SerializedName("total_pages")
	private Integer totalPages;

	public Integer totalPages() { return totalPages; }
	
	public SearchResponse totalPages(Integer totalPages) {
	    this.totalPages = totalPages;
	    return this;
	}

	/**
	* An array of transaction detail objects.
	*/
	@SerializedName(value = "transaction_details", listClass = TransactionDetails.class)
	private List<TransactionDetails> transactionDetails;

	public List<TransactionDetails> transactionDetails() { return transactionDetails; }
	
	public SearchResponse transactionDetails(List<TransactionDetails> transactionDetails) {
	    this.transactionDetails = transactionDetails;
	    return this;
	}
}
