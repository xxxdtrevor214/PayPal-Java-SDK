package com.paypal.api.payments;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

public class WebhookListTestCase {

	private static final Logger logger = Logger.getLogger(WebhookTestCase.class);

	public WebhookList createWebhookList() {
		WebhookList webhookList = new WebhookList();
		List<Webhook> webhooks = new ArrayList<Webhook>();
		Webhook webhook1 = WebhookTestCase.createWebhook();
		Webhook webhook2 = WebhookTestCase.createWebhookWithAllEvents();
		webhooks.add(webhook1);
		webhooks.add(webhook2);
		webhookList.setWebhooks(webhooks);
		return webhookList;
	}
	
	@Test
	public void testWebhooksList() {
		WebhookList webhookList = createWebhookList();
		Assert.assertEquals(webhookList.getWebhooks().size(), 2);
		Assert.assertNotEquals(webhookList.getWebhooks().get(0), webhookList.getWebhooks().get(1));
	}
	
	@Test
	public void testTOJSON() {
		WebhookList webhookList = createWebhookList();
		Assert.assertEquals(webhookList.toJSON().length() == 0, false);
		logger.info("WebhookListJSON = " + webhookList.toJSON());
	}
	
	@Test
	public void testTOString() {
		WebhookList webhookList = createWebhookList();
		Assert.assertEquals(webhookList.toJSON().length() == 0, false);
	}
}
