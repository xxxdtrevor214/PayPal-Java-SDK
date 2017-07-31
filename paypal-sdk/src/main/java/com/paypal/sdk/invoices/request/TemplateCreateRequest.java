// This class was generated on Sun, 30 Jul 2017 11:04:05 PDT by version 0.1 of Braintree SDK Generator
// TemplateCreateRequest.java
// DO NOT EDIT
// @type request
// @json {"Name":"template.create","Description":"Creates a template.","QueryParameters":[],"HeaderParameters":[],"FormParameters":[],"PathParameters":[],"RequestType":{"Type":"Template","VariableName":"body","Description":"Invoicing template.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},"ResponseType":{"Type":"Template","VariableName":"","Description":"Invoicing template.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},"ContentType":"application/json","HttpMethod":"POST","Path":"/v1/invoicing/templates","ExpectedStatusCode":200}

package com.paypal.sdk.invoices.request;

import com.braintreepayments.http.*;
import com.paypal.sdk.invoices.object.*;
import java.util.*;
import java.util.List;


/**
 * Creates a template.
 */
public class TemplateCreateRequest extends HttpRequest<Template> {

    public TemplateCreateRequest() {
        super("/v1/invoicing/templates?", "POST", Template.class);
        header("Content-Type", "application/json");
    }
    

    public TemplateCreateRequest requestBody(Template body) {
        super.requestBody(body);
        return this;
    }
}
