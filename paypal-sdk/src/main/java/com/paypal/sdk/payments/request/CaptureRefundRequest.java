// This class was generated on Mon, 17 Jul 2017 10:51:10 PDT by version 0.01 of Braintree SDK Generator
// CaptureRefundRequest.java
// DO NOT EDIT
// @type request
// @json {"Name":"capture.refund","Description":"Refunds a captured payment, by ID. In the JSON request body, include an `amount` object.","Parameters":[{"Type":"string","VariableName":"capture_id","Description":"The ID of the captured payment to refund.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null,"Location":"path"}],"RequestType":{"Type":"Refund Request","VariableName":"body","Description":"A refund request.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},"ResponseType":{"Type":"Detailed Refund","VariableName":"","Description":"A refund transaction that is returned by `GET /refund`.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},"ContentType":"application/json","HttpMethod":"POST","Path":"/v1/payments/capture/{capture_id}/refund","ExpectedStatusCode":200}

package com.paypal.sdk.payments.request;

import com.braintreepayments.http.*;
import com.paypal.sdk.payments.object.*;
import java.util.List;


/**
 * Refunds a captured payment, by ID. In the JSON request body, include an `amount` object.
 */
public class CaptureRefundRequest extends HttpRequest<DetailedRefund> {

    public CaptureRefundRequest(String captureId) {
        super("/v1/payments/capture/{capture_id}/refund?"
            .replace("{capture_id}", String.valueOf(captureId)), "POST", DetailedRefund.class);
    }

    public CaptureRefundRequest requestBody(RefundRequest body) {
        super.body(body);
        header("Content-Type", "application/json");
        return this;
    }
}
