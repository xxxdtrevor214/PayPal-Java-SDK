// This class was generated on Mon, 22 Jan 2018 14:30:02 PST by version 0.1.0-dev+8c35d5 of Braintree SDK Generator
// PayerInformation.java
// @version 0.1.0-dev+8c35d5
// @type object
// @data H4sIAAAAAAAC/+xZzXLbRgy+9ykwyqHxjChKcpJOfEucn7qZxB7/tAfXI6+4kIhmucvsgpGVTmb6Gn29Pklnl9QPTamxEo+agy6ZCMC3BEAQWHz+s3U+zbF10MrFFO2A9MjYTDAZ3Wq3fhWWxFDhO5F5k1a79Qanix8v0CWW8mB80DpPEcIhsHRIp9VuPbNWTMundNutUxTyWKtp62AklEMv+FCQRTkXnFiTo2VC1zq4nPsnpLToXNOrISlFejxYGCycbOqaPlc2UNkAaRA+kAw1d+BQaBgi4A2jlihhZCy4lPJ8CXJ/QTq2pMfNGBPiaS2wStCMxitAiwy/1SldKPW5/WXPTKHZTgeJkVj3sK5oenrJExMlqbAiYbRwdHYM+70nT6IeeMjVw1iaxMWkGcc21FIsyWLCsUXHcXV85G1dvAecCgaSqJlGhA7Y56K0AWPB4thX4+9Ft7ufDJVJ3n8oDGP4Xf6bOLZGj0vJO8N4UIrjZTmcLx3rHx3q4bVFwfDcEgvSQA5KpNeXsNfPq7MWIhBagjbcsL14s8LWQeFQ+tL0cbHJI4UfUYE0mX+kf98uuBLSUDnYgQuHAXB92L9uun2YkhYwMVbJCVWyxGS5sP79QqETo9kapVBCbilBeHh4cbIHGXJqZBuGQr+HRFjZDsEk1jgXDY2VaIGt0E4k/rW5Kuvx7bRvUqBsi6+rT0Uae7XCnEmaFTki6xi8HswoJG72gcMrYwFvRJYrbIMusiHaNji2iFxG7wxs2O2+KaR+I6R+I6Tj8B+hOqFqHSZGyztE5wpibIPIhWXfA+fhfl2YX99atB8iij6Fj3/gWHBR7+5rDJovdtbaawAoAR04RS6sRglGq2n4CsIYczCyJoPnVnwitaWQ89ToehudSVbMWq+ZvxzScPmy0+vvQzl7rx6mzLk7iOPJZNIhLjqkfetM4vPo9OVhFGyjfrfb6/ajoxj1XgfeihvKigwU6jGnvpE97sK8Q7tt5cA4Fqo5UOryFfkI+tDe2jBJKQkR+Dr/RHnZ9XyZfyjoo1Bhtp9Pc0qEUlOwld9VD/SN0g+RCXHqLwOLk/0RQtdOOUOEy5OFySLzqDsTek85ShIdY8ex/xWfLOLY21JKfaXXkzmTrBjLd5m+AT6fvT5pAi7OwhcVUuSzvshRMDCc4lJu/We3lPPleQFUa0/+LZIGM+9bDhfHHMDlMzv2U1+LTZx+IGaovTZclt/4RvhhgHjwodBCbvbwJEA8+EhL2gxLHhGgLNR0M6hHeOgvIhd6I+gfHuGhb/GGErMRNgsQDz5PBSmh5UZwrkB7bV9ZlxeaGCWceRO30UGFEyub3KMuONJjhdFwyrj9hrdist1hllXTazsuslcvO1gJmu55hf9OV98trn8+fvtycHw6+O349M11G65fH706v77vq8XVHSIakuV0IG/3xZp41a5oOQUZulzZpMJVoRy/R5rRauRSf3sMszHKdQh5FEZBypmK7SjZ399/+sBh6HzR486TvdsZ6z192o26j6Je//q7X+lCMn50zdWuG81Xu8USsuGKt6XoMROkamHPJOvjDRaLkm+2mF7/p+33lbDODPxuWAunJl4fU7kMbZFJUGKVt8vS9c56q236mpGUCpve1uXr/S3ttulxRe/J+pV6IWz6eiKmJ0JFwjka++0IdWKnuZ+9Jct39OJ7XIqqBC8vR6s+yP7/sdh4nwaNUVoTr1vzvHpb1xGhCp4xwEtXkmXx+sQvzO7b3Yp0HawlgldYLLnfVDaDmLO8ldHSHhn4N1Huk7f53zplvCODd2TwjgzekcE7MnhHBu/I4B0Z/L2RwRYTygn1imWroWom1itmLWNuDoKBU3L39QfxHa29o7V3tPaO1t7R2pvS2q4YjeimnvSZ6D+W9mCyraSLm9s81Fy0xsV//vrbAYsbOHrRgbMiz43lWYedM1WzBbxaScIFbqshNamduvzLwZU0z/YjvPr8w78AAAD//w==
// DO NOT EDIT
package com.paypal.sdk.payments;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The payer information.
 */
@Model
public class PayerInformation {

    // Required default constructor
    public PayerInformation() {}

	/**
	* The billing address in a payment. Can be extended for shipping address.
	*/
	@SerializedName("billing_address")
	private Address billingAddress;

	public Address billingAddress() { return billingAddress; }
	
	public PayerInformation billingAddress(Address billingAddress) {
	    this.billingAddress = billingAddress;
	    return this;
	}

	/**
	* The birth date of the payer, in [Internet date format](https://tools.ietf.org/html/rfc3339#section-5.6). For example, `1990-04-12`.
	*/
	@SerializedName("birth_date")
	private String birthDate;

	public String birthDate() { return birthDate; }
	
	public PayerInformation birthDate(String birthDate) {
	    this.birthDate = birthDate;
	    return this;
	}

	/**
	* The payer's [two-character IS0-3166-1 country code](/docs/integration/direct/rest/country-codes/).
	*/
	@SerializedName("country_code")
	private String countryCode;

	public String countryCode() { return countryCode; }
	
	public PayerInformation countryCode(String countryCode) {
	    this.countryCode = countryCode;
	    return this;
	}

	/**
	* The payer's email address. Maximum length is 127 characters.
	*/
	@SerializedName("email")
	private String email;

	public String email() { return email; }
	
	public PayerInformation email(String email) {
	    this.email = email;
	    return this;
	}

	/**
	* The payer's first name.
	*/
	@SerializedName("first_name")
	private String firstName;

	public String firstName() { return firstName; }
	
	public PayerInformation firstName(String firstName) {
	    this.firstName = firstName;
	    return this;
	}

	/**
	* The payer's last name.
	*/
	@SerializedName("last_name")
	private String lastName;

	public String lastName() { return lastName; }
	
	public PayerInformation lastName(String lastName) {
	    this.lastName = lastName;
	    return this;
	}

	/**
	* The payer's middle name.
	*/
	@SerializedName("middle_name")
	private String middleName;

	public String middleName() { return middleName; }
	
	public PayerInformation middleName(String middleName) {
	    this.middleName = middleName;
	    return this;
	}

	/**
	* The PayPal-assigned encrypted payer ID.
	*/
	@SerializedName("payer_id")
	private String payerId;

	public String payerId() { return payerId; }
	
	public PayerInformation payerId(String payerId) {
	    this.payerId = payerId;
	    return this;
	}

	/**
	* The payer's phone number. Maximum length is 20 characters.
	*/
	@SerializedName("phone")
	private String phone;

	public String phone() { return phone; }
	
	public PayerInformation phone(String phone) {
	    this.phone = phone;
	    return this;
	}

	/**
	* The phone type.
	*/
	@SerializedName("phone_type")
	private String phoneType;

	public String phoneType() { return phoneType; }
	
	public PayerInformation phoneType(String phoneType) {
	    this.phoneType = phoneType;
	    return this;
	}

	/**
	* The payer's salutation.
	*/
	@SerializedName("salutation")
	private String salutation;

	public String salutation() { return salutation; }
	
	public PayerInformation salutation(String salutation) {
	    this.salutation = salutation;
	    return this;
	}

	/**
	* The extended address, which is used as the shipping address in a payment.
	*/
	@SerializedName("shipping_address")
	private ShippingAddress shippingAddress;

	public ShippingAddress shippingAddress() { return shippingAddress; }
	
	public PayerInformation shippingAddress(ShippingAddress shippingAddress) {
	    this.shippingAddress = shippingAddress;
	    return this;
	}

	/**
	* The payer's suffix.
	*/
	@SerializedName("suffix")
	private String suffix;

	public String suffix() { return suffix; }
	
	public PayerInformation suffix(String suffix) {
	    this.suffix = suffix;
	    return this;
	}

	/**
	* The payer’s tax ID. Supported for the PayPal payment method only.
	*/
	@SerializedName("tax_id")
	private String taxId;

	public String taxId() { return taxId; }
	
	public PayerInformation taxId(String taxId) {
	    this.taxId = taxId;
	    return this;
	}

	/**
	* The payer’s tax ID type. Supported for the PayPal payment method only.
	*/
	@SerializedName("tax_id_type")
	private String taxIdType;

	public String taxIdType() { return taxIdType; }
	
	public PayerInformation taxIdType(String taxIdType) {
	    this.taxIdType = taxIdType;
	    return this;
	}
}
