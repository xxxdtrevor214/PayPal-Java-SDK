// This class was generated on Mon, 29 Jan 2018 12:12:00 PST by version 0.1.0-dev+ecea6f of Braintree SDK Generator
// InvoiceSendRequest.java
// @version 0.1.0-dev+ecea6f
// @type request
// @data H4sIAAAAAAAC/5STQW/aThDF7/9PMZqzhfm3N9+i0CpR1YQW1EsbhcE74G2XHbM7m9ZCfPdqsZNCQiP1gti345n3fmPv8IY2jBVa/yC25lFkb7DACcc62FateKxwxt5EIA9DVQHLDq4nBagAQZ2iyobD6Fsaj9/WSyf1j20S5cO5/62jBvHrXrkR5aqXy2MdLlbKATpJkG2cDMxiTd6LQuDDrdVhYHl+4jKU/fH2EIOc6wqIrKANw8KL2lV3v+FQN+R1AdvEoYOWAm04u8jRXJTeSX7ksfTIFqTWkDIcmtma8pwRTHhFySnYCAsNiRcjLPBTbj997B6x+rrDeddm9EsRx+SxwC8ULC0dDzt55hEL/MDdcPdiR9feZAcc4WfD2vQJnsy/YjjXHef7S4CLEKjrHY8L/Mxkbr3rsFqRi5yFbbKBzZMwDdJyUMsRK5+c298VeMVkOJxQuCvwvYTNc21K2pynFTVYv34Ja0h4b83rnOYNw/UEZHXCZWD1T0EzmvM5cw1H7ZtkMUuxFR/5WLsUr+yHMqS2dcNKyu9R8vtwpdp+ZG3EYIXT29kcezJYYfnwf9mbt349/ONY7v5g2JfDt/zuV8u1spkpaYqXYhirN+Px/r/fAAAA//8=
// DO NOT EDIT
package com.paypal.sdk.v1.invoices;

import com.braintreepayments.http.*;
import java.util.*;
import java.util.stream.Collectors;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
/**
 * Sends an invoice, by ID, to a customer.<blockquote><strong>Note:</strong> After you send an invoice, you cannot resend it.</blockquote><br/>Optionally, set the `notify_merchant` query parameter to also send the merchant an invoice update notification. Default is `true`.
 */
public class InvoiceSendRequest extends HttpRequest<Void> {

    public InvoiceSendRequest(String invoiceId) {
        super("/v1/invoicing/invoices/{invoice_id}/send?", "POST", Void.class);
        try {
            path(path().replace("{invoice_id}", URLEncoder.encode(String.valueOf(invoiceId), "UTF-8")));
        } catch (UnsupportedEncodingException ignored) {}
        
        header("Content-Type", "application/json");
    }

    public InvoiceSendRequest notifyMerchant(Boolean notifyMerchant) {
        String params = String.valueOf(notifyMerchant);
        try {
		    path(path() + "notify_merchant=" + URLEncoder.encode(params, "UTF-8") + "&");
        } catch (UnsupportedEncodingException ignored) {}
        return this;
    }
    
}
