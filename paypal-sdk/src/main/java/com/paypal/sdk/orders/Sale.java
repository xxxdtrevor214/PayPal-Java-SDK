// This class was generated on Thu, 25 Jan 2018 12:44:28 CST by version 0.1.0-dev+20fb1e of Braintree SDK Generator
// Sale.java
// @version 0.1.0-dev+20fb1e
// @type object
// @data H4sIAAAAAAAC/+xZX3PbNgx/36fAuXtocrKULv2bt9y6XXPrmlyS7iXLxbAIWVwoUiWhOL5dv/uOoiRHltsla+brg598BEEKwA/8EYT/Hp0vShodjM5Q0Sga/YFW4lTRByy8dBSNfqPFcvCWXGplydLo0cHoEBwqAraoHaZeGI+i0aG1uAi77kWjU0JxrNVidJChcuQFnyppSXSCE2tKsizJjQ4uOnsOC1NpHlqErXxpVyfqW3eeE5S4KEgzBJUI5pJzEMQolXs8Wx1bqWdDW9PKWtLpomftHeHQ3gvOLdE4zdFiymTh6Ox4/PynZ6+gXQapEXT5NBEmdYnUTDOLfoNESEspJ5YcJ63y2Cu7ZCeGE1ycoAJhyIE2DK4qS2MZUKl2a0kPCwnbaiUiulLqc9SF5aQJfoAS3oawD8MkuolllJayYZBQCOmH3p+gBjg1FQMPEP//MZ7JjK/mFsue+XelQwf8LPhZyIhi+B1vZVEVoEjPOAfp4NkedCngIpjnMs1B6lRVgtzBn9Xe3n5aqfqXwkjJMDqjG9Ig5EyygyllxlIdFkGpLFBBaaTmOKxJ2kX9Lc4fqD437fcw8yl7z88lrQPfCNFK0n0Jpxy1UFLPrjKiHlQrE0O0WoUtWN7kwBskIDNhdcMs7bkriHMjwGi1iDeDrNSusqjTPqx3pUNMu9ktqD1QPWxfR3ZDoLpclmWYWWJ6RziEtJ3cIroxTm1DfiWkSwdl2brZr8MGreb2RH5/NOuqKRtG1cd4KVwDbTPZ1GKdK5KpcDEcZfXI0qeKHHdQgpK60YmAc+mgDMYufBbs7trGl93d7SnfCPCMtz3Mw3gIN+PtFpFHQOTyPpgMTuKXj2HvDHooZiSATftaIoLpohvYGH41FixllRYuAkulJUeaXa3S7MI58p31jXa7qbFyJnUgK7/hNie+9U19n5RILSHTFcuiXwj35cP0EMgEqAV4DZjnpBtadqayKcEcHYQ9RARSw8WRZrKaeGVlZmyBfPk0Zy7dQZKwMcrFkjiLjZ0lORcqsVm6v7//5omjuls0fhG/3NnUK0H0nwdibTCO3oIJ19Jjd7ZWzHwv9TXc+T4cT/+idE2/S0l93W+NtJKVXpwG9OZ5+5srdWxJedjg4t3h+S/Hh2dQL22bR1jKxNyQvZE0T57kyGTQjWuVVVBePn7fJLeU9d/hQTDEJDVFqYj9BWNnxPDx9H0M5wYKvKYmVYObKSoVefWpryD8TFMl1V2/upTw3oUs/nh6BExF6ZfeN3dfvni1txPDUSCq+guTHycRTJ5OovogTHYmd4itLnhKS+PSmpSck3oWg/do4n2deCL0W1zTAlqAvK9GU0uxNRiAXQiCj8Ef9PWV80h7WkelNnSQQkx70HWiIXjvzs9PWhjays3fE2vB25AHlvpXZxivacb68AcD/QnlRUn/miIv3rx+3dHb8532bnNkb8gBOkDtScZnBtbwBqArjcVUzipTObUAUZsypZAfjgrULFPXUpNfFsMZEVzUNHLaWOiW1s3n81iixto2dE7OtH82uMSvHbcurQ7jW+/G4zDyfa4sx8hVn9w60ZrnRD21IX7+edmlXy29lt8c9BKHc0M3puho2c03Ne2HfFAKMqlRpxIV3KCqqGPwTJISLtRmdIueDSKYokKdUtQ9CkVFgYecgcf8L2b7/8aD+KWGrheTVrLmv4zmj6mq9Ky4+2H3y7WmoxItsrGR5xFBmdQkQkXWBPGhYete5Fj6N7aV/i7sARFvqHitSrG2eO3L/1vxqtAxhI2+4wr28vMP/wAAAP//
// DO NOT EDIT
package com.paypal.sdk.orders;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * A sale transaction.
 */
@Model
public class Sale {

    // Required default constructor
    public Sale() {}

	/**
	* The payment amount, with details.
	*/
	@SerializedName("amount")
	private Amount amount;

	public Amount amount() { return amount; }
	
	public Sale amount(Amount amount) {
	    this.amount = amount;
	    return this;
	}

	/**
	* The date and time when the resource was created, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6).
	*/
	@SerializedName("create_time")
	private String createTime;

	public String createTime() { return createTime; }
	
	public Sale createTime(String createTime) {
	    this.createTime = createTime;
	    return this;
	}

	/**
	* The ID of the sale transaction.
	*/
	@SerializedName("id")
	private String id;

	public String id() { return id; }
	
	public Sale id(String id) {
	    this.id = id;
	    return this;
	}

	/**
	* An array of request-related [HATEOAS links](/docs/api/overview/#hateoas-links).
	*/
	@SerializedName(value = "links", listClass = LinkDescriptionObject.class)
	private List<LinkDescriptionObject> links;

	public List<LinkDescriptionObject> links() { return links; }
	
	public Sale links(List<LinkDescriptionObject> links) {
	    this.links = links;
	    return this;
	}

	/**
	* The status of the sale transaction.
	*/
	@SerializedName("status")
	private String status;

	public String status() { return status; }
	
	public Sale status(String status) {
	    this.status = status;
	    return this;
	}

	/**
	* The base currency object for all financial value-related fields. For example, balance, payment due, and so on.
	*/
	@SerializedName("transaction_fee")
	private Currency transactionFee;

	public Currency transactionFee() { return transactionFee; }
	
	public Sale transactionFee(Currency transactionFee) {
	    this.transactionFee = transactionFee;
	    return this;
	}

	/**
	* The date and time when the resource was last updated, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6).
	*/
	@SerializedName("update_time")
	private String updateTime;

	public String updateTime() { return updateTime; }
	
	public Sale updateTime(String updateTime) {
	    this.updateTime = updateTime;
	    return this;
	}
}
