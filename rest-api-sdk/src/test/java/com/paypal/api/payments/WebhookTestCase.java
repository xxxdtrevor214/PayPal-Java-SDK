package com.paypal.api.payments;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

public class WebhookTestCase {
	
	private static final Logger logger = Logger.getLogger(WebhookTestCase.class);

	public static final String WEBHOOK_ID = "WH-ID-SDK-1S115631EN580315E-9KH94552VF7913711";
	public static final String WEBHOOK_URL = "https://github.com/paypal";
	public static final String WEBHOOK_HATEOAS_URL = "https://api.sandbox.paypal.com/v1/notifications/webhooks/";

	public static Webhook createWebhook() {
		Webhook webhook = new Webhook();
		webhook.setId(WEBHOOK_ID);
		webhook.setUrl(WEBHOOK_URL);
		webhook.setLinks(createWebhookHATEOASLinks());
		webhook.setEventTypes(EventTypeListTestCase.createAuthEventTypeList());
		return webhook;
	}
	
	public static Webhook createWebhookWithAllEvents() {
		Webhook webhook = new Webhook();
		webhook.setId(WEBHOOK_ID);
		webhook.setUrl(WEBHOOK_URL);
		webhook.setLinks(createWebhookHATEOASLinks());
		webhook.setEventTypes(EventTypeListTestCase.createAllEventTypeList());
		return webhook;
	}
	
	public static List<Links> createWebhookHATEOASLinks() {
		List<Links> linksList = new ArrayList<Links>();
		
		Links link1 = new Links();
		link1.setHref(WEBHOOK_HATEOAS_URL + WEBHOOK_ID);
		link1.setRel("self");
		link1.setMethod("GET");
		
		Links link2 = new Links();
		link1.setHref(WEBHOOK_HATEOAS_URL + WEBHOOK_ID);
		link2.setRel("update");
		link2.setMethod("PATCH");
		
		Links link3 = new Links();
		link1.setHref(WEBHOOK_HATEOAS_URL + WEBHOOK_ID);
		link3.setRel("delete");
		link3.setMethod("DELETE");
		
		linksList.add(link1);
		linksList.add(link2);
		linksList.add(link3);
		
		return linksList;
	}
	
	@Test
	public void testWebhookConstruction() {
		Webhook webhook = createWebhook();
		Assert.assertEquals(webhook.getId(), WEBHOOK_ID);
		Assert.assertEquals(webhook.getUrl(), WEBHOOK_URL);
		Assert.assertEquals(webhook.getLinks().size(), 3);
		Assert.assertEquals(webhook.getEventTypes().size(), 2);
		Assert.assertEquals(webhook.getEventTypes().get(0).getName(), WebhooksInputData.availableEvents[1][0]);
		Assert.assertEquals(webhook.getEventTypes().get(1).getName(), WebhooksInputData.availableEvents[2][0]);
		Assert.assertNotEquals(webhook.getEventTypes().size(), WebhooksInputData.availableEvents.length);
	}
	
	@Test
	public void testWebhookWithAllEventsConstruction() {
		Webhook webhook = createWebhookWithAllEvents();
		Assert.assertEquals(webhook.getId(), WEBHOOK_ID);
		Assert.assertEquals(webhook.getUrl(), WEBHOOK_URL);
		Assert.assertEquals(webhook.getLinks().size(), 3);
		Assert.assertEquals(webhook.getEventTypes().size(), WebhooksInputData.availableEvents.length);
		for(int i=0; i < webhook.getEventTypes().size(); i++) {
			Assert.assertEquals(webhook.getEventTypes().get(i).getName(), WebhooksInputData.availableEvents[i][0]);
		}
	}
	
	@Test
	public void testTOJSON() {
		Webhook webhook =  createWebhook();
		Assert.assertEquals(webhook.toJSON().length() == 0, false);
		logger.info("EventTypeJSON = " + webhook.toJSON());
	}
	
	@Test
	public void testTOString() {
		Webhook webhook =  createWebhook();
		Assert.assertEquals(webhook.toString().length() == 0, false);
	}
	
}
