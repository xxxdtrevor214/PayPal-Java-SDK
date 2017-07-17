// This class was generated on Thu, 13 Jul 2017 09:07:17 PDT by version 0.01 of Braintree SDK Generator
// TemplateUpdateRequestTest.java
// DO NOT EDIT
// @type request
// @json {"Name":"template.update","Description":"Updates a template, by ID. In the JSON request body, specify a complete `template` object. The update method does not support partial updates.","Parameters":[{"Type":"string","VariableName":"template_id","Description":"The ID of the template to update.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null,"Location":"path"}],"RequestType":{"Type":"Template","VariableName":"body","Description":"Invoicing template.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},"ResponseType":{"Type":"Template","VariableName":"","Description":"Invoicing template.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},"ContentType":"application/json","HttpMethod":"PUT","Path":"/v1/invoicing/templates/{template_id}","ExpectedStatusCode":200,"FileSuffix":"Test"}

package com.paypal.sdk.invoices.request;

import com.braintreepayments.http.HttpResponse;
import com.braintreepayments.http.HttpClient;
import com.paypal.sdk.invoices.object.*;
import com.paypal.sdk.TestHarness;
import java.util.List;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

public class TemplateUpdateRequestTest extends TestHarness {

    @Test
    public void testTemplateUpdateRequest() throws IOException {
        TestUtil.CreateResponseAndCleanup createResponseAndCleanup = TestUtil.createTemplate(client());

        TemplateUpdateRequest request = new TemplateUpdateRequest(createResponseAndCleanup.response.result().templateId())
                .requestBody(TestUtil.buildTemplate());

        HttpResponse<Template> response = client().execute(request);
        assertEquals(response.statusCode(), 200);
        assertNotNull(response.result());

        createResponseAndCleanup.cleanup();
    }
}
