// This class was generated on Mon, 31 Jul 2017 18:27:14 UTC by version 0.1 of Braintree SDK Generator
// ProcessorResponse.java
// DO NOT EDIT
// @type object
// @json {"Type":"Processor Response","VariableName":"","Description":"A collection of payment response-related fields returned from a payment request.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":[{"Type":"string","VariableName":"advice_code","Description":"The merchant advice on how to handle declines for recurring payments.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"avs_code","Description":"The [Address Verification System (AVS)](https://developer.paypal.com/webapps/developer/docs/classic/api/AVSResponseCodes/) response code.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"cvv_code","Description":"The [CVV](https://developer.paypal.com/webapps/developer/docs/classic/api/AVSResponseCodes/) system response code.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"eci_submitted","Description":"The processor-provided authorization response.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"response_code","Description":"The PayPal normalized response code, which is generated from the processor's specific response code.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null},{"Type":"string","VariableName":"vpas","Description":"The processor-provided Visa Payer Authentication Service status.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.payments.object;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.serializer.Serializable;
import com.braintreepayments.http.serializer.Deserializable;

/**
 * A collection of payment response-related fields returned from a payment request.
 */
public class ProcessorResponse implements Serializable, Deserializable {

    // Required default constructor
    public ProcessorResponse() {}

	/**
	* The merchant advice on how to handle declines for recurring payments.
	*/
	private String adviceCode;

	public String adviceCode() { return adviceCode; }
	
	public ProcessorResponse adviceCode(String adviceCode) {
	    this.adviceCode = adviceCode;
	    return this;
	}

	/**
	* The [Address Verification System (AVS)](https://developer.paypal.com/webapps/developer/docs/classic/api/AVSResponseCodes/) response code.
	*/
	private String avsCode;

	public String avsCode() { return avsCode; }
	
	public ProcessorResponse avsCode(String avsCode) {
	    this.avsCode = avsCode;
	    return this;
	}

	/**
	* The [CVV](https://developer.paypal.com/webapps/developer/docs/classic/api/AVSResponseCodes/) system response code.
	*/
	private String cvvCode;

	public String cvvCode() { return cvvCode; }
	
	public ProcessorResponse cvvCode(String cvvCode) {
	    this.cvvCode = cvvCode;
	    return this;
	}

	/**
	* The processor-provided authorization response.
	*/
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
	private String responseCode;

	public String responseCode() { return responseCode; }
	
	public ProcessorResponse responseCode(String responseCode) {
	    this.responseCode = responseCode;
	    return this;
	}

	/**
	* The processor-provided Visa Payer Authentication Service status.
	*/
	private String vpas;

	public String vpas() { return vpas; }
	
	public ProcessorResponse vpas(String vpas) {
	    this.vpas = vpas;
	    return this;
	}

    @Override
    public void serialize(Map<String, Object> serialized) {
        if (adviceCode != null) {
            serialized.put("advice_code", this.adviceCode);
        }
        if (avsCode != null) {
            serialized.put("avs_code", this.avsCode);
        }
        if (cvvCode != null) {
            serialized.put("cvv_code", this.cvvCode);
        }
        if (eciSubmitted != null) {
            serialized.put("eci_submitted", this.eciSubmitted);
        }
        if (responseCode != null) {
            serialized.put("response_code", this.responseCode);
        }
        if (vpas != null) {
            serialized.put("vpas", this.vpas);
        }
    }

    @Override
    public void deserialize(Map<String, Object> values) {
        if (values.containsKey("advice_code")) {
            this.adviceCode = (String) values.get("advice_code");
        }
        if (values.containsKey("avs_code")) {
            this.avsCode = (String) values.get("avs_code");
        }
        if (values.containsKey("cvv_code")) {
            this.cvvCode = (String) values.get("cvv_code");
        }
        if (values.containsKey("eci_submitted")) {
            this.eciSubmitted = (String) values.get("eci_submitted");
        }
        if (values.containsKey("response_code")) {
            this.responseCode = (String) values.get("response_code");
        }
        if (values.containsKey("vpas")) {
            this.vpas = (String) values.get("vpas");
        }
    }
}

