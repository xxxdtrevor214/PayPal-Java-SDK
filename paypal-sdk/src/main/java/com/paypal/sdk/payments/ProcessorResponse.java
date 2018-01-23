// This class was generated on Mon, 22 Jan 2018 14:30:02 PST by version 0.1.0-dev+8c35d5 of Braintree SDK Generator
// ProcessorResponse.java
// @version 0.1.0-dev+8c35d5
// @type object
// @data H4sIAAAAAAAC/8SUz27bMAzG73sKQpe1gBvvnJvR3QZsQVP4UhQBIzG1AFlSSdmBO/TdBzXNH9cFNqxbe+RHwubvI8Wf6nqIpOYqctAkEnjFJDF4IVWoGtni2tF3bHONKtQ3Go7BVxLNNiYbvJqrCnRwjnQOIWwg4tCST7D/3gWTw0QGNpacEWBKHfscc2gBT+rvO5I0U4WqmHHYNfilUFeE5od3g5pv0All4b6zTOYgLDhE4mRJ1PzmgCaJrb+b4qDpraaVDoZGZGN9DHndELTEukGfYFcIwUMTtpACNOiNIzCknfUksAkMTLrj3MAeUN5K5jvnHovf4/XyCttRnILdVMYwiUBNbDdW49Mol4MkauGsqpfnt2dNSlHmZWmoJ5d7mkUcIrqZDm25pTXGKMdkaYKWUjsUsbrEaMuqXl49L8RlMCTl+WFBIDf2Tubovp+acyK+Ys5lXf8XfNn5+xEukLYr6datTYnMyIqXmakfh4NxETn01pAB7FIT2D7s9mYP9E4s+99Nx/oyM2VZ4LBABz5wi84+kBlPo4BtY3UDVuCOPPHuiuWrlU6N+CwgkXR+OW+YZuLu7wzoI8qI+1n4o9HVVjDbQAxVlxry6fD8iZ+unCRM3b+5XbePn34BAAD//w==
// DO NOT EDIT
package com.paypal.sdk.payments;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * A collection of payment response-related fields returned from a payment request.
 */
@Model
public class ProcessorResponse {

    // Required default constructor
    public ProcessorResponse() {}

	/**
	* The merchant advice on how to handle declines for recurring payments.
	*/
	@SerializedName("advice_code")
	private String adviceCode;

	public String adviceCode() { return adviceCode; }
	
	public ProcessorResponse adviceCode(String adviceCode) {
	    this.adviceCode = adviceCode;
	    return this;
	}

	/**
	* The [Address Verification System (AVS)](https://developer.paypal.com/webapps/developer/docs/classic/api/AVSResponseCodes/) response code.
	*/
	@SerializedName("avs_code")
	private String avsCode;

	public String avsCode() { return avsCode; }
	
	public ProcessorResponse avsCode(String avsCode) {
	    this.avsCode = avsCode;
	    return this;
	}

	/**
	* The [CVV](https://developer.paypal.com/webapps/developer/docs/classic/api/AVSResponseCodes/) system response code.
	*/
	@SerializedName("cvv_code")
	private String cvvCode;

	public String cvvCode() { return cvvCode; }
	
	public ProcessorResponse cvvCode(String cvvCode) {
	    this.cvvCode = cvvCode;
	    return this;
	}

	/**
	* The processor-provided authorization response.
	*/
	@SerializedName("eci_submitted")
	private String eciSubmitted;

	public String eciSubmitted() { return eciSubmitted; }
	
	public ProcessorResponse eciSubmitted(String eciSubmitted) {
	    this.eciSubmitted = eciSubmitted;
	    return this;
	}

	/**
	* REQUIRED
	* The PayPal normalized response code, which is generated from the processor's specific response code.
	*/
	@SerializedName("response_code")
	private String responseCode;

	public String responseCode() { return responseCode; }
	
	public ProcessorResponse responseCode(String responseCode) {
	    this.responseCode = responseCode;
	    return this;
	}

	/**
	* The processor-provided Visa Payer Authentication Service status.
	*/
	@SerializedName("vpas")
	private String vpas;

	public String vpas() { return vpas; }
	
	public ProcessorResponse vpas(String vpas) {
	    this.vpas = vpas;
	    return this;
	}
}
