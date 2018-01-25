// This class was generated on Thu, 25 Jan 2018 09:31:12 CST by version 0.1.0-dev+20fb1e of Braintree SDK Generator
// AuctionInformation.java
// @version 0.1.0-dev+20fb1e
// @type object
// @data H4sIAAAAAAAC/7yTT4vUQBDF736Kor0oxIwwKJjbwlwGRWUZvSxL6ElXpwv7T6yuuATZ7y6dmf07GxCUvaWr3nv945H+rXbTgKpRZ2MnlCJso00cdPlWlfqumfTe42cdikhV6iNOd4cN5o5pmMWN2jkEfYyhu5haVeqMWU+Hm95W6hy1+RL9pBqrfcYy+DkSo7kdfOU0IAthVs3FLWMWptifYh0vbffjhNySeYD5xPIUe7uBZEEcwiyDK5cg6B+Y59kwcud0RqA4n4+RNewc5eIN1DuBPYIha5ExClhO4WDWJXC7gYHTLzJowCa+2QSM8q/9xNH76+qvS+p8yhT71mjBJ4t6JDgtqyxARwNCAeHK4YNWoPgxV6Wsi20U5IjyyHP4Ny5fOZEhN6uVpORzTSi2TtyvnAS/Ytut1+sPLzPOsW/e1e9fP3NVJBjaTAs93d8uP4QigG/nn54ZfZF6ETjqgDeP4D78fwG/vH7xBwAA//8=
// DO NOT EDIT
package com.paypal.sdk.paypalsync;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The auction information.
 */
@Model
public class AuctionInformation {

    // Required default constructor
    public AuctionInformation() {}

	/**
	* The ID of the buyer who makes the purchase in the auction. This ID might be different from the payer ID provided for the payment.
	*/
	@SerializedName("auction_buyer_id")
	private String auctionBuyerId;

	public String auctionBuyerId() { return auctionBuyerId; }
	
	public AuctionInformation auctionBuyerId(String auctionBuyerId) {
	    this.auctionBuyerId = auctionBuyerId;
	    return this;
	}

	/**
	* The date and time when the auction closes, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6).
	*/
	@SerializedName("auction_closing_date")
	private String auctionClosingDate;

	public String auctionClosingDate() { return auctionClosingDate; }
	
	public AuctionInformation auctionClosingDate(String auctionClosingDate) {
	    this.auctionClosingDate = auctionClosingDate;
	    return this;
	}

	/**
	* The auction site URL.
	*/
	@SerializedName("auction_item_site")
	private String auctionItemSite;

	public String auctionItemSite() { return auctionItemSite; }
	
	public AuctionInformation auctionItemSite(String auctionItemSite) {
	    this.auctionItemSite = auctionItemSite;
	    return this;
	}

	/**
	* The name of the auction site.
	*/
	@SerializedName("auction_site")
	private String auctionSite;

	public String auctionSite() { return auctionSite; }
	
	public AuctionInformation auctionSite(String auctionSite) {
	    this.auctionSite = auctionSite;
	    return this;
	}
}
