// This class was generated on Sun, 30 Jul 2017 11:04:05 PDT by version 0.1 of Braintree SDK Generator
// TemplateUpdateRequest.java
// DO NOT EDIT
// @type request
// @json {"Name":"template.update","Description":"Updates a template, by ID. In the JSON request body, specify a complete `template` object. The update method does not support partial updates.","QueryParameters":[],"HeaderParameters":[],"FormParameters":[],"PathParameters":[{"Type":"string","VariableName":"template_id","Description":"The ID of the template to update.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null}],"RequestType":{"Type":"Template","VariableName":"body","Description":"Invoicing template.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},"ResponseType":{"Type":"Template","VariableName":"","Description":"Invoicing template.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},"ContentType":"application/json","HttpMethod":"PUT","Path":"/v1/invoicing/templates/{template_id}","ExpectedStatusCode":200}

package com.paypal.sdk.invoices.request;

import com.braintreepayments.http.*;
import com.paypal.sdk.invoices.object.*;
import java.util.*;
import java.util.List;


/**
 * Updates a template, by ID. In the JSON request body, specify a complete `template` object. The update method does not support partial updates.
 */
public class TemplateUpdateRequest extends HttpRequest<Template> {

    public TemplateUpdateRequest(String templateId) {
        super("/v1/invoicing/templates/{template_id}?"
            .replace("{template_id}", String.valueOf(templateId)), "PUT", Template.class);
        header("Content-Type", "application/json");
    }
    

    public TemplateUpdateRequest requestBody(Template body) {
        super.requestBody(body);
        return this;
    }
}
