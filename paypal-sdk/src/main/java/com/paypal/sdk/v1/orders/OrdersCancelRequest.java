// This class was generated on Mon, 29 Jan 2018 12:12:01 PST by version 0.1.0-dev+ecea6f of Braintree SDK Generator
// OrdersCancelRequest.java
// @version 0.1.0-dev+ecea6f
// @type request
// @data H4sIAAAAAAAC/2SSTY/TMBCG7/yK0ZytZkGcfKuaoF3xsaFEe0ErOo1nicGxw3iCiKr+d5RkEaVcn3mVzPuMT/iBekaLSRxL3rQUWw5osOTcih/Up4gWdwvOQBGWoIHjBHelAYoOHAdWzqAdr9MNNAlaCgG08xl61i4583cOWUnHDP2YFY4McNjtq21TlQdIAodtXe/vH6rysEGDH0eWqSahnpUlo/38aPCWybFc0zdJ+mtWk3b/sBM20zAXzio+fkWDDySejoEvRXzxDg2+5ekZ/iek6RjuSkhPF610Lj17mvfeitC0/urG4J7J3ccwoX2ikHkGP0Yv7NCqjGywljSwqOeMNo4hnB/XDGddPzLDGeUhxcyXbJeicnyOIQ1D8C3Naxbfcopo8FZ1eL/cAC2W1buqqXA1gxaLny+LtuP2exq1WB9Bcfrj4IwGq18Dt8ru03KzXXKM9tXN6/OL3wAAAP//
// DO NOT EDIT
package com.paypal.sdk.v1.orders;

import com.braintreepayments.http.*;
import java.util.*;
import java.util.stream.Collectors;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
/**
 * Cancels an order, by ID, and deletes the order. To call this method, the order status must be  `CREATED` or `APPROVED`.
 */
public class OrdersCancelRequest extends HttpRequest<Void> {

    public OrdersCancelRequest(String orderId) {
        super("/v1/checkout/orders/{order_id}?", "DELETE", Void.class);
        try {
            path(path().replace("{order_id}", URLEncoder.encode(String.valueOf(orderId), "UTF-8")));
        } catch (UnsupportedEncodingException ignored) {}
        
        header("Content-Type", "application/json");
    }
    
}
