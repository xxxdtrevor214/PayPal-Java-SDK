// This class was generated on Thu, 25 Jan 2018 12:44:28 CST by version 0.1.0-dev+20fb1e of Braintree SDK Generator
// PayerInformation.java
// @version 0.1.0-dev+20fb1e
// @type object
// @data H4sIAAAAAAAC/+xa3XLbOg6+36fAuBfbzFiW7bTdae7S9GeznTaZ/OxeeDMOLcIWthSpklAdd6cz+xr7eudJzpCSfxTZp3Gb8emFbzIRiI8CIBAgvuS/ratZjq2j1rmYoYVTPTY2E0xGt9qtfwpLYqTwo8i8Sqvdeo+z5cNrdImlPCgfta5ShDxsQstNOq1269haMSvf0m23LlDIM61mraOxUA694HNBFuVCcG5NjpYJXetosLDvWEqLzjWtGpFSpCdDsVBYGtlca9pc6UClA6RBeEcy1NyBE6FhhIB3jFqihLGx4FLK8xXI4znp2JKeNH1MiGc1xypB0xu/AFpk+LNG6UKpb+3vW2YKzXY2TIzEuoX1hbqlxzDgqYmSVFiRsM+7yzM47L14EfXAA26extIkLibNOLEhk2JJFhOOLTqOq80jr+viA+BUMJBEzTQmdMA+EqUOGAsWJz4X/110u4fJSJnk0+fCMIbn8mfi2Bo9KSUfDeNRKY5X5XC1sq1/dciGdxYFwytLLEgDOSiRfr2EvXtV7bUUgdAStOGG7vX7NboOCofSJ6b3i00eKfyCCqTJ/Cv913bBlBCGysAOXDsMgNuT/m3T7JOUtICpsUpOqZIlJsuF9V8XCp0YzdYohRJySwnC05Pr8wPIkFMj2zAS+hMkwsp2cCaxxrloZKxEC2yFdiLxn81VUY/vh32b9GRb/Fh2KtLYq6XlXNI8OWOyjsGvgxmHwM2PN7w1FvBOZLnCNugiG6Ftg2OLyKX3zsCWte6nXOo3XOo3XDoLvwjVCVnrMDFaPsA7VxBjG0QuLPsKuHD3x9z88cKifQtR9DUc/qFjwUW9tm9QaH7YeWGvAaAEdOACubAaJRitZuEUhCbmYGxNBq+s+EpqRy7nqdH1IjqXrOm0fmXxcUjD4E2n1z+EsvPePE2Zc3cUx9PptENcdEj70pnEV9HFm5Mo6Eb9brfX7UenMeqDDnwQd5QVGSjUE059IXvehUWFdruKgXEsVLOd1OVr4hHWQ3lrwzSlJHjg8/wr5WXV82n+uaAvQoXOfjXLKRFKzcBWdlc10BdK30SmxKm/Cix39lsIXdvlEhEG50uVZeRRd6b0iXKUJDrGTmL/FJ8v/TjYUUh9pteDOZc0wzh4SPcN8EXv9UETcH0ZTlQIkY/6MkZBwXCKK7H1x24l5qv9AqhWnvxXJA1mUbccLrc5gsGxnfiur8U2Rj8Rc9RBGwblGd8KPwoQDz4RWsjtXp4EiAefaknbYckjApSFmm0H9QgP/YfIhd4K+h+P8NAPeEeJ2QqbBYgHX6WClNByKzhXoIO2z6zBtSZGCZdexW21UeHE2iL3rAuO9ERhNJox7r7grelsD+hlVffajYnsl1cNrARN8/yCP6fr7xa3fz/78GZ4djH819nF+9s23L47fXt1+9hXi5sHeDQiy+lQ3q+LNfG6SdFyCjJUubJIhatC2X5PNaPVyOX6/TbMxijXIeRxaAUpZyq24+Tw8PDlE4eh8kXPOy8O7kes9/JlN+o+i3r92196oFsM/391zdGuGy1Gu+UQsuWItyPvMROkam7PJZv9DRrLlG+WmF7/b7uvK2GcGfrZsOZOTbzZp3IY2iGPoMQ6a1elm431Wru0NSMpFTatrcs321vq7dLi8OYhyfqVeils2nouZudCRcI5mvjpCHViZ7nvvSXHd/r6VxyKqgCvDkfrDmT/zxhsvE3DRiutiTeNeX55V9cRoQqe878rV5JV8ebAL9Ue2dzLOeW6kQaek7JreeA1i00n7tO6IJEFqT29u6d39/Tunt7d07t7endP7+7p3V+N3rWYUE6o14xPjaVmYP3CvGQs1EEwcErusf7AvSeq90T1nqjeE9V7onpbotoV4zHd1YM+F/3BGB5UdhV0cXefWVqINpj42//+74DFHZy+7sBlkefG8rzCLrin+f9gVSNJuMDt1KUmWVOXf9+5krjZvYc33/7yOwAAAP//
// DO NOT EDIT
package com.paypal.sdk.orders;

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
	* The shipping address details.
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
