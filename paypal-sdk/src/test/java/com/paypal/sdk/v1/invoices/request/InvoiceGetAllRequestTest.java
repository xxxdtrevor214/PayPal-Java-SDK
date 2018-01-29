// This class was generated on Thu, 13 Jul 2017 09:07:17 PDT by version 0.01 of Braintree SDK Generator
// InvoiceGetAllRequestTest.java
// DO NOT EDIT
// @type request
// @json {"Name":"invoice.get_all","Description":"Lists merchant invoices. To filter the invoices that appear in the response, you can specify one or more optional query parameters.","Parameters":[{"Type":"integer","VariableName":"page","Description":"A *zero-relative* index of the list of merchant invoices.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null,"Location":"query"},{"Type":"integer","VariableName":"page_size","Description":"The number of invoices to list beginning with the specified `page`.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null,"Location":"query"},{"Type":"boolean","VariableName":"total_count_required","Description":"Indicates whether the total count appears in the response. Default is `false`.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null,"Location":"query"}],"RequestType":null,"ResponseType":{"Type":"Invoices","VariableName":"","Description":"List of merchant invoices. Can include the total invoices count and HATEOAS links for navigation.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},"ContentType":"application/json","HttpMethod":"GET","Path":"/v1/invoicing/invoices/","ExpectedStatusCode":200,"FileSuffix":"Test"}

package com.paypal.sdk.v1.invoices.request;

import com.braintreepayments.http.HttpResponse;
import com.paypal.sdk.TestHarness;
import com.paypal.sdk.v1.invoices.InvoiceList;
import com.paypal.sdk.v1.invoices.InvoiceListRequest;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.*;

public class InvoiceGetAllRequestTest extends TestHarness {

    @Test
    public void testInvoiceGetAllRequest() throws IOException {
        TestUtil.createInvoice(client());

        InvoiceListRequest request = new InvoiceListRequest()
                .page(0)
                .pageSize(1)
                .totalCountRequired(true);

        HttpResponse<InvoiceList> response = client().execute(request);
        assertEquals(response.statusCode(), 200);
        assertNotNull(response.result());

        assertTrue(response.result().totalCount() > 0);
        assertEquals(response.result().invoices().size(), 1);
    }
}
