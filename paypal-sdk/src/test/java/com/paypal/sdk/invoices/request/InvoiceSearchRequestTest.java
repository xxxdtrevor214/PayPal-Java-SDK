// This class was generated on Thu, 13 Jul 2017 09:07:17 PDT by version 0.01 of Braintree SDK Generator
// InvoiceSearchRequestTest.java
// DO NOT EDIT
// @type request
// @json {"Name":"invoice.search","Description":"Lists invoices that match search criteria. In the JSON request body, include a `search` object that specifies the search criteria.","Parameters":[],"RequestType":{"Type":"Search","VariableName":"body","Description":"Invoice search parameters.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},"ResponseType":{"Type":"Invoices","VariableName":"","Description":"List of merchant invoices. Can include the total invoices count and HATEOAS links for navigation.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},"ContentType":"application/json","HttpMethod":"POST","Path":"/v1/invoicing/search","ExpectedStatusCode":200,"FileSuffix":"Test"}

package com.paypal.sdk.invoices.request;

import com.braintreepayments.http.HttpResponse;
import com.braintreepayments.http.HttpClient;
import com.paypal.sdk.invoices.object.*;
import com.paypal.sdk.TestHarness;
import java.util.List;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;

public class InvoiceSearchRequestTest extends TestHarness {

    @Test
    public void testInvoiceSearchRequest() throws IOException {
        HttpResponse<Invoice> createResponse = TestUtil.createInvoice(client());

        InvoiceSearchRequest request = new InvoiceSearchRequest()
                .body(new Search().number(createResponse.result().number()));

        HttpResponse<Invoices> response = client().execute(request);
        assertEquals(response.statusCode(), 200);
        assertEquals(response.result().invoices().size(), 1);
        assertEquals(createResponse.result().id(), response.result().invoices().get(0).id());
    }
}
