// This class was generated on Thu, 25 Jan 2018 12:44:28 CST by version 0.1.0-dev+20fb1e of Braintree SDK Generator
// PayeeDisplayMetadata.java
// @version 0.1.0-dev+20fb1e
// @type object
// @data H4sIAAAAAAAC/7SUT4vbPBDG7++nGHTJu2DZ8bakkFvp7mEp24Zt6CUsYWJNYoEsqSO5qSn97kWJ82/dQqHp0c9oZn7zjOTvYt55ElMxw44I7nTwBjt4pIgKI4pMfEbWuDL0AZt0TmTiPXWnjzsKFWsftbNiKuY1gdrXkM6aDpq+EKwdQ6wJfOqTi0y8ZcZu33yciSdC9dGaTkzXaAIl4UurmdRRmLHzxFFTENPFETtE1nYzxFwxWrW06eMc+EIeoic4HgVYtUFbCgHSyb+Fta0xP7Ij8cHiWe0sDcF795a+D5/YX0Z+jU+jALsTYNtmRfzvra5cayN3y8qpS+AXgSHvIm6drGpkrCIxPHway1flZCJL6FMhpT7/X8fow7QoFH0lk9Byj51Hk1euKZSrQqFtpA1jql0ozVTFginEoq8jU51Q3IBbny7hKBzaXHnDvzNqv5ALi47S0Bxt5cGF831moC0s7vNy8rpXtN2AN2jTE2swnuzabre5jm2ubXKjKuby6f6d3KXK23E5Lkv5cHOV2Z//YHpqUJuL4Q/KcPZdBFApTo/w/NfBOTziN920DRiym1iDDlDevoHjNQpXmui/nwAAAP//
// DO NOT EDIT
package com.paypal.sdk.orders;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The display-only metadata for the payee.
 */
@Model
public class PayeeDisplayMetadata {

    // Required default constructor
    public PayeeDisplayMetadata() {}

	/**
	* The payer's business name.
	*/
	@SerializedName("brand_name")
	private String brandName;

	public String brandName() { return brandName; }
	
	public PayeeDisplayMetadata brandName(String brandName) {
	    this.brandName = brandName;
	    return this;
	}

	/**
	* The payee's phone number.
	*/
	@SerializedName("display_phone")
	private DisplayPhone displayPhone;

	public DisplayPhone displayPhone() { return displayPhone; }
	
	public PayeeDisplayMetadata displayPhone(DisplayPhone displayPhone) {
	    this.displayPhone = displayPhone;
	    return this;
	}

	/**
	* The email address for the payer. Maximum length is 127 characters.
	*/
	@SerializedName("email")
	private String email;

	public String email() { return email; }
	
	public PayeeDisplayMetadata email(String email) {
	    this.email = email;
	    return this;
	}
}
