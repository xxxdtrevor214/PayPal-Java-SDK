// This class was generated on Mon, 29 Jan 2018 12:12:02 PST by version 0.1.0-dev+ecea6f of Braintree SDK Generator
// LinkDescriptionObject.java
// @version 0.1.0-dev+ecea6f
// @type object
// @data H4sIAAAAAAAC/6yUQU/bThDF7/9PMVr+ByI5NofS0tyQqAQqKiiEXiKEJ+tJvGW9a3bGpFbFd6/WC0EhqmjVHvd5Z+f95o38Q836ltREWePubitiHUwrxrtbv/hGWlSmvmIwuLD0BZt4UWXqM/Uvh5OXGjVRs5og0H1HLONAFoUqmJ8ezz5dHF9B7ME3+0XlNRfYmsI/UHgwtC72ahTyyOPhyihXmToOAftk7iBTU8LqwtleTZZomaJw35lA1Ua4DL6lIIZYTeYbLJZg3GqXog603CJ5EnZptG9aS0IgGFYkcD09z2HmocE7AhlwE6ZGa7N4fWFc+tKQ1L6CtZEapDY8DCAD42B+PT0DoaaNpbD0oUG52a9FWp4UhXhvOTcky9yHVVFLY4uw1O8PPxyMcjhz2nZV6lD+X2ZQ7pcZoKugHJWgawyohQLHZ6ENNG6D18Rs3CqHSFRG1hIMD0/cUQ/PAUVW78gJSI2S8gLcjCAxJh4E7hYck3YyyH+UmYTuVWSus/YxezO3NNKt5DbSbnans9nlcwrhqTnIL7L726X7TYJAdst+Ou96n8fpJ4PGO5C+pTc35PDj0dEek44V43ejDNa10TUwhQdiQAZ0cHYyLAYO6aacO4fNwqw637HtIf0EFpTWg6lBJ0Yz+OUgxLIcrohgfh5fmD455Bd36/U6N+hw8IbMZuUacsJFrB0/I70+5t8jxuhf7NHN438/AQAA//8=
// DO NOT EDIT
package com.paypal.sdk.v1.payments;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The request-related [HATEOAS links](/docs/api/overview/#hateoas-links).
 */
@Model
public class LinkDescriptionObject {

    // Required default constructor
    public LinkDescriptionObject() {}

	/**
	* REQUIRED
	* The complete target URL. To make the related call, combine the method with this link, in [URI template format](https://tools.ietf.org/html/rfc6570). Include the `$`, `(`, and `)` characters for pre-processing. The `href` is the key HATEOAS component that links a completed call with a subsequent call.
	*/
	@SerializedName("href")
	private String href;

	public String href() { return href; }
	
	public LinkDescriptionObject href(String href) {
	    this.href = href;
	    return this;
	}

	/**
	* The HTTP method required to make the related call.
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
	* The [link relation type](https://tools.ietf.org/html/rfc5988#section-4), which serves as an ID for a link that unambiguously describes the semantics of the link. See [Link Relations](https://www.iana.org/assignments/link-relations/link-relations.xhtml).
	*/
	@SerializedName("rel")
	private String rel;

	public String rel() { return rel; }
	
	public LinkDescriptionObject rel(String rel) {
	    this.rel = rel;
	    return this;
	}
}
