// This class was generated on Mon, 03 Jul 2017 13:56:47 PDT by version 0.01 of Braintree SDK Generator
// RefundGetRequest.java
// DO NOT EDIT
// @type request
// @json {"Name":"refund.get","Description":"Shows details for a refund, by ID.","Parameters":[{"Type":"string","VariableName":"refund_id","Description":"The ID of the refund for which to show details.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null,"Location":"path"}],"RequestType":null,"ResponseType":{"Type":"Refund","VariableName":"","Description":"A refund transaction.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},"ContentType":"application/json","HttpMethod":"GET","Path":"/v1/payments/refund/{refund_id}","ExpectedStatusCode":200}

package com.paypal.sdk.payments.request;

import com.braintreepayments.http.*;
import com.paypal.sdk.payments.object.*;
import java.util.List;


/**
 * Shows details for a refund, by ID.
 */
public class RefundGetRequest extends HttpRequest<Refund> {

		public RefundGetRequest(String refundId) {
				super("/v1/payments/refund/{refund_id}?"
                    .replace("{refund_id}", String.valueOf(refundId)), "GET", Refund.class);
		}
}
