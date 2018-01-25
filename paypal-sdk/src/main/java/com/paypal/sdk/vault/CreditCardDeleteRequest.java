// This class was generated on Fri, 26 Jan 2018 16:39:01 CST by version 0.1.0-dev+47ed6e of Braintree SDK Generator
// CreditCardDeleteRequest.java
// @version 0.1.0-dev+47ed6e
// @type request
// @data H4sIAAAAAAAC/2yRzW4aMRDH730Ka84uS3v0rWK3AvWLtiiXCKFhPWQdGdsZz6KsEO8emeUAJNefZzz/jyP8xj2BgZbJOvncItuJJU9CoKGm3LJL4mIAA/UZZ4XqgL0XsmpcUmVJq+2gFvUENPztiYclMu5JiDOYx7WGOaElvqffI+/v2RKlu2FHWA2paMzCLjyBhgdkh1tPN9o3RcbGWdDwg4bL0zsTq47UolZxp6Sjj4woiWoMoHj5xozDeH6q4R+h/RP8AGaHPlMBL71jsmCEe9Kw5JiIxVEGE3rvT+txhrKMnxRYUE4xZLpmsxiEwmUMMCXvWiyiq+ccA2iYi6RfJF20pYvmZ7NqYEwLDFSHL9XZTHVVZK6Ot9GcQEPzmqgVsv8Fpc+zaAnM1+n09OkNAAD//w==
// DO NOT EDIT
package com.paypal.sdk.vault;

import com.braintreepayments.http.*;
import java.util.*;
import java.util.stream.Collectors;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
/**
 * Deletes a vaulted credit card, by ID.
 */
public class CreditCardDeleteRequest extends HttpRequest<Void> {

    public CreditCardDeleteRequest(String creditCardId) {
        super("/v1/vault/credit-cards/{credit_card_id}?", "DELETE", Void.class);
        try {
            path(path().replace("{credit_card_id}", URLEncoder.encode(String.valueOf(creditCardId), "UTF-8")));
        } catch (UnsupportedEncodingException ignored) {}
        
        header("Content-Type", "application/json");
    }
    
}
