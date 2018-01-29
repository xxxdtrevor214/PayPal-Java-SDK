// This class was generated on Thu, 25 Jan 2018 12:44:28 CST by version 0.1.0-dev+20fb1e of Braintree SDK Generator
// LinkDescriptionObject.java
// @version 0.1.0-dev+20fb1e
// @type object
// @data H4sIAAAAAAAC/6yUQU8bMRCF7/0VI9MDkTa7HEpLc4tEJVBRQSH0EiHtxDuJ3XjtxTNLGlX898q7JDSgilbt0S8z9vvmTfaHmm4aUiN1Yf0KTol1tI3Y4OFy/o20qEx9xWhx7ugL1qlQZeozbZ4Ov/SokRpDpLuWWIaRHApVMDsbTz9djq/BWb+6PSyqoLnAxhbhnuK9pXVxYFAoIA9TBQ9ylalxjLjpnR1lakJYXXq3UaMFOqYk3LU2UrUTrmJoKIolVqPZjoklWr98iWAiLfYwHoV9lKkh0KFuHAmBYFySwM3kIodpgBpXBGIItpQanctS+dz6/peaxIQK1lYMiLHc8WdgPcxuJucgVDepFRYh1ii3h0ak4VFRSAiOc0uyyENcFkZqV8SFfn/84WiQw7nXrq36F8q3ZQblYZkB+grKQQnaYEQtFDldC02kYRODJmbrlzkkojKxlmC5u2JFG9jmk1iDJy8gBqWzy4C7EfSMPQ8Ct3NOQXvp5L/KTGL7LDLfOveQvZpbP9K95HbSy+zOptOrbQrx8XGQ32T3r0v3hwSR3J79/vzS+yxNvzeY/ouyaejVDTn+eHJywKRTx/DdIIO1sdoAU7wnBmRAD+en3WJgl26fc+uxnttlG1p2G6g6K3Pq14OpRi9WM4RFJ6S2HK6JYNZ9MCaPDvnJ3Xq9zi167Lwhs136mrxwkXqHW6Tnx/x7whj8jz26fXjzEwAA//8=
// DO NOT EDIT
package com.paypal.sdk.orders;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * A request-related [HATEOAS link](/docs/api/overview/#hateoas-links).
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
