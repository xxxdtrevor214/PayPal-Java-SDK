// This class was generated on Wed, 31 May 2017 13:36:12 PDT by version 0.01 of Braintree SDK Generator
// AvailableEventTypeList.java
// DO NOT EDIT
// @type request
// @json {"Name":"available-event-type.list","Description":"Lists available events to which any webhook can subscribe. For a list of supported events, see [Webhook event names](/docs/integration/direct/webhooks/event-names/).","Parameters":[],"RequestType":null,"SuccessResponseType":{"Type":"EventTypeList","VariableName":"","Description":"List of webhook events.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null},"DefaultResponseType":{"Type":"error","VariableName":"","Description":"Details about an error.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null},"HttpMethod":"GET","Path":"/v1/notifications/webhooks-event-types","Visible":true}

package com.paypal.sdk.request;

import com.braintreepayments.http.HttpRequest;
import com.paypal.sdk.object.EventTypeList;


/**
 * Lists available events to which any webhook can subscribe. For a list of supported events, see [Webhook event names](/docs/integration/direct/webhooks/event-names/).
 */
public class AvailableEventTypeListRequest extends HttpRequest<EventTypeList> {

    public AvailableEventTypeListRequest() {
    	super("/v1/notifications/webhooks-event-types?", "GET", EventTypeList.class);
    }
    
}