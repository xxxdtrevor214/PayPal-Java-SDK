// This class was generated on Mon, 05 Jun 2017 14:29:09 PDT by version 0.01 of Braintree SDK Generator
// WebhooksGetAllRequest.java
// DO NOT EDIT
// @type request
// @json {"Name":"webhooks.get-all","Description":"Lists all webhooks for an app.","Parameters":[{"Type":"string","VariableName":"anchor_type","Description":"Filters the response by an entity type, `anchor_id`. Value is `APPLICATION` or `ACCOUNT`. Default is `APPLICATION`.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null,"Location":"query"}],"RequestType":null,"ResponseType":{"Type":"WebhookList","VariableName":"","Description":"List of webhooks.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null},"ContentType":"application/json","HttpMethod":"GET","Path":"/v1/notifications/webhooks","Visible":true,"ExpectedStatusCode":200}

package com.paypal.sdk.request;

import com.braintreepayments.http.*;
import com.paypal.sdk.object.*;
import java.util.List;


/**
 * Lists all webhooks for an app.
 */
public class WebhooksGetAllRequest extends HttpRequest<WebhookList> {

    public WebhooksGetAllRequest() {
    	super("/v1/notifications/webhooks?", "GET", WebhookList.class);
    	header("Content-Type", "application/json");
    }
    
    public WebhooksGetAllRequest anchorType(String anchorType) {
		path(path() + "anchor_type=" + String.valueOf(anchorType) + "&");
        return this;
    }
}