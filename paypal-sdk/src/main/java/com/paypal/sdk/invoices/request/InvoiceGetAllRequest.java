// This class was generated on Mon, 17 Jul 2017 10:41:00 PDT by version 0.01 of Braintree SDK Generator
// InvoiceGetAllRequest.java
// DO NOT EDIT
// @type request
// @json {"Name":"invoice.get_all","Description":"Lists merchant invoices. To filter the invoices that appear in the response, you can specify one or more optional query parameters.","Parameters":[{"Type":"integer","VariableName":"page","Description":"A *zero-relative* index of the list of merchant invoices.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null,"Location":"query"},{"Type":"integer","VariableName":"page_size","Description":"The number of invoices to list beginning with the specified `page`.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null,"Location":"query"},{"Type":"boolean","VariableName":"total_count_required","Description":"Indicates whether the total count appears in the response. Default is `false`.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null,"Location":"query"}],"RequestType":null,"ResponseType":{"Type":"Invoices","VariableName":"","Description":"List of merchant invoices. Can include the total invoices count and HATEOAS links for navigation.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},"ContentType":"application/json","HttpMethod":"GET","Path":"/v1/invoicing/invoices/","ExpectedStatusCode":200}

package com.paypal.sdk.invoices.request;

import com.braintreepayments.http.*;
import com.paypal.sdk.invoices.object.*;
import java.util.List;


/**
 * Lists merchant invoices. To filter the invoices that appear in the response, you can specify one or more optional query parameters.
 */
public class InvoiceGetAllRequest extends HttpRequest<Invoices> {

    public InvoiceGetAllRequest() {
        super("/v1/invoicing/invoices/?", "GET", Invoices.class);
    }

    public InvoiceGetAllRequest page(Integer page) {
		path(path() + "page=" + String.valueOf(page) + "&");
        return this;
    }

    public InvoiceGetAllRequest pageSize(Integer pageSize) {
		path(path() + "page_size=" + String.valueOf(pageSize) + "&");
        return this;
    }

    public InvoiceGetAllRequest totalCountRequired(Boolean totalCountRequired) {
		path(path() + "total_count_required=" + String.valueOf(totalCountRequired) + "&");
        return this;
    }
}
