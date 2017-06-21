// This class was generated on Wed, 21 Jun 2017 14:20:42 PDT by version 0.01 of Braintree SDK Generator
// WebhooksDeleteRequest.java
// DO NOT EDIT
// @type request
// @json {"Name":"webhooks.delete","Description":"Deletes a webhook, by ID.","Parameters":[{"Type":"string","VariableName":"webhook_id","Description":"The ID of the webhook to delete.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":true,"Properties":null,"Location":"path"}],"RequestType":null,"ResponseType":null,"ContentType":"application/json","HttpMethod":"DELETE","Path":"/v1/notifications/webhooks/{webhook_id}","Visible":true,"ExpectedStatusCode":200}

package com.paypal.sdk.request;

import com.braintreepayments.http.*;
import com.paypal.sdk.object.*;
import java.util.List;


/**
 * Deletes a webhook, by ID.
 */
public class WebhooksDeleteRequest extends HttpRequest<Void> {

    public WebhooksDeleteRequest() {
    	super("/v1/notifications/webhooks/{webhook_id}?", "DELETE", Void.class);
    	header("Content-Type", "application/json");
    }
    
    public WebhooksDeleteRequest webhookId(String webhookId) {
        path(path().replace("{webhook_id}", String.valueOf(webhookId)));
        return this;
    }
}