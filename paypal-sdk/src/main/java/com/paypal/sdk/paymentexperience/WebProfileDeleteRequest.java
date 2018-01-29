// This class was generated on Tue, 23 Jan 2018 14:59:52 PST by version 0.1.0-dev+c58b80 of Braintree SDK Generator
// WebProfileDeleteRequest.java
// @version 0.1.0-dev+c58b80
// @type request
// @data H4sIAAAAAAAC/2SRT4/TMBDF73wKa87eTeHoG9oE7Yp/BSouaIWc+JUYObYZT9hGVb87Colo6V5/Gnt+896RPtgBZOgJ7U3mtPcBtw4BAtJUo3Tss/gUyVD9Fxdl1RNahUMGe8QOan2nVTuph/qWNH0awdPWsh0g4ELm26Ome1gHvqZvEg/XbGul/48daTflWbMI+/iDNH217G0bsOqvCt+9I01vMa342Q27HuqhVmmvpP8nriSp5ebZ/TWznZZ1G02fYd3HGCYyexsKZvBr9AxHRniEpi2nDBaPQiaOIZwelxkUWT6Z4YxKTrHgkt2lKIjrGNmcg+/sLFr9LCmSpnuR/B7SJzfH37xrdg0t6ZCh6vfLKttpQJSbcxnVRZGlOp5zOZGm5pDRCdwXsTKWu+RA5tVmc3rxBwAA//8=
// DO NOT EDIT
package com.paypal.sdk.paymentexperience;

import com.braintreepayments.http.*;
import java.util.*;
import java.util.stream.Collectors;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
/**
 * Deletes a web experience profile, by ID.
 */
public class WebProfileDeleteRequest extends HttpRequest<Void> {

    public WebProfileDeleteRequest(String profileId) {
        super("/v1/payment-experience/web-profiles/{profile_id}?", "DELETE", Void.class);
        try {
            path(path().replace("{profile_id}", URLEncoder.encode(String.valueOf(profileId), "UTF-8")));
        } catch (UnsupportedEncodingException ignored) {}
        
        header("Content-Type", "application/json");
    }
    
}
