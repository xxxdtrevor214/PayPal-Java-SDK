// This class was generated on Thu, 13 Jul 2017 09:07:17 PDT by version 0.01 of Braintree SDK Generator
// TemplateCreateRequestTest.java
// DO NOT EDIT
// @type request
// @json {"Name":"template.create","Description":"Creates a template.","Parameters":[],"RequestType":{"Type":"Template","VariableName":"body","Description":"Invoicing template.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},"ResponseType":{"Type":"Template","VariableName":"","Description":"Invoicing template.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},"ContentType":"application/json","HttpMethod":"POST","Path":"/v1/invoicing/templates","ExpectedStatusCode":200,"FileSuffix":"Test"}

package com.paypal.sdk.invoices.request;

import com.paypal.sdk.TestHarness;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

public class TemplateCreateRequestTest extends TestHarness {

    @Test
    public void testTemplateCreateRequest() throws IOException {
        TestUtil.CreateResponseAndCleanup createResponseAndCleanup = TestUtil.createTemplate(client());

        assertEquals(createResponseAndCleanup.response.statusCode(), 201);
        assertNotNull(createResponseAndCleanup.response.result());

        createResponseAndCleanup.cleanup();
    }
}
