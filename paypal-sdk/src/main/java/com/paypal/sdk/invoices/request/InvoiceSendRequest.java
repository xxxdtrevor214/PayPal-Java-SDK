// This class was generated on Mon, 17 Jul 2017 10:41:00 PDT by version 0.01 of Braintree SDK Generator
// InvoiceSendRequest.java
// DO NOT EDIT
// @type request
// @json {"Name":"invoice.send","Description":"Sends an invoice, by ID, to a customer.\u003cblockquote\u003e\u003cstrong\u003eNote:\u003c/strong\u003e After you send an invoice, you cannot resend it.\u003c/blockquote\u003e\u003cbr/\u003eOptionally, set the `notify_merchant` query parameter to also send the merchant an invoice update notification. Default is `true`.","Parameters":[{"Type":"string","VariableName":"invoice_id","Description":"The ID of the invoice to send.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null,"Location":"path"},{"Type":"boolean","VariableName":"notify_merchant","Description":"Indicates whether to send the invoice update notification to the merchant. Default is `true`.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null,"Location":"query"}],"RequestType":null,"ResponseType":null,"ContentType":"application/json","HttpMethod":"POST","Path":"/v1/invoicing/invoices/{invoice_id}/send","ExpectedStatusCode":200}

package com.paypal.sdk.invoices.request;

import com.braintreepayments.http.*;
import com.paypal.sdk.invoices.object.*;
import java.util.List;


/**
 * Sends an invoice, by ID, to a customer.<blockquote><strong>Note:</strong> After you send an invoice, you cannot resend it.</blockquote><br/>Optionally, set the `notify_merchant` query parameter to also send the merchant an invoice update notification. Default is `true`.
 */
public class InvoiceSendRequest extends HttpRequest<Void> {

    public InvoiceSendRequest(String invoiceId) {
        super("/v1/invoicing/invoices/{invoice_id}/send?"
            .replace("{invoice_id}", String.valueOf(invoiceId)), "POST", Void.class);
    }

    public InvoiceSendRequest notifyMerchant(Boolean notifyMerchant) {
		path(path() + "notify_merchant=" + String.valueOf(notifyMerchant) + "&");
        return this;
    }
}
