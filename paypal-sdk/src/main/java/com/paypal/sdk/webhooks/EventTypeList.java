// This class was generated on Tue, 23 Jan 2018 11:23:30 PST by version 0.1.0-dev+c58b80 of Braintree SDK Generator
// EventTypeList.java
// @version 0.1.0-dev+c58b80
// @type object
// @data H4sIAAAAAAAC/7zSwUoDMRAG4LtPMcx5FU8e9lbQk6IixYsUmbpTN5gm22SiBNl3l3FL3bhCQaWnJf9Oki/DvOM8d4w1XryyE9AFXJkoWOE9BUNLy9e01gKs8JLz1+Kc41MwnRjvsEbdA34Fb7xsvX8B1uPiCVY4C4HycMlphXdMzY2zGesV2cgabJIJ3OyC2+A7DmI4Yv3wA28q+7zrUXLHsUCWeemdOSCF7TWf/d4cJRj3PPU2I8nYW+bfvNCmNbnjwNToUTAq1jdIy4P/ry13ydq+2vsGp58xfhuU6nnLkJzZpC0OtOpAwigkqRyIXTRVDr+0k1TOw79oF/2iP/oAAAD//w==
// DO NOT EDIT
package com.paypal.sdk.webhooks;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * List of webhook events.
 */
@Model
public class EventTypeList {

    // Required default constructor
    public EventTypeList() {}

	/**
	* An array of webhook events.
	*/
	@SerializedName(value = "event_types", listClass = EventType.class)
	private List<EventType> eventTypes;

	public List<EventType> eventTypes() { return eventTypes; }
	
	public EventTypeList eventTypes(List<EventType> eventTypes) {
	    this.eventTypes = eventTypes;
	    return this;
	}
}
