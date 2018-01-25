// This class was generated on Thu, 25 Jan 2018 12:44:28 CST by version 0.1.0-dev+20fb1e of Braintree SDK Generator
// Order.java
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
 * An order.
 */
@Model
public class Order {

    // Required default constructor
    public Order() {}

	/**
	* The application context experience information.
	*/
	@SerializedName("application_context")
	private ApplicationContext applicationContext;

	public ApplicationContext applicationContext() { return applicationContext; }
	
	public Order applicationContext(ApplicationContext applicationContext) {
	    this.applicationContext = applicationContext;
	    return this;
	}

	/**
	* The date and time when the resource was created, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6).
	*/
	@SerializedName("create_time")
	private String createTime;

	public String createTime() { return createTime; }
	
	public Order createTime(String createTime) {
	    this.createTime = createTime;
	    return this;
	}

	/**
	* The ID of the order.
	*/
	@SerializedName("id")
	private String id;

	public String id() { return id; }
	
	public Order id(String id) {
	    this.id = id;
	    return this;
	}

	/**
	* The intent.
	*/
	@SerializedName("intent")
	private String intent;

	public String intent() { return intent; }
	
	public Order intent(String intent) {
	    this.intent = intent;
	    return this;
	}

	/**
	* An array of request-related [HATEOAS links](/docs/api/overview/#hateoas-links). To complete the buyer approval, use the `approval_url` link with the `GET` method and do not use the link that shows the `REDIRECT` method.
	*/
	@SerializedName(value = "links", listClass = LinkDescriptionObject.class)
	private List<LinkDescriptionObject> links;

	public List<LinkDescriptionObject> links() { return links; }
	
	public Order links(List<LinkDescriptionObject> links) {
	    this.links = links;
	    return this;
	}

	/**
	* Metadata.
	*/
	@SerializedName("metadata")
	private Metadata metadata;

	public Metadata metadata() { return metadata; }
	
	public Order metadata(Metadata metadata) {
	    this.metadata = metadata;
	    return this;
	}

	/**
	* The payer information.
	*/
	@SerializedName("payer_info")
	private PayerInformation payerInfo;

	public PayerInformation payerInfo() { return payerInfo; }
	
	public Order payerInfo(PayerInformation payerInfo) {
	    this.payerInfo = payerInfo;
	    return this;
	}

	/**
	* The payment details for the order.
	*/
	@SerializedName("payment_details")
	private PaymentDetails paymentDetails;

	public PaymentDetails paymentDetails() { return paymentDetails; }
	
	public Order paymentDetails(PaymentDetails paymentDetails) {
	    this.paymentDetails = paymentDetails;
	    return this;
	}

	/**
	* REQUIRED
	* An array of purchase units. Each purchase unit establishes a contract between the payer and payee.
	*/
	@SerializedName(value = "purchase_units", listClass = PurchaseUnit.class)
	private List<PurchaseUnit> purchaseUnits;

	public List<PurchaseUnit> purchaseUnits() { return purchaseUnits; }
	
	public Order purchaseUnits(List<PurchaseUnit> purchaseUnits) {
	    this.purchaseUnits = purchaseUnits;
	    return this;
	}

	/**
	* REQUIRED
	* The redirect URLs. Required only for the PayPal payment method. The supported settings are return and cancel URLs.
	*/
	@SerializedName("redirect_urls")
	private RedirectUrls redirectUrls;

	public RedirectUrls redirectUrls() { return redirectUrls; }
	
	public Order redirectUrls(RedirectUrls redirectUrls) {
	    this.redirectUrls = redirectUrls;
	    return this;
	}

	/**
	* The status of the order. After the customer approves the order, the status is `APPROVED`. After the payment is made for the order and the order completes, the status is `COMPLETED`.
	*/
	@SerializedName("status")
	private String status;

	public String status() { return status; }
	
	public Order status(String status) {
	    this.status = status;
	    return this;
	}

	/**
	* The date and time when the resource was last updated, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6).
	*/
	@SerializedName("update_time")
	private String updateTime;

	public String updateTime() { return updateTime; }
	
	public Order updateTime(String updateTime) {
	    this.updateTime = updateTime;
	    return this;
	}
}
