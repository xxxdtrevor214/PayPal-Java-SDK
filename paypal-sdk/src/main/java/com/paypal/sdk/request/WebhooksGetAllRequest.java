// This class was generated on Fri, 26 May 2017 11:06:13 PDT by version 0.01 of Braintree SDK Generator
// WebhooksGetAll.java
// DO NOT EDIT
// @type request
// @json {"Name":"webhooks.get-all","Description":"Lists all webhooks for an app.","Parameters":[{"Type":"string","VariableName":"anchor_type","Description":"Filters the response by an entity type, `anchor_id`. Value is `APPLICATION` or `ACCOUNT`. Default is `APPLICATION`.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null,"Location":"query"}],"RequestType":null,"SuccessResponseType":{"Type":"Webhook List","VariableName":"","Description":"List of webhooks.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null},"DefaultResponseType":{"Type":"error","VariableName":"","Description":"Details about an error.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null},"HttpMethod":"GET","Path":"/v1/notifications/webhooks","Visible":true}

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
    }
    
    public WebhooksGetAllRequest anchorType(String anchorType) {
		path(path() + "anchor_type=" + String.valueOf(anchorType) + "&");
        return this;
    }
}