// This class was generated on Mon, 29 Jan 2018 12:12:02 PST by version 0.1.0-dev+ecea6f of Braintree SDK Generator
// JsonPatch.java
// @version 0.1.0-dev+ecea6f
// @type object
// @data H4sIAAAAAAAC/7STT4vbQAzF7/0UYs4m9OxboKcWktKGXsqyUcZKPGE8mtXIWcyS777M5B/eLIT9d9STRvyen/xkFkMkU5tt4nAfUW1rKvMPxeHK0wy73DOV+UXDpfhByYqL6jiY2kzh59/5DMpb4NWWrIIyYIx+gIiiDj30sUGllBtCiXuxlCamMlMRHA4I3yvzh7CZBz+Yeo0+URYeeifUnIXfwpFEHSVT/z/DJxUXNtfga+FuBH8UXjfALihJRtSWwLPFPAAulFpRNqTQsO07Cgp5FTy2zrb5Rcc7KmM79D1N4AQOa5aiL/PEEjJ9WftR86H3fl/d/AIcR/5LOXa/aOlCla1Y7qInpTcRqvTvA4yo7QjxKNyKCG8GhHqJ5+SpDH5VBofbv7ZYTmLk8aRcJ1E6599nAllbCr04HmiYEgRWkAMf4PHwPsPR3f7bMwAAAP//
// DO NOT EDIT
package com.paypal.sdk.v1.payments;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * A JSON patch object to apply partial updates to resources.
 */
@Model
public class JsonPatch {

    // Required default constructor
    public JsonPatch() {}

	/**
	* A JSON pointer to the location in the target document from which to move the value. Required for the `move` operation.
	*/
	@SerializedName("from")
	private String from;

	public String from() { return from; }
	
	public JsonPatch from(String from) {
	    this.from = from;
	    return this;
	}

	/**
	* REQUIRED
	* The operation to complete.
	*/
	@SerializedName("op")
	private String op;

	public String op() { return op; }
	
	public JsonPatch op(String op) {
	    this.op = op;
	    return this;
	}

	/**
	* A JSON pointer to a location in the target document at which to complete the operation.
	*/
	@SerializedName("path")
	private String path;

	public String path() { return path; }
	
	public JsonPatch path(String path) {
	    this.path = path;
	    return this;
	}

	/**
	* The value to apply. The `remove` operation does not require a value.
	*/
	@SerializedName("value")
	private Object value;

	public Object value() { return value; }
	
	public JsonPatch value(Object value) {
	    this.value = value;
	    return this;
	}
}
