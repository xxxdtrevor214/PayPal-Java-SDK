// This class was generated on Thu, 25 Jan 2018 12:44:28 CST by version 0.1.0-dev+20fb1e of Braintree SDK Generator
// PayOrderResponse.java
// @version 0.1.0-dev+20fb1e
// @type object
// @data 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
// DO NOT EDIT
package com.paypal.sdk.orders;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * A pay order response.
 */
@Model
public class PayOrderResponse {

    // Required default constructor
    public PayOrderResponse() {}

	/**
	* The date and time when the resource was created, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6).
	*/
	@SerializedName("create_time")
	private String createTime;

	public String createTime() { return createTime; }
	
	public PayOrderResponse createTime(String createTime) {
	    this.createTime = createTime;
	    return this;
	}

	/**
	* The intent.
	*/
	@SerializedName("intent")
	private String intent;

	public String intent() { return intent; }
	
	public PayOrderResponse intent(String intent) {
	    this.intent = intent;
	    return this;
	}

	/**
	* An array of request-related [HATEOAS links](/docs/api/overview/#hateoas-links).
	*/
	@SerializedName(value = "links", listClass = LinkDescriptionObject.class)
	private List<LinkDescriptionObject> links;

	public List<LinkDescriptionObject> links() { return links; }
	
	public PayOrderResponse links(List<LinkDescriptionObject> links) {
	    this.links = links;
	    return this;
	}

	/**
	* The ID of the order.
	*/
	@SerializedName("order_id")
	private String orderId;

	public String orderId() { return orderId; }
	
	public PayOrderResponse orderId(String orderId) {
	    this.orderId = orderId;
	    return this;
	}

	/**
	* The payer information.
	*/
	@SerializedName("payer_info")
	private PayerInformation payerInfo;

	public PayerInformation payerInfo() { return payerInfo; }
	
	public PayOrderResponse payerInfo(PayerInformation payerInfo) {
	    this.payerInfo = payerInfo;
	    return this;
	}

	/**
	* An array of purchase units. Each unit establishes a contract between a payer and payee.
	*/
	@SerializedName(value = "purchase_units", listClass = PurchaseUnit.class)
	private List<PurchaseUnit> purchaseUnits;

	public List<PurchaseUnit> purchaseUnits() { return purchaseUnits; }
	
	public PayOrderResponse purchaseUnits(List<PurchaseUnit> purchaseUnits) {
	    this.purchaseUnits = purchaseUnits;
	    return this;
	}

	/**
	* The status of the order.
	*/
	@SerializedName("status")
	private String status;

	public String status() { return status; }
	
	public PayOrderResponse status(String status) {
	    this.status = status;
	    return this;
	}

	/**
	* The date and time when the resource was last updated, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6).
	*/
	@SerializedName("update_time")
	private String updateTime;

	public String updateTime() { return updateTime; }
	
	public PayOrderResponse updateTime(String updateTime) {
	    this.updateTime = updateTime;
	    return this;
	}
}
