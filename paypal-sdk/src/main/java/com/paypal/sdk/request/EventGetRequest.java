// This class was generated on Fri, 02 Jun 2017 16:03:13 PDT by version 0.01 of Braintree SDK Generator
// EventGetRequest.java
// DO NOT EDIT
// @type request
// @json {"Name":"event.get","Description":"Shows details for a webhook event notification, by ID.","Parameters":[{"Type":"string","VariableName":"event_id","Description":"The ID of the webhook event notification for which to show details.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":true,"Properties":null,"Location":"path"}],"RequestType":null,"ResponseType":{"Type":"Event","VariableName":"","Description":"A webhook event notification.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null},"HttpMethod":"GET","Path":"/v1/notifications/webhooks-events/{event_id}","Visible":true,"ExpectedStatusCode":200}

package com.paypal.sdk.request;

import com.braintreepayments.http.*;
import com.paypal.sdk.object.*;
import java.util.List;


/**
 * Shows details for a webhook event notification, by ID.
 */
public class EventGetRequest extends HttpRequest<Event> {

    public EventGetRequest() {
    	super("/v1/notifications/webhooks-events/{event_id}?", "GET", Event.class);
    }
    
    public EventGetRequest eventId(String eventId) {
        path(path().replace("{event_id}", String.valueOf(eventId)));
        return this;
    }
}