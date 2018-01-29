// This class was generated on Mon, 29 Jan 2018 12:12:01 PST by version 0.1.0-dev+ecea6f of Braintree SDK Generator
// PartnerFeeDetails.java
// @version 0.1.0-dev+ecea6f
// @type object
// @data H4sIAAAAAAAC/7xVUW/bNhB+36846CVrIclxVqRA3oakBYKhrdEF20MQBGfyZHGgSO5IxRWG/feBtGRbkYMsrVv4yXefz/y+++7un+ymc5RdZAvkYIjhPRFcUUClfZZnfyArXGr6iE0EZXn2G3W7L1fkBSsXlDXZRXZTE7i+TEUEocYAyoOwWpMIJKGyDKEmsKxWyqCGwGg8iligzPLsV2bsNg86zbPPhPKT0V12UaH2FAN/t4pJbgMLto44KPLZxe2WymXLTEZ00/djY1sTRiy2oSmXJXoC0RcDu/yLREgUUGuolEEjFGp4QN1SwaQxUVSkpS/hvWWgL9g4TTksUaMRlIPDriETQLaUAxoJ3sILqQdun2TuAyuzmvIeSFxaSSP2YifVlP9tqJmoEDUyikAM179/Kt6czd/uRBFW0t3PM2mFnykTaMUYC8ykYhJhxuTDbAAXEexnr0pYYLdADdKSB2MD+NY5yyHp2qMV+W81hGm1/jd/VpvUvpEoQ2SqyMYsObQOgoXXH1+DVCsVPGAV9YnWliRUgxo8OWQMlnNAD5IqZUiCMnA7qPhS3bbTg86xdaww0LgT3+ijJNjdnmQL7IimijEJUg/EI9H2goe2QkcE69pCD/OJSNUa6dMYVK2ulNa+3w6S+LvPBDWo9IjCEJm+P2UApWTyHtB7K1Sa9rUKdXpzYnjiB2ujENEpJVxXmzTbByVJPqqkNv5/XBBN96hQvvsTEGjAGt0NWg7QP1FrCsOK8SVcJTOBYJIqgECW2yQgR6saRTLuoujmlBe2cVrFXQW8UXdT68eMYkMsajThXslRY8bxA+0xgjsX5RurBtdX26FJ2h2ZR5oPuFLeaezgAwWUGHDKK/33vdzg7psdbkfxSciUbQ8qkgcG5HF5Pj89S0Yj7038sk9jFD68B/jEw7L1ysQBiMgjN2Vox6K25sDyGiR2fXr39seZJ9bYiYeEANM2yxfuqa+SOlmZu3sxOd7jxKEDvraj831a/DI/Py/m0P+0v991CM5fzGaSHkjHp5UOO4e6FLZ55kZt6mxPlK1G27BP/6D1sWnISKJtaCqOMsWgwn4/83Sj35Xz8zd9RJkVOI0mjliDYSfXer0uVWhLZaIaYnZTfH53WaSfFmen89P5vLh+dRTud/+D/dffs/3VwSV8wC+qaRvQZFahjjdqfvYWtjbyR2IUPz/9BwAA//8=
// DO NOT EDIT
package com.paypal.sdk.v1.orders;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The partner fee that is collected for the original transaction.
 */
@Model
public class PartnerFeeDetails {

    // Required default constructor
    public PartnerFeeDetails() {}

	/**
	* REQUIRED
	* The base currency object for all financial value-related fields. For example, balance, payment due, and so on.
	*/
	@SerializedName("amount")
	private Currency amount;

	public Currency amount() { return amount; }
	
	public PartnerFeeDetails amount(Currency amount) {
	    this.amount = amount;
	    return this;
	}

	/**
	* REQUIRED
	* The payee who receives the funds and fulfills the order.
	*/
	@SerializedName("receiver")
	private Payee receiver;

	public Payee receiver() { return receiver; }
	
	public PartnerFeeDetails receiver(Payee receiver) {
	    this.receiver = receiver;
	    return this;
	}
}
