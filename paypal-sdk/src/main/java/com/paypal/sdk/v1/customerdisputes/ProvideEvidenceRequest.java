// This class was generated on Mon, 09 Apr 2018 16:10:52 UTC by version 0.1.0-dev+291f3f of Braintree SDK Generator
// ProvideEvidenceRequest.java
// @version 0.1.0-dev+291f3f
// @type object
// @data H4sIAAAAAAAC/8xXTY8jNRC98ytKzQWkbDLSiJXIbaXhEIGW0TDLZRlFjl2dNuu2e8rlhAbx35H7K/2VgCAbcUnUVa/l96rKz+4/kueywGSdPJI7aIXwXfy1EuEJXwN6ThbJz4K02Bl8L/KITBbJ91ieHh7QS9IFa2eTdfIOqH4RdiUIyJFkJiyDI9iFEgnYQdGshe1aqSMQoLQvAuMyWSTviERZM7tbJE8o1I/WlMk6FcZjDLwGTai6wCO5Aok1+mT9sdPUaplqaFf2AzH96EiVBREpgUs71r6izRmeIf723xP3TNrup7SVYBwwbgJDss+RkmAEYRWwznEB2sLHjWUkizzMRRG54JevMubCr1crds74pUZOl472q4xzs6JU3t/ff/ulRxnXePPN8u3XS/gJpbPKgyCsmh6FwTHTBiElUSGFAd9DuaIOLn8Jd3f3cmec/PQaHGP1XP9Kz+Tsvo68d4zrOrzqxyFqJNwHIwjwt4LQe+1sO1ke9kErEUdrFxiUQw/WMRD+ipJBGAPaHoTRqiqGb/isxoT+4yTaYMyfi66rD06GHO3MllJNZjiO/ej5cexQwJlgOCIh+LDLNTMqEL6b188/njb+9RU0gZnxbEhDRCyvW+Zz7Lz+fciuCVxgFxE3YhfIDMjVzxe4fXjaXIXaS49cZ/4bW9tCXPeseW61Td2sgbaZKf0W8YbQiDig+rTS9Yz/XJEJ02DVVqvhRhuEz++0Ggabh5PzMwnra6uLjuLMoZIEnGl/rWNhNEDPJOQnbfeXe8QNatqjceaSXoOHeHa3r/SbddMS/H1npSDSSNuJBY0S04mMiag2amnAnTaf6aLabE2+r7VyW+1BeO+krmb5qDm7pPtzeUfXUhvyHdJ8u7vctARdf2vMVP5cr/9PusfmOUpMFX94+iFeRCtcpUwz5p3eK/nqyz+Q0DkmR9yslzaZmbaVBfYvpDeqeizVVqsB2VNsSnPz0G6fiLoRSet4dLlvI2O/K6dnUgW91a3EBZKje0kbmtayTrX17BoPG6u0jDdZOGbIGRI8ivJRmPZjDNXghUXtdsGzy5F618UhqNn13TfcPO5qu+WLvwAAAP//
// DO NOT EDIT
package com.paypal.sdk.v1.customerdisputes;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * A request by a merchant or buyer to provide evidence for a dispute.
 */
@Model
public class ProvideEvidenceRequest {

    // Required default constructor
    public ProvideEvidenceRequest() {}

	/**
	* An array of evidences for the dispute.
	*/
	@SerializedName(value = "evidences", listClass = Evidence.class)
	private List<Evidence> evidences;

	public List<Evidence> evidences() { return evidences; }
	
	public ProvideEvidenceRequest evidences(List<Evidence> evidences) {
	    this.evidences = evidences;
	    return this;
	}
}
