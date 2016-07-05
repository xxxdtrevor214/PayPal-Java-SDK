package com.paypal.api.payments;

import com.paypal.base.rest.PayPalModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
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
}
