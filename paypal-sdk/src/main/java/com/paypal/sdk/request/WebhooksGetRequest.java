// This class was generated on Fri, 02 Jun 2017 16:03:13 PDT by version 0.01 of Braintree SDK Generator
// WebhooksGetRequest.java
// DO NOT EDIT
// @type request
// @json {"Name":"webhooks.get","Description":"Shows details for a webhook, by ID.","Parameters":[{"Type":"string","VariableName":"webhook_id","Description":"The ID of the webhook for which to show details.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":true,"Properties":null,"Location":"path"}],"RequestType":null,"ResponseType":{"Type":"Webhook","VariableName":"","Description":"One or more webhook objects.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null},"HttpMethod":"GET","Path":"/v1/notifications/webhooks/{webhook_id}","Visible":true,"ExpectedStatusCode":200}

package com.paypal.sdk.request;

import com.braintreepayments.http.*;
import com.paypal.sdk.object.*;
import java.util.List;


/**
 * Shows details for a webhook, by ID.
 */
public class WebhooksGetRequest extends HttpRequest<Webhook> {

    public WebhooksGetRequest() {
    	super("/v1/notifications/webhooks/{webhook_id}?", "GET", Webhook.class);
    }
    
    public WebhooksGetRequest webhookId(String webhookId) {
        path(path().replace("{webhook_id}", String.valueOf(webhookId)));
        return this;
    }
}