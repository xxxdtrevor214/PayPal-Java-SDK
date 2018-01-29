// This class was generated on Tue, 23 Jan 2018 14:59:52 PST by version 0.1.0-dev+c58b80 of Braintree SDK Generator
// FlowConfig.java
// @version 0.1.0-dev+c58b80
// @type object
// @data H4sIAAAAAAAC/7yUz2/rNgzH7/srCJ+9tMBuAXbY2q0bVrRBl3WHbXAYmY6FyJRHUcuMof/7oDi/3CQt2vdeb7b4JUV+SPG/bNq1lI2zH51fwZXnyi6yPHtEsTh3dIdNMmZ59gt1+59rCkZsq9ZzNs6mNUGV3M3aPQomA7Qo2JCShFGWZ9+JYNffdZlnD4TlPbsuG1foAqWDv6MVKncHE/EtiVoK2fiPXZZBxfKJBOfIy0L/5aIlLi0viihukPQZwXEhDYmpkRWCVYLfHm5BPZQ2tA47wEpJACFFAxXkUJFAi11DrCP4meGGpEHucvgHnS3Bs+ug8gJaE9xY8S12Wz00pLUvwcvpeBv7p8Lj6NxT/ipBhz2XFhdUaNIe4jtlPWaXDOAr2KghqQ/xeV5zmGA3QdcDTmxiIAFTk1n6qCOY+nSyVrLnrzdqNMZH1kHsHAJpumD2vXXO8mI28H7u6ReWz/jfJtvsg1ALaRQuotiiVm2Lvs8D3mclx9B/mk4n21HSTfEehEorZHQNwsSgviFJBoQ+dhrtETyiiwQ2wOzmh+ksjeJscv/r9KNIpM4XaNbVHJY/PB/WPBEKxBqArNbUv6w/4+XlNyaoeF6sv+nKs1qO1FsuDk2pymOHCXZw51en9NvR7Jec+gHTUe8xl4te/ez3miqMThPiNyWZ77M0vuwVdIDlWzP03YtG8HtNDJ2PUHpgr7DklHZa0pbR7dYLNulZ5Ol9UJsGxQYoN+mmSnNY1dbUu1EKR7N08Mi2QddPfmW1fkdf5lHV8yb/wV3GWbN8M8FhCGRIi33R74YhhFeauCf6Csq0Tl5uWtNYPWpZYmlq7zd7603D+cU69cKd72jU+Wj5oB82QCveUAhUgm0aKi0que6zLKS/nr76HwAA//8=
// DO NOT EDIT
package com.paypal.sdk.paymentexperience;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The flow configuration parameters.
 */
@Model
public class FlowConfig {

    // Required default constructor
    public FlowConfig() {}

	/**
	* The merchant site URL to display after a bank transfer payment. In Germany, valid only for the Giropay payment method or bank transfer payment method.
	*/
	@SerializedName("bank_txn_pending_url")
	private String bankTxnPendingUrl;

	public String bankTxnPendingUrl() { return bankTxnPendingUrl; }
	
	public FlowConfig bankTxnPendingUrl(String bankTxnPendingUrl) {
	    this.bankTxnPendingUrl = bankTxnPendingUrl;
	    return this;
	}

	/**
	* The type of landing page to display on the PayPal site for user checkout. To use the non-PayPal account landing page, set to `Billing`. To use the PayPal account login landing page, set to `Login`.
	*/
	@SerializedName("landing_page_type")
	private String landingPageType;

	public String landingPageType() { return landingPageType; }
	
	public FlowConfig landingPageType(String landingPageType) {
	    this.landingPageType = landingPageType;
	    return this;
	}

	/**
	* The HTTP method to use to redirect the customer to a return URL. Value is `GET` or `POST`.
	*/
	@SerializedName("return_uri_http_method")
	private String returnUriHttpMethod;

	public String returnUriHttpMethod() { return returnUriHttpMethod; }
	
	public FlowConfig returnUriHttpMethod(String returnUriHttpMethod) {
	    this.returnUriHttpMethod = returnUriHttpMethod;
	    return this;
	}

	/**
	* Presents either the <strong>Continue</strong> or <strong>Pay Now</strong> checkout flow to the customer.<br/><br/>Default is <strong>Continue</strong>, or <code>user_action=continue</code>. When you do not know the final payment amount, accept this default flow, which redirects the customer to the PayPal payment page with the <strong>Continue</strong> button. When the customer clicks <strong>Continue</strong>, the customer can change the payment amount.<br/><br/> When you know the final payment amount, set <code>user_action=commit</code> to choose the <strong>Pay Now</strong> flow, which redirects the customer to the PayPal payment page with the <strong>Pay Now</strong> button. When the customer clicks <strong>Pay Now</strong>, the payment is processed immediately.
	*/
	@SerializedName("user_action")
	private String userAction;

	public String userAction() { return userAction; }
	
	public FlowConfig userAction(String userAction) {
	    this.userAction = userAction;
	    return this;
	}
}
