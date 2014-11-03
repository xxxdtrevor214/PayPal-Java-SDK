package com.paypal.api.payments;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

public class EventTypeTestCase {
	
	private static final Logger logger = Logger.getLogger(EventTypeTestCase.class);
	
	public static EventType createEventType() {
		EventType eventType = new EventType();
		eventType.setName(WebhooksInputData.availableEvents[0][0]);
		eventType.setDescription(WebhooksInputData.availableEvents[0][1]);
		return eventType;
	}

	@Test
	public void testEventConstruction() {
		EventType eventType = createEventType();
		Assert.assertEquals(eventType.getName(), WebhooksInputData.availableEvents[0][0]);
		Assert.assertEquals(eventType.getDescription(), WebhooksInputData.availableEvents[0][1]);
	}

	@Test
	public void testTOJSON() {
		EventType eventType = createEventType();
		Assert.assertEquals(eventType.toJSON().length() == 0, false);
		logger.info("EventTypeJSON = " + eventType.toJSON());
	}
	
	@Test
	public void testTOString() {
		EventType eventType = createEventType();
		Assert.assertEquals(eventType.toString().length() == 0, false);
	}

}
