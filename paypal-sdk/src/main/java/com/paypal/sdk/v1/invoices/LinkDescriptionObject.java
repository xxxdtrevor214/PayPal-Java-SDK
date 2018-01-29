// This class was generated on Mon, 29 Jan 2018 12:12:00 PST by version 0.1.0-dev+ecea6f of Braintree SDK Generator
// LinkDescriptionObject.java
// @version 0.1.0-dev+ecea6f
// @type object
// @data H4sIAAAAAAAC/7yUz2vbThDF79+/YtjTt6BGoZQefDP9QaChNrbaS8hhpB1lt1nvbnZGtKLkfy8rObZVQUtL8FFvtPb7zHvaH6rqI6mFurb+Ht4RN8lGscHDqv5KjahCfcFksXb0CXf5RVWoj9QfH07OqIWqDMHN1bJ6v1puwVl/z7f/lzo0XGK0pUGhgPxyGJQvIJFDIQ0SQAxBooeOWC5UoZYpYT9auyzUhlCvvOvVokXHlIWHzibSB2GdQqQkllgtbg5QLMn6uzkD+WZ44xTlqM2JdqQtgvSRwHr4Zmxjsmfu6p0V0CiY9WdE8J1zj8UfOUyidgKxF+YEnzfXENq9xXHppyllmo4HOu5qzhBeoEHn+K9QJHX/RjJseJbJqfq7VApABk2t9aSh7mHz4S28unz9pgAxKKCHozXxwD/yYrqjc8W0IzFB/0K2l+ZYV1W1hnE+1Cn/O7QhTcLL0ZzJfSI3sT4+z30P1vLNsf+axxVDIg5dauipfnn9F7A1oXMaaoLgDyP6LuQ16TGi4+/1kSbxrteI29xVIxJ5UZYxIvJ4zbCg15g0l6aPlIaOnKXBYsVN2/ukzFc1VjCPnyXD28f/fgIAAP//
// DO NOT EDIT
package com.paypal.sdk.v1.invoices;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The [HATEOAS links](/docs/api/hateoas-links/) related to the request.
 */
@Model
public class LinkDescriptionObject {

    // Required default constructor
    public LinkDescriptionObject() {}

	/**
	* The media type in which to submit data in the request.
	*/
	@SerializedName("encType")
	private String encType;

	public String encType() { return encType; }
	
	public LinkDescriptionObject encType(String encType) {
	    this.encType = encType;
	    return this;
	}

	/**
	* REQUIRED
	* The URL of the related HATEOAS link to use in subsequent calls.
	*/
	@SerializedName("href")
	private String href;

	public String href() { return href; }
	
	public LinkDescriptionObject href(String href) {
	    this.href = href;
	    return this;
	}

	/**
	* The media type, as defined by RFC 2046, that describes the link target.
	*/
	@SerializedName("mediaType")
	private String mediaType;

	public String mediaType() { return mediaType; }
	
	public LinkDescriptionObject mediaType(String mediaType) {
	    this.mediaType = mediaType;
	    return this;
	}

	/**
	* The HTTP method required for the related call.
	*/
	@SerializedName("method")
	private String method;

	public String method() { return method; }
	
	public LinkDescriptionObject method(String method) {
	    this.method = method;
	    return this;
	}

	/**
	* REQUIRED
	* The relation to the target resource of the link. Should be one of the extended link relation types defined by PPaaS in https://ppaas/docs/standards/hypermedia
	*/
	@SerializedName("rel")
	private String rel;

	public String rel() { return rel; }
	
	public LinkDescriptionObject rel(String rel) {
	    this.rel = rel;
	    return this;
	}

	/**
	* The link title.
	*/
	@SerializedName("title")
	private String title;

	public String title() { return title; }
	
	public LinkDescriptionObject title(String title) {
	    this.title = title;
	    return this;
	}
}
