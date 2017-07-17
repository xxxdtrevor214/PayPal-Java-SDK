// This class was generated on Mon, 17 Jul 2017 10:51:10 PDT by version 0.01 of Braintree SDK Generator
// RelatedResources.java
// DO NOT EDIT
// @type object
// @json {"Type":"Related Resources","VariableName":"","Description":"The financial transactions that are related to the payment. The related resources include sales, authorizations, captures, and refunds. To get information about a resource, use the ID returned for that resource. For example, to [show details for a related authorization](/docs/api/payments/#authorization_get), use the ID returned in the `authorization` object. You can also use the [HATEOAS links](/docs/api/hateoas-links/) for a related resource to complete operations for that resource. For example, a `sale` object provides a `refund` link that enables you to refund the sale.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":[{"Type":"Authorization","VariableName":"authorization","Description":"An authorization.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Capture","VariableName":"capture","Description":"A capture transaction.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Order","VariableName":"order","Description":"An order transaction.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Refund","VariableName":"refund","Description":"A refund transaction.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Sale","VariableName":"sale","Description":"A sale transaction. Returned as a part of payment-related resources.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.payments.object;

import java.util.Map;
import java.util.List;
import com.google.gson.annotations.SerializedName;
/**
 * The financial transactions that are related to the payment. The related resources include sales, authorizations, captures, and refunds. To get information about a resource, use the ID returned for that resource. For example, to [show details for a related authorization](/docs/api/payments/#authorization_get), use the ID returned in the `authorization` object. You can also use the [HATEOAS links](/docs/api/hateoas-links/) for a related resource to complete operations for that resource. For example, a `sale` object provides a `refund` link that enables you to refund the sale.
 */
public class RelatedResources {

	/**
	* An authorization.
	*/
	@SerializedName("authorization")
	private Authorization authorization;

	public Authorization authorization() { return authorization; }
	
	public RelatedResources authorization(Authorization authorization) {
	    this.authorization = authorization;
	    return this;
	}

	/**
	* A capture transaction.
	*/
	@SerializedName("capture")
	private Capture capture;

	public Capture capture() { return capture; }
	
	public RelatedResources capture(Capture capture) {
	    this.capture = capture;
	    return this;
	}

	/**
	* An order transaction.
	*/
	@SerializedName("order")
	private Order order;

	public Order order() { return order; }
	
	public RelatedResources order(Order order) {
	    this.order = order;
	    return this;
	}

	/**
	* A refund transaction.
	*/
	@SerializedName("refund")
	private Refund refund;

	public Refund refund() { return refund; }
	
	public RelatedResources refund(Refund refund) {
	    this.refund = refund;
	    return this;
	}

	/**
	* A sale transaction. Returned as a part of payment-related resources.
	*/
	@SerializedName("sale")
	private Sale sale;

	public Sale sale() { return sale; }
	
	public RelatedResources sale(Sale sale) {
	    this.sale = sale;
	    return this;
	}
}
