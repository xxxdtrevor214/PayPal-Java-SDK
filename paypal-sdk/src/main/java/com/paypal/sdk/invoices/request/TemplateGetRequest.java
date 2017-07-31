// This class was generated on Sun, 30 Jul 2017 11:04:05 PDT by version 0.1 of Braintree SDK Generator
// TemplateGetRequest.java
// DO NOT EDIT
// @type request
// @json {"Name":"template.get","Description":"Shows details for a template, by ID.","QueryParameters":[],"HeaderParameters":[],"FormParameters":[],"PathParameters":[{"Type":"string","VariableName":"template_id","Description":"The ID of the template for which to show details.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null}],"RequestType":null,"ResponseType":{"Type":"Template","VariableName":"","Description":"Invoicing template.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},"ContentType":"application/json","HttpMethod":"GET","Path":"/v1/invoicing/templates/{template_id}","ExpectedStatusCode":200}

package com.paypal.sdk.invoices.request;

import com.braintreepayments.http.*;
import com.paypal.sdk.invoices.object.*;
import java.util.*;
import java.util.List;


/**
 * Shows details for a template, by ID.
 */
public class TemplateGetRequest extends HttpRequest<Template> {

    public TemplateGetRequest(String templateId) {
        super("/v1/invoicing/templates/{template_id}?"
            .replace("{template_id}", String.valueOf(templateId)), "GET", Template.class);
        header("Content-Type", "application/json");
    }
    
}
