// This class was generated on Thu, 13 Jul 2017 09:07:17 PDT by version 0.01 of Braintree SDK Generator
// TemplateDeleteRequest.java
// DO NOT EDIT
// @type request
// @json {"Name":"template.delete","Description":"Deletes a template, by ID.","Parameters":[{"Type":"string","VariableName":"template_id","Description":"The ID of the template to delete.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null,"Location":"path"}],"RequestType":null,"ResponseType":null,"ContentType":"application/json","HttpMethod":"DELETE","Path":"/v1/invoicing/templates/{template_id}","ExpectedStatusCode":200}

package com.paypal.sdk.invoices.request;

import com.braintreepayments.http.*;
import com.paypal.sdk.invoices.object.*;
import java.util.List;


/**
 * Deletes a template, by ID.
 */
public class TemplateDeleteRequest extends HttpRequest<Void> {

    public TemplateDeleteRequest(String templateId) {
        super("/v1/invoicing/templates/{template_id}?"
            .replace("{template_id}", String.valueOf(templateId)), "DELETE", Void.class);
    }
}
