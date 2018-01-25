// This class was generated on Thu, 25 Jan 2018 09:31:12 CST by version 0.1.0-dev+20fb1e of Braintree SDK Generator
// IncentiveDetails.java
// @version 0.1.0-dev+20fb1e
// @type object
// @data H4sIAAAAAAAC/7xV32sUMRB+968Y8tTC3m39AcK9FYtQxbZoEaQe7VwyexvMJutk0nOR/u+S+9m7PWvF4tOSzGTm+758mf2pLruW1Eidek1e7C3BCQlaF1WhPiNbnDg6wyanqEK9p26zOKGo2bZig1cjdVkT2HURsygyVIU6ZsZu0eWoUB8Jzbl3nRpV6CLlje/JMpn1xgWHllgsRTW6WuP7EDx1fUzrjtfYhORlC+OeYB+zTszkdQfoDSzyoAoMCJX16LVFB7foEg2YHAoZqCw5M4S3gYF+YNM6KmCCDr0mCAwtdg15AZPo6ehHYeunff4r9Nc6GNoivxvpM7+SmokGukZGLcRw+ul88OrF89cbTfLZ8UFpgo6l9UJTxlygNJZJS8kUpVwlD3JyLA9BahSwJktfWYog91T+K0WE044gPjl3V/xRlfl9bamx2umrMI8UMKutrqGx01pgQqOv6ejopU5u/qXFytnF6tjDXAviuVGW1DJTZ78R3Ly7+HKzEAGZwAcB6Vqr0bkOqiy1DR7dcFG0XFXd6QGGtG3QrU/s73V5dnKvV0wTY2+tIZMRBpA6pIjeSB33tytXDLOZ8z3xUnzwqZkQQ6jWQFqHmuLybWw5pIBIBFdv7u9FGGQ/QfbT+KAWaeOoLGez2dDGMAw8LW0Mc7cNtg00rKVxh0/hk/EjnLIZEb0H1AvtmR3BUM/u6DdzsICYdA0Ys2QhtcH/60h45AvYgG85TBmbh/jtpDw015epv2EODbGu0Qu40KGTLs/D3uH/LoHkxP3Ul6E+5RzI7t97lbGl+X8hVFV+I/yUdzu+e/YLAAD//w==
// DO NOT EDIT
package com.paypal.sdk.paypalsync;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The incentive details.
 */
@Model
public class IncentiveDetails {

    // Required default constructor
    public IncentiveDetails() {}

	/**
	* The currency and amount for a financial value-related field. For example, balance or payment due.
	*/
	@SerializedName("incentive_amount")
	private Money incentiveAmount;

	public Money incentiveAmount() { return incentiveAmount; }
	
	public IncentiveDetails incentiveAmount(Money incentiveAmount) {
	    this.incentiveAmount = incentiveAmount;
	    return this;
	}

	/**
	* The code that identifies an incentive, such as a coupon.
	*/
	@SerializedName("incentive_code")
	private String incentiveCode;

	public String incentiveCode() { return incentiveCode; }
	
	public IncentiveDetails incentiveCode(String incentiveCode) {
	    this.incentiveCode = incentiveCode;
	    return this;
	}

	/**
	* The incentive program code that identifies a merchant loyalty or incentive program.
	*/
	@SerializedName("incentive_program_code")
	private String incentiveProgramCode;

	public String incentiveProgramCode() { return incentiveProgramCode; }
	
	public IncentiveDetails incentiveProgramCode(String incentiveProgramCode) {
	    this.incentiveProgramCode = incentiveProgramCode;
	    return this;
	}

	/**
	* The type of incentive, such as a special offer or coupon.
	*/
	@SerializedName("incentive_type")
	private String incentiveType;

	public String incentiveType() { return incentiveType; }
	
	public IncentiveDetails incentiveType(String incentiveType) {
	    this.incentiveType = incentiveType;
	    return this;
	}
}
