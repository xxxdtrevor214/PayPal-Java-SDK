package com.paypal.api.payments;

import com.paypal.core.rest.JSONFormatter;
import com.paypal.api.payments.Webhook;

import java.util.List;

public class WebhookList  {

	/**
	 * A list of Webhooks
	 */
	private List<Webhook> webhooks;

	/**
	 * Default Constructor
	 */
	public WebhookList() {
	}


	/**
	 * Setter for webhooks
	 */
	public WebhookList setWebhooks(List<Webhook> webhooks) {
		this.webhooks = webhooks;
		return this;
	}

	/**
	 * Getter for webhooks
	 */
	public List<Webhook> getWebhooks() {
		return this.webhooks;
	}

	/**
	 * Returns a JSON string corresponding to object state
	 *
	 * @return JSON representation
	 */
	public String toJSON() {
		return JSONFormatter.toJSON(this);
	}

	@Override
	public String toString() {
		return toJSON();
	}
}
