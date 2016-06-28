package com.paypal.api.payments;

import com.paypal.base.rest.PayPalModel;

import java.util.ArrayList;
import java.util.List;

public class EventTypeList  extends PayPalModel {

	/**
	 * A list of Webhooks event-types
	 */
	private List<EventType> eventTypes;

	/**
	 * Default Constructor
	 */
	public EventTypeList() {
		eventTypes = new ArrayList<EventType>();
	}


	/**
	 * Setter for eventTypes
	 */
	public EventTypeList setEventTypes(List<EventType> eventTypes) {
		this.eventTypes = eventTypes;
		return this;
	}

	/**
	 * Getter for eventTypes
	 */
	public List<EventType> getEventTypes() {
		return this.eventTypes;
	}


}
