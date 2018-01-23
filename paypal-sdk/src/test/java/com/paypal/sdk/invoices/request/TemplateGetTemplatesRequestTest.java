// This class was generated on Thu, 13 Jul 2017 09:07:17 PDT by version 0.01 of Braintree SDK Generator
// TemplateGetTemplatesRequestTest.java
// DO NOT EDIT
// @type request
// @json {"Name":"template.get_templates","Description":"Lists all merchant-created templates. The list shows the emails, addresses, and phone numbers from the merchant profile.","Parameters":[{"Type":"string","VariableName":"fields","Description":"The fields to return in the response. Value is `all` or `none`. Specify `none` to return only the template name, ID, and default attributes.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null,"Location":"query"}],"RequestType":null,"ResponseType":{"Type":"Templates","VariableName":"","Description":"List of merchant templates.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},"ContentType":"application/json","HttpMethod":"GET","Path":"/v1/invoicing/templates/","ExpectedStatusCode":200,"FileSuffix":"Test"}

package com.paypal.sdk.invoices.request;

import com.braintreepayments.http.HttpResponse;
import com.paypal.sdk.TestHarness;
import com.paypal.sdk.invoices.TemplateList;
import com.paypal.sdk.invoices.TemplateListRequest;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class TemplateGetTemplatesRequestTest extends TestHarness {

    @Test
    public void testTemplateGetTemplatesRequest() throws IOException {
        TestUtil.CreateResponseAndCleanup createResponseAndCleanup = TestUtil.createTemplate(client());

        TemplateListRequest request = new TemplateListRequest()
                .fields("none");

        HttpResponse<TemplateList> response = client().execute(request);
        assertEquals(response.statusCode(), 200);
        assertTrue(response.result().templates().size() >= 1);
    }
}
