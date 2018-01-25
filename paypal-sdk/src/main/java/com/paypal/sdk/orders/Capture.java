// This class was generated on Thu, 25 Jan 2018 12:44:28 CST by version 0.1.0-dev+20fb1e of Braintree SDK Generator
// Capture.java
// @version 0.1.0-dev+20fb1e
// @type object
// @data H4sIAAAAAAAC/+xZT2/buBK/v08xUN+hCWQpfa//Nreg3UWD7TZB4u4lG8RjcSRxQ5EqScUxFv3uC4qibFlut0FTYw8+GZwZ0jPz4/zh6K9ouqwpOo7eYG0bTVEc/Y6a41zQB6wcI4qjX2m5Wrwlk2leW65kdBydQOY3gtUoDWaOnkRxdKI1Lv3ZR3F0QcjOpFhGxzkKQ47wqeGaWE8416ombTmZ6Piq1+qkUo20Y6Uw0Feq9aShgtOSoMZlRdKCF4lhwW0JjCxyYR5PV2M1l8VY16zRmmS2HGi7Rhzre2VLTTTJStSYWdJwenk2ef6/Z68gbINMMbp+mjKVmZRLS4VGd0DKuKbMppqMTYPwxAmb9CCBc1yeowCmyIBUFkxT10pbQCHC0Zwe5hKrmw2PyEaIz3HvlvPO+R5KeOvdPnYT6xkrL61oYychY9wtnT1eDHCuGgt2hPiPx7jgub1ZaKwH6q9TxwY4Ljgu5EQJ/Ib3vGoqECQLWwI38OwI+itgYliUPCuBy0w0jMzxH83R0f+zRrS/5FeC+9Ul3ZEExgtuDcwpVy4+SwJGGa9QQK24tInfk4ZNwyOmDxRfqPB/mLsr+41/lwYDvhOijUv3JZxKlExwWdzkRAOoNhhjtILAHiynss8bxCBXfneXWULcVWRLxUBJsUx2gyyXptEosyGs69Qxpj13D+oAVAfb15HdEaim5HXtOStM14hjSANzj+jOcmpw+Q3jJhu1Zdu4X4cNguQ+Iv99adY0c6ssiiHGK+IWaDtm14v1pnBLlUngNG9Xmj41ZGwPJQguO5kYbMkN1F7ZpbsFh4e6s+XwcB/lOwHe4v0Ac78ew23xfo/IIyBy/S2YjCLxy2E4iEEHRUEMrAqvJSKYL/uFTuAXpUFT3khmYtBUazIkrWlFulNsiXZtfycdDlWaF1z6ZOUO3N+J731Tf8uV4GzY/7Ktl+H0LSifd3/A9GYjobzn8hbWVICz+Z+UbZnpCC5vh8//QNkYOUlAp54zoSsbE00CXZ28ency/fns5BLarWFAgjVP1R3pO06L9EmJlhSaSStysGHty8efDZSa8uFb0xPGsGSqqgVZl0R1QRY+XrxPYKqgwlvqqqQ3M0MhYic+d1XScbpOoJ1steXSWRcDl3D18eIULFW12+qqb4X2+mlpbW2O09QqJUzCyeaJ0kVa2kqkOs9evnh1dJDAqQ/G9h9m/53FMHs6iwElg9nBbC1426Jea5rUWmVkDJdFAs6imbN15oLdHXFLSwgAOVuVpJBGWjAAexd4G7096HoI45B2qQuF2FGv4306gK4njcF7N52eBxhCd+Jy4VbwdmSBpmF58OstA0fnfq+gi1C7rOkfr8iLn16/fmKoTRmT5wchfxvSd2QADaB0ecbdDGzh9UA3Eqs5LxrVGLEE1qoyJ38/DFUoLc9MyE5uWwKXRHDVppGLTkOz0m6xWCQcJba6oTG8kK41NqnbOwkmbS6Te2fGQbKrSq0JjZI3mWK0Acg6fXO07rntrNc7j0vGM7Sduzp2aKjXUjgY64Jd5TCrSTIuixkoDTNNd6QNsdmuXgsWbTPM6T1py0shKL2bwvRmNYLf7KtW/zkaFI55Y0PmaGg1qldtvfOBIATkXKLMOAq4Q9FQX7pyToIZ33jRPbo0GMMcBcqM4v7FxxryCdgoeMwPLfuPFw+62C10A58EypYPFd1Xp6Z25eDww+GXG0lDNWq0SscugTLKuSTWFvHgxIe6rc8OWLsHtOYuxAZAJI/SmV5//s/fAAAA//8=
// DO NOT EDIT
package com.paypal.sdk.orders;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * A capture transaction.
 */
@Model
public class Capture {

    // Required default constructor
    public Capture() {}

	/**
	* The payment amount, with details.
	*/
	@SerializedName("amount")
	private Amount amount;

	public Amount amount() { return amount; }
	
	public Capture amount(Amount amount) {
	    this.amount = amount;
	    return this;
	}

	/**
	* The ID of the capture transaction.
	*/
	@SerializedName("id")
	private String id;

	public String id() { return id; }
	
	public Capture id(String id) {
	    this.id = id;
	    return this;
	}

	/**
	* An array of request-related [HATEOAS links](/docs/api/overview/#hateoas-links).
	*/
	@SerializedName(value = "links", listClass = LinkDescriptionObject.class)
	private List<LinkDescriptionObject> links;

	public List<LinkDescriptionObject> links() { return links; }
	
	public Capture links(List<LinkDescriptionObject> links) {
	    this.links = links;
	    return this;
	}

	/**
	* A reason code that indicates the reason for the transaction state of `pending` or `reversed`.
	*/
	@SerializedName("reason_code")
	private String reasonCode;

	public String reasonCode() { return reasonCode; }
	
	public Capture reasonCode(String reasonCode) {
	    this.reasonCode = reasonCode;
	    return this;
	}

	/**
	* The state of the capture transaction.
	*/
	@SerializedName("status")
	private String status;

	public String status() { return status; }
	
	public Capture status(String status) {
	    this.status = status;
	    return this;
	}

	/**
	* The base currency object for all financial value-related fields. For example, balance, payment due, and so on.
	*/
	@SerializedName("transaction_fee")
	private Currency transactionFee;

	public Currency transactionFee() { return transactionFee; }
	
	public Capture transactionFee(Currency transactionFee) {
	    this.transactionFee = transactionFee;
	    return this;
	}
}
