// This class was generated on Mon, 29 Jan 2018 12:12:00 PST by version 0.1.0-dev+ecea6f of Braintree SDK Generator
// TemplateDeleteRequest.java
// @version 0.1.0-dev+ecea6f
// @type request
// @data H4sIAAAAAAAC/2SQQW/iMBCF7/srrHe2CLtH31YkK9DutrRFvVSoMvFAXDm2a09QI8R/r9JARen109PM994BN7olKDC10WmmiSFHTJAoKdfJRrbBQ6H8wFlocU5KsenFopxA4q6j1C910i0xpQz1tJaYkzaUrumfkNprttTcfGEHrPo4WGVO1u8g8aiT1RtHV7bP1kDiL/Un/k171ZBYlCJsBTf0qS44iLHnYP87Jd2PD6cS96TNrXc91Fa7TAN47WwiA8WpI4llCpESW8pQvnPuuB4zlHk8MsAB5Rh8pks2C57Jn2LQMTpb68G0eMnBQ2LOHP8TN8EMk1f/qlWFcR8oFPufhfX7YGvrd8W5Sy4OF2scIVG9RaqZzANr7vIsGIL6NZ0ef7wDAAD//w==
// DO NOT EDIT
package com.paypal.sdk.v1.invoices;

import com.braintreepayments.http.*;
import java.util.*;
import java.util.stream.Collectors;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
/**
 * Deletes a template, by ID.
 */
public class TemplateDeleteRequest extends HttpRequest<Void> {

    public TemplateDeleteRequest(String templateId) {
        super("/v1/invoicing/templates/{template_id}?", "DELETE", Void.class);
        try {
            path(path().replace("{template_id}", URLEncoder.encode(String.valueOf(templateId), "UTF-8")));
        } catch (UnsupportedEncodingException ignored) {}
        
        header("Content-Type", "application/json");
    }
    
}
