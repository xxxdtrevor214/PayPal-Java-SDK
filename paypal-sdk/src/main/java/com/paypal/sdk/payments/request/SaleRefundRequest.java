// This class was generated on Mon, 17 Jul 2017 10:51:10 PDT by version 0.01 of Braintree SDK Generator
// SaleRefundRequest.java
// DO NOT EDIT
// @type request
// @json {"Name":"sale.refund","Description":"Refunds a sale, by ID. For a full refund, include an empty payload in the JSON request body. For a partial refund, include an `amount` object in the JSON request body.","Parameters":[{"Type":"string","VariableName":"sale_id","Description":"The ID of the sale transaction to refund.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null,"Location":"path"}],"RequestType":{"Type":"Refund Request","VariableName":"body","Description":"A refund request.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},"ResponseType":{"Type":"Detailed Refund","VariableName":"","Description":"A refund transaction that is returned by `GET /refund`.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},"ContentType":"application/json","HttpMethod":"POST","Path":"/v1/payments/sale/{sale_id}/refund","ExpectedStatusCode":200}

package com.paypal.sdk.payments.request;

import com.braintreepayments.http.*;
import com.paypal.sdk.payments.object.*;
import java.util.List;


/**
 * Refunds a sale, by ID. For a full refund, include an empty payload in the JSON request body. For a partial refund, include an `amount` object in the JSON request body.
 */
public class SaleRefundRequest extends HttpRequest<DetailedRefund> {

    public SaleRefundRequest(String saleId) {
        super("/v1/payments/sale/{sale_id}/refund?"
            .replace("{sale_id}", String.valueOf(saleId)), "POST", DetailedRefund.class);
    }

    public SaleRefundRequest requestBody(RefundRequest body) {
        super.body(body);
        header("Content-Type", "application/json");
        return this;
    }
}
