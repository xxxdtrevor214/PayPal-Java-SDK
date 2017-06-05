// This class was generated on Mon, 05 Jun 2017 14:29:09 PDT by version 0.01 of Braintree SDK Generator
// SimulateEventRequest.java
// DO NOT EDIT
// @type request
// @json {"Name":"simulate.event","Description":"Simulates a webhook event. Specify a sample payload.","Parameters":[],"RequestType":{"Type":"Simulate Event","VariableName":"body","Description":"Uses a sample payload to simulate a mock webhook event.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null},"ResponseType":{"Type":"Event","VariableName":"","Description":"A webhook event notification.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null},"ContentType":"application/json","HttpMethod":"POST","Path":"/v1/notifications/simulate-event","Visible":true,"ExpectedStatusCode":200}

package com.paypal.sdk.request;

import com.braintreepayments.http.*;
import com.paypal.sdk.object.*;
import java.util.List;


/**
 * Simulates a webhook event. Specify a sample payload.
 */
public class SimulateEventRequest extends HttpRequest<Event> {

    public SimulateEventRequest() {
    	super("/v1/notifications/simulate-event?", "POST", Event.class);
    	header("Content-Type", "application/json");
    }
    public SimulateEventRequest body(SimulateEvent body) {
        requestBody(body);
        return this;
    }
}