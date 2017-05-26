// This class was generated on Fri, 26 May 2017 11:06:13 PDT by version 0.01 of Braintree SDK Generator
// WebhooksDelete.java
// DO NOT EDIT
// @type request
// @json {"Name":"webhooks.delete","Description":"Deletes a webhook, by ID.","Parameters":[{"Type":"string","VariableName":"webhook_id","Description":"The ID of the webhook to delete.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":true,"Properties":null,"Location":"path"}],"RequestType":null,"SuccessResponseType":null,"DefaultResponseType":{"Type":"error","VariableName":"","Description":"Details about an error.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null},"HttpMethod":"DELETE","Path":"/v1/notifications/webhooks/{webhook_id}","Visible":true}

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
    }
    
    public WebhooksDeleteRequest webhookId(String webhookId) {
        path(path().replace("{webhook_id}", String.valueOf(webhookId)));
        return this;
    }
}