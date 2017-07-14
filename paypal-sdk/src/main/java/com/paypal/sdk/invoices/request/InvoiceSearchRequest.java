// This class was generated on Thu, 13 Jul 2017 09:07:17 PDT by version 0.01 of Braintree SDK Generator
// InvoiceSearchRequest.java
// DO NOT EDIT
// @type request
// @json {"Name":"invoice.search","Description":"Lists invoices that match search criteria. In the JSON request body, include a `search` object that specifies the search criteria.","Parameters":[],"RequestType":{"Type":"Search","VariableName":"body","Description":"Invoice search parameters.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},"ResponseType":{"Type":"Invoices","VariableName":"","Description":"List of merchant invoices. Can include the total invoices count and HATEOAS links for navigation.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},"ContentType":"application/json","HttpMethod":"POST","Path":"/v1/invoicing/search","ExpectedStatusCode":200}

package com.paypal.sdk.invoices.request;

import com.braintreepayments.http.*;
import com.paypal.sdk.invoices.object.*;
import java.util.List;


/**
 * Lists invoices that match search criteria. In the JSON request body, include a `search` object that specifies the search criteria.
 */
public class InvoiceSearchRequest extends HttpRequest<Invoices> {

    public InvoiceSearchRequest() {
        super("/v1/invoicing/search?", "POST", Invoices.class);
    }

    public InvoiceSearchRequest body(Search body) {
        super.body(body);
        header("Content-Type", "application/json");
        return this;
    }
}
