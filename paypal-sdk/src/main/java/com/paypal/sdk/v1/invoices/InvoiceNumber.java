// This class was generated on Mon, 29 Jan 2018 12:12:00 PST by version 0.1.0-dev+ecea6f of Braintree SDK Generator
// InvoiceNumber.java
// @version 0.1.0-dev+ecea6f
// @type object
// @data H4sIAAAAAAAC/6SQMUv0QBCG++9XDFPnO6zTCTYiqEiwEYu55D0zsJmNs5PDIPffJQRznJaW++zs+z47n9zMI7jmWztmbUE2DXs4V/wsrrJPuJdhueeK7zCfDzcoresYmm0F1+4yr2FXFT9BugdLM9cHSQULeJ/U0W3g0fMID0Xh+mXTKOFqb7/rN62zxIYuVZoeZPgI0osfUfQSpIXkKJqWZIpM0YMGeNuLxY6aXsv3+DI5Rf6v1joGWKCjg+dhfZJLkKOF/azZ/XETNqV0ej39+wIAAP//
// DO NOT EDIT
package com.paypal.sdk.v1.invoices;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
@Model
public class InvoiceNumber {

    // Required default constructor
    public InvoiceNumber() {}

	/**
	* The next invoice number that is available to the merchant. This number is auto-incremented from the most recent invoice number.
	*/
	@SerializedName("number")
	private String number;

	public String number() { return number; }
	
	public InvoiceNumber number(String number) {
	    this.number = number;
	    return this;
	}
}
