package com.paypal.api.payments;

import com.paypal.core.rest.JSONFormatter;
import java.util.List;

import com.paypal.api.payments.EventType;

public class Webhook  {

	/**
	 * Identifier of the webhook resource.
	 */
	private String id;

	/**
	 * Webhook notification endpoint url.
	 */
	private String url;

	/**
	 * List of Webhooks event-types.
	 */
	private List<EventType> eventTypes;

	/**
	 * Hateoas Links.
	 */
	private List<Links> links;

	/**
	 * Default Constructor
	 */
	public Webhook() {
	}

	/**
	 * Parameterized Constructor
	 */
	public Webhook(String url, List<EventType> eventTypes) {
		this.url = url;
		this.eventTypes = eventTypes;
	}


	/**
	 * Setter for id
	 */
	public Webhook setId(String id) {
		this.id = id;
		return this;
	}

	/**
	 * Getter for id
	 */
	public String getId() {
		return this.id;
	}


	/**
	 * Setter for url
	 */
	public Webhook setUrl(String url) {
		this.url = url;
		return this;
	}

	/**
	 * Getter for url
	 */
	public String getUrl() {
		return this.url;
	}


	/**
	 * Setter for eventTypes
	 */
	public Webhook setEventTypes(List<EventType> eventTypes) {
		this.eventTypes = eventTypes;
		return this;
	}

	/**
	 * Getter for eventTypes
	 */
	public List<EventType> getEventTypes() {
		return this.eventTypes;
	}


	/**
	 * Setter for links
	 */
	public Webhook setLinks(List<Links> links) {
		this.links = links;
		return this;
	}

	/**
	 * Getter for links
	 */
	public List<Links> getLinks() {
		return this.links;
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