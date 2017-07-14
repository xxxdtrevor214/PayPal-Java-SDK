// This class was generated on Thu, 13 Jul 2017 09:07:17 PDT by version 0.01 of Braintree SDK Generator
// TemplateGetTemplatesRequest.java
// DO NOT EDIT
// @type request
// @json {"Name":"template.get_templates","Description":"Lists all merchant-created templates. The list shows the emails, addresses, and phone numbers from the merchant profile.","Parameters":[{"Type":"string","VariableName":"fields","Description":"The fields to return in the response. Value is `all` or `none`. Specify `none` to return only the template name, ID, and default attributes.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null,"Location":"query"}],"RequestType":null,"ResponseType":{"Type":"Templates","VariableName":"","Description":"List of merchant templates.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},"ContentType":"application/json","HttpMethod":"GET","Path":"/v1/invoicing/templates/","ExpectedStatusCode":200}

package com.paypal.sdk.invoices.request;

import com.braintreepayments.http.*;
import com.paypal.sdk.invoices.object.*;
import java.util.List;


/**
 * Lists all merchant-created templates. The list shows the emails, addresses, and phone numbers from the merchant profile.
 */
public class TemplateGetTemplatesRequest extends HttpRequest<Templates> {

    public TemplateGetTemplatesRequest() {
        super("/v1/invoicing/templates/?", "GET", Templates.class);
    }

    public TemplateGetTemplatesRequest fields(String fields) {
		path(path() + "fields=" + String.valueOf(fields) + "&");
        return this;
    }
}
