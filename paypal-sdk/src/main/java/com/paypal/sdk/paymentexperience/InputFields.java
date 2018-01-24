// This class was generated on Tue, 23 Jan 2018 14:59:52 PST by version 0.1.0-dev+c58b80 of Braintree SDK Generator
// InputFields.java
// @version 0.1.0-dev+c58b80
// @type object
// @data H4sIAAAAAAAC/8RUTW8TMRC98ytGvnCJ0gC33JCqogoJqqrqBVA1sSfZEV7bzMxSFtT/jjZO0uZLpWolDlHWz/P1xm/mj7vqC7mpO0+lMzhjikHdyF2jMM4ifcJ2uHUj95H6+8MpqRcuxjm5qbtqCHjpPx/8wXdqueXfONxDQcGWjETHbuTei2Bfc05G7pIwfE6xd9M5RqUB+NGxUNgAF5ILiTGpm37ZVMvJaEGyXyiGIKR6k3+SCAfaKvzA5TaR8xTYo5HCbUPWkIBlCKwlYg/WEGjDpXBawCoUWIMGrFBQlcJgbg0reIwRBGuIBtPSOafhB3OOBPMs1XLW9SQDPFhcYH+BEehXIWFKnqDggnQM1xg7Atbp124yeee7uPyneor88ORzqF80qcDJPTKG00pGD7NZVTdeOW4HPpbmzZPTaCHPc6YAnO77NV4aV+2QgMeUsgEFtmqzG+ZwlSfr3jxTa6mL8W60Edws50iYDgguxnx7k7LtSO0h/KjIdngDJSMBhMG/aoqgJfENJtvRyiAQCJ0MjfEN+e+5s/HLcj86bCnfrB9li/w2/hj7FZGwlsyeXJZLRde8/+dw7PRdnz8olxTQ23HSc8ntflo4ywKBF2wYYZFz0FGdkbp/WUFW7wuYArSdGswI/qGgJxF6e4DQB7Ij/dtQWUv9tQJ6n7tkUCQfXzwvOtLf7l79BQAA//8=
// DO NOT EDIT
package com.paypal.sdk.paymentexperience;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The input field customization parameters.
 */
@Model
public class InputFields {

    // Required default constructor
    public InputFields() {}

	/**
	* Indicates whether to display the shipping address that is passed to this call rather than the one on file for this buyer on the PayPal experience pages. Value is:<ul><li><code>0</code>. Displays the shipping address on file.</li><li><code>1</code>. Displays the shipping address specified in this call. the customer cannot edit this shipping address.</li></ul>
	*/
	@SerializedName("address_override")
	private Integer addressOverride;

	public Integer addressOverride() { return addressOverride; }
	
	public InputFields addressOverride(Integer addressOverride) {
	    this.addressOverride = addressOverride;
	    return this;
	}

	/**
	* Indicates whether the customer can enter a note to the merchant on the PayPal page during checkout.
	*/
	@SerializedName("allow_note")
	private Boolean allowNote;

	public Boolean allowNote() { return allowNote; }
	
	public InputFields allowNote(Boolean allowNote) {
	    this.allowNote = allowNote;
	    return this;
	}

	/**
	* Indicates whether PayPal displays shipping address fields on the experience pages. Value is:<ul><li><code>0</code>. Displays the shipping address on the PayPal pages.</li><li><code>1</code>. Redacts shipping address fields from the PayPal pages. For digital goods, this field is required and must be <code>1</code>.</li><li><code>2</code>. Gets the shipping address from the customer's account profile.</li></ul>
	*/
	@SerializedName("no_shipping")
	private Integer noShipping;

	public Integer noShipping() { return noShipping; }
	
	public InputFields noShipping(Integer noShipping) {
	    this.noShipping = noShipping;
	    return this;
	}
}
