// This class was generated on Mon, 31 Jul 2017 18:27:14 UTC by version 0.1 of Braintree SDK Generator
// RelatedResources.java
// DO NOT EDIT
// @type object
// @json {"Type":"Related Resources","VariableName":"","Description":"The financial transactions that are related to the payment. The related resources include sales, authorizations, captures, and refunds. To get information about a resource, use the ID returned for that resource. For example, to [show details for a related authorization](/docs/api/payments/#authorization_get), use the ID returned in the `authorization` object. You can also use the [HATEOAS links](/docs/api/hateoas-links/) for a related resource to complete operations for that resource. For example, a `sale` object provides a `refund` link that enables you to refund the sale.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":[{"Type":"Authorization","VariableName":"authorization","Description":"An authorization.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Capture","VariableName":"capture","Description":"A capture transaction.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Order","VariableName":"order","Description":"An order transaction.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Refund","VariableName":"refund","Description":"A refund transaction.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Sale","VariableName":"sale","Description":"A sale transaction. Returned as a part of payment-related resources.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.payments.object;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.serializer.Serializable;
import com.braintreepayments.http.serializer.Deserializable;

/**
 * The financial transactions that are related to the payment. The related resources include sales, authorizations, captures, and refunds. To get information about a resource, use the ID returned for that resource. For example, to [show details for a related authorization](/docs/api/payments/#authorization_get), use the ID returned in the `authorization` object. You can also use the [HATEOAS links](/docs/api/hateoas-links/) for a related resource to complete operations for that resource. For example, a `sale` object provides a `refund` link that enables you to refund the sale.
 */
public class RelatedResources implements Serializable, Deserializable {

    // Required default constructor
    public RelatedResources() {}

	/**
	* An authorization.
	*/
	private Authorization authorization;

	public Authorization authorization() { return authorization; }
	
	public RelatedResources authorization(Authorization authorization) {
	    this.authorization = authorization;
	    return this;
	}

	/**
	* A capture transaction.
	*/
	private Capture capture;

	public Capture capture() { return capture; }
	
	public RelatedResources capture(Capture capture) {
	    this.capture = capture;
	    return this;
	}

	/**
	* An order transaction.
	*/
	private Order order;

	public Order order() { return order; }
	
	public RelatedResources order(Order order) {
	    this.order = order;
	    return this;
	}

	/**
	* A refund transaction.
	*/
	private Refund refund;

	public Refund refund() { return refund; }
	
	public RelatedResources refund(Refund refund) {
	    this.refund = refund;
	    return this;
	}

	/**
	* A sale transaction. Returned as a part of payment-related resources.
	*/
	private Sale sale;

	public Sale sale() { return sale; }
	
	public RelatedResources sale(Sale sale) {
	    this.sale = sale;
	    return this;
	}

    @Override
    public void serialize(Map<String, Object> serialized) {
        if (authorization != null) {
            serialized.put("authorization", this.authorization);
        }
        if (capture != null) {
            serialized.put("capture", this.capture);
        }
        if (order != null) {
            serialized.put("order", this.order);
        }
        if (refund != null) {
            serialized.put("refund", this.refund);
        }
        if (sale != null) {
            serialized.put("sale", this.sale);
        }
    }

    @Override
    public void deserialize(Map<String, Object> values) {
        if (values.containsKey("authorization")) {
            this.authorization = new Authorization();
            this.authorization.deserialize((Map<String, Object>) values.get("authorization"));
        }
        if (values.containsKey("capture")) {
            this.capture = new Capture();
            this.capture.deserialize((Map<String, Object>) values.get("capture"));
        }
        if (values.containsKey("order")) {
            this.order = new Order();
            this.order.deserialize((Map<String, Object>) values.get("order"));
        }
        if (values.containsKey("refund")) {
            this.refund = new Refund();
            this.refund.deserialize((Map<String, Object>) values.get("refund"));
        }
        if (values.containsKey("sale")) {
            this.sale = new Sale();
            this.sale.deserialize((Map<String, Object>) values.get("sale"));
        }
    }
}

