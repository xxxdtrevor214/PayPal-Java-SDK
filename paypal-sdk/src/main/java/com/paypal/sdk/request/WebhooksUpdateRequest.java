// This class was generated on Fri, 26 May 2017 11:06:13 PDT by version 0.01 of Braintree SDK Generator
// WebhooksUpdate.java
// DO NOT EDIT
// @type request
// @json {"Name":"webhooks.update","Description":"Replaces webhook fields with new values. Pass a `json_patch` object with `replace` operation and `path`, which is `/url` for a URL or `/event_types` for events. The `value` is either the URL or a list of events.","Parameters":[{"Type":"string","VariableName":"webhook_id","Description":"The ID of the webhook to update.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":true,"Properties":null,"Location":"path"}],"RequestType":{"Type":"JSON Patch","VariableName":"body","Description":"A JSON patch request.","IsArray":true,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null},"SuccessResponseType":{"Type":"Webhook","VariableName":"","Description":"One or more webhook objects.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null},"DefaultResponseType":{"Type":"error","VariableName":"","Description":"Details about an error.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null},"HttpMethod":"PATCH","Path":"/v1/notifications/webhooks/{webhook_id}","Visible":true}

package com.paypal.sdk.request;

import com.braintreepayments.http.*;
import com.paypal.sdk.object.*;
import java.util.List;


/**
 * Replaces webhook fields with new values. Pass a `json_patch` object with `replace` operation and `path`, which is `/url` for a URL or `/event_types` for events. The `value` is either the URL or a list of events.
 */
public class WebhooksUpdateRequest extends HttpRequest<Webhook> {

    public WebhooksUpdateRequest() {
    	super("/v1/notifications/webhooks/{webhook_id}?", "PATCH", Webhook.class);
    }
    
    public WebhooksUpdateRequest webhookId(String webhookId) {
        path(path().replace("{webhook_id}", String.valueOf(webhookId)));
        return this;
    }
    
    public WebhooksUpdateRequest body(List<JSONPatch> body) {
        requestBody(body);
        return this;
    }
}