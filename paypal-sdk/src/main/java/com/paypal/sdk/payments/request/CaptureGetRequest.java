// This class was generated on Mon, 03 Jul 2017 13:56:47 PDT by version 0.01 of Braintree SDK Generator
// CaptureGetRequest.java
// DO NOT EDIT
// @type request
// @json {"Name":"capture.get","Description":"Shows details for a captured payment, by ID.","Parameters":[{"Type":"string","VariableName":"capture_id","Description":"The ID of the captured payment for which to show details.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null,"Location":"path"}],"RequestType":null,"ResponseType":{"Type":"Capture","VariableName":"","Description":"A capture transaction.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},"ContentType":"application/json","HttpMethod":"GET","Path":"/v1/payments/capture/{capture_id}","ExpectedStatusCode":200}

package com.paypal.sdk.payments.request;

import com.braintreepayments.http.*;
import com.paypal.sdk.payments.object.*;
import java.util.List;


/**
 * Shows details for a captured payment, by ID.
 */
public class CaptureGetRequest extends HttpRequest<Capture> {

		public CaptureGetRequest(String captureId) {
				super("/v1/payments/capture/{capture_id}?"
                    .replace("{capture_id}", String.valueOf(captureId)), "GET", Capture.class);
		}
}
