// This class was generated on Mon, 29 Jan 2018 12:12:01 PST by version 0.1.0-dev+ecea6f of Braintree SDK Generator
// Sale.java
// @version 0.1.0-dev+ecea6f
// @type object
// @data H4sIAAAAAAAC/+xZT2/buBK/v08xcN+hCWQpfenf3IL2LRpstwmSdC/ZIB6LI4sbilTJURxj0e++oCjJkeW2aZs1ioVPBodDemZ+wx+Ho79G54uSRgejM1Q0ika/o5U4VfQeCy8dRaNfabEcvCGXWlmyNHp0MDoEh4qALWqHqRfGo2h0aC0uwq570eiUUBxrtRgdZKgcecHHSloSneDEmpIsS3Kjg4vOnsPCVJqHFmErX9rVifrWnecEJS4K0gxBJYK55BwEMUrlHs5Wx1bq2dDWtLKWdLroWXtHOLT3gnNLNE5ztJgyWTg6Ox4//d+TF9Aug9QIunycCJO6RGqmmUW/QSKkpZQTS46TVnnslV2yE8MJLk5QgTDkQBsGV5WlsQyoVLu1pG8LCdtqJSK6UupT1IXlpAl+gBLehLAPwyS6iWWUlrJhkFAI6Yfen6AGODUVAw8Q/+cxnsmMr+YWy575d6VDB/ws+FnIiGL4DW9lURWgSM84B+ngyR50KeAimOcyzUHqVFWC3MEf1d7eflqp+pfCSMkwOqMb0iDkTLKDKWXGUh0WQaksUEFppOY4rEnaRf0tzr9RfW7a/8PMp+w9/y5pHfhBiFaS7nM45aiFknp2lRH1oFqZGKLVKmzB8iYH3iABmQmrG2Zpz11BnBsBRqtFvBlkpXaVRZ32Yb0rHWLazW5B7YHqYfsyshsC1eWyLMPMEtM7wiGk7eQW0Y1xahvyKyFdOijL1s1+GTZoNbcn8uejWVdN2TCqPsZL4Rpom8mmFutckUyFi+Eoq0eWPlbkuIMSlNSNTgScSwdlMHbhs2B31za+7O5uT/lGgGe87WEexkO4GW+3iDwAIpf3wWRwEj9/DHtn0EMxIwFs2tcSEUwX3cDG8IuxYCmrtHARWCotOdLsapVmF86R76xvtNtNjZUzqQNZ+Q23OfGjb+r7pERqCZmuWBb9QrgvH6aHQCZALcBrwDwn3dCyM5VNCeboIOwhIpAaLo40k9XEKyszYwvky8c5c+kOkoSNUS6WxFls7CzJuVCJzdL9/f1XjxzV3aLxs/j5zqZeCaL/PBBrg3H0Bky4lh66s7Vi5jupr+HO/8Px9E9K1/S7lNTX/dZIK1npxWlAb563v7lSx5aUhw0u3h6e///48AzqpW3zCEuZmBuyN5LmyaMcmQy6ca2yCsrzh++b5Jay/js8CIaYpKYoFbG/YOyMGD6cvovh3ECB19SkanAzRaUirz71FYSfaaqkuutXlxLeu5DFH06PgKko/dL75u7zZy/2dmI4CkRV/8Pkv5MIJo8nUX0QJjuTO8RWFzylpXFpTUrOST2LwXs08b5OPBH6La5pAS1A3lejqaXYGgzALgTBx+AP+vrKeaQ9raNSGzpIIaY96DrRELy35+cnLQxt5ebvibXgbcgDS/2rM4zXNGN9+IOB/oTyoqSvpsizVy9fdvT2dKe92xzZG3KADlB7kvGZgTW8AehKYzGVs8pUTi1A1KZMKeSHowI1y9S11OSXxXBGBBc1jZw2FrqldfP5PJaosbYNnZMz7Z8NLvFrx61Lq8P41rvxMIx8nyvLMXLVJ7dOtOY5UU9tiJ9fL7v0q6XX8j8HvcTh3NCNKTpadvNNTfshH5SCTGrUqUQFN6gq6hg8k6SEC7UZ3aJngwimqFCnFHWPQlFR4CFn4CG/xXzt+8ZrI+jf+Y3j+0mmxq8XlFay5oNG83WqKj017r7f/XzB6ahEi2xs5MlEUCY1iVCWNVH81rh1z3Is/UPbSn8h9pCIN1TBVqVYW8H25d9XwSp0DGGjn7iMvfz0n78BAAD//w==
// DO NOT EDIT
package com.paypal.sdk.v1.orders;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * A sale transaction.
 */
@Model
public class Sale {

    // Required default constructor
    public Sale() {}

	/**
	* The payment amount, with details.
	*/
	@SerializedName("amount")
	private Amount amount;

	public Amount amount() { return amount; }
	
	public Sale amount(Amount amount) {
	    this.amount = amount;
	    return this;
	}

	/**
	* The date and time when the resource was created, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6).
	*/
	@SerializedName("create_time")
	private String createTime;

	public String createTime() { return createTime; }
	
	public Sale createTime(String createTime) {
	    this.createTime = createTime;
	    return this;
	}

	/**
	* The ID of the sale transaction.
	*/
	@SerializedName("id")
	private String id;

	public String id() { return id; }
	
	public Sale id(String id) {
	    this.id = id;
	    return this;
	}

	/**
	* An array of request-related [HATEOAS links](/docs/api/overview/#hateoas-links).
	*/
	@SerializedName(value = "links", listClass = LinkDescriptionObject.class)
	private List<LinkDescriptionObject> links;

	public List<LinkDescriptionObject> links() { return links; }
	
	public Sale links(List<LinkDescriptionObject> links) {
	    this.links = links;
	    return this;
	}

	/**
	* The status of the sale transaction.
	*/
	@SerializedName("status")
	private String status;

	public String status() { return status; }
	
	public Sale status(String status) {
	    this.status = status;
	    return this;
	}

	/**
	* The base currency object for all financial value-related fields. For example, balance, payment due, and so on.
	*/
	@SerializedName("transaction_fee")
	private Currency transactionFee;

	public Currency transactionFee() { return transactionFee; }
	
	public Sale transactionFee(Currency transactionFee) {
	    this.transactionFee = transactionFee;
	    return this;
	}

	/**
	* The date and time when the resource was last updated, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6).
	*/
	@SerializedName("update_time")
	private String updateTime;

	public String updateTime() { return updateTime; }
	
	public Sale updateTime(String updateTime) {
	    this.updateTime = updateTime;
	    return this;
	}
}
