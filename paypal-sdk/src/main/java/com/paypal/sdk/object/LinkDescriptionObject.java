// This class was generated on Wed, 21 Jun 2017 14:20:42 PDT by version 0.01 of Braintree SDK Generator
// LinkDescriptionObject.java
// DO NOT EDIT
// @type object
// @json {"Type":"Link Description Object","VariableName":"","Description":"The [HATEOAS links](/docs/api/hateoas-links/) related to the request.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":[{"Type":"string","VariableName":"encType","Description":"The media type in which to submit data in the request.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"href","Description":"The URL of the related HATEOAS link to use in subsequent calls.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":true,"Properties":null},{"Type":"string","VariableName":"mediaType","Description":"The media type, as defined by RFC 2046, that describes the link target.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"method","Description":"The HTTP method required for the related call.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"rel","Description":"The relation to the target resource of the link. Should be one of the extended link relation types defined by PPaaS in https://ppaas/docs/standards/hypermedia","IsArray":false,"ReadOnly":false,"Visible":false,"Required":true,"Properties":null},{"Type":"string","VariableName":"title","Description":"The link title.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.object;

import java.util.Map;
import java.util.List;
import com.google.gson.annotations.SerializedName;
/**
 * The [HATEOAS links](/docs/api/hateoas-links/) related to the request.
 */
public class LinkDescriptionObject {

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
