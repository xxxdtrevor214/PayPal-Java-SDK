// This class was generated on Thu, 13 Jul 2017 09:07:17 PDT by version 0.01 of Braintree SDK Generator
// TemplateGetRequestTest.java
// DO NOT EDIT
// @type request
// @json {"Name":"template.get","Description":"Shows details for a template, by ID.","Parameters":[{"Type":"string","VariableName":"template_id","Description":"The ID of the template for which to show details.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null,"Location":"path"}],"RequestType":null,"ResponseType":{"Type":"Template","VariableName":"","Description":"Invoicing template.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},"ContentType":"application/json","HttpMethod":"GET","Path":"/v1/invoicing/templates/{template_id}","ExpectedStatusCode":200,"FileSuffix":"Test"}

package com.paypal.sdk.v1.invoices.request;

import com.braintreepayments.http.HttpResponse;
import com.paypal.sdk.TestHarness;
import com.paypal.sdk.v1.invoices.Template;
import com.paypal.sdk.v1.invoices.TemplateGetRequest;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

public class TemplateGetRequestTest extends TestHarness {

    @Test
    public void testTemplateGetRequest() throws IOException {
        TestUtil.CreateResponseAndCleanup createResponseAndCleanup = TestUtil.createTemplate(client());

        TemplateGetRequest request = new TemplateGetRequest(createResponseAndCleanup.response.result().templateId());

        HttpResponse<Template> response = client().execute(request);
        assertEquals(response.statusCode(), 200);
        assertNotNull(response.result());

        createResponseAndCleanup.cleanup();
    }
}
