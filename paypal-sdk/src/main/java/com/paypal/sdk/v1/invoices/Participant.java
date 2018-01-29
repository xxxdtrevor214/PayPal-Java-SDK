// This class was generated on Mon, 29 Jan 2018 12:12:00 PST by version 0.1.0-dev+ecea6f of Braintree SDK Generator
// Participant.java
// @version 0.1.0-dev+ecea6f
// @type object
// @data H4sIAAAAAAAC/+yWz47jRBDG7zxFyVwmwsow4c9hbkMWLqDZEbNwAKFRxV2JC9rd3q7y7liId0ft2Ek6zkSzSzZIqz26quz+feXqr/vv7FVbU3ad3WFQLrhGp1me/YqBcWHpFquYzPLsR2q3Dy9IisC1snfpq8Bu6UOFMTPN8uwmBGzXK3yZZz8TmpfOttn1Eq1QDLxuOJDZBO6Crykok2TXv2/YRAO71RgLjeG4EtqHuG5COc6l0Deb/C5zDtIUJaDAohF2JAKlb4L8Vy2usfaffCPoxphAIgcV9YlESR9LFXyHQtB/CfziTyoUGiHT0bO17FbQvwvsAKHGtiKn4APQo5IzZGDpA9yXXNexuv/Yh/9xBWubaOwDqcA5awsOK3onIA3N8eY/CeUbp6F9KLyhFC5NpJAzsKRKAfoqiFXnAbbs6CohHSIp4k/sCK7AL0HL7cRc0GoKrqkWFHIQDUSaA2kxOR/8bAQ/G8G/rPtdGtMwO6hCGlbKAWuFzzsN08mJN+xTKurSu3RYhsieRcZo3+24Gb+fXs2+grXtnAvVi6IdT3caT7F/47qb584yXjf8Bm00EBZopEFrWwg9WWck6y3AJKAlKpT4huLPqqbwgw9gWTT+vr0q48H5vnjN0i0pUFuKDhdoSQHUQ6laX19ekpu+5b+4JsM49WF1GZ8u77YqztRPUdS0k0PkSYMw1LXpl3voSiUHdKYb553mxgqvJe208ySK/niGpuHQe4ium2jbz6QaX5UE9c4toPBVja7dHqLv7OLv/1+oQrYJ+xA5ztxVDQfmaT3wrveEPdIlPiac6+cDlDvmcYaz+b2Owci5OQFxffnoBv5iPp/k8UpiaMmODCza6H7ffj2F+E6Fj1w1VZyYRZe25FZaRp+Yz79wOFzRBK6+AcMrVjnTHA1rP6wbn7RinBt3Y8M+nLEHe3CzXweFd8KiEluwyRkS5fVT39bbF/NJZx/SLOLS8dX+Cxf3t5P/t7vP8ZolB9Gx0STh4zu2Kz2ntVg8RLwbPQ4cKz8E7xP+8tzLySeP+eQxH6fHvKWF8N4tbRs7vln7uhOxfvYvAAAA//8=
// DO NOT EDIT
package com.paypal.sdk.v1.invoices;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * Participant information.
 */
@Model
public class Participant {

    // Required default constructor
    public Participant() {}

	/**
	* Additional information, such as business hours.
	*/
	@SerializedName("additional_info")
	private String additionalInfo;

	public String additionalInfo() { return additionalInfo; }
	
	public Participant additionalInfo(String additionalInfo) {
	    this.additionalInfo = additionalInfo;
	    return this;
	}

	/**
	* Base Address object used as billing address in a payment or extended for Shipping Address.
	*/
	@SerializedName("address")
	private Address address;

	public Address address() { return address; }
	
	public Participant address(Address address) {
	    this.address = address;
	    return this;
	}

	/**
	* The participant company business name.
	*/
	@SerializedName("business_name")
	private String businessName;

	public String businessName() { return businessName; }
	
	public Participant businessName(String businessName) {
	    this.businessName = businessName;
	    return this;
	}

	/**
	* REQUIRED
	* The participant email address.
	*/
	@SerializedName("email")
	private String email;

	public String email() { return email; }
	
	public Participant email(String email) {
	    this.email = email;
	    return this;
	}

	/**
	* The phone number.
	*/
	@SerializedName("fax")
	private Phone fax;

	public Phone fax() { return fax; }
	
	public Participant fax(Phone fax) {
	    this.fax = fax;
	    return this;
	}

	/**
	* The participant first name.
	*/
	@SerializedName("first_name")
	private String firstName;

	public String firstName() { return firstName; }
	
	public Participant firstName(String firstName) {
	    this.firstName = firstName;
	    return this;
	}

	/**
	* The participant last name.
	*/
	@SerializedName("last_name")
	private String lastName;

	public String lastName() { return lastName; }
	
	public Participant lastName(String lastName) {
	    this.lastName = lastName;
	    return this;
	}

	/**
	* The phone number.
	*/
	@SerializedName("phone")
	private Phone phone;

	public Phone phone() { return phone; }
	
	public Participant phone(Phone phone) {
	    this.phone = phone;
	    return this;
	}

	/**
	* The participant website.
	*/
	@SerializedName("website")
	private String website;

	public String website() { return website; }
	
	public Participant website(String website) {
	    this.website = website;
	    return this;
	}
}
