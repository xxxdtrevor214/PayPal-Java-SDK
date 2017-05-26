// This class was generated on Fri, 26 May 2017 11:06:13 PDT by version 0.01 of Braintree SDK Generator
// .java
// DO NOT EDIT
// @type object
// @json {"Type":"Link Description Object","VariableName":"","Description":"The [HATEOAS links](/docs/api/hateoas-links/) related to the request.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":[{"Type":"string","VariableName":"encType","Description":"The media type in which to submit data in the request.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"href","Description":"The URL of the related HATEOAS link to use in subsequent calls.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":true,"Properties":null},{"Type":"string","VariableName":"mediaType","Description":"The media type, as defined by RFC 2046, that describes the link target.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"method","Description":"The HTTP method required for the related call.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"rel","Description":"The relation to the target resource of the link. Should be one of the extended link relation types defined by PPaaS in https://ppaas/docs/standards/hypermedia","IsArray":false,"ReadOnly":false,"Visible":false,"Required":true,"Properties":null},{"Type":"string","VariableName":"title","Description":"The link title.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.object;

import java.util.Map;
import java.util.List;
import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;


/**
 * The [HATEOAS links](/docs/api/hateoas-links/) related to the request.
 */
@Data
@Accessors(chain = true)
public class LinkDescriptionObject {
	/**
	* The media type in which to submit data in the request.
	*/
	@SerializedName("encType")
	private String encType;
	/**
	* REQUIRED
	* The URL of the related HATEOAS link to use in subsequent calls.
	*/
	@SerializedName("href")
	private String href;
	/**
	* The media type, as defined by RFC 2046, that describes the link target.
	*/
	@SerializedName("mediaType")
	private String mediaType;
	/**
	* The HTTP method required for the related call.
	*/
	@SerializedName("method")
	private String method;
	/**
	* REQUIRED
	* The relation to the target resource of the link. Should be one of the extended link relation types defined by PPaaS in https://ppaas/docs/standards/hypermedia
	*/
	@SerializedName("rel")
	private String rel;
	/**
	* The link title.
	*/
	@SerializedName("title")
	private String title;
}
