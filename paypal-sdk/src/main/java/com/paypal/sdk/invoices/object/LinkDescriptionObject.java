// This class was generated on Sun, 30 Jul 2017 11:04:05 PDT by version 0.1 of Braintree SDK Generator
// LinkDescriptionObject.java
// DO NOT EDIT
// @type object
// @json {"Type":"Link Description Object","VariableName":"","Description":"The [HATEOAS links](/docs/api/hateoas-links/) related to the request.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":[{"Type":"string","VariableName":"encType","Description":"The media type in which to submit data in the request.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"href","Description":"The URL of the related HATEOAS link to use in subsequent calls.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null},{"Type":"string","VariableName":"mediaType","Description":"The media type, as defined by RFC 2046, that describes the link target.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"method","Description":"The HTTP method required for the related call.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"rel","Description":"The relation to the target resource of the link. Should be one of the extended link relation types defined by PPaaS in https://ppaas/docs/standards/hypermedia","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null},{"Type":"string","VariableName":"title","Description":"The link title.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.invoices.object;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.serializer.Serializable;
import com.braintreepayments.http.serializer.Deserializable;

/**
 * The [HATEOAS links](/docs/api/hateoas-links/) related to the request.
 */
public class LinkDescriptionObject implements Serializable, Deserializable {

    // Required default constructor
    public LinkDescriptionObject() {}

	/**
	* The media type in which to submit data in the request.
	*/
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
	private String href;

	public String href() { return href; }
	
	public LinkDescriptionObject href(String href) {
	    this.href = href;
	    return this;
	}

	/**
	* The media type, as defined by RFC 2046, that describes the link target.
	*/
	private String mediaType;

	public String mediaType() { return mediaType; }
	
	public LinkDescriptionObject mediaType(String mediaType) {
	    this.mediaType = mediaType;
	    return this;
	}

	/**
	* The HTTP method required for the related call.
	*/
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
	private String rel;

	public String rel() { return rel; }
	
	public LinkDescriptionObject rel(String rel) {
	    this.rel = rel;
	    return this;
	}

	/**
	* The link title.
	*/
	private String title;

	public String title() { return title; }
	
	public LinkDescriptionObject title(String title) {
	    this.title = title;
	    return this;
	}

    @Override
    public void serialize(Map<String, Object> serialized) {
        if (encType != null) {
            serialized.put("encType", this.encType);
        }
        if (href != null) {
            serialized.put("href", this.href);
        }
        if (mediaType != null) {
            serialized.put("mediaType", this.mediaType);
        }
        if (method != null) {
            serialized.put("method", this.method);
        }
        if (rel != null) {
            serialized.put("rel", this.rel);
        }
        if (title != null) {
            serialized.put("title", this.title);
        }
    }

    @Override
    public void deserialize(Map<String, Object> values) {
        if (values.containsKey("encType")) {
            this.encType = (String) values.get("encType");
        }
        if (values.containsKey("href")) {
            this.href = (String) values.get("href");
        }
        if (values.containsKey("mediaType")) {
            this.mediaType = (String) values.get("mediaType");
        }
        if (values.containsKey("method")) {
            this.method = (String) values.get("method");
        }
        if (values.containsKey("rel")) {
            this.rel = (String) values.get("rel");
        }
        if (values.containsKey("title")) {
            this.title = (String) values.get("title");
        }
    }
}

