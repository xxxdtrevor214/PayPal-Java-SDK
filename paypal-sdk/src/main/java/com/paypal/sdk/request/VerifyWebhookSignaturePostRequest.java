// This class was generated on Wed, 31 May 2017 13:36:12 PDT by version 0.01 of Braintree SDK Generator
// VerifyWebhookSignaturePost.java
// DO NOT EDIT
// @type request
// @json {"Name":"verify.webhook.signature.post","Description":"Verifies a webhook signature.","Parameters":[],"RequestType":{"Type":"Verify Webhook Signature","VariableName":"body","Description":"Verify the webhook signature.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null},"SuccessResponseType":{"Type":"Verify Webhook Signature Response","VariableName":"","Description":"The verify webhook signature response.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null},"DefaultResponseType":{"Type":"error","VariableName":"","Description":"Details about an error.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null},"HttpMethod":"POST","Path":"/v1/notifications/verify-webhook-signature","Visible":true}

package com.paypal.sdk.request;

import com.braintreepayments.http.HttpRequest;
import com.paypal.sdk.object.VerifyWebhookSignature;
import com.paypal.sdk.object.VerifyWebhookSignatureResponse;


/**
 * Verifies a webhook signature.
 */
public class VerifyWebhookSignaturePostRequest extends HttpRequest<VerifyWebhookSignatureResponse> {

    public VerifyWebhookSignaturePostRequest() {
    	super("/v1/notifications/verify-webhook-signature?", "POST", VerifyWebhookSignatureResponse.class);
    }
    
    
    public VerifyWebhookSignaturePostRequest body(VerifyWebhookSignature body) {
        requestBody(body);
        return this;
    }
}