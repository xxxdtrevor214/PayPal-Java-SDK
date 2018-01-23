// This class was generated on Thu, 13 Jul 2017 09:07:17 PDT by version 0.01 of Braintree SDK Generator
// TemplateDeleteRequestTest.java
// DO NOT EDIT
// @type request
// @json {"Name":"template.delete","Description":"Deletes a template, by ID.","Parameters":[{"Type":"string","VariableName":"template_id","Description":"The ID of the template to delete.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null,"Location":"path"}],"RequestType":null,"ResponseType":null,"ContentType":"application/json","HttpMethod":"DELETE","Path":"/v1/invoicing/templates/{template_id}","ExpectedStatusCode":200,"FileSuffix":"Test"}

package com.paypal.sdk.invoices.request;

import com.braintreepayments.http.HttpResponse;
import com.paypal.sdk.TestHarness;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;

public class TemplateDeleteRequestTest extends TestHarness {

    @Test
    public void testTemplateDeleteRequest() throws IOException {
        TestUtil.CreateResponseAndCleanup createResponseAndCleanup = TestUtil.createTemplate(client());

        HttpResponse<Void> response = TestUtil.deleteTemplate(client(), createResponseAndCleanup.response.result().templateId());
        assertEquals(response.statusCode(), 204);
    }
}
