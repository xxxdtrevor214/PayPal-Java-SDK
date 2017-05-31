// This class was generated on Wed, 31 May 2017 13:36:12 PDT by version 0.01 of Braintree SDK Generator
// EventGet.java
// DO NOT EDIT
// @type request
// @json {"Name":"event.get","Description":"Shows details for a webhook event notification, by ID.","Parameters":[{"Type":"string","VariableName":"event_id","Description":"The ID of the webhook event notification for which to show details.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":true,"Properties":null,"Location":"path"}],"RequestType":null,"SuccessResponseType":{"Type":"Event","VariableName":"","Description":"A webhook event notification.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null},"DefaultResponseType":{"Type":"error","VariableName":"","Description":"Details about an error.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null},"HttpMethod":"GET","Path":"/v1/notifications/webhooks-events/{event_id}","Visible":true}

package com.paypal.sdk.request;

import com.braintreepayments.http.HttpRequest;
import com.paypal.sdk.object.Event;


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