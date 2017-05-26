// This class was generated on Fri, 26 May 2017 11:06:13 PDT by version 0.01 of Braintree SDK Generator
// EventList.java
// DO NOT EDIT
// @type request
// @json {"Name":"event.list","Description":"Lists webhook event notifications. Use query parameters to filter the response.","Parameters":[{"Type":"string","VariableName":"end_time","Description":"Filters the webhook event notifications in the response to those created on or after the `start_time` and on or before this date and time. Both values are in [RFC 3339 Section 5.6](http://tools.ietf.org/html/rfc3339#section-5.6) format. Example: `end_time=2013-03-06T11:00:00Z`.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null,"Location":"query"},{"Type":"string","VariableName":"event_type","Description":"Filters the response to a single event.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null,"Location":"query"},{"Type":"integer","VariableName":"page_size","Description":"The number of webhook event notifications to return in the response.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null,"Location":"query"},{"Type":"string","VariableName":"start_time","Description":"Filters the webhook event notifications in the response to those created on or after this date and time and on or before the `end_time` value. Both values are in [RFC 3339 Section 5.6](http://tools.ietf.org/html/rfc3339#section-5.6) format. Example: `start_time=2013-03-06T11:00:00Z`.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null,"Location":"query"},{"Type":"string","VariableName":"transaction_id","Description":"Filters the response to a single transaction, by ID.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null,"Location":"query"}],"RequestType":null,"SuccessResponseType":{"Type":"Webhook Event List","VariableName":"","Description":"List of webhooks events.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null},"DefaultResponseType":{"Type":"error","VariableName":"","Description":"Details about an error.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null},"HttpMethod":"GET","Path":"/v1/notifications/webhooks-events","Visible":true}

package com.paypal.sdk.request;

import com.braintreepayments.http.*;
import com.paypal.sdk.object.*;
import java.util.List;


/**
 * Lists webhook event notifications. Use query parameters to filter the response.
 */
public class EventListRequest extends HttpRequest<WebhookEventList> {

    public EventListRequest() {
    	super("/v1/notifications/webhooks-events?", "GET", WebhookEventList.class);
    }
    
    public EventListRequest endTime(String endTime) {
		path(path() + "end_time=" + String.valueOf(endTime) + "&");
        return this;
    }
    public EventListRequest eventType(String eventType) {
		path(path() + "event_type=" + String.valueOf(eventType) + "&");
        return this;
    }
    public EventListRequest pageSize(int pageSize) {
		path(path() + "page_size=" + String.valueOf(pageSize) + "&");
        return this;
    }
    public EventListRequest startTime(String startTime) {
		path(path() + "start_time=" + String.valueOf(startTime) + "&");
        return this;
    }
    public EventListRequest transactionId(String transactionId) {
		path(path() + "transaction_id=" + String.valueOf(transactionId) + "&");
        return this;
    }
}