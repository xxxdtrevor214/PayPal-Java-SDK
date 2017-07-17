// This class was generated on Mon, 17 Jul 2017 10:51:10 PDT by version 0.01 of Braintree SDK Generator
// ProcessorResponse.java
// DO NOT EDIT
// @type object
// @json {"Type":"Processor Response","VariableName":"","Description":"A collection of payment response-related fields returned from a payment request.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":[{"Type":"string","VariableName":"advice_code","Description":"The merchant advice on how to handle declines for recurring payments.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"avs_code","Description":"The [Address Verification System (AVS)](https://developer.paypal.com/webapps/developer/docs/classic/api/AVSResponseCodes/) response code.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"cvv_code","Description":"The [CVV](https://developer.paypal.com/webapps/developer/docs/classic/api/AVSResponseCodes/) system response code.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"eci_submitted","Description":"The processor-provided authorization response.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"response_code","Description":"The PayPal normalized response code, which is generated from the processor's specific response code.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null},{"Type":"string","VariableName":"vpas","Description":"The processor-provided Visa Payer Authentication Service status.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.payments.object;

import java.util.Map;
import java.util.List;
import com.google.gson.annotations.SerializedName;
/**
 * A collection of payment response-related fields returned from a payment request.
 */
public class ProcessorResponse {

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
