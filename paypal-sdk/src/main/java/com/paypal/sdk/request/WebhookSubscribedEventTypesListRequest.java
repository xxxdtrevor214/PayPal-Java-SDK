// This class was generated on Fri, 02 Jun 2017 16:03:13 PDT by version 0.01 of Braintree SDK Generator
// WebhookSubscribedEventTypesListRequest.java
// DO NOT EDIT
// @type request
// @json {"Name":"webhook.subscribed-event-types.list","Description":"Lists event subscriptions for a webhook, by ID.","Parameters":[{"Type":"string","VariableName":"webhook_id","Description":"The ID of the webhook for which to list subscriptions.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":true,"Properties":null,"Location":"path"}],"RequestType":null,"ResponseType":{"Type":"EventTypeList","VariableName":"","Description":"List of webhook events.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null},"HttpMethod":"GET","Path":"/v1/notifications/webhooks/{webhook_id}/event-types","Visible":true,"ExpectedStatusCode":200}

package com.paypal.sdk.request;

import com.braintreepayments.http.*;
import com.paypal.sdk.object.*;
import java.util.List;


/**
 * Lists event subscriptions for a webhook, by ID.
 */
public class WebhookSubscribedEventTypesListRequest extends HttpRequest<EventTypeList> {

    public WebhookSubscribedEventTypesListRequest() {
    	super("/v1/notifications/webhooks/{webhook_id}/event-types?", "GET", EventTypeList.class);
    }
    
    public WebhookSubscribedEventTypesListRequest webhookId(String webhookId) {
        path(path().replace("{webhook_id}", String.valueOf(webhookId)));
        return this;
    }
}