package com.paypal.api.payments;


import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

public class EventTestCase {
	
	private static final Logger logger = Logger.getLogger(EventTestCase.class);

	public static final String RESOURCETYPE_AUTHORIZATION = "authorization";
	public static final String EVENT_ID = "WH-SDK-1S115631EN580315E-9KH94552VF7913711";
	public static final String EVENT_SUMMARY = "A successful payment authorization was created";
	
	public static Event createEvent() {
		Event event = new Event();
		event.setCreateTime(new java.util.Date().toString());
		event.setEventType(WebhooksInputData.availableEvents[1][0]);
		event.setId(EVENT_ID);
		event.setResourceType(RESOURCETYPE_AUTHORIZATION);
		event.setSummary(EVENT_SUMMARY);
		return event;
	}
	
	public static Event createSaleEvent() {
		Event event = new Event();
		event.setCreateTime(new java.util.Date().toString());
		event.setEventType(WebhooksInputData.availableEvents[4][0]);
		event.setId(EVENT_ID);
		event.setResourceType(RESOURCETYPE_AUTHORIZATION);
		event.setSummary(EVENT_SUMMARY);
		return event;
	}
	
	@Test
	public void testEventConstruction() {
		Event event = createEvent();
		Event saleEvent = createSaleEvent();
		
		Assert.assertEquals(event.getEventType(), WebhooksInputData.availableEvents[1][0]);
		Assert.assertEquals(event.getId(), EVENT_ID);
		Assert.assertEquals(event.getResourceType(), RESOURCETYPE_AUTHORIZATION);
		Assert.assertEquals(event.getSummary(), EVENT_SUMMARY);
		
		Assert.assertEquals(saleEvent.getEventType(), WebhooksInputData.availableEvents[4][0]);
		Assert.assertEquals(saleEvent.getId(), EVENT_ID);
		Assert.assertEquals(saleEvent.getResourceType(), RESOURCETYPE_AUTHORIZATION);
		Assert.assertEquals(saleEvent.getSummary(), EVENT_SUMMARY);
	}

	@Test
	public void testTOJSON() {
		Event event = createEvent();
		Assert.assertEquals(event.toJSON().length() == 0, false);
		logger.info("EventJSON = " + event.toJSON());
	}
	
	@Test
	public void testTOString() {
		Event event = createEvent();
		Assert.assertEquals(event.toString().length() == 0, false);
	}

}
