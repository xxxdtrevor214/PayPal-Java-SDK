// This class was generated on Mon, 29 Jan 2018 12:12:04 PST by version 0.1.0-dev+ecea6f of Braintree SDK Generator
// EventListRequest.java
// @version 0.1.0-dev+ecea6f
// @type request
// @data H4sIAAAAAAAC/+xYUVPbRhB+76/YufYhzMiyCQ1NPNMHmpDCNE0ocfpQhkFraW1dkO6UuxWOk8l/75xOEsgCnGkc6AOP2jvpvt1v99vVfRavMScxFnRBisNMWhaBeEE2NrJgqZUYi1fSsoUFTVOtz6HaCEqznMkY3RYbwjtL8KEks4QCDebEZCywhpnMmAxwSmDIFlpZCkUg/nJbj9qdYnzyWUyWhcNh2Ug1F4H4G43EaUYNPpWcscxJBOIPWtbGHtSX1Xm2OvAWwCBVB5ODyqm2BLEhZEpAK9AGcNagjyyj4QpBBKiaDVOaaUPAqbSQIFO15DaF8JvmFC4wK8kCGnJHnhwqJqOIu3thpk2OfPooZS7seDhkrTMbSuJZqM18mHKeDc0s3tnZefajpdi5MHgS7m7VL4aw/xHzIqMxRE2Yfn082t4ZjHYGo93J9vZ4NBqPRv9ELvZ7xuDSB3sUiGPC5I3KlmI8w8ySM3wopaGkNRwZXZBhSVaMVZllX4L1XLmIn7Hb9NVsXaUCwUo1z8hTt2HQUjHNyfRRFzinMys/rQE9SQlUmU/JgJ7dmmSswRCXRq2m2x3RcJmy91I0qyVxXdnQZcZGvljuq3Aug3WvpcMGlcUK6ZlMvrF8rnwsgOkSDl9sxIvTQBwQJmQ6Cn4aiJfa5Ku2I+R01eaOIMseg/ukM3n83taGyadh3ZVWQnV7cFzTulKg1me0/dYAnKzXkViXijvgGsttQiKZ8qrECOMUDKo5ObMhW2ZsQ3it2RUMcpfuXM5ThhQvCGa0IFN/h1NsirUKNSUQtfrWVNpmM3rfxfeGXmA74WhN3XjsKUAHZz1ru/+dtZvqzktYXyy79j6BXT1apKTWyCgs0DaCGXwPbbvfHt8x98Pl4+HT2Mj5nAwlawJ2p/5ckLEObd+ly5WbvKp3NG2y8egefFlpHNVjH/XhC1dpdxr8V1KdwxUk8Gb6nuJrVCOT6rwrGo3lZs2opW5gKKumkZODvcn+m723UL16+miY6NgOsZDDFJk02kG1sPX9xSU1NOs4Uxv6nMTajSNO6dHMieHd8asQJhpyPKdaz71zMWZZ4LZPpfIrOXGqE1hITv3w5bzzCvPu+BCY8sK9+rW6svvkl9FWCIcqzsqkHtV+igKIHkVBJVLRVgRxigbjagiZaQOFoUFhdEzWDSAhOI8i52sE0o8p57SEhhbnq1atHlRkALYh8D56fxBsObWOX8WV+Y4Kyce0Q11r6pN3MJkcNTSY+nQ3j11L3h15YCjrwPfPfewnLvweoKtLJ+BrU+TJs6dP29bz81YAi1TGKVgyF250t4DKiYzLDKzo9USXCvOpnJe6tNkSkgrKlHx+WMpRsYxtI03utRDeEsFJJR7HNUJ7iW6xWIQSFVbY0Fo5V7kbGobu3UHj0upj+NG5sZlueXqFCH2DohmyujQxrbDRGvuUNIv/y3bZgOtPAKsr1wy9mFPDb+tkUxvVT+X13fO7XAfc+PNc5jmaZce1S9tKF4J6pc5m39tc3nM7HXQ4gpfaAPl/zwCiPShw6XIWsORUG/mpNyqG0aYTdeO9+KGNPrTRhzb60Ea/QZ1OvwTiuVZMqr4cElgUWa2aw/e2+v86YC7+9OkzFr/vT4S/ZBJjMbzYHnauLIfNPcKgvXPY/1hQzJS8ZeTSPtcJifHj0ejLD/8CAAD//w==
// DO NOT EDIT
package com.paypal.sdk.v1.webhooks;

import com.braintreepayments.http.*;
import java.util.*;
import java.util.stream.Collectors;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
/**
 * Lists webhook event notifications. Use query parameters to filter the response.
 */
public class EventListRequest extends HttpRequest<EventList> {

    public EventListRequest() {
        super("/v1/notifications/webhooks-events?", "GET", EventList.class);
        
        header("Content-Type", "application/json");
    }

    public EventListRequest endTime(String endTime) {
        String params = String.valueOf(endTime);
        try {
		    path(path() + "end_time=" + URLEncoder.encode(params, "UTF-8") + "&");
        } catch (UnsupportedEncodingException ignored) {}
        return this;
    }

    public EventListRequest eventType(String eventType) {
        String params = String.valueOf(eventType);
        try {
		    path(path() + "event_type=" + URLEncoder.encode(params, "UTF-8") + "&");
        } catch (UnsupportedEncodingException ignored) {}
        return this;
    }

    public EventListRequest pageSize(Integer pageSize) {
        String params = String.valueOf(pageSize);
        try {
		    path(path() + "page_size=" + URLEncoder.encode(params, "UTF-8") + "&");
        } catch (UnsupportedEncodingException ignored) {}
        return this;
    }

    public EventListRequest startTime(String startTime) {
        String params = String.valueOf(startTime);
        try {
		    path(path() + "start_time=" + URLEncoder.encode(params, "UTF-8") + "&");
        } catch (UnsupportedEncodingException ignored) {}
        return this;
    }

    public EventListRequest transactionId(String transactionId) {
        String params = String.valueOf(transactionId);
        try {
		    path(path() + "transaction_id=" + URLEncoder.encode(params, "UTF-8") + "&");
        } catch (UnsupportedEncodingException ignored) {}
        return this;
    }
    
}
