// This class was generated on Mon, 17 Jul 2017 10:41:00 PDT by version 0.01 of Braintree SDK Generator
// TemplateUpdateRequest.java
// DO NOT EDIT
// @type request
// @json {"Name":"template.update","Description":"Updates a template, by ID. In the JSON request body, specify a complete `template` object. The update method does not support partial updates.","Parameters":[{"Type":"string","VariableName":"template_id","Description":"The ID of the template to update.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null,"Location":"path"}],"RequestType":{"Type":"Template","VariableName":"body","Description":"Invoicing template.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},"ResponseType":{"Type":"Template","VariableName":"","Description":"Invoicing template.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},"ContentType":"application/json","HttpMethod":"PUT","Path":"/v1/invoicing/templates/{template_id}","ExpectedStatusCode":200}

package com.paypal.sdk.invoices.request;

import com.braintreepayments.http.*;
import com.paypal.sdk.invoices.object.*;
import java.util.List;


/**
 * Updates a template, by ID. In the JSON request body, specify a complete `template` object. The update method does not support partial updates.
 */
public class TemplateUpdateRequest extends HttpRequest<Template> {

    public TemplateUpdateRequest(String templateId) {
        super("/v1/invoicing/templates/{template_id}?"
            .replace("{template_id}", String.valueOf(templateId)), "PUT", Template.class);
    }

    public TemplateUpdateRequest requestBody(Template body) {
        super.body(body);
        header("Content-Type", "application/json");
        return this;
    }
}
