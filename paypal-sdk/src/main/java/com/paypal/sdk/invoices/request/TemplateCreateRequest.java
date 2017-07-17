// This class was generated on Mon, 17 Jul 2017 10:41:00 PDT by version 0.01 of Braintree SDK Generator
// TemplateCreateRequest.java
// DO NOT EDIT
// @type request
// @json {"Name":"template.create","Description":"Creates a template.","Parameters":[],"RequestType":{"Type":"Template","VariableName":"body","Description":"Invoicing template.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},"ResponseType":{"Type":"Template","VariableName":"","Description":"Invoicing template.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},"ContentType":"application/json","HttpMethod":"POST","Path":"/v1/invoicing/templates","ExpectedStatusCode":200}

package com.paypal.sdk.invoices.request;

import com.braintreepayments.http.*;
import com.paypal.sdk.invoices.object.*;
import java.util.List;


/**
 * Creates a template.
 */
public class TemplateCreateRequest extends HttpRequest<Template> {

    public TemplateCreateRequest() {
        super("/v1/invoicing/templates?", "POST", Template.class);
    }

    public TemplateCreateRequest requestBody(Template body) {
        super.body(body);
        header("Content-Type", "application/json");
        return this;
    }
}
