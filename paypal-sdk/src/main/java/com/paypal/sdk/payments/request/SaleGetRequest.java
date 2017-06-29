// This class was generated on Mon, 03 Jul 2017 13:56:47 PDT by version 0.01 of Braintree SDK Generator
// SaleGetRequest.java
// DO NOT EDIT
// @type request
// @json {"Name":"sale.get","Description":"Shows details for a sale, by ID. Returns only sales that were created through the REST API.","Parameters":[{"Type":"string","VariableName":"sale_id","Description":"The ID of the sale for which to show details.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null,"Location":"path"}],"RequestType":null,"ResponseType":{"Type":"Sale","VariableName":"","Description":"A sale transaction. Returned as a part of payment-related resources.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},"ContentType":"application/json","HttpMethod":"GET","Path":"/v1/payments/sale/{sale_id}","ExpectedStatusCode":200}

package com.paypal.sdk.payments.request;

import com.braintreepayments.http.*;
import com.paypal.sdk.payments.object.*;
import java.util.List;


/**
 * Shows details for a sale, by ID. Returns only sales that were created through the REST API.
 */
public class SaleGetRequest extends HttpRequest<Sale> {

		public SaleGetRequest(String saleId) {
				super("/v1/payments/sale/{sale_id}?"
                    .replace("{sale_id}", String.valueOf(saleId)), "GET", Sale.class);
		}
}
