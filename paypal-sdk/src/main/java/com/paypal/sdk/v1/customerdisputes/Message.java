// This class was generated on Mon, 09 Apr 2018 16:10:52 UTC by version 0.1.0-dev+291f3f of Braintree SDK Generator
// Message.java
// @version 0.1.0-dev+291f3f
// @type object
// @data H4sIAAAAAAAC/7ySQWvVQBDH736KYb0o5CUPHgrmVvAiYhUtXmop+3YnyepmJ52ZbQ3S7y55Ce2LRT0ovQT2t5P8f//d/DBn44CmNu9QxLZoCvPZcrD7iKe2nzZMYd7ieL94jeI4DBoomdqcgMui1CNvgBh6ZNfZpJuBRNFDP38VGmLQDsEHGbJiaQpzwmzHOXxbmI9o/fsUR1M3NgpO4CoHRn8HPjANyBpQTH1+py3KIbUPrR0lxaQr+Xu27nDW4Z9bLC/+q3XKMd4Wf1WfQy/340r+mP5e/9gebjqCpcF09stdPFILDT1ezumrHmv+sIm3imCTh2mwgJDg/E1S5IS63pv+qd7qxbNOdZC6qpQoShlQm5K4rTrtY8WN2+12r54Kuilj86J8+byET+goeQHLCLx0hZsuRISG7WHSRpCjKRpmWH7J2+3O7SO5b1eZFA/r+elEmVI7k1NSrGdcHXOYOjK2OVoG/D4wigRKMDBdB48CbQ7eJoewzwqeUCCRAuNXdAo2Rgjp2sbgD4chi0/1q9D/uOOL2yc/AQAA//8=
// DO NOT EDIT
package com.paypal.sdk.v1.customerdisputes;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * A customer- or merchant-posted message for the dispute.
 */
@Model
public class Message {

    // Required default constructor
    public Message() {}

	/**
	* The customer- or merchant-posted content.
	*/
	@SerializedName("content")
	private String content;

	public String content() { return content; }
	
	public Message content(String content) {
	    this.content = content;
	    return this;
	}

	/**
	* The customer or merchant who posted the message.
	*/
	@SerializedName("posted_by")
	private String postedBy;

	public String postedBy() { return postedBy; }
	
	public Message postedBy(String postedBy) {
	    this.postedBy = postedBy;
	    return this;
	}

	/**
	* The date and time, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6). Seconds are required while fractional seconds are optional.<blockquote><strong>Note:</strong> The regular expression provides guidance but does not reject all invalid dates.</blockquote>
	*/
	@SerializedName("time_posted")
	private String timePosted;

	public String timePosted() { return timePosted; }
	
	public Message timePosted(String timePosted) {
	    this.timePosted = timePosted;
	    return this;
	}
}
