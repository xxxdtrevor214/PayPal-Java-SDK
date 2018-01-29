// This class was generated on Mon, 29 Jan 2018 12:12:01 PST by version 0.1.0-dev+ecea6f of Braintree SDK Generator
// Refund.java
// @version 0.1.0-dev+ecea6f
// @type object
// @data H4sIAAAAAAAC/+yY32/bthPA379/xUH9PjSBLKVbf81vAbqhwbolSNy9ZEV8ls4SF4pUyVMcYdj/PlCUZMty2xTNjD74yeDxSN/d53g88e9gVpcUTINLWlYqDcLgDzQCF5J+x8LJgzD4ler14A3ZxIiShVbBNDgF06wDNqgsJk4cBWFwagzWfueTMLgkTM+VrIPpEqUlJ/hYCUNpL7gwuiTDgmwwve5tOi10pXhsE3bytWW9aGjfLCcosS5IMXiVEFaCc0iJUUj7eLZaNkJlY1uTyhhSST2wdkM4tveac0M0SXI0mDAZOLs6nzz/4dkr6JZBolP68DROdWJjoZgyg26DOBWGEo4NWY475YlTtvFRBBdYX6CEVJMFpRlsVZbaMKCU3daCvi4kbKqtiKhKyn/CPiwXbfA9Snjjwz4OU9pPrKO0lo2DhGkq3ND549UAF7pi4BHx/55xJpZ8szJYDszflI4dcLPgZmFJFMFveC+KqgBJKuMchIVnJ9CngA1hlYskB6ESWaVkp39WJyc/JpVsfsmPpPCjK7ojBanIBFtY0FIbasKSUiIKlFBqoTjya+Ju0XCL2Veqr3T3f7h0KfvAv4s7B74R0VbSfYpTjiqVQmU3S6IBqq2JMa1O4QDLmezrBqWw1H51W1m6c1cQ5zoFrWQd7YesULYyqJIh1k3pmGk/e4A6gOqwfZ7snqDaXJSln1kz3RCOkXaTB6J7q6ldyG9SYZNRW7Zr9vPYoNM8nMjvr8zaasGaUQ4Zr4U70LaTbS/WuyKYChvB2bIZGfpYkeUeJUihWp0QOBcWSm9s7bLg+Ni0vhwfH075XsAz3g+Y+/EYN+P9gcgjEPnwECajk/jpYzg4gw5FRimw7r6WiGBR9wMTwS/atF/2NgRDpSFLim2j0u7COfLG+la721QbkQnli5Xb8JAT3/pN/ZCUSLDkytCNSIfPDZvicXKcvQHt67BFSZtPOY6mB7uvPn5o+BcN3vH6tCvVXm2k2iN78k6oW9gwEc4Xf1Gy49FKCnU7fN/oJFtPagrQmedcbO/FiSGJrhG4fns6+/n89Aqapd0LEJYi1ndk7gSt4ic5Mmm0k0blaMvbl4//+JEbWg4/pr1gjC3RRSmJ3S1hMmJ4f/kugpmGAm+ppendTFDK0KkvXBvgZtpWp3m6a/oB510IQsH1+8szYCpKt9S1FwXyh6c5c2mnccxaSxsJ4mWkTRbnXMjYLJOXL16dHEVw5qtN8w/z/89DmD+dh4AqhfnRfCNlmq6lNDQpjU7IWqGyCJxHc+fr3KWY2+KWaugAOV+1oq5ONjAA+xB4H70/6Jok60i72oxS7ums+ZgO0PWiMby3s9lFh6Frv1x52AlvTx4YGt5/frzjRdWF3xvYFLW6pC+myIufXr9+YqmpKZPnR90FZcnckQW0gMrVIZcZ2OD1oCuFxUJkla6srCFtTFmQzw9LBSoWie2ql1sWwRURXDdl5LK10K6tW61WkUCFjW1orciU6/1t7NZOOpe2h9G9c+Mo2lcr4u6N7UtnLfuubxzLyNWwLveiHZ8zzdTw9nmkKP/vXwAAAP//
// DO NOT EDIT
package com.paypal.sdk.v1.orders;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * A refund transaction.
 */
@Model
public class Refund {

    // Required default constructor
    public Refund() {}

	/**
	* The payment amount, with details.
	*/
	@SerializedName("amount")
	private Amount amount;

	public Amount amount() { return amount; }
	
	public Refund amount(Amount amount) {
	    this.amount = amount;
	    return this;
	}

	/**
	* The ID of the sale transaction to refund.
	*/
	@SerializedName("capture_id")
	private String captureId;

	public String captureId() { return captureId; }
	
	public Refund captureId(String captureId) {
	    this.captureId = captureId;
	    return this;
	}

	/**
	* The ID of the refund transaction. Maximum length is 17 characters.
	*/
	@SerializedName("id")
	private String id;

	public String id() { return id; }
	
	public Refund id(String id) {
	    this.id = id;
	    return this;
	}

	/**
	* An array of request-related [HATEOAS links](/docs/api/overview/#hateoas-links).
	*/
	@SerializedName(value = "links", listClass = LinkDescriptionObject.class)
	private List<LinkDescriptionObject> links;

	public List<LinkDescriptionObject> links() { return links; }
	
	public Refund links(List<LinkDescriptionObject> links) {
	    this.links = links;
	    return this;
	}

	/**
	* The ID of the sale transaction to refund.
	*/
	@SerializedName("sale_id")
	private String saleId;

	public String saleId() { return saleId; }
	
	public Refund saleId(String saleId) {
	    this.saleId = saleId;
	    return this;
	}

	/**
	* The status of the refund.
	*/
	@SerializedName("status")
	private String status;

	public String status() { return status; }
	
	public Refund status(String status) {
	    this.status = status;
	    return this;
	}
}
