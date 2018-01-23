// This class was generated on Tue, 23 Jan 2018 11:23:30 PST by version 0.1.0-dev+c58b80 of Braintree SDK Generator
// Event.java
// @version 0.1.0-dev+c58b80
// @type object
// @data H4sIAAAAAAAC/8xWTW/bRhC991cM2B5sgKICuHYT3QQkRYwGdeAovQhGOCJH4lbkLjMztMwW/e/FkiJtilVdoIba487sx3vzZt/u78GiLimYBe/uyWoQBr8gG1zl9DMWPhyEwU9UPw7ekiRsSjXOBrNgDjtaZc5tgfxysE7N2iTo01EQBnNmrNsDXoXBLWF6Y/M6mK0xF/KBr5VhSvvAR3YlsRqSYLbsoYmysZsxtoQJlb6oKWgAcxgfIl5kBCkqAdoU/AzYZWRBM/obKrBDgXbXNARjYXltldiSHuy1dlyg3p1lqqXMplN1LpfIkK4jx5tppkU+5XVycXHx5luhxO89uYyuzv9trWyV53+EzxasYfZF/aSn9RqEx+Vq66EZKiibzYaY0mcKdlI+98Ti0Y4pPWaOsdrP8Jo+ZfQfcDHpgEAzHKO+fgtufdrifzB2C0+QwM3qV0r+wipyY7cyINFFDkzDAnp4ngnT14pEJ0y5v1ywfD9fvLuZf4Jm6d3ZNHWJTLE00wyVHMqkSRxemKuXN5eMaT0gsw+MNUlcUeakBIq8IYXPtx8iWDgocEuNVB25BPM89NNXxraZgjRzKeyMZqCZkYZ26zCfb69BqSj90n/qK1eXP7w6j+DaJnmVtifE38UhxGdx2JhUfB5DkiFjosTit4WSaVKyS0jE2E0EnlHsucZgpNliSzV0sniuzvZ+0IgB2Jeg5djyQZBqJV5fq034RBeprelAuj40Fu/9YvGxk4H3p4MeEe9EDJjyAfx2PMa+9OVvAfp76Q382Ra5fPP6df/0fH8ewi4zSQZCfE8CKIDWm4zvDGzkbYWuLBYrs6lcJXkNaQNlRW1/CBVo1STSWZNfFsEnIlg25nG7RyiP6Ha7XWTQYoMNRczGFmRVpn7tpKN0OIwePI2XeS3vngjhjjgak7iKEzpQow+OJemS/8vnsgM3/gEcZsbELBbU6duT7O6GuqOvZ8v2RASlKgrkekDtMXb4dd1n9t3cvm2+77X/HQw0gh8dAz2gd7oQ4jmUWPueBaw0c2x+G30Vo/hlGvWbPwEAAP//
// DO NOT EDIT
package com.paypal.sdk.webhooks;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * A webhook event notification.
 */
@Model
public class Event {

    // Required default constructor
    public Event() {}

	/**
	* The date and time when the webhook event notification was created, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6).
	*/
	@SerializedName("create_time")
	private String createTime;

	public String createTime() { return createTime; }
	
	public Event createTime(String createTime) {
	    this.createTime = createTime;
	    return this;
	}

	/**
	* The event that triggered the webhook event notification.
	*/
	@SerializedName("event_type")
	private String eventType;

	public String eventType() { return eventType; }
	
	public Event eventType(String eventType) {
	    this.eventType = eventType;
	    return this;
	}

	/**
	* The event version in the webhook notification.
	*/
	@SerializedName("event_version")
	private String eventVersion;

	public String eventVersion() { return eventVersion; }
	
	public Event eventVersion(String eventVersion) {
	    this.eventVersion = eventVersion;
	    return this;
	}

	/**
	* The ID of the webhook event notification.
	*/
	@SerializedName("id")
	private String id;

	public String id() { return id; }
	
	public Event id(String id) {
	    this.id = id;
	    return this;
	}

	/**
	* An array of request-related [HATEOAS links](/docs/api/hateoas-links).
	*/
	@SerializedName(value = "links", listClass = LinkDescriptionObject.class)
	private List<LinkDescriptionObject> links;

	public List<LinkDescriptionObject> links() { return links; }
	
	public Event links(List<LinkDescriptionObject> links) {
	    this.links = links;
	    return this;
	}

	/**
	* The resource that triggered the webhook event notification.
	*/
	@SerializedName("resource")
	private Object resource;

	public Object resource() { return resource; }
	
	public Event resource(Object resource) {
	    this.resource = resource;
	    return this;
	}

	/**
	* The name of the resource related to the webhook notification event.
	*/
	@SerializedName("resource_type")
	private String resourceType;

	public String resourceType() { return resourceType; }
	
	public Event resourceType(String resourceType) {
	    this.resourceType = resourceType;
	    return this;
	}

	/**
	* A summary description for the event notification. For example, `A payment authorization was created.`
	*/
	@SerializedName("summary")
	private String summary;

	public String summary() { return summary; }
	
	public Event summary(String summary) {
	    this.summary = summary;
	    return this;
	}
}
