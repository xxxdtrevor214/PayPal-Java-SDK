// This class was generated on Mon, 29 Jan 2018 12:12:04 PST by version 0.1.0-dev+ecea6f of Braintree SDK Generator
// Webhook.java
// @version 0.1.0-dev+ecea6f
// @type object
// @data H4sIAAAAAAAC/7xWX2/bNhB/36c4qHuIC1nuw9p1eQvQAi0WLIHjbA9GMJ2ps8WZIhXyFE8Y9t2HoyTXipZ2xYo82TzyxN8f3pF/Jau2puQ8+Y02pXP7JE1+Ra9xY+gXrGQiSZOfqf00eEdBeV2zdjY5T64sgfNQOU9w6D4BbvMHKQ5ZkiYX3mPb7fAqTZaExZU1bXK+RRNIAveN9lQcA9fe1eRZU0jO10ds7x/IMsTBBB7J3O/c1hRGSMfxMegLCyjAwG2hqYEdMFmIGUFGh1KrUv6EZiN5G4LWNX4gmMHqdIodoDFDurbKNIW2O7B0GIIYgEtqAT0BFgUVKYSalN62EgcMTF6HPZzlL/MZHLQpQKEv4kaeaoOK4sL8hFXecRh/KX+ZP0o3OnDEF5q6dp6p6EGlsO7mHlAbEbSP3529OIbmMTSX/TJZPHvk6ZvPesq+edLSwF7b3dTO4sSoUzvH8Ud2QtlUaOeesIhEThaLxSJMJPJ/T6RtjPk7/SIHKz+n4PvAGPWqJGisvm96cCCrnglhYORmXC/H0BRlNyVK4rHGv52ed/8Bry5GWONwivPju8HtoVC/rZqX2u7hZFu4io1uCtdoux+rO0Se7kOe7hsKPPdkUIp0/eFi9f7q4gZi6t3ZonAqLLDWixKZHIZ5nFh8XUl+ts0+pX7paTti0wemDihX1YaYgNHviOF2eRmbUIX7roEN7BQak8ryjbbdTEVcugIOmkvgUofIOwVtYX27/AhMVS2psHW+Qr47K5nrcL5YsHMmZJp4mzm/W5RcmYXfqjevf3w1y+Bj7MZ98/w+TyE/y1NAW0A+y0GV6FEx+SCfhdrTvPZOUQja7jIQRrlwzUHHBg57amHwRbg6K4XLJXJnE+BRgo5jxwfjbSEGW47hZyrzTtORdcfQ1LwPq9X1YIPvd5fL7V/NeyYGnswIfjeeYl+L/B1AKUy5sL54RF7/9Pbti0BKMuY/zNL+2g/kHyhe2WilpcjJwGhvZ3RjsdroXeOaYNr+qtlQdz4CVWhZqzA0IknL4IYI1rF7LHuE4RO6w+GQabQYsWEIemcruYcXkjsfKD0eZn8KjdmzdeDGj43oxlMjbpeXnUw6gHJ2q3dNf4zk/UAWnIXcOIWmdIHzqK62ylXyYsqvr25WOVjHeqtVZ2VFIeAu6ossn2TU/VsNtO26gXb2q4SYPkx6Hb77BwAA//8=
// DO NOT EDIT
package com.paypal.sdk.v1.webhooks;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * One or more webhook objects.
 */
@Model
public class Webhook {

    // Required default constructor
    public Webhook() {}

	/**
	* REQUIRED
	* An array of up to ten events to which to subscribe your webhook. To subscribe to all events including new events as they are added, specify the asterisk (`*`) wild card. To replace the `event_types` array, specify the `*` wild card. To list all supported events, [list available events](#available-event-type.list).
	*/
	@SerializedName(value = "event_types", listClass = EventType.class)
	private List<EventType> eventTypes;

	public List<EventType> eventTypes() { return eventTypes; }
	
	public Webhook eventTypes(List<EventType> eventTypes) {
	    this.eventTypes = eventTypes;
	    return this;
	}

	/**
	* The ID of the webhook.
	*/
	@SerializedName("id")
	private String id;

	public String id() { return id; }
	
	public Webhook id(String id) {
	    this.id = id;
	    return this;
	}

	/**
	* An array of request-related [HATEOAS links](/docs/api/hateoas-links/).
	*/
	@SerializedName(value = "links", listClass = LinkDescriptionObject.class)
	private List<LinkDescriptionObject> links;

	public List<LinkDescriptionObject> links() { return links; }
	
	public Webhook links(List<LinkDescriptionObject> links) {
	    this.links = links;
	    return this;
	}

	/**
	* REQUIRED
	* The URL that is configured to listen on `localhost` for incoming `POST` notification messages that contain event information.
	*/
	@SerializedName("url")
	private String url;

	public String url() { return url; }
	
	public Webhook url(String url) {
	    this.url = url;
	    return this;
	}
}
