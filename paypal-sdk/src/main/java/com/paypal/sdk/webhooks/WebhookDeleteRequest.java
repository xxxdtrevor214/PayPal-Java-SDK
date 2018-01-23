// This class was generated on Tue, 23 Jan 2018 11:23:30 PST by version 0.1.0-dev+c58b80 of Braintree SDK Generator
// WebhookDeleteRequest.java
// @version 0.1.0-dev+c58b80
// @type request
// @data H4sIAAAAAAAC/2SQzU7jMBSF9/MU1llbTWc0K+9QE9SKvwIVG1Qht74lhtQ29g0QVX13ZBIELdtPx77fOTtc6i1B4Y1WtffPI0MNMUGipLSONrD1DgrlJ05CiyEoxaoTs3IEieuWYjfXUW+JKSao+6XElLSheExPfdwes7nm+oDtsOhCdkocrXuExJ2OVq8aOnR9sAYSZ9QN+Jf0oiYxK4XfCK7pS1ywF33J7H4So+76c2OJG9LmyjUd1EY3iTJ4aW0kA8WxJYl59IEiW0pQrm2a/bLPUOL+kwwzSsG7RD/ZxDsmN8SgQ2jsWmfR4il5B4kpc7ggrr3Je1fn1aJCvw4Uite/hfNsN8OjVAx1UrH7nmMPieo90JrJ3LLmNk28Iah/4//7Px8AAAD//w==
// DO NOT EDIT
package com.paypal.sdk.webhooks;

import com.braintreepayments.http.*;
import java.util.*;
import java.util.stream.Collectors;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
/**
 * Deletes a webhook, by ID.
 */
public class WebhookDeleteRequest extends HttpRequest<Void> {

    public WebhookDeleteRequest(String webhookId) {
        super("/v1/notifications/webhooks/{webhook_id}?", "DELETE", Void.class);
        try {
            path(path().replace("{webhook_id}", URLEncoder.encode(String.valueOf(webhookId), "UTF-8")));
        } catch (UnsupportedEncodingException ignored) {}
        
        header("Content-Type", "application/json");
    }
    
}
