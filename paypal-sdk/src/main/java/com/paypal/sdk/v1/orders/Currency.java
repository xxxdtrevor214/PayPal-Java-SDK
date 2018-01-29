// This class was generated on Mon, 29 Jan 2018 12:12:01 PST by version 0.1.0-dev+ecea6f of Braintree SDK Generator
// Currency.java
// @version 0.1.0-dev+ecea6f
// @type object
// @data H4sIAAAAAAAC/6TSUYsTMRAH8Hc/xZAnPdJbFUHom5wIItwVPXwp9zBN/tuOZJM4mRUXue8uW69XSgU5fNzZYZL/b/LL3U4VbumuRlXkMDnvvrIKbxKueZj/OO8+YTp+vEcLKtWkZLd0tzvQhhsoPAygsvmGYNQXJU6Jesmcg3CiH5xGLBSJDZF6QYrtkj4UJfzkoSZ42nDiHOCp8jQgG8URnjhHaoVKvnTevVPl6c+lX3r3GRxvcprcsufUMBe+j6KIj4WVlgo1QXPL9WPcZip5ex72kOKqRJwED0efc4C17RRYhB0rB4PSxy83izevX709qoQScfe8iyW0TrJhqzwP6KIognWKZt2heTE3t+7FJa14WnGiWNAoF6M21lrU9rAP3YL2vyx5TOne/9Nmv78TlEPlXISHMmbzNFayQhfXFxRlK9aI+9nHdqCIIAMnaqisbEU9caOIXjIiSab1QfGpbvu3Nx/BtWqpKmw43cSTxEzHv4Hd3T/7DQAA//8=
// DO NOT EDIT
package com.paypal.sdk.v1.orders;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The base currency object for all financial value-related fields. For example, balance, payment due, and so on.
 */
@Model
public class Currency {

    // Required default constructor
    public Currency() {}

	/**
	* The [three-character ISO-4217 currency code](/docs/integration/direct/rest/currency-codes/). PayPal does not support all currencies.
	*/
	@SerializedName("currency")
	private String currencyCode;

	public String currencyCode() { return currencyCode; }
	
	public Currency currencyCode(String currencyCode) {
	    this.currencyCode = currencyCode;
	    return this;
	}

	/**
	* REQUIRED
	* The amount, up to *N* digits after the decimal separator, as defined in [ISO-4217](/docs/integration/direct/rest/currency-codes/) for the appropriate currency code.
	*/
	@SerializedName("value")
	private String value;

	public String value() { return value; }
	
	public Currency value(String value) {
	    this.value = value;
	    return this;
	}
}
