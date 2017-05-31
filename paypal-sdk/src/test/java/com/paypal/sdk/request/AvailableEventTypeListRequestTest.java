// This class was generated on Fri, 26 May 2017 11:06:13 PDT by version 0.01 of Braintree SDK Generator
// AvailableEventTypeList.java
// DO NOT EDIT
// @type request
// @json {"Name":"available-event-type.list","Description":"Lists available events to which any webhook can subscribe. For a list of supported events, see [Webhook event names](/docs/integration/direct/webhooks/event-names/).","Parameters":[],"RequestType":null,"SuccessResponseType":{"Type":"Webhook Event Type List","VariableName":"","Description":"List of webhook events.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null},"DefaultResponseType":{"Type":"error","VariableName":"","Description":"Details about an error.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null},"HttpMethod":"GET","Path":"/v1/notifications/webhooks-event-types","Visible":true}

package com.paypal.sdk.request;

import com.braintreepayments.http.HttpResponse;
import com.braintreepayments.http.exceptions.APIException;
import com.paypal.core.PayPalEnvironment;
import com.paypal.core.PayPalHttpClient;
import com.paypal.sdk.object.EventTypeList;
import org.testng.annotations.Test;

import java.io.IOException;


public class AvailableEventTypeListRequestTest {

	@Test
	public void testAvailableEventTypeListRequest() throws IOException {
//		PayPalHttpClient client = new PayPalHttpClient(new PayPalEnvironment.Sandbox("AelYYn02_l-ihI2nkHTwPshVIw1_SgqrthwKDjRCwuZJb_RNWhlv0TUvr0SSf1y2cLYlOxyKa7x3QLs9",
//				"EBhm_gir01y0D_d2aIEDQLT5rfXS64q2RtrIZkyewjOidx9qVVJD_D2kxSe8x3YHfkKTHV-K-9Z22Wes"));
//
//		AvailableEventTypeListRequest request = new AvailableEventTypeListRequest();
//
//		HttpResponse<EventTypeList> resp = client.execute(request);
//		EventTypeList eventTypeList = resp.result();
//		assertTrue(eventTypeList.getEventTypes().size() > 0);
//		assertEquals(200, resp.statusCode());

		PayPalEnvironment environment = new PayPalEnvironment.Sandbox(
				"AYSq3RDGsmBLJE-otTkBtM-jBRd1TCQwFf9RGfwddNXWz0uFU9ztymylOhRS",
				"EGnHDxD_qRPdaLdZz8iCr8N7_MzF-YHPTkjs6NKYQvQSBngp4PTTVWkPZRbL");

		PayPalHttpClient client = new PayPalHttpClient(environment);

		AvailableEventTypeListRequest request = new AvailableEventTypeListRequest();

		try {
			HttpResponse<EventTypeList> resp = client.execute(request);
			EventTypeList eventTypeList = resp.result();
		} catch(IOException ioe) {
			if (ioe instanceof APIException) {
				APIException exception = (APIException) ioe;
				String debugId = exception.getHeaders().header("Paypal-Debug-Id");
			} else {
				ioe.printStackTrace();
			}
		}
	}
}
